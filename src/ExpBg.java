/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

public class ExpBg extends Exp {

     Exp canvas, vector;

     public ExpBg(Exp can, Exp vect)
     {
	canvas = can;
	vector = vect;
     }

     public Exp getCanvas() 
     {
	return canvas;
     }

     public Exp getVector()
     {
	return vector;
     }
    
    public Object visit(Visitor v, Object arg) throws Exception
    {
	return v.visitExpBg(this, arg);
    }

    public String toString() {
        return "Canvas background" ;
    }
    
  
}
	
