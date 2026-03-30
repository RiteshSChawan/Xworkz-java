class PastaExecutor {

    public static void main(String[] h) {

        Pasta pasta = new Pasta();

        boolean isAdded = pasta.addName("Spaghetti");
        System.out.println("Name is added " + isAdded);

        pasta.addName("Macaroni");
        pasta.addName("Penne");
        pasta.addName("Fusilli");
        pasta.addName("Rigatoni");
        pasta.addName("Lasagna");
        pasta.addName("Ravioli");
        pasta.addName("Tortellini");
        pasta.addName("Farfalle");
        pasta.addName("Orzo");

        pasta.fetchNames();

        boolean isFound = pasta.search("Penne");
        System.out.println("is found " + isFound);

        boolean isUpdate = pasta.update("Orzo", "AngelHair");
        System.out.println("is update " + isUpdate);

        pasta.fetchNames();

        boolean isDelete = pasta.delete("Ravioli");
        System.out.println("is delete " + isDelete);

        pasta.fetchNames();
    }
}