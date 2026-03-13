class Whistle {

    int id;
    String brand;
    double price;
    String color;
    int decibels;
    double frequency;
    String material;
    int weight;
    String type;
    boolean pealess;
    String size;
    String country;

    Whistle(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    Whistle(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Whistle(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    Whistle(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

    Whistle(int decibels, double x) {
        this.decibels = decibels;
        System.out.println("Decibels : " + decibels);
    }

    Whistle(double frequency, boolean x) {
        this.frequency = frequency;
        System.out.println("Frequency : " + frequency);
    }

    Whistle(String material, int x) {
        this.material = material;
        System.out.println("Material : " + material);
    }

    Whistle(int weight, double x) {
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Whistle(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    Whistle(boolean pealess, int x) {
        this.pealess = pealess;
        System.out.println("Pealess : " + pealess);
    }

    Whistle(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    Whistle(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

}