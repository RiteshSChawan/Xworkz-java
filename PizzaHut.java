class PizzaHut {

    public static double search(String foodName) {
        double price = 0.00;

        
		if(foodName == "CheesyGarlicBread") { 
			price = 165.00; 
			return price; 
		}
        else if(foodName == "StuffedGarlicBread") { 
			price = 185.00; 
			return price; 
		}
        else if(foodName == "VegCheesePockets") { 
			price = 155.00; 
			return price; 
		}
        else if(foodName == "ChickenCheesePockets") { 
			price = 185.00; 
			return price; 
		}
        else if(foodName == "VegPastaPizzaHut") { 
			price = 205.00; 
			return price; 
		}
        else if(foodName == "ChickenPastaPizzaHut") { 
			price = 235.00; 
			return price; 
		}
        else if(foodName == "VegLasagnaPizzaHut") { 
			price = 225.00; 
			return price; 
		}
        else if(foodName == "ChickenLasagnaPizzaHut") { 
			price = 255.00; 
			return price; 
		}
		else if(foodName == "ClassicVegPizza") { 
			price = 501.00; 
			return price; 
		}
        else if(foodName == "SpicyVegPizza") { 
			price = 515.00; 
			return price; 
		}
        else if(foodName == "PaneerOverloadedPizza") { 
			price = 525.00; 
			return price; 
		}
        else if(foodName == "VeggieSupremePizza") { 
			price = 535.00; 
			return price; 
		}
        else if(foodName == "MexicanVegPizza") { 
			price = 545.00; 
			return price; 
		}
        else if(foodName == "ChickenSupremePizzaHut") { 
			price = 565.00; 
			return price; 
		}
        else if(foodName == "TandooriChickenPizza") { 
			price = 575.00; 
			return price; 
		}
        else if(foodName == "BBQChickenPizza") { 
			price = 585.00; 
			return price; 
		}
        else if(foodName == "ChickenOverloadedPizza") { 
			price = 595.00; 
			return price; 
		}
        else if(foodName == "PepperoniPizzaHut") { 
			price = 605.00; 
			return price; 
		}
        else if(foodName == "VegFriesPizzaHut") { 
			price = 115.00; 
			return price; 
		}
        else if(foodName == "PeriPeriFriesPizzaHut") { 
			price = 135.00; 
			return price; 
		}
        else if(foodName == "VegBurgerPizzaHut") { 
			price = 145.00; 
			return price; 
		}
        else if(foodName == "ChickenBurgerPizzaHut") { 
			price = 175.00; 
			return price; 
		}
        else if(foodName == "VegWrapPizzaHut") { 
			price = 155.00; 
			return price; 
		}
        else if(foodName == "ChickenWrapPizzaHut") { 
			price = 185.00; 
			return price; 
		}
        else if(foodName == "VegNachosPizzaHut") { 
			price = 165.00; 
			return price; 
		}
        else if(foodName == "ChickenNachosPizzaHut") { 
			price = 195.00; 
			return price; 
		}
        else if(foodName == "ChocoBrowniePizzaHut") { 
			price = 125.00; 
			return price; 
		}
        else if(foodName == "ChocolateMoussePizzaHut") { 
			price = 135.00; 
			return price; 
		}
        else if(foodName == "RedVelvetPastry") { 
			price = 145.00; 
			return price; 
		}
        else if(foodName == "Pepsi600ml") { 
			price = 65.00; 
			return price; 
		}
        else if(foodName == "MountainDew600ml") { 
			price = 65.00; 
			return price; 
		}
        else if(foodName == "7Up600ml") { 
			price = 65.00; 
			return price; 
		}
        else if(foodName == "VegMealComboPizzaHut") { 
			price = 349.00; 
			return price; 
		}
        else if(foodName == "ChickenMealComboPizzaHut") { 
			price = 399.00; 
			return price; 
		}
        else if(foodName == "FamilyFeastCombo") { 
			price = 699.00; 
			return price; 
		}
        else if(foodName == "PartyFeastCombo") { 
			price = 899.00; 
			return price; 
		}
        else if(foodName == "ExtraCheesePizzaHut") { 
			price = 85.00; 
			return price; 
		}
        else if(foodName == "ExtraToppingsPizzaHut") { 
			price = 75.00; 
			return price; 
		}
        else if(foodName == "CheeseBurstPizzaHut") { 
			price = 95.00; 
			return price; 
		}

        else {
            System.out.println("Food not found");
        }
		
        return price;
    }
}
