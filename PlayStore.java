class PlayStore {
	int playStoreId;
	String storeName;
	String region;
	int totalApps;
	double revenue;
	Application application;

	public PlayStore(int playStoreId, String storeName, String region, int totalApps, double revenue, Application application) {
		this.playStoreId = playStoreId;
		this.storeName = storeName;
		this.region = region;
		this.totalApps = totalApps;
		this.revenue = revenue;
		this.application = application;
	}
	
	public void getPlayStoreDetails() {
		System.out.println("PlayStore Details:");
		System.out.println("PlayStore Id: " + playStoreId);
		System.out.println("Store Name: " + storeName);
		System.out.println("Region: " + region);
		System.out.println("Total Apps: " + totalApps);
		System.out.println("Revenue (Cr): " + revenue);
		this.application.getApplicationDetails();
		System.out.println("----------------");
	}
}