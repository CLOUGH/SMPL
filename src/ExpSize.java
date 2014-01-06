/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

import java.util.*;

public class ExpSize extends Exp {

    ArrayList explist;

    public ExpSize()
    {
	explist = new ArrayList();
    }

    public ExpSize(ArrayList args) {
		explist = args;
    }

    public ArrayList getExpVector() {
	return explist;
    }
    
    public Integer getSize()
    {
	return explist.size();
    }

   

    
    

    public Object visit(Visitor v, Object arg) throws Exception
    {
    	return v.visitExpSize(this, arg);
    }

    public String toString() {
	return ""+getSize();
    }
}


