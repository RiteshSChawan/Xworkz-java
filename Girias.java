
class Girias {
    static String brand;
    static String productType;
    static double price;
    static int warrantyMonths;
    static boolean isDiscountAvailable;
    static String modelNumber;
    static double capacity;
    static String energyRating;
    static boolean isHomeDeliveryAvailable;
    static String color;

    public static boolean createProduct(String brandName, String type, double priceAmt, int warranty, boolean discount, String modelNo, double cap, String energy, boolean delivery, String colorDesign) {
        boolean isProductCreated = false;
        
        boolean isBrandValid = false;
        boolean isTypeValid = false;
        boolean isPriceValid = false;
        boolean isWarrantyValid = false;
        boolean isDiscountValid = true;
        boolean isModelValid = false;
        boolean isCapacityValid = false;
        boolean isEnergyValid = false;
        boolean isDeliveryValid = true;
        boolean isColorValid = false;

        if (brandName != null && !brandName.isEmpty()) {
            System.out.println("Brand name is Valid");
            brand = brandName;
            isBrandValid = true;
        } else {
            System.out.println("Brand name is invalid");
        }

        if (type != null && !type.isEmpty()) {
            System.out.println("Product type is Valid");
            productType = type;
            isTypeValid = true;
        } else {
            System.out.println("Product type is invalid");
        }

        if (priceAmt > 0) {
            System.out.println("Price is Valid");
            price = priceAmt;
            isPriceValid = true;
        } else {
            System.out.println("Price is invalid");
        }

        if (warranty != 0) {
            System.out.println("Warranty is Valid");
            warrantyMonths = warranty;
            isWarrantyValid = true;
        } else {
            System.out.println("Warranty is invalid");
        }

        isDiscountAvailable = discount;

        if (modelNo != null && !modelNo.isEmpty()) {
            System.out.println("Model number is Valid");
            modelNumber = modelNo;
            isModelValid = true;
        } else {
            System.out.println("Model number is invalid");
        }

        if (cap != 0) {
            System.out.println("Capacity is Valid");
            capacity = cap;
            isCapacityValid = true;
        } else {
            System.out.println("Capacity is invalid");
        }

        if (energy != null && !energy.isEmpty()) {
            System.out.println("Energy rating is Valid");
            energyRating = energy;
            isEnergyValid = true;
        } else {
            System.out.println("Energy rating is invalid");
        }

        isHomeDeliveryAvailable = delivery;

        if (colorDesign != null && !colorDesign.isEmpty()) {
            System.out.println("Color is Valid");
            color = colorDesign;
            isColorValid = true;
        } else {
            System.out.println("Color is invalid");
        }

        if (isBrandValid && isTypeValid && isPriceValid && isWarrantyValid && isModelValid && isCapacityValid && isEnergyValid && isColorValid) {
            isProductCreated = true;
        } else {
            System.out.println("The product entry is not valid");
        }

        return isProductCreated;
    }

    public static void getProductDetails() {
        System.out.println("Girias Product Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + productType);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warrantyMonths + " months");
        System.out.println("Discount: " + isDiscountAvailable);
        System.out.println("Model: " + modelNumber);
        System.out.println("Capacity: " + capacity);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Delivery Available: " + isHomeDeliveryAvailable);
        System.out.println("Color: " + color);
    }
}
