class Franchise{

	int franchiseId;
	String franchiseName;
	String country;
	int teamMembers;
	String teamColor;
	
	public Franchise(int franchiseId, String franchiseName, String country, int teamMembers, String teamColor) {
		this.franchiseId = franchiseId;
		this.franchiseName = franchiseName;
		this.country = country;
		this.teamMembers = teamMembers;
		this.teamColor = teamColor;
	}

	public void getFranchiseDetails(){
		System.out.println("Franchise details:");
		System.out.println("Franchise Id: "+franchiseId);
		System.out.println("Franchise Name: "+franchiseName);
		System.out.println("Country: "+country);
		System.out.println("Team Members: "+teamMembers);
		System.out.println("Team Color: "+teamColor);
	}
}