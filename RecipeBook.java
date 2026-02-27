class RecipeBook {

    public static void getSteps(String dishName) {
        System.out.println("Fetching recipe steps...");
        System.out.println("Recipe for : " + dishName);

        IngredientList.checkStock(dishName);
        System.out.println("Recipe steps completed.");
    }
}