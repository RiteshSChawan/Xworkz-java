class Stand {

    int standId;
    String brand;
    String type;
    String color;
    double price;
    double weight;
    double height;
    double width;
    String material;
    boolean isAdjustable;
    boolean isFoldable;
    int quantity;
    double loadCapacity;
    String finish;
    boolean isAvailable;
    String supplier;
    String usage;
    String origin;
    boolean isPortable;
    String[] compatibleDevices;

    public Stand(int standId, String brand, String type, String color, double price, double weight, double height, double width, String material, boolean isAdjustable, boolean isFoldable, int quantity, double loadCapacity, String finish, boolean isAvailable, String supplier, String usage, String origin, boolean isPortable, String[] compatibleDevices) {
        this.standId = standId;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.material = material;
        this.isAdjustable = isAdjustable;
        this.isFoldable = isFoldable;
        this.quantity = quantity;
        this.loadCapacity = loadCapacity;
        this.finish = finish;
        this.isAvailable = isAvailable;
        this.supplier = supplier;
        this.usage = usage;
        this.origin = origin;
        this.isPortable = isPortable;
        this.compatibleDevices = compatibleDevices;
    }

    public void getDetails() {
        System.out.println("StandId : " + this.standId);
        System.out.println("Brand : " + this.brand);
        System.out.println("Type : " + this.type);
        System.out.println("Color : " + this.color);
        System.out.println("Price : " + this.price);
        System.out.println("Weight : " + this.weight);
        System.out.println("Height : " + this.height);
        System.out.println("Width : " + this.width);
        System.out.println("Material : " + this.material);
        System.out.println("IsAdjustable : " + this.isAdjustable);
        System.out.println("IsFoldable : " + this.isFoldable);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("LoadCapacity : " + this.loadCapacity);
        System.out.println("Finish : " + this.finish);
        System.out.println("IsAvailable : " + this.isAvailable);
        System.out.println("Supplier : " + this.supplier);
        System.out.println("Usage : " + this.usage);
        System.out.println("Origin : " + this.origin);
        System.out.println("IsPortable : " + this.isPortable);
        System.out.println("CompatibleDevices :");
        for (String item : this.compatibleDevices)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}