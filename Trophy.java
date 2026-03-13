class Trophy {

    int trophyId;
    String name;
    String sport;
    String level;
    double price;
    double weight;
    double height;
    String material;
    String color;
    boolean isCustomizable;
    String awardedBy;
    int year;
    String origin;
    String finish;
    boolean isAvailable;
    String supplier;
    String category;
    String shape;
    int quantity;
    String[] previousWinners;

    public Trophy(int trophyId, String name, String sport, String level, double price, double weight, double height, String material, String color, boolean isCustomizable, String awardedBy, int year, String origin, String finish, boolean isAvailable, String supplier, String category, String shape, int quantity, String[] previousWinners) {
        this.trophyId = trophyId;
        this.name = name;
        this.sport = sport;
        this.level = level;
        this.price = price;
        this.weight = weight;
        this.height = height;
        this.material = material;
        this.color = color;
        this.isCustomizable = isCustomizable;
        this.awardedBy = awardedBy;
        this.year = year;
        this.origin = origin;
        this.finish = finish;
        this.isAvailable = isAvailable;
        this.supplier = supplier;
        this.category = category;
        this.shape = shape;
        this.quantity = quantity;
        this.previousWinners = previousWinners;
    }

    public void getDetails() {
        System.out.println("TrophyId : " + this.trophyId);
        System.out.println("Name : " + this.name);
        System.out.println("Sport : " + this.sport);
        System.out.println("Level : " + this.level);
        System.out.println("Price : " + this.price);
        System.out.println("Weight : " + this.weight);
        System.out.println("Height : " + this.height);
        System.out.println("Material : " + this.material);
        System.out.println("Color : " + this.color);
        System.out.println("IsCustomizable : " + this.isCustomizable);
        System.out.println("AwardedBy : " + this.awardedBy);
        System.out.println("Year : " + this.year);
        System.out.println("Origin : " + this.origin);
        System.out.println("Finish : " + this.finish);
        System.out.println("IsAvailable : " + this.isAvailable);
        System.out.println("Supplier : " + this.supplier);
        System.out.println("Category : " + this.category);
        System.out.println("Shape : " + this.shape);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("PreviousWinners :");
        for (String item : this.previousWinners)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}