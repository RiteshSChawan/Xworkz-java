import java.util.Scanner;
class PastaExecutor {
    public static void main(String[] args) {
        Pasta pasta = new Pasta();
        Scanner sc = new Scanner(System.in);

        for (int index = 0; index < pasta.names.length; index++) {
            System.out.println("Enter Pasta name : ");
            String pastaName = sc.nextLine();
            pasta.addPastaName(pastaName);
        }
        pasta.getPastaDetails();
        sc.close();

        String names[] = {"Spaghetti", "Penne", "Fusilli", "Farfalle", "Rigatoni"};
        System.out.println("Is names added through array " + pasta.addPastaNames(names));
        pasta.getPastaDetails();

        boolean isFound = pasta.searchPasta("Penne");
        System.out.println("is found " + isFound);
        boolean isUpdated = pasta.updatePasta("Fusilli", "SpinachFusilli");
        System.out.println("is updated " + isUpdated);
        pasta.getPastaDetails();
        boolean isDeleted = pasta.deletePasta("Farfalle");
        System.out.println("is deleted " + isDeleted);
        pasta.getPastaDetails();
    }
}