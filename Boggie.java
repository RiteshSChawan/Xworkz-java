class Boggie{

	int boggieId;
	String boggieType;
	int seatCapacity;
	boolean isAC;
	String boggieColor;
	
	public Boggie(	int boggieId,String boggieType,int seatCapacity,boolean isAC,String boggieColor){
		this.boggieId=boggieId;
		this.boggieType=boggieType;
		this.seatCapacity=seatCapacity;
		this.isAC=isAC;
		this.boggieColor=boggieColor;
	}

	public void getBoggieDetails(){
		System.out.println("The boggie details are : ");
		System.out.println("Boggie id : "+boggieId);
		System.out.println("Boggie type : "+boggieType);
		System.out.println("Seat capacity : "+seatCapacity);
		System.out.println("Is AC : "+isAC);
		System.out.println("Boggie color : "+boggieColor);
	}
}