package kut.compiler.parser.ast;

import java.io.IOException;

import kut.compiler.compiler.CodeGenerator;
import kut.compiler.exception.CompileErrorException;

public class AstProgram extends AstNode 
{

	
	/**
	 * child node
	 */
	protected AstNode child;
	
	/**
	 * @param node
	 * @param platform
	 */
	public AstProgram(AstNode child)
	{
		this.child = child;
	}

	/**
	 *
	 */
	public void printTree(int indent) {
		this.println(indent, "program:");
		child.printTree(indent + 1);
	}


	/**
	 *
	 */
	@Override
	public void cgen(CodeGenerator gen) throws IOException, CompileErrorException
	{

		//body of the code
		this.child.cgen(gen);
				
		return;
	}
	
	/**
	 *
	 */
	public void preprocessGlobalVariables(CodeGenerator gen) 
	{
		this.child.preprocessGlobalVariables(gen);
	}

}
