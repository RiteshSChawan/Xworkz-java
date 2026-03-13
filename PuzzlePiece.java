class PuzzlePiece {

    int id;
    String brand;
    double price;
    String color;
    int pieceCount;
    double thickness;
    String material;
    int weight;
    String type;
    boolean glow;
    String size;
    String country;

    PuzzlePiece(int id) {
        this.id = id;
        System.out.println("Id : " + id);
    }

    PuzzlePiece(String brand) {
        this.brand = brand;
        System.out.println("Brand : " + brand);
    }

    PuzzlePiece(double price) {
        this.price = price;
        System.out.println("Price : " + price);
    }

    PuzzlePiece(String color, double x, int y) {
        this.color = color;
        System.out.println("Color : " + color);
    }

    PuzzlePiece(int pieceCount, double x) {
        this.pieceCount = pieceCount;
        System.out.println("PieceCount : " + pieceCount);
    }

    PuzzlePiece(double thickness, boolean x) {
        this.thickness = thickness;
        System.out.println("Thickness : " + thickness);
    }

    PuzzlePiece(String material, int x) {
        this.material = material;
        System.out.println("Material : " + material);
    }

    PuzzlePiece(int weight, double x) {
        this.weight = weight;
        System.out.println("Weight : " + weight);
    }

    PuzzlePiece(String type, double x) {
        this.type = type;
        System.out.println("Type : " + type);
    }

    PuzzlePiece(boolean glow, int x) {
        this.glow = glow;
        System.out.println("Glow : " + glow);
    }

    PuzzlePiece(String size, boolean x) {
        this.size = size;
        System.out.println("Size : " + size);
    }

    PuzzlePiece(String country, int x, int y) {
        this.country = country;
        System.out.println("Country : " + country);
    }

}