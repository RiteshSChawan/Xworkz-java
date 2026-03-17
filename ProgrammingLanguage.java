class ProgrammingLanguage {
	int langId;
	String langName;
	String paradigm;
	int releaseYear;
	boolean isOpenSource;
	Syntax syntax;
	
	public ProgrammingLanguage(int langId, String langName, String paradigm, int releaseYear, boolean isOpenSource, Syntax syntax) {
		this.langId = langId;
		this.langName = langName;
		this.paradigm = paradigm;
		this.releaseYear = releaseYear;
		this.isOpenSource = isOpenSource;
		this.syntax = syntax;
	}
	
	public void getProgrammingLanguageDetails() {
		System.out.println("ProgrammingLanguage Details:");
		System.out.println("LangId: " + langId);
		System.out.println("LangName: " + langName);
		System.out.println("Paradigm: " + paradigm);
		System.out.println("ReleaseYear: " + releaseYear);
		System.out.println("IsOpenSource: " + isOpenSource);
		this.syntax.getSyntaxDetails();
		System.out.println("----------------");
	}
}