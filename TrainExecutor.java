class TrainExecutor{

	public static void main(String[] args){
		/*  //through instance variable
		//1
		Boggie boggie1 = new Boggie();
		boggie1.boggieId = 101;
		boggie1.boggieType = "Sleeper";
		boggie1.seatCapacity = 72;
		boggie1.isAC = false;
		boggie1.boggieColor = "Blue";

		Train train1 = new Train();
		train1.trainId = 1;
		train1.trainName = "Karnataka Express";
		train1.source = "Bangalore";
		train1.destination = "Delhi";
		train1.totalSeats = 1200;
		train1.boggie = boggie1;
		train1.getTrainDetails();


		//2
		Boggie boggie2 = new Boggie();
		boggie2.boggieId = 102;
		boggie2.boggieType = "AC";
		boggie2.seatCapacity = 60;
		boggie2.isAC = true;
		boggie2.boggieColor = "Red";

		Train train2 = new Train();
		train2.trainId = 2;
		train2.trainName = "Rajdhani Express";
		train2.source = "Delhi";
		train2.destination = "Mumbai";
		train2.totalSeats = 1000;
		train2.boggie = boggie2;
		train2.getTrainDetails();


		//3
		Boggie boggie3 = new Boggie();
		boggie3.boggieId = 103;
		boggie3.boggieType = "General";
		boggie3.seatCapacity = 90;
		boggie3.isAC = false;
		boggie3.boggieColor = "Green";

		Train train3 = new Train();
		train3.trainId = 3;
		train3.trainName = "Shatabdi Express";
		train3.source = "Chennai";
		train3.destination = "Bangalore";
		train3.totalSeats = 800;
		train3.boggie = boggie3;
		train3.getTrainDetails();


		//4
		Boggie boggie4 = new Boggie();
		boggie4.boggieId = 104;
		boggie4.boggieType = "Sleeper";
		boggie4.seatCapacity = 72;
		boggie4.isAC = false;
		boggie4.boggieColor = "Blue";

		Train train4 = new Train();
		train4.trainId = 4;
		train4.trainName = "Duronto Express";
		train4.source = "Kolkata";
		train4.destination = "Delhi";
		train4.totalSeats = 950;
		train4.boggie = boggie4;
		train4.getTrainDetails();


		//5
		Boggie boggie5 = new Boggie();
		boggie5.boggieId = 105;
		boggie5.boggieType = "AC";
		boggie5.seatCapacity = 60;
		boggie5.isAC = true;
		boggie5.boggieColor = "White";

		Train train5 = new Train();
		train5.trainId = 5;
		train5.trainName = "Garib Rath";
		train5.source = "Patna";
		train5.destination = "Delhi";
		train5.totalSeats = 900;
		train5.boggie = boggie5;
		train5.getTrainDetails();


		//6
		Boggie boggie6 = new Boggie();
		boggie6.boggieId = 106;
		boggie6.boggieType = "General";
		boggie6.seatCapacity = 100;
		boggie6.isAC = false;
		boggie6.boggieColor = "Yellow";

		Train train6 = new Train();
		train6.trainId = 6;
		train6.trainName = "Intercity Express";
		train6.source = "Hyderabad";
		train6.destination = "Bangalore";
		train6.totalSeats = 850;
		train6.boggie = boggie6;
		train6.getTrainDetails();


		//7
		Boggie boggie7 = new Boggie();
		boggie7.boggieId = 107;
		boggie7.boggieType = "Sleeper";
		boggie7.seatCapacity = 72;
		boggie7.isAC = false;
		boggie7.boggieColor = "Blue";

		Train train7 = new Train();
		train7.trainId = 7;
		train7.trainName = "Jan Shatabdi";
		train7.source = "Pune";
		train7.destination = "Mumbai";
		train7.totalSeats = 700;
		train7.boggie = boggie7;
		train7.getTrainDetails();


		//8
		Boggie boggie8 = new Boggie();
		boggie8.boggieId = 108;
		boggie8.boggieType = "AC";
		boggie8.seatCapacity = 60;
		boggie8.isAC = true;
		boggie8.boggieColor = "Silver";

		Train train8 = new Train();
		train8.trainId = 8;
		train8.trainName = "Tejas Express";
		train8.source = "Mumbai";
		train8.destination = "Goa";
		train8.totalSeats = 750;
		train8.boggie = boggie8;
		train8.getTrainDetails();


		//9
		Boggie boggie9 = new Boggie();
		boggie9.boggieId = 109;
		boggie9.boggieType = "Sleeper";
		boggie9.seatCapacity = 72;
		boggie9.isAC = false;
		boggie9.boggieColor = "Blue";

		Train train9 = new Train();
		train9.trainId = 9;
		train9.trainName = "Humsafar Express";
		train9.source = "Ahmedabad";
		train9.destination = "Delhi";
		train9.totalSeats = 880;
		train9.boggie = boggie9;
		train9.getTrainDetails();


		//10
		Boggie boggie10 = new Boggie();
		boggie10.boggieId = 110;
		boggie10.boggieType = "AC";
		boggie10.seatCapacity = 60;
		boggie10.isAC = true;
		boggie10.boggieColor = "Red";

		Train train10 = new Train();
		train10.trainId = 10;
		train10.trainName = "Vande Bharat";
		train10.source = "Delhi";
		train10.destination = "Varanasi";
		train10.totalSeats = 600;
		train10.boggie = boggie10;
		train10.getTrainDetails();


		//11 - 20 (same pattern)

		Boggie boggie11 = new Boggie();
		boggie11.boggieId = 111;
		boggie11.boggieType = "General";
		boggie11.seatCapacity = 95;
		boggie11.isAC = false;
		boggie11.boggieColor = "Green";

		Train train11 = new Train();
		train11.trainId = 11;
		train11.trainName = "Island Express";
		train11.source = "Kanyakumari";
		train11.destination = "Bangalore";
		train11.totalSeats = 950;
		train11.boggie = boggie11;
		train11.getTrainDetails();


		Boggie boggie12 = new Boggie();
		boggie12.boggieId = 112;
		boggie12.boggieType = "Sleeper";
		boggie12.seatCapacity = 72;
		boggie12.isAC = false;
		boggie12.boggieColor = "Blue";

		Train train12 = new Train();
		train12.trainId = 12;
		train12.trainName = "Kerala Express";
		train12.source = "Trivandrum";
		train12.destination = "Delhi";
		train12.totalSeats = 1100;
		train12.boggie = boggie12;
		train12.getTrainDetails();


		Boggie boggie13 = new Boggie();
		boggie13.boggieId = 113;
		boggie13.boggieType = "AC";
		boggie13.seatCapacity = 60;
		boggie13.isAC = true;
		boggie13.boggieColor = "White";

		Train train13 = new Train();
		train13.trainId = 13;
		train13.trainName = "Mysore Express";
		train13.source = "Chennai";
		train13.destination = "Mysore";
		train13.totalSeats = 700;
		train13.boggie = boggie13;
		train13.getTrainDetails();


		Boggie boggie14 = new Boggie();
		boggie14.boggieId = 114;
		boggie14.boggieType = "General";
		boggie14.seatCapacity = 100;
		boggie14.isAC = false;
		boggie14.boggieColor = "Yellow";

		Train train14 = new Train();
		train14.trainId = 14;
		train14.trainName = "Madurai Express";
		train14.source = "Chennai";
		train14.destination = "Madurai";
		train14.totalSeats = 850;
		train14.boggie = boggie14;
		train14.getTrainDetails();


		Boggie boggie15 = new Boggie();
		boggie15.boggieId = 115;
		boggie15.boggieType = "Sleeper";
		boggie15.seatCapacity = 72;
		boggie15.isAC = false;
		boggie15.boggieColor = "Blue";

		Train train15 = new Train();
		train15.trainId = 15;
		train15.trainName = "Uday Express";
		train15.source = "Coimbatore";
		train15.destination = "Bangalore";
		train15.totalSeats = 780;
		train15.boggie = boggie15;
		train15.getTrainDetails();


		Boggie boggie16 = new Boggie();
		boggie16.boggieId = 116;
		boggie16.boggieType = "AC";
		boggie16.seatCapacity = 60;
		boggie16.isAC = true;
		boggie16.boggieColor = "Silver";

		Train train16 = new Train();
		train16.trainId = 16;
		train16.trainName = "Double Decker";
		train16.source = "Chennai";
		train16.destination = "Bangalore";
		train16.totalSeats = 650;
		train16.boggie = boggie16;
		train16.getTrainDetails();


		Boggie boggie17 = new Boggie();
		boggie17.boggieId = 117;
		boggie17.boggieType = "General";
		boggie17.seatCapacity = 100;
		boggie17.isAC = false;
		boggie17.boggieColor = "Green";

		Train train17 = new Train();
		train17.trainId = 17;
		train17.trainName = "Passenger Express";
		train17.source = "Hubli";
		train17.destination = "Bangalore";
		train17.totalSeats = 600;
		train17.boggie = boggie17;
		train17.getTrainDetails();


		Boggie boggie18 = new Boggie();
		boggie18.boggieId = 118;
		boggie18.boggieType = "Sleeper";
		boggie18.seatCapacity = 72;
		boggie18.isAC = false;
		boggie18.boggieColor = "Blue";

		Train train18 = new Train();
		train18.trainId = 18;
		train18.trainName = "Gujarat Express";
		train18.source = "Ahmedabad";
		train18.destination = "Mumbai";
		train18.totalSeats = 870;
		train18.boggie = boggie18;
		train18.getTrainDetails();


		Boggie boggie19 = new Boggie();
		boggie19.boggieId = 119;
		boggie19.boggieType = "AC";
		boggie19.seatCapacity = 60;
		boggie19.isAC = true;
		boggie19.boggieColor = "Red";

		Train train19 = new Train();
		train19.trainId = 19;
		train19.trainName = "Lucknow Express";
		train19.source = "Delhi";
		train19.destination = "Lucknow";
		train19.totalSeats = 920;
		train19.boggie = boggie19;
		train19.getTrainDetails();


		Boggie boggie20 = new Boggie();
		boggie20.boggieId = 120;
		boggie20.boggieType = "Sleeper";
		boggie20.seatCapacity = 72;
		boggie20.isAC = false;
		boggie20.boggieColor = "Blue";

		Train train20 = new Train();
		train20.trainId = 20;
		train20.trainName = "Amritsar Express";
		train20.source = "Delhi";
		train20.destination = "Amritsar";
		train20.totalSeats = 1000;
		train20.boggie = boggie20;
		train20.getTrainDetails(); 
		*/
		
		//through parameterized constructor
		
		Boggie boggie1 = new Boggie(101,"sleeper",72,false,"blue");
		Train train1 = new Train(1,"Karnataka Express","Bangalore","Delhi",1200,boggie1);
		train1.boggie = boggie1;
		train1.getTrainDetails(); 
Boggie boggie2 = new Boggie(102, "AC", 60, true, "Red");
		Train train2 = new Train(2, "Rajdhani Express", "Delhi", "Mumbai", 1000, boggie2);
		train2.getTrainDetails();
 
		Boggie boggie3 = new Boggie(103, "General", 90, false, "Green");
		Train train3 = new Train(3, "Shatabdi Express", "Chennai", "Bangalore", 800, boggie3);
		train3.getTrainDetails();
 
		Boggie boggie4 = new Boggie(104, "Sleeper", 72, false, "Blue");
		Train train4 = new Train(4, "Duronto Express", "Kolkata", "Delhi", 950, boggie4);
		train4.getTrainDetails();
 
		Boggie boggie5 = new Boggie(105, "AC", 60, true, "White");
		Train train5 = new Train(5, "Garib Rath", "Patna", "Delhi", 900, boggie5);
		train5.getTrainDetails();
 
		Boggie boggie6 = new Boggie(106, "General", 100, false, "Yellow");
		Train train6 = new Train(6, "Intercity Express", "Hyderabad", "Bangalore", 850, boggie6);
		train6.getTrainDetails();
 
		Boggie boggie7 = new Boggie(107, "Sleeper", 72, false, "Blue");
		Train train7 = new Train(7, "Jan Shatabdi", "Pune", "Mumbai", 700, boggie7);
		train7.getTrainDetails();
 
		Boggie boggie8 = new Boggie(108, "AC", 60, true, "Silver");
		Train train8 = new Train(8, "Tejas Express", "Mumbai", "Goa", 750, boggie8);
		train8.getTrainDetails();
 
		Boggie boggie9 = new Boggie(109, "Sleeper", 72, false, "Blue");
		Train train9 = new Train(9, "Humsafar Express", "Ahmedabad", "Delhi", 880, boggie9);
		train9.getTrainDetails();
 
		Boggie boggie10 = new Boggie(110, "AC", 60, true, "Red");
		Train train10 = new Train(10, "Vande Bharat", "Delhi", "Varanasi", 600, boggie10);
		train10.getTrainDetails();
 
		Boggie boggie11 = new Boggie(111, "General", 95, false, "Green");
		Train train11 = new Train(11, "Island Express", "Kanyakumari", "Bangalore", 950, boggie11);
		train11.getTrainDetails();
 
		Boggie boggie12 = new Boggie(112, "Sleeper", 72, false, "Blue");
		Train train12 = new Train(12, "Kerala Express", "Trivandrum", "Delhi", 1100, boggie12);
		train12.getTrainDetails();
 
		Boggie boggie13 = new Boggie(113, "AC", 60, true, "White");
		Train train13 = new Train(13, "Mysore Express", "Chennai", "Mysore", 700, boggie13);
		train13.getTrainDetails();
 
		Boggie boggie14 = new Boggie(114, "General", 100, false, "Yellow");
		Train train14 = new Train(14, "Madurai Express", "Chennai", "Madurai", 850, boggie14);
		train14.getTrainDetails();
 
		Boggie boggie15 = new Boggie(115, "Sleeper", 72, false, "Blue");
		Train train15 = new Train(15, "Uday Express", "Coimbatore", "Bangalore", 780, boggie15);
		train15.getTrainDetails();
 
		Boggie boggie16 = new Boggie(116, "AC", 60, true, "Silver");
		Train train16 = new Train(16, "Double Decker", "Chennai", "Bangalore", 650, boggie16);
		train16.getTrainDetails();
 
		Boggie boggie17 = new Boggie(117, "General", 100, false, "Green");
		Train train17 = new Train(17, "Passenger Express", "Hubli", "Bangalore", 600, boggie17);
		train17.getTrainDetails();
 
		Boggie boggie18 = new Boggie(118, "Sleeper", 72, false, "Blue");
		Train train18 = new Train(18, "Gujarat Express", "Ahmedabad", "Mumbai", 870, boggie18);
		train18.getTrainDetails();
 
		Boggie boggie19 = new Boggie(119, "AC", 60, true, "Red");
		Train train19 = new Train(19, "Lucknow Express", "Delhi", "Lucknow", 920, boggie19);
		train19.getTrainDetails();
 
		Boggie boggie20 = new Boggie(120, "Sleeper", 72, false, "Blue");
		Train train20 = new Train(20, "Amritsar Express", "Delhi", "Amritsar", 1000, boggie20);
		train20.getTrainDetails();		
	}
}