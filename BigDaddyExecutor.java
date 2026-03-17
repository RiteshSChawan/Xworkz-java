class BigDaddyExecutor {
	public static void main(String[] args) {
/*
		Cassino cassino1 = new Cassino();
		cassino1.cassinoId = 1;
		cassino1.cassinoName = "Royal Flush";
		cassino1.gameType = "Poker";
		cassino1.tables = 20;
		cassino1.isVIP = true;
		BigDaddy bigDaddy1 = new BigDaddy();
		bigDaddy1.bigDaddyId = 1;
		bigDaddy1.bigDaddyName = "BigDaddy Goa";
		bigDaddy1.location = "Panaji, Goa";
		bigDaddy1.capacity = 500;
		bigDaddy1.entryFee = 2000.0;
		bigDaddy1.cassino = cassino1;
		bigDaddy1.getBigDaddyDetails();

		Cassino cassino2 = new Cassino();
		cassino2.cassinoId = 2;
		cassino2.cassinoName = "Gold Rush";
		cassino2.gameType = "Blackjack";
		cassino2.tables = 15;
		cassino2.isVIP = false;
		BigDaddy bigDaddy2 = new BigDaddy();
		bigDaddy2.bigDaddyId = 2;
		bigDaddy2.bigDaddyName = "BigDaddy Mumbai";
		bigDaddy2.location = "Mumbai, Maharashtra";
		bigDaddy2.capacity = 400;
		bigDaddy2.entryFee = 1500.0;
		bigDaddy2.cassino = cassino2;
		bigDaddy2.getBigDaddyDetails();

		Cassino cassino3 = new Cassino();
		cassino3.cassinoId = 3;
		cassino3.cassinoName = "Diamond Deck";
		cassino3.gameType = "Roulette";
		cassino3.tables = 25;
		cassino3.isVIP = true;
		BigDaddy bigDaddy3 = new BigDaddy();
		bigDaddy3.bigDaddyId = 3;
		bigDaddy3.bigDaddyName = "BigDaddy Delhi";
		bigDaddy3.location = "New Delhi";
		bigDaddy3.capacity = 600;
		bigDaddy3.entryFee = 3000.0;
		bigDaddy3.cassino = cassino3;
		bigDaddy3.getBigDaddyDetails();

		Cassino cassino4 = new Cassino();
		cassino4.cassinoId = 4;
		cassino4.cassinoName = "Spade Palace";
		cassino4.gameType = "Baccarat";
		cassino4.tables = 10;
		cassino4.isVIP = true;
		BigDaddy bigDaddy4 = new BigDaddy();
		bigDaddy4.bigDaddyId = 4;
		bigDaddy4.bigDaddyName = "BigDaddy Bangalore";
		bigDaddy4.location = "Bangalore, Karnataka";
		bigDaddy4.capacity = 350;
		bigDaddy4.entryFee = 2500.0;
		bigDaddy4.cassino = cassino4;
		bigDaddy4.getBigDaddyDetails();

		Cassino cassino5 = new Cassino();
		cassino5.cassinoId = 5;
		cassino5.cassinoName = "Lucky Star";
		cassino5.gameType = "Slot Machines";
		cassino5.tables = 50;
		cassino5.isVIP = false;
		BigDaddy bigDaddy5 = new BigDaddy();
		bigDaddy5.bigDaddyId = 5;
		bigDaddy5.bigDaddyName = "BigDaddy Hyderabad";
		bigDaddy5.location = "Hyderabad, Telangana";
		bigDaddy5.capacity = 700;
		bigDaddy5.entryFee = 1000.0;
		bigDaddy5.cassino = cassino5;
		bigDaddy5.getBigDaddyDetails();

		Cassino cassino6 = new Cassino();
		cassino6.cassinoId = 6;
		cassino6.cassinoName = "Ace of Spades";
		cassino6.gameType = "Teen Patti";
		cassino6.tables = 30;
		cassino6.isVIP = false;
		BigDaddy bigDaddy6 = new BigDaddy();
		bigDaddy6.bigDaddyId = 6;
		bigDaddy6.bigDaddyName = "BigDaddy Chennai";
		bigDaddy6.location = "Chennai, Tamil Nadu";
		bigDaddy6.capacity = 450;
		bigDaddy6.entryFee = 1200.0;
		bigDaddy6.cassino = cassino6;
		bigDaddy6.getBigDaddyDetails();

		Cassino cassino7 = new Cassino();
		cassino7.cassinoId = 7;
		cassino7.cassinoName = "King's Club";
		cassino7.gameType = "Poker";
		cassino7.tables = 18;
		cassino7.isVIP = true;
		BigDaddy bigDaddy7 = new BigDaddy();
		bigDaddy7.bigDaddyId = 7;
		bigDaddy7.bigDaddyName = "BigDaddy Pune";
		bigDaddy7.location = "Pune, Maharashtra";
		bigDaddy7.capacity = 300;
		bigDaddy7.entryFee = 1800.0;
		bigDaddy7.cassino = cassino7;
		bigDaddy7.getBigDaddyDetails();

		Cassino cassino8 = new Cassino();
		cassino8.cassinoId = 8;
		cassino8.cassinoName = "Joker's Wild";
		cassino8.gameType = "Rummy";
		cassino8.tables = 22;
		cassino8.isVIP = false;
		BigDaddy bigDaddy8 = new BigDaddy();
		bigDaddy8.bigDaddyId = 8;
		bigDaddy8.bigDaddyName = "BigDaddy Kolkata";
		bigDaddy8.location = "Kolkata, West Bengal";
		bigDaddy8.capacity = 380;
		bigDaddy8.entryFee = 900.0;
		bigDaddy8.cassino = cassino8;
		bigDaddy8.getBigDaddyDetails();

		Cassino cassino9 = new Cassino();
		cassino9.cassinoId = 9;
		cassino9.cassinoName = "Night Royale";
		cassino9.gameType = "Craps";
		cassino9.tables = 12;
		cassino9.isVIP = true;
		BigDaddy bigDaddy9 = new BigDaddy();
		bigDaddy9.bigDaddyId = 9;
		bigDaddy9.bigDaddyName = "BigDaddy Jaipur";
		bigDaddy9.location = "Jaipur, Rajasthan";
		bigDaddy9.capacity = 250;
		bigDaddy9.entryFee = 2200.0;
		bigDaddy9.cassino = cassino9;
		bigDaddy9.getBigDaddyDetails();

		Cassino cassino10 = new Cassino();
		cassino10.cassinoId = 10;
		cassino10.cassinoName = "Silver Chip";
		cassino10.gameType = "Blackjack";
		cassino10.tables = 16;
		cassino10.isVIP = false;
		BigDaddy bigDaddy10 = new BigDaddy();
		bigDaddy10.bigDaddyId = 10;
		bigDaddy10.bigDaddyName = "BigDaddy Ahmedabad";
		bigDaddy10.location = "Ahmedabad, Gujarat";
		bigDaddy10.capacity = 320;
		bigDaddy10.entryFee = 1100.0;
		bigDaddy10.cassino = cassino10;
		bigDaddy10.getBigDaddyDetails();

		Cassino cassino11 = new Cassino();
		cassino11.cassinoId = 11;
		cassino11.cassinoName = "Grand Vegas";
		cassino11.gameType = "Roulette";
		cassino11.tables = 35;
		cassino11.isVIP = true;
		BigDaddy bigDaddy11 = new BigDaddy();
		bigDaddy11.bigDaddyId = 11;
		bigDaddy11.bigDaddyName = "BigDaddy Surat";
		bigDaddy11.location = "Surat, Gujarat";
		bigDaddy11.capacity = 420;
		bigDaddy11.entryFee = 1700.0;
		bigDaddy11.cassino = cassino11;
		bigDaddy11.getBigDaddyDetails();

		Cassino cassino12 = new Cassino();
		cassino12.cassinoId = 12;
		cassino12.cassinoName = "Platinum Lounge";
		cassino12.gameType = "Baccarat";
		cassino12.tables = 8;
		cassino12.isVIP = true;
		BigDaddy bigDaddy12 = new BigDaddy();
		bigDaddy12.bigDaddyId = 12;
		bigDaddy12.bigDaddyName = "BigDaddy Lucknow";
		bigDaddy12.location = "Lucknow, Uttar Pradesh";
		bigDaddy12.capacity = 280;
		bigDaddy12.entryFee = 3500.0;
		bigDaddy12.cassino = cassino12;
		bigDaddy12.getBigDaddyDetails();

		Cassino cassino13 = new Cassino();
		cassino13.cassinoId = 13;
		cassino13.cassinoName = "High Roller";
		cassino13.gameType = "Poker";
		cassino13.tables = 28;
		cassino13.isVIP = true;
		BigDaddy bigDaddy13 = new BigDaddy();
		bigDaddy13.bigDaddyId = 13;
		bigDaddy13.bigDaddyName = "BigDaddy Chandigarh";
		bigDaddy13.location = "Chandigarh, Punjab";
		bigDaddy13.capacity = 360;
		bigDaddy13.entryFee = 2800.0;
		bigDaddy13.cassino = cassino13;
		bigDaddy13.getBigDaddyDetails();

		Cassino cassino14 = new Cassino();
		cassino14.cassinoId = 14;
		cassino14.cassinoName = "Neon Nights";
		cassino14.gameType = "Slot Machines";
		cassino14.tables = 60;
		cassino14.isVIP = false;
		BigDaddy bigDaddy14 = new BigDaddy();
		bigDaddy14.bigDaddyId = 14;
		bigDaddy14.bigDaddyName = "BigDaddy Indore";
		bigDaddy14.location = "Indore, Madhya Pradesh";
		bigDaddy14.capacity = 550;
		bigDaddy14.entryFee = 800.0;
		bigDaddy14.cassino = cassino14;
		bigDaddy14.getBigDaddyDetails();

		Cassino cassino15 = new Cassino();
		cassino15.cassinoId = 15;
		cassino15.cassinoName = "Crown Jewel";
		cassino15.gameType = "Teen Patti";
		cassino15.tables = 20;
		cassino15.isVIP = false;
		BigDaddy bigDaddy15 = new BigDaddy();
		bigDaddy15.bigDaddyId = 15;
		bigDaddy15.bigDaddyName = "BigDaddy Nagpur";
		bigDaddy15.location = "Nagpur, Maharashtra";
		bigDaddy15.capacity = 290;
		bigDaddy15.entryFee = 1300.0;
		bigDaddy15.cassino = cassino15;
		bigDaddy15.getBigDaddyDetails();

		Cassino cassino16 = new Cassino();
		cassino16.cassinoId = 16;
		cassino16.cassinoName = "Fortune Palace";
		cassino16.gameType = "Rummy";
		cassino16.tables = 14;
		cassino16.isVIP = false;
		BigDaddy bigDaddy16 = new BigDaddy();
		bigDaddy16.bigDaddyId = 16;
		bigDaddy16.bigDaddyName = "BigDaddy Kochi";
		bigDaddy16.location = "Kochi, Kerala";
		bigDaddy16.capacity = 310;
		bigDaddy16.entryFee = 1600.0;
		bigDaddy16.cassino = cassino16;
		bigDaddy16.getBigDaddyDetails();

		Cassino cassino17 = new Cassino();
		cassino17.cassinoId = 17;
		cassino17.cassinoName = "Mystic Cards";
		cassino17.gameType = "Blackjack";
		cassino17.tables = 18;
		cassino17.isVIP = true;
		BigDaddy bigDaddy17 = new BigDaddy();
		bigDaddy17.bigDaddyId = 17;
		bigDaddy17.bigDaddyName = "BigDaddy Vizag";
		bigDaddy17.location = "Visakhapatnam, Andhra Pradesh";
		bigDaddy17.capacity = 340;
		bigDaddy17.entryFee = 2100.0;
		bigDaddy17.cassino = cassino17;
		bigDaddy17.getBigDaddyDetails();

		Cassino cassino18 = new Cassino();
		cassino18.cassinoId = 18;
		cassino18.cassinoName = "Wild Card";
		cassino18.gameType = "Craps";
		cassino18.tables = 11;
		cassino18.isVIP = false;
		BigDaddy bigDaddy18 = new BigDaddy();
		bigDaddy18.bigDaddyId = 18;
		bigDaddy18.bigDaddyName = "BigDaddy Bhopal";
		bigDaddy18.location = "Bhopal, Madhya Pradesh";
		bigDaddy18.capacity = 270;
		bigDaddy18.entryFee = 950.0;
		bigDaddy18.cassino = cassino18;
		bigDaddy18.getBigDaddyDetails();

		Cassino cassino19 = new Cassino();
		cassino19.cassinoId = 19;
		cassino19.cassinoName = "The Jackpot";
		cassino19.gameType = "Poker";
		cassino19.tables = 24;
		cassino19.isVIP = true;
		BigDaddy bigDaddy19 = new BigDaddy();
		bigDaddy19.bigDaddyId = 19;
		bigDaddy19.bigDaddyName = "BigDaddy Mysore";
		bigDaddy19.location = "Mysore, Karnataka";
		bigDaddy19.capacity = 390;
		bigDaddy19.entryFee = 2400.0;
		bigDaddy19.cassino = cassino19;
		bigDaddy19.getBigDaddyDetails();

		Cassino cassino20 = new Cassino();
		cassino20.cassinoId = 20;
		cassino20.cassinoName = "Emerald Suite";
		cassino20.gameType = "Baccarat";
		cassino20.tables = 9;
		cassino20.isVIP = true;
		BigDaddy bigDaddy20 = new BigDaddy();
		bigDaddy20.bigDaddyId = 20;
		bigDaddy20.bigDaddyName = "BigDaddy Coimbatore";
		bigDaddy20.location = "Coimbatore, Tamil Nadu";
		bigDaddy20.capacity = 260;
		bigDaddy20.entryFee = 3200.0;
		bigDaddy20.cassino = cassino20;
		bigDaddy20.getBigDaddyDetails(); */
		

		Cassino cassino1 = new Cassino(1, "Royal Flush", "Poker", 20, true);
		BigDaddy bigDaddy1 = new BigDaddy(1, "BigDaddy Goa", "Panaji, Goa", 500, 2000.0, cassino1);
		bigDaddy1.getBigDaddyDetails();

		Cassino cassino2 = new Cassino(2, "Gold Rush", "Blackjack", 15, false);
		BigDaddy bigDaddy2 = new BigDaddy(2, "BigDaddy Mumbai", "Mumbai, Maharashtra", 400, 1500.0, cassino2);
		bigDaddy2.getBigDaddyDetails();

		Cassino cassino3 = new Cassino(3, "Diamond Deck", "Roulette", 25, true);
		BigDaddy bigDaddy3 = new BigDaddy(3, "BigDaddy Delhi", "New Delhi", 600, 3000.0, cassino3);
		bigDaddy3.getBigDaddyDetails();

		Cassino cassino4 = new Cassino(4, "Spade Palace", "Baccarat", 10, true);
		BigDaddy bigDaddy4 = new BigDaddy(4, "BigDaddy Bangalore", "Bangalore, Karnataka", 350, 2500.0, cassino4);
		bigDaddy4.getBigDaddyDetails();

		Cassino cassino5 = new Cassino(5, "Lucky Star", "Slot Machines", 50, false);
		BigDaddy bigDaddy5 = new BigDaddy(5, "BigDaddy Hyderabad", "Hyderabad, Telangana", 700, 1000.0, cassino5);
		bigDaddy5.getBigDaddyDetails();

		Cassino cassino6 = new Cassino(6, "Ace of Spades", "Teen Patti", 30, false);
		BigDaddy bigDaddy6 = new BigDaddy(6, "BigDaddy Chennai", "Chennai, Tamil Nadu", 450, 1200.0, cassino6);
		bigDaddy6.getBigDaddyDetails();

		Cassino cassino7 = new Cassino(7, "Kings Club", "Poker", 18, true);
		BigDaddy bigDaddy7 = new BigDaddy(7, "BigDaddy Pune", "Pune, Maharashtra", 300, 1800.0, cassino7);
		bigDaddy7.getBigDaddyDetails();

		Cassino cassino8 = new Cassino(8, "Jokers Wild", "Rummy", 22, false);
		BigDaddy bigDaddy8 = new BigDaddy(8, "BigDaddy Kolkata", "Kolkata, West Bengal", 380, 900.0, cassino8);
		bigDaddy8.getBigDaddyDetails();

		Cassino cassino9 = new Cassino(9, "Night Royale", "Craps", 12, true);
		BigDaddy bigDaddy9 = new BigDaddy(9, "BigDaddy Jaipur", "Jaipur, Rajasthan", 250, 2200.0, cassino9);
		bigDaddy9.getBigDaddyDetails();

		Cassino cassino10 = new Cassino(10, "Silver Chip", "Blackjack", 16, false);
		BigDaddy bigDaddy10 = new BigDaddy(10, "BigDaddy Ahmedabad", "Ahmedabad, Gujarat", 320, 1100.0, cassino10);
		bigDaddy10.getBigDaddyDetails();

		Cassino cassino11 = new Cassino(11, "Grand Vegas", "Roulette", 35, true);
		BigDaddy bigDaddy11 = new BigDaddy(11, "BigDaddy Surat", "Surat, Gujarat", 420, 1700.0, cassino11);
		bigDaddy11.getBigDaddyDetails();

		Cassino cassino12 = new Cassino(12, "Platinum Lounge", "Baccarat", 8, true);
		BigDaddy bigDaddy12 = new BigDaddy(12, "BigDaddy Lucknow", "Lucknow, Uttar Pradesh", 280, 3500.0, cassino12);
		bigDaddy12.getBigDaddyDetails();

		Cassino cassino13 = new Cassino(13, "High Roller", "Poker", 28, true);
		BigDaddy bigDaddy13 = new BigDaddy(13, "BigDaddy Chandigarh", "Chandigarh, Punjab", 360, 2800.0, cassino13);
		bigDaddy13.getBigDaddyDetails();

		Cassino cassino14 = new Cassino(14, "Neon Nights", "Slot Machines", 60, false);
		BigDaddy bigDaddy14 = new BigDaddy(14, "BigDaddy Indore", "Indore, Madhya Pradesh", 550, 800.0, cassino14);
		bigDaddy14.getBigDaddyDetails();

		Cassino cassino15 = new Cassino(15, "Crown Jewel", "Teen Patti", 20, false);
		BigDaddy bigDaddy15 = new BigDaddy(15, "BigDaddy Nagpur", "Nagpur, Maharashtra", 290, 1300.0, cassino15);
		bigDaddy15.getBigDaddyDetails();

		Cassino cassino16 = new Cassino(16, "Fortune Palace", "Rummy", 14, false);
		BigDaddy bigDaddy16 = new BigDaddy(16, "BigDaddy Kochi", "Kochi, Kerala", 310, 1600.0, cassino16);
		bigDaddy16.getBigDaddyDetails();

		Cassino cassino17 = new Cassino(17, "Mystic Cards", "Blackjack", 18, true);
		BigDaddy bigDaddy17 = new BigDaddy(17, "BigDaddy Vizag", "Visakhapatnam, AP", 340, 2100.0, cassino17);
		bigDaddy17.getBigDaddyDetails();

		Cassino cassino18 = new Cassino(18, "Wild Card", "Craps", 11, false);
		BigDaddy bigDaddy18 = new BigDaddy(18, "BigDaddy Bhopal", "Bhopal, MP", 270, 950.0, cassino18);
		bigDaddy18.getBigDaddyDetails();

		Cassino cassino19 = new Cassino(19, "The Jackpot", "Poker", 24, true);
		BigDaddy bigDaddy19 = new BigDaddy(19, "BigDaddy Mysore", "Mysore, Karnataka", 390, 2400.0, cassino19);
		bigDaddy19.getBigDaddyDetails();

		Cassino cassino20 = new Cassino(20, "Emerald Suite", "Baccarat", 9, true);
		BigDaddy bigDaddy20 = new BigDaddy(20, "BigDaddy Coimbatore", "Coimbatore, Tamil Nadu", 260, 3200.0, cassino20);
		bigDaddy20.getBigDaddyDetails();


	}
}