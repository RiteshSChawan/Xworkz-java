class Food {
    static String name;
    static String type;
    static double price;
    static int calories;
    static boolean isVegetarian;

    public static boolean createFood(String foodName, String foodType, double priceAmt, int calCount, boolean vegStatus) {
        boolean isFoodCreated = false;

        boolean isNameValid = false;
        boolean isTypeValid = false;
        boolean isPriceValid = false;
        boolean isCaloriesValid = false;
        boolean isVegStatusValid = true;

        if (foodName != null && !foodName.isEmpty()) {
            System.out.println("Food name is Valid");
            name = foodName;
            isNameValid = true;
        } else {
            System.out.println("Food name is invalid");
        }

        if (foodType != null && !foodType.isEmpty()) {
            System.out.println("Food type is Valid");
            type = foodType;
            isTypeValid = true;
        } else {
            System.out.println("Food type is invalid");
        }

        if (priceAmt > 0) {
            System.out.println("Price is Valid");
            price = priceAmt;
            isPriceValid = true;
        } else {
            System.out.println("Price is invalid");
        }

        if (calCount > 0) {
            System.out.println("Calories are Valid");
            calories = calCount;
            isCaloriesValid = true;
        } else {
            System.out.println("Calories are invalid");
        }

        isVegetarian = vegStatus;

        if (isNameValid && isTypeValid && isPriceValid && isCaloriesValid && isVegStatusValid) {
            isFoodCreated = true;
        } else {
            System.out.println("The food item is not valid");
        }

        return isFoodCreated;
    }

    public static void getFoodDetails() {
        System.out.println("Food details are:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Calories: " + calories);
        System.out.println("Vegetarian: " + isVegetarian);
    }
}