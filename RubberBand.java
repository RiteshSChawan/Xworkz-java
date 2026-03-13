class RubberBand {

    int id;
    String brand;
    double price;
    String color;
    int length;
    double thickness;
    String material;
    int width;
    String type;
    boolean stretchable;
    String size;
    String country;

    RubberBand(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    RubberBand(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    RubberBand(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    RubberBand(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

    RubberBand(int length, double x) {
        this.length = length;
        System.out.println("Length : " + length);
    }

    RubberBand(double thickness, boolean x) {
        this.thickness = thickness;
        System.out.println("Thickness : " + thickness);
    }

    RubberBand(String material, int x) {
        this.material = material;
        System.out.println("Material : " + material);
    }

    RubberBand(int width, double x) {
        this.width = width;
        System.out.println("Width : " + width);
    }

    RubberBand(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    RubberBand(boolean stretchable, int x) {
        this.stretchable = stretchable;
        System.out.println("Stretchable : " + stretchable);
    }

    RubberBand(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    RubberBand(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

}