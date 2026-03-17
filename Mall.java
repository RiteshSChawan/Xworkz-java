class Mall{

	int mallId;
	String mallName;
	String location;
	int floors;
	boolean parkingAvailable;
	Shop shop;

	public Mall(int mallId, String mallName, String location, int floors, boolean parkingAvailable, Shop shop) {
		this.mallId = mallId;
		this.mallName = mallName;
		this.location = location;
		this.floors = floors;
		this.parkingAvailable = parkingAvailable;
		this.shop = shop;
	}

	public void getMallDetails(){
		System.out.println("Mall Details:");
		System.out.println("Mall Id: "+mallId);
		System.out.println("Mall Name: "+mallName);
		System.out.println("Location: "+location);
		System.out.println("Floors: "+floors);
		System.out.println("Parking: "+parkingAvailable);
		this.shop.getShopDetails();
		System.out.println("--------------");
	}
}