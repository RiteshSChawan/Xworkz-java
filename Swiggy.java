class Swiggy {

    public static double search(String foodName) {
        double price = 0.00;

        
        if(foodName == "AlooParatha") { 
			price = 60.00; 
			return price; 
		}
        else if(foodName == "GobiParatha") { 
			price = 65.00; 
			return price; 
		}
        else if(foodName == "PaneerParatha") { 
			price = 75.00; 
			return price; 
		}
        else if(foodName == "VegThali") { 
			price = 110.00; 
			return price; 
		}
        else if(foodName == "NorthIndianThali") { 
			price = 140.00; 
			return price; 
		}
        else if(foodName == "SouthIndianThali") { 
			price = 120.00; 
			return price; 
		}
        else if(foodName == "MiniMeals") { 
			price = 95.00; 
			return price; 
		}
        else if(foodName == "FullMeals") { 
			price = 130.00; 
			return price; 
		}
        else if(foodName == "VegRoll") { 
			price = 70.00; 
			return price; 
		}
        else if(foodName == "EggRoll") { 
			price = 85.00; 
			return price; 
		}
        else if(foodName == "ChickenRoll") { 
			price = 110.00; 
			return price; 
		}
        else if(foodName == "VegFriedRice") { 
			price = 92.00; 
			return price; 
		}
        else if(foodName == "EggFriedRice") { 
			price = 102.00; 
			return price; 
		}
        else if(foodName == "ChickenFriedRice") { 
			price = 122.00; 
			return price; 
		}
		else if(foodName == "VegBurger") { 
			price = 88.00; 
			return price; 
		}
        else if(foodName == "MexicanBurger") { 
			price = 98.00; 
			return price; 
		}
        else if(foodName == "FarmhousePizza") { 
			price = 135.00; 
			return price; 
		}
        else if(foodName == "PepperoniPizza") { 
			price = 155.00; 
			return price; 
		}
        else if(foodName == "CheesePizza") { 
			price = 125.00; 
			return price; 
		}
        else if(foodName == "VegMomos") { 
			price = 80.00; 
			return price; 
		}
        else if(foodName == "ChickenMomos") { 
			price = 100.00; 
			return price; 
		}
        else if(foodName == "PaneerMomos") { 
			price = 95.00; 
			return price; 
		}
        else if(foodName == "VegPasta") { 
			price = 105.00; 
			return price; 
		}
        else if(foodName == "WhiteSaucePasta") { 
			price = 115.00; 
			return price; 
		}
        else if(foodName == "RedSaucePasta") { 
			price = 110.00; 
			return price; 
		}
        else if(foodName == "VegSoup") { 
			price = 60.00; 
			return price; 
		}
        else if(foodName == "TomatoSoup") { 
			price = 55.00; 
			return price; 
		}
        else if(foodName == "SweetCornSoup") { 
			price = 65.00; 
			return price; 
		}
        else if(foodName == "VegPakoda") { 
			price = 45.00; 
			return price; 
		}
        else if(foodName == "OnionPakoda") { 
			price = 50.00; 
			return price; 
		}
        else if(foodName == "MirchiBajji") { 
			price = 55.00; 
			return price; 
		}
        else if(foodName == "VegCutlet") { 
			price = 40.00; 
			return price; 
		}
        else if(foodName == "PaneerCutlet") { 
			price = 60.00; 
			return price; 
		}
        else if(foodName == "VegManchowSoup") { 
			price = 70.00; 
			return price; 
		}
        else if(foodName == "VegBurgerCombo") { 
			price = 150.00; 
			return price; 
		}
        else if(foodName == "PizzaCombo") { 
			price = 180.00; 
			return price; 
		}
        else if(foodName == "SandwichCombo") { 
			price = 130.00; 
			return price; 
		}
        else if(foodName == "Tea") { 
			price = 20.00; 
			return price; 
		}
        else if(foodName == "Coffee") { 
			price = 30.00; 
			return price; 
		}
        else if(foodName == "MasalaTea") { 
			price = 25.00; 
			return price; 
		}
        else if(foodName == "BadamMilk") { 
			price = 40.00; 
			return price; 
		}
        else if(foodName == "RoseMilk") { 
			price = 35.00; 
			return price; 
		}
        else if(foodName == "ButterScotchIceCream") { 
			price = 55.00; 
			return price; 
		}
        else if(foodName == "VanillaIceCream") { 
			price = 45.00; 
			return price; 
		}
        else if(foodName == "ChocolateIceCream") { 
			price = 60.00; 
			return price; 
		}
        else if(foodName == "FruitSalad") { 
			price = 65.00; 
			return price; 
		}
        else if(foodName == "IceCreamSundae") { 
			price = 85.00; 
			return price; 
		}

        else {
            System.out.println("Food not found");
        }
		
        return price;
    }
}
