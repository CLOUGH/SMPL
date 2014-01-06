/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */


public interface Visitor {

    // program
    public Object visitArithProgram(ArithProgram p,
				    Object arg)
	throws Exception;

    // statements
    public Object visitStatement(Statement exp, Object arg)
	throws Exception ;
    public Object visitStmtSequence(StmtSequence exp,
				    Object arg)
	throws Exception ;
    public Object visitStmtDefinition(StmtDefinition sd,
				      Object arg)
	throws Exception;

    // expressions
    public Object visitExpAdd(ExpAdd exp, Object arg)
	throws Exception ;
    public Object visitExpSub(ExpSub exp, Object arg)
	throws Exception;
    public Object visitExpMul(ExpMul exp, Object arg)
	throws Exception;
    public Object visitExpDiv(ExpDiv exp, Object arg)
	throws Exception;
    public Object visitExpMod(ExpMod exp, Object arg)
	throws Exception;
    public Object visitExpLit(ExpLit exp, Object arg)
	throws Exception;
    public Object visitExpVar(ExpVar exp, Object arg)
	throws Exception;
    public Object visitExpGreater(ExpGreater exp, Object arg)
         throws Exception;
    public Object visitExpLess(ExpLess exp, Object arg)
         throws Exception;
    public Object visitExpGreaterEq(ExpGreaterEq exp, Object arg)
         throws Exception;
    public Object visitExpLessEq(ExpLessEq exp, Object arg)
         throws Exception;
    public Object visitExpEqual(ExpEqual exp, Object arg)
         throws Exception;
    public Object visitExpNotEq(ExpNotEq exp, Object arg)
         throws Exception;
    public Object visitExpAnd(ExpAnd exp, Object arg)
         throws Exception;
    public Object visitExpNot(ExpNot exp, Object arg)
         throws Exception;
    public Object visitExpBool(ExpBool exp, Object arg)
         throws Exception;
    public Object visitExpOr(ExpOr exp, Object arg)
         throws Exception;
    public Object visitExpIf(ExpIf exp, Object arg)
         throws Exception;
    public Object visitExpIfElse(ExpIfElse exp, Object arg)
         throws Exception;
    public Object visitCaseSequence(CaseSequence exp, Object arg)
         throws Exception;
    public Object visitCase(Case exp, Object arg)
         throws Exception;
    public Object visitExpPrint(ExpPrint exp, Object arg)
         throws Exception;
    public Object visitExpPrintLn(ExpPrintLn exp, Object arg)
	 throws Exception;
    public Object visitExpSequence(ExpSequence exp, Object arg)
         throws Exception;
    public Object visitLetDef(LetDef exp, Object arg)
         throws Exception;
    public Object visitBindSequence(BindSequence exp, Object arg)
         throws Exception;
    public Object visitExpLet(ExpLet exp, Object arg)
         throws Exception;
    public Object visitProcDef(ProcDef exp, Object arg)
         throws Exception;
    public Object visitProcCall(ProcCall exp, Object arg)
         throws Exception;
    public Object visitVarProcCall(VarProcCall exp, Object arg)
         throws Exception;
    public Object visitExpPair(ExpPair exp, Object arg)
         throws Exception;
    public Object visitExpCar(ExpCar exp, Object arg)
         throws Exception;
    public Object visitExpList(ExpList exp, Object arg)
         throws Exception;
    public Object visitExpCanvas(ExpCanvas exp, Object arg)
	 throws Exception;
    public Object visitExpRect(ExpRect exp, Object arg)
	 throws Exception;
    public Object visitExpPt(ExpPt exp, Object arg)
	 throws Exception;
    public Object visitExpCircle(ExpCircle exp, Object arg)
	 throws Exception;
    public Object visitExpCdr(ExpCdr exp, Object arg)
         throws Exception;
    public Object visitExpPairQ(ExpPairQ exp, Object arg)
         throws Exception;
    public Object visitSMPLEqvQ(SMPLEqvQ exp, Object arg)
         throws Exception;
    public Object visitSMPLEqualQ(SMPLEqualQ exp, Object arg)
         throws Exception;
    public Object visitSMPLBinary(SMPLBinary exp, Object arg)
         throws Exception;
    public Object visitSMPLHex(SMPLHex exp, Object arg)
         throws Exception;
    public Object visitSMPLCall(SMPLCall exp, Object arg)
         throws Exception;
    public Object visitStrPrint(StrPrint exp, Object arg)
         throws Exception;
    public Object visitExpChar(ExpChar exp, Object arg)
    	 throws Exception;
    public Object visitExpString(ExpString exp, Object arg)
         throws Exception;

}
	
