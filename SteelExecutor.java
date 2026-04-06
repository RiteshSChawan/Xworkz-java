import java.util.Scanner;
class SteelExecutor {
    public static void main(String[] args) {
        Steel steel = new Steel();
        Scanner sc = new Scanner(System.in);

        for (int index = 0; index < steel.names.length; index++) {
            System.out.println("Enter Steel name : ");
            String steelName = sc.nextLine();
            steel.addSteelName(steelName);
        }
        steel.getSteelDetails();
        sc.close();

        String names[] = {"StainlessSteel", "CarbonSteel", "AlloySteel", "ToolSteel", "GalvanizedSteel"};
        System.out.println("Is names added through array " + steel.addSteelNames(names));
        steel.getSteelDetails();

        boolean isFound = steel.searchSteel("CarbonSteel");
        System.out.println("is found " + isFound);
        boolean isUpdated = steel.updateSteel("AlloySteel", "HighStrengthAlloySteel");
        System.out.println("is updated " + isUpdated);
        steel.getSteelDetails();
        boolean isDeleted = steel.deleteSteel("ToolSteel");
        System.out.println("is deleted " + isDeleted);
        steel.getSteelDetails();
    }
}