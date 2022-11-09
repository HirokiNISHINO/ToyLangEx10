package kut.compiler.parser.ast;


import java.io.IOException;

import kut.compiler.compiler.CodeGenerator;
import kut.compiler.exception.CompileErrorException;
import kut.compiler.lexer.Token;

public class AstIdentifier extends AstNode 
{
	/**
	 * 
	 */
	protected Token t;
	
	/**
	 * @param t
	 */
	public AstIdentifier(Token t)
	{
		this.t = t;
	}

	
	/**
	 * @return
	 */
	public String getIdentifier()
	{
		return t.getL();
	}
	
	/**
	 * @return
	 */
	public Token getToken() {
		return t;
	}
	
	/**
	 *
	 */
	@Override
	protected void printTree(int indent) {
		this.println(indent, "identifier:" + t.getL());
	}

	/**
	 *
	 */
	@Override
	public void cgen(CodeGenerator gen) throws IOException, CompileErrorException
	{	
		gen.printCode("mov rax, [ rel " + gen.getLabelForGlobalVariables(t.getL()) + "]");
	}
	


}
