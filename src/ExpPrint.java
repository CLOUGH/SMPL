/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

public class ExpPrint extends Exp {

    Exp exp1 ;

    public ExpPrint(Exp e1) {
	exp1 = e1;
    }

    public Exp getExp() {
	return exp1;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitExpPrint(this, arg);
    }

    public String toString() {
	return "print : "+exp1.toString();
    }
}



	
