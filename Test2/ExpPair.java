public class ExpPair extends Exp {

  Exp expl,expr;

  public ExpPair(Exp e1,Exp e2) {
    expl = e1;
    expr = e2;
  }

    public Exp getExpL() {
	return expl;
    }
    public Exp getExpR() {
	return expr;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitExpPair(this, arg);
    }

    public String toString() {
        return "("+expl.toString()+","+expr.toString()+")" ;
    }
    public Boolean equals(ExpPair p)
    {
        System.out.println("equals");
        if(p.getExpL().equals(expl)&& p.getExpR().equals(expr))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
  
}

