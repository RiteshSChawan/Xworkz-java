class Lotion {

    int lotionId;
    String brand;
    String variant;
    String color;
    double price;
    double volume;
    String skinType;
    boolean isSPF;
    boolean isParabenFree;
    String fragrance;
    String keyIngredient;
    boolean isOrganic;
    String packaging;
    boolean isAvailable;
    String supplier;
    String origin;
    int quantity;
    double spfValue;
    boolean isHypoallergenic;
    String[] benefits;

    public Lotion(int lotionId, String brand, String variant, String color, double price, double volume, String skinType, boolean isSPF, boolean isParabenFree, String fragrance, String keyIngredient, boolean isOrganic, String packaging, boolean isAvailable, String supplier, String origin, int quantity, double spfValue, boolean isHypoallergenic, String[] benefits) {
        this.lotionId = lotionId;
        this.brand = brand;
        this.variant = variant;
        this.color = color;
        this.price = price;
        this.volume = volume;
        this.skinType = skinType;
        this.isSPF = isSPF;
        this.isParabenFree = isParabenFree;
        this.fragrance = fragrance;
        this.keyIngredient = keyIngredient;
        this.isOrganic = isOrganic;
        this.packaging = packaging;
        this.isAvailable = isAvailable;
        this.supplier = supplier;
        this.origin = origin;
        this.quantity = quantity;
        this.spfValue = spfValue;
        this.isHypoallergenic = isHypoallergenic;
        this.benefits = benefits;
    }

    public void getDetails() {
        System.out.println("LotionId : " + this.lotionId);
        System.out.println("Brand : " + this.brand);
        System.out.println("Variant : " + this.variant);
        System.out.println("Color : " + this.color);
        System.out.println("Price : " + this.price);
        System.out.println("Volume : " + this.volume);
        System.out.println("SkinType : " + this.skinType);
        System.out.println("IsSPF : " + this.isSPF);
        System.out.println("IsParabenFree : " + this.isParabenFree);
        System.out.println("Fragrance : " + this.fragrance);
        System.out.println("KeyIngredient : " + this.keyIngredient);
        System.out.println("IsOrganic : " + this.isOrganic);
        System.out.println("Packaging : " + this.packaging);
        System.out.println("IsAvailable : " + this.isAvailable);
        System.out.println("Supplier : " + this.supplier);
        System.out.println("Origin : " + this.origin);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("SpfValue : " + this.spfValue);
        System.out.println("IsHypoallergenic : " + this.isHypoallergenic);
        System.out.println("Benefits :");
        for (String item : this.benefits)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}