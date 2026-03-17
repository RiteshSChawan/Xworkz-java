class Wonderla {
	int wonderlaId;
	String parkName;
	String location;
	int totalRides;
	double ticketPrice;
	LazyPool lazyPool;

	public Wonderla(int wonderlaId, String parkName, String location, int totalRides, double ticketPrice, LazyPool lazyPool) {
		this.wonderlaId = wonderlaId;
		this.parkName = parkName;
		this.location = location;
		this.totalRides = totalRides;
		this.ticketPrice = ticketPrice;
		this.lazyPool = lazyPool;
	}
	
	public void getWonderlaDetails() {
		System.out.println("Wonderla Details:");
		System.out.println("Wonderla Id: " + wonderlaId);
		System.out.println("Park Name: " + parkName);
		System.out.println("Location: " + location);
		System.out.println("Total Rides: " + totalRides);
		System.out.println("Ticket Price: " + ticketPrice);
		this.lazyPool.getPoolDetails();
		System.out.println("----------------");
	}
}