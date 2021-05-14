package comb.expression.design;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

import comb.expression.metamodel.comb.Element;
import comb.expression.metamodel.comb.LTLOperators;
import comb.expression.metamodel.comb.LTLPatternMappings;
import comb.expression.metamodel.comb.Literal;
import comb.expression.metamodel.comb.LogicGroup;
import comb.expression.metamodel.comb.MITLOperators;
import comb.expression.metamodel.comb.MTLOperators;
import comb.expression.metamodel.comb.STLOperators;
import comb.expression.metamodel.comb.SupportedOutput;
import comb.expression.metamodel.comb.impl.LiteralImpl;

public class RefreshLogicGroupAndInterpretations {
	public static String NOT_SUPPORTED_OPERATOR_MESSAGE = "<Not all operands are supported for this output type>";
	private static String NOT_SUPPORTED_OPERATOR = "-";
	
	public static void refresh(final Element element) {
    	final LogicGroup logicGroup = getSubtreeLogicGroup(element, getElementLogicGroupIfHigher(element, LogicGroup.LITERAL));
		setLogicGroup(element, logicGroup);

		final List<String> subtreeInterpretations = generateSubtreeInterpretations(element, generateElementInterpretations(element));
		setInterpretations(element, subtreeInterpretations);
	}
    
    private static List<String> generateSubtreeInterpretations(final Element element, List<String> interpretations) {  	
	    interpretations = generateSubtreeInterpretation(element.getP(), "<P>", interpretations);
	    interpretations = generateSubtreeInterpretation(element.getQ(), "<Q>", interpretations);
	    interpretations = generateSubtreeInterpretation(element.getR(), "<R>", interpretations);
	    interpretations = generateSubtreeInterpretation(element.getS(), "<S>", interpretations);
	    interpretations = generateSubtreeInterpretation(element.getL(), "<low>", interpretations);
	    interpretations = generateSubtreeInterpretation(element.getH(), "<high>", interpretations);
	    
	    //TODO: could be format dependent
	    for(int i = 0; i < interpretations.size(); i++) {
	    	if(interpretations.get(i).contains(NOT_SUPPORTED_OPERATOR_MESSAGE))
	    		interpretations.set(i, NOT_SUPPORTED_OPERATOR_MESSAGE);
	    	else {
		    	interpretations.set(i, interpretations.get(i).replace("<low>", "0"));
		    	interpretations.set(i, interpretations.get(i).replace("<high>", "-1"));
	    	}
	    }
		
		return interpretations;
    }
    
    private static List<String> generateSubtreeInterpretation(Element element, String operand, List<String> interpretations) {
	    if(element != null) {
	    	List<String> tempElementInterpretations = generateElementInterpretations(element);
    		generateSubtreeInterpretations(element, tempElementInterpretations);
    		for(SupportedOutput so : SupportedOutput.values()) {
    			int index = so.getValue();
    			String newInterpretation = interpretations.get(index).replace(operand, tempElementInterpretations.get(index));
    			interpretations.set(index, newInterpretation);
    		}
    	}
	    
	    return interpretations;
    }
    
    //TODO: can be improved if the metamodel contained the ID of the operator, and only one .csv should be accessed for a given interpretation
    private static List<String> generateElementInterpretations(final Element element) {   	
    	List<String> elementInterpretations = new ArrayList<>();
    	
    	if(element instanceof LiteralImpl) {
    		for(int i = 0; i < SupportedOutput.values().length; i++) {
    			elementInterpretations.add(element.getName().toLowerCase());
    		}
    	}
    	else {  		
			LogicGroup oldLogicGroup = getElementLogicGroupIfHigher(element, LogicGroup.LTL);
    		List<String[]> oldOperators = loadOperators("Comb");
    		int oldOperatorColumnIndex = getIndexOfColumn(oldOperators, oldLogicGroup.getName());
    		
    		LogicGroup newLogicGroup = element.getLogicGroup();
			List<String[]> newOperators;
			for(SupportedOutput so : SupportedOutput.values()) {
	    		String interpretation = element.getInterpretation();
				newOperators = loadOperators(so.getName());
				int newOperatorColumnIndex = getIndexOfColumn(newOperators, newLogicGroup.getName());
				
				for(int j = 0; j < oldOperators.size(); j++) {
					String oldOperator = oldOperators.get(j)[oldOperatorColumnIndex];
					if(interpretation.contains(oldOperator) && !oldOperator.equals(NOT_SUPPORTED_OPERATOR)) {
						String oldOperatorID = oldOperators.get(j)[0];
						int newOperatorRowIndex;
						for(newOperatorRowIndex = 0; newOperatorRowIndex < newOperators.size(); newOperatorRowIndex++) {
							if(newOperators.get(newOperatorRowIndex)[0].equals(oldOperatorID))
								break;
						}
						
						String newOperator = newOperators.get(newOperatorRowIndex)[newOperatorColumnIndex];
						interpretation = (!newOperator.equals(NOT_SUPPORTED_OPERATOR)) ? interpretation.replace(oldOperator, newOperator) : NOT_SUPPORTED_OPERATOR_MESSAGE; 
						
						if(!(element instanceof LTLPatternMappings) || interpretation.equals(NOT_SUPPORTED_OPERATOR_MESSAGE))
							break;
					}
				}
				elementInterpretations.add(interpretation);
			}
    	}
    	
    	return elementInterpretations;
    }
    
    private static LogicGroup getSubtreeLogicGroup(final Element element, LogicGroup logicGroup) {
    	Element subElement;
    	
    	if((subElement = element.getP()) != null)
    		logicGroup = getSubtreeLogicGroup(subElement, getElementLogicGroupIfHigher(subElement, logicGroup));
	    if((subElement = element.getQ()) != null)
	    	logicGroup = getSubtreeLogicGroup(subElement, getElementLogicGroupIfHigher(subElement, logicGroup));
	    if((subElement = element.getR()) != null)
	    	logicGroup = getSubtreeLogicGroup(subElement, getElementLogicGroupIfHigher(subElement, logicGroup));
	    if((subElement = element.getS()) != null)
	    	logicGroup = getSubtreeLogicGroup(subElement, getElementLogicGroupIfHigher(subElement, logicGroup));
	    if((subElement = element.getL()) != null)
	    	logicGroup = getSubtreeLogicGroup(subElement, getElementLogicGroupIfHigher(subElement, logicGroup));
	    if((subElement = element.getH()) != null)
	    	logicGroup = getSubtreeLogicGroup(subElement, getElementLogicGroupIfHigher(subElement, logicGroup));
	    
	    return logicGroup;
    }
    
    private static LogicGroup getElementLogicGroupIfHigher(final Element element, LogicGroup logicGroup) {
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
    	
    	return logicGroup;
    }
    
    
    //source: https://stackoverflow.com/questions/38114267/emf-write-transaction
    //date of access: 2020.11.16.    
    private static void setInterpretations(Element element, List<String> values) {
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
        domain.getCommandStack().execute(new RecordingCommand(domain) {

            @Override
            protected void doExecute() {
            	BasicEList<String> repr = new BasicEList<>();
            	for(SupportedOutput so : SupportedOutput.values()) {
            		repr.add(so.toString() + ": " + values.get(so.getValue()));
            	}
                element.setSubtreeInterpretations(repr);
            }
        });
    }
    
    //source: https://stackoverflow.com/questions/38114267/emf-write-transaction
    //date of access: 2020.11.16.  
    private static void setLogicGroup(Element element, LogicGroup logicGroup) {
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
        domain.getCommandStack().execute(new RecordingCommand(domain) {

            @Override
            protected void doExecute() {
                element.setLogicGroup(logicGroup);
            }
        });
    }
    
    private static List<String[]> loadOperators(String schemaName) {
	    List<String[]> operators = new ArrayList<>();
		try {
			operators = Files.lines(Path.of("comb.expression.design/schemas/"+schemaName+".csv"))
			                .map(line -> line.split(";"))
			                .collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
    
		return operators;
    }
    
    private static int getIndexOfColumn(List<String[]> schema, String columnName) {
		int columnIndex;
		for(columnIndex = 0; columnIndex < schema.get(0).length; columnIndex++) {
			if(schema.get(0)[columnIndex].equals(columnName))
				break;
		}
		
		return columnIndex;
    }
}
