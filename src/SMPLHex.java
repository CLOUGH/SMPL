/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

public class SMPLHex extends Exp {

    String str;

    public SMPLHex(String s) {
        str = s.substring(2, (s.length()));
    }

    public int getInt() {
	return Integer.parseInt(str,16);
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitSMPLHex(this, arg);
    }

    public String toString() {
        return "#x "+str ;
    }
}


	
