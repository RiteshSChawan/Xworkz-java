class DumbBell {

    int dumbbellId;
    String brand;
    String type;
    String color;
    double price;
    double weight;
    String material;
    double length;
    double diameter;
    boolean isAdjustable;
    boolean isRubberCoated;
    String finish;
    String usage;
    boolean isAvailable;
    String supplier;
    String origin;
    int quantity;
    String gripType;
    boolean isEcoFriendly;
    String[] targetMuscles;

    public DumbBell(int dumbbellId, String brand, String type, String color, double price, double weight, String material, double length, double diameter, boolean isAdjustable, boolean isRubberCoated, String finish, String usage, boolean isAvailable, String supplier, String origin, int quantity, String gripType, boolean isEcoFriendly, String[] targetMuscles) {
        this.dumbbellId = dumbbellId;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.material = material;
        this.length = length;
        this.diameter = diameter;
        this.isAdjustable = isAdjustable;
        this.isRubberCoated = isRubberCoated;
        this.finish = finish;
        this.usage = usage;
        this.isAvailable = isAvailable;
        this.supplier = supplier;
        this.origin = origin;
        this.quantity = quantity;
        this.gripType = gripType;
        this.isEcoFriendly = isEcoFriendly;
        this.targetMuscles = targetMuscles;
    }

    public void getDetails() {
        System.out.println("DumbbellId : " + this.dumbbellId);
        System.out.println("Brand : " + this.brand);
        System.out.println("Type : " + this.type);
        System.out.println("Color : " + this.color);
        System.out.println("Price : " + this.price);
        System.out.println("Weight : " + this.weight);
        System.out.println("Material : " + this.material);
        System.out.println("Length : " + this.length);
        System.out.println("Diameter : " + this.diameter);
        System.out.println("IsAdjustable : " + this.isAdjustable);
        System.out.println("IsRubberCoated : " + this.isRubberCoated);
        System.out.println("Finish : " + this.finish);
        System.out.println("Usage : " + this.usage);
        System.out.println("IsAvailable : " + this.isAvailable);
        System.out.println("Supplier : " + this.supplier);
        System.out.println("Origin : " + this.origin);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("GripType : " + this.gripType);
        System.out.println("IsEcoFriendly : " + this.isEcoFriendly);
        System.out.println("TargetMuscles :");
        for (String item : this.targetMuscles)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}