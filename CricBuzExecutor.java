import java.util.Scanner;
class CricBuzExecutor {
    public static void main(String[] args) {
        CricBuz cricBuz = new CricBuz();
		/*
        cricBuz.addTeam("India");
        cricBuz.addTeam("Australia");
        cricBuz.addTeam("England");
        cricBuz.addTeam("South Africa");
        cricBuz.addTeam("New Zealand");
        cricBuz.addTeam("Pakistan");
        cricBuz.addTeam("Sri Lanka");
        cricBuz.addTeam("West Indies");
        cricBuz.getTeamDetails(); */
		
		Scanner sc = new Scanner(System.in);
        for (int index = 0; index < cricBuz.teamNames.length; index++) {
            System.out.println("Enter team name : ");
            cricBuz.addTeamName(sc.nextLine());
        }
        cricBuz.getTeamDetails();
		sc.close();
		
        int index = 2;
        System.out.println("Team at index " + index + " is: " + cricBuz.getTeamByIndex(index));
        System.out.println("Index of India: " + cricBuz.getIndexByTeam("India"));
        System.out.println("Is updated: " + cricBuz.updateTeam("India", "Team India"));
        cricBuz.getTeamDetails();
        System.out.println("Is deleted: " + cricBuz.deleteTeam("Pakistan"));
        cricBuz.getTeamDetails();
    }
}
