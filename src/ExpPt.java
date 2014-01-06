/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

public class ExpPt extends Exp {

    Exp pointx, pointy;

    public ExpPt(Exp e1,Exp e2) {
        pointx = e1;
        pointy = e2;
    }

    public Exp getPointX() {
	return pointx;
    }
    public Exp getPointY() {
	return pointy;
    }

    public Object visit(Visitor v, Object arg) throws Exception
    {
	return v.visitExpPt(this, arg);
    }

    public String toString() {
        return "("+pointx.toString()+","+pointy.toString()+")" ;
    }
    
  
}
	
