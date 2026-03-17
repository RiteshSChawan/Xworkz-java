class Salon {
	int salonId;
	String salonName;
	String location;
	int staffCount;
	boolean isUnisex;
	Service service;
	
	public Salon(int salonId, String salonName, String location, int staffCount, boolean isUnisex, Service service) {
		this.salonId = salonId;
		this.salonName = salonName;
		this.location = location;
		this.staffCount = staffCount;
		this.isUnisex = isUnisex;
		this.service = service;
	}
	
	public void getSalonDetails() {
		System.out.println("Salon Details:");
		System.out.println("SalonId: " + salonId);
		System.out.println("SalonName: " + salonName);
		System.out.println("Location: " + location);
		System.out.println("StaffCount: " + staffCount);
		System.out.println("IsUnisex: " + isUnisex);
		this.service.getServiceDetails();
		System.out.println("----------------");
	}
}