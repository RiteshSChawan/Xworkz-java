class IplExecutor {
	public static void main(String[] args) {
/*
		Player player1 = new Player();
		player1.playerId = 1;
		player1.playerName = "MS Dhoni";
		player1.role = "Wicket-Keeper Batsman";
		player1.nationality = "Indian";
		player1.price = 12.0;
		Ipl ipl1 = new Ipl();
		ipl1.iplId = 1;
		ipl1.teamName = "Chennai Super Kings";
		ipl1.city = "Chennai";
		ipl1.captain = "MS Dhoni";
		ipl1.titlesWon = 5;
		ipl1.player = player1;
		ipl1.getIplDetails();

		Player player2 = new Player();
		player2.playerId = 2;
		player2.playerName = "Rohit Sharma";
		player2.role = "Opener Batsman";
		player2.nationality = "Indian";
		player2.price = 16.0;
		Ipl ipl2 = new Ipl();
		ipl2.iplId = 2;
		ipl2.teamName = "Mumbai Indians";
		ipl2.city = "Mumbai";
		ipl2.captain = "Rohit Sharma";
		ipl2.titlesWon = 5;
		ipl2.player = player2;
		ipl2.getIplDetails();

		Player player3 = new Player();
		player3.playerId = 3;
		player3.playerName = "Virat Kohli";
		player3.role = "Batsman";
		player3.nationality = "Indian";
		player3.price = 15.0;
		Ipl ipl3 = new Ipl();
		ipl3.iplId = 3;
		ipl3.teamName = "Royal Challengers Bangalore";
		ipl3.city = "Bangalore";
		ipl3.captain = "Virat Kohli";
		ipl3.titlesWon = 0;
		ipl3.player = player3;
		ipl3.getIplDetails();

		Player player4 = new Player();
		player4.playerId = 4;
		player4.playerName = "KL Rahul";
		player4.role = "Wicket-Keeper Batsman";
		player4.nationality = "Indian";
		player4.price = 17.0;
		Ipl ipl4 = new Ipl();
		ipl4.iplId = 4;
		ipl4.teamName = "Lucknow Super Giants";
		ipl4.city = "Lucknow";
		ipl4.captain = "KL Rahul";
		ipl4.titlesWon = 0;
		ipl4.player = player4;
		ipl4.getIplDetails();

		Player player5 = new Player();
		player5.playerId = 5;
		player5.playerName = "Hardik Pandya";
		player5.role = "All-Rounder";
		player5.nationality = "Indian";
		player5.price = 15.0;
		Ipl ipl5 = new Ipl();
		ipl5.iplId = 5;
		ipl5.teamName = "Gujarat Titans";
		ipl5.city = "Ahmedabad";
		ipl5.captain = "Hardik Pandya";
		ipl5.titlesWon = 1;
		ipl5.player = player5;
		ipl5.getIplDetails();

		Player player6 = new Player();
		player6.playerId = 6;
		player6.playerName = "Shreyas Iyer";
		player6.role = "Middle Order Batsman";
		player6.nationality = "Indian";
		player6.price = 12.25;
		Ipl ipl6 = new Ipl();
		ipl6.iplId = 6;
		ipl6.teamName = "Kolkata Knight Riders";
		ipl6.city = "Kolkata";
		ipl6.captain = "Shreyas Iyer";
		ipl6.titlesWon = 3;
		ipl6.player = player6;
		ipl6.getIplDetails();

		Player player7 = new Player();
		player7.playerId = 7;
		player7.playerName = "David Warner";
		player7.role = "Opener Batsman";
		player7.nationality = "Australian";
		player7.price = 6.25;
		Ipl ipl7 = new Ipl();
		ipl7.iplId = 7;
		ipl7.teamName = "Delhi Capitals";
		ipl7.city = "Delhi";
		ipl7.captain = "David Warner";
		ipl7.titlesWon = 0;
		ipl7.player = player7;
		ipl7.getIplDetails();

		Player player8 = new Player();
		player8.playerId = 8;
		player8.playerName = "Sanju Samson";
		player8.role = "Wicket-Keeper Batsman";
		player8.nationality = "Indian";
		player8.price = 14.0;
		Ipl ipl8 = new Ipl();
		ipl8.iplId = 8;
		ipl8.teamName = "Rajasthan Royals";
		ipl8.city = "Jaipur";
		ipl8.captain = "Sanju Samson";
		ipl8.titlesWon = 1;
		ipl8.player = player8;
		ipl8.getIplDetails();

		Player player9 = new Player();
		player9.playerId = 9;
		player9.playerName = "Kane Williamson";
		player9.role = "Batsman";
		player9.nationality = "New Zealander";
		player9.price = 5.0;
		Ipl ipl9 = new Ipl();
		ipl9.iplId = 9;
		ipl9.teamName = "Sunrisers Hyderabad";
		ipl9.city = "Hyderabad";
		ipl9.captain = "Pat Cummins";
		ipl9.titlesWon = 1;
		ipl9.player = player9;
		ipl9.getIplDetails();

		Player player10 = new Player();
		player10.playerId = 10;
		player10.playerName = "Faf du Plessis";
		player10.role = "Opener Batsman";
		player10.nationality = "South African";
		player10.price = 7.0;
		Ipl ipl10 = new Ipl();
		ipl10.iplId = 10;
		ipl10.teamName = "Royal Challengers Bangalore";
		ipl10.city = "Bangalore";
		ipl10.captain = "Faf du Plessis";
		ipl10.titlesWon = 0;
		ipl10.player = player10;
		ipl10.getIplDetails();

		Player player11 = new Player();
		player11.playerId = 11;
		player11.playerName = "Jasprit Bumrah";
		player11.role = "Fast Bowler";
		player11.nationality = "Indian";
		player11.price = 12.0;
		Ipl ipl11 = new Ipl();
		ipl11.iplId = 11;
		ipl11.teamName = "Mumbai Indians";
		ipl11.city = "Mumbai";
		ipl11.captain = "Hardik Pandya";
		ipl11.titlesWon = 5;
		ipl11.player = player11;
		ipl11.getIplDetails();

		Player player12 = new Player();
		player12.playerId = 12;
		player12.playerName = "Ravindra Jadeja";
		player12.role = "All-Rounder";
		player12.nationality = "Indian";
		player12.price = 16.0;
		Ipl ipl12 = new Ipl();
		ipl12.iplId = 12;
		ipl12.teamName = "Chennai Super Kings";
		ipl12.city = "Chennai";
		ipl12.captain = "Ruturaj Gaikwad";
		ipl12.titlesWon = 5;
		ipl12.player = player12;
		ipl12.getIplDetails();

		Player player13 = new Player();
		player13.playerId = 13;
		player13.playerName = "Pat Cummins";
		player13.role = "Fast Bowler";
		player13.nationality = "Australian";
		player13.price = 20.5;
		Ipl ipl13 = new Ipl();
		ipl13.iplId = 13;
		ipl13.teamName = "Sunrisers Hyderabad";
		ipl13.city = "Hyderabad";
		ipl13.captain = "Pat Cummins";
		ipl13.titlesWon = 1;
		ipl13.player = player13;
		ipl13.getIplDetails();

		Player player14 = new Player();
		player14.playerId = 14;
		player14.playerName = "Mitchell Starc";
		player14.role = "Fast Bowler";
		player14.nationality = "Australian";
		player14.price = 24.75;
		Ipl ipl14 = new Ipl();
		ipl14.iplId = 14;
		ipl14.teamName = "Kolkata Knight Riders";
		ipl14.city = "Kolkata";
		ipl14.captain = "Shreyas Iyer";
		ipl14.titlesWon = 3;
		ipl14.player = player14;
		ipl14.getIplDetails();

		Player player15 = new Player();
		player15.playerId = 15;
		player15.playerName = "Yuzvendra Chahal";
		player15.role = "Leg Spinner";
		player15.nationality = "Indian";
		player15.price = 6.5;
		Ipl ipl15 = new Ipl();
		ipl15.iplId = 15;
		ipl15.teamName = "Rajasthan Royals";
		ipl15.city = "Jaipur";
		ipl15.captain = "Sanju Samson";
		ipl15.titlesWon = 1;
		ipl15.player = player15;
		ipl15.getIplDetails();

		Player player16 = new Player();
		player16.playerId = 16;
		player16.playerName = "Heinrich Klaasen";
		player16.role = "Wicket-Keeper Batsman";
		player16.nationality = "South African";
		player16.price = 23.0;
		Ipl ipl16 = new Ipl();
		ipl16.iplId = 16;
		ipl16.teamName = "Sunrisers Hyderabad";
		ipl16.city = "Hyderabad";
		ipl16.captain = "Pat Cummins";
		ipl16.titlesWon = 1;
		ipl16.player = player16;
		ipl16.getIplDetails();

		Player player17 = new Player();
		player17.playerId = 17;
		player17.playerName = "Shubman Gill";
		player17.role = "Opener Batsman";
		player17.nationality = "Indian";
		player17.price = 8.0;
		Ipl ipl17 = new Ipl();
		ipl17.iplId = 17;
		ipl17.teamName = "Gujarat Titans";
		ipl17.city = "Ahmedabad";
		ipl17.captain = "Shubman Gill";
		ipl17.titlesWon = 1;
		ipl17.player = player17;
		ipl17.getIplDetails();

		Player player18 = new Player();
		player18.playerId = 18;
		player18.playerName = "Rishabh Pant";
		player18.role = "Wicket-Keeper Batsman";
		player18.nationality = "Indian";
		player18.price = 16.0;
		Ipl ipl18 = new Ipl();
		ipl18.iplId = 18;
		ipl18.teamName = "Delhi Capitals";
		ipl18.city = "Delhi";
		ipl18.captain = "Rishabh Pant";
		ipl18.titlesWon = 0;
		ipl18.player = player18;
		ipl18.getIplDetails();

		Player player19 = new Player();
		player19.playerId = 19;
		player19.playerName = "Quinton de Kock";
		player19.role = "Wicket-Keeper Batsman";
		player19.nationality = "South African";
		player19.price = 4.4;
		Ipl ipl19 = new Ipl();
		ipl19.iplId = 19;
		ipl19.teamName = "Lucknow Super Giants";
		ipl19.city = "Lucknow";
		ipl19.captain = "KL Rahul";
		ipl19.titlesWon = 0;
		ipl19.player = player19;
		ipl19.getIplDetails();

		Player player20 = new Player();
		player20.playerId = 20;
		player20.playerName = "Axar Patel";
		player20.role = "All-Rounder";
		player20.nationality = "Indian";
		player20.price = 9.0;
		Ipl ipl20 = new Ipl();
		ipl20.iplId = 20;
		ipl20.teamName = "Delhi Capitals";
		ipl20.city = "Delhi";
		ipl20.captain = "Rishabh Pant";
		ipl20.titlesWon = 0;
		ipl20.player = player20;
		ipl20.getIplDetails(); */
		

		Player player1 = new Player(1, "MS Dhoni", "Wicket-Keeper Batsman", "Indian", 12.0);
		Ipl ipl1 = new Ipl(1, "Chennai Super Kings", "Chennai", "MS Dhoni", 5, player1);
		ipl1.getIplDetails();

		Player player2 = new Player(2, "Rohit Sharma", "Opener Batsman", "Indian", 16.0);
		Ipl ipl2 = new Ipl(2, "Mumbai Indians", "Mumbai", "Rohit Sharma", 5, player2);
		ipl2.getIplDetails();

		Player player3 = new Player(3, "Virat Kohli", "Batsman", "Indian", 15.0);
		Ipl ipl3 = new Ipl(3, "Royal Challengers Bangalore", "Bangalore", "Virat Kohli", 0, player3);
		ipl3.getIplDetails();

		Player player4 = new Player(4, "KL Rahul", "Wicket-Keeper Batsman", "Indian", 17.0);
		Ipl ipl4 = new Ipl(4, "Lucknow Super Giants", "Lucknow", "KL Rahul", 0, player4);
		ipl4.getIplDetails();

		Player player5 = new Player(5, "Hardik Pandya", "All-Rounder", "Indian", 15.0);
		Ipl ipl5 = new Ipl(5, "Gujarat Titans", "Ahmedabad", "Hardik Pandya", 1, player5);
		ipl5.getIplDetails();

		Player player6 = new Player(6, "Shreyas Iyer", "Middle Order Batsman", "Indian", 12.25);
		Ipl ipl6 = new Ipl(6, "Kolkata Knight Riders", "Kolkata", "Shreyas Iyer", 3, player6);
		ipl6.getIplDetails();

		Player player7 = new Player(7, "David Warner", "Opener Batsman", "Australian", 6.25);
		Ipl ipl7 = new Ipl(7, "Delhi Capitals", "Delhi", "David Warner", 0, player7);
		ipl7.getIplDetails();

		Player player8 = new Player(8, "Sanju Samson", "Wicket-Keeper Batsman", "Indian", 14.0);
		Ipl ipl8 = new Ipl(8, "Rajasthan Royals", "Jaipur", "Sanju Samson", 1, player8);
		ipl8.getIplDetails();

		Player player9 = new Player(9, "Kane Williamson", "Batsman", "New Zealander", 5.0);
		Ipl ipl9 = new Ipl(9, "Sunrisers Hyderabad", "Hyderabad", "Pat Cummins", 1, player9);
		ipl9.getIplDetails();

		Player player10 = new Player(10, "Faf du Plessis", "Opener Batsman", "South African", 7.0);
		Ipl ipl10 = new Ipl(10, "Royal Challengers Bangalore", "Bangalore", "Faf du Plessis", 0, player10);
		ipl10.getIplDetails();

		Player player11 = new Player(11, "Jasprit Bumrah", "Fast Bowler", "Indian", 12.0);
		Ipl ipl11 = new Ipl(11, "Mumbai Indians", "Mumbai", "Hardik Pandya", 5, player11);
		ipl11.getIplDetails();

		Player player12 = new Player(12, "Ravindra Jadeja", "All-Rounder", "Indian", 16.0);
		Ipl ipl12 = new Ipl(12, "Chennai Super Kings", "Chennai", "Ruturaj Gaikwad", 5, player12);
		ipl12.getIplDetails();

		Player player13 = new Player(13, "Pat Cummins", "Fast Bowler", "Australian", 20.5);
		Ipl ipl13 = new Ipl(13, "Sunrisers Hyderabad", "Hyderabad", "Pat Cummins", 1, player13);
		ipl13.getIplDetails();

		Player player14 = new Player(14, "Mitchell Starc", "Fast Bowler", "Australian", 24.75);
		Ipl ipl14 = new Ipl(14, "Kolkata Knight Riders", "Kolkata", "Shreyas Iyer", 3, player14);
		ipl14.getIplDetails();

		Player player15 = new Player(15, "Yuzvendra Chahal", "Leg Spinner", "Indian", 6.5);
		Ipl ipl15 = new Ipl(15, "Rajasthan Royals", "Jaipur", "Sanju Samson", 1, player15);
		ipl15.getIplDetails();

		Player player16 = new Player(16, "Heinrich Klaasen", "Wicket-Keeper Batsman", "South African", 23.0);
		Ipl ipl16 = new Ipl(16, "Sunrisers Hyderabad", "Hyderabad", "Pat Cummins", 1, player16);
		ipl16.getIplDetails();

		Player player17 = new Player(17, "Shubman Gill", "Opener Batsman", "Indian", 8.0);
		Ipl ipl17 = new Ipl(17, "Gujarat Titans", "Ahmedabad", "Shubman Gill", 1, player17);
		ipl17.getIplDetails();

		Player player18 = new Player(18, "Rishabh Pant", "Wicket-Keeper Batsman", "Indian", 16.0);
		Ipl ipl18 = new Ipl(18, "Delhi Capitals", "Delhi", "Rishabh Pant", 0, player18);
		ipl18.getIplDetails();

		Player player19 = new Player(19, "Quinton de Kock", "Wicket-Keeper Batsman", "South African", 4.4);
		Ipl ipl19 = new Ipl(19, "Lucknow Super Giants", "Lucknow", "KL Rahul", 0, player19);
		ipl19.getIplDetails();

		Player player20 = new Player(20, "Axar Patel", "All-Rounder", "Indian", 9.0);
		Ipl ipl20 = new Ipl(20, "Delhi Capitals", "Delhi", "Rishabh Pant", 0, player20);
		ipl20.getIplDetails();


	}
}