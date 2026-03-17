class Syntax {
	int syntaxId;
	String keyword;
	String useCase;
	String example;
	boolean isCaseSensitive;
	
	public Syntax(int syntaxId, String keyword, String useCase, String example, boolean isCaseSensitive) {
		this.syntaxId = syntaxId;
		this.keyword = keyword;
		this.useCase = useCase;
		this.example = example;
		this.isCaseSensitive = isCaseSensitive;
	}
	
	public void getSyntaxDetails() {
		System.out.println("SyntaxId: " + syntaxId);
		System.out.println("Keyword: " + keyword);
		System.out.println("UseCase: " + useCase);
		System.out.println("Example: " + example);
		System.out.println("IsCaseSensitive: " + isCaseSensitive);
	}
}