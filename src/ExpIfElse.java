/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */


public class ExpIfElse extends Exp {

    Exp exp1, exp2,exp3;

    public ExpIfElse(Exp e1, Exp e2,Exp e3) {
        exp1 = e1;
        exp2 = e2;
        exp3 = e3;
    }

    public Exp getExpIf() {
	return exp1;
    }

    public Exp getExpThen() {
	return exp2;
    }
    public Exp getExpElse() {
	return exp3;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitExpIfElse(this, arg);
    }

    public String toString() {
        return "If "+exp1.toString() + " Then " + exp2.toString()+" Else "+exp3.toString();
    }
}


	
