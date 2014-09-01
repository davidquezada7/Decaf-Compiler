make: SCANNER.CLASS PARSER.CLASS lib\Debug.class opt\Algebraic.class opt\ConstantFolding.class codegen\Codegen.class irt\Irt.class semantic\Semantic.class ast\Ast.class parser\CC4Parser.class scanner\Scanner.class Compiler.class
	
Compiler.class: Compiler.java
	javac Compiler.java

scanner\Scanner.class: scanner\Scanner.java
	javac scanner\Scanner.java

parser\CC4Parser.class: parser\CC4Parser.java
	javac parser\CC4Parser.java



SCANNER.CLASS: scanner\SDecaf.g
	java org.antlr.v4.Tool scanner\SDecaf.g
	javac scanner\SDecaf.java

PARSER.CLASS: parser\Decaf.g
	java org.antlr.v4.Tool -lib scanner parser\Decaf.g
	javac parser/Decaf.java


ast\Ast.class: ast\Ast.java
	javac ast\Ast.java

semantic\Semantic.class: semantic\Semantic.java
	javac semantic\Semantic.java

irt\Irt.class: irt\Irt.java
	javac irt\Irt.java

codegen\Codegen.class: codegen\Codegen.java
	javac codegen\Codegen.java

opt\ConstantFolding.class: opt\ConstantFolding.java
	javac opt\ConstantFolding.java

opt\Algebraic.class: opt\Algebraic.java
	javac opt\Algebraic.java

lib\Debug.class: lib\Debug.java
	javac lib\Debug.java

clean:
	del Compiler.class
	del scanner\Scanner.class
	del parser\CC4Parser.class
	del ast\Ast.class
	del semantic\Semantic.class
	del irt\Irt.class
	del codegen\Codegen.class
	del opt\ConstantFolding.class
	del opt\Algebraic.class
	del lib\Debug.class
	del scanner\SDecaf.java
	del scanner\SDecaf.tokens
	del scanner\SDecaf.class
	
	del parser\Decaf.class 
	del parser\Decaf.java
	del parser\Decaf.tokens
	del parser\DecafBaseListener.java
	del parser\DecafListener.class
	del parser\DecafListener.java 