/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */
	
public class ExpBool extends Exp {

	String val;

	public ExpBool(String v) {
		val = v;
	}

    public String getVal() {
		return val;
    }

    public Object visit(Visitor v, Object arg) throws Exception
    {
		return v.visitExpBool(this, arg);
    }

	public String toString() {
		return val;
	}
}


	