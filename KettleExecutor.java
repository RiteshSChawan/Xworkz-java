import java.util.Scanner;
class KettleExecutor {
    public static void main(String[] args) {
        Kettle kettle = new Kettle();
        Scanner sc = new Scanner(System.in);

        for (int index = 0; index < kettle.names.length; index++) {
            System.out.println("Enter Kettle name : ");
            String kettleName = sc.nextLine();
            kettle.addKettleName(kettleName);
        }
        kettle.getKettleDetails();
        sc.close();

        String names[] = {"ElectricKettle", "WhistlingKettle", "StoveKettle", "TravelKettle", "GlassKettle"};
        System.out.println("Is names added through array " + kettle.addKettleNames(names));
        kettle.getKettleDetails();

        boolean isFound = kettle.searchKettle("GlassKettle");
        System.out.println("is found " + isFound);
        boolean isUpdated = kettle.updateKettle("TravelKettle", "PortableTravelKettle");
        System.out.println("is updated " + isUpdated);
        kettle.getKettleDetails();
        boolean isDeleted = kettle.deleteKettle("WhistlingKettle");
        System.out.println("is deleted " + isDeleted);
        kettle.getKettleDetails();
    }
}