/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

public abstract class Exp {

    public abstract Object visit(Visitor v, Object arg)
	throws Exception ;

    public abstract String toString();
}

	