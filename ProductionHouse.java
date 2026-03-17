class ProductionHouse {
	int houseId;
	String houseName;
	String country;
	int moviesProduced;
	double totalRevenue;
	Movie movie;
	
	public ProductionHouse(int houseId, String houseName, String country, int moviesProduced, double totalRevenue, Movie movie) {
		this.houseId = houseId;
		this.houseName = houseName;
		this.country = country;
		this.moviesProduced = moviesProduced;
		this.totalRevenue = totalRevenue;
		this.movie = movie;
	}
	
	public void getProductionHouseDetails() {
		System.out.println("ProductionHouse Details:");
		System.out.println("HouseId: " + houseId);
		System.out.println("HouseName: " + houseName);
		System.out.println("Country: " + country);
		System.out.println("MoviesProduced: " + moviesProduced);
		System.out.println("TotalRevenue: " + totalRevenue);
		this.movie.getMovieDetails();
		System.out.println("----------------");
	}
}