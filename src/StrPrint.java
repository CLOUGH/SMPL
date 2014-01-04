/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */


public class StrPrint extends Exp {

    String str ;

    public StrPrint(String s) {
	str = s;
    }

    public String getString() {
	return str;
    }


    public Object visit(Visitor v, Object arg) throws Exception
    {
	return v.visitStrPrint(this, arg);
    }

    public String toString() {
	return "print : "+str.toString();
    }
}

	
