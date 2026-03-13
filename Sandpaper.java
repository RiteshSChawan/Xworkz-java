class Sandpaper {

    int id;
    String brand;
    double price;
    String color;
    int grit;
    double length;
    String abrasiveType;
    int sheetCount;
    String type;
    boolean waterproof;
    String size;
    String country;

    Sandpaper(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    Sandpaper(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Sandpaper(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    Sandpaper(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

    Sandpaper(int grit, double x) {
        this.grit = grit;
        System.out.println("Grit : " + grit);
    }

    Sandpaper(double length, boolean x) {
        this.length = length;
        System.out.println("Length : " + length);
    }

    Sandpaper(String abrasiveType, int x) {
        this.abrasiveType = abrasiveType;
        System.out.println("AbrasiveType : " + abrasiveType);
    }

    Sandpaper(int sheetCount, double x) {
        this.sheetCount = sheetCount;
        System.out.println("SheetCount : " + sheetCount);
    }

    Sandpaper(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    Sandpaper(boolean waterproof, int x) {
        this.waterproof = waterproof;
        System.out.println("Waterproof : " + waterproof);
    }

    Sandpaper(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    Sandpaper(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

}