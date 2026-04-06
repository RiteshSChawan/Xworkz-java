import java.util.Scanner;
class PetroleumExecutor {
    public static void main(String[] args) {
        Petroleum petroleum = new Petroleum();
        Scanner sc = new Scanner(System.in);

        for (int index = 0; index < petroleum.names.length; index++) {
            System.out.println("Enter Petroleum name : ");
            String petroleumName = sc.nextLine();
            petroleum.addPetroleumName(petroleumName);
        }
        petroleum.getPetroleumDetails();
        sc.close();

        String names[] = {"CrudeOil", "Diesel", "Petrol", "Kerosene", "NaturalGas"};
        System.out.println("Is names added through array " + petroleum.addPetroleumNames(names));
        petroleum.getPetroleumDetails();

        boolean isFound = petroleum.searchPetroleum("Diesel");
        System.out.println("is found " + isFound);
        boolean isUpdated = petroleum.updatePetroleum("Kerosene", "PurifiedKerosene");
        System.out.println("is updated " + isUpdated);
        petroleum.getPetroleumDetails();
        boolean isDeleted = petroleum.deletePetroleum("CrudeOil");
        System.out.println("is deleted " + isDeleted);
        petroleum.getPetroleumDetails();
    }
}