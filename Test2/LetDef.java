
public class LetDef extends Statement {

    String var;
    Exp exp;

    public LetDef(String id, Exp e) {
	var = id;
	exp = e;
    }

    public String getVar(){
	return var;
    }

    public Exp getExp() {
	return exp;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitLetDef(this, arg);
    }

    /*
    public int eval(Environment env) {
	int result = exp.eval(env);
	env.put(var, result);
	return result;
    }
    */
}
