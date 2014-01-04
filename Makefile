JFLEX_PATH = lib/JFlex.jar
CUP_PATH = lib/java-cup.jar
LEXER_PATH = 	src/Lexer.jflex
cup:
	@java -cp $(CUP_PATH) java_cup.Main -parser Parser < src/Parser.cup
	@mv sym.java src
	@mv Parser.java src/
 
jflex:
	@echo "Generating Lexer"
	@java -cp $(JFLEX_PATH) JFlex.Main --nobak $(LEXER_PATH)
	@echo "Done"
 
compile:
	@echo "Generating Parser and Symbol file"
	@javac -cp ":$(CUP_PATH):$(JFLEX_PATH)" src/*.java
	@echo "Done."

fcompile:
	@javac -cp ":$(CUP_PATH):$(JFLEX_PATH)" -Xlint:unchecked src/*.java

run:
	@java -cp "src:$(CUP_PATH)" Repl



