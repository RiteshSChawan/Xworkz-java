class Dice {

    int id;
    String brand;
    double price;
    String color;
    int sides;
    double edgeLength;
    String material;
    int weight;
    String type;
    boolean transparent;
    String size;
    String country;

    Dice(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    Dice(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Dice(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    Dice(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

    Dice(int sides, double x) {
        this.sides = sides;
        System.out.println("Sides : " + sides);
    }

    Dice(double edgeLength, boolean x) {
        this.edgeLength = edgeLength;
        System.out.println("EdgeLength : " + edgeLength);
    }

    Dice(String material, int x) {
        this.material = material;
        System.out.println("Material : " + material);
    }

    Dice(int weight, double x) {
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Dice(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    Dice(boolean transparent, int x) {
        this.transparent = transparent;
        System.out.println("Transparent : " + transparent);
    }

    Dice(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    Dice(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

}