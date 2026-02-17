class Zomato {

    public static double search(String foodName) {
        double price = 0.00;

        if(foodName == "Burger") { 
			price = 89.00; 
			return price; 
		}
        else if(foodName == "CheeseBurger") { 
			price = 91.00; 
			return price; 
		}
        else if(foodName == "VegPizza") { 
			price = 120.00; 
			return price; 
		}
        else if(foodName == "PaneerPizza") { 
			price = 130.00; 
			return price; 
		}
        else if(foodName == "ChickenPizza") { 
			price = 140.00; 
			return price; 
		}
        else if(foodName == "FrenchFries") { 
			price = 70.00; 
			return price; 
		}
        else if(foodName == "VegSandwich") { 
			price = 60.00; 
			return price; 
		}
        else if(foodName == "ChickenSandwich") { 
			price = 85.00; 
			return price; 
		}
        else if(foodName == "MasalaDosa") { 
			price = 55.00; 
			return price; 
		}
        else if(foodName == "PlainDosa") { 
			price = 45.00; 
			return price; 
		}
        else if(foodName == "Idli") { 
			price = 40.00; 
			return price; 
		}
        else if(foodName == "Vada") { 
			price = 35.00; 
			return price; 
		}
        else if(foodName == "Poori") { 
			price = 50.00; 
			return price; 
		}
        else if(foodName == "Upma") { 
			price = 45.00; 
			return price; 
		}
        else if(foodName == "VegBiryani") { 
			price = 110.00; 
			return price; 
		}
        else if(foodName == "ChickenBiryani") { 
			price = 150.00; 
			return price; 
		}
        else if(foodName == "MuttonBiryani") { 
			price = 180.00; 
			return price; 
		}
        else if(foodName == "EggBiryani") { 
			price = 130.00; 
			return price; 
		}
        else if(foodName == "PaneerButterMasala") { 
			price = 140.00; 
			return price; 
		}
        else if(foodName == "ButterNaan") { 
			price = 35.00; 
			return price; 
		}
        else if(foodName == "TandooriRoti") { 
			price = 30.00; 
			return price; 
		}
        else if(foodName == "VegPulao") { 
			price = 100.00; 
			return price; 
		}
        else if(foodName == "JeeraRice") { 
			price = 90.00; 
			return price; 
		}
        else if(foodName == "CurdRice") { 
			price = 60.00; 
			return price; 
		}
        else if(foodName == "FriedRice") { 
			price = 95.00; 
			return price; 
		}
        else if(foodName == "VegNoodles") { 
			price = 90.00; 
			return price; 
		}
        else if(foodName == "ChickenNoodles") { 
			price = 110.00; 
			return price; 
		}
        else if(foodName == "Manchurian") { 
			price = 85.00; 
			return price; 
		}
        else if(foodName == "Gobi65") { 
			price = 80.00; 
			return price; 
		}
        else if(foodName == "Chicken65") { 
			price = 120.00; 
			return price; 
		}
        else if(foodName == "FishFry") { 
			price = 140.00; 
			return price; 
		}
        else if(foodName == "ChickenKabab") { 
			price = 130.00; 
			return price; 
		}
        else if(foodName == "MuttonKabab") { 
			price = 160.00; 
			return price; 
		}
        else if(foodName == "PavBhaji") { 
			price = 90.00; 
			return price; 
		}
        else if(foodName == "VadaPav") { 
			price = 45.00; 
			return price; 
		}
        else if(foodName == "Samosa") { 
			price = 25.00; 
			return price; 
		}
        else if(foodName == "Cutlet") { 
			price = 30.00; 
			return price; 
		}
        else if(foodName == "SpringRoll") { 
			price = 70.00; 
			return price; 
		}
        else if(foodName == "VegWrap") { 
			price = 85.00; 
			return price; 
		}
        else if(foodName == "ChickenWrap") { 
			price = 105.00; 
			return price; 
		}
        else if(foodName == "MilkShake") { 
			price = 65.00; 
			return price; 
		}
        else if(foodName == "ColdCoffee") { 
			price = 75.00; 
			return price; 
		}
        else if(foodName == "LimeJuice") { 
			price = 40.00; 
			return price; 
		}
        else if(foodName == "Falooda") { 
			price = 95.00; 
			return price; 
		}
        else if(foodName == "IceCream") { 
			price = 60.00; 
			return price; 
		}
        else if(foodName == "Brownie") { 
			price = 70.00; 
			return price; 
		}
        else if(foodName == "GulabJamun") { 
			price = 50.00; 
			return price; 
		}
        else if(foodName == "Rasgulla") { 
			price = 55.00; 
			return price; 
		}
        else {
            System.out.println("Food not found");
        }
		
        return price;
    }
}
