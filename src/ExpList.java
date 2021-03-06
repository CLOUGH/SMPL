/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

import java.util.*;

public class ExpList extends Exp {

    ArrayList explist;

    public ExpList()
    {
	explist = new ArrayList();
    }

    public ExpList(ArrayList<Exp> args) {
		explist = args;
    }

    public ArrayList getExpList() {
	return explist;
    }

    public ExpList add(Statement s) {
	explist.add(s);
	return this;
    }

    
    

    public Object visit(Visitor v, Object arg) throws Exception
    {
    	return v.visitExpList(this, arg);
    }

    public String toString() {
	Iterator iter = explist.iterator();

	String result = "[";
	while (iter.hasNext()) {
	    result = result +  iter.next().toString() ;
	    result = result + (iter.hasNext() ? ",": "");
	}
	result = result + "]";
	return result;
    }
}


