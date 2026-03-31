public class NutritionTable {  // Encapsulation

    private int nutritionId;
    private String foodName;
    private String calories;
    private String protein;
    private String carbohydrates;
    private String fat;
    private String vitamins;

    public void setNutritionId(int nutritionId) {
        this.nutritionId = nutritionId;
    }
    public int getNutritionId() {
        return this.nutritionId;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public String getFoodName() {
        return this.foodName;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }
    public String getCalories() {
        return this.calories;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }
    public String getProtein() {
        return this.protein;
    }

    public void setCarbohydrates(String carbohydrates) {
        this.carbohydrates = carbohydrates;
    }
    public String getCarbohydrates() {
        return this.carbohydrates;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }
    public String getFat() {
        return this.fat;
    }

    public void setVitamins(String vitamins) {
        this.vitamins = vitamins;
    }
    public String getVitamins() {
        return this.vitamins;
    }

}
