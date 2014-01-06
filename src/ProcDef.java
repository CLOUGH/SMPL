/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */


import java.util.*;

public class ProcDef extends Exp {

    String[] parameters;
    Exp exp;
    Environment env;

    public ProcDef(ArrayList lst, Exp e) {
        parameters = (String[])lst.toArray(new String[0]);
        exp = e;
    }

    public String[] getParams() {
	return parameters;
    }

    public Exp getExp() {
		return exp;
    }
    public void addEnv(Object arg) {
    	
		env = (Environment) arg;
		System.out.println(env);
    }
    public Environment getEnv() {
		return env;
    }
    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitProcDef(this, arg);
    }

    public String toString() {
        return "ProcDef ("+parameters.toString() + ") : " + exp.toString();
    }
}


	
