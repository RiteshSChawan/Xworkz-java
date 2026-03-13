class Organizer {

    int organizerId;
    String brand;
    String type;
    String color;
    double price;
    double weight;
    int compartments;
    String material;
    double length;
    double width;
    double height;
    boolean isWaterproof;
    boolean isPortable;
    String usage;
    boolean isAvailable;
    String supplier;
    String origin;
    int quantity;
    boolean isEcoFriendly;
    String[] storageItems;

    public Organizer(int organizerId, String brand, String type, String color, double price, double weight, int compartments, String material, double length, double width, double height, boolean isWaterproof, boolean isPortable, String usage, boolean isAvailable, String supplier, String origin, int quantity, boolean isEcoFriendly, String[] storageItems) {
        this.organizerId = organizerId;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.compartments = compartments;
        this.material = material;
        this.length = length;
        this.width = width;
        this.height = height;
        this.isWaterproof = isWaterproof;
        this.isPortable = isPortable;
        this.usage = usage;
        this.isAvailable = isAvailable;
        this.supplier = supplier;
        this.origin = origin;
        this.quantity = quantity;
        this.isEcoFriendly = isEcoFriendly;
        this.storageItems = storageItems;
    }

    public void getDetails() {
        System.out.println("OrganizerId : " + this.organizerId);
        System.out.println("Brand : " + this.brand);
        System.out.println("Type : " + this.type);
        System.out.println("Color : " + this.color);
        System.out.println("Price : " + this.price);
        System.out.println("Weight : " + this.weight);
        System.out.println("Compartments : " + this.compartments);
        System.out.println("Material : " + this.material);
        System.out.println("Length : " + this.length);
        System.out.println("Width : " + this.width);
        System.out.println("Height : " + this.height);
        System.out.println("IsWaterproof : " + this.isWaterproof);
        System.out.println("IsPortable : " + this.isPortable);
        System.out.println("Usage : " + this.usage);
        System.out.println("IsAvailable : " + this.isAvailable);
        System.out.println("Supplier : " + this.supplier);
        System.out.println("Origin : " + this.origin);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("IsEcoFriendly : " + this.isEcoFriendly);
        System.out.println("StorageItems :");
        for (String item : this.storageItems)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}