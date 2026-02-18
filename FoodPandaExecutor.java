class FoodPandaExecutor{

	public static void main(String[] args){
	String foodName = "VegTandoorPlatter";
	double price		= FoodPanda.search(foodName);
	System.out.println("The price of "+foodName+" is : "+price);
	}

}