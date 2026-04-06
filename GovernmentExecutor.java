import java.util.Scanner;
class GovernmentExecutor {
    public static void main(String[] args) {
        Government government = new Government();
        /*  government.addExam("UPSC Civil Services");
        government.addExam("SSC CGL");
        government.addExam("IBPS PO");
        government.addExam("RRB NTPC");
        government.addExam("NEET");
        government.addExam("JEE Mains");
        government.addExam("GATE");
        government.addExam("CAT");
        government.addExam("NDA");
        government.getExamDetails(); */
		
		Scanner sc = new Scanner(System.in);
        for (int index = 0; index < government.competitiveExamNames.length; index++) {
            System.out.println("Enter competitive exam name : ");
            government.addCompetitiveExamName(sc.nextLine());
        }
        government.getCompetitiveExamDetails();
		sc.close();
		
        int index = 0;
        System.out.println("Competitive exam at index " + index + " is: " + government.getCompetitiveExamByIndex(index));
        System.out.println("Index of UPSC Civil Services: " + government.getIndexByCompetitiveExam("UPSC Civil Services"));
        System.out.println("Is updated: " + government.updateCompetitiveExam("UPSC Civil Services", "UPSC IAS Exam"));
        government.getCompetitiveExamDetails();
        System.out.println("Is deleted: " + government.deleteCompetitiveExam("SSC CGL"));
        government.getCompetitiveExamDetails();
 
    }
}
