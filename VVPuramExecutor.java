class VVPuramExecutor {
	public static void main(String[] args) {
/*
		FoodStreet foodStreet1 = new FoodStreet();
		foodStreet1.foodId = 1;
		foodStreet1.foodName = "Masala Dosa";
		foodStreet1.cuisine = "South Indian";
		foodStreet1.price = 60.0;
		foodStreet1.isVeg = true;
		VVPuram vVPuram1 = new VVPuram();
		vVPuram1.vvpuramId = 1;
		vVPuram1.streetName = "VV Puram Food Street";
		vVPuram1.city = "Bangalore";
		vVPuram1.totalStalls = 80;
		vVPuram1.isOpenAtNight = true;
		vVPuram1.foodStreet = foodStreet1;
		vVPuram1.getVVPuramDetails();

		FoodStreet foodStreet2 = new FoodStreet();
		foodStreet2.foodId = 2;
		foodStreet2.foodName = "Egg Bhurji";
		foodStreet2.cuisine = "Street Food";
		foodStreet2.price = 80.0;
		foodStreet2.isVeg = false;
		VVPuram vVPuram2 = new VVPuram();
		vVPuram2.vvpuramId = 2;
		vVPuram2.streetName = "VV Puram Food Street";
		vVPuram2.city = "Bangalore";
		vVPuram2.totalStalls = 80;
		vVPuram2.isOpenAtNight = true;
		vVPuram2.foodStreet = foodStreet2;
		vVPuram2.getVVPuramDetails();

		FoodStreet foodStreet3 = new FoodStreet();
		foodStreet3.foodId = 3;
		foodStreet3.foodName = "Pani Puri";
		foodStreet3.cuisine = "Chaat";
		foodStreet3.price = 40.0;
		foodStreet3.isVeg = true;
		VVPuram vVPuram3 = new VVPuram();
		vVPuram3.vvpuramId = 3;
		vVPuram3.streetName = "Chaat Bazaar";
		vVPuram3.city = "Delhi";
		vVPuram3.totalStalls = 120;
		vVPuram3.isOpenAtNight = true;
		vVPuram3.foodStreet = foodStreet3;
		vVPuram3.getVVPuramDetails();

		FoodStreet foodStreet4 = new FoodStreet();
		foodStreet4.foodId = 4;
		foodStreet4.foodName = "Gobi Manchurian";
		foodStreet4.cuisine = "Indo Chinese";
		foodStreet4.price = 100.0;
		foodStreet4.isVeg = true;
		VVPuram vVPuram4 = new VVPuram();
		vVPuram4.vvpuramId = 4;
		vVPuram4.streetName = "Rajajinagar Food Street";
		vVPuram4.city = "Bangalore";
		vVPuram4.totalStalls = 60;
		vVPuram4.isOpenAtNight = true;
		vVPuram4.foodStreet = foodStreet4;
		vVPuram4.getVVPuramDetails();

		FoodStreet foodStreet5 = new FoodStreet();
		foodStreet5.foodId = 5;
		foodStreet5.foodName = "Vada Pav";
		foodStreet5.cuisine = "Maharashtrian";
		foodStreet5.price = 30.0;
		foodStreet5.isVeg = true;
		VVPuram vVPuram5 = new VVPuram();
		vVPuram5.vvpuramId = 5;
		vVPuram5.streetName = "Juhu Beach Food";
		vVPuram5.city = "Mumbai";
		vVPuram5.totalStalls = 100;
		vVPuram5.isOpenAtNight = true;
		vVPuram5.foodStreet = foodStreet5;
		vVPuram5.getVVPuramDetails();

		FoodStreet foodStreet6 = new FoodStreet();
		foodStreet6.foodId = 6;
		foodStreet6.foodName = "Chole Bhature";
		foodStreet6.cuisine = "North Indian";
		foodStreet6.price = 80.0;
		foodStreet6.isVeg = true;
		VVPuram vVPuram6 = new VVPuram();
		vVPuram6.vvpuramId = 6;
		vVPuram6.streetName = "Sarojini Nagar Street";
		vVPuram6.city = "Delhi";
		vVPuram6.totalStalls = 90;
		vVPuram6.isOpenAtNight = true;
		vVPuram6.foodStreet = foodStreet6;
		vVPuram6.getVVPuramDetails();

		FoodStreet foodStreet7 = new FoodStreet();
		foodStreet7.foodId = 7;
		foodStreet7.foodName = "Mirchi Bajji";
		foodStreet7.cuisine = "South Indian";
		foodStreet7.price = 50.0;
		foodStreet7.isVeg = true;
		VVPuram vVPuram7 = new VVPuram();
		vVPuram7.vvpuramId = 7;
		vVPuram7.streetName = "Sowcarpet Street";
		vVPuram7.city = "Chennai";
		vVPuram7.totalStalls = 70;
		vVPuram7.isOpenAtNight = true;
		vVPuram7.foodStreet = foodStreet7;
		vVPuram7.getVVPuramDetails();

		FoodStreet foodStreet8 = new FoodStreet();
		foodStreet8.foodId = 8;
		foodStreet8.foodName = "Biryani";
		foodStreet8.cuisine = "Hyderabadi";
		foodStreet8.price = 150.0;
		foodStreet8.isVeg = false;
		VVPuram vVPuram8 = new VVPuram();
		vVPuram8.vvpuramId = 8;
		vVPuram8.streetName = "Charminar Food Lane";
		vVPuram8.city = "Hyderabad";
		vVPuram8.totalStalls = 110;
		vVPuram8.isOpenAtNight = true;
		vVPuram8.foodStreet = foodStreet8;
		vVPuram8.getVVPuramDetails();

		FoodStreet foodStreet9 = new FoodStreet();
		foodStreet9.foodId = 9;
		foodStreet9.foodName = "Chicken Tikka Roll";
		foodStreet9.cuisine = "Mughlai";
		foodStreet9.price = 120.0;
		foodStreet9.isVeg = false;
		VVPuram vVPuram9 = new VVPuram();
		vVPuram9.vvpuramId = 9;
		vVPuram9.streetName = "Bandra Street Food";
		vVPuram9.city = "Mumbai";
		vVPuram9.totalStalls = 85;
		vVPuram9.isOpenAtNight = true;
		vVPuram9.foodStreet = foodStreet9;
		vVPuram9.getVVPuramDetails();

		FoodStreet foodStreet10 = new FoodStreet();
		foodStreet10.foodId = 10;
		foodStreet10.foodName = "Idli Vada";
		foodStreet10.cuisine = "South Indian";
		foodStreet10.price = 50.0;
		foodStreet10.isVeg = true;
		VVPuram vVPuram10 = new VVPuram();
		vVPuram10.vvpuramId = 10;
		vVPuram10.streetName = "Malleshwaram 8th Cross";
		vVPuram10.city = "Bangalore";
		vVPuram10.totalStalls = 65;
		vVPuram10.isOpenAtNight = true;
		vVPuram10.foodStreet = foodStreet10;
		vVPuram10.getVVPuramDetails();

		FoodStreet foodStreet11 = new FoodStreet();
		foodStreet11.foodId = 11;
		foodStreet11.foodName = "Dhokla";
		foodStreet11.cuisine = "Gujarati";
		foodStreet11.price = 60.0;
		foodStreet11.isVeg = true;
		VVPuram vVPuram11 = new VVPuram();
		vVPuram11.vvpuramId = 11;
		vVPuram11.streetName = "Manek Chowk";
		vVPuram11.city = "Ahmedabad";
		vVPuram11.totalStalls = 150;
		vVPuram11.isOpenAtNight = true;
		vVPuram11.foodStreet = foodStreet11;
		vVPuram11.getVVPuramDetails();

		FoodStreet foodStreet12 = new FoodStreet();
		foodStreet12.foodId = 12;
		foodStreet12.foodName = "Kathi Roll";
		foodStreet12.cuisine = "Bengali";
		foodStreet12.price = 70.0;
		foodStreet12.isVeg = false;
		VVPuram vVPuram12 = new VVPuram();
		vVPuram12.vvpuramId = 12;
		vVPuram12.streetName = "New Market Food Lane";
		vVPuram12.city = "Kolkata";
		vVPuram12.totalStalls = 80;
		vVPuram12.isOpenAtNight = true;
		vVPuram12.foodStreet = foodStreet12;
		vVPuram12.getVVPuramDetails();

		FoodStreet foodStreet13 = new FoodStreet();
		foodStreet13.foodId = 13;
		foodStreet13.foodName = "Poha Jalebi";
		foodStreet13.cuisine = "Madhya Pradesh";
		foodStreet13.price = 50.0;
		foodStreet13.isVeg = true;
		VVPuram vVPuram13 = new VVPuram();
		vVPuram13.vvpuramId = 13;
		vVPuram13.streetName = "Sarafa Bazaar";
		vVPuram13.city = "Indore";
		vVPuram13.totalStalls = 100;
		vVPuram13.isOpenAtNight = true;
		vVPuram13.foodStreet = foodStreet13;
		vVPuram13.getVVPuramDetails();

		FoodStreet foodStreet14 = new FoodStreet();
		foodStreet14.foodId = 14;
		foodStreet14.foodName = "Parathe Wali Gali";
		foodStreet14.cuisine = "North Indian";
		foodStreet14.price = 100.0;
		foodStreet14.isVeg = true;
		VVPuram vVPuram14 = new VVPuram();
		vVPuram14.vvpuramId = 14;
		vVPuram14.streetName = "Chandni Chowk";
		vVPuram14.city = "Delhi";
		vVPuram14.totalStalls = 200;
		vVPuram14.isOpenAtNight = true;
		vVPuram14.foodStreet = foodStreet14;
		vVPuram14.getVVPuramDetails();

		FoodStreet foodStreet15 = new FoodStreet();
		foodStreet15.foodId = 15;
		foodStreet15.foodName = "Pizza";
		foodStreet15.cuisine = "Italian";
		foodStreet15.price = 200.0;
		foodStreet15.isVeg = true;
		VVPuram vVPuram15 = new VVPuram();
		vVPuram15.vvpuramId = 15;
		vVPuram15.streetName = "Brigade Road";
		vVPuram15.city = "Bangalore";
		vVPuram15.totalStalls = 75;
		vVPuram15.isOpenAtNight = true;
		vVPuram15.foodStreet = foodStreet15;
		vVPuram15.getVVPuramDetails();

		FoodStreet foodStreet16 = new FoodStreet();
		foodStreet16.foodId = 16;
		foodStreet16.foodName = "Punugulu";
		foodStreet16.cuisine = "Andhra";
		foodStreet16.price = 40.0;
		foodStreet16.isVeg = true;
		VVPuram vVPuram16 = new VVPuram();
		vVPuram16.vvpuramId = 16;
		vVPuram16.streetName = "Asilmetta Jn";
		vVPuram16.city = "Vizag";
		vVPuram16.totalStalls = 55;
		vVPuram16.isOpenAtNight = true;
		vVPuram16.foodStreet = foodStreet16;
		vVPuram16.getVVPuramDetails();

		FoodStreet foodStreet17 = new FoodStreet();
		foodStreet17.foodId = 17;
		foodStreet17.foodName = "Crepe";
		foodStreet17.cuisine = "French";
		foodStreet17.price = 120.0;
		foodStreet17.isVeg = true;
		VVPuram vVPuram17 = new VVPuram();
		vVPuram17.vvpuramId = 17;
		vVPuram17.streetName = "Beach Road Stalls";
		vVPuram17.city = "Pondicherry";
		vVPuram17.totalStalls = 45;
		vVPuram17.isOpenAtNight = true;
		vVPuram17.foodStreet = foodStreet17;
		vVPuram17.getVVPuramDetails();

		FoodStreet foodStreet18 = new FoodStreet();
		foodStreet18.foodId = 18;
		foodStreet18.foodName = "Shawarma";
		foodStreet18.cuisine = "Arabic";
		foodStreet18.price = 130.0;
		foodStreet18.isVeg = false;
		VVPuram vVPuram18 = new VVPuram();
		vVPuram18.vvpuramId = 18;
		vVPuram18.streetName = "Spencers Road";
		vVPuram18.city = "Bangalore";
		vVPuram18.totalStalls = 68;
		vVPuram18.isOpenAtNight = true;
		vVPuram18.foodStreet = foodStreet18;
		vVPuram18.getVVPuramDetails();

		FoodStreet foodStreet19 = new FoodStreet();
		foodStreet19.foodId = 19;
		foodStreet19.foodName = "Pav Bhaji";
		foodStreet19.cuisine = "Maharashtrian";
		foodStreet19.price = 90.0;
		foodStreet19.isVeg = true;
		VVPuram vVPuram19 = new VVPuram();
		vVPuram19.vvpuramId = 19;
		vVPuram19.streetName = "Kamala Mills";
		vVPuram19.city = "Mumbai";
		vVPuram19.totalStalls = 95;
		vVPuram19.isOpenAtNight = true;
		vVPuram19.foodStreet = foodStreet19;
		vVPuram19.getVVPuramDetails();

		FoodStreet foodStreet20 = new FoodStreet();
		foodStreet20.foodId = 20;
		foodStreet20.foodName = "Dal Baati Churma";
		foodStreet20.cuisine = "Rajasthani";
		foodStreet20.price = 110.0;
		foodStreet20.isVeg = true;
		VVPuram vVPuram20 = new VVPuram();
		vVPuram20.vvpuramId = 20;
		vVPuram20.streetName = "Govind Bhawan Lane";
		vVPuram20.city = "Jaipur";
		vVPuram20.totalStalls = 72;
		vVPuram20.isOpenAtNight = true;
		vVPuram20.foodStreet = foodStreet20;
		vVPuram20.getVVPuramDetails(); */

		FoodStreet foodStreet1 = new FoodStreet(1, "Masala Dosa", "South Indian", 60.0, true);
		VVPuram vVPuram1 = new VVPuram(1, "VV Puram Food Street", "Bangalore", 80, true, foodStreet1);
		vVPuram1.getVVPuramDetails();

		FoodStreet foodStreet2 = new FoodStreet(2, "Egg Bhurji", "Street Food", 80.0, false);
		VVPuram vVPuram2 = new VVPuram(2, "VV Puram Food Street", "Bangalore", 80, true, foodStreet2);
		vVPuram2.getVVPuramDetails();

		FoodStreet foodStreet3 = new FoodStreet(3, "Pani Puri", "Chaat", 40.0, true);
		VVPuram vVPuram3 = new VVPuram(3, "Chaat Bazaar", "Delhi", 120, true, foodStreet3);
		vVPuram3.getVVPuramDetails();

		FoodStreet foodStreet4 = new FoodStreet(4, "Gobi Manchurian", "Indo Chinese", 100.0, true);
		VVPuram vVPuram4 = new VVPuram(4, "Rajajinagar Food Street", "Bangalore", 60, true, foodStreet4);
		vVPuram4.getVVPuramDetails();

		FoodStreet foodStreet5 = new FoodStreet(5, "Vada Pav", "Maharashtrian", 30.0, true);
		VVPuram vVPuram5 = new VVPuram(5, "Juhu Beach Food", "Mumbai", 100, true, foodStreet5);
		vVPuram5.getVVPuramDetails();

		FoodStreet foodStreet6 = new FoodStreet(6, "Chole Bhature", "North Indian", 80.0, true);
		VVPuram vVPuram6 = new VVPuram(6, "Sarojini Nagar Street", "Delhi", 90, true, foodStreet6);
		vVPuram6.getVVPuramDetails();

		FoodStreet foodStreet7 = new FoodStreet(7, "Mirchi Bajji", "South Indian", 50.0, true);
		VVPuram vVPuram7 = new VVPuram(7, "Sowcarpet Street", "Chennai", 70, true, foodStreet7);
		vVPuram7.getVVPuramDetails();

		FoodStreet foodStreet8 = new FoodStreet(8, "Biryani", "Hyderabadi", 150.0, false);
		VVPuram vVPuram8 = new VVPuram(8, "Charminar Food Lane", "Hyderabad", 110, true, foodStreet8);
		vVPuram8.getVVPuramDetails();

		FoodStreet foodStreet9 = new FoodStreet(9, "Chicken Tikka Roll", "Mughlai", 120.0, false);
		VVPuram vVPuram9 = new VVPuram(9, "Bandra Street Food", "Mumbai", 85, true, foodStreet9);
		vVPuram9.getVVPuramDetails();

		FoodStreet foodStreet10 = new FoodStreet(10, "Idli Vada", "South Indian", 50.0, true);
		VVPuram vVPuram10 = new VVPuram(10, "Malleshwaram 8th Cross", "Bangalore", 65, true, foodStreet10);
		vVPuram10.getVVPuramDetails();

		FoodStreet foodStreet11 = new FoodStreet(11, "Dhokla", "Gujarati", 60.0, true);
		VVPuram vVPuram11 = new VVPuram(11, "Manek Chowk", "Ahmedabad", 150, true, foodStreet11);
		vVPuram11.getVVPuramDetails();

		FoodStreet foodStreet12 = new FoodStreet(12, "Kathi Roll", "Bengali", 70.0, false);
		VVPuram vVPuram12 = new VVPuram(12, "New Market Food Lane", "Kolkata", 80, true, foodStreet12);
		vVPuram12.getVVPuramDetails();

		FoodStreet foodStreet13 = new FoodStreet(13, "Poha Jalebi", "Madhya Pradesh", 50.0, true);
		VVPuram vVPuram13 = new VVPuram(13, "Sarafa Bazaar", "Indore", 100, true, foodStreet13);
		vVPuram13.getVVPuramDetails();

		FoodStreet foodStreet14 = new FoodStreet(14, "Parathe Wali Gali", "North Indian", 100.0, true);
		VVPuram vVPuram14 = new VVPuram(14, "Chandni Chowk", "Delhi", 200, true, foodStreet14);
		vVPuram14.getVVPuramDetails();

		FoodStreet foodStreet15 = new FoodStreet(15, "Pizza", "Italian", 200.0, true);
		VVPuram vVPuram15 = new VVPuram(15, "Brigade Road", "Bangalore", 75, true, foodStreet15);
		vVPuram15.getVVPuramDetails();

		FoodStreet foodStreet16 = new FoodStreet(16, "Punugulu", "Andhra", 40.0, true);
		VVPuram vVPuram16 = new VVPuram(16, "Asilmetta Junction", "Vizag", 55, true, foodStreet16);
		vVPuram16.getVVPuramDetails();

		FoodStreet foodStreet17 = new FoodStreet(17, "Crepe", "French", 120.0, true);
		VVPuram vVPuram17 = new VVPuram(17, "Beach Road Stalls", "Pondicherry", 45, true, foodStreet17);
		vVPuram17.getVVPuramDetails();

		FoodStreet foodStreet18 = new FoodStreet(18, "Shawarma", "Arabic", 130.0, false);
		VVPuram vVPuram18 = new VVPuram(18, "Spencers Road", "Bangalore", 68, true, foodStreet18);
		vVPuram18.getVVPuramDetails();

		FoodStreet foodStreet19 = new FoodStreet(19, "Pav Bhaji", "Maharashtrian", 90.0, true);
		VVPuram vVPuram19 = new VVPuram(19, "Kamala Mills", "Mumbai", 95, true, foodStreet19);
		vVPuram19.getVVPuramDetails();

		FoodStreet foodStreet20 = new FoodStreet(20, "Dal Baati Churma", "Rajasthani", 110.0, true);
		VVPuram vVPuram20 = new VVPuram(20, "Govind Bhawan Lane", "Jaipur", 72, true, foodStreet20);
		vVPuram20.getVVPuramDetails();


	}
}