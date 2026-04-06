import java.util.Scanner;
class UniverseExecutor {
    public static void main(String[] args) {
        Universe universe = new Universe();
        /* universe.addGalaxy("Milky Way");
        universe.addGalaxy("Andromeda");
        universe.addGalaxy("Triangulum");
        universe.addGalaxy("Whirlpool");
        universe.addGalaxy("Sombrero");
        universe.addGalaxy("Pinwheel");
        universe.addGalaxy("Cartwheel");
        universe.addGalaxy("Black Eye");
        universe.addGalaxy("Cigar Galaxy");
        universe.addGalaxy("Sunflower Galaxy");
        universe.addGalaxy("Tadpole Galaxy");
        universe.addGalaxy("Antennae Galaxies");
        universe.addGalaxy("Large Magellanic Cloud");
        universe.addGalaxy("Small Magellanic Cloud");
        universe.addGalaxy("Centaurus A");
        universe.addGalaxy("NGC 1300");
        universe.addGalaxy("Messier 87");
        universe.getGalaxyDetails(); */
		
		Scanner sc = new Scanner(System.in);
         for (int index = 0; index < universe.galaxies.length; index++) {
            System.out.println("Enter galaxy name : ");
            universe.addGalaxy(sc.nextLine());
        }
        universe.getGalaxyDetails();
		sc.close();
		
        int index = 1;
        System.out.println("Galaxy at index " + index + " is: " + universe.getGalaxyByIndex(index));
        System.out.println("Index of Milky Way: " + universe.getIndexByGalaxy("Milky Way"));
        System.out.println("Is updated: " + universe.updateGalaxy("Milky Way", "Milky Way Galaxy"));
        universe.getGalaxyDetails();
        System.out.println("Is deleted: " + universe.deleteGalaxy("Andromeda"));
        universe.getGalaxyDetails();
    }
}
