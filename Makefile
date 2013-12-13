JFLEX_PATH = lib/JFlex.jar
CUP_PATH = lib/java-cup.jar
 
cup:
	@java -cp $(CUP_PATH) java_cup.Main -parser Parser < Test2/Parser.cup
	@mv sym.java Test2
	@mv Parser.java Test2/
 
jflex:
	@jflex Test2/Lexer
 
compile:
	@javac -cp "Test:lib/java-cup.jar:lib/JFlex.jar" Test2/*.java

fcompile:
	@javac -cp "Test2:lib/java-cup.jar:lib/JFlex.jar" -Xlint:unchecked Test2/*.java

run:
	@java -cp "Test2:$(CUP_PATH)" Repl



