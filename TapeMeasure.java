class TapeMeasure {

    int id;
    String brand;
    double price;
    String color;
    int length;
    double accuracy;
    String material;
    int weight;
    String type;
    boolean autoLock;
    String size;
    String country;

    TapeMeasure(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    TapeMeasure(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    TapeMeasure(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    TapeMeasure(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

    TapeMeasure(int length, double x) {
        this.length = length;
        System.out.println("Length : " + length);
    }

    TapeMeasure(double accuracy, boolean x) {
        this.accuracy = accuracy;
        System.out.println("Accuracy : " + accuracy);
    }

    TapeMeasure(String material, int x) {
        this.material = material;
        System.out.println("Material : " + material);
    }

    TapeMeasure(int weight, double x) {
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    TapeMeasure(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    TapeMeasure(boolean autoLock, int x) {
        this.autoLock = autoLock;
        System.out.println("AutoLock : " + autoLock);
    }

    TapeMeasure(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    TapeMeasure(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

}