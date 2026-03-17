class CafeCoffeeDay {
	int cafeId;
	String branchName;
	String location;
	int seatingCapacity;
	boolean hasWifi;
	Coffee coffee;
	
	public CafeCoffeeDay(int cafeId, String branchName, String location, int seatingCapacity, boolean hasWifi, Coffee coffee) {
		this.cafeId = cafeId;
		this.branchName = branchName;
		this.location = location;
		this.seatingCapacity = seatingCapacity;
		this.hasWifi = hasWifi;
		this.coffee = coffee;
	}
	
	public void getCafeCoffeeDayDetails() {
		System.out.println("CafeCoffeeDay Details:");
		System.out.println("CafeId: " + cafeId);
		System.out.println("BranchName: " + branchName);
		System.out.println("Location: " + location);
		System.out.println("SeatingCapacity: " + seatingCapacity);
		System.out.println("HasWifi: " + hasWifi);
		this.coffee.getCoffeeDetails();
		System.out.println("----------------");
	}
}