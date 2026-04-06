import java.util.Scanner;
class GymExecutor {
    public static void main(String[] args) {
        Gym gym = new Gym();
        /* gym.addEquipment("Treadmill");
        gym.addEquipment("Dumbbells");
        gym.addEquipment("Barbell");
        gym.addEquipment("Bench Press");
        gym.addEquipment("Pull Up Bar");
        gym.addEquipment("Rowing Machine");
        gym.addEquipment("Elliptical");
        gym.addEquipment("Leg Press");
        gym.addEquipment("Cable Machine");
        gym.addEquipment("Kettlebell");
        gym.addEquipment("Smith Machine");
        gym.addEquipment("Battle Ropes");
        gym.addEquipment("Resistance Bands");
        gym.addEquipment("Foam Roller");
        gym.addEquipment("Ab Roller");
        gym.addEquipment("Spin Bike");
        gym.getEquipmentDetails(); */

		Scanner sc = new Scanner(System.in);
        for (int index = 0; index < gym.equipments.length; index++) {
            System.out.println("Enter equipment name : ");
            gym.addEquipment(sc.nextLine());
        }
        gym.getEquipmentDetails();
		sc.close();
		
        int index = 1;
        System.out.println("Equipment at index " + index + " is: " + gym.getEquipmentByIndex(index));
        System.out.println("Index of Treadmill: " + gym.getIndexByEquipment("Treadmill"));
        System.out.println("Is updated: " + gym.updateEquipment("Treadmill", "Treadmill Pro"));
        gym.getEquipmentDetails();
        System.out.println("Is deleted: " + gym.deleteEquipment("Kettlebell"));
        gym.getEquipmentDetails();
    }
}
