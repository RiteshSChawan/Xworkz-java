import java.util.Scanner;
class GoaExecutor {
    public static void main(String[] args) {
        Goa goa = new Goa();
        /* goa.addBeach("Baga Beach");
        goa.addBeach("Calangute Beach");
        goa.addBeach("Anjuna Beach");
        goa.addBeach("Palolem Beach");
        goa.addBeach("Vagator Beach");
        goa.addBeach("Arambol Beach");
        goa.addBeach("Morjim Beach");
        goa.addBeach("Candolim Beach");
        goa.addBeach("Colva Beach");
        goa.addBeach("Benaulim Beach");
        goa.addBeach("Agonda Beach");
        goa.addBeach("Ashwem Beach");
        goa.addBeach("Mandrem Beach");
        goa.addBeach("Sinquerim Beach");
        goa.addBeach("Dona Paula Beach");
        goa.addBeach("Miramar Beach");
        goa.addBeach("Bogmalo Beach");
        goa.addBeach("Chapora Beach");
        goa.addBeach("Querim Beach");
        goa.getBeachDetails(); */
		
		Scanner sc = new Scanner(System.in);
         for (int index = 0; index < goa.beachNames.length; index++) {
            System.out.println("Enter beach name : ");
            goa.addBeachName(sc.nextLine());
        }
        goa.getBeachDetails();
		sc.close();
		
        int index = 3;
        System.out.println("Beach at index " + index + " is: " + goa.getBeachByIndex(index));
        System.out.println("Index of Baga Beach: " + goa.getIndexByBeach("Baga Beach"));
        System.out.println("Is updated: " + goa.updateBeach("Baga Beach", "Baga Beach North Goa"));
        goa.getBeachDetails();
        System.out.println("Is deleted: " + goa.deleteBeach("Anjuna Beach"));
        goa.getBeachDetails();
    }
}
