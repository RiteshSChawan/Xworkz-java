class Train{

	int trainId;
	String trainName;
	String source;
	String destination;
	int totalSeats;
	Boggie boggie;
	
	public Train(int trainId,String trainName,String source, String destination,int totalSeats,Boggie boggie){
		this.trainId = trainId;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.totalSeats = totalSeats;
		this.boggie = boggie;
		
	}

	public void getTrainDetails(){
		System.out.println("The train details are : ");
		System.out.println("Train id : "+trainId);
		System.out.println("Train name : "+trainName);
		System.out.println("Source : "+source);
		System.out.println("Destination : "+destination);
		System.out.println("Total seats : "+totalSeats);
		this.boggie.getBoggieDetails();
		System.out.println("-------------");
	}
}