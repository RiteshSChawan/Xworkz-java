class Ipl {
	int iplId;
	String teamName;
	String city;
	String captain;
	int titlesWon;
	Player player;
	
	public Ipl(int iplId, String teamName, String city, String captain, int titlesWon, Player player) {
		this.iplId = iplId;
		this.teamName = teamName;
		this.city = city;
		this.captain = captain;
		this.titlesWon = titlesWon;
		this.player = player;
	}
	
	public void getIplDetails() {
		System.out.println("IPL Details:");
		System.out.println("IPL Id: " + iplId);
		System.out.println("Team Name: " + teamName);
		System.out.println("City: " + city);
		System.out.println("Captain: " + captain);
		System.out.println("Titles Won: " + titlesWon);
		this.player.getPlayerDetails();
		System.out.println("----------------");
	}
}