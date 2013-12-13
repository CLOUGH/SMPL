import java.util.*;

public class CaseSequence extends Exp {

    ArrayList seq;		// sequence of commands

    public CaseSequence() {
	seq = new ArrayList();
    }

    public CaseSequence(Case c) {
	this();
	seq.add(c);
    }

    public ArrayList getSeq() {
	return seq;
    }

    public CaseSequence add(Case c) {
	seq.add(c);
	return this;
    }

    public Object visit(Visitor v, Object arg)
	throws Exception
    {
	return v.visitCaseSequence(this, arg);
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

