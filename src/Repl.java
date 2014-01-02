/*  Stewart, Ricardo
    Campbell, Shane
	Clough, Warren
	Miller, Sean  */

import java_cup.runtime.*;
import java.io.*;

public class Repl {

    public static final String PROMPT = ">";

    public static void main(String args[]) {
	repl(System.in, new Environment());
    }

    public static void repl(InputStream is,
			    Environment env){
	while (true) {
	    parseEvalShow(is, env);
	}
    }

    public static void parseEvalShow(InputStream is, Environment env) {
        Parser parser;
	ArithProgram program = null;
	Evaluator interp = new Evaluator();
	System.out.print(PROMPT);
	try {
	    parser = new Parser(new Lexer(is));
	    program = (ArithProgram) parser.parse().value;
	} catch (Exception e) {
	    System.out.println("Parse Error: " + e.getMessage());
	}

	if (program != null)
            
	    try {
		Object result;
		result = program.visit(interp, env);
		System.out.println("\nResult: " + result);

	    } catch (Exception e) {
                System.out.println(e.getMessage());
	    }
    }

}


	
