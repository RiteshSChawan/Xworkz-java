class Bun {

    String brand;
    double price;
    String type;
    double weight;
    String flavor;
    boolean fresh;
    int quantity;
    String shape;
    String bakery;
    int expiryDays;
    String[] outlets;
	String[] ingredients;


    void display(){

        System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Type: "+type);
		System.out.println("Weight: "+weight);
		System.out.println("Flavor: "+flavor);
		System.out.println("Fresh: "+fresh);
		System.out.println("Quantity: "+quantity);
		System.out.println("Shape: "+shape);
		System.out.println("Bakery: "+bakery);
		System.out.println("ExpiryDays: "+expiryDays);
		
        System.out.println("Outlets:");
        for(String outlet : outlets){
            System.out.println(outlet);
        }

        System.out.println("Ingredients:");
        for(String ingredient : ingredients){
            System.out.println(ingredient);
        }

    }
}