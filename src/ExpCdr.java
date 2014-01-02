/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

public class ExpCdr extends Exp {

    Exp exp;

    public ExpCdr(Exp e) {
        exp = e;
    }

    public Exp getExp() {
	return exp;
    }

    public Object visit(Visitor v, Object arg) throws Exception
    {
	return v.visitExpCdr(this, arg);
    }

    public String toString() {
        return "("+exp.toString()+")" ;
    }
}



	
