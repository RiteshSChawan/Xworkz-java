class Article {
	int articleId;
	String headline;
	String category;
	String author;
	boolean isBreakingNews;
	
	public Article(int articleId, String headline, String category, String author, boolean isBreakingNews) {
		this.articleId = articleId;
		this.headline = headline;
		this.category = category;
		this.author = author;
		this.isBreakingNews = isBreakingNews;
	}
	
	public void getArticleDetails() {
		System.out.println("ArticleId: " + articleId);
		System.out.println("Headline: " + headline);
		System.out.println("Category: " + category);
		System.out.println("Author: " + author);
		System.out.println("IsBreakingNews: " + isBreakingNews);
	}
}