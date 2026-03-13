class Shampoo {

    int shampooId;
    String brand;
    String variant;
    String color;
    double price;
    double volume;
    String hairType;
    boolean isParabenFree;
    boolean isSulfateFree;
    String fragrance;
    String keyIngredient;
    boolean isOrganic;
    String packaging;
    boolean isAvailable;
    String supplier;
    String origin;
    int quantity;
    double ph;
    boolean isDandruffControl;
    String[] benefits;

    public Shampoo(int shampooId, String brand, String variant, String color, double price, double volume, String hairType, boolean isParabenFree, boolean isSulfateFree, String fragrance, String keyIngredient, boolean isOrganic, String packaging, boolean isAvailable, String supplier, String origin, int quantity, double ph, boolean isDandruffControl, String[] benefits) {
        this.shampooId = shampooId;
        this.brand = brand;
        this.variant = variant;
        this.color = color;
        this.price = price;
        this.volume = volume;
        this.hairType = hairType;
        this.isParabenFree = isParabenFree;
        this.isSulfateFree = isSulfateFree;
        this.fragrance = fragrance;
        this.keyIngredient = keyIngredient;
        this.isOrganic = isOrganic;
        this.packaging = packaging;
        this.isAvailable = isAvailable;
        this.supplier = supplier;
        this.origin = origin;
        this.quantity = quantity;
        this.ph = ph;
        this.isDandruffControl = isDandruffControl;
        this.benefits = benefits;
    }

    public void getDetails() {
        System.out.println("ShampooId : " + this.shampooId);
        System.out.println("Brand : " + this.brand);
        System.out.println("Variant : " + this.variant);
        System.out.println("Color : " + this.color);
        System.out.println("Price : " + this.price);
        System.out.println("Volume : " + this.volume);
        System.out.println("HairType : " + this.hairType);
        System.out.println("IsParabenFree : " + this.isParabenFree);
        System.out.println("IsSulfateFree : " + this.isSulfateFree);
        System.out.println("Fragrance : " + this.fragrance);
        System.out.println("KeyIngredient : " + this.keyIngredient);
        System.out.println("IsOrganic : " + this.isOrganic);
        System.out.println("Packaging : " + this.packaging);
        System.out.println("IsAvailable : " + this.isAvailable);
        System.out.println("Supplier : " + this.supplier);
        System.out.println("Origin : " + this.origin);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Ph : " + this.ph);
        System.out.println("IsDandruffControl : " + this.isDandruffControl);
        System.out.println("Benefits :");
        for (String item : this.benefits)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}