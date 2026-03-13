class Spatula {

    int id;
    String brand;
    double price;
    String color;
    int length;
    double headWidth;
    String material;
    int weight;
    String type;
    boolean heatResistant;
    String size;
    String country;

    Spatula(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    Spatula(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Spatula(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    Spatula(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

    Spatula(int length, double x) {
        this.length = length;
        System.out.println("Length : " + length);
    }

    Spatula(double headWidth, boolean x) {
        this.headWidth = headWidth;
        System.out.println("HeadWidth : " + headWidth);
    }

    Spatula(String material, int x) {
        this.material = material;
        System.out.println("Material : " + material);
    }

    Spatula(int weight, double x) {
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Spatula(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    Spatula(boolean heatResistant, int x) {
        this.heatResistant = heatResistant;
        System.out.println("HeatResistant : " + heatResistant);
    }

    Spatula(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    Spatula(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

}