package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.util.Map;
import eu.quanticol.jsstl.core.formula.*;


public class No_Red_and_Green_at_the_same_time_FormulaScript extends jSSTLScript {
public No_Red_and_Green_at_the_same_time_FormulaScript() {
super( 
new String[] {
"LightInputs.DisplayRed",
"LightInputs.DisplayGreen"
}
);
addFormula("req",
new GloballyFormula(
new ParametricInterval(
new ParametricExpression() {
public SignalExpression eval( final Map<String,Double> parameters ) {
return new SignalExpression() {
public double eval( double ... variables ) {
return 0;
}
};
}
}
,
new ParametricExpression() {
public SignalExpression eval( final Map<String,Double> parameters ) {
return new SignalExpression() {
public double eval( double ... variables ) {
return Double.POSITIVE_INFINITY;
}
};
}
}
),
new OrFormula(
new NotFormula(
new AtomicFormula(
new ParametricExpression() {
public SignalExpression eval( final Map<String,Double> parameters ) {
return new SignalExpression() {
public double eval( double ... variables ) {
return variables[getIndex(0)];
}
};
}
}, false)

),
new NotFormula(
new AtomicFormula(
new ParametricExpression() {
public SignalExpression eval( final Map<String,Double> parameters ) {
return new SignalExpression() {
public double eval( double ... variables ) {
return variables[getIndex(1)];
}
};
}
}, false)

)

)

)
, null);
}
}