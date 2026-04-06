import java.util.Scanner;
class MuseumExecutor {
    public static void main(String[] args) {
        Museum museum = new Museum();
        /* museum.addMonument("Taj Mahal");
        museum.addMonument("Red Fort");
        museum.addMonument("Qutub Minar");
        museum.addMonument("Hampi");
        museum.addMonument("Ajanta Caves");
        museum.addMonument("Ellora Caves");
        museum.addMonument("Konark Sun Temple");
        museum.addMonument("Khajuraho Temples");
        museum.addMonument("Charminar");
        museum.addMonument("Mysore Palace");
        museum.addMonument("Hawa Mahal");
        museum.addMonument("India Gate");
        museum.addMonument("Victoria Memorial");
        museum.addMonument("Gateway of India");
        museum.addMonument("Fatehpur Sikri");
        museum.addMonument("Sanchi Stupa");
        museum.getMonumentDetails(); */
		
		Scanner sc = new Scanner(System.in);
        for (int index = 0; index < museum.historicalMonuments.length; index++) {
            System.out.println("Enter historical monument name : ");
            museum.addHistoricalMonument(sc.nextLine());
        }
        museum.getHistoricalMonumentDetails();
		sc.close();
		
        int index = 4;
        System.out.println("Historical monument at index " + index + " is: " + museum.getHistoricalMonumentByIndex(index));
        System.out.println("Index of Taj Mahal: " + museum.getIndexByHistoricalMonument("Taj Mahal"));
        System.out.println("Is updated: " + museum.updateHistoricalMonument("Taj Mahal", "Taj Mahal - Agra"));
        museum.getHistoricalMonumentDetails();
        System.out.println("Is deleted: " + museum.deleteHistoricalMonument("Qutub Minar"));
        museum.getHistoricalMonumentDetails();
    }
}
