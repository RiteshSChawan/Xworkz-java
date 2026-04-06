import java.util.Scanner;
class PetShopExecutor {
    public static void main(String[] args) {
        PetShop petShop = new PetShop();
        /* petShop.addAccessory("Dog Collar");
        petShop.addAccessory("Leash");
        petShop.addAccessory("Pet Bed");
        petShop.addAccessory("Food Bowl");
        petShop.addAccessory("Water Bowl");
        petShop.addAccessory("Pet Cage");
        petShop.addAccessory("Scratching Post");
        petShop.addAccessory("Pet Toys");
        petShop.addAccessory("Grooming Brush");
        petShop.addAccessory("Pet Shampoo");
        petShop.addAccessory("Nail Clipper");
        petShop.addAccessory("Pet Carrier");
        petShop.addAccessory("Litter Box");
        petShop.addAccessory("Pet Harness");
        petShop.addAccessory("Chew Toys");
        petShop.addAccessory("Pet Blanket");
        petShop.addAccessory("Aquarium");
        petShop.addAccessory("Bird Cage");
        petShop.addAccessory("Pet Stroller");
        petShop.addAccessory("ID Tag");
        petShop.getAccessoryDetails(); */
		
		
		Scanner sc = new Scanner(System.in);
         for (int index = 0; index < petShop.petAccessories.length; index++) {
            System.out.println("Enter pet accessory name : ");
            petShop.addPetAccessory(sc.nextLine());
        }
        petShop.getPetAccessoryDetails();
		sc.close();
		
        int index = 5;
        System.out.println("Pet accessory at index " + index + " is: " + petShop.getPetAccessoryByIndex(index));
        System.out.println("Index of Dog Collar: " + petShop.getIndexByPetAccessory("Dog Collar"));
        System.out.println("Is updated: " + petShop.updatePetAccessory("Dog Collar", "Leather Dog Collar"));
        petShop.getPetAccessoryDetails();
        System.out.println("Is deleted: " + petShop.deletePetAccessory("Pet Toys"));
        petShop.getPetAccessoryDetails();
    }
}
