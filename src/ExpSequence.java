/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */


import java.util.*;

public class ExpSequence extends Exp {

    ArrayList seq;		

    public ExpSequence() {
	seq = new ArrayList();
    }

    public ExpSequence(Exp e) {
	this();
	seq.add(e);
    }

    public ArrayList getSeq() {
	return seq;
    }

    public ExpSequence add(Exp e) {
	seq.add(e);
	return this;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitExpSequence(this, arg);
    }

    public String toString() {
	Iterator iter = seq.iterator();

	String result = "";
	while (iter.hasNext()) {
	    result = result + iter.next().toString() + "\n";
	}

	return result;
    }

}


	
