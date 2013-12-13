public class StrPrint extends Exp {

    String str ;
    int mode;

    public StrPrint(String s,int n) {
	str = s;
        mode = n;
    }

    public String getString() {
	return str;
    }
    public int getMode() {
	return mode;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitStrPrint(this, arg);
    }

    public String toString() {
	return "print : "+str.toString();
    }
}
