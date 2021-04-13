/*
 * Copyright (c) 2017 Tejas Nikumbh
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met: 
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer. 
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution. 
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package ROBDD.src;

/* =========================================================================== *
 * File : ROBDD.java                                                           *                     
 * =========================================================================== *
 * Class ROBDD to build an ROBDD DataStructure from a Boolean expression given *
 * as a string. Note that in the Boolean Expression, NOT is expressed as NOT(*)*
 * and not as !. Apart from that, all other expressions are expressed normally.*
 * Prime Methods : build(booleanExp,rootVar)                                   *     
 *               : print()                                                     *
 * Limitations   : Hashing strategy inefficient (memorywise) for H             *              
 * =========================================================================== */


import java.util.ArrayList;
import java.util.List;

public class ROBDD{

    private List<String> incomplete_allSat;
    private List<String> abc;

    private int[][] T;
    private int[] H;
    private int nodeCount;   
    private int capacity;
    private int vars;
    
    // Constructor. Equivalent to the init(T),init(H) method in Notes 
    // Here n is the number of variables.
    public ROBDD(List<String> abc){
        this.abc = abc;
        int n = abc.size() == 1 ? abc.size()+1 : abc.size(); //abc size + 1, so the robdd library can handle expressions with only 1 variable

        // Initializing T to contain 0 and 1
        nodeCount = 0;
        capacity = n;
        vars = n;
        T = new int[capacity][3];
        
        // Adding 0 and 1 node. -1 indicates NULL.
        T[0][0] = n+1;
        T[0][1] = -1;
        T[0][2] = -1;
        T[1][0] = n+1;
        T[1][1] = -1;
        T[1][2] = -1;
        nodeCount += 2;
        
        // Initializing H 
        H = new int[capacity];
        for(int i=0;i<capacity;i++)
            H[i] = -1; 
    }

    private void allSat(String[] prefix, int u) {
        String[] low_sat = new String[abc.size()];
        String[] high_sat = new String[abc.size()];
        for (int i = 0; i < abc.size(); i++) {
            if (prefix[i] != null) {
                low_sat[i] = prefix[i];
                high_sat[i] = prefix[i];
            } else {
                low_sat[i] = "X";
                high_sat[i] = "X";
            }
        }

        if (T[u][1] != 0) {
            low_sat[T[u][0] - 1] = "0";
            if (T[u][1] == 1) {
                incomplete_allSat.add(String.join("", low_sat));
            } else {
                allSat(low_sat, T[u][1]);
            }
        }

        if (T[u][2] != 0) {
            high_sat[T[u][0] - 1] = "1";
            if (T[u][2] == 1) {
                incomplete_allSat.add(String.join("", high_sat));
            } else {
                allSat(high_sat, T[u][2]);
            }
        }
    }

    public List<String> getCompleteTruthAssignments() {
        incomplete_allSat = new ArrayList<>();
        allSat(new String[abc.size()], nodeCount-1);

        List<String> complete_allSat = new ArrayList<>();
        StringBuilder sb;
        while (incomplete_allSat.size() > 0) {
            String temp_sat = incomplete_allSat.get(0);
            if(!temp_sat.contains("X")) {
                incomplete_allSat.remove(temp_sat);
                complete_allSat.add(temp_sat);
            }
            else {
                int index = temp_sat.indexOf("X");
                String original_temp_sat = temp_sat;
                sb = new StringBuilder(temp_sat);

                sb.setCharAt(index, '0');
                temp_sat = sb.toString();
                if (!temp_sat.contains("X")) {
                    complete_allSat.add(temp_sat);
                }
                else {
                    incomplete_allSat.add(temp_sat);
                }

                sb.setCharAt(index, '1');
                temp_sat = sb.toString();
                if (!temp_sat.contains("X")) {
                    complete_allSat.add(temp_sat);
                }
                else {
                    incomplete_allSat.add(temp_sat);
                }

                incomplete_allSat.remove(original_temp_sat);
            }
        }

        return complete_allSat;
    }

