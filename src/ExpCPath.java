/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

import java.util.*;

public class ExpCPath extends Exp {

    Exp canvas;
    ArrayList<ExpPair> listpts;

    public ExpCPath(Exp can, ArrayList<ExpPair> lstpts) {
        canvas = can;
        listpts = lstpts;
    }

    public Exp getCanvas() {
	return canvas;
    }
    public ArrayList<ExpPair> getPoints() {
	return listpts;
    }

    public Object visit(Visitor v, Object arg) throws Exception
    {
    	return v.visitExpCPath(this, arg);
    }

    public String toString() {
	Iterator iter = listpts.iterator();

	String result = "[";
	while (iter.hasNext()) {
	    result = result +  iter.next().toString() ;
	    result = result + (iter.hasNext() ? ",": "");
	}
	result = result + "]";
	return result;
    }
    
  
}
