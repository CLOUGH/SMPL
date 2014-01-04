/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */
	
import java.util.*;

public class BindSequence extends Exp {

    ArrayList seq;		// sequence of commands

    public BindSequence() {
	seq = new ArrayList();
    }

    public BindSequence(Exp e) {
	this();
	seq.add(e);
    }

    public ArrayList getSeq() {
	return seq;
    }

    public BindSequence add(Exp e) {
		seq.add(e);
		return this;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
		return v.visitBindSequence(this, arg);
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




	