JFLEX_PATH = lib/JFlex.jar
CUP_PATH = lib/java-cup.jar
 
cup:
	@java -cp $(CUP_PATH) java_cup.Main -parser Parser < src/Parser.cup
	@mv sym.java src
	@mv Parser.java src/
 
jflex:
	@jflex src/Lexer.jflex
 
compile:
	@javac -cp "src:lib/java-cup.jar:lib/JFlex.jar" src/*.java

fcompile:
	@javac -cp "src:lib/java-cup.jar:lib/JFlex.jar" -Xlint:unchecked src/*.java

run:
	@java -cp "src:$(CUP_PATH)" Repl



