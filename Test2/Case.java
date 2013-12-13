public class Case extends Exp {

    Exp exp1 , exp2;

    public Case(Exp e1,Exp e2) {
	exp1 = e1;
        exp2 = e2;
    }

    public Exp getExpPred() {
	return exp1;
    }
    public Exp getExpConc() {
	return exp2;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitCase(this, arg);
    }

    public String toString() {
	return exp1.toString()+" : "+exp2.toString();
    }
}
