class TreeExecutor {

    public static void main(String[] h) {

        Tree tree = new Tree();

        boolean isAdded = tree.addName("Neem");
        System.out.println("Name is added " + isAdded);

        tree.addName("Mango");
        tree.addName("Coconut");
        tree.addName("Banyan");
        tree.addName("Peepal");
        tree.addName("Teak");
        tree.addName("Rosewood");
        tree.addName("Apple");
        tree.addName("Guava");
        tree.addName("Pine");

        tree.fetchNames();

        boolean isFound = tree.search("Mango");
        System.out.println("is found " + isFound);

        boolean isUpdate = tree.update("Guava", "GreenGuava");
        System.out.println("is update " + isUpdate);

        tree.fetchNames();

        boolean isDelete = tree.delete("Teak");
        System.out.println("is delete " + isDelete);

        tree.fetchNames();
    }
}