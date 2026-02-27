class HeadChef {

    public static void cook(String dishName) {
        System.out.println("Head Chef started cooking...");
        System.out.println("Dish : " + dishName);

        RecipeBook.getSteps(dishName);
        System.out.println("Cooking completed by Head Chef.");
    }
}