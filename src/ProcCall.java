/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */


import java.util.*;

public class ProcCall extends Exp {
	
	String procName;
    Exp[] argExps;

    public ProcCall(String pn, ArrayList<Exp> args) {
		procName = pn;
		argExps = args.toArray(new Exp[args.size()]);;
    }

    public String getProcName() {
		return procName;
    }

    public Exp[] getArgExps() {
		return argExps;
    }
    
	public Object visit(Visitor v, Object arg)
	throws Exception
    {
		return v.visitProcCall(this, arg);
    }
    public String toString() {
		String arguments = "";
		if (argExps.length==0) {
			arguments = argExps[0].toString();
			for (int i = 1; i < argExps.length; i++)
			arguments += ", " + argExps[i].toString();
		}
		return procName + "(" + arguments + ")";
    }
}



	
