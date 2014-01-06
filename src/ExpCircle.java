/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */


public class ExpCircle extends Exp {
     Exp cords;
     Exp number;
     Exp canvas;
    
     public ExpCircle(Exp can, Exp crds, Exp nbr)
     {
	cords = crds;
	number = nbr;
	canvas = can;
     }
     public Exp getCoords() {
	return cords;
     }
     public Exp getNumber() {
	return number;
     }
     public Exp getCanvas() {
	return canvas;
     }

    
 
     public Object visit(Visitor v, Object arg) throws Exception
     {
	return v.visitExpCircle(this, arg);
     }

     public String toString() {
     	return "Circle created at : "+cords.toString()+" with a radius of: "+number.toString();
     }

     
}
