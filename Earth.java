class Earth {
	int earthId;
	String continent;
	String climate;
	int population;
	double surfaceArea;
	
	public Earth(int earthId, String continent, String climate, int population, double surfaceArea) {
		this.earthId = earthId;
		this.continent = continent;
		this.climate = climate;
		this.population = population;
		this.surfaceArea = surfaceArea;
	}
	
	public void getEarthDetails() {
		System.out.println("EarthId: " + earthId);
		System.out.println("Continent: " + continent);
		System.out.println("Climate: " + climate);
		System.out.println("Population: " + population);
		System.out.println("SurfaceArea: " + surfaceArea);
	}
}