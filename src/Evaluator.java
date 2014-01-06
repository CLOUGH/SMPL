/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */
	
import java.util.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.*;

import javax.swing.*;
//import java.swing.JFrame;
//import javax.swing.SwingUtilities;

public class Evaluator implements Visitor {
    
    protected Object result;	
    JFrame frame = new JFrame();
    public Evaluator() {
	
		result = null;
    }

    public Object visitArithProgram(ArithProgram p,
				    Object arg)
	throws Exception 
    {
		result = (Object) p.getSeq().visit(this, arg);
		return result;
    }

    

    public Object visitExpCanvas(ExpCanvas exp, Object arg) throws Exception
    {
	int wid, hgt;
        wid = (Integer) exp.getWidth().visit(this, arg);    
        hgt = (Integer) exp.getHeight().visit(this, arg);
        frame.setSize(new Dimension(wid, hgt));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        return frame;
    }

   

    public Object visitExpRect(ExpRect exp, Object arg) throws Exception
    {
	final int x, y, hgt, wid;
        x = (Integer) exp.getX().visit(this, arg);
        y = (Integer) exp.getY().visit(this, arg);
        ExpPair canv = (ExpPair) exp.getCanvas();
        
        
        hgt = (Integer) canv.getExpL().visit(this, arg);
        wid = (Integer) canv.getExpR().visit(this, arg);
        
        frame.setSize(new Dimension(wid, hgt));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel panel = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawRect(x,y,wid/2,hgt/2);
            }
        };
        
        frame.add(panel);
        frame.validate();
        frame.repaint();
        return null;
    }

    public Object visitExpPt(ExpPt exp, Object arg) throws Exception
    {
	return exp;
    }

    public Object visitExpCircle(ExpCircle exp, Object arg) throws Exception
    {
 	final int x, y, hgt, wid, radius;
	radius = (Integer) exp.getNumber().visit(this, arg);
	ExpPt coordinates = (ExpPt) exp.getCoords();
	x = (Integer) coordinates.getPointX().visit(this, arg);
	y = (Integer) coordinates.getPointY().visit(this, arg);

	ExpPair canv = (ExpPair) exp.getCanvas();
        
        
        hgt = (Integer) canv.getExpL().visit(this, arg);
        wid = (Integer) canv.getExpR().visit(this, arg);

	frame.setSize(new Dimension(wid, hgt));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel panel = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawOval(x,y,radius, radius);
            }
        };
        
        frame.add(panel);
        frame.validate();
        frame.repaint();
        return null;
	
    }

    public Object visitStatement(Statement s, Object arg)
	throws Exception
    {
		return s.getExp().visit(this, arg);
    }

    public Object visitStmtSequence(StmtSequence sseq,
				    Object arg)
	throws Exception
    {
		
		Statement s;
		ArrayList seq = sseq.getSeq();
		Iterator iter = seq.iterator();
		Object result = null;
		while(iter.hasNext()) {
			s = (Statement) iter.next();
			result = s.visit(this, arg);
		}
		return result;
    }

    public Object visitStmtDefinition(StmtDefinition sd,
				      Object arg)
	throws Exception
    {
		Environment env = (Environment) arg;
		Object result;
		result = (Object) sd.getExp().visit(this, env);
       
        	env.put(sd.getVar(), result);
		return result;
    }
    public Object visitExpLess(ExpLess exp, Object arg) throws Exception {

        Integer val1, val2;
		val1 = (Integer) exp.getExpL().visit(this, arg);
		val2 = (Integer) exp.getExpR().visit(this, arg);

        if(val1.intValue() < val2.intValue())
        {
            return "#t";
        }
        else
        {
            return "#f";
        }
    }

    public Object visitExpGreaterEq(ExpGreaterEq exp, Object arg) throws Exception {
        Integer val1, val2;
		val1 = (Integer) exp.getExpL().visit(this, arg);
		val2 = (Integer) exp.getExpR().visit(this, arg);

        if(val1.intValue() >= val2.intValue())
        {
            return "#t";
        }
        else
        {
            return "#f";
        }
    }

    public Object visitExpLessEq(ExpLessEq exp, Object arg) throws Exception {
        Integer val1, val2;
		val1 = (Integer) exp.getExpL().visit(this, arg);
		val2 = (Integer) exp.getExpR().visit(this, arg);

        if(val1.intValue() <= val2.intValue())
        {
            return "#t";
        }
        else
        {
            return "#f";
        }
    }

    public Object visitExpEqual(ExpEqual exp, Object arg) throws Exception {
        Integer val1, val2;
		val1 = (Integer) exp.getExpL().visit(this, arg);
		val2 = (Integer) exp.getExpR().visit(this, arg);

        if(val1.intValue() == val2.intValue())
        {
            return "#t";
        }
        else
        {
            return "#f";
        }
    }
    public Object visitExpGreater(ExpGreater exp, Object arg)
	throws Exception
    {
		Integer val1, val2;
		val1 = (Integer) exp.getExpL().visit(this, arg);
		val2 = (Integer) exp.getExpR().visit(this, arg);

        if(val1.intValue() > val2.intValue())
        {
            return "#t";
        }
        else
        {
            return "#f";
        }
    }
    public Object visitExpNotEq(ExpNotEq exp, Object arg) throws Exception {
        Integer val1, val2;
		val1 = (Integer) exp.getExpL().visit(this, arg);
		val2 = (Integer) exp.getExpR().visit(this, arg);

        if(val1.intValue() == val2.intValue())
        {
            return "#f";
        }
        else
        {
            System.out.println("and sol : "+(Integer) exp.getExpR().visit(this, arg));
            return "#t";
        }
    }

    public Object visitExpAnd(ExpAnd exp, Object arg) throws Exception {
        String val1, val2;
        Boolean bool1 = null,bool2 = null;
		val1 = (String) exp.getExpL().visit(this, arg);
		val2 = (String) exp.getExpR().visit(this, arg);

        if(val1.equals("#t"))
        {
            bool1 = true;
        }

        if(val2.equals("#t"))
        {
            bool2 = true;
        }

        if(val1.equals("#f"))
        {
            bool1 = false;
        }

        if(val2.equals("#f"))
        {
            bool2 = false;
        }
        if(bool1 == null || bool2 == null)
        {
            throw new Exception("Can not And these values");
        }
        else
        {
            if(bool1 && bool2)
            {
                return "#t";
            }
            else
            {
                return "#f";
            }
        }
    }

    public Object visitExpNot(ExpNot exp, Object arg) throws Exception {
        String val1;
        Boolean bool1 = null;
		val1 = (String) exp.getExp().visit(this, arg);

        if(val1.equals("#t"))
        {
            bool1 = true;
        }
        if(val1.equals("#f"))
        {
            bool1 = false;
        }
        if(bool1 == null )
        {
            throw new Exception("Can not NOT these values");
        }
        else
        {
            if(bool1)
            {
                return "#f";
            }
            else
            {
                return "#t";
            }
        }
    }
    public Object visitExpAdd(ExpAdd exp, Object arg)
	throws Exception
    {
		Integer val1, val2;
		val1 = (Integer) exp.getExpL().visit(this, arg);
		val2 = (Integer) exp.getExpR().visit(this, arg);
		return new Integer(val1.intValue() + val2.intValue());
    }

    public Object visitExpSub(ExpSub exp, Object arg)
	throws Exception
    {
		Integer val1, val2;
		val1 = (Integer) exp.getExpL().visit(this, arg);
		val2 = (Integer) exp.getExpR().visit(this, arg);
		return new Integer(val1.intValue() - val2.intValue());
    }

    public Object visitExpMul(ExpMul exp, Object arg)
	throws Exception
    {
		Integer val1, val2;
		val1 = (Integer) exp.getExpL().visit(this, arg);
		val2 = (Integer) exp.getExpR().visit(this, arg);
		return new Integer(val1.intValue() * val2.intValue());
    }

    public Object visitExpDiv(ExpDiv exp, Object arg)
	throws Exception
    {
		Integer val1, val2;
		val1 = (Integer) exp.getExpL().visit(this, arg);
		val2 = (Integer) exp.getExpR().visit(this, arg);
		return new Integer(val1.intValue() / val2.intValue());
    }

    public Object visitExpMod(ExpMod exp, Object arg)
	throws Exception
    {
		Integer val1, val2;
		val1 = (Integer) exp.getExpL().visit(this, arg);
		val2 = (Integer) exp.getExpR().visit(this, arg);
		return new Integer(val1.intValue() % val2.intValue());
    }

    public Object visitExpLit(ExpLit exp, Object arg)
	throws Exception
    {
		return new Integer(exp.getVal());
    }

    public Object visitExpVar(ExpVar exp, Object arg)
	throws Exception
    {
		
		Environment env = (Environment) arg;
		Object val = env.get(exp.getVar());
		return val;
    }

    public Object visitExpBool(ExpBool exp, Object arg) throws Exception {
        return exp.getVal();
    }

    public Object visitExpOr(ExpOr exp, Object arg) throws Exception {
        String val1, val2;
        Boolean bool1 = null,bool2 = null;

        val1 = (String) exp.getExpL().visit(this, arg);
        val2 = (String) exp.getExpR().visit(this, arg);

        if(val1.equals("#t"))
        {
            bool1 = true;
        }

        if(val2.equals("#t"))
        {
            bool2 = true;
        }

        if(val1.equals("#f"))
        {
            bool1 = false;
        }

        if(val2.equals("#f"))
        {
            bool2 = false;
        }
        if(bool1 == null && bool2 == null)
        {
            throw new Exception("Can not Or these values");
        }
        else
        {
            if(bool1 || bool2)
            {
                return "#t";
            }
            else
            {
                return "#f";
            }
        }
	
    }

    public Object visitExpIf(ExpIf exp, Object arg) throws Exception {
        String val1;
        Boolean bool1 = null;

        val1 = (String) exp.getExpIf().visit(this, arg);

        if(val1.equals("#t"))
        {
            bool1 = true;
        }

        if(val1.equals("#f"))
        {
            bool1 = false;
        }
        if(bool1 == null )
        {
            throw new Exception("Can not And these values");
        }
        else
        {
            if(bool1 )
            {
                return exp.getExpThen().visit(this, arg);
            }
            else
            {
                return "#f";
            }

        }
    }

    public Object visitExpIfElse(ExpIfElse exp, Object arg) throws Exception {
        String val1;
        Boolean bool1 = null;

        val1 = (String) exp.getExpIf().visit(this, arg);

        if(val1.equals("#t"))
        {
            bool1 = true;
        }

        if(val1.equals("#f"))
        {
            bool1 = false;
        }
        if(bool1 == null )
        {
            throw new Exception("Can not And these values");
        }
        else
        {
            if(bool1 )
            {
                return exp.getExpThen().visit(this, arg);
            }
            else
            {
                return exp.getExpElse().visit(this, arg);
            }
        }
    }

    public Object visitCaseSequence(CaseSequence cseq, Object arg) throws Exception {
		// remember that arg is the environment
		Case c;
		ArrayList seq = cseq.getSeq();
		Iterator iter = seq.iterator();
		Object result = null; // default result
		while(iter.hasNext()) {
			c = (Case) iter.next();
			result = c.visit(this, arg);

				if(result != null)
				{
					return result;
				}
		}
		// return last value evaluated
		return result;
    }

    public Object visitCase(Case exp, Object arg) throws Exception {
        String val1;
        Boolean bool1 = null;

        val1 = (String) exp.getExpPred().visit(this, arg);

        if(val1.equals("#t"))
        {
            bool1 = true;
        }

        if(val1.equals("#f"))
        {
            bool1 = false;
        }
        if(bool1 == null )
        {
            throw new Exception("Can not And these values");
        }
        else
        {
            if(bool1)
            {
                return exp.getExpConc().visit(this, arg);
            }
            else
            {
                return null;
            }

        }
    }
    public Object visitExpPrint(ExpPrint exp, Object arg) throws Exception {  
        System.out.print(""+exp.getExp().visit(this, arg));
        return null;
    }
	
    public Object visitExpPrintLn(ExpPrintLn exp, Object arg) throws Exception {
        System.out.println(""+exp.getExp().visit(this, arg));
        return null;
    }

    public Object visitExpSequence(ExpSequence eseq, Object arg) throws Exception {
		
		Exp e;
		ArrayList seq = eseq.getSeq();
		Iterator iter = seq.iterator();
		Object result = null; 
		while(iter.hasNext()) {
			e = (Exp) iter.next();
			result = e.visit(this, arg);

			}
		return result;
    }

    public Object visitExpList(ExpList elist, Object arg) throws Exception {
    	return elist.toString();
    }

    public Environment visitLetDef(LetDef def, Object arg) throws Exception {

        Environment env = new Environment();
		Object result;
		result = def.getExp().visit(this, arg);
		env.put(def.getVar(), result);

		return env;
    }
    public Object visitBindSequence(BindSequence bseq, Object arg) throws Exception {
        Exp e;
		ArrayList seq = bseq.getSeq();
		Iterator iter = seq.iterator();
		Object result = null; 
		while(iter.hasNext()) {
			e = (Exp) iter.next();
			result = e.visit(this, arg);

        }
		
		return result;

		
    }
	
    public Object visitExpLet(ExpLet exp, Object arg) throws Exception {

        Environment env;
        env = (Environment) exp.getList().visit(this, arg);
        
        Object result = exp.getExpR().visit(this, env);
        System.out.println("Reached ExpLet");
        return result;

    
    }
    public Object visitProcDef(ProcDef exp, Object arg) throws Exception {
		exp.addEnv(arg);
        return exp;
    }
    public Object visitProcCall(ProcCall exp, Object arg) throws Exception {
        Environment env = new Environment();
        Environment curEnv = (Environment) arg;

		Exp[] args;
		String[] paras;
		
	  	ProcDef proc = (ProcDef) curEnv.get(exp.getProcName());
	  	paras = proc.getParams();
	 	//args = exp.getList();
	 	args = exp.getArgExps();
	  	if(paras.length != args.length)
	  	{
		  System.out.println("param : "+paras.length);
		  System.out.println("args : "+args.length);
		  throw new Exception("Invalid Var Proc Call");
	 	}
	  	for(int i = 0;i<paras.length;i++)
	  	{
			curEnv.put(paras[i], args[i].visit(this, arg));

	  	}
	  	//env = new HPLMacroBindings();
	  	return proc.getExp().visit(this, curEnv);
		
    }
    public Object visitVarProcCall(VarProcCall exp, Object arg) throws Exception {
        return null;
    }
    public Object visitExpPair(ExpPair exp, Object arg) throws Exception {
     
        return exp;

    }
    public Object visitExpCdr(ExpCdr exp, Object arg) throws Exception {

        ExpPair p = (ExpPair) exp.getExp().visit(this, arg);

        return p.getExpR().visit(this, arg);


    }
	
	public Object visitExpCar(ExpCar exp, Object arg) throws Exception {
        ExpPair p = (ExpPair) exp.getExp().visit(this, arg);
        return p.getExpL().visit(this, arg);
    }
	
    public Object visitExpPairQ(ExpPairQ exp, Object arg) throws Exception {
        try
        {
            ExpPair p = (ExpPair) exp.getExp();
            return "#t";
        }
        catch(Exception e)
        {
            return "#f";
        }
    }
    public Object visitSMPLEqvQ(SMPLEqvQ exp, Object arg) throws Exception {
        Object val1 = exp.getExpL().visit(this, arg);
        Object val2 = exp.getExpR().visit(this, arg);
        if(val1 == val2)
        {
            return "#t";
        }
        else
        {
            return "#f";
        }
    }
    public Object visitSMPLEqualQ(SMPLEqualQ exp, Object arg) throws Exception {

        Object val1 = exp.getExpL().visit(this, arg);
        Object val2 = exp.getExpR().visit(this, arg);

        if(val1.equals(val2))
        {
            return "#t";
        }
        else
        {
            return "#f 1 "+val1+" 2 "+val2;
        }

    }
    public Object visitSMPLBinary(SMPLBinary exp, Object arg) throws Exception {
        return exp.getInt();
    }
    public Object visitSMPLHex(SMPLHex exp, Object arg) throws Exception {
        return exp.getInt();
    }
    public Object visitSMPLCall(SMPLCall exp, Object arg) throws Exception {
        Environment env = new Environment();
		StmtSequence seq = new StmtSequence();

		Exp[] args;
		String[] paras;

		ProcDef proc = (ProcDef) exp.getExp().visit(this, arg);
		paras = proc.getParams();
		args = exp.getList();
		if(paras.length != args.length)
		{
          throw new Exception("Invalid Proc Call");
		}
		for(int i = 0;i<paras.length;i++)
		{
			env.put(paras[i], args[i].visit(this, arg));

		}
		
		return proc.getExp().visit(this, env);
    }
    public Object visitStrPrint(StrPrint exp, Object arg) throws Exception {
        
        System.out.print(""+exp.getString());
        return null;
    }

	public Object visitExpChar(ExpChar exp, Object arg) throws Exception {	
		Character val = exp.getChar();
		return val;
	}
    public Object visitExpString(ExpString exp, Object arg) throws Exception
    {
    	String val = exp.getString();
		return val;
    }
}



	
