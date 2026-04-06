import java.util.Scanner;
class BedExecutor {

    public static void main(String[] beds) {

        Bed bed = new Bed();
		Scanner sc= new Scanner(System.in);
		
		for(int index=0 ; index < bed.names.length; index++){
			System.out.println("Enter Bed name : ");
			String bedName=sc.nextLine();
			bed.addBedName(bedName);
			
		}
        bed.getBedDetails();
		sc.close();
		
		String names[]= {"ugu","storage","sofabed","bunkbed","single bed"};
        System.out.println("Is names aded through array "+bed.addBedNames(names));
		bed.getBedDetails();
		
        boolean isFound = bed.searchBed("SofaBed");
        System.out.println("is found " + isFound);

        boolean isUpdated = bed.updateBed("BunkBed", "ModernBunkBed");
        System.out.println("is update " + isUpdated);
        bed.getBedDetails();

        boolean isDeleted = bed.deleteBed("FoldingBed");
        System.out.println("is delete " + isDeleted);
        bed.getBedDetails();
    }
}