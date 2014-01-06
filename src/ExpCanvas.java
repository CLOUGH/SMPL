/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

public class ExpCanvas extends Exp {
    Exp width;
    Exp height;

    public ExpCanvas(Exp wd, Exp hgt)
    {
	width = wd;
	height = hgt;
    }
    public Exp getWidth() {
	return width;
    }
    public Exp getHeight() {
	return height;
    }
    public Object visit(Visitor v, Object arg) throws Exception
    {
	return v.visitExpCanvas(this, arg);
    }
    public String toString() {
	return "("+width.toString()+","+height.toString()+")";
	
    }

	
}
