class Museum {
	int museumId;
	String museumName;
	String location;
	int totalExhibits;
	double entryFee;
	Diamond diamond;
	
	public Museum(int museumId, String museumName, String location, int totalExhibits, double entryFee, Diamond diamond) {
		this.museumId = museumId;
		this.museumName = museumName;
		this.location = location;
		this.totalExhibits = totalExhibits;
		this.entryFee = entryFee;
		this.diamond = diamond;
	}
	
	public void getMuseumDetails() {
		System.out.println("Museum Details:");
		System.out.println("Museum Id: " + museumId);
		System.out.println("Museum Name: " + museumName);
		System.out.println("Location: " + location);
		System.out.println("Total Exhibits: " + totalExhibits);
		System.out.println("Entry Fee: " + entryFee);
		this.diamond.getDiamondDetails();
		System.out.println("----------------");
	}
}