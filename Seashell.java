class Seashell {

    int id;
    String brand;
    double price;
    String color;
    int size_cm;
    double spiralCount;
    String species;
    int weight;
    String type;
    boolean polished;
    String size;
    String country;

    Seashell(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    Seashell(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Seashell(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    Seashell(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

    Seashell(int size_cm, double x) {
        this.size_cm = size_cm;
        System.out.println("Size_cm : " + size_cm);
    }

    Seashell(double spiralCount, boolean x) {
        this.spiralCount = spiralCount;
        System.out.println("SpiralCount : " + spiralCount);
    }

    Seashell(String species, int x) {
        this.species = species;
        System.out.println("Species : " + species);
    }

    Seashell(int weight, double x) {
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Seashell(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    Seashell(boolean polished, int x) {
        this.polished = polished;
        System.out.println("Polished : " + polished);
    }

    Seashell(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    Seashell(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

}