class Coffee {
	int coffeeId;
	String coffeeName;
	String type;
	double price;
	boolean isHot;

	public Coffee(int coffeeId, String coffeeName, String type, double price, boolean isHot) {
		this.coffeeId = coffeeId;
		this.coffeeName = coffeeName;
		this.type = type;
		this.price = price;
		this.isHot = isHot;
	}
	
	public void getCoffeeDetails() {
		System.out.println("CoffeeId: " + coffeeId);
		System.out.println("CoffeeName: " + coffeeName);
		System.out.println("Type: " + type);
		System.out.println("Price: " + price);
		System.out.println("IsHot: " + isHot);
	}
}