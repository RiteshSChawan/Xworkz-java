class GuitarPick {

    int id;
    String brand;
    double price;
    String color;
    int thickness;
    double gripRating;
    String material;
    int weight;
    String type;
    boolean custom;
    String size;
    String country;

    GuitarPick(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    GuitarPick(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    GuitarPick(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    GuitarPick(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

    GuitarPick(int thickness, double x) {
        this.thickness = thickness;
        System.out.println("Thickness : " + thickness);
    }

    GuitarPick(double gripRating, boolean x) {
        this.gripRating = gripRating;
        System.out.println("GripRating : " + gripRating);
    }

    GuitarPick(String material, int x) {
        this.material = material;
        System.out.println("Material : " + material);
    }

    GuitarPick(int weight, double x) {
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    GuitarPick(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    GuitarPick(boolean custom, int x) {
        this.custom = custom;
        System.out.println("Custom : " + custom);
    }

    GuitarPick(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    GuitarPick(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

}