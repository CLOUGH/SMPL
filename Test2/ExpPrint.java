public class ExpPrint extends Exp {

    Exp exp1 ;
    int mode;

    public ExpPrint(Exp e1,int n) {
	exp1 = e1;
        mode = n;
    }

    public Exp getExp() {
	return exp1;
    }
    public int getMode() {
	return mode;
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
