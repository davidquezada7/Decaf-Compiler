make: lib\Debug.class opt\Algebraic.class opt\ConstantFolding.class SCANNER.CLASS PARSER.CLASS scanner\Scanner.class parser\CC4Parser.class ast\AstVisitor.class ast\Ast.class semantic\Semantic.class irt\Irt.class codegen\Codegen.class Compiler.class
	
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
	java org.antlr.v4.Tool -lib scanner -visitor parser\Decaf.g
	javac parser\Decaf.java

ast\AstVisitor.class: ast\AstVisitor.java
	javac ast\AstVisitor.java

ast\Ast.class: ast\Ast.java
	javac ast\AstVisitor.java
	javac ast\Ast.java
	javac ast\Root.java


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
	del scanner\*.class
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
	

	del parser\Decaf.java
	del parser\DecafBaseListener.java
	del parser\DecafListener.java
	del parser\DecafVisitor.java
	del parser\DecafBaseVisitor.java 

	del parser\*.class parser\*~ parser\*.tokens

	del ast\AstVisitor.class
	del ast\Node.class
	del ast\Root.class
	del ast\*.class