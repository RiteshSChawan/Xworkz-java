import java.util.Scanner;
class PhonepeExecutor {
    public static void main(String[] args) {
        Phonepe phonepe = new Phonepe();
        /* phonepe.addInsurance("Health Insurance");
        phonepe.addInsurance("Life Insurance");
        phonepe.addInsurance("Car Insurance");
        phonepe.addInsurance("Bike Insurance");
        phonepe.addInsurance("Home Insurance");
        phonepe.addInsurance("Travel Insurance");
        phonepe.addInsurance("Term Insurance");
        phonepe.addInsurance("Fire Insurance");
        phonepe.addInsurance("Marine Insurance");
        phonepe.addInsurance("Crop Insurance");
        phonepe.addInsurance("Personal Accident Insurance");
        phonepe.addInsurance("Critical Illness Insurance");
        phonepe.addInsurance("Child Insurance");
        phonepe.addInsurance("Pension Insurance");
        phonepe.addInsurance("Disability Insurance");
        phonepe.addInsurance("Liability Insurance");
        phonepe.addInsurance("Flood Insurance");
        phonepe.addInsurance("Earthquake Insurance");
        phonepe.addInsurance("Pet Insurance");
        phonepe.addInsurance("Business Insurance");
        phonepe.addInsurance("Group Health Insurance");
        phonepe.addInsurance("Cancer Insurance");
        phonepe.addInsurance("Dental Insurance");
        phonepe.addInsurance("Vision Insurance");
        phonepe.addInsurance("Student Insurance");
        phonepe.addInsurance("Senior Citizen Insurance");
        phonepe.addInsurance("Maternity Insurance");
        phonepe.getInsuranceDetails(); */
		
        Scanner sc = new Scanner(System.in);
		for (int index = 0; index < phonepe.insuranceNames.length; index++) {
            System.out.println("Enter insurance name : ");
            phonepe.addInsuranceName(sc.nextLine());
        }
        phonepe.getInsuranceDetails();		
		sc.close();

        int index = 3;
        System.out.println("Insurance at index " + index + " is: " + phonepe.getInsuranceByIndex(index));
        System.out.println("Index of Term Insurance: " + phonepe.getIndexByInsurance("Term Insurance"));
        System.out.println("Is updated: " + phonepe.updateInsurance("Term Insurance", "Premium Term Life Insurance"));
        phonepe.getInsuranceDetails();
        System.out.println("Is deleted: " + phonepe.deleteInsurance("Bike Insurance"));
        phonepe.getInsuranceDetails();
    }
}
