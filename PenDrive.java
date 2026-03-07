class PenDrive {

    String brand;
    double price;
	int capacity;
    String type;
    boolean encrypted;

    String[] colors;
    String[] compatibleDevices;
    String[] vendors;

	void display(){

        System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Capacity: "+capacity);
		System.out.println("Type: "+type);
		System.out.println("Encrypted: "+encrypted);
		
        System.out.println("Colors:");
        for(String color : colors){
            System.out.println(color);
        }

        System.out.println("CompatibleDevices:");
        for(String compatibleDevice : compatibleDevices){
            System.out.println(compatibleDevice);
        }
		
		System.out.println("Vendors:");
        for(String vendor : vendors){
            System.out.println(vendor);
        }

    }
}