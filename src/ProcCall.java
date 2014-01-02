/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */


import java.util.*;

public class ProcCall extends Exp {

    Exp[] args;
    Exp exp;

    public ProcCall( Exp e, ExpSequence lst) {
        ArrayList list = lst.getSeq();
        args = (Exp[])list.toArray(new Exp[0]);
        exp = e;
    }

    public Exp[] getList() {
	return args;
    }

    public Exp getProc() {
	return exp;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitProcCall(this, arg);
    }

    public String toString() {
        return "ProcCall ("+args.toString() + ") : " + exp.toString();
    }
}



	
