class Formula1{

	int raceId;
	String raceName;
	String location;
	int laps;
	String season;
	Franchise franchise;
	
	public Formula1(int raceId, String raceName, String location, int laps, String season, Franchise franchise) {
		this.raceId = raceId;
		this.raceName = raceName;
		this.location = location;
		this.laps = laps;
		this.season = season;
		this.franchise = franchise;
	}
 

	public void getRaceDetails(){
		System.out.println("Formula1 Race Details:");
		System.out.println("Race Id: "+raceId);
		System.out.println("Race Name: "+raceName);
		System.out.println("Location: "+location);
		System.out.println("Laps: "+laps);
		System.out.println("Season: "+season);
		this.franchise.getFranchiseDetails();
		System.out.println("----------------");
	}
}