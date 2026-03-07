class HappyDent {

    String brand;
    String flavor;
    double price;
    int quantity;
    boolean sugarFree;
    String manufacturer;

    String[] ingredients;
    String[] outlets;

	void display(){

        System.out.println("Brand: "+brand);
		System.out.println("Flavor: "+flavor);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantity);
		System.out.println("SugarFree: "+sugarFree);
		System.out.println("Manufacturer: "+manufacturer);
		
        System.out.println("Ingredients:");
        for(String ingredient : ingredients){
            System.out.println(ingredient);
        }

        System.out.println("Outlets:");
        for(String outlet : outlets){
            System.out.println(outlet);
        }

    }
}