class Dominos {

    public static double search(String foodName) {
        double price = 0.00;

        if(foodName == "GarlicBreadClassic") { 
			price = 145.00; 
			return price; 
		}
        else if(foodName == "GarlicBreadStuffed") { 
			price = 165.00; 
			return price; 
		}
        else if(foodName == "CheesyDip") { 
			price = 65.00; 
			return price; 
		}
        else if(foodName == "CheeseJalapenoDip") { 
			price = 75.00; 
			return price; 
		}
        else if(foodName == "VegPastaItaliano") { 
			price = 195.00; 
			return price; 
		}
        else if(foodName == "ChickenPastaItaliano") { 
			price = 225.00; 
			return price; 
		}
		else if(foodName == "MargheritaPizza") { 
			price = 401.00; 
			return price; 
		}
        else if(foodName == "DoubleCheesePizza") { 
			price = 415.00; 
			return price; 
		}
        else if(foodName == "FarmFreshPizza") { 
			price = 425.00; 
			return price; 
		}
        else if(foodName == "PeppyPaneerPizza") { 
			price = 435.00; 
			return price; 
		}
        else if(foodName == "VegExtravaganza") { 
			price = 445.00; 
			return price; 
		}
        else if(foodName == "ChickenGoldenDelight") { 
			price = 465.00; 
			return price; 
		}
        else if(foodName == "PepperBarbecueChicken") { 
			price = 475.00; 
			return price; 
		}
        else if(foodName == "ChickenFiesta") { 
			price = 485.00; 
			return price; 
		}
        else if(foodName == "IndiChickenTikka") { 
			price = 495.00; 
			return price; 
		}
        else if(foodName == "VegLoadedPizza") { 
			price = 455.00; 
			return price; 
		}
        else if(foodName == "VegParcel") { 
			price = 120.00; 
			return price; 
		}
        else if(foodName == "ChickenParcel") { 
			price = 150.00; 
			return price; 
		}
        else if(foodName == "VegBurgerDominos") { 
			price = 110.00; 
			return price; 
		}
        else if(foodName == "ChickenBurgerDominos") { 
			price = 140.00; 
			return price; 
		}
        else if(foodName == "VegWrapDominos") { 
			price = 130.00; 
			return price; 
		}
        else if(foodName == "ChickenWrapDominos") { 
			price = 160.00; 
			return price; 
		}
        else if(foodName == "VegMomoDominos") { 
			price = 135.00; 
			return price; 
		}
        else if(foodName == "ChickenMomoDominos") { 
			price = 165.00; 
			return price; 
		}
        else if(foodName == "VegFriesDominos") { 
			price = 95.00; 
			return price; 
		}
        else if(foodName == "PeriPeriFries") { 
			price = 115.00; 
			return price; 
		}
        else if(foodName == "ChocoLavaCakeDominos") { 
			price = 99.00; 
			return price; 
		}
        else if(foodName == "ButterscotchMousse") { 
			price = 105.00; 
			return price; 
		}
        else if(foodName == "ChocolateBrownieDominos") { 
			price = 110.00; 
			return price; 
		}
        else if(foodName == "RedVelvetCake") { 
			price = 125.00; 
			return price; 
		}
        else if(foodName == "Coke500ml") { 
			price = 60.00; 
			return price; 
		}
        else if(foodName == "Sprite500ml") { 
			price = 60.00; 
			return price; 
		}
        else if(foodName == "Fanta500ml") { 
			price = 60.00; 
			return price; 
		}
        else if(foodName == "MineralWaterDominos") { 
			price = 35.00; 
			return price; 
		}
        else if(foodName == "VegComboMeal") { 
			price = 299.00; 
			return price; 
		}
        else if(foodName == "ChickenComboMeal") { 
			price = 349.00; 
			return price; 
		}
        else if(foodName == "FamilyPizzaCombo") { 
			price = 599.00; 
			return price; 
		}
        else if(foodName == "PartyPizzaCombo") { 
			price = 799.00; 
			return price; 
		}
        else if(foodName == "CheeseBurstAddon") { 
			price = 80.00; 
			return price; 
		}
        else if(foodName == "ExtraToppingsAddon") { 
			price = 70.00; 
			return price; 
		}
        else if(foodName == "ExtraCheeseAddon") { 
			price = 75.00; 
			return price; 
		}

        else {
            System.out.println("Food not found");
        }
		
        return price;
    }
}
