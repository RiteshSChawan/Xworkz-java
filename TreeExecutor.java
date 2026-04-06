import java.util.Scanner;
class TreeExecutor {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner sc = new Scanner(System.in);

        for (int index = 0; index < tree.names.length; index++) {
            System.out.println("Enter Tree name : ");
            String treeName = sc.nextLine();
            tree.addTreeName(treeName);
        }
        tree.getTreeDetails();
        sc.close();

        String names[] = {"OakTree", "PineTree", "MapleTree", "BanyanTree", "PalmTree"};
        System.out.println("Is names added through array " + tree.addTreeNames(names));
        tree.getTreeDetails();

        boolean isFound = tree.searchTree("MapleTree");
        System.out.println("is found " + isFound);
        boolean isUpdated = tree.updateTree("BanyanTree", "GiantBanyanTree");
        System.out.println("is updated " + isUpdated);
        tree.getTreeDetails();
        boolean isDeleted = tree.deleteTree("PalmTree");
        System.out.println("is deleted " + isDeleted);
        tree.getTreeDetails();
    }
}