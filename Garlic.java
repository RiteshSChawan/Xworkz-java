class Garlic {

    int garlicId;
    String variety;
    String origin;
    String color;
    double price;
    double weight;
    int shelfLife;
    boolean isOrganic;
    double moisture;
    String form;
    String packaging;
    boolean isAvailable;
    String supplier;
    double pungency;
    String season;
    String grade;
    int quantity;
    String taste;
    boolean isPeeled;
    String[] healthBenefits;

    public Garlic(int garlicId, String variety, String origin, String color, double price, double weight, int shelfLife, boolean isOrganic, double moisture, String form, String packaging, boolean isAvailable, String supplier, double pungency, String season, String grade, int quantity, String taste, boolean isPeeled, String[] healthBenefits) {
        this.garlicId = garlicId;
        this.variety = variety;
        this.origin = origin;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shelfLife = shelfLife;
        this.isOrganic = isOrganic;
        this.moisture = moisture;
        this.form = form;
        this.packaging = packaging;
        this.isAvailable = isAvailable;
        this.supplier = supplier;
        this.pungency = pungency;
        this.season = season;
        this.grade = grade;
        this.quantity = quantity;
        this.taste = taste;
        this.isPeeled = isPeeled;
        this.healthBenefits = healthBenefits;
    }

    public void getDetails() {
        System.out.println("GarlicId : " + this.garlicId);
        System.out.println("Variety : " + this.variety);
        System.out.println("Origin : " + this.origin);
        System.out.println("Color : " + this.color);
        System.out.println("Price : " + this.price);
        System.out.println("Weight : " + this.weight);
        System.out.println("ShelfLife : " + this.shelfLife);
        System.out.println("IsOrganic : " + this.isOrganic);
        System.out.println("Moisture : " + this.moisture);
        System.out.println("Form : " + this.form);
        System.out.println("Packaging : " + this.packaging);
        System.out.println("IsAvailable : " + this.isAvailable);
        System.out.println("Supplier : " + this.supplier);
        System.out.println("Pungency : " + this.pungency);
        System.out.println("Season : " + this.season);
        System.out.println("Grade : " + this.grade);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Taste : " + this.taste);
        System.out.println("IsPeeled : " + this.isPeeled);
        System.out.println("HealthBenefits :");
        for (String item : this.healthBenefits)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}