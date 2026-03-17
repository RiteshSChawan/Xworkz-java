class Application {
	int appId;
	String appName;
	String category;
	double rating;
	boolean isFree;
	
	public Application(int appId, String appName, String category, double rating, boolean isFree) {
		this.appId = appId;
		this.appName = appName;
		this.category = category;
		this.rating = rating;
		this.isFree = isFree;
	}
	
	public void getApplicationDetails() {
		System.out.println("App Id: " + appId);
		System.out.println("App Name: " + appName);
		System.out.println("Category: " + category);
		System.out.println("Rating: " + rating);
		System.out.println("Free: " + isFree);
	}
}
