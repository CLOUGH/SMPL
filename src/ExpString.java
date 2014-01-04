/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

public class ExpString extends Exp {

    String str;

    public ExpString(String id) {
	str = id;
    }

    public String getString() {
	return str;
    }

    public Object visit(Visitor v, Object arg)
    throws Exception
    {
	return v.visitExpString(this, arg);
    }

    public String toString() {
	return str;
    }
}


	
