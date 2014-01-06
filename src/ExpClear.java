/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

public class ExpClear extends Exp {

     Exp expression;

     public ExpClear(Exp expr)
     {
	expression = expr;
     }
    
    public Object visit(Visitor v, Object arg) throws Exception
    {
	return v.visitExpClear(this, arg);
    }

    public String toString() {
        return "Canvas clear" ;
    }
    
  
}
	
