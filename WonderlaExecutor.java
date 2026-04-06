import java.util.Scanner;
class WonderlaExecutor {
    public static void main(String[] args) {
        Wonderla wonderla = new Wonderla();
        /* wonderla.addWaterGame("Wave Pool");
        wonderla.addWaterGame("Lazy River");
        wonderla.addWaterGame("Water Slide");
        wonderla.addWaterGame("Rain Disco");
        wonderla.addWaterGame("Splash Zone");
        wonderla.addWaterGame("Aqua Dance");
        wonderla.addWaterGame("Speed Slides");
        wonderla.addWaterGame("Tube Slides");
        wonderla.addWaterGame("Body Slides");
        wonderla.addWaterGame("Boomerang");
        wonderla.addWaterGame("Kids Pool");
        wonderla.addWaterGame("Tornado");
        wonderla.addWaterGame("Kamikaze");
        wonderla.addWaterGame("Space Bowl");
        wonderla.addWaterGame("Aqualoop");
        wonderla.addWaterGame("Flowrider");
        wonderla.addWaterGame("Aqua Trail");
        wonderla.addWaterGame("Cliff Jump");
        wonderla.addWaterGame("Rapid River");
        wonderla.addWaterGame("Super Flume");
        wonderla.getWaterGameDetails(); */

		Scanner sc = new Scanner(System.in);
        for (int index = 0; index < wonderla.waterGames.length; index++) {
            System.out.println("Enter water game name : ");
            wonderla.addWaterGame(sc.nextLine());
        }
        wonderla.getWaterGameDetails();		
		sc.close();
		
        int index = 4;
        System.out.println("Water game at index " + index + " is: " + wonderla.getWaterGameByIndex(index));
        System.out.println("Index of Wave Pool: " + wonderla.getIndexByWaterGame("Wave Pool"));
        System.out.println("Is updated: " + wonderla.updateWaterGame("Wave Pool", "Mega Wave Pool"));
        wonderla.getWaterGameDetails();
        System.out.println("Is deleted: " + wonderla.deleteWaterGame("Lazy River"));
        wonderla.getWaterGameDetails();
 
    }
}
