import java.util.Scanner;
class SingerExecutor {
    public static void main(String[] args) {
        Singer singer = new Singer();
        Scanner sc = new Scanner(System.in);

        for (int index = 0; index < singer.names.length; index++) {
            System.out.println("Enter Singer name : ");
            String singerName = sc.nextLine();
            singer.addSingerName(singerName);
        }
        singer.getSingerDetails();
        sc.close();

        String names[] = {"JazzSinger", "OperaSinger", "PopSinger", "RockSinger", "FolkSinger"};
        System.out.println("Is names added through array " + singer.addSingerNames(names));
        singer.getSingerDetails();

        boolean isFound = singer.searchSinger("PopSinger");
        System.out.println("is found " + isFound);
        boolean isUpdated = singer.updateSinger("RockSinger", "ClassicRockSinger");
        System.out.println("is updated " + isUpdated);
        singer.getSingerDetails();
        boolean isDeleted = singer.deleteSinger("FolkSinger");
        System.out.println("is deleted " + isDeleted);
        singer.getSingerDetails();
    }
}