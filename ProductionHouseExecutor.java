class ProductionHouseExecutor {
	public static void main(String[] args) {
/*
		Movie movie1 = new Movie();
		movie1.movieId = 1;
		movie1.movieName = "Brahmastra";
		movie1.genre = "Fantasy";
		movie1.boxOffice = 425.0;
		movie1.isBlockbuster = true;
		ProductionHouse productionHouse1 = new ProductionHouse();
		productionHouse1.houseId = 1;
		productionHouse1.houseName = "Dharma Productions";
		productionHouse1.country = "India";
		productionHouse1.moviesProduced = 120;
		productionHouse1.totalRevenue = 5000.0;
		productionHouse1.movie = movie1;
		productionHouse1.getProductionHouseDetails();

		Movie movie2 = new Movie();
		movie2.movieId = 2;
		movie2.movieName = "Tiger Zinda Hai";
		movie2.genre = "Action";
		movie2.boxOffice = 565.0;
		movie2.isBlockbuster = true;
		ProductionHouse productionHouse2 = new ProductionHouse();
		productionHouse2.houseId = 2;
		productionHouse2.houseName = "Yash Raj Films";
		productionHouse2.country = "India";
		productionHouse2.moviesProduced = 200;
		productionHouse2.totalRevenue = 8000.0;
		productionHouse2.movie = movie2;
		productionHouse2.getProductionHouseDetails();

		Movie movie3 = new Movie();
		movie3.movieId = 3;
		movie3.movieName = "Avengers Endgame";
		movie3.genre = "Superhero";
		movie3.boxOffice = 22600.0;
		movie3.isBlockbuster = true;
		ProductionHouse productionHouse3 = new ProductionHouse();
		productionHouse3.houseId = 3;
		productionHouse3.houseName = "Marvel Studios";
		productionHouse3.country = "USA";
		productionHouse3.moviesProduced = 30;
		productionHouse3.totalRevenue = 150000.0;
		productionHouse3.movie = movie3;
		productionHouse3.getProductionHouseDetails();

		Movie movie4 = new Movie();
		movie4.movieId = 4;
		movie4.movieName = "The Dark Knight";
		movie4.genre = "Action";
		movie4.boxOffice = 10000.0;
		movie4.isBlockbuster = true;
		ProductionHouse productionHouse4 = new ProductionHouse();
		productionHouse4.houseId = 4;
		productionHouse4.houseName = "Warner Bros";
		productionHouse4.country = "USA";
		productionHouse4.moviesProduced = 500;
		productionHouse4.totalRevenue = 200000.0;
		productionHouse4.movie = movie4;
		productionHouse4.getProductionHouseDetails();

		Movie movie5 = new Movie();
		movie5.movieId = 5;
		movie5.movieName = "The Lion King";
		movie5.genre = "Animation";
		movie5.boxOffice = 16600.0;
		movie5.isBlockbuster = true;
		ProductionHouse productionHouse5 = new ProductionHouse();
		productionHouse5.houseId = 5;
		productionHouse5.houseName = "Disney";
		productionHouse5.country = "USA";
		productionHouse5.moviesProduced = 400;
		productionHouse5.totalRevenue = 300000.0;
		productionHouse5.movie = movie5;
		productionHouse5.getProductionHouseDetails();

		Movie movie6 = new Movie();
		movie6.movieId = 6;
		movie6.movieName = "Chennai Express";
		movie6.genre = "Comedy";
		movie6.boxOffice = 423.0;
		movie6.isBlockbuster = true;
		ProductionHouse productionHouse6 = new ProductionHouse();
		productionHouse6.houseId = 6;
		productionHouse6.houseName = "Red Chillies Entertainment";
		productionHouse6.country = "India";
		productionHouse6.moviesProduced = 30;
		productionHouse6.totalRevenue = 3000.0;
		productionHouse6.movie = movie6;
		productionHouse6.getProductionHouseDetails();

		Movie movie7 = new Movie();
		movie7.movieId = 7;
		movie7.movieName = "Dil Dhadakne Do";
		movie7.genre = "Drama";
		movie7.boxOffice = 128.0;
		movie7.isBlockbuster = false;
		ProductionHouse productionHouse7 = new ProductionHouse();
		productionHouse7.houseId = 7;
		productionHouse7.houseName = "Excel Entertainment";
		productionHouse7.country = "India";
		productionHouse7.moviesProduced = 25;
		productionHouse7.totalRevenue = 1500.0;
		productionHouse7.movie = movie7;
		productionHouse7.getProductionHouseDetails();

		Movie movie8 = new Movie();
		movie8.movieId = 8;
		movie8.movieName = "Spider-Man No Way Home";
		movie8.genre = "Superhero";
		movie8.boxOffice = 19000.0;
		movie8.isBlockbuster = true;
		ProductionHouse productionHouse8 = new ProductionHouse();
		productionHouse8.houseId = 8;
		productionHouse8.houseName = "Sony Pictures";
		productionHouse8.country = "USA";
		productionHouse8.moviesProduced = 600;
		productionHouse8.totalRevenue = 180000.0;
		productionHouse8.movie = movie8;
		productionHouse8.getProductionHouseDetails();

		Movie movie9 = new Movie();
		movie9.movieId = 9;
		movie9.movieName = "Jurassic World";
		movie9.genre = "Sci-Fi";
		movie9.boxOffice = 16700.0;
		movie9.isBlockbuster = true;
		ProductionHouse productionHouse9 = new ProductionHouse();
		productionHouse9.houseId = 9;
		productionHouse9.houseName = "Universal Pictures";
		productionHouse9.country = "USA";
		productionHouse9.moviesProduced = 450;
		productionHouse9.totalRevenue = 160000.0;
		productionHouse9.movie = movie9;
		productionHouse9.getProductionHouseDetails();

		Movie movie10 = new Movie();
		movie10.movieId = 10;
		movie10.movieName = "KGF Chapter 2";
		movie10.genre = "Action";
		movie10.boxOffice = 1200.0;
		movie10.isBlockbuster = true;
		ProductionHouse productionHouse10 = new ProductionHouse();
		productionHouse10.houseId = 10;
		productionHouse10.houseName = "Hombale Films";
		productionHouse10.country = "India";
		productionHouse10.moviesProduced = 10;
		productionHouse10.totalRevenue = 4000.0;
		productionHouse10.movie = movie10;
		productionHouse10.getProductionHouseDetails();

		Movie movie11 = new Movie();
		movie11.movieId = 11;
		movie11.movieName = "Kabir Singh";
		movie11.genre = "Romance";
		movie11.boxOffice = 379.0;
		movie11.isBlockbuster = true;
		ProductionHouse productionHouse11 = new ProductionHouse();
		productionHouse11.houseId = 11;
		productionHouse11.houseName = "T-Series Films";
		productionHouse11.country = "India";
		productionHouse11.moviesProduced = 80;
		productionHouse11.totalRevenue = 2000.0;
		productionHouse11.movie = movie11;
		productionHouse11.getProductionHouseDetails();

		Movie movie12 = new Movie();
		movie12.movieId = 12;
		movie12.movieName = "Dangal";
		movie12.genre = "Sports";
		movie12.boxOffice = 2024.0;
		movie12.isBlockbuster = true;
		ProductionHouse productionHouse12 = new ProductionHouse();
		productionHouse12.houseId = 12;
		productionHouse12.houseName = "Aamir Khan Productions";
		productionHouse12.country = "India";
		productionHouse12.moviesProduced = 15;
		productionHouse12.totalRevenue = 6000.0;
		productionHouse12.movie = movie12;
		productionHouse12.getProductionHouseDetails();

		Movie movie13 = new Movie();
		movie13.movieId = 13;
		movie13.movieName = "Stree 2";
		movie13.genre = "Horror Comedy";
		movie13.boxOffice = 620.0;
		movie13.isBlockbuster = true;
		ProductionHouse productionHouse13 = new ProductionHouse();
		productionHouse13.houseId = 13;
		productionHouse13.houseName = "Maddock Films";
		productionHouse13.country = "India";
		productionHouse13.moviesProduced = 20;
		productionHouse13.totalRevenue = 1800.0;
		productionHouse13.movie = movie13;
		productionHouse13.getProductionHouseDetails();

		Movie movie14 = new Movie();
		movie14.movieId = 14;
		movie14.movieName = "Baahubali 2";
		movie14.genre = "Epic";
		movie14.boxOffice = 1810.0;
		movie14.isBlockbuster = true;
		ProductionHouse productionHouse14 = new ProductionHouse();
		productionHouse14.houseId = 14;
		productionHouse14.houseName = "Pen Studios";
		productionHouse14.country = "India";
		productionHouse14.moviesProduced = 40;
		productionHouse14.totalRevenue = 1200.0;
		productionHouse14.movie = movie14;
		productionHouse14.getProductionHouseDetails();

		Movie movie15 = new Movie();
		movie15.movieId = 15;
		movie15.movieName = "Animal";
		movie15.genre = "Action Drama";
		movie15.boxOffice = 917.0;
		movie15.isBlockbuster = true;
		ProductionHouse productionHouse15 = new ProductionHouse();
		productionHouse15.houseId = 15;
		productionHouse15.houseName = "Viacom18 Studios";
		productionHouse15.country = "India";
		productionHouse15.moviesProduced = 35;
		productionHouse15.totalRevenue = 2500.0;
		productionHouse15.movie = movie15;
		productionHouse15.getProductionHouseDetails();

		Movie movie16 = new Movie();
		movie16.movieId = 16;
		movie16.movieName = "Ek Villain";
		movie16.genre = "Thriller";
		movie16.boxOffice = 105.0;
		movie16.isBlockbuster = false;
		ProductionHouse productionHouse16 = new ProductionHouse();
		productionHouse16.houseId = 16;
		productionHouse16.houseName = "Balaji Telefilms";
		productionHouse16.country = "India";
		productionHouse16.moviesProduced = 60;
		productionHouse16.totalRevenue = 800.0;
		productionHouse16.movie = movie16;
		productionHouse16.getProductionHouseDetails();

		Movie movie17 = new Movie();
		movie17.movieId = 17;
		movie17.movieName = "MS Dhoni Biopic";
		movie17.genre = "Biography";
		movie17.boxOffice = 216.0;
		movie17.isBlockbuster = true;
		ProductionHouse productionHouse17 = new ProductionHouse();
		productionHouse17.houseId = 17;
		productionHouse17.houseName = "Fox Star Studios";
		productionHouse17.country = "India";
		productionHouse17.moviesProduced = 50;
		productionHouse17.totalRevenue = 3000.0;
		productionHouse17.movie = movie17;
		productionHouse17.getProductionHouseDetails();

		Movie movie18 = new Movie();
		movie18.movieId = 18;
		movie18.movieName = "Pushpa 2";
		movie18.genre = "Action";
		movie18.boxOffice = 1800.0;
		movie18.isBlockbuster = true;
		ProductionHouse productionHouse18 = new ProductionHouse();
		productionHouse18.houseId = 18;
		productionHouse18.houseName = "Mythri Movie Makers";
		productionHouse18.country = "India";
		productionHouse18.moviesProduced = 20;
		productionHouse18.totalRevenue = 2200.0;
		productionHouse18.movie = movie18;
		productionHouse18.getProductionHouseDetails();

		Movie movie19 = new Movie();
		movie19.movieId = 19;
		movie19.movieName = "RRR";
		movie19.genre = "Period Action";
		movie19.boxOffice = 1200.0;
		movie19.isBlockbuster = true;
		ProductionHouse productionHouse19 = new ProductionHouse();
		productionHouse19.houseId = 19;
		productionHouse19.houseName = "Sri Venkateswara Creations";
		productionHouse19.country = "India";
		productionHouse19.moviesProduced = 25;
		productionHouse19.totalRevenue = 1600.0;
		productionHouse19.movie = movie19;
		productionHouse19.getProductionHouseDetails();

		Movie movie20 = new Movie();
		movie20.movieId = 20;
		movie20.movieName = "Bard of Blood";
		movie20.genre = "Thriller";
		movie20.boxOffice = 45.0;
		movie20.isBlockbuster = false;
		ProductionHouse productionHouse20 = new ProductionHouse();
		productionHouse20.houseId = 20;
		productionHouse20.houseName = "Junglee Pictures";
		productionHouse20.country = "India";
		productionHouse20.moviesProduced = 18;
		productionHouse20.totalRevenue = 900.0;
		productionHouse20.movie = movie20;
		productionHouse20.getProductionHouseDetails(); */
		

		Movie movie1 = new Movie(1, "Brahmastra", "Fantasy", 425.0, true);
		ProductionHouse productionHouse1 = new ProductionHouse(1, "Dharma Productions", "India", 120, 5000.0, movie1);
		productionHouse1.getProductionHouseDetails();

		Movie movie2 = new Movie(2, "Tiger Zinda Hai", "Action", 565.0, true);
		ProductionHouse productionHouse2 = new ProductionHouse(2, "Yash Raj Films", "India", 200, 8000.0, movie2);
		productionHouse2.getProductionHouseDetails();

		Movie movie3 = new Movie(3, "Avengers Endgame", "Superhero", 22600.0, true);
		ProductionHouse productionHouse3 = new ProductionHouse(3, "Marvel Studios", "USA", 30, 150000.0, movie3);
		productionHouse3.getProductionHouseDetails();

		Movie movie4 = new Movie(4, "The Dark Knight", "Action", 10000.0, true);
		ProductionHouse productionHouse4 = new ProductionHouse(4, "Warner Bros", "USA", 500, 200000.0, movie4);
		productionHouse4.getProductionHouseDetails();

		Movie movie5 = new Movie(5, "The Lion King", "Animation", 16600.0, true);
		ProductionHouse productionHouse5 = new ProductionHouse(5, "Disney", "USA", 400, 300000.0, movie5);
		productionHouse5.getProductionHouseDetails();

		Movie movie6 = new Movie(6, "Chennai Express", "Comedy", 423.0, true);
		ProductionHouse productionHouse6 = new ProductionHouse(6, "Red Chillies Entertainment", "India", 30, 3000.0, movie6);
		productionHouse6.getProductionHouseDetails();

		Movie movie7 = new Movie(7, "Dil Dhadakne Do", "Drama", 128.0, false);
		ProductionHouse productionHouse7 = new ProductionHouse(7, "Excel Entertainment", "India", 25, 1500.0, movie7);
		productionHouse7.getProductionHouseDetails();

		Movie movie8 = new Movie(8, "Spider-Man No Way Home", "Superhero", 19000.0, true);
		ProductionHouse productionHouse8 = new ProductionHouse(8, "Sony Pictures", "USA", 600, 180000.0, movie8);
		productionHouse8.getProductionHouseDetails();

		Movie movie9 = new Movie(9, "Jurassic World", "Sci-Fi", 16700.0, true);
		ProductionHouse productionHouse9 = new ProductionHouse(9, "Universal Pictures", "USA", 450, 160000.0, movie9);
		productionHouse9.getProductionHouseDetails();

		Movie movie10 = new Movie(10, "KGF Chapter 2", "Action", 1200.0, true);
		ProductionHouse productionHouse10 = new ProductionHouse(10, "Hombale Films", "India", 10, 4000.0, movie10);
		productionHouse10.getProductionHouseDetails();

		Movie movie11 = new Movie(11, "Kabir Singh", "Romance", 379.0, true);
		ProductionHouse productionHouse11 = new ProductionHouse(11, "T-Series Films", "India", 80, 2000.0, movie11);
		productionHouse11.getProductionHouseDetails();

		Movie movie12 = new Movie(12, "Dangal", "Sports", 2024.0, true);
		ProductionHouse productionHouse12 = new ProductionHouse(12, "Aamir Khan Productions", "India", 15, 6000.0, movie12);
		productionHouse12.getProductionHouseDetails();

		Movie movie13 = new Movie(13, "Stree 2", "Horror Comedy", 620.0, true);
		ProductionHouse productionHouse13 = new ProductionHouse(13, "Maddock Films", "India", 20, 1800.0, movie13);
		productionHouse13.getProductionHouseDetails();

		Movie movie14 = new Movie(14, "Baahubali 2", "Epic", 1810.0, true);
		ProductionHouse productionHouse14 = new ProductionHouse(14, "Pen Studios", "India", 40, 1200.0, movie14);
		productionHouse14.getProductionHouseDetails();

		Movie movie15 = new Movie(15, "Animal", "Action Drama", 917.0, true);
		ProductionHouse productionHouse15 = new ProductionHouse(15, "Viacom18 Studios", "India", 35, 2500.0, movie15);
		productionHouse15.getProductionHouseDetails();

		Movie movie16 = new Movie(16, "Ek Villain", "Thriller", 105.0, false);
		ProductionHouse productionHouse16 = new ProductionHouse(16, "Balaji Telefilms", "India", 60, 800.0, movie16);
		productionHouse16.getProductionHouseDetails();

		Movie movie17 = new Movie(17, "MS Dhoni Biopic", "Biography", 216.0, true);
		ProductionHouse productionHouse17 = new ProductionHouse(17, "Fox Star Studios", "India", 50, 3000.0, movie17);
		productionHouse17.getProductionHouseDetails();

		Movie movie18 = new Movie(18, "Pushpa 2", "Action", 1800.0, true);
		ProductionHouse productionHouse18 = new ProductionHouse(18, "Mythri Movie Makers", "India", 20, 2200.0, movie18);
		productionHouse18.getProductionHouseDetails();

		Movie movie19 = new Movie(19, "RRR", "Period Action", 1200.0, true);
		ProductionHouse productionHouse19 = new ProductionHouse(19, "Sri Venkateswara Creations", "India", 25, 1600.0, movie19);
		productionHouse19.getProductionHouseDetails();

		Movie movie20 = new Movie(20, "Bard of Blood", "Thriller", 45.0, false);
		ProductionHouse productionHouse20 = new ProductionHouse(20, "Junglee Pictures", "India", 18, 900.0, movie20);
		productionHouse20.getProductionHouseDetails();

	}
}