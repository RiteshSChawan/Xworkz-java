import java.util.Scanner;
class TravelAgencyExecutor {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency();
        /* travelAgency.addPlace("Paris");
        travelAgency.addPlace("London");
        travelAgency.addPlace("Dubai");
        travelAgency.addPlace("Singapore");
        travelAgency.addPlace("Bangkok");
        travelAgency.addPlace("New York");
        travelAgency.addPlace("Tokyo");
        travelAgency.addPlace("Sydney");
        travelAgency.addPlace("Rome");
        travelAgency.addPlace("Maldives");
        travelAgency.addPlace("Bali");
        travelAgency.addPlace("Amsterdam");
        travelAgency.addPlace("Barcelona");
        travelAgency.addPlace("Istanbul");
        travelAgency.addPlace("Zurich");
        travelAgency.addPlace("Toronto");
        travelAgency.addPlace("Cape Town");
        travelAgency.getPlaceDetails(); */
		
		Scanner sc = new Scanner(System.in);
       for (int index = 0; index < travelAgency.places.length; index++) {
            System.out.println("Enter place name : ");
            travelAgency.addPlace(sc.nextLine());
        }
        travelAgency.getPlaceDetails();
		sc.close();

        int index = 2;
        System.out.println("Place at index " + index + " is: " + travelAgency.getPlaceByIndex(index));
        System.out.println("Index of Paris: " + travelAgency.getIndexByPlace("Paris"));
        System.out.println("Is updated: " + travelAgency.updatePlace("Paris", "Paris, France"));
        travelAgency.getPlaceDetails();
        System.out.println("Is deleted: " + travelAgency.deletePlace("Dubai"));
        travelAgency.getPlaceDetails();
    }
}
