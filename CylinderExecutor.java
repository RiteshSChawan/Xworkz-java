import java.util.Scanner;
class CylinderExecutor {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        Scanner sc = new Scanner(System.in);

        for (int index = 0; index < cylinder.names.length; index++) {
            System.out.println("Enter Cylinder name : ");
            String cylinderName = sc.nextLine();
            cylinder.addCylinderName(cylinderName);
        }
        cylinder.getCylinderDetails();
        sc.close();

        String names[] = {"GasCylinder", "OxygenCylinder", "HydrogenCylinder", "LPGCylinder", "AirCylinder"};
        System.out.println("Is names added through array " + cylinder.addCylinderNames(names));
        cylinder.getCylinderDetails();

        boolean isFound = cylinder.searchCylinder("OxygenCylinder");
        System.out.println("is found " + isFound);
		
        boolean isUpdated = cylinder.updateCylinder("LPGCylinder", "ModernLPGCylinder");
        System.out.println("is updated " + isUpdated);
        cylinder.getCylinderDetails();
		
        boolean isDeleted = cylinder.deleteCylinder("AirCylinder");
        System.out.println("is deleted " + isDeleted);
        cylinder.getCylinderDetails();
    }
}
