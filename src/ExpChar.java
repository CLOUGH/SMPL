/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

public class ExpChar extends Exp {

    String str;

    public ExpChar(String id) {
		str = id;
    }

    public String getChar() {
		return str;
    }

    public Object visit(Visitor v, Object arg)
    throws Exception
    {
	return v.visitExpChar(this, arg);
    }

    public String toString() {
	return str;
    }
}
