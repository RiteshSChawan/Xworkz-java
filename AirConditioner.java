class AirConditioner {

    String brand;
    String model;
    double price;
    String type;
    double weight;
    String[] colors;
    int warranty;
    boolean working;


    void display() {
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
        System.out.println("Type: "+type);
        System.out.println("Weight: "+weight);

        System.out.println("Colors:");
        for(String color : colors){
            System.out.println(color);
        }

        System.out.println("Warranty: "+warranty);
        System.out.println("Working: "+working);
        System.out.println();
    }
}