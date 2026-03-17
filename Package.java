class Package {
	int packageId;
	String packageName;
	String destination;
	double price;
	int durationDays;
	
	public Package(int packageId, String packageName, String destination, double price, int durationDays) {
		this.packageId = packageId;
		this.packageName = packageName;
		this.destination = destination;
		this.price = price;
		this.durationDays = durationDays;
	}
	
	public void getPackageDetails() {
		System.out.println("PackageId: " + packageId);
		System.out.println("PackageName: " + packageName);
		System.out.println("Destination: " + destination);
		System.out.println("Price: " + price);
		System.out.println("DurationDays: " + durationDays);
	}
}