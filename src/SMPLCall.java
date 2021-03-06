/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

import java.util.*;

public class SMPLCall extends Exp {

    Exp[] args;
    Exp exp;

    public SMPLCall(Exp e,ExpSequence lst) {
        ArrayList list = lst.getSeq();
        args = (Exp[])list.toArray(new Exp[0]);
        exp = e;
    }

    public Exp[] getList() {
	return args;
    }

    public Exp getExp() {
	return exp;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitSMPLCall(this, arg);
    }

    public String toString() {
        return "ProcedureCall ("+args.toString() + ") ";
    }
}



	
