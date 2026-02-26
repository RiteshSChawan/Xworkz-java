
class Forever24 {
    static String itemName;
    static String category;
    static String size;
    static double price;
    static String color;
    static String material;
    static int stockQuantity;
    static boolean isOnSale;
    static double discountPercentage;
    static String brandCollection;
    static boolean isReturnable;
    static String countryOfOrigin;

    public static boolean createInventoryItem(String name, String cat, String sz, double prc, String clr, String mat, int qty, boolean sale, double discount, String collection, boolean returns, String country) {
        boolean isItemCreated = false;

        boolean isNameValid = false;
        boolean isCategoryValid = false;
        boolean isSizeValid = false;
        boolean isPriceValid = false;
        boolean isColorValid = false;
        boolean isMaterialValid = false;
        boolean isQtyValid = false;
        boolean isSaleValid = true;
        boolean isDiscountValid = false;
        boolean isCollectionValid = false;
        boolean isReturnableValid = true;
        boolean isCountryValid = false;

        if (name != null && !name.isEmpty()) {
            System.out.println("Item name is Valid");
            itemName = name;
            isNameValid = true;
        } else {
            System.out.println("Item name is invalid");
        }

        if (cat != null && !cat.isEmpty()) {
            System.out.println("Category is Valid");
            category = cat;
            isCategoryValid = true;
        } else {
            System.out.println("Category is invalid");
        }

        if (sz != null && !sz.isEmpty()) {
            System.out.println("Size is Valid");
            size = sz;
            isSizeValid = true;
        } else {
            System.out.println("Size is invalid");
        }

        if (prc > 0) {
            System.out.println("Price is Valid");
            price = prc;
            isPriceValid = true;
        } else {
            System.out.println("Price is invalid");
        }

        if (clr != null && !clr.isEmpty()) {
            System.out.println("Color is Valid");
            color = clr;
            isColorValid = true;
        } else {
            System.out.println("Color is invalid");
        }

        if (mat != null && !mat.isEmpty()) {
            System.out.println("Material is Valid");
            material = mat;
            isMaterialValid = true;
        } else {
            System.out.println("Material is invalid");
        }

        if (qty >= 0) {
            System.out.println("Quantity is Valid");
            stockQuantity = qty;
            isQtyValid = true;
        } else {
            System.out.println("Quantity is invalid");
        }

        isOnSale = sale;

        if (discount >= 0 && discount <= 100) {
            System.out.println("Discount is Valid");
            discountPercentage = discount;
            isDiscountValid = true;
        } else {
            System.out.println("Discount is invalid");
        }

        if (collection != null && !collection.isEmpty()) {
            System.out.println("Collection is Valid");
            brandCollection = collection;
            isCollectionValid = true;
        } else {
            System.out.println("Collection is invalid");
        }

        isReturnable = returns;

        if (country != null && !country.isEmpty()) {
            System.out.println("Country is Valid");
            countryOfOrigin = country;
            isCountryValid = true;
        } else {
            System.out.println("Country is invalid");
        }

        if (isNameValid && isCategoryValid && isSizeValid && isPriceValid && isColorValid && isMaterialValid && isQtyValid && isDiscountValid && isCollectionValid && isCountryValid) {
            isItemCreated = true;
        } else {
            System.out.println("The fashion item is not valid");
        }

        return isItemCreated;
    }

    public static void getItemDetails() {
        System.out.println("Forever24 Item Details:");
        System.out.println("Name: " + itemName);
        System.out.println("Category: " + category);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Stock: " + stockQuantity);
        System.out.println("Sale Active: " + isOnSale);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Collection: " + brandCollection);
        System.out.println("Returnable: " + isReturnable);
        System.out.println("Origin: " + countryOfOrigin);
    }
}
