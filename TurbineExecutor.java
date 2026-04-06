import java.util.Scanner;
class TurbineExecutor {
    public static void main(String[] args) {
        Turbine turbine = new Turbine();
        Scanner sc = new Scanner(System.in);

        for (int index = 0; index < turbine.names.length; index++) {
            System.out.println("Enter Turbine name : ");
            String turbineName = sc.nextLine();
            turbine.addTurbineName(turbineName);
        }
        turbine.getTurbineDetails();
        sc.close();

        String names[] = {"WindTurbine", "SteamTurbine", "GasTurbine", "HydroTurbine", "MicroTurbine"};
        System.out.println("Is names added through array " + turbine.addTurbineNames(names));
        turbine.getTurbineDetails();

        boolean isFound = turbine.searchTurbine("GasTurbine");
        System.out.println("is found " + isFound);
        boolean isUpdated = turbine.updateTurbine("WindTurbine", "OffshoreWindTurbine");
        System.out.println("is updated " + isUpdated);
        turbine.getTurbineDetails();
        boolean isDeleted = turbine.deleteTurbine("MicroTurbine");
        System.out.println("is deleted " + isDeleted);
        turbine.getTurbineDetails();
    }
}