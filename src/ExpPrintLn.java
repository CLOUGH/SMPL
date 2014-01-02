public class ExpPrintLn extends Exp {

    Exp exp1 ;

    public ExpPrintLn(Exp e1) {
	exp1 = e1; 
    }

    public Exp getExp() {
	return exp1;
    }
 
    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitExpPrintLn(this, arg);
    }

    public String toString() {
	return "println : "+exp1.toString();
    }
}
