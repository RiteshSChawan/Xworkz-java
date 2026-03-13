class PVR {

    int cinemaId;
    String brand;
    String city;
    String state;
    int screens;
    int capacity;
    double ticketPrice;
    boolean isIMAX;
    boolean is4DX;
    String foodMenu;
    String parkingFacility;
    boolean isAvailable;
    String openingTime;
    String closingTime;
    int rating;
    String owner;
    double revenue;
    String country;
    boolean isOnlineBooking;
    String[] languages;

    public PVR(int cinemaId, String brand, String city, String state, int screens, int capacity, double ticketPrice, boolean isIMAX, boolean is4DX, String foodMenu, String parkingFacility, boolean isAvailable, String openingTime, String closingTime, int rating, String owner, double revenue, String country, boolean isOnlineBooking, String[] languages) {
        this.cinemaId = cinemaId;
        this.brand = brand;
        this.city = city;
        this.state = state;
        this.screens = screens;
        this.capacity = capacity;
        this.ticketPrice = ticketPrice;
        this.isIMAX = isIMAX;
        this.is4DX = is4DX;
        this.foodMenu = foodMenu;
        this.parkingFacility = parkingFacility;
        this.isAvailable = isAvailable;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.rating = rating;
        this.owner = owner;
        this.revenue = revenue;
        this.country = country;
        this.isOnlineBooking = isOnlineBooking;
        this.languages = languages;
    }

    public void getDetails() {
        System.out.println("CinemaId : " + this.cinemaId);
        System.out.println("Brand : " + this.brand);
        System.out.println("City : " + this.city);
        System.out.println("State : " + this.state);
        System.out.println("Screens : " + this.screens);
        System.out.println("Capacity : " + this.capacity);
        System.out.println("TicketPrice : " + this.ticketPrice);
        System.out.println("IsIMAX : " + this.isIMAX);
        System.out.println("Is4DX : " + this.is4DX);
        System.out.println("FoodMenu : " + this.foodMenu);
        System.out.println("ParkingFacility : " + this.parkingFacility);
        System.out.println("IsAvailable : " + this.isAvailable);
        System.out.println("OpeningTime : " + this.openingTime);
        System.out.println("ClosingTime : " + this.closingTime);
        System.out.println("Rating : " + this.rating);
        System.out.println("Owner : " + this.owner);
        System.out.println("Revenue : " + this.revenue);
        System.out.println("Country : " + this.country);
        System.out.println("IsOnlineBooking : " + this.isOnlineBooking);
        System.out.println("Languages :");
        for (String item : this.languages)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}