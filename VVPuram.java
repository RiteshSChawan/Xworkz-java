class VVPuram {
	int vvpuramId;
	String streetName;
	String city;
	int totalStalls;
	boolean isOpenAtNight;
	FoodStreet foodStreet;
	
	public VVPuram(int vvpuramId, String streetName, String city, int totalStalls, boolean isOpenAtNight, FoodStreet foodStreet) {
		this.vvpuramId = vvpuramId;
		this.streetName = streetName;
		this.city = city;
		this.totalStalls = totalStalls;
		this.isOpenAtNight = isOpenAtNight;
		this.foodStreet = foodStreet;
	}
	
	public void getVVPuramDetails() {
		System.out.println("VVPuram Details:");
		System.out.println("VvpuramId: " + vvpuramId);
		System.out.println("StreetName: " + streetName);
		System.out.println("City: " + city);
		System.out.println("TotalStalls: " + totalStalls);
		System.out.println("IsOpenAtNight: " + isOpenAtNight);
		this.foodStreet.getFoodStreetDetails();
		System.out.println("----------------");
	}
}