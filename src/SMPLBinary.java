/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

public class SMPLBinary extends Exp {

    String str;

    public SMPLBinary(String s) {
        str = s.substring(2, (s.length()));
    }

    public int getInt() {
	return Integer.parseInt(str,2);
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitSMPLBinary(this, arg);
    }

    public String toString() {
        return "#b "+str ;
    }
}


	
