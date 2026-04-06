import java.util.Scanner;
 class ArchitectExecutor {
    public static void main(String[] args) {
        Architect architect = new Architect();
        /* architect.addInteriorDesign("Modern Minimalist");
        architect.addInteriorDesign("Scandinavian");
        architect.addInteriorDesign("Industrial");
        architect.addInteriorDesign("Bohemian");
        architect.addInteriorDesign("Contemporary");
        architect.addInteriorDesign("Traditional");
        architect.addInteriorDesign("Mediterranean");
        architect.addInteriorDesign("Art Deco");
        architect.addInteriorDesign("Rustic");
        architect.addInteriorDesign("Coastal");
        architect.addInteriorDesign("Mid Century Modern");
        architect.getInteriorDesignDetails(); */
		
		Scanner sc = new Scanner(System.in);
       for (int index = 0; index < architect.interiorDesignNames.length; index++) {
            System.out.println("Enter interior design name : ");
            architect.addInteriorDesignName(sc.nextLine());
        }
        architect.getInteriorDesignDetails();
		sc.close();
		
        int index = 2;
        System.out.println("Interior design at index " + index + " is: " + architect.getInteriorDesignByIndex(index));
        System.out.println("Index of Scandinavian Style: " + architect.getIndexByInteriorDesign("Scandinavian"));
		
        System.out.println("Is updated: " + architect.updateInteriorDesign("Scandinavian", "Modern Scandinavian"));
        architect.getInteriorDesignDetails();
        System.out.println("Is deleted: " + architect.deleteInteriorDesign("Bohemian"));
        architect.getInteriorDesignDetails();
    }
}
