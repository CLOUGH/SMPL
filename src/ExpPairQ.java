/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

public class ExpPairQ extends Exp {

    Exp exp;

    public ExpPairQ(Exp e) {
        exp = e;
    }

    public Exp getExp() {
	return exp;
    }

    public Object visit(Visitor v, Object arg)	throws Exception
    {
	return v.visitExpPairQ(this, arg);
    }

    public String toString() {
        return "pair? ("+exp.toString()+")" ;
    }
}



	
