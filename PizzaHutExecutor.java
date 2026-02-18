class PizzaHutExecutor{

	public static void main(String[] args){
	String foodName = "VegCheesePockets";
	double price		= PizzaHut.search(foodName);
	System.out.println("The price of "+foodName+" is : "+price);
	}

}