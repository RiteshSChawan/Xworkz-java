class WallPaper {

    int paperId;
    String brand;
    String pattern;
    String color;
    double price;
    double rollLength;
    double width;
    String material;
    boolean isWaterproof;
    boolean isPeelAndStick;
    int quantity;
    String finish;
    String roomType;
    double thickness;
    boolean isEcoFriendly;
    String origin;
    String supplier;
    String texture;
    int coverageArea;
    String[] availableColors;

    public WallPaper(int paperId, String brand, String pattern, String color, double price, double rollLength, double width, String material, boolean isWaterproof, boolean isPeelAndStick, int quantity, String finish, String roomType, double thickness, boolean isEcoFriendly, String origin, String supplier, String texture, int coverageArea, String[] availableColors) {
        this.paperId = paperId;
        this.brand = brand;
        this.pattern = pattern;
        this.color = color;
        this.price = price;
        this.rollLength = rollLength;
        this.width = width;
        this.material = material;
        this.isWaterproof = isWaterproof;
        this.isPeelAndStick = isPeelAndStick;
        this.quantity = quantity;
        this.finish = finish;
        this.roomType = roomType;
        this.thickness = thickness;
        this.isEcoFriendly = isEcoFriendly;
        this.origin = origin;
        this.supplier = supplier;
        this.texture = texture;
        this.coverageArea = coverageArea;
        this.availableColors = availableColors;
    }

    public void getDetails() {
        System.out.println("PaperId : " + this.paperId);
        System.out.println("Brand : " + this.brand);
        System.out.println("Pattern : " + this.pattern);
        System.out.println("Color : " + this.color);
        System.out.println("Price : " + this.price);
        System.out.println("RollLength : " + this.rollLength);
        System.out.println("Width : " + this.width);
        System.out.println("Material : " + this.material);
        System.out.println("IsWaterproof : " + this.isWaterproof);
        System.out.println("IsPeelAndStick : " + this.isPeelAndStick);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Finish : " + this.finish);
        System.out.println("RoomType : " + this.roomType);
        System.out.println("Thickness : " + this.thickness);
        System.out.println("IsEcoFriendly : " + this.isEcoFriendly);
        System.out.println("Origin : " + this.origin);
        System.out.println("Supplier : " + this.supplier);
        System.out.println("Texture : " + this.texture);
        System.out.println("CoverageArea : " + this.coverageArea);
        System.out.println("AvailableColors :");
        for (String item : this.availableColors)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}