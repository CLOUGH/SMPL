
import java.util.*;

public class VarProcCall extends Exp {

  Exp[] args;
  String var;

  public VarProcCall( String val, ExpSequence lst) {
    ArrayList list = lst.getSeq();
    args = (Exp[])list.toArray(new Exp[0]);
    var = val;
  }

    public Exp[] getList() {
	return args;
    }

    public String getVar() {
	return var;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitVarProcCall(this, arg);
    }

  public String toString() {
    return "ProcCall ("+args.toString() + ") : ";
  }
}

