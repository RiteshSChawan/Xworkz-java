class Universe {
	int universeId;
	String universeName;
	String galaxyType;
	double ageInBillionYears;
	boolean isExpanding;
	Earth earth;
	
	public Universe(int universeId, String universeName, String galaxyType, double ageInBillionYears, boolean isExpanding, Earth earth) {
		this.universeId = universeId;
		this.universeName = universeName;
		this.galaxyType = galaxyType;
		this.ageInBillionYears = ageInBillionYears;
		this.isExpanding = isExpanding;
		this.earth = earth;
	}
	
	public void getUniverseDetails() {
		System.out.println("Universe Details:");
		System.out.println("UniverseId: " + universeId);
		System.out.println("UniverseName: " + universeName);
		System.out.println("GalaxyType: " + galaxyType);
		System.out.println("AgeInBillionYears: " + ageInBillionYears);
		System.out.println("IsExpanding: " + isExpanding);
		this.earth.getEarthDetails();
		System.out.println("----------------");
	}
}