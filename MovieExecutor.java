
class MovieExecutor {
    public static void main(String[] args) {
        boolean isValidate;

        isValidate = Movie.createMovie("Inception", "Christopher Nolan", "Emma Thomas", "Leonardo DiCaprio", "Marion Cotillard", 160.0, 2010, 8.8, "Sci-Fi", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("RRR", "S.S. Rajamouli", "D.V.V. Danayya", "NTR Jr", "Ram Charan", 550.0, 2022, 7.8, "Action", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Interstellar", "Christopher Nolan", "Lynda Obst", "Matthew McConaughey", "Anne Hathaway", 165.0, 2014, 8.7, "Sci-Fi", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Bahubali", "S.S. Rajamouli", "Shobu Yarlagadda", "Prabhas", "Anushka Shetty", 180.0, 2015, 8.0, "Epic", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("KGF", "Prashanth Neel", "Vijay Kiragandur", "Yash", "Srinidhi Shetty", 80.0, 2018, 8.2, "Action", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Dangal", "Nitesh Tiwari", "Aamir Khan", "Aamir Khan", "Fatima Sana Shaikh", 70.0, 2016, 8.3, "Sports", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Pushpa", "Sukumar", "Naveen Yerneni", "Allu Arjun", "Rashmika Mandanna", 200.0, 2021, 7.6, "Action", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Kantara", "Rishab Shetty", "Vijay Kiragandur", "Rishab Shetty", "Saptami Gowda", 16.0, 2022, 8.3, "Thriller", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Pathaan", "Siddharth Anand", "Aditya Chopra", "Shah Rukh Khan", "Deepika Padukone", 250.0, 2023, 5.9, "Action", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Titanic", "James Cameron", "Jon Landau", "Leonardo DiCaprio", "Kate Winslet", 200.0, 1997, 7.9, "Romance", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Vikram", "Lokesh Kanagaraj", "Kamal Haasan", "Kamal Haasan", "Shivani Narayanan", 120.0, 2022, 8.3, "Action", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Avatar", "James Cameron", "James Cameron", "Sam Worthington", "Zoe Saldana", 237.0, 2009, 7.9, "Sci-Fi", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie(null, "Director", "Producer", "Hero", "Heroine", 100.0, 2023, 7.0, "Drama", false);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Jawan", null, "Gauri Khan", "SRK", "Nayanthara", 300.0, 2023, 7.0, "Action", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Salar", "Prashanth Neel", null, "Prabhas", "Shruti Haasan", 400.0, 2023, 6.5, "Action", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Leo", "Lokesh", "Lalit", null, "Trisha", 250.0, 2023, 7.2, "Action", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Animal", "Vanga", "Bhushan", "Ranbir", null, 100.0, 2023, 6.8, "Drama", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Gadar 2", "Anil Sharma", "Anil Sharma", "Sunny Deol", "Ameesha Patel", 0, 2023, 5.2, "Action", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Dunki", "Rajkumar Hirani", "Gauri Khan", "SRK", "Taapsee", 120.0, 1800, 7.5, "Drama", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Fighter", "Siddharth Anand", "Mamta Anand", "Hrithik Roshan", "Deepika", 250.0, 2024, 11.0, "Action", false);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Tiger 3", "Maneesh Sharma", "Aditya", "Salman", "Katrina", 300.0, 2023, 7.0, null, true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("", "", "", "", "", 0.0, 0, 0.0, "", false);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie(null, null, null, null, null, -1.0, -5, 12.0, null, false);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Major", "Sashi", "Mahesh Babu", "Adivi Sesh", "Saiee Manjrekar", 30.0, 2022, 8.1, "Biopic", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Drishyam", "Jeethu Joseph", "Antony", "Mohanlal", "Meena", 5.0, 2013, 8.3, "Thriller", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Charlie 777", "Kiranraj", "Rakshit Shetty", "Rakshit Shetty", "Sangeetha", 20.0, 2022, 8.7, "Adventure", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Sita Ramam", "Hanu", "Ashwini Dutt", "Dulquer", "Mrunal Thakur", 30.0, 2022, 8.6, "Romance", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Lucifer", "Prithviraj", "Antony", "Mohanlal", "Manju Warrier", 30.0, 2019, 7.5, "Action", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Master", "Lokesh", "Xavier", "Vijay", "Malavika", 135.0, 2021, 7.3, "Action", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Karthikeya 2", "Chandoo", "Abhishek", "Nikhil", "Anupama", 15.0, 2022, 7.9, "Mystery", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Ponniyin Selvan", "Mani Ratnam", "Lyca", "Vikram", "Aishwarya Rai", 500.0, 2022, 7.6, "Historical", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Lagaan", "Ashutosh", "Aamir Khan", "Aamir Khan", "Gracy Singh", 25.0, 2001, 8.1, "Drama", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Sholay", "Ramesh Sippy", "G.P. Sippy", "Amitabh Bachchan", "Hema Malini", 3.0, 1975, 8.1, "Action", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("3 Idiots", "Rajkumar Hirani", "Vidhu Vinod Chopra", "Aamir Khan", "Kareena Kapoor", 55.0, 2009, 8.4, "Comedy", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Masan", "Neeraj Ghaywan", "Vikas Bahl", "Vicky Kaushal", "Shweta Tripathi", 8.0, 2015, 8.1, "Drama", false);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("Tumbbad", "Rahi Anil", "Sohum Shah", "Sohum Shah", "Jyoti Malshe", 5.0, 2018, 8.2, "Horror", true);
        Movie.getMovieDetails();

        isValidate = Movie.createMovie("The Dark Knight", "Christopher Nolan", "Charles Roven", "Christian Bale", "Maggie Gyllenhaal", 185.0, 2008, 9.0, "Action", true);
        Movie.getMovieDetails();
    }
}
