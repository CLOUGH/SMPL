/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */


public class ExpNot extends Exp {

    Exp exp1;

    public ExpNot(Exp e1) {
        exp1 = e1;
    }

    public Exp getExp() {
	return exp1;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitExpNot(this, arg);
    }

    public String toString() {
        return "not " + exp1.toString() ;
    }
}

	
