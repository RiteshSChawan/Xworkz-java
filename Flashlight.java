class Flashlight {

    int id;
    String brand;
    double price;
    String color;
    int lumens;
    double beamDistance;
    String material;
    int weight;
    String type;
    boolean waterproof;
    String size;
    String country;

    Flashlight(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    Flashlight(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    Flashlight(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    Flashlight(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

    Flashlight(int lumens, double x) {
        this.lumens = lumens;
        System.out.println("Lumens : " + lumens);
    }

    Flashlight(double beamDistance, boolean x) {
        this.beamDistance = beamDistance;
        System.out.println("BeamDistance : " + beamDistance);
    }

    Flashlight(String material, int x) {
        this.material = material;
        System.out.println("Material : " + material);
    }

    Flashlight(int weight, double x) {
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    Flashlight(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    Flashlight(boolean waterproof, int x) {
        this.waterproof = waterproof;
        System.out.println("Waterproof : " + waterproof);
    }

    Flashlight(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    Flashlight(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

}