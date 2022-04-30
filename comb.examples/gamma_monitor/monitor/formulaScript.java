package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.util.Map;
import eu.quanticol.jsstl.core.formula.*;


public class formulaScript extends jSSTLScript {
public formulaScript() {
super( 
new String[] {
"LightInputs.DisplayYellow"
}
);
addFormula("req",
new EventuallyFormula(
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
return 2;
}
};
}
}
),
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

)
, null);
}
}