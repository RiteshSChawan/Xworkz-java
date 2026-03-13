class PocketKnife {

    int id;
    String brand;
    double price;
    String color;
    boolean foldable;
    double bladeLength;
    String material;
    int weight;
    String type;
    boolean sharp;
    String size;
    String country;

    PocketKnife(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    PocketKnife(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    PocketKnife(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    PocketKnife(boolean foldable) {
        this.foldable = foldable;
        System.out.println("Foldable : " + foldable);
    }

    PocketKnife(double bladeLength, boolean x) {
        this.bladeLength = bladeLength;
        System.out.println("BladeLength : " + bladeLength);
    }

    PocketKnife(String material, int x) {
        this.material = material;
        System.out.println("Material : " + material);
    }

    PocketKnife(int weight, double x) {
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    PocketKnife(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    PocketKnife(boolean sharp, int x) {
        this.sharp = sharp;
        System.out.println("Sharp : " + sharp);
    }

    PocketKnife(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    PocketKnife(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

    PocketKnife(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

}