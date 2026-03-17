class NewsPaper {
	int paperid;
	String paperName;
	String language;
	int circulation;
	double pricePerCopy;
	Article article;
	
	public NewsPaper(int paperId, String paperName, String language, int circulation, double pricePerCopy, Article article) {
		this.paperId = paperId;
		this.paperName = paperName;
		this.language = language;
		this.circulation = circulation;
		this.pricePerCopy = pricePerCopy;
		this.article = article;
	}
	
	public void getNewsPaperDetails() {
		System.out.println("NewsPaper Details:");
		System.out.println("Paperid: " + paperid);
		System.out.println("PaperName: " + paperName);
		System.out.println("Language: " + language);
		System.out.println("Circulation: " + circulation);
		System.out.println("PricePerCopy: " + pricePerCopy);
		this.article.getArticleDetails();
		System.out.println("----------------");
	}
}