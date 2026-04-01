class NutritionTable {

	private String foodItem;
	private String servingSize;
	private double calories;
	private double protein;
	private double carbohydrates;
	private double fats;
	private String vitamins;

	public void setFoodItem(String foodItem) { 
		this.foodItem = foodItem; 
	}

	public String getFoodItem() { 
		return this.foodItem; 
	}

	public void setServingSize(String servingSize) { 
		this.servingSize = servingSize; 
	}

	public String getServingSize() { 
		return this.servingSize; 
	}

	public void setCalories(double calories) { 
		this.calories = calories; 
	}

	public double getCalories() { 
		return this.calories; 
	}

	public void setProtein(double protein) { 
		this.protein = protein; 
	}

	public double getProtein() { 
		return this.protein; 
	}

	public void setCarbohydrates(double carbohydrates) { 
		this.carbohydrates = carbohydrates; 
	}

	public double getCarbohydrates() { 
		return this.carbohydrates; 
	}

	public void setFats(double fats) { 
		this.fats = fats; 
	}

	public double getFats() { 
		return this.fats; 
	}

	public void setVitamins(String vitamins) { 
		this.vitamins = vitamins; 
	}

	public String getVitamins() { 
		return this.vitamins; 
	}

}