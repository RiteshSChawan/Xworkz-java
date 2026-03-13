class Racket {
    String brand;
    String model;
    int weight; // in grams
    int headSize; // in sq inches
    String stringPattern;
    int gripSize;
    String balance;
    int stiffness;
    double length; // in inches
    String color;

    Racket() {}

    Racket(String brand, String model, int weight, int headSize, String stringPattern, 
           int gripSize, String balance, int stiffness, double length, String color) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.headSize = headSize;
        this.stringPattern = stringPattern;
        this.gripSize = gripSize;
        this.balance = balance;
        this.stiffness = stiffness;
        this.length = length;
        this.color = color;
    }
}
