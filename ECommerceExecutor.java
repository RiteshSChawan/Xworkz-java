import java.util.Scanner;
class ECommerceExecutor {
    public static void main(String[] args) {
        ECommerce eCommerce = new ECommerce();
		/*
        eCommerce.addProduct("Laptop");
        eCommerce.addProduct("Mobile Phone");
        eCommerce.addProduct("Headphones");
        eCommerce.addProduct("Smartwatch");
        eCommerce.addProduct("Tablet");
        eCommerce.addProduct("Keyboard");
        eCommerce.addProduct("Mouse");
        eCommerce.addProduct("Monitor");
        eCommerce.addProduct("Printer");
        eCommerce.addProduct("Camera");
        eCommerce.addProduct("Speaker");
        eCommerce.addProduct("TV");
        eCommerce.addProduct("Refrigerator");
        eCommerce.addProduct("Washing Machine");
        eCommerce.addProduct("Air Conditioner");
        eCommerce.addProduct("Microwave");
        eCommerce.addProduct("Trimmer");
        eCommerce.addProduct("Iron Box");
        eCommerce.addProduct("Vacuum Cleaner");
        eCommerce.addProduct("Water Purifier");
        eCommerce.addProduct("Electric Kettle");
        eCommerce.addProduct("Mixer Grinder");
        eCommerce.addProduct("Toaster");
        eCommerce.addProduct("Fan");
        eCommerce.addProduct("Air Purifier");
        eCommerce.addProduct("Juicer");
        eCommerce.getProductDetails(); */
		
         Scanner sc = new Scanner(System.in);
        for (int index = 0; index < eCommerce.productNames.length; index++) {
            System.out.println("Enter product name : ");
            eCommerce.addProductName(sc.nextLine());
        }
        eCommerce.getProductDetails();
		sc.close();
		
        int index = 6;
        System.out.println("Product at index " + index + " is: " + eCommerce.getProductByIndex(index));
        System.out.println("Index of Laptop: " + eCommerce.getIndexByProduct("Laptop"));
        System.out.println("Is updated: " + eCommerce.updateProduct("Trimmer", "Trimmers"));
        eCommerce.getProductDetails();
        System.out.println("Is deleted: " + eCommerce.deleteProduct("Juicer"));
        eCommerce.getProductDetails();
    }
}
