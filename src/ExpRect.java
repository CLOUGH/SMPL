/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

public class ExpRect extends Exp {
     Exp xcord;
     Exp ycord;
     Exp canvas;
    
     public ExpRect(Exp can, Exp x, Exp y)
     {
	xcord = x;
	ycord = y;
	canvas = can;
     }
     public Exp getX() {
	return xcord;
     }
     public Exp getY() {
	return ycord;
     }
     public Exp getCanvas() {
	return canvas;
     }

    
 
     public Object visit(Visitor v, Object arg) throws Exception
     {
	return v.visitExpRect(this, arg);
     }

     public String toString() {
     	return "Rectange created at xcord: "+xcord.toString()+" ycord: "+ycord.toString();
     }

     
}
