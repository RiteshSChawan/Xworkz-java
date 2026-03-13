class Paper {

    int paperId;
    String brand;
    String type;
    String color;
    double price;
    int gsm;
    int sheetCount;
    double width;
    double height;
    boolean isRecycled;
    String finish;
    String size;
    String supplier;
    boolean isAvailable;
    double thickness;
    String usage;
    String origin;
    int quantity;
    boolean isWaterproof;
    String[] compatiblePrinters;

    public Paper(int paperId, String brand, String type, String color, double price, int gsm, int sheetCount, double width, double height, boolean isRecycled, String finish, String size, String supplier, boolean isAvailable, double thickness, String usage, String origin, int quantity, boolean isWaterproof, String[] compatiblePrinters) {
        this.paperId = paperId;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.gsm = gsm;
        this.sheetCount = sheetCount;
        this.width = width;
        this.height = height;
        this.isRecycled = isRecycled;
        this.finish = finish;
        this.size = size;
        this.supplier = supplier;
        this.isAvailable = isAvailable;
        this.thickness = thickness;
        this.usage = usage;
        this.origin = origin;
        this.quantity = quantity;
        this.isWaterproof = isWaterproof;
        this.compatiblePrinters = compatiblePrinters;
    }

    public void getDetails() {
        System.out.println("PaperId : " + this.paperId);
        System.out.println("Brand : " + this.brand);
        System.out.println("Type : " + this.type);
        System.out.println("Color : " + this.color);
        System.out.println("Price : " + this.price);
        System.out.println("Gsm : " + this.gsm);
        System.out.println("SheetCount : " + this.sheetCount);
        System.out.println("Width : " + this.width);
        System.out.println("Height : " + this.height);
        System.out.println("IsRecycled : " + this.isRecycled);
        System.out.println("Finish : " + this.finish);
        System.out.println("Size : " + this.size);
        System.out.println("Supplier : " + this.supplier);
        System.out.println("IsAvailable : " + this.isAvailable);
        System.out.println("Thickness : " + this.thickness);
        System.out.println("Usage : " + this.usage);
        System.out.println("Origin : " + this.origin);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("IsWaterproof : " + this.isWaterproof);
        System.out.println("CompatiblePrinters :");
        for (String item : this.compatiblePrinters)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}