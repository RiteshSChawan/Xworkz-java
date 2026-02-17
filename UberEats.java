class UberEats {

    public static double search(String foodName) {
        double price = 0.00;

        if(foodName == "ChocoLavaCake") { 
			price = 175.00; 
			return price; 
		}
        else if(foodName == "FruitCustard") { 
			price = 135.00; 
			return price; 
		}
        else if(foodName == "VanillaCupcake") { 
			price = 125.00; 
			return price; 
		}
        else if(foodName == "ChocolateCupcake") { 
			price = 130.00; 
			return price; 
		}
        else if(foodName == "StrawberryCupcake") { 
			price = 132.00; 
			return price; 
		}
        else if(foodName == "BlueberryMuffin") { 
			price = 145.00; 
			return price; 
		}
        else if(foodName == "ChocolateMuffin") { 
			price = 148.00; 
			return price; 
		}
		else if(foodName == "ClassicBurger") { 
			price = 201.00; 
			return price; 
		}
        else if(foodName == "SpicyBurger") { 
			price = 203.00; 
			return price; 
		}
        else if(foodName == "BBQBurger") { 
			price = 205.00; 
			return price; 
		}
        else if(foodName == "ThinCrustPizza") { 
			price = 210.00; 
			return price; 
		}
        else if(foodName == "CheeseBurstPizza") { 
			price = 215.00; 
			return price; 
		}
        else if(foodName == "VegSupremePizza") { 
			price = 218.00; 
			return price; 
		}
        else if(foodName == "ChickenSupremePizza") { 
			price = 222.00; 
			return price; 
		}
        else if(foodName == "PaneerWrap") { 
			price = 180.00; 
			return price; 
		}
        else if(foodName == "VegWrapCombo") { 
			price = 190.00; 
			return price; 
		}
        else if(foodName == "ChickenWrapCombo") { 
			price = 200.00; 
			return price; 
		}
        else if(foodName == "VegBurrito") { 
			price = 175.00; 
			return price; 
		}
        else if(foodName == "ChickenBurrito") { 
			price = 195.00; 
			return price; 
		}
        else if(foodName == "VegQuesadilla") { 
			price = 165.00; 
			return price; 
		}
        else if(foodName == "ChickenQuesadilla") { 
			price = 185.00; 
			return price; 
		}
        else if(foodName == "VegTaco") { 
			price = 155.00; 
			return price; 
		}
        else if(foodName == "ChickenTaco") { 
			price = 170.00; 
			return price; 
		}
        else if(foodName == "PaneerTikka") { 
			price = 210.00; 
			return price;
		}
        else if(foodName == "ChickenTikka") { 
			price = 230.00; 
			return price; 
		}
        else if(foodName == "MalaiKabab") { 
			price = 225.00; 
			return price; 
		}
        else if(foodName == "SeekhKabab") { 
			price = 240.00; 
			return price; 
		}
        else if(foodName == "VegLasagna") { 
			price = 205.00; 
			return price; 
		}
        else if(foodName == "ChickenLasagna") { 
			price = 235.00; 
			return price; 
		}
        else if(foodName == "VegPastaAlfredo") { 
			price = 195.00; 
			return price; 
		}
        else if(foodName == "ChickenPastaAlfredo") { 
			price = 225.00; 
			return price; 
		}
        else if(foodName == "VegPastaArrabiata") { 
			price = 190.00; 
			return price; 
		}
        else if(foodName == "ChickenPastaArrabiata") { 
			price = 220.00; 
			return price; 
		}
        else if(foodName == "VegSteamedRice") { 
			price = 150.00; 
			return price; 
		}
        else if(foodName == "ChickenSteamedRice") { 
			price = 180.00; 
			return price; 
		}
        else if(foodName == "VegGrilledSandwich") { 
			price = 165.00; 
			return price; 
		}
        else if(foodName == "ChickenGrilledSandwich") { 
			price = 185.00; 
			return price; 
		}
        else if(foodName == "VegCheeseToast") { 
			price = 145.00; 
			return price; 
		}
        else if(foodName == "ChickenCheeseToast") { 
			price = 175.00; 
			return price; 
		}
        else if(foodName == "VegHotDog") { 
			price = 160.00; 
			return price; 
		}
        else if(foodName == "ChickenHotDog") { 
			price = 185.00; 
			return price; 
		}
        else if(foodName == "VegSpringRolls") { 
			price = 155.00; 
			return price; 
		}
        else if(foodName == "ChickenSpringRolls") { 
			price = 175.00; 
			return price; 
		}
        else if(foodName == "VegNachos") { 
			price = 170.00; 
			return price; 
		}
        else if(foodName == "ChickenNachos") { 
			price = 195.00; 
			return price; 
		}
        else if(foodName == "ClassicMilkShake") { 
			price = 140.00; 
			return price; 
		}
        else if(foodName == "OreoMilkShake") { 
			price = 155.00; 
			return price; 
		}
        else if(foodName == "ChocolateBrownie") { 
			price = 165.00; 
			return price; 
		}
        

        else {
            System.out.println("Food not found");
        }
        return price;
    }
}
