class Formula1Executor {
	public static void main(String[] args) {
/*
		Franchise franchise1 = new Franchise();
		franchise1.franchiseId = 1;
		franchise1.franchiseName = "Ferrari";
		franchise1.country = "Italy";
		franchise1.teamMembers = 80;
		franchise1.teamColor = "Red";
		Formula1 race1 = new Formula1();
		race1.raceId = 1;
		race1.raceName = "Italian Grand Prix";
		race1.location = "Monza";
		race1.laps = 53;
		race1.season = "2024";
		race1.franchise = franchise1;
		race1.getRaceDetails();

		Franchise franchise2 = new Franchise();
		franchise2.franchiseId = 2;
		franchise2.franchiseName = "Mercedes";
		franchise2.country = "Germany";
		franchise2.teamMembers = 75;
		franchise2.teamColor = "Silver";
		Formula1 race2 = new Formula1();
		race2.raceId = 2;
		race2.raceName = "German Grand Prix";
		race2.location = "Hockenheim";
		race2.laps = 67;
		race2.season = "2024";
		race2.franchise = franchise2;
		race2.getRaceDetails();

		Franchise franchise3 = new Franchise();
		franchise3.franchiseId = 3;
		franchise3.franchiseName = "Red Bull Racing";
		franchise3.country = "Austria";
		franchise3.teamMembers = 90;
		franchise3.teamColor = "Blue and Red";
		Formula1 race3 = new Formula1();
		race3.raceId = 3;
		race3.raceName = "Austrian Grand Prix";
		race3.location = "Spielberg";
		race3.laps = 71;
		race3.season = "2024";
		race3.franchise = franchise3;
		race3.getRaceDetails();

		Franchise franchise4 = new Franchise();
		franchise4.franchiseId = 4;
		franchise4.franchiseName = "McLaren";
		franchise4.country = "United Kingdom";
		franchise4.teamMembers = 70;
		franchise4.teamColor = "Papaya Orange";
		Formula1 race4 = new Formula1();
		race4.raceId = 4;
		race4.raceName = "British Grand Prix";
		race4.location = "Silverstone";
		race4.laps = 52;
		race4.season = "2024";
		race4.franchise = franchise4;
		race4.getRaceDetails();

		Franchise franchise5 = new Franchise();
		franchise5.franchiseId = 5;
		franchise5.franchiseName = "Alpine";
		franchise5.country = "France";
		franchise5.teamMembers = 65;
		franchise5.teamColor = "Blue and Pink";
		Formula1 race5 = new Formula1();
		race5.raceId = 5;
		race5.raceName = "French Grand Prix";
		race5.location = "Paul Ricard";
		race5.laps = 53;
		race5.season = "2024";
		race5.franchise = franchise5;
		race5.getRaceDetails();

		Franchise franchise6 = new Franchise();
		franchise6.franchiseId = 6;
		franchise6.franchiseName = "Aston Martin";
		franchise6.country = "United Kingdom";
		franchise6.teamMembers = 72;
		franchise6.teamColor = "British Racing Green";
		Formula1 race6 = new Formula1();
		race6.raceId = 6;
		race6.raceName = "Monaco Grand Prix";
		race6.location = "Monte Carlo";
		race6.laps = 78;
		race6.season = "2024";
		race6.franchise = franchise6;
		race6.getRaceDetails();

		Franchise franchise7 = new Franchise();
		franchise7.franchiseId = 7;
		franchise7.franchiseName = "Williams";
		franchise7.country = "United Kingdom";
		franchise7.teamMembers = 60;
		franchise7.teamColor = "White and Blue";
		Formula1 race7 = new Formula1();
		race7.raceId = 7;
		race7.raceName = "Spanish Grand Prix";
		race7.location = "Barcelona";
		race7.laps = 66;
		race7.season = "2024";
		race7.franchise = franchise7;
		race7.getRaceDetails();

		Franchise franchise8 = new Franchise();
		franchise8.franchiseId = 8;
		franchise8.franchiseName = "AlphaTauri";
		franchise8.country = "Italy";
		franchise8.teamMembers = 58;
		franchise8.teamColor = "Navy and White";
		Formula1 race8 = new Formula1();
		race8.raceId = 8;
		race8.raceName = "Japanese Grand Prix";
		race8.location = "Suzuka";
		race8.laps = 53;
		race8.season = "2024";
		race8.franchise = franchise8;
		race8.getRaceDetails();

		Franchise franchise9 = new Franchise();
		franchise9.franchiseId = 9;
		franchise9.franchiseName = "Alfa Romeo";
		franchise9.country = "Switzerland";
		franchise9.teamMembers = 55;
		franchise9.teamColor = "Red and White";
		Formula1 race9 = new Formula1();
		race9.raceId = 9;
		race9.raceName = "Belgian Grand Prix";
		race9.location = "Spa-Francorchamps";
		race9.laps = 44;
		race9.season = "2024";
		race9.franchise = franchise9;
		race9.getRaceDetails();

		Franchise franchise10 = new Franchise();
		franchise10.franchiseId = 10;
		franchise10.franchiseName = "Haas";
		franchise10.country = "United States";
		franchise10.teamMembers = 50;
		franchise10.teamColor = "Black and Red";
		Formula1 race10 = new Formula1();
		race10.raceId = 10;
		race10.raceName = "United States Grand Prix";
		race10.location = "Austin";
		race10.laps = 56;
		race10.season = "2024";
		race10.franchise = franchise10;
		race10.getRaceDetails();

		Franchise franchise11 = new Franchise();
		franchise11.franchiseId = 11;
		franchise11.franchiseName = "Ferrari";
		franchise11.country = "Italy";
		franchise11.teamMembers = 80;
		franchise11.teamColor = "Red";
		Formula1 race11 = new Formula1();
		race11.raceId = 11;
		race11.raceName = "Singapore Grand Prix";
		race11.location = "Marina Bay";
		race11.laps = 62;
		race11.season = "2024";
		race11.franchise = franchise11;
		race11.getRaceDetails();

		Franchise franchise12 = new Franchise();
		franchise12.franchiseId = 12;
		franchise12.franchiseName = "Red Bull Racing";
		franchise12.country = "Austria";
		franchise12.teamMembers = 90;
		franchise12.teamColor = "Blue and Red";
		Formula1 race12 = new Formula1();
		race12.raceId = 12;
		race12.raceName = "Abu Dhabi Grand Prix";
		race12.location = "Yas Marina";
		race12.laps = 58;
		race12.season = "2024";
		race12.franchise = franchise12;
		race12.getRaceDetails();

		Franchise franchise13 = new Franchise();
		franchise13.franchiseId = 13;
		franchise13.franchiseName = "Mercedes";
		franchise13.country = "Germany";
		franchise13.teamMembers = 75;
		franchise13.teamColor = "Silver";
		Formula1 race13 = new Formula1();
		race13.raceId = 13;
		race13.raceName = "Brazilian Grand Prix";
		race13.location = "Sao Paulo";
		race13.laps = 71;
		race13.season = "2024";
		race13.franchise = franchise13;
		race13.getRaceDetails();

		Franchise franchise14 = new Franchise();
		franchise14.franchiseId = 14;
		franchise14.franchiseName = "McLaren";
		franchise14.country = "United Kingdom";
		franchise14.teamMembers = 70;
		franchise14.teamColor = "Papaya Orange";
		Formula1 race14 = new Formula1();
		race14.raceId = 14;
		race14.raceName = "Canadian Grand Prix";
		race14.location = "Montreal";
		race14.laps = 70;
		race14.season = "2024";
		race14.franchise = franchise14;
		race14.getRaceDetails();

		Franchise franchise15 = new Franchise();
		franchise15.franchiseId = 15;
		franchise15.franchiseName = "Aston Martin";
		franchise15.country = "United Kingdom";
		franchise15.teamMembers = 72;
		franchise15.teamColor = "British Racing Green";
		Formula1 race15 = new Formula1();
		race15.raceId = 15;
		race15.raceName = "Mexican Grand Prix";
		race15.location = "Mexico City";
		race15.laps = 71;
		race15.season = "2024";
		race15.franchise = franchise15;
		race15.getRaceDetails();

		Franchise franchise16 = new Franchise();
		franchise16.franchiseId = 16;
		franchise16.franchiseName = "Alpine";
		franchise16.country = "France";
		franchise16.teamMembers = 65;
		franchise16.teamColor = "Blue and Pink";
		Formula1 race16 = new Formula1();
		race16.raceId = 16;
		race16.raceName = "Azerbaijan Grand Prix";
		race16.location = "Baku";
		race16.laps = 51;
		race16.season = "2024";
		race16.franchise = franchise16;
		race16.getRaceDetails();

		Franchise franchise17 = new Franchise();
		franchise17.franchiseId = 17;
		franchise17.franchiseName = "Williams";
		franchise17.country = "United Kingdom";
		franchise17.teamMembers = 60;
		franchise17.teamColor = "White and Blue";
		Formula1 race17 = new Formula1();
		race17.raceId = 17;
		race17.raceName = "Hungarian Grand Prix";
		race17.location = "Budapest";
		race17.laps = 70;
		race17.season = "2024";
		race17.franchise = franchise17;
		race17.getRaceDetails();

		Franchise franchise18 = new Franchise();
		franchise18.franchiseId = 18;
		franchise18.franchiseName = "Haas";
		franchise18.country = "United States";
		franchise18.teamMembers = 50;
		franchise18.teamColor = "Black and Red";
		Formula1 race18 = new Formula1();
		race18.raceId = 18;
		race18.raceName = "Dutch Grand Prix";
		race18.location = "Zandvoort";
		race18.laps = 72;
		race18.season = "2024";
		race18.franchise = franchise18;
		race18.getRaceDetails();

		Franchise franchise19 = new Franchise();
		franchise19.franchiseId = 19;
		franchise19.franchiseName = "AlphaTauri";
		franchise19.country = "Italy";
		franchise19.teamMembers = 58;
		franchise19.teamColor = "Navy and White";
		Formula1 race19 = new Formula1();
		race19.raceId = 19;
		race19.raceName = "Qatar Grand Prix";
		race19.location = "Lusail";
		race19.laps = 57;
		race19.season = "2024";
		race19.franchise = franchise19;
		race19.getRaceDetails();

		Franchise franchise20 = new Franchise();
		franchise20.franchiseId = 20;
		franchise20.franchiseName = "Alfa Romeo";
		franchise20.country = "Switzerland";
		franchise20.teamMembers = 55;
		franchise20.teamColor = "Red and White";
		Formula1 race20 = new Formula1();
		race20.raceId = 20;
		race20.raceName = "Las Vegas Grand Prix";
		race20.location = "Las Vegas";
		race20.laps = 50;
		race20.season = "2024";
		race20.franchise = franchise20;
		race20.getRaceDetails(); */

		Franchise franchise1 = new Franchise(1, "Ferrari", "Italy", 80, "Red");
		Formula1 race1 = new Formula1(1, "Italian Grand Prix", "Monza", 53, "2024", franchise1);
		race1.getRaceDetails();

		Franchise franchise2 = new Franchise(2, "Mercedes", "Germany", 75, "Silver");
		Formula1 race2 = new Formula1(2, "German Grand Prix", "Hockenheim", 67, "2024", franchise2);
		race2.getRaceDetails();

		Franchise franchise3 = new Franchise(3, "Red Bull Racing", "Austria", 90, "Blue and Red");
		Formula1 race3 = new Formula1(3, "Austrian Grand Prix", "Spielberg", 71, "2024", franchise3);
		race3.getRaceDetails();

		Franchise franchise4 = new Franchise(4, "McLaren", "United Kingdom", 70, "Papaya Orange");
		Formula1 race4 = new Formula1(4, "British Grand Prix", "Silverstone", 52, "2024", franchise4);
		race4.getRaceDetails();

		Franchise franchise5 = new Franchise(5, "Alpine", "France", 65, "Blue and Pink");
		Formula1 race5 = new Formula1(5, "French Grand Prix", "Paul Ricard", 53, "2024", franchise5);
		race5.getRaceDetails();

		Franchise franchise6 = new Franchise(6, "Aston Martin", "United Kingdom", 72, "British Racing Green");
		Formula1 race6 = new Formula1(6, "Monaco Grand Prix", "Monte Carlo", 78, "2024", franchise6);
		race6.getRaceDetails();

		Franchise franchise7 = new Franchise(7, "Williams", "United Kingdom", 60, "White and Blue");
		Formula1 race7 = new Formula1(7, "Spanish Grand Prix", "Barcelona", 66, "2024", franchise7);
		race7.getRaceDetails();

		Franchise franchise8 = new Franchise(8, "AlphaTauri", "Italy", 58, "Navy and White");
		Formula1 race8 = new Formula1(8, "Japanese Grand Prix", "Suzuka", 53, "2024", franchise8);
		race8.getRaceDetails();

		Franchise franchise9 = new Franchise(9, "Alfa Romeo", "Switzerland", 55, "Red and White");
		Formula1 race9 = new Formula1(9, "Belgian Grand Prix", "Spa-Francorchamps", 44, "2024", franchise9);
		race9.getRaceDetails();

		Franchise franchise10 = new Franchise(10, "Haas", "United States", 50, "Black and Red");
		Formula1 race10 = new Formula1(10, "United States Grand Prix", "Austin", 56, "2024", franchise10);
		race10.getRaceDetails();

		Franchise franchise11 = new Franchise(11, "Ferrari", "Italy", 80, "Red");
		Formula1 race11 = new Formula1(11, "Singapore Grand Prix", "Marina Bay", 62, "2024", franchise11);
		race11.getRaceDetails();

		Franchise franchise12 = new Franchise(12, "Red Bull Racing", "Austria", 90, "Blue and Red");
		Formula1 race12 = new Formula1(12, "Abu Dhabi Grand Prix", "Yas Marina", 58, "2024", franchise12);
		race12.getRaceDetails();

		Franchise franchise13 = new Franchise(13, "Mercedes", "Germany", 75, "Silver");
		Formula1 race13 = new Formula1(13, "Brazilian Grand Prix", "Sao Paulo", 71, "2024", franchise13);
		race13.getRaceDetails();

		Franchise franchise14 = new Franchise(14, "McLaren", "United Kingdom", 70, "Papaya Orange");
		Formula1 race14 = new Formula1(14, "Canadian Grand Prix", "Montreal", 70, "2024", franchise14);
		race14.getRaceDetails();

		Franchise franchise15 = new Franchise(15, "Aston Martin", "United Kingdom", 72, "British Racing Green");
		Formula1 race15 = new Formula1(15, "Mexican Grand Prix", "Mexico City", 71, "2024", franchise15);
		race15.getRaceDetails();

		Franchise franchise16 = new Franchise(16, "Alpine", "France", 65, "Blue and Pink");
		Formula1 race16 = new Formula1(16, "Azerbaijan Grand Prix", "Baku", 51, "2024", franchise16);
		race16.getRaceDetails();

		Franchise franchise17 = new Franchise(17, "Williams", "United Kingdom", 60, "White and Blue");
		Formula1 race17 = new Formula1(17, "Hungarian Grand Prix", "Budapest", 70, "2024", franchise17);
		race17.getRaceDetails();

		Franchise franchise18 = new Franchise(18, "Haas", "United States", 50, "Black and Red");
		Formula1 race18 = new Formula1(18, "Dutch Grand Prix", "Zandvoort", 72, "2024", franchise18);
		race18.getRaceDetails();

		Franchise franchise19 = new Franchise(19, "AlphaTauri", "Italy", 58, "Navy and White");
		Formula1 race19 = new Formula1(19, "Qatar Grand Prix", "Lusail", 57, "2024", franchise19);
		race19.getRaceDetails();

		Franchise franchise20 = new Franchise(20, "Alfa Romeo", "Switzerland", 55, "Red and White");
		Formula1 race20 = new Formula1(20, "Las Vegas Grand Prix", "Las Vegas", 50, "2024", franchise20);
		race20.getRaceDetails();


	}
}