import java.util.Scanner;
class StateExecutor {
    public static void main(String[] args) {
        State state = new State();
        /* state.addHighway("NH 44 ");
        state.addHighway("NH 48 ");
        state.addHighway("NH 19 ");
        state.addHighway("NH 27 ");
        state.addHighway("NH 16");
        state.addHighway("NH 52");
        state.addHighway("NH 30 ");
        state.addHighway("NH 66");
        state.addHighway("NH 75 ");
        state.getHighwayDetails(); */
		
         Scanner sc = new Scanner(System.in);
		 for (int index = 0; index < state.highwayNames.length; index++) {
            System.out.println("Enter highway name : ");
            state.addHighwayName(sc.nextLine());
        }
        state.getHighwayDetails();
		sc.close();
		
        int index = 1;
        System.out.println("Highway at index " + index + " is: " + state.getHighwayByIndex(index));
        System.out.println("Index of NH 44: " + state.getIndexByHighway("NH 44"));
        System.out.println("Is updated: " + state.updateHighway("NH 44", "NH 44 - Expressway"));
        state.getHighwayDetails();
        System.out.println("Is deleted: " + state.deleteHighway("NH 66"));
        state.getHighwayDetails();
    }
}
