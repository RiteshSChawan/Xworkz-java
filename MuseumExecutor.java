class MuseumExecutor {
	public static void main(String[] args) {
/*
		Diamond diamond1 = new Diamond();
		diamond1.diamondId = 1;
		diamond1.diamondName = "Kohinoor";
		diamond1.color = "Colorless";
		diamond1.carats = 105.6;
		diamond1.isCertified = true;
		Museum museum1 = new Museum();
		museum1.museumId = 1;
		museum1.museumName = "National Museum New Delhi";
		museum1.location = "New Delhi";
		museum1.totalExhibits = 2000;
		museum1.entryFee = 20.0;
		museum1.diamond = diamond1;
		museum1.getMuseumDetails();

		Diamond diamond2 = new Diamond();
		diamond2.diamondId = 2;
		diamond2.diamondName = "Hope Diamond";
		diamond2.color = "Deep Blue";
		diamond2.carats = 45.52;
		diamond2.isCertified = true;
		Museum museum2 = new Museum();
		museum2.museumId = 2;
		museum2.museumName = "Smithsonian Museum";
		museum2.location = "Washington DC";
		museum2.totalExhibits = 15000;
		museum2.entryFee = 0.0;
		museum2.diamond = diamond2;
		museum2.getMuseumDetails();

		Diamond diamond3 = new Diamond();
		diamond3.diamondId = 3;
		diamond3.diamondName = "Regent Diamond";
		diamond3.color = "Colorless";
		diamond3.carats = 140.64;
		diamond3.isCertified = true;
		Museum museum3 = new Museum();
		museum3.museumId = 3;
		museum3.museumName = "Louvre Museum";
		museum3.location = "Paris";
		museum3.totalExhibits = 35000;
		museum3.entryFee = 17.0;
		museum3.diamond = diamond3;
		museum3.getMuseumDetails();

		Diamond diamond4 = new Diamond();
		diamond4.diamondId = 4;
		diamond4.diamondName = "Orlov Diamond";
		diamond4.color = "Greenish Blue";
		diamond4.carats = 189.62;
		diamond4.isCertified = true;
		Museum museum4 = new Museum();
		museum4.museumId = 4;
		museum4.museumName = "Kremlin Armory Museum";
		museum4.location = "Moscow";
		museum4.totalExhibits = 4000;
		museum4.entryFee = 12.0;
		museum4.diamond = diamond4;
		museum4.getMuseumDetails();

		Diamond diamond5 = new Diamond();
		diamond5.diamondId = 5;
		diamond5.diamondName = "Dresden Green";
		diamond5.color = "Natural Green";
		diamond5.carats = 40.7;
		diamond5.isCertified = true;
		Museum museum5 = new Museum();
		museum5.museumId = 5;
		museum5.museumName = "Dresden State Art Collections";
		museum5.location = "Dresden";
		museum5.totalExhibits = 3000;
		museum5.entryFee = 14.0;
		museum5.diamond = diamond5;
		museum5.getMuseumDetails();

		Diamond diamond6 = new Diamond();
		diamond6.diamondId = 6;
		diamond6.diamondName = "Cullinan I";
		diamond6.color = "Colorless";
		diamond6.carats = 530.2;
		diamond6.isCertified = true;
		Museum museum6 = new Museum();
		museum6.museumId = 6;
		museum6.museumName = "Tower of London";
		museum6.location = "London";
		museum6.totalExhibits = 1000;
		museum6.entryFee = 28.0;
		museum6.diamond = diamond6;
		museum6.getMuseumDetails();

		Diamond diamond7 = new Diamond();
		diamond7.diamondId = 7;
		diamond7.diamondName = "Sancy Diamond";
		diamond7.color = "Pale Yellow";
		diamond7.carats = 55.23;
		diamond7.isCertified = true;
		Museum museum7 = new Museum();
		museum7.museumId = 7;
		museum7.museumName = "Louvre Museum";
		museum7.location = "Paris";
		museum7.totalExhibits = 35000;
		museum7.entryFee = 17.0;
		museum7.diamond = diamond7;
		museum7.getMuseumDetails();

		Diamond diamond8 = new Diamond();
		diamond8.diamondId = 8;
		diamond8.diamondName = "Wittelsbach Diamond";
		diamond8.color = "Deep Blue";
		diamond8.carats = 35.56;
		diamond8.isCertified = true;
		Museum museum8 = new Museum();
		museum8.museumId = 8;
		museum8.museumName = "Ashmolean Museum";
		museum8.location = "Oxford";
		museum8.totalExhibits = 8000;
		museum8.entryFee = 0.0;
		museum8.diamond = diamond8;
		museum8.getMuseumDetails();

		Diamond diamond9 = new Diamond();
		diamond9.diamondId = 9;
		diamond9.diamondName = "Pink Star";
		diamond9.color = "Vivid Pink";
		diamond9.carats = 59.6;
		diamond9.isCertified = true;
		Museum museum9 = new Museum();
		museum9.museumId = 9;
		museum9.museumName = "Museum of Natural History";
		museum9.location = "New York";
		museum9.totalExhibits = 33000;
		museum9.entryFee = 23.0;
		museum9.diamond = diamond9;
		museum9.getMuseumDetails();

		Diamond diamond10 = new Diamond();
		diamond10.diamondId = 10;
		diamond10.diamondName = "Moussaieff Red";
		diamond10.color = "Fancy Red";
		diamond10.carats = 5.11;
		diamond10.isCertified = true;
		Museum museum10 = new Museum();
		museum10.museumId = 10;
		museum10.museumName = "Salar Jung Museum";
		museum10.location = "Hyderabad";
		museum10.totalExhibits = 47000;
		museum10.entryFee = 20.0;
		museum10.diamond = diamond10;
		museum10.getMuseumDetails();

		Diamond diamond11 = new Diamond();
		diamond11.diamondId = 11;
		diamond11.diamondName = "Centenary Diamond";
		diamond11.color = "Colorless";
		diamond11.carats = 273.85;
		diamond11.isCertified = true;
		Museum museum11 = new Museum();
		museum11.museumId = 11;
		museum11.museumName = "De Beers Museum";
		museum11.location = "Johannesburg";
		museum11.totalExhibits = 500;
		museum11.entryFee = 15.0;
		museum11.diamond = diamond11;
		museum11.getMuseumDetails();

		Diamond diamond12 = new Diamond();
		diamond12.diamondId = 12;
		diamond12.diamondName = "Millennium Star";
		diamond12.color = "D Flawless";
		diamond12.carats = 203.04;
		diamond12.isCertified = true;
		Museum museum12 = new Museum();
		museum12.museumId = 12;
		museum12.museumName = "British Museum";
		museum12.location = "London";
		museum12.totalExhibits = 80000;
		museum12.entryFee = 0.0;
		museum12.diamond = diamond12;
		museum12.getMuseumDetails();

		Diamond diamond13 = new Diamond();
		diamond13.diamondId = 13;
		diamond13.diamondName = "Graff Pink";
		diamond13.color = "Intense Pink";
		diamond13.carats = 24.78;
		diamond13.isCertified = true;
		Museum museum13 = new Museum();
		museum13.museumId = 13;
		museum13.museumName = "Victoria and Albert Museum";
		museum13.location = "London";
		museum13.totalExhibits = 2300000;
		museum13.entryFee = 0.0;
		museum13.diamond = diamond13;
		museum13.getMuseumDetails();

		Diamond diamond14 = new Diamond();
		diamond14.diamondId = 14;
		diamond14.diamondName = "Spirit of de Grisogono";
		diamond14.color = "Natural Black";
		diamond14.carats = 312.24;
		diamond14.isCertified = true;
		Museum museum14 = new Museum();
		museum14.museumId = 14;
		museum14.museumName = "Chhatrapati Shivaji Museum";
		museum14.location = "Mumbai";
		museum14.totalExhibits = 5000;
		museum14.entryFee = 85.0;
		museum14.diamond = diamond14;
		museum14.getMuseumDetails();

		Diamond diamond15 = new Diamond();
		diamond15.diamondId = 15;
		diamond15.diamondName = "Taylor-Burton Diamond";
		diamond15.color = "D Color";
		diamond15.carats = 69.42;
		diamond15.isCertified = true;
		Museum museum15 = new Museum();
		museum15.museumId = 15;
		museum15.museumName = "Palazzo Pitti";
		museum15.location = "Florence";
		museum15.totalExhibits = 11000;
		museum15.entryFee = 16.0;
		museum15.diamond = diamond15;
		museum15.getMuseumDetails();

		Diamond diamond16 = new Diamond();
		diamond16.diamondId = 16;
		diamond16.diamondName = "Red Cross Diamond";
		diamond16.color = "Canary Yellow";
		diamond16.carats = 205.07;
		diamond16.isCertified = true;
		Museum museum16 = new Museum();
		museum16.museumId = 16;
		museum16.museumName = "Indian Museum Kolkata";
		museum16.location = "Kolkata";
		museum16.totalExhibits = 60000;
		museum16.entryFee = 30.0;
		museum16.diamond = diamond16;
		museum16.getMuseumDetails();

		Diamond diamond17 = new Diamond();
		diamond17.diamondId = 17;
		diamond17.diamondName = "Incomparable Diamond";
		diamond17.color = "Brownish Yellow";
		diamond17.carats = 407.48;
		diamond17.isCertified = true;
		Museum museum17 = new Museum();
		museum17.museumId = 17;
		museum17.museumName = "Prado Museum";
		museum17.location = "Madrid";
		museum17.totalExhibits = 7600;
		museum17.entryFee = 15.0;
		museum17.diamond = diamond17;
		museum17.getMuseumDetails();

		Diamond diamond18 = new Diamond();
		diamond18.diamondId = 18;
		diamond18.diamondName = "Star of Africa";
		diamond18.color = "Colorless";
		diamond18.carats = 3106.0;
		diamond18.isCertified = true;
		Museum museum18 = new Museum();
		museum18.museumId = 18;
		museum18.museumName = "State Hermitage Museum";
		museum18.location = "Saint Petersburg";
		museum18.totalExhibits = 3000000;
		museum18.entryFee = 18.0;
		museum18.diamond = diamond18;
		museum18.getMuseumDetails();

		Diamond diamond19 = new Diamond();
		diamond19.diamondId = 19;
		diamond19.diamondName = "Florentine Diamond";
		diamond19.color = "Yellow";
		diamond19.carats = 137.27;
		diamond19.isCertified = false;
		Museum museum19 = new Museum();
		museum19.museumId = 19;
		museum19.museumName = "Mysore Palace Museum";
		museum19.location = "Mysore";
		museum19.totalExhibits = 800;
		museum19.entryFee = 70.0;
		museum19.diamond = diamond19;
		museum19.getMuseumDetails();

		Diamond diamond20 = new Diamond();
		diamond20.diamondId = 20;
		diamond20.diamondName = "Nassak Diamond";
		diamond20.color = "Light Blue";
		diamond20.carats = 89.62;
		diamond20.isCertified = true;
		Museum museum20 = new Museum();
		museum20.museumId = 20;
		museum20.museumName = "Government Museum Chennai";
		museum20.location = "Chennai";
		museum20.totalExhibits = 4000;
		museum20.entryFee = 15.0;
		museum20.diamond = diamond20;
		museum20.getMuseumDetails(); */
		

		Diamond diamond1 = new Diamond(1, "Kohinoor", "Colorless", 105.6, true);
		Museum museum1 = new Museum(1, "National Museum New Delhi", "New Delhi", 2000, 20.0, diamond1);
		museum1.getMuseumDetails();

		Diamond diamond2 = new Diamond(2, "Hope Diamond", "Deep Blue", 45.52, true);
		Museum museum2 = new Museum(2, "Smithsonian Museum", "Washington DC", 15000, 0.0, diamond2);
		museum2.getMuseumDetails();

		Diamond diamond3 = new Diamond(3, "Regent Diamond", "Colorless", 140.64, true);
		Museum museum3 = new Museum(3, "Louvre Museum", "Paris", 35000, 17.0, diamond3);
		museum3.getMuseumDetails();

		Diamond diamond4 = new Diamond(4, "Orlov Diamond", "Greenish Blue", 189.62, true);
		Museum museum4 = new Museum(4, "Kremlin Armory Museum", "Moscow", 4000, 12.0, diamond4);
		museum4.getMuseumDetails();

		Diamond diamond5 = new Diamond(5, "Dresden Green", "Natural Green", 40.7, true);
		Museum museum5 = new Museum(5, "Dresden State Art Collections", "Dresden", 3000, 14.0, diamond5);
		museum5.getMuseumDetails();

		Diamond diamond6 = new Diamond(6, "Cullinan I", "Colorless", 530.2, true);
		Museum museum6 = new Museum(6, "Tower of London", "London", 1000, 28.0, diamond6);
		museum6.getMuseumDetails();

		Diamond diamond7 = new Diamond(7, "Sancy Diamond", "Pale Yellow", 55.23, true);
		Museum museum7 = new Museum(7, "Louvre Museum", "Paris", 35000, 17.0, diamond7);
		museum7.getMuseumDetails();

		Diamond diamond8 = new Diamond(8, "Wittelsbach Diamond", "Deep Blue", 35.56, true);
		Museum museum8 = new Museum(8, "Ashmolean Museum", "Oxford", 8000, 0.0, diamond8);
		museum8.getMuseumDetails();

		Diamond diamond9 = new Diamond(9, "Pink Star", "Vivid Pink", 59.6, true);
		Museum museum9 = new Museum(9, "Museum of Natural History", "New York", 33000, 23.0, diamond9);
		museum9.getMuseumDetails();

		Diamond diamond10 = new Diamond(10, "Moussaieff Red", "Fancy Red", 5.11, true);
		Museum museum10 = new Museum(10, "Salar Jung Museum", "Hyderabad", 47000, 20.0, diamond10);
		museum10.getMuseumDetails();

		Diamond diamond11 = new Diamond(11, "Centenary Diamond", "Colorless", 273.85, true);
		Museum museum11 = new Museum(11, "De Beers Museum", "Johannesburg", 500, 15.0, diamond11);
		museum11.getMuseumDetails();

		Diamond diamond12 = new Diamond(12, "Millennium Star", "D Flawless", 203.04, true);
		Museum museum12 = new Museum(12, "British Museum", "London", 80000, 0.0, diamond12);
		museum12.getMuseumDetails();

		Diamond diamond13 = new Diamond(13, "Graff Pink", "Intense Pink", 24.78, true);
		Museum museum13 = new Museum(13, "Victoria and Albert Museum", "London", 2300000, 0.0, diamond13);
		museum13.getMuseumDetails();

		Diamond diamond14 = new Diamond(14, "Spirit of de Grisogono", "Natural Black", 312.24, true);
		Museum museum14 = new Museum(14, "Chhatrapati Shivaji Museum", "Mumbai", 5000, 85.0, diamond14);
		museum14.getMuseumDetails();

		Diamond diamond15 = new Diamond(15, "Taylor-Burton Diamond", "D Color", 69.42, true);
		Museum museum15 = new Museum(15, "Palazzo Pitti", "Florence", 11000, 16.0, diamond15);
		museum15.getMuseumDetails();

		Diamond diamond16 = new Diamond(16, "Red Cross Diamond", "Canary Yellow", 205.07, true);
		Museum museum16 = new Museum(16, "Indian Museum Kolkata", "Kolkata", 60000, 30.0, diamond16);
		museum16.getMuseumDetails();

		Diamond diamond17 = new Diamond(17, "Incomparable Diamond", "Brownish Yellow", 407.48, true);
		Museum museum17 = new Museum(17, "Prado Museum", "Madrid", 7600, 15.0, diamond17);
		museum17.getMuseumDetails();

		Diamond diamond18 = new Diamond(18, "Star of Africa", "Colorless", 3106.0, true);
		Museum museum18 = new Museum(18, "State Hermitage Museum", "Saint Petersburg", 3000000, 18.0, diamond18);
		museum18.getMuseumDetails();

		Diamond diamond19 = new Diamond(19, "Florentine Diamond", "Yellow", 137.27, false);
		Museum museum19 = new Museum(19, "Mysore Palace Museum", "Mysore", 800, 70.0, diamond19);
		museum19.getMuseumDetails();

		Diamond diamond20 = new Diamond(20, "Nassak Diamond", "Light Blue", 89.62, true);
		Museum museum20 = new Museum(20, "Government Museum Chennai", "Chennai", 4000, 15.0, diamond20);
		museum20.getMuseumDetails();


	}
}