
class Movie {
    static String title;
    static String director;
    static String producer;
    static String hero;
    static String heroine;
    static double budget;
    static int releaseYear;
    static double rating;
    static String genre;
    static boolean isBlockbuster;

    public static boolean createMovie(String movieTitle, String directorName, String producerName, String heroName, String heroineName, double budgetAmt, int year, double ratingVal, String genreType, boolean blockbusterStatus) {
        boolean isMovieCreated = false;

        boolean isTitleValid = false;
        boolean isDirectorValid = false;
        boolean isProducerValid = false;
        boolean isHeroValid = false;
        boolean isHeroineValid = false;
        boolean isBudgetValid = false;
        boolean isYearValid = false;
        boolean isRatingValid = false;
        boolean isGenreValid = false;
        boolean isStatusValid = true;

        if (movieTitle != null && !movieTitle.isEmpty()) {
            System.out.println("Title is Valid");
            title = movieTitle;
            isTitleValid = true;
        } else {
            System.out.println("Title is invalid");
        }

        if (directorName != null && !directorName.isEmpty()) {
            System.out.println("Director is Valid");
            director = directorName;
            isDirectorValid = true;
        } else {
            System.out.println("Director is invalid");
        }

        if (producerName != null && !producerName.isEmpty()) {
            System.out.println("Producer is Valid");
            producer = producerName;
            isProducerValid = true;
        } else {
            System.out.println("Producer is invalid");
        }

        if (heroName != null && !heroName.isEmpty()) {
            System.out.println("Hero is Valid");
            hero = heroName;
            isHeroValid = true;
        } else {
            System.out.println("Hero is invalid");
        }

        if (heroineName != null && !heroineName.isEmpty()) {
            System.out.println("Heroine is Valid");
            heroine = heroineName;
            isHeroineValid = true;
        } else {
            System.out.println("Heroine is invalid");
        }

        if (budgetAmt > 0) {
            System.out.println("Budget is Valid");
            budget = budgetAmt;
            isBudgetValid = true;
        } else {
            System.out.println("Budget is invalid");
        }

        if (year > 1888) {
            System.out.println("Year is Valid");
            releaseYear = year;
            isYearValid = true;
        } else {
            System.out.println("Year is invalid");
        }

        if (ratingVal >= 0 && ratingVal <= 10) {
            System.out.println("Rating is Valid");
            rating = ratingVal;
            isRatingValid = true;
        } else {
            System.out.println("Rating is invalid");
        }

        if (genreType != null && !genreType.isEmpty()) {
            System.out.println("Genre is Valid");
            genre = genreType;
            isGenreValid = true;
        } else {
            System.out.println("Genre is invalid");
        }

        isBlockbuster = blockbusterStatus;

        if (isTitleValid && isDirectorValid && isProducerValid && isHeroValid && isHeroineValid && isBudgetValid && isYearValid && isRatingValid && isGenreValid) {
            isMovieCreated = true;
        } else {
            System.out.println("The movie entry is not valid");
        }

        return isMovieCreated;
    }

    public static void getMovieDetails() {
        System.out.println("Movie details are:");
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Producer: " + producer);
        System.out.println("Hero: " + hero);
        System.out.println("Heroine: " + heroine);
        System.out.println("Budget: " + budget + " Crores");
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
        System.out.println("Genre: " + genre);
        System.out.println("Blockbuster: " + isBlockbuster);
    }
}
