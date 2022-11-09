package kut.compiler.symboltable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import kut.compiler.exception.SyntaxErrorException;
import kut.compiler.parser.ast.AstGlobal;

public class SymbolTable 
{
	protected Map<String, AstGlobal> 	globalVariables		;
	
	/**
	 * 
	 */
	public SymbolTable() {
		globalVariables = new HashMap<String, AstGlobal>();
	}
	
	/**
	 * @param varname
	 * @throws SyntaxErrorException
	 */
	public void addGlobalVariable(AstGlobal gvar) 
	{
		String varname = gvar.getVarName().getIdentifier();
		globalVariables.put(varname, gvar);
	}
	
	/**
	 * @param id
	 * @return
	 */
	public SymbolType getSymbolType(String id)
	{

		if (globalVariables.containsKey(id)) {
			return SymbolType.GlobalVariable; 
		}
		
		return SymbolType.Unknown;
	}
	
	/**
	 * @return
	 */
	public List<String> getGlobalVariables()
	{
		return new LinkedList<String>(globalVariables.keySet());
	}
	

	/**
	 * 
	 */
	public void printGlobalVariables() 
	{	
		System.out.println("the list of global variables");
		for (String id: globalVariables.keySet()) {
			System.out.println(id + ":" + globalVariables.get(id));
		}
	}
	
}
