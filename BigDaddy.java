class BigDaddy {
	int bigDaddyId;
	String bigDaddyName;
	String location;
	int capacity;
	double entryFee;
	Cassino cassino;
	
	public BigDaddy(int bigDaddyId, String bigDaddyName, String location, int capacity, double entryFee, Cassino cassino) {
		this.bigDaddyId = bigDaddyId;
		this.bigDaddyName = bigDaddyName;
		this.location = location;
		this.capacity = capacity;
		this.entryFee = entryFee;
		this.cassino = cassino;
	}
	
	public void getBigDaddyDetails() {
		System.out.println("BigDaddy Details:");
		System.out.println("BigDaddy Id: " + bigDaddyId);
		System.out.println("BigDaddy Name: " + bigDaddyName);
		System.out.println("Location: " + location);
		System.out.println("Capacity: " + capacity);
		System.out.println("Entry Fee: " + entryFee);
		this.cassino.getCassinoDetails();
		System.out.println("----------------");
	}
}