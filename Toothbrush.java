class Toothbrush {

    int id;
    String brand;
    double price;
    String color;
    int bristleCount;
    double bristleLength;
    String material;
    int weight;
    String type;
    boolean electric;
    String size;
    String country;

    Toothbrush(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    Toothbrush(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Toothbrush(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    Toothbrush(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

    Toothbrush(int bristleCount, double x) {
        this.bristleCount = bristleCount;
        System.out.println("BristleCount : " + bristleCount);
    }

    Toothbrush(double bristleLength, boolean x) {
        this.bristleLength = bristleLength;
        System.out.println("BristleLength : " + bristleLength);
    }

    Toothbrush(String material, int x) {
        this.material = material;
        System.out.println("Material : " + material);
    }

    Toothbrush(int weight, double x) {
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Toothbrush(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    Toothbrush(boolean electric, int x) {
        this.electric = electric;
        System.out.println("Electric : " + electric);
    }

    Toothbrush(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    Toothbrush(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

}