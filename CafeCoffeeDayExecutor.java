class CafeCoffeeDayExecutor {
	public static void main(String[] args) {
/*
		Coffee coffee1 = new Coffee();
		coffee1.coffeeId = 1;
		coffee1.coffeeName = "Cappuccino";
		coffee1.type = "Espresso Based";
		coffee1.price = 180.0;
		coffee1.isHot = true;
		CafeCoffeeDay cafeCoffeeDay1 = new CafeCoffeeDay();
		cafeCoffeeDay1.cafeId = 1;
		cafeCoffeeDay1.branchName = "CCD Indiranagar";
		cafeCoffeeDay1.location = "Bangalore";
		cafeCoffeeDay1.seatingCapacity = 40;
		cafeCoffeeDay1.hasWifi = true;
		cafeCoffeeDay1.coffee = coffee1;
		cafeCoffeeDay1.getCafeCoffeeDayDetails();

		Coffee coffee2 = new Coffee();
		coffee2.coffeeId = 2;
		coffee2.coffeeName = "Cold Coffee";
		coffee2.type = "Cold Brew";
		coffee2.price = 200.0;
		coffee2.isHot = false;
		CafeCoffeeDay cafeCoffeeDay2 = new CafeCoffeeDay();
		cafeCoffeeDay2.cafeId = 2;
		cafeCoffeeDay2.branchName = "CCD MG Road";
		cafeCoffeeDay2.location = "Bangalore";
		cafeCoffeeDay2.seatingCapacity = 60;
		cafeCoffeeDay2.hasWifi = true;
		cafeCoffeeDay2.coffee = coffee2;
		cafeCoffeeDay2.getCafeCoffeeDayDetails();

		Coffee coffee3 = new Coffee();
		coffee3.coffeeId = 3;
		coffee3.coffeeName = "Cafe Latte";
		coffee3.type = "Espresso Based";
		coffee3.price = 190.0;
		coffee3.isHot = true;
		CafeCoffeeDay cafeCoffeeDay3 = new CafeCoffeeDay();
		cafeCoffeeDay3.cafeId = 3;
		cafeCoffeeDay3.branchName = "CCD Bandra";
		cafeCoffeeDay3.location = "Mumbai";
		cafeCoffeeDay3.seatingCapacity = 50;
		cafeCoffeeDay3.hasWifi = true;
		cafeCoffeeDay3.coffee = coffee3;
		cafeCoffeeDay3.getCafeCoffeeDayDetails();

		Coffee coffee4 = new Coffee();
		coffee4.coffeeId = 4;
		coffee4.coffeeName = "Americano";
		coffee4.type = "Espresso Based";
		coffee4.price = 160.0;
		coffee4.isHot = true;
		CafeCoffeeDay cafeCoffeeDay4 = new CafeCoffeeDay();
		cafeCoffeeDay4.cafeId = 4;
		cafeCoffeeDay4.branchName = "CCD Connaught Place";
		cafeCoffeeDay4.location = "Delhi";
		cafeCoffeeDay4.seatingCapacity = 70;
		cafeCoffeeDay4.hasWifi = true;
		cafeCoffeeDay4.coffee = coffee4;
		cafeCoffeeDay4.getCafeCoffeeDayDetails();

		Coffee coffee5 = new Coffee();
		coffee5.coffeeId = 5;
		coffee5.coffeeName = "Mocha";
		coffee5.type = "Espresso Based";
		coffee5.price = 210.0;
		coffee5.isHot = true;
		CafeCoffeeDay cafeCoffeeDay5 = new CafeCoffeeDay();
		cafeCoffeeDay5.cafeId = 5;
		cafeCoffeeDay5.branchName = "CCD Anna Nagar";
		cafeCoffeeDay5.location = "Chennai";
		cafeCoffeeDay5.seatingCapacity = 45;
		cafeCoffeeDay5.hasWifi = true;
		cafeCoffeeDay5.coffee = coffee5;
		cafeCoffeeDay5.getCafeCoffeeDayDetails();

		Coffee coffee6 = new Coffee();
		coffee6.coffeeId = 6;
		coffee6.coffeeName = "Frappe";
		coffee6.type = "Blended";
		coffee6.price = 220.0;
		coffee6.isHot = false;
		CafeCoffeeDay cafeCoffeeDay6 = new CafeCoffeeDay();
		cafeCoffeeDay6.cafeId = 6;
		cafeCoffeeDay6.branchName = "CCD Banjara Hills";
		cafeCoffeeDay6.location = "Hyderabad";
		cafeCoffeeDay6.seatingCapacity = 55;
		cafeCoffeeDay6.hasWifi = true;
		cafeCoffeeDay6.coffee = coffee6;
		cafeCoffeeDay6.getCafeCoffeeDayDetails();

		Coffee coffee7 = new Coffee();
		coffee7.coffeeId = 7;
		coffee7.coffeeName = "Flat White";
		coffee7.type = "Espresso Based";
		coffee7.price = 195.0;
		coffee7.isHot = true;
		CafeCoffeeDay cafeCoffeeDay7 = new CafeCoffeeDay();
		cafeCoffeeDay7.cafeId = 7;
		cafeCoffeeDay7.branchName = "CCD Koregaon Park";
		cafeCoffeeDay7.location = "Pune";
		cafeCoffeeDay7.seatingCapacity = 65;
		cafeCoffeeDay7.hasWifi = true;
		cafeCoffeeDay7.coffee = coffee7;
		cafeCoffeeDay7.getCafeCoffeeDayDetails();

		Coffee coffee8 = new Coffee();
		coffee8.coffeeId = 8;
		coffee8.coffeeName = "Macchiato";
		coffee8.type = "Espresso Based";
		coffee8.price = 175.0;
		coffee8.isHot = true;
		CafeCoffeeDay cafeCoffeeDay8 = new CafeCoffeeDay();
		cafeCoffeeDay8.cafeId = 8;
		cafeCoffeeDay8.branchName = "CCD Park Street";
		cafeCoffeeDay8.location = "Kolkata";
		cafeCoffeeDay8.seatingCapacity = 48;
		cafeCoffeeDay8.hasWifi = true;
		cafeCoffeeDay8.coffee = coffee8;
		cafeCoffeeDay8.getCafeCoffeeDayDetails();

		Coffee coffee9 = new Coffee();
		coffee9.coffeeId = 9;
		coffee9.coffeeName = "Cold Foam";
		coffee9.type = "Cold Brew";
		coffee9.price = 215.0;
		coffee9.isHot = false;
		CafeCoffeeDay cafeCoffeeDay9 = new CafeCoffeeDay();
		cafeCoffeeDay9.cafeId = 9;
		cafeCoffeeDay9.branchName = "CCD CG Road";
		cafeCoffeeDay9.location = "Ahmedabad";
		cafeCoffeeDay9.seatingCapacity = 42;
		cafeCoffeeDay9.hasWifi = true;
		cafeCoffeeDay9.coffee = coffee9;
		cafeCoffeeDay9.getCafeCoffeeDayDetails();

		Coffee coffee10 = new Coffee();
		coffee10.coffeeId = 10;
		coffee10.coffeeName = "Espresso";
		coffee10.type = "Pure Espresso";
		coffee10.price = 140.0;
		coffee10.isHot = true;
		CafeCoffeeDay cafeCoffeeDay10 = new CafeCoffeeDay();
		cafeCoffeeDay10.cafeId = 10;
		cafeCoffeeDay10.branchName = "CCD FC Road";
		cafeCoffeeDay10.location = "Pune";
		cafeCoffeeDay10.seatingCapacity = 58;
		cafeCoffeeDay10.hasWifi = true;
		cafeCoffeeDay10.coffee = coffee10;
		cafeCoffeeDay10.getCafeCoffeeDayDetails();

		Coffee coffee11 = new Coffee();
		coffee11.coffeeId = 11;
		coffee11.coffeeName = "Irish Coffee";
		coffee11.type = "Special";
		coffee11.price = 250.0;
		coffee11.isHot = true;
		CafeCoffeeDay cafeCoffeeDay11 = new CafeCoffeeDay();
		cafeCoffeeDay11.cafeId = 11;
		cafeCoffeeDay11.branchName = "CCD Jubilee Hills";
		cafeCoffeeDay11.location = "Hyderabad";
		cafeCoffeeDay11.seatingCapacity = 52;
		cafeCoffeeDay11.hasWifi = true;
		cafeCoffeeDay11.coffee = coffee11;
		cafeCoffeeDay11.getCafeCoffeeDayDetails();

		Coffee coffee12 = new Coffee();
		coffee12.coffeeId = 12;
		coffee12.coffeeName = "Caramel Latte";
		coffee12.type = "Espresso Based";
		coffee12.price = 230.0;
		coffee12.isHot = true;
		CafeCoffeeDay cafeCoffeeDay12 = new CafeCoffeeDay();
		cafeCoffeeDay12.cafeId = 12;
		cafeCoffeeDay12.branchName = "CCD Salt Lake";
		cafeCoffeeDay12.location = "Kolkata";
		cafeCoffeeDay12.seatingCapacity = 38;
		cafeCoffeeDay12.hasWifi = true;
		cafeCoffeeDay12.coffee = coffee12;
		cafeCoffeeDay12.getCafeCoffeeDayDetails();

		Coffee coffee13 = new Coffee();
		coffee13.coffeeId = 13;
		coffee13.coffeeName = "Hazelnut Coffee";
		coffee13.type = "Flavored";
		coffee13.price = 240.0;
		coffee13.isHot = true;
		CafeCoffeeDay cafeCoffeeDay13 = new CafeCoffeeDay();
		cafeCoffeeDay13.cafeId = 13;
		cafeCoffeeDay13.branchName = "CCD Whitefield";
		cafeCoffeeDay13.location = "Bangalore";
		cafeCoffeeDay13.seatingCapacity = 62;
		cafeCoffeeDay13.hasWifi = true;
		cafeCoffeeDay13.coffee = coffee13;
		cafeCoffeeDay13.getCafeCoffeeDayDetails();

		Coffee coffee14 = new Coffee();
		coffee14.coffeeId = 14;
		coffee14.coffeeName = "Iced Latte";
		coffee14.type = "Cold Brew";
		coffee14.price = 205.0;
		coffee14.isHot = false;
		CafeCoffeeDay cafeCoffeeDay14 = new CafeCoffeeDay();
		cafeCoffeeDay14.cafeId = 14;
		cafeCoffeeDay14.branchName = "CCD Powai";
		cafeCoffeeDay14.location = "Mumbai";
		cafeCoffeeDay14.seatingCapacity = 56;
		cafeCoffeeDay14.hasWifi = true;
		cafeCoffeeDay14.coffee = coffee14;
		cafeCoffeeDay14.getCafeCoffeeDayDetails();

		Coffee coffee15 = new Coffee();
		coffee15.coffeeId = 15;
		coffee15.coffeeName = "Black Coffee";
		coffee15.type = "Filter";
		coffee15.price = 120.0;
		coffee15.isHot = true;
		CafeCoffeeDay cafeCoffeeDay15 = new CafeCoffeeDay();
		cafeCoffeeDay15.cafeId = 15;
		cafeCoffeeDay15.branchName = "CCD T Nagar";
		cafeCoffeeDay15.location = "Chennai";
		cafeCoffeeDay15.seatingCapacity = 44;
		cafeCoffeeDay15.hasWifi = true;
		cafeCoffeeDay15.coffee = coffee15;
		cafeCoffeeDay15.getCafeCoffeeDayDetails();

		Coffee coffee16 = new Coffee();
		coffee16.coffeeId = 16;
		coffee16.coffeeName = "Vienna Coffee";
		coffee16.type = "Special";
		coffee16.price = 260.0;
		coffee16.isHot = true;
		CafeCoffeeDay cafeCoffeeDay16 = new CafeCoffeeDay();
		cafeCoffeeDay16.cafeId = 16;
		cafeCoffeeDay16.branchName = "CCD Viman Nagar";
		cafeCoffeeDay16.location = "Pune";
		cafeCoffeeDay16.seatingCapacity = 46;
		cafeCoffeeDay16.hasWifi = true;
		cafeCoffeeDay16.coffee = coffee16;
		cafeCoffeeDay16.getCafeCoffeeDayDetails();

		Coffee coffee17 = new Coffee();
		coffee17.coffeeId = 17;
		coffee17.coffeeName = "Affogato";
		coffee17.type = "Dessert Coffee";
		coffee17.price = 280.0;
		coffee17.isHot = true;
		CafeCoffeeDay cafeCoffeeDay17 = new CafeCoffeeDay();
		cafeCoffeeDay17.cafeId = 17;
		cafeCoffeeDay17.branchName = "CCD Gachibowli";
		cafeCoffeeDay17.location = "Hyderabad";
		cafeCoffeeDay17.seatingCapacity = 68;
		cafeCoffeeDay17.hasWifi = true;
		cafeCoffeeDay17.coffee = coffee17;
		cafeCoffeeDay17.getCafeCoffeeDayDetails();

		Coffee coffee18 = new Coffee();
		coffee18.coffeeId = 18;
		coffee18.coffeeName = "Turkish Coffee";
		coffee18.type = "Traditional";
		coffee18.price = 150.0;
		coffee18.isHot = true;
		CafeCoffeeDay cafeCoffeeDay18 = new CafeCoffeeDay();
		cafeCoffeeDay18.cafeId = 18;
		cafeCoffeeDay18.branchName = "CCD Karol Bagh";
		cafeCoffeeDay18.location = "Delhi";
		cafeCoffeeDay18.seatingCapacity = 50;
		cafeCoffeeDay18.hasWifi = true;
		cafeCoffeeDay18.coffee = coffee18;
		cafeCoffeeDay18.getCafeCoffeeDayDetails();

		Coffee coffee19 = new Coffee();
		coffee19.coffeeId = 19;
		coffee19.coffeeName = "Coconut Cold Coffee";
		coffee19.type = "Seasonal";
		coffee19.price = 225.0;
		coffee19.isHot = false;
		CafeCoffeeDay cafeCoffeeDay19 = new CafeCoffeeDay();
		cafeCoffeeDay19.cafeId = 19;
		cafeCoffeeDay19.branchName = "CCD Andheri";
		cafeCoffeeDay19.location = "Mumbai";
		cafeCoffeeDay19.seatingCapacity = 54;
		cafeCoffeeDay19.hasWifi = true;
		cafeCoffeeDay19.coffee = coffee19;
		cafeCoffeeDay19.getCafeCoffeeDayDetails();

		Coffee coffee20 = new Coffee();
		coffee20.coffeeId = 20;
		coffee20.coffeeName = "Pumpkin Spice Latte";
		coffee20.type = "Seasonal";
		coffee20.price = 270.0;
		coffee20.isHot = true;
		CafeCoffeeDay cafeCoffeeDay20 = new CafeCoffeeDay();
		cafeCoffeeDay20.cafeId = 20;
		cafeCoffeeDay20.branchName = "CCD Electronic City";
		cafeCoffeeDay20.location = "Bangalore";
		cafeCoffeeDay20.seatingCapacity = 72;
		cafeCoffeeDay20.hasWifi = true;
		cafeCoffeeDay20.coffee = coffee20;
		cafeCoffeeDay20.getCafeCoffeeDayDetails(); */

		Coffee coffee1 = new Coffee(1, "Cappuccino", "Espresso Based", 180.0, true);
		CafeCoffeeDay cafeCoffeeDay1 = new CafeCoffeeDay(1, "CCD Indiranagar", "Bangalore", 40, true, coffee1);
		cafeCoffeeDay1.getCafeCoffeeDayDetails();

		Coffee coffee2 = new Coffee(2, "Cold Coffee", "Cold Brew", 200.0, false);
		CafeCoffeeDay cafeCoffeeDay2 = new CafeCoffeeDay(2, "CCD MG Road", "Bangalore", 60, true, coffee2);
		cafeCoffeeDay2.getCafeCoffeeDayDetails();

		Coffee coffee3 = new Coffee(3, "Cafe Latte", "Espresso Based", 190.0, true);
		CafeCoffeeDay cafeCoffeeDay3 = new CafeCoffeeDay(3, "CCD Bandra", "Mumbai", 50, true, coffee3);
		cafeCoffeeDay3.getCafeCoffeeDayDetails();

		Coffee coffee4 = new Coffee(4, "Americano", "Espresso Based", 160.0, true);
		CafeCoffeeDay cafeCoffeeDay4 = new CafeCoffeeDay(4, "CCD Connaught Place", "Delhi", 70, true, coffee4);
		cafeCoffeeDay4.getCafeCoffeeDayDetails();

		Coffee coffee5 = new Coffee(5, "Mocha", "Espresso Based", 210.0, true);
		CafeCoffeeDay cafeCoffeeDay5 = new CafeCoffeeDay(5, "CCD Anna Nagar", "Chennai", 45, true, coffee5);
		cafeCoffeeDay5.getCafeCoffeeDayDetails();

		Coffee coffee6 = new Coffee(6, "Frappe", "Blended", 220.0, false);
		CafeCoffeeDay cafeCoffeeDay6 = new CafeCoffeeDay(6, "CCD Banjara Hills", "Hyderabad", 55, true, coffee6);
		cafeCoffeeDay6.getCafeCoffeeDayDetails();

		Coffee coffee7 = new Coffee(7, "Flat White", "Espresso Based", 195.0, true);
		CafeCoffeeDay cafeCoffeeDay7 = new CafeCoffeeDay(7, "CCD Koregaon Park", "Pune", 65, true, coffee7);
		cafeCoffeeDay7.getCafeCoffeeDayDetails();

		Coffee coffee8 = new Coffee(8, "Macchiato", "Espresso Based", 175.0, true);
		CafeCoffeeDay cafeCoffeeDay8 = new CafeCoffeeDay(8, "CCD Park Street", "Kolkata", 48, true, coffee8);
		cafeCoffeeDay8.getCafeCoffeeDayDetails();

		Coffee coffee9 = new Coffee(9, "Cold Foam", "Cold Brew", 215.0, false);
		CafeCoffeeDay cafeCoffeeDay9 = new CafeCoffeeDay(9, "CCD CG Road", "Ahmedabad", 42, true, coffee9);
		cafeCoffeeDay9.getCafeCoffeeDayDetails();

		Coffee coffee10 = new Coffee(10, "Espresso", "Pure Espresso", 140.0, true);
		CafeCoffeeDay cafeCoffeeDay10 = new CafeCoffeeDay(10, "CCD FC Road", "Pune", 58, true, coffee10);
		cafeCoffeeDay10.getCafeCoffeeDayDetails();

		Coffee coffee11 = new Coffee(11, "Irish Coffee", "Special", 250.0, true);
		CafeCoffeeDay cafeCoffeeDay11 = new CafeCoffeeDay(11, "CCD Jubilee Hills", "Hyderabad", 52, true, coffee11);
		cafeCoffeeDay11.getCafeCoffeeDayDetails();

		Coffee coffee12 = new Coffee(12, "Caramel Latte", "Espresso Based", 230.0, true);
		CafeCoffeeDay cafeCoffeeDay12 = new CafeCoffeeDay(12, "CCD Salt Lake", "Kolkata", 38, true, coffee12);
		cafeCoffeeDay12.getCafeCoffeeDayDetails();

		Coffee coffee13 = new Coffee(13, "Hazelnut Coffee", "Flavored", 240.0, true);
		CafeCoffeeDay cafeCoffeeDay13 = new CafeCoffeeDay(13, "CCD Whitefield", "Bangalore", 62, true, coffee13);
		cafeCoffeeDay13.getCafeCoffeeDayDetails();

		Coffee coffee14 = new Coffee(14, "Iced Latte", "Cold Brew", 205.0, false);
		CafeCoffeeDay cafeCoffeeDay14 = new CafeCoffeeDay(14, "CCD Powai", "Mumbai", 56, true, coffee14);
		cafeCoffeeDay14.getCafeCoffeeDayDetails();

		Coffee coffee15 = new Coffee(15, "Black Coffee", "Filter", 120.0, true);
		CafeCoffeeDay cafeCoffeeDay15 = new CafeCoffeeDay(15, "CCD T Nagar", "Chennai", 44, true, coffee15);
		cafeCoffeeDay15.getCafeCoffeeDayDetails();

		Coffee coffee16 = new Coffee(16, "Vienna Coffee", "Special", 260.0, true);
		CafeCoffeeDay cafeCoffeeDay16 = new CafeCoffeeDay(16, "CCD Viman Nagar", "Pune", 46, true, coffee16);
		cafeCoffeeDay16.getCafeCoffeeDayDetails();

		Coffee coffee17 = new Coffee(17, "Affogato", "Dessert Coffee", 280.0, true);
		CafeCoffeeDay cafeCoffeeDay17 = new CafeCoffeeDay(17, "CCD Gachibowli", "Hyderabad", 68, true, coffee17);
		cafeCoffeeDay17.getCafeCoffeeDayDetails();

		Coffee coffee18 = new Coffee(18, "Turkish Coffee", "Traditional", 150.0, true);
		CafeCoffeeDay cafeCoffeeDay18 = new CafeCoffeeDay(18, "CCD Karol Bagh", "Delhi", 50, true, coffee18);
		cafeCoffeeDay18.getCafeCoffeeDayDetails();

		Coffee coffee19 = new Coffee(19, "Coconut Cold Coffee", "Seasonal", 225.0, false);
		CafeCoffeeDay cafeCoffeeDay19 = new CafeCoffeeDay(19, "CCD Andheri", "Mumbai", 54, true, coffee19);
		cafeCoffeeDay19.getCafeCoffeeDayDetails();

		Coffee coffee20 = new Coffee(20, "Pumpkin Spice Latte", "Seasonal", 270.0, true);
		CafeCoffeeDay cafeCoffeeDay20 = new CafeCoffeeDay(20, "CCD Electronic City", "Bangalore", 72, true, coffee20);
		cafeCoffeeDay20.getCafeCoffeeDayDetails();


	}
}