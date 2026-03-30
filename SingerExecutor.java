class SingerExecutor {

    public static void main(String[] h) {

        Singer singer = new Singer();

        boolean isAdded = singer.addName("Arijit");
        System.out.println("Name is added " + isAdded);

        singer.addName("Sonu");
        singer.addName("Shreya");
        singer.addName("Lata");
        singer.addName("Kishore");
        singer.addName("SPB");
        singer.addName("Sunidhi");
        singer.addName("Armaan");
        singer.addName("Neha");
        singer.addName("KK");

        singer.fetchNames();

        boolean isFound = singer.search("Lata");
        System.out.println("is found " + isFound);

        boolean isUpdate = singer.update("Neha", "NehaKakkar");
        System.out.println("is update " + isUpdate);

        singer.fetchNames();

        boolean isDelete = singer.delete("SPB");
        System.out.println("is delete " + isDelete);

        singer.fetchNames();
    }
}