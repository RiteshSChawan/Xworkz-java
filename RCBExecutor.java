import java.util.Scanner;
class RCBExecutor {
    public static void main(String[] args) {
        RCB rcb = new RCB();
        /* rcb.addPlayer("Virat Kohli");
        rcb.addPlayer("Faf du Plessis");
        rcb.addPlayer("Glenn Maxwell");
        rcb.addPlayer("Mohammed Siraj");
        rcb.addPlayer("Dinesh Karthik");
        rcb.addPlayer("Harshal Patel");
        rcb.addPlayer("Wanindu Hasaranga");
        rcb.addPlayer("Josh Hazlewood");
        rcb.addPlayer("Rajat Patidar");
        rcb.addPlayer("Anuj Rawat");
        rcb.addPlayer("Shahbaz Ahmed");
        rcb.addPlayer("David Willey");
        rcb.addPlayer("Reece Topley");
        rcb.addPlayer("Suyash Prabhudessai");
        rcb.addPlayer("Karn Sharma");
        rcb.getPlayerDetails(); */
		
		Scanner sc = new Scanner(System.in);
         for (int index = 0; index < rcb.playerNames.length; index++) {
            System.out.println("Enter player name : ");
            rcb.addPlayerName(sc.nextLine());
        }
        rcb.getPlayerDetails();
		sc.close();
		
        int index = 0;
        System.out.println("Player at index " + index + " is: " + rcb.getPlayerByIndex(index));
        System.out.println("Index of Virat Kohli: " + rcb.getIndexByPlayer("Virat Kohli"));
        System.out.println("Is updated: " + rcb.updatePlayer("Patidar", "Rajat Patidar"));
        rcb.getPlayerDetails();
        System.out.println("Is deleted: " + rcb.deletePlayer("Glenn Maxwell"));
        rcb.getPlayerDetails();
    }
}
