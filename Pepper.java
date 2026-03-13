class Pepper {

    int pepperId;
    String name;
    String variety;
    String color;
    double price;
    double weight;
    int shelfLife;
    String origin;
    boolean isOrganic;
    double scovilleUnit;
    String taste;
    String form;
    String packaging;
    boolean isAvailable;
    String supplier;
    double moisture;
    String season;
    String grade;
    int quantity;
    String[] usedIn;

    public Pepper(int pepperId, String name, String variety, String color, double price, double weight, int shelfLife, String origin, boolean isOrganic, double scovilleUnit, String taste, String form, String packaging, boolean isAvailable, String supplier, double moisture, String season, String grade, int quantity, String[] usedIn) {
        this.pepperId = pepperId;
        this.name = name;
        this.variety = variety;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shelfLife = shelfLife;
        this.origin = origin;
        this.isOrganic = isOrganic;
        this.scovilleUnit = scovilleUnit;
        this.taste = taste;
        this.form = form;
        this.packaging = packaging;
        this.isAvailable = isAvailable;
        this.supplier = supplier;
        this.moisture = moisture;
        this.season = season;
        this.grade = grade;
        this.quantity = quantity;
        this.usedIn = usedIn;
    }

    public void getDetails() {
        System.out.println("PepperId : " + this.pepperId);
        System.out.println("Name : " + this.name);
        System.out.println("Variety : " + this.variety);
        System.out.println("Color : " + this.color);
        System.out.println("Price : " + this.price);
        System.out.println("Weight : " + this.weight);
        System.out.println("ShelfLife : " + this.shelfLife);
        System.out.println("Origin : " + this.origin);
        System.out.println("IsOrganic : " + this.isOrganic);
        System.out.println("ScovilleUnit : " + this.scovilleUnit);
        System.out.println("Taste : " + this.taste);
        System.out.println("Form : " + this.form);
        System.out.println("Packaging : " + this.packaging);
        System.out.println("IsAvailable : " + this.isAvailable);
        System.out.println("Supplier : " + this.supplier);
        System.out.println("Moisture : " + this.moisture);
        System.out.println("Season : " + this.season);
        System.out.println("Grade : " + this.grade);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("UsedIn :");
        for (String item : this.usedIn)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}