/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */


public class ExpIf extends Exp {

    Exp exp1, exp2;

    public ExpIf(Exp e1, Exp e2) {
        exp1 = e1;
        exp2 = e2;
    } 

    public Exp getExpIf() {
	return exp1;
    }

    public Exp getExpThen() {
	return exp2;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitExpIf(this, arg);
    }

    public String toString() {
        return "If "+exp1.toString() + " Then " + exp2.toString();
    }
}
	
