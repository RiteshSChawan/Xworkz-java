class Keyring {

    int id;
    String brand;
    double price;
    String color;
    int diameter;
    double strength;
    String material;
    int weight;
    String type;
    boolean locking;
    String size;
    String country;

    Keyring(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    Keyring(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Keyring(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    Keyring(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

    Keyring(int diameter, double x) {
        this.diameter = diameter;
        System.out.println("Diameter : " + diameter);
    }

    Keyring(double strength, boolean x) {
        this.strength = strength;
        System.out.println("Strength : " + strength);
    }

    Keyring(String material, int x) {
        this.material = material;
        System.out.println("Material : " + material);
    }

    Keyring(int weight, double x) {
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Keyring(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    Keyring(boolean locking, int x) {
        this.locking = locking;
        System.out.println("Locking : " + locking);
    }

    Keyring(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    Keyring(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

}