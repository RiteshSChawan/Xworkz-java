class WonderlaExecutor {
	public static void main(String[] args) {
/*
		LazyPool pool1 = new LazyPool();
		pool1.poolId = 1;
		pool1.poolName = "Wave Rider";
		pool1.type = "Wave Pool";
		pool1.length = 50.0;
		pool1.isHeated = false;
		Wonderla wonderla1 = new Wonderla();
		wonderla1.wonderlaId = 1;
		wonderla1.parkName = "Wonderla Bangalore";
		wonderla1.location = "Bangalore";
		wonderla1.totalRides = 60;
		wonderla1.ticketPrice = 1100.0;
		wonderla1.lazyPool = pool1;
		wonderla1.getWonderlaDetails();

		LazyPool pool2 = new LazyPool();
		pool2.poolId = 2;
		pool2.poolName = "Lazy River";
		pool2.type = "Lazy Pool";
		pool2.length = 120.0;
		pool2.isHeated = false;
		Wonderla wonderla2 = new Wonderla();
		wonderla2.wonderlaId = 2;
		wonderla2.parkName = "Wonderla Hyderabad";
		wonderla2.location = "Hyderabad";
		wonderla2.totalRides = 55;
		wonderla2.ticketPrice = 1050.0;
		wonderla2.lazyPool = pool2;
		wonderla2.getWonderlaDetails();

		LazyPool pool3 = new LazyPool();
		pool3.poolId = 3;
		pool3.poolName = "Splash Zone";
		pool3.type = "Splash Pool";
		pool3.length = 30.0;
		pool3.isHeated = false;
		Wonderla wonderla3 = new Wonderla();
		wonderla3.wonderlaId = 3;
		wonderla3.parkName = "Wonderla Kochi";
		wonderla3.location = "Kochi";
		wonderla3.totalRides = 45;
		wonderla3.ticketPrice = 950.0;
		wonderla3.lazyPool = pool3;
		wonderla3.getWonderlaDetails();

		LazyPool pool4 = new LazyPool();
		pool4.poolId = 4;
		pool4.poolName = "Rain Disco";
		pool4.type = "Dance Pool";
		pool4.length = 25.0;
		pool4.isHeated = false;
		Wonderla wonderla4 = new Wonderla();
		wonderla4.wonderlaId = 4;
		wonderla4.parkName = "Aquatica Kolkata";
		wonderla4.location = "Kolkata";
		wonderla4.totalRides = 40;
		wonderla4.ticketPrice = 900.0;
		wonderla4.lazyPool = pool4;
		wonderla4.getWonderlaDetails();

		LazyPool pool5 = new LazyPool();
		pool5.poolId = 5;
		pool5.poolName = "Typhoon Lagoon";
		pool5.type = "Wave Pool";
		pool5.length = 80.0;
		pool5.isHeated = true;
		Wonderla wonderla5 = new Wonderla();
		wonderla5.wonderlaId = 5;
		wonderla5.parkName = "Imagicaa Mumbai";
		wonderla5.location = "Mumbai";
		wonderla5.totalRides = 50;
		wonderla5.ticketPrice = 1200.0;
		wonderla5.lazyPool = pool5;
		wonderla5.getWonderlaDetails();

		LazyPool pool6 = new LazyPool();
		pool6.poolId = 6;
		pool6.poolName = "Tidal Wave";
		pool6.type = "Surf Pool";
		pool6.length = 60.0;
		pool6.isHeated = false;
		Wonderla wonderla6 = new Wonderla();
		wonderla6.wonderlaId = 6;
		wonderla6.parkName = "Adlabs Aquamagica";
		wonderla6.location = "Khopoli";
		wonderla6.totalRides = 35;
		wonderla6.ticketPrice = 850.0;
		wonderla6.lazyPool = pool6;
		wonderla6.getWonderlaDetails();

		LazyPool pool7 = new LazyPool();
		pool7.poolId = 7;
		pool7.poolName = "Ocean Drift";
		pool7.type = "Lazy Pool";
		pool7.length = 200.0;
		pool7.isHeated = false;
		Wonderla wonderla7 = new Wonderla();
		wonderla7.wonderlaId = 7;
		wonderla7.parkName = "Black Thunder Coimbatore";
		wonderla7.location = "Coimbatore";
		wonderla7.totalRides = 42;
		wonderla7.ticketPrice = 800.0;
		wonderla7.lazyPool = pool7;
		wonderla7.getWonderlaDetails();

		LazyPool pool8 = new LazyPool();
		pool8.poolId = 8;
		pool8.poolName = "Aqua Tornado";
		pool8.type = "Vortex Pool";
		pool8.length = 40.0;
		pool8.isHeated = false;
		Wonderla wonderla8 = new Wonderla();
		wonderla8.wonderlaId = 8;
		wonderla8.parkName = "Kishkinta Chennai";
		wonderla8.location = "Chennai";
		wonderla8.totalRides = 38;
		wonderla8.ticketPrice = 750.0;
		wonderla8.lazyPool = pool8;
		wonderla8.getWonderlaDetails();

		LazyPool pool9 = new LazyPool();
		pool9.poolId = 9;
		pool9.poolName = "Cool Zone";
		pool9.type = "Kids Pool";
		pool9.length = 20.0;
		pool9.isHeated = false;
		Wonderla wonderla9 = new Wonderla();
		wonderla9.wonderlaId = 9;
		wonderla9.parkName = "Ramoji Film City";
		wonderla9.location = "Hyderabad";
		wonderla9.totalRides = 30;
		wonderla9.ticketPrice = 1300.0;
		wonderla9.lazyPool = pool9;
		wonderla9.getWonderlaDetails();

		LazyPool pool10 = new LazyPool();
		pool10.poolId = 10;
		pool10.poolName = "Glacier Bay";
		pool10.type = "Wave Pool";
		pool10.length = 70.0;
		pool10.isHeated = true;
		Wonderla wonderla10 = new Wonderla();
		wonderla10.wonderlaId = 10;
		wonderla10.parkName = "Worlds of Wonder Noida";
		wonderla10.location = "Noida";
		wonderla10.totalRides = 48;
		wonderla10.ticketPrice = 1000.0;
		wonderla10.lazyPool = pool10;
		wonderla10.getWonderlaDetails();

		LazyPool pool11 = new LazyPool();
		pool11.poolId = 11;
		pool11.poolName = "Storm Bay";
		pool11.type = "Surf Pool";
		pool11.length = 55.0;
		pool11.isHeated = false;
		Wonderla wonderla11 = new Wonderla();
		wonderla11.wonderlaId = 11;
		wonderla11.parkName = "Wet N Joy Lonavala";
		wonderla11.location = "Lonavala";
		wonderla11.totalRides = 32;
		wonderla11.ticketPrice = 899.0;
		wonderla11.lazyPool = pool11;
		wonderla11.getWonderlaDetails();

		LazyPool pool12 = new LazyPool();
		pool12.poolId = 12;
		pool12.poolName = "Adventure River";
		pool12.type = "Lazy Pool";
		pool12.length = 150.0;
		pool12.isHeated = false;
		Wonderla wonderla12 = new Wonderla();
		wonderla12.wonderlaId = 12;
		wonderla12.parkName = "Spread Eagle Jaipur";
		wonderla12.location = "Jaipur";
		wonderla12.totalRides = 28;
		wonderla12.ticketPrice = 700.0;
		wonderla12.lazyPool = pool12;
		wonderla12.getWonderlaDetails();

		LazyPool pool13 = new LazyPool();
		pool13.poolId = 13;
		pool13.poolName = "Thunder Falls";
		pool13.type = "Plunge Pool";
		pool13.length = 35.0;
		pool13.isHeated = false;
		Wonderla wonderla13 = new Wonderla();
		wonderla13.wonderlaId = 13;
		wonderla13.parkName = "Jaldhara Water Park Ahmedabad";
		wonderla13.location = "Ahmedabad";
		wonderla13.totalRides = 25;
		wonderla13.ticketPrice = 650.0;
		wonderla13.lazyPool = pool13;
		wonderla13.getWonderlaDetails();

		LazyPool pool14 = new LazyPool();
		pool14.poolId = 14;
		pool14.poolName = "Moonlight Pool";
		pool14.type = "Infinity Pool";
		pool14.length = 45.0;
		pool14.isHeated = true;
		Wonderla wonderla14 = new Wonderla();
		wonderla14.wonderlaId = 14;
		wonderla14.parkName = "Fun World Goa";
		wonderla14.location = "Goa";
		wonderla14.totalRides = 36;
		wonderla14.ticketPrice = 850.0;
		wonderla14.lazyPool = pool14;
		wonderla14.getWonderlaDetails();

		LazyPool pool15 = new LazyPool();
		pool15.poolId = 15;
		pool15.poolName = "Rapid Rush";
		pool15.type = "Rapid Pool";
		pool15.length = 65.0;
		pool15.isHeated = false;
		Wonderla wonderla15 = new Wonderla();
		wonderla15.wonderlaId = 15;
		wonderla15.parkName = "Ocean Park Vizag";
		wonderla15.location = "Visakhapatnam";
		wonderla15.totalRides = 30;
		wonderla15.ticketPrice = 750.0;
		wonderla15.lazyPool = pool15;
		wonderla15.getWonderlaDetails();

		LazyPool pool16 = new LazyPool();
		pool16.poolId = 16;
		pool16.poolName = "Jungle Waterfall";
		pool16.type = "Waterfall Pool";
		pool16.length = 30.0;
		pool16.isHeated = false;
		Wonderla wonderla16 = new Wonderla();
		wonderla16.wonderlaId = 16;
		wonderla16.parkName = "Drizzling Land Mysore";
		wonderla16.location = "Mysore";
		wonderla16.totalRides = 22;
		wonderla16.ticketPrice = 600.0;
		wonderla16.lazyPool = pool16;
		wonderla16.getWonderlaDetails();

		LazyPool pool17 = new LazyPool();
		pool17.poolId = 17;
		pool17.poolName = "Neon Pool";
		pool17.type = "Glow Pool";
		pool17.length = 28.0;
		pool17.isHeated = true;
		Wonderla wonderla17 = new Wonderla();
		wonderla17.wonderlaId = 17;
		wonderla17.parkName = "Magic World Chandigarh";
		wonderla17.location = "Chandigarh";
		wonderla17.totalRides = 33;
		wonderla17.ticketPrice = 800.0;
		wonderla17.lazyPool = pool17;
		wonderla17.getWonderlaDetails();

		LazyPool pool18 = new LazyPool();
		pool18.poolId = 18;
		pool18.poolName = "Tropical Bay";
		pool18.type = "Wave Pool";
		pool18.length = 90.0;
		pool18.isHeated = false;
		Wonderla wonderla18 = new Wonderla();
		wonderla18.wonderlaId = 18;
		wonderla18.parkName = "Aqua Planet Indore";
		wonderla18.location = "Indore";
		wonderla18.totalRides = 27;
		wonderla18.ticketPrice = 680.0;
		wonderla18.lazyPool = pool18;
		wonderla18.getWonderlaDetails();

		LazyPool pool19 = new LazyPool();
		pool19.poolId = 19;
		pool19.poolName = "Chill Oasis";
		pool19.type = "Relax Pool";
		pool19.length = 22.0;
		pool19.isHeated = true;
		Wonderla wonderla19 = new Wonderla();
		wonderla19.wonderlaId = 19;
		wonderla19.parkName = "Splash Nagpur";
		wonderla19.location = "Nagpur";
		wonderla19.totalRides = 20;
		wonderla19.ticketPrice = 550.0;
		wonderla19.lazyPool = pool19;
		wonderla19.getWonderlaDetails();

		LazyPool pool20 = new LazyPool();
		pool20.poolId = 20;
		pool20.poolName = "Aqua Bliss";
		pool20.type = "Leisure Pool";
		pool20.length = 40.0;
		pool20.isHeated = false;
		Wonderla wonderla20 = new Wonderla();
		wonderla20.wonderlaId = 20;
		wonderla20.parkName = "Water Kingdom Bhopal";
		wonderla20.location = "Bhopal";
		wonderla20.totalRides = 24;
		wonderla20.ticketPrice = 620.0;
		wonderla20.lazyPool = pool20;
		wonderla20.getWonderlaDetails(); */ 
		
		LazyPool lazyPool1 = new LazyPool(1, "Wave Rider", "Wave Pool", 50.0, false);
		Wonderla wonderla1 = new Wonderla(1, "Wonderla Bangalore", "Bangalore", 60, 1100.0, lazyPool1);
		wonderla1.getWonderlaDetails();

		LazyPool lazyPool2 = new LazyPool(2, "Lazy River", "Lazy Pool", 120.0, false);
		Wonderla wonderla2 = new Wonderla(2, "Wonderla Hyderabad", "Hyderabad", 55, 1050.0, lazyPool2);
		wonderla2.getWonderlaDetails();

		LazyPool lazyPool3 = new LazyPool(3, "Splash Zone", "Splash Pool", 30.0, false);
		Wonderla wonderla3 = new Wonderla(3, "Wonderla Kochi", "Kochi", 45, 950.0, lazyPool3);
		wonderla3.getWonderlaDetails();

		LazyPool lazyPool4 = new LazyPool(4, "Rain Disco", "Dance Pool", 25.0, false);
		Wonderla wonderla4 = new Wonderla(4, "Aquatica Kolkata", "Kolkata", 40, 900.0, lazyPool4);
		wonderla4.getWonderlaDetails();

		LazyPool lazyPool5 = new LazyPool(5, "Typhoon Lagoon", "Wave Pool", 80.0, true);
		Wonderla wonderla5 = new Wonderla(5, "Imagicaa Mumbai", "Mumbai", 50, 1200.0, lazyPool5);
		wonderla5.getWonderlaDetails();

		LazyPool lazyPool6 = new LazyPool(6, "Tidal Wave", "Surf Pool", 60.0, false);
		Wonderla wonderla6 = new Wonderla(6, "Adlabs Aquamagica", "Khopoli", 35, 850.0, lazyPool6);
		wonderla6.getWonderlaDetails();

		LazyPool lazyPool7 = new LazyPool(7, "Ocean Drift", "Lazy Pool", 200.0, false);
		Wonderla wonderla7 = new Wonderla(7, "Black Thunder Coimbatore", "Coimbatore", 42, 800.0, lazyPool7);
		wonderla7.getWonderlaDetails();

		LazyPool lazyPool8 = new LazyPool(8, "Aqua Tornado", "Vortex Pool", 40.0, false);
		Wonderla wonderla8 = new Wonderla(8, "Kishkinta Chennai", "Chennai", 38, 750.0, lazyPool8);
		wonderla8.getWonderlaDetails();

		LazyPool lazyPool9 = new LazyPool(9, "Cool Zone", "Kids Pool", 20.0, false);
		Wonderla wonderla9 = new Wonderla(9, "Ramoji Film City", "Hyderabad", 30, 1300.0, lazyPool9);
		wonderla9.getWonderlaDetails();

		LazyPool lazyPool10 = new LazyPool(10, "Glacier Bay", "Wave Pool", 70.0, true);
		Wonderla wonderla10 = new Wonderla(10, "Worlds of Wonder Noida", "Noida", 48, 1000.0, lazyPool10);
		wonderla10.getWonderlaDetails();

		LazyPool lazyPool11 = new LazyPool(11, "Storm Bay", "Surf Pool", 55.0, false);
		Wonderla wonderla11 = new Wonderla(11, "Wet N Joy Lonavala", "Lonavala", 32, 899.0, lazyPool11);
		wonderla11.getWonderlaDetails();

		LazyPool lazyPool12 = new LazyPool(12, "Adventure River", "Lazy Pool", 150.0, false);
		Wonderla wonderla12 = new Wonderla(12, "Spread Eagle Jaipur", "Jaipur", 28, 700.0, lazyPool12);
		wonderla12.getWonderlaDetails();

		LazyPool lazyPool13 = new LazyPool(13, "Thunder Falls", "Plunge Pool", 35.0, false);
		Wonderla wonderla13 = new Wonderla(13, "Jaldhara Water Park Ahmedabad", "Ahmedabad", 25, 650.0, lazyPool13);
		wonderla13.getWonderlaDetails();

		LazyPool lazyPool14 = new LazyPool(14, "Moonlight Pool", "Infinity Pool", 45.0, true);
		Wonderla wonderla14 = new Wonderla(14, "Fun World Goa", "Goa", 36, 850.0, lazyPool14);
		wonderla14.getWonderlaDetails();

		LazyPool lazyPool15 = new LazyPool(15, "Rapid Rush", "Rapid Pool", 65.0, false);
		Wonderla wonderla15 = new Wonderla(15, "Ocean Park Vizag", "Visakhapatnam", 30, 750.0, lazyPool15);
		wonderla15.getWonderlaDetails();

		LazyPool lazyPool16 = new LazyPool(16, "Jungle Waterfall", "Waterfall Pool", 30.0, false);
		Wonderla wonderla16 = new Wonderla(16, "Drizzling Land Mysore", "Mysore", 22, 600.0, lazyPool16);
		wonderla16.getWonderlaDetails();

		LazyPool lazyPool17 = new LazyPool(17, "Neon Pool", "Glow Pool", 28.0, true);
		Wonderla wonderla17 = new Wonderla(17, "Magic World Chandigarh", "Chandigarh", 33, 800.0, lazyPool17);
		wonderla17.getWonderlaDetails();

		LazyPool lazyPool18 = new LazyPool(18, "Tropical Bay", "Wave Pool", 90.0, false);
		Wonderla wonderla18 = new Wonderla(18, "Aqua Planet Indore", "Indore", 27, 680.0, lazyPool18);
		wonderla18.getWonderlaDetails();

		LazyPool lazyPool19 = new LazyPool(19, "Chill Oasis", "Relax Pool", 22.0, true);
		Wonderla wonderla19 = new Wonderla(19, "Splash Nagpur", "Nagpur", 20, 550.0, lazyPool19);
		wonderla19.getWonderlaDetails();

		LazyPool lazyPool20 = new LazyPool(20, "Aqua Bliss", "Leisure Pool", 40.0, false);
		Wonderla wonderla20 = new Wonderla(20, "Water Kingdom Bhopal", "Bhopal", 24, 620.0, lazyPool20);
		wonderla20.getWonderlaDetails();


	}
}