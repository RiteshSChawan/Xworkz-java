class TourismAngadi {
	int angadiId;
	String agencyName;
	String location;
	int toursOffered;
	boolean isGovtApproved;
	Package package;
	
	public TourismAngadi(int angadiId, String agencyName, String location, int toursOffered, boolean isGovtApproved, Package package) {
		this.angadiId = angadiId;
		this.agencyName = agencyName;
		this.location = location;
		this.toursOffered = toursOffered;
		this.isGovtApproved = isGovtApproved;
		this.package = package;
	}
	
	public void getTourismAngadiDetails() {
		System.out.println("TourismAngadi Details:");
		System.out.println("AngadiId: " + angadiId);
		System.out.println("AgencyName: " + agencyName);
		System.out.println("Location: " + location);
		System.out.println("ToursOffered: " + toursOffered);
		System.out.println("IsGovtApproved: " + isGovtApproved);
		this.package.getPackageDetails();
		System.out.println("----------------");
	}
}