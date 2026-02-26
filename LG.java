
class LG {
    static String productType;
    static String modelName;
    static double price;
    static int warrantyYears;
    static boolean isSmartFeatures;
    static String energyRating;
    static double screenResolution;
    static boolean hasThinQAI;
    static String color;
    static int stockAvailable;

    public static boolean createProduct(String type, String model, double priceAmt, int warranty, boolean smart, String rating, double resolution, boolean thinQ, String designColor, int stock) {
        boolean isProductCreated = false;
        
        boolean isTypeValid = false;
        boolean isModelValid = false;
        boolean isPriceValid = false;
        boolean isWarrantyValid = false;
        boolean isSmartValid = true;
        boolean isRatingValid = false;
        boolean isResolutionValid = false;
        boolean isThinQValid = true;
        boolean isColorValid = false;
        boolean isStockValid = false;

        if (type != null && !type.isEmpty()) {
            System.out.println("Product type is Valid");
            productType = type;
            isTypeValid = true;
        } else {
            System.out.println("Product type is invalid");
        }

        if (model != null && !model.isEmpty()) {
            System.out.println("Model name is Valid");
            modelName = model;
            isModelValid = true;
        } else {
            System.out.println("Model name is invalid");
        }

        if (priceAmt > 0) {
            System.out.println("Price is Valid");
            price = priceAmt;
            isPriceValid = true;
        } else {
            System.out.println("Price is invalid");
        }

        if (warranty >= 0) {
            System.out.println("Warranty is Valid");
            warrantyYears = warranty;
            isWarrantyValid = true;
        } else {
            System.out.println("Warranty is invalid");
        }

        isSmartFeatures = smart;

        if (rating != null && !rating.isEmpty()) {
            System.out.println("Energy rating is Valid");
            energyRating = rating;
            isRatingValid = true;
        } else {
            System.out.println("Energy rating is invalid");
        }

        if (resolution >= 0) {
            System.out.println("Resolution is Valid");
            screenResolution = resolution;
            isResolutionValid = true;
        } else {
            System.out.println("Resolution is invalid");
        }

        hasThinQAI = thinQ;

        if (designColor != null && !designColor.isEmpty()) {
            System.out.println("Color is Valid");
            color = designColor;
            isColorValid = true;
        } else {
            System.out.println("Color is invalid");
        }

        if (stock >= 0) {
            System.out.println("Stock is Valid");
            stockAvailable = stock;
            isStockValid = true;
        } else {
            System.out.println("Stock is invalid");
        }

        if (isTypeValid && isModelValid && isPriceValid && isWarrantyValid && isRatingValid && isResolutionValid && isColorValid && isStockValid) {
            isProductCreated = true;
        } else {
            System.out.println("The LG product data is not valid");
        }

        return isProductCreated;
    }

    public static void getProductDetails() {
        System.out.println("LG Product Details:");
        System.out.println("Type: " + productType);
        System.out.println("Model: " + modelName);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Smart Features: " + isSmartFeatures);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Resolution: " + screenResolution + "K");
        System.out.println("ThinQ AI: " + hasThinQAI);
        System.out.println("Color: " + color);
        System.out.println("Stock Available: " + stockAvailable);
    }
}
