class Cactus {

    int id;
    String brand;
    double price;
    String color;
    int height;
    double waterRetention;
    String species;
    int age;
    String type;
    boolean indoor;
    String size;
    String country;

    Cactus(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    Cactus(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Cactus(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    Cactus(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

    Cactus(int height, double x) {
        this.height = height;
        System.out.println("Height : " + height);
    }

    Cactus(double waterRetention, boolean x) {
        this.waterRetention = waterRetention;
        System.out.println("WaterRetention : " + waterRetention);
    }

    Cactus(String species, int x) {
        this.species = species;
        System.out.println("Species : " + species);
    }

    Cactus(int age, double x) {
        this.age = age;
        System.out.println("Age : " + age);
    }

    Cactus(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    Cactus(boolean indoor, int x) {
        this.indoor = indoor;
        System.out.println("Indoor : " + indoor);
    }

    Cactus(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    Cactus(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

}