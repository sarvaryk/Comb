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
    
   /* private String subtreeInterpretation(Element abstract_element, String interpretation) {
    	refreshLogicGroup(abstract_element);
		switch(abstract_element.getClass().getName()) {
			case "comb.expression.metamodel.comb.impl.LiteralImpl":
				Literal literal_element = ((Literal)abstract_element);
				return literal_element.getName();
			//Ha a kiválasztott operátor típusa megegyezik az alábbi operátortípussal
			case "comb.expression.metamodel.comb.impl._and_Impl":
				//Átalakítjuk a kapott általános absztrakt elemet a konkrét típusra
				_and_ _and_element = ((_and_)abstract_element);
				//Létrehozunk egy olyan változót,
				//amely ideiglenesen tárolja az elem egyes operandusait
		    	Element _and_sub_element;
		    	
				//A következõ blokk az operátor minden operandusára elvégzendõ
				//Az elõbb létrehozott változó értékének megadjuk 
		    	//a jelenleg vizsgált operandust
		    	_and_sub_element = _and_element.getP();
				//A vizsgált elem interpretációjában a vizsgált operandus 
				//lecserélésre kerül a vizsgált operandus valódi értékére,
				//majd az algoritmus folytatódik az operandus kifejtésével
				interpretation = interpretation.replace("<P>", subtreeInterpretation(_and_sub_element, getElementInterpretation(_and_sub_element)));
				//Az elõbb létrehozott változó értékének megadjuk 
		    	//a jelenleg vizsgált operandust
				_and_sub_element = _and_element.getQ();
				//A vizsgált elem interpretációjában a vizsgált operandus 
				//lecserélésre kerül a vizsgált operandus valódi értékére,
				//majd az algoritmus folytatódik az operandus kifejtésével
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(_and_sub_element, getElementInterpretation(_and_sub_element)));
				
				//Amennyiben az adott elem minden operandusának minden rész-eleme 
				//kifejtésre került, akkor visszatér az adott rész-fával
				return interpretation;
			case "comb.expression.metamodel.comb.impl._or_Impl":
				_or_ _or_element = ((_or_)abstract_element);
		    	Element _or_sub_element;
		    	
		    	_or_sub_element = _or_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(_or_sub_element, getElementInterpretation(_or_sub_element)));
				_or_sub_element = _or_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(_or_sub_element, getElementInterpretation(_or_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl._implies_Impl":
				_implies_ _implies_element = ((_implies_)abstract_element);
		    	Element _implies_sub_element;
		    	
		    	_implies_sub_element = _implies_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(_implies_sub_element, getElementInterpretation(_implies_sub_element)));
				_implies_sub_element = _implies_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(_implies_sub_element, getElementInterpretation(_implies_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.Not_Impl":
				Not_ Not_element = ((Not_)abstract_element);
		    	Element Not_sub_element;
		    	
		    	Not_sub_element = Not_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(Not_sub_element, getElementInterpretation(Not_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl._lessThan_Impl":
				_lessThan_ _lessThan_element = ((_lessThan_)abstract_element);
		    	Element _lessThan_sub_element;
		    	
		    	_lessThan_sub_element = _lessThan_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(_lessThan_sub_element, getElementInterpretation(_lessThan_sub_element)));
				_lessThan_sub_element = _lessThan_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(_lessThan_sub_element, getElementInterpretation(_lessThan_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl._lessThanOrEqual_Impl":
				_lessThanOrEqual_ _lessThanOrEqual_element = ((_lessThanOrEqual_)abstract_element);
		    	Element _lessThanOrEqual_sub_element;
		    	
		    	_lessThanOrEqual_sub_element = _lessThanOrEqual_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(_lessThanOrEqual_sub_element, getElementInterpretation(_lessThanOrEqual_sub_element)));
				_lessThanOrEqual_sub_element = _lessThanOrEqual_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(_lessThanOrEqual_sub_element, getElementInterpretation(_lessThanOrEqual_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl._equal_Impl":
				_equal_ _equal_element = ((_equal_)abstract_element);
		    	Element _equal_sub_element;
		    	
		    	_equal_sub_element = _equal_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(_equal_sub_element, getElementInterpretation(_equal_sub_element)));
				_equal_sub_element = _equal_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(_equal_sub_element, getElementInterpretation(_equal_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl._greaterThanOrEqual_Impl":
				_greaterThanOrEqual_ _greaterThanOrEqual_element = ((_greaterThanOrEqual_)abstract_element);
		    	Element _greaterThanOrEqual_sub_element;
		    	
		    	_greaterThanOrEqual_sub_element = _greaterThanOrEqual_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(_greaterThanOrEqual_sub_element, getElementInterpretation(_greaterThanOrEqual_sub_element)));
				_greaterThanOrEqual_sub_element = _greaterThanOrEqual_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(_greaterThanOrEqual_sub_element, getElementInterpretation(_greaterThanOrEqual_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl._greaterThan_Impl":
				_greaterThan_ _greaterThan_element = ((_greaterThan_)abstract_element);
		    	Element _greaterThan_sub_element;
		    	
		    	_greaterThan_sub_element = _greaterThan_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(_greaterThan_sub_element, getElementInterpretation(_greaterThan_sub_element)));
				_greaterThan_sub_element = _greaterThan_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(_greaterThan_sub_element, getElementInterpretation(_greaterThan_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.Next_Impl":
				Next_ Next_element = ((Next_)abstract_element);
		    	Element Next_sub_element;
		    	
		    	Next_sub_element = Next_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(Next_sub_element, getElementInterpretation(Next_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.Always_Impl":
				Always_ Always_element = ((Always_)abstract_element);
		    	Element Always_sub_element;
		    	
		    	Always_sub_element = Always_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(Always_sub_element, getElementInterpretation(Always_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.Eventually_Impl":
				Eventually_ Eventually_element = ((Eventually_)abstract_element);
		    	Element Eventually_sub_element;
		    	
		    	Eventually_sub_element = Eventually_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(Eventually_sub_element, getElementInterpretation(Eventually_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl._until_Impl":
				_until_ _until_element = ((_until_)abstract_element);
		    	Element _until_sub_element;
		    	
		    	_until_sub_element = _until_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(_until_sub_element, getElementInterpretation(_until_sub_element)));
				_until_sub_element = _until_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(_until_sub_element, getElementInterpretation(_until_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.AbsenceGlobally_Impl":
				AbsenceGlobally_ AbsenceGlobally_element = ((AbsenceGlobally_)abstract_element);
		    	Element AbsenceGlobally_sub_element;
		    	
		    	AbsenceGlobally_sub_element = AbsenceGlobally_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(AbsenceGlobally_sub_element, getElementInterpretation(AbsenceGlobally_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.AbsenceBefore_Impl":
				AbsenceBefore_ AbsenceBefore_element = ((AbsenceBefore_)abstract_element);
		    	Element AbsenceBefore_sub_element;
		    	
		    	AbsenceBefore_sub_element = AbsenceBefore_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(AbsenceBefore_sub_element, getElementInterpretation(AbsenceBefore_sub_element)));
		    	AbsenceBefore_sub_element = AbsenceBefore_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(AbsenceBefore_sub_element, getElementInterpretation(AbsenceBefore_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.AbsenceAfter_Impl":
				AbsenceAfter_ AbsenceAfter_element = ((AbsenceAfter_)abstract_element);
		    	Element AbsenceAfter_sub_element;
		    	
		    	AbsenceAfter_sub_element = AbsenceAfter_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(AbsenceAfter_sub_element, getElementInterpretation(AbsenceAfter_sub_element)));
				AbsenceAfter_sub_element = AbsenceAfter_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(AbsenceAfter_sub_element, getElementInterpretation(AbsenceAfter_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.AbsenceBetween_and_Impl":
				AbsenceBetween_and_ AbsenceBetween_and_element = ((AbsenceBetween_and_)abstract_element);
		    	Element AbsenceBetween_and_sub_element;
		    	
		    	AbsenceBetween_and_sub_element = AbsenceBetween_and_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(AbsenceBetween_and_sub_element, getElementInterpretation(AbsenceBetween_and_sub_element)));
		    	AbsenceBetween_and_sub_element = AbsenceBetween_and_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(AbsenceBetween_and_sub_element, getElementInterpretation(AbsenceBetween_and_sub_element)));
		    	AbsenceBetween_and_sub_element = AbsenceBetween_and_element.getR();
				interpretation = interpretation.replace("<R>", subtreeInterpretation(AbsenceBetween_and_sub_element, getElementInterpretation(AbsenceBetween_and_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.AbsenceAfter_until_Impl":
				AbsenceAfter_until_ AbsenceAfter_until_element = ((AbsenceAfter_until_)abstract_element);
		    	Element AbsenceAfter_until_sub_element;
		    	
		    	AbsenceAfter_until_sub_element = AbsenceAfter_until_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(AbsenceAfter_until_sub_element, getElementInterpretation(AbsenceAfter_until_sub_element)));
				AbsenceAfter_until_sub_element = AbsenceAfter_until_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(AbsenceAfter_until_sub_element, getElementInterpretation(AbsenceAfter_until_sub_element)));
				AbsenceAfter_until_sub_element = AbsenceAfter_until_element.getR();
				interpretation = interpretation.replace("<R>", subtreeInterpretation(AbsenceAfter_until_sub_element, getElementInterpretation(AbsenceAfter_until_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.ExistenceGlobally_Impl":
				ExistenceGlobally_ ExistenceGlobally_element = ((ExistenceGlobally_)abstract_element);
		    	Element ExistenceGlobally_sub_element;
		    	
		    	ExistenceGlobally_sub_element = ExistenceGlobally_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(ExistenceGlobally_sub_element, getElementInterpretation(ExistenceGlobally_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.ExistenceBefore_Impl":
				ExistenceBefore_ ExistenceBefore_element = ((ExistenceBefore_)abstract_element);
		    	Element ExistenceBefore_sub_element;
		    	
		    	ExistenceBefore_sub_element = ExistenceBefore_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(ExistenceBefore_sub_element, getElementInterpretation(ExistenceBefore_sub_element)));
		    	ExistenceBefore_sub_element = ExistenceBefore_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(ExistenceBefore_sub_element, getElementInterpretation(ExistenceBefore_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.ExistenceAfter_Impl":
				ExistenceAfter_ ExistenceAfter_element = ((ExistenceAfter_)abstract_element);
		    	Element ExistenceAfter_sub_element;
		    	
		    	ExistenceAfter_sub_element = ExistenceAfter_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(ExistenceAfter_sub_element, getElementInterpretation(ExistenceAfter_sub_element)));
				ExistenceAfter_sub_element = ExistenceAfter_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(ExistenceAfter_sub_element, getElementInterpretation(ExistenceAfter_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.ExistenceBetween_and_Impl":
				ExistenceBetween_and_ ExistenceBetween_and_element = ((ExistenceBetween_and_)abstract_element);
		    	Element ExistenceBetween_and_sub_element;
		    	
		    	ExistenceBetween_and_sub_element = ExistenceBetween_and_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(ExistenceBetween_and_sub_element, getElementInterpretation(ExistenceBetween_and_sub_element)));
		    	ExistenceBetween_and_sub_element = ExistenceBetween_and_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(ExistenceBetween_and_sub_element, getElementInterpretation(ExistenceBetween_and_sub_element)));
		    	ExistenceBetween_and_sub_element = ExistenceBetween_and_element.getR();
				interpretation = interpretation.replace("<R>", subtreeInterpretation(ExistenceBetween_and_sub_element, getElementInterpretation(ExistenceBetween_and_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.ExistenceAfter_until_Impl":
				ExistenceAfter_until_ ExistenceAfter_until_element = ((ExistenceAfter_until_)abstract_element);
		    	Element ExistenceAfter_until_sub_element;
		    	
		    	ExistenceAfter_until_sub_element = ExistenceAfter_until_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(ExistenceAfter_until_sub_element, getElementInterpretation(ExistenceAfter_until_sub_element)));
				ExistenceAfter_until_sub_element = ExistenceAfter_until_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(ExistenceAfter_until_sub_element, getElementInterpretation(ExistenceAfter_until_sub_element)));
				ExistenceAfter_until_sub_element = ExistenceAfter_until_element.getR();
				interpretation = interpretation.replace("<R>", subtreeInterpretation(ExistenceAfter_until_sub_element, getElementInterpretation(ExistenceAfter_until_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.BoundedExistenceGlobally_Impl":
				BoundedExistenceGlobally_ BoundedExistenceGlobally_element = ((BoundedExistenceGlobally_)abstract_element);
		    	Element BoundedExistenceGlobally_sub_element;
		    	
		    	BoundedExistenceGlobally_sub_element = BoundedExistenceGlobally_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(BoundedExistenceGlobally_sub_element, getElementInterpretation(BoundedExistenceGlobally_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.BoundedExistenceBefore_Impl":
				BoundedExistenceBefore_ BoundedExistenceBefore_element = ((BoundedExistenceBefore_)abstract_element);
		    	Element BoundedExistenceBefore_sub_element;
		    	
		    	BoundedExistenceBefore_sub_element = BoundedExistenceBefore_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(BoundedExistenceBefore_sub_element, getElementInterpretation(BoundedExistenceBefore_sub_element)));
		    	BoundedExistenceBefore_sub_element = BoundedExistenceBefore_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(BoundedExistenceBefore_sub_element, getElementInterpretation(BoundedExistenceBefore_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.BoundedExistenceAfter_Impl":
				BoundedExistenceAfter_ BoundedExistenceAfter_element = ((BoundedExistenceAfter_)abstract_element);
		    	Element BoundedExistenceAfter_sub_element;
		    	
		    	BoundedExistenceAfter_sub_element = BoundedExistenceAfter_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(BoundedExistenceAfter_sub_element, getElementInterpretation(BoundedExistenceAfter_sub_element)));
				BoundedExistenceAfter_sub_element = BoundedExistenceAfter_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(BoundedExistenceAfter_sub_element, getElementInterpretation(BoundedExistenceAfter_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.BoundedExistenceBetween_and_Impl":
				BoundedExistenceBetween_and_ BoundedExistenceBetween_and_element = ((BoundedExistenceBetween_and_)abstract_element);
		    	Element BoundedExistenceBetween_and_sub_element;
		    	
		    	BoundedExistenceBetween_and_sub_element = BoundedExistenceBetween_and_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(BoundedExistenceBetween_and_sub_element, getElementInterpretation(BoundedExistenceBetween_and_sub_element)));
		    	BoundedExistenceBetween_and_sub_element = BoundedExistenceBetween_and_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(BoundedExistenceBetween_and_sub_element, getElementInterpretation(BoundedExistenceBetween_and_sub_element)));
		    	BoundedExistenceBetween_and_sub_element = BoundedExistenceBetween_and_element.getR();
				interpretation = interpretation.replace("<R>", subtreeInterpretation(BoundedExistenceBetween_and_sub_element, getElementInterpretation(BoundedExistenceBetween_and_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.BoundedExistenceAfter_until_Impl":
				BoundedExistenceAfter_until_ BoundedExistenceAfter_until_element = ((BoundedExistenceAfter_until_)abstract_element);
		    	Element BoundedExistenceAfter_until_sub_element;
		    	
		    	BoundedExistenceAfter_until_sub_element = BoundedExistenceAfter_until_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(BoundedExistenceAfter_until_sub_element, getElementInterpretation(BoundedExistenceAfter_until_sub_element)));
				BoundedExistenceAfter_until_sub_element = BoundedExistenceAfter_until_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(BoundedExistenceAfter_until_sub_element, getElementInterpretation(BoundedExistenceAfter_until_sub_element)));
				BoundedExistenceAfter_until_sub_element = BoundedExistenceAfter_until_element.getR();
				interpretation = interpretation.replace("<R>", subtreeInterpretation(BoundedExistenceAfter_until_sub_element, getElementInterpretation(BoundedExistenceAfter_until_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.UniversalityGlobally_Impl":
				UniversalityGlobally_ UniversalityGlobally_element = ((UniversalityGlobally_)abstract_element);
		    	Element UniversalityGlobally_sub_element;
		    	
		    	UniversalityGlobally_sub_element = UniversalityGlobally_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(UniversalityGlobally_sub_element, getElementInterpretation(UniversalityGlobally_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.UniversalityBefore_Impl":
				UniversalityBefore_ UniversalityBefore_element = ((UniversalityBefore_)abstract_element);
		    	Element UniversalityBefore_sub_element;
		    	
		    	UniversalityBefore_sub_element = UniversalityBefore_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(UniversalityBefore_sub_element, getElementInterpretation(UniversalityBefore_sub_element)));
		    	UniversalityBefore_sub_element = UniversalityBefore_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(UniversalityBefore_sub_element, getElementInterpretation(UniversalityBefore_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.UniversalityAfter_Impl":
				UniversalityAfter_ UniversalityAfter_element = ((UniversalityAfter_)abstract_element);
		    	Element UniversalityAfter_sub_element;
		    	
		    	UniversalityAfter_sub_element = UniversalityAfter_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(UniversalityAfter_sub_element, getElementInterpretation(UniversalityAfter_sub_element)));
				UniversalityAfter_sub_element = UniversalityAfter_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(UniversalityAfter_sub_element, getElementInterpretation(UniversalityAfter_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.UniversalityBetween_and_Impl":
				UniversalityBetween_and_ UniversalityBetween_and_element = ((UniversalityBetween_and_)abstract_element);
		    	Element UniversalityBetween_and_sub_element;
		    	
		    	UniversalityBetween_and_sub_element = UniversalityBetween_and_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(UniversalityBetween_and_sub_element, getElementInterpretation(UniversalityBetween_and_sub_element)));
		    	UniversalityBetween_and_sub_element = UniversalityBetween_and_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(UniversalityBetween_and_sub_element, getElementInterpretation(UniversalityBetween_and_sub_element)));
		    	UniversalityBetween_and_sub_element = UniversalityBetween_and_element.getR();
				interpretation = interpretation.replace("<R>", subtreeInterpretation(UniversalityBetween_and_sub_element, getElementInterpretation(UniversalityBetween_and_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.UniversalityAfter_until_Impl":
				UniversalityAfter_until_ UniversalityAfter_until_element = ((UniversalityAfter_until_)abstract_element);
		    	Element UniversalityAfter_until_sub_element;
		    	
		    	UniversalityAfter_until_sub_element = UniversalityAfter_until_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(UniversalityAfter_until_sub_element, getElementInterpretation(UniversalityAfter_until_sub_element)));
				UniversalityAfter_until_sub_element = UniversalityAfter_until_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(UniversalityAfter_until_sub_element, getElementInterpretation(UniversalityAfter_until_sub_element)));
				UniversalityAfter_until_sub_element = UniversalityAfter_until_element.getR();
				interpretation = interpretation.replace("<R>", subtreeInterpretation(UniversalityAfter_until_sub_element, getElementInterpretation(UniversalityAfter_until_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.PrecedenceGlobally_Impl":
				PrecedenceGlobally_ PrecedenceGlobally_element = ((PrecedenceGlobally_)abstract_element);
		    	Element PrecedenceGlobally_sub_element;
		    	
		    	PrecedenceGlobally_sub_element = PrecedenceGlobally_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(PrecedenceGlobally_sub_element, getElementInterpretation(PrecedenceGlobally_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.PrecedenceBefore_Impl":
				PrecedenceBefore_ PrecedenceBefore_element = ((PrecedenceBefore_)abstract_element);
		    	Element PrecedenceBefore_sub_element;
		    	
		    	PrecedenceBefore_sub_element = PrecedenceBefore_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(PrecedenceBefore_sub_element, getElementInterpretation(PrecedenceBefore_sub_element)));
		    	PrecedenceBefore_sub_element = PrecedenceBefore_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(PrecedenceBefore_sub_element, getElementInterpretation(PrecedenceBefore_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.PrecedenceAfter_Impl":
				PrecedenceAfter_ PrecedenceAfter_element = ((PrecedenceAfter_)abstract_element);
		    	Element PrecedenceAfter_sub_element;
		    	
		    	PrecedenceAfter_sub_element = PrecedenceAfter_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(PrecedenceAfter_sub_element, getElementInterpretation(PrecedenceAfter_sub_element)));
				PrecedenceAfter_sub_element = PrecedenceAfter_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(PrecedenceAfter_sub_element, getElementInterpretation(PrecedenceAfter_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.PrecedenceBetween_and_Impl":
				PrecedenceBetween_and_ PrecedenceBetween_and_element = ((PrecedenceBetween_and_)abstract_element);
		    	Element PrecedenceBetween_and_sub_element;
		    	
		    	PrecedenceBetween_and_sub_element = PrecedenceBetween_and_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(PrecedenceBetween_and_sub_element, getElementInterpretation(PrecedenceBetween_and_sub_element)));
		    	PrecedenceBetween_and_sub_element = PrecedenceBetween_and_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(PrecedenceBetween_and_sub_element, getElementInterpretation(PrecedenceBetween_and_sub_element)));
		    	PrecedenceBetween_and_sub_element = PrecedenceBetween_and_element.getR();
				interpretation = interpretation.replace("<R>", subtreeInterpretation(PrecedenceBetween_and_sub_element, getElementInterpretation(PrecedenceBetween_and_sub_element)));
				PrecedenceBetween_and_sub_element = PrecedenceBetween_and_element.getS();
				interpretation = interpretation.replace("<S>", subtreeInterpretation(PrecedenceBetween_and_sub_element, getElementInterpretation(PrecedenceBetween_and_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.PrecedenceAfter_until_Impl":
				PrecedenceAfter_until_ PrecedenceAfter_until_element = ((PrecedenceAfter_until_)abstract_element);
		    	Element PrecedenceAfter_until_sub_element;
		    	
		    	PrecedenceAfter_until_sub_element = PrecedenceAfter_until_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(PrecedenceAfter_until_sub_element, getElementInterpretation(PrecedenceAfter_until_sub_element)));
				PrecedenceAfter_until_sub_element = PrecedenceAfter_until_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(PrecedenceAfter_until_sub_element, getElementInterpretation(PrecedenceAfter_until_sub_element)));
				PrecedenceAfter_until_sub_element = PrecedenceAfter_until_element.getR();
				interpretation = interpretation.replace("<R>", subtreeInterpretation(PrecedenceAfter_until_sub_element, getElementInterpretation(PrecedenceAfter_until_sub_element)));
				PrecedenceAfter_until_sub_element = PrecedenceAfter_until_element.getS();
				interpretation = interpretation.replace("<S>", subtreeInterpretation(PrecedenceAfter_until_sub_element, getElementInterpretation(PrecedenceAfter_until_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.ResponseGlobally_Impl":
				ResponseGlobally_ ResponseGlobally_element = ((ResponseGlobally_)abstract_element);
		    	Element ResponseGlobally_sub_element;
		    	
		    	ResponseGlobally_sub_element = ResponseGlobally_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(ResponseGlobally_sub_element, getElementInterpretation(ResponseGlobally_sub_element)));
		    	ResponseGlobally_sub_element = ResponseGlobally_element.getS();
				interpretation = interpretation.replace("<S>", subtreeInterpretation(ResponseGlobally_sub_element, getElementInterpretation(ResponseGlobally_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.ResponseBefore_Impl":
				ResponseBefore_ ResponseBefore_element = ((ResponseBefore_)abstract_element);
		    	Element ResponseBefore_sub_element;
		    	
		    	ResponseBefore_sub_element = ResponseBefore_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(ResponseBefore_sub_element, getElementInterpretation(ResponseBefore_sub_element)));
		    	ResponseBefore_sub_element = ResponseBefore_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(ResponseBefore_sub_element, getElementInterpretation(ResponseBefore_sub_element)));
				ResponseBefore_sub_element = ResponseBefore_element.getS();
				interpretation = interpretation.replace("<S>", subtreeInterpretation(ResponseBefore_sub_element, getElementInterpretation(ResponseBefore_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.ResponseAfter_Impl":
				ResponseAfter_ ResponseAfter_element = ((ResponseAfter_)abstract_element);
		    	Element ResponseAfter_sub_element;
		    	
		    	ResponseAfter_sub_element = ResponseAfter_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(ResponseAfter_sub_element, getElementInterpretation(ResponseAfter_sub_element)));
				ResponseAfter_sub_element = ResponseAfter_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(ResponseAfter_sub_element, getElementInterpretation(ResponseAfter_sub_element)));
				ResponseAfter_sub_element = ResponseAfter_element.getS();
				interpretation = interpretation.replace("<S>", subtreeInterpretation(ResponseAfter_sub_element, getElementInterpretation(ResponseAfter_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.ResponseBetween_and_Impl":
				ResponseBetween_and_ ResponseBetween_and_element = ((ResponseBetween_and_)abstract_element);
		    	Element ResponseBetween_and_sub_element;
		    	
		    	ResponseBetween_and_sub_element = ResponseBetween_and_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(ResponseBetween_and_sub_element, getElementInterpretation(ResponseBetween_and_sub_element)));
		    	ResponseBetween_and_sub_element = ResponseBetween_and_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(ResponseBetween_and_sub_element, getElementInterpretation(ResponseBetween_and_sub_element)));
		    	ResponseBetween_and_sub_element = ResponseBetween_and_element.getR();
				interpretation = interpretation.replace("<R>", subtreeInterpretation(ResponseBetween_and_sub_element, getElementInterpretation(ResponseBetween_and_sub_element)));
				ResponseBetween_and_sub_element = ResponseBetween_and_element.getS();
				interpretation = interpretation.replace("<S>", subtreeInterpretation(ResponseBetween_and_sub_element, getElementInterpretation(ResponseBetween_and_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.ResponseAfter_until_Impl":
				ResponseAfter_until_ ResponseAfter_until_element = ((ResponseAfter_until_)abstract_element);
		    	Element ResponseAfter_until_sub_element;
		    	
		    	ResponseAfter_until_sub_element = ResponseAfter_until_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(ResponseAfter_until_sub_element, getElementInterpretation(ResponseAfter_until_sub_element)));
				ResponseAfter_until_sub_element = ResponseAfter_until_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(ResponseAfter_until_sub_element, getElementInterpretation(ResponseAfter_until_sub_element)));
				ResponseAfter_until_sub_element = ResponseAfter_until_element.getR();
				interpretation = interpretation.replace("<R>", subtreeInterpretation(ResponseAfter_until_sub_element, getElementInterpretation(ResponseAfter_until_sub_element)));
				ResponseAfter_until_sub_element = ResponseAfter_until_element.getS();
				interpretation = interpretation.replace("<S>", subtreeInterpretation(ResponseAfter_until_sub_element, getElementInterpretation(ResponseAfter_until_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.AlwaysWithin_Impl":
				AlwaysWithin_ AlwaysWithin_element = ((AlwaysWithin_)abstract_element);
		    	Element AlwaysWithin_sub_element;
		    	
		    	AlwaysWithin_sub_element = AlwaysWithin_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(AlwaysWithin_sub_element, getElementInterpretation(AlwaysWithin_sub_element)));
				AlwaysWithin_sub_element = AlwaysWithin_element.getH();
				interpretation = interpretation.replace("<high>", subtreeInterpretation(AlwaysWithin_sub_element, getElementInterpretation(AlwaysWithin_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.AlwaysWithin_and_Impl":
				AlwaysWithin_and_ AlwaysWithin_and_element = ((AlwaysWithin_and_)abstract_element);
		    	Element AlwaysWithin_and_sub_element;
		    	
		    	AlwaysWithin_and_sub_element = AlwaysWithin_and_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(AlwaysWithin_and_sub_element, getElementInterpretation(AlwaysWithin_and_sub_element)));
				AlwaysWithin_and_sub_element = AlwaysWithin_and_element.getL();
				interpretation = interpretation.replace("<low>", subtreeInterpretation(AlwaysWithin_and_sub_element, getElementInterpretation(AlwaysWithin_and_sub_element)));
				AlwaysWithin_and_sub_element = AlwaysWithin_and_element.getH();
				interpretation = interpretation.replace("<high>", subtreeInterpretation(AlwaysWithin_and_sub_element, getElementInterpretation(AlwaysWithin_and_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.EventuallyWithin_Impl":
				EventuallyWithin_ EventuallyWithin_element = ((EventuallyWithin_)abstract_element);
		    	Element EventuallyWithin_sub_element;
		    	
		    	EventuallyWithin_sub_element = EventuallyWithin_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(EventuallyWithin_sub_element, getElementInterpretation(EventuallyWithin_sub_element)));
				EventuallyWithin_sub_element = EventuallyWithin_element.getH();
				interpretation = interpretation.replace("<high>", subtreeInterpretation(EventuallyWithin_sub_element, getElementInterpretation(EventuallyWithin_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl.EventuallyWithin_and_Impl":
				EventuallyWithin_and_ EventuallyWithin_and_element = ((EventuallyWithin_and_)abstract_element);
		    	Element EventuallyWithin_and_sub_element;
		    	
		    	EventuallyWithin_and_sub_element = EventuallyWithin_and_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(EventuallyWithin_and_sub_element, getElementInterpretation(EventuallyWithin_and_sub_element)));
				EventuallyWithin_and_sub_element = EventuallyWithin_and_element.getL();
				interpretation = interpretation.replace("<low>", subtreeInterpretation(EventuallyWithin_and_sub_element, getElementInterpretation(EventuallyWithin_and_sub_element)));
				EventuallyWithin_and_sub_element = EventuallyWithin_and_element.getH();
				interpretation = interpretation.replace("<high>", subtreeInterpretation(EventuallyWithin_and_sub_element, getElementInterpretation(EventuallyWithin_and_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl._untilWithin_Impl":
				_untilWithin_ _untilWithin_element = ((_untilWithin_)abstract_element);
		    	Element _untilWithin_sub_element;
		    	
		    	_untilWithin_sub_element = _untilWithin_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(_untilWithin_sub_element, getElementInterpretation(_untilWithin_sub_element)));
				_untilWithin_sub_element = _untilWithin_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(_untilWithin_sub_element, getElementInterpretation(_untilWithin_sub_element)));
				_untilWithin_sub_element = _untilWithin_element.getH();
				interpretation = interpretation.replace("<high>", subtreeInterpretation(_untilWithin_sub_element, getElementInterpretation(_untilWithin_sub_element)));
				
				return interpretation;
			case "comb.expression.metamodel.comb.impl._untilWithin_and_Impl":
				_untilWithin_and_ _untilWithin_and_element = ((_untilWithin_and_)abstract_element);
		    	Element _untilWithin_and_sub_element;
		    	
		    	_untilWithin_and_sub_element = _untilWithin_and_element.getP();
				interpretation = interpretation.replace("<P>", subtreeInterpretation(_untilWithin_and_sub_element, getElementInterpretation(_untilWithin_and_sub_element)));
				_untilWithin_and_sub_element = _untilWithin_and_element.getQ();
				interpretation = interpretation.replace("<Q>", subtreeInterpretation(_untilWithin_and_sub_element, getElementInterpretation(_untilWithin_and_sub_element)));
				_untilWithin_and_sub_element = _untilWithin_and_element.getL();
				interpretation = interpretation.replace("<low>", subtreeInterpretation(_untilWithin_and_sub_element, getElementInterpretation(_untilWithin_and_sub_element)));
				_untilWithin_and_sub_element = _untilWithin_and_element.getH();
				interpretation = interpretation.replace("<high>", subtreeInterpretation(_untilWithin_and_sub_element, getElementInterpretation(_untilWithin_and_sub_element)));
				
				return interpretation;
		}
		return "<"+abstract_element.getClass().getName()+" NotFoundException>";
	}*/
    
    /*private String getElementInterpretation(Element abstract_element) {
    	switch(abstract_element.getClass().getName()) {
			case "comb.expression.metamodel.comb.impl.LiteralImpl":
				return ((Literal)abstract_element).getName();
			//Ha a kiválasztott operátor típusa megegyezik az alábbi operátortípussal...
			case "comb.expression.metamodel.comb.impl._and_Impl":
				//Visszatér az adott elem interpretációjával
				return "("+((_and_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl._or_Impl":
		    	return "("+((_or_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl._implies_Impl":
		    	return "("+((_implies_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.Not_Impl":
		    	return "("+((Not_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl._lessThan_Impl":
		    	return "("+((_lessThan_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl._lessThanOrEqual_Impl":
		    	return "("+((_lessThanOrEqual_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl._equal_Impl":
		    	return "("+((_equal_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl._greaterThanOrEqual_Impl":
		    	return "("+((_greaterThanOrEqual_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl._greaterThan_Impl":
		    	return "("+((_greaterThan_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.Always_Impl":
				return "("+((Always_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.Eventually_Impl":
				return "("+((Eventually_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl._until_Impl":
		    	return "("+((_until_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.AbsenceGlobally_Impl":
				return "("+((AbsenceGlobally_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.AbsenceBefore_Impl":
				return "("+((AbsenceBefore_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.AbsenceAfter_Impl":
				return "("+((AbsenceAfter_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.AbsenceBetween_and_Impl":
				return "("+((AbsenceBetween_and_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.AbsenceAfter_until_Impl":
				return "("+((AbsenceAfter_until_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.ExistenceGlobally_Impl":
				return "("+((ExistenceGlobally_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.ExistenceBefore_Impl":
				return "("+((ExistenceBefore_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.ExistenceAfter_Impl":
				return "("+((ExistenceAfter_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.ExistenceBetween_and_Impl":
				return "("+((ExistenceBetween_and_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.ExistenceAfter_until_Impl":
				return "("+((ExistenceAfter_until_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.BoundedExistenceGlobally_Impl":
				return "("+((BoundedExistenceGlobally_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.BoundedExistenceBefore_Impl":
				return "("+((BoundedExistenceBefore_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.BoundedExistenceAfter_Impl":
				return "("+((BoundedExistenceAfter_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.BoundedExistenceBetween_and_Impl":
				return "("+((BoundedExistenceBetween_and_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.BoundedExistenceAfter_until_Impl":
				return "("+((BoundedExistenceAfter_until_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.UniversalityGlobally_Impl":
				return "("+((UniversalityGlobally_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.UniversalityBefore_Impl":
				return "("+((UniversalityBefore_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.UniversalityAfter_Impl":
				return "("+((UniversalityAfter_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.UniversalityBetween_and_Impl":
				return "("+((UniversalityBetween_and_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.UniversalityAfter_until_Impl":
				return "("+((UniversalityAfter_until_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.PrecedenceGlobally_Impl":
				return "("+((PrecedenceGlobally_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.PrecedenceBefore_Impl":
				return "("+((PrecedenceBefore_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.PrecedenceAfter_Impl":
				return "("+((PrecedenceAfter_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.PrecedenceBetween_and_Impl":
				return "("+((PrecedenceBetween_and_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.PrecedenceAfter_until_Impl":
				return "("+((PrecedenceAfter_until_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.ResponseGlobally_Impl":
				return "("+((ResponseGlobally_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.ResponseBefore_Impl":
				return "("+((ResponseBefore_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.ResponseAfter_Impl":
				return "("+((ResponseAfter_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.ResponseBetween_and_Impl":
				return "("+((ResponseBetween_and_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.ResponseAfter_until_Impl":
				return "("+((ResponseAfter_until_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.AlwaysWithin_Impl":
		    	return "("+((AlwaysWithin_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.AlwaysWithin_and_Impl":
		    	return "("+((AlwaysWithin_and_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.EventuallyWithin_Impl":
		    	return "("+((EventuallyWithin_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl.EventuallyWithin_and_Impl":
		    	return "("+((EventuallyWithin_and_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl._untilWithin_Impl":
		    	return "("+((_untilWithin_)abstract_element).getInterpretation()+")";
			case "comb.expression.metamodel.comb.impl._untilWithin_and_Impl":
		    	return "("+((_untilWithin_and_)abstract_element).getInterpretation()+")";
		}
		return "<"+abstract_element.getClass().getName()+" NotFoundException>";
	}*/
    
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
