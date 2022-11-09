package kut.compiler.symboltable;

public enum SymbolType 
{
	Unknown(0),
	GlobalVariable(-1);
	
	int type;
	
	/**
	 * @param type
	 */
	private SymbolType(int type) {
		this.type = type;
	}
	
}