    // Public Interface
    // mk(i,l,h) : Returns the node which is being made.
    public int mk(int i,int l,int h){
        // Return in case the node is redundant
        if(l == h){
            return l;            
        }else if(member(i,l,h)){
            return lookup(i,l,h);
        }else{ 
            int node = add(i,l,h);
            insert(i,l,h,node);
            return node;
        }

    }

    // build(booleanExp,RootVar) : Recursively builds the ROBDD
    public int build(String exp, int i){
        if(i > vars){
            if(eval(exp)) return 1;
            else return 0;
        }else{
            int l = build(newExp(exp,i,0),i + 1);
            int h = build(newExp(exp,i,1),i + 1);
            return mk(i,l,h);
        }
    }
    
    // Private Implementation 
    /* Supporting Operations on T*/ 
    
    // add(i,l,h) : Adds and returns a new node with var(u) = i, var(l) = l ...
    // Takes O(1) time
    private int add(int i,int l,int h){
        int curNodeIndex = nodeCount++;
        if(curNodeIndex == capacity) expandArray();
        T[curNodeIndex][0] = i;
        T[curNodeIndex][1] = l;
        T[curNodeIndex][2] = h;
        return curNodeIndex;
    }
    
    /* Supporint Opeartions on H */
    // member(i,l,h) : Returns whether node with attributes is already in ROBDD.
    // Takes O(1) time
    private boolean member(int i, int l, int h){
        int hashCode = generateHash(i,l,h);
        // Not present in extended capacity
        if(hashCode>(H.length-1)) return false;
        // Not present in current capacity
        return H[hashCode] != -1 ;
    }
 
    // lookup(i,l,h) : Returns the node with attributes in ROBDD 
    // Takes O(1) time
    private int lookup(int i,int l,int h){
        int hashCode = generateHash(i,l,h);
        return H[hashCode];    
    }     
 
    // insert(i,l,h) : Inserts node with attributes i,l,h,node into Hash Table
    private void insert(int i,int l,int h,int node){
        int hashCode = generateHash(i,l,h);
        //if(hashCode>(H.length+1)) renewHashTable(hashCode); //This is the original line, but it couldnt handle cases where only 1 variable exists, and sometimes produced exceptions
        if(hashCode>(H.length-1)) renewHashTable(hashCode); //This should be the right one... This way this ensures that hashCode wont be greater, than the last index of H (if it is, hashCode is regenerated)
        if(H[hashCode] != -1) renewHashTable(hashCode);
        H[hashCode] = node;
    }
    
    private void expandArray(){
        capacity *= 2;
        int[][] temp = new int[capacity][3];
        for(int i=0;i<T.length;i++){
            temp[i][0] = T[i][0];
            temp[i][1] = T[i][1];
            temp[i][2] = T[i][2];
        }
        T = temp;
    }
   
    // Private method to generate a HashCode
    private int generateHash(int i,int l,int h){
        return pair(i,pair(l,h));
    }   
   
    // pair(i,j) useful function for generation of hash code
    private int pair(int i,int j){
        return (((i+j)*(i+j+1))/2 + i);
    } 
    
    // renewing hash table in case of fulfilled capacity
    private void renewHashTable(int hashCode){
        int newSize = hashCode + 1;
        int[] newH= new int[newSize];
        for(int j=0;j<newSize;j++){
            newH[j] = -1;
        }
        for(int j=2;j<nodeCount;j++){
            int i = T[j][0];
            int l = T[j][1];
            int h = T[j][2];
            int hashCodeCur = generateHash(i,l,h);
            newH[hashCodeCur] = j; 
        }
        H = newH;
    }
 
    // Evaluates boolean expressions passed in as strings
    private boolean eval(String exp){
        Expression e = new Expression(exp);
        String result = String.valueOf(e.eval());
        int resultInt = Integer.parseInt(result);
        return resultInt == 1;
    }
    
    // Implements Shannon expansion by replacing var with val
    private String newExp(String exp,int var,int val){
        String varStr = "x" + var;
        String valStr = String.valueOf(val);
        return exp.replaceAll(varStr,valStr);
    }   
}
