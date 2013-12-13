public class ExpCar extends Exp {

  Exp exp;

  public ExpCar(Exp e) {
    exp = e;
  }

    public Exp getExp() {
	return exp;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitExpCar(this, arg);
    }

  public String toString() {
    return "("+exp.toString()+")" ;
  }
}

