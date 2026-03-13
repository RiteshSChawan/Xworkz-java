class Calculator {

    int id;
    String brand;
    double price;
    String color;
    int digits;
    double screenSize;
    String material;
    int weight;
    String type;
    boolean solar;
    String size;
    String country;

    Calculator(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    Calculator(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Calculator(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    Calculator(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

    Calculator(int digits, double x) {
        this.digits = digits;
        System.out.println("Digits : " + digits);
    }

    Calculator(double screenSize, boolean x) {
        this.screenSize = screenSize;
        System.out.println("ScreenSize : " + screenSize);
    }

    Calculator(String material, int x) {
        this.material = material;
        System.out.println("Material : " + material);
    }

    Calculator(int weight, double x) {
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Calculator(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    Calculator(boolean solar, int x) {
        this.solar = solar;
        System.out.println("Solar : " + solar);
    }

    Calculator(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    Calculator(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

}