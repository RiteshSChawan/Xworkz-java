class SwiggyExecutor{

	public static void main(String[] args){
	String foodName = "AlooParatha";
	double price		= Swiggy.search(foodName);
	System.out.println("The price of "+foodName+" is : "+price);
	}

}