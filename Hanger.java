class Hanger {

    int id;
    String brand;
    double price;
    String color;
    int width;
    double loadCapacity;
    String material;
    int weight;
    String type;
    boolean nonSlip;
    String size;
    String country;

    Hanger(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    Hanger(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Hanger(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    Hanger(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

    Hanger(int width, double x) {
        this.width = width;
        System.out.println("Width : " + width);
    }

    Hanger(double loadCapacity, boolean x) {
        this.loadCapacity = loadCapacity;
        System.out.println("LoadCapacity : " + loadCapacity);
    }

    Hanger(String material, int x) {
        this.material = material;
        System.out.println("Material : " + material);
    }

    Hanger(int weight, double x) {
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Hanger(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    Hanger(boolean nonSlip, int x) {
        this.nonSlip = nonSlip;
        System.out.println("NonSlip : " + nonSlip);
    }

    Hanger(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    Hanger(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

}