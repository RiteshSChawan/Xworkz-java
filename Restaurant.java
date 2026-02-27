class Restaurant {

    public static void dineIn() {
        System.out.println("Customer entered the restaurant.");

        TableManager.seatGuest("Ritesh", "Veg Pizza");
        System.out.println("Customer finished dining.");
    }
}