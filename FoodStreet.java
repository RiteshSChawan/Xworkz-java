class FoodStreet {
	int foodId;
	String foodName;
	String cuisine;
	double price;
	boolean isVeg;
	
	public FoodStreet(int foodId, String foodName, String cuisine, double price, boolean isVeg) {
		this.foodId = foodId;
		this.foodName = foodName;
		this.cuisine = cuisine;
		this.price = price;
		this.isVeg = isVeg;
	}
	
	public void getFoodStreetDetails() {
		System.out.println("FoodId: " + foodId);
		System.out.println("FoodName: " + foodName);
		System.out.println("Cuisine: " + cuisine);
		System.out.println("Price: " + price);
		System.out.println("IsVeg: " + isVeg);
	}
}