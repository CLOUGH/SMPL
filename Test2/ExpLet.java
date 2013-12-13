public class ExpLet extends Exp {

  BindSequence exp1;
  Exp exp2;

  public ExpLet(BindSequence e1, Exp e2) {
    exp1 = e1;
    exp2 = e2;
  }

    public BindSequence getList() {
	return exp1;
    }

    public Exp getExpR() {
	return exp2;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitExpLet(this, arg);
    }

  public String toString() {
    return "let "+exp1.toString() + "  " + exp2.toString();
  }
}

