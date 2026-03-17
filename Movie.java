class Movie {
	int movieId;
	String movieName;
	String genre;
	double boxOffice;
	boolean isBlockbuster;
	
	public Movie(int movieId, String movieName, String genre, double boxOffice, boolean isBlockbuster) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.genre = genre;
		this.boxOffice = boxOffice;
		this.isBlockbuster = isBlockbuster;
	}
	
	public void getMovieDetails() {
		System.out.println("MovieId: " + movieId);
		System.out.println("MovieName: " + movieName);
		System.out.println("Genre: " + genre);
		System.out.println("BoxOffice: " + boxOffice);
		System.out.println("IsBlockbuster: " + isBlockbuster);
	}
}