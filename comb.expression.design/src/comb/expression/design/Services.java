package comb.expression.design;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

import comb.expression.metamodel.comb.*;
import comb.expression.metamodel.comb.impl.ElementImpl;

public class Services {
    private LogicGroup logicGroup;
    
    public String getSubtreeInterpretation(Element abstract_element) {
    	logicGroup = LogicGroup.LITERAL;
    	ElementImpl abstract_ElementImpl = ((ElementImpl)abstract_element);
    	
		String subtreeInterpretation = subtreeInterpretation(abstract_ElementImpl, getElementInterpretation(abstract_ElementImpl));
		setSubtreeInterpretation(abstract_element, subtreeInterpretation);
		setLogicGroup(abstract_element, logicGroup);
		return subtreeInterpretation;
	}
    
    private String subtreeInterpretation(ElementImpl abstract_elementImpl, String interpretation) {
    	refreshLogicGroup(abstract_elementImpl);

    	ElementImpl abstract_elementImpl_sub_element;
    	
    	//Amennyiben a jelenleg vizsgált operátornak van adott típusú operandusa,
    	if((abstract_elementImpl_sub_element = ((ElementImpl)abstract_elementImpl.getP())) != null)
			//A vizsgált elem interpretációjában a vizsgált operandus 
			//lecserélésre kerül a vizsgált operandus valódi értékére,
			//majd az algoritmus folytatódik az operandus kifejtésével
			interpretation = interpretation.replace("<P>", subtreeInterpretation(abstract_elementImpl_sub_element, getElementInterpretation(abstract_elementImpl_sub_element)));
	    if((abstract_elementImpl_sub_element = ((ElementImpl)abstract_elementImpl.getQ())) != null)
			interpretation = interpretation.replace("<Q>", subtreeInterpretation(abstract_elementImpl_sub_element, getElementInterpretation(abstract_elementImpl_sub_element)));
	    if((abstract_elementImpl_sub_element = ((ElementImpl)abstract_elementImpl.getR())) != null)
			interpretation = interpretation.replace("<R>", subtreeInterpretation(abstract_elementImpl_sub_element, getElementInterpretation(abstract_elementImpl_sub_element)));
	    if((abstract_elementImpl_sub_element = ((ElementImpl)abstract_elementImpl.getS())) != null)
			interpretation = interpretation.replace("<S>", subtreeInterpretation(abstract_elementImpl_sub_element, getElementInterpretation(abstract_elementImpl_sub_element)));
	    if((abstract_elementImpl_sub_element = ((ElementImpl)abstract_elementImpl.getL())) != null)
			interpretation = interpretation.replace("<low>", subtreeInterpretation(abstract_elementImpl_sub_element, getElementInterpretation(abstract_elementImpl_sub_element)));
	    if((abstract_elementImpl_sub_element = ((ElementImpl)abstract_elementImpl.getH())) != null)
			interpretation = interpretation.replace("<high>", subtreeInterpretation(abstract_elementImpl_sub_element, getElementInterpretation(abstract_elementImpl_sub_element)));
		
		return interpretation;
    }
    
    private String getElementInterpretation(ElementImpl abstract_element) {
    	switch(abstract_element.getClass().getName()) {
			case "comb.expression.metamodel.comb.impl.LiteralImpl":
				return abstract_element.getName();
			default:
				return "("+abstract_element.getInterpretation()+")";
    	}
    }
  
    private void refreshLogicGroup(Element element) {
    	if(element instanceof STLOperators && LogicGroup.STL.getValue() > logicGroup.getValue())
    		logicGroup = LogicGroup.STL;
    	else if(element instanceof MITLOperators && LogicGroup.MITL.getValue() > logicGroup.getValue())
    		logicGroup = LogicGroup.MITL;
    	else if(element instanceof MTLOperators && LogicGroup.MTL.getValue() > logicGroup.getValue())
    		logicGroup = LogicGroup.MTL;
    	else if(element instanceof LTLOperators && LogicGroup.LTL.getValue() > logicGroup.getValue())
    		logicGroup = LogicGroup.LTL;
    	else if(element instanceof Literal && LogicGroup.LITERAL.getValue() > logicGroup.getValue())
    		logicGroup = LogicGroup.LITERAL;
    }
    
    //source: https://stackoverflow.com/questions/38114267/emf-write-transaction
    //date of access: 2020.11.16.    
    private void setSubtreeInterpretation(Element element, String value) {
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
        domain.getCommandStack().execute(new RecordingCommand(domain) {

            @Override
            protected void doExecute() {
                element.setSubtreeInterpretation(value);
            }
        });
    }
    
    private void setLogicGroup(Element element, LogicGroup logicGroup) {
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
        domain.getCommandStack().execute(new RecordingCommand(domain) {

            @Override
            protected void doExecute() {
                element.setLogicGroup(logicGroup);
            }
        });
    }
}
