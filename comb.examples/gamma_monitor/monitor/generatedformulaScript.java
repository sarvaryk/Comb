import java.util.Map;
import eu.quanticol.jsstl.core.formula.*;


public class generatedformulaScript extends jSSTLScript {
public generatedformulaScript() {
super( 
new String[] {
"a"
}
);
addFormula("req",
new GloballyFormula(
new ParametricInterval( 
new ParametricExpression() {
public SignalExpression eval( final Map<String,Double> parameters ) {
return new SignalExpression() {
public double eval( double ... variables ) {
return 0.2;
}
};
}
}
,
new ParametricExpression() {
public SignalExpression eval( final Map<String,Double> parameters ) {
return new SignalExpression() {
public double eval( double ... variables ) {
return 1.2;
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