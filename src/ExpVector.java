/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

import java.util.*;

public class ExpVector extends Exp {

    ArrayList explist;

    public ExpVector()
    {
	explist = new ArrayList();
    }

    public ExpVector(ArrayList<Exp> args) {
		explist = args;
    }

    public ArrayList getExpVector() {
	return explist;
    }

    public ExpVector add(Statement s) {
	explist.add(s);
	return this;
    }

    
    

    public Object visit(Visitor v, Object arg) throws Exception
    {
    	return v.visitExpVector(this, arg);
    }

    public String toString() {
	Iterator iter = explist.iterator();

	String result = "[:";
	while (iter.hasNext()) {
	    result = result +  iter.next().toString() ;
	    result = result + (iter.hasNext() ? ",": "");
	}
	result = result + ":]";
	return result;
    }
}


