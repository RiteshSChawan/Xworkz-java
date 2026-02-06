class Hotel {

	public static void main(String[] args){
	 
	String hotelName = "Tulja Bhavani";
	String ownerName = "Ritesh";
	String location = "KTJ Nagar, Davangere";
	String branches[] = {"KTJ Nagar","MCC A block", "DCM layout", "SS layout"};
	String managers[] = {"Raj", "Manoj", "Chirag", "Tejas"};
	String menus[] = {"Starters", "Curries", "RiceItems" , "Beverages", "Mocktails"};
	
	System.out.println("The Hotel Info is : ");
	System.out.println("The name of the Hotel is : " + hotelName);
	System.out.println("The owner of the Hotel is : " + ownerName);
	System.out.println("The location of the Hotel is : " + location);
	System.out.println("\nThe number of branches are : " + branches.length);
	System.out.println("The branches are :  ");
	for(String branch:branches){
	System.out.println(branch);
	}
	
	System.out.println("\nThe number of managers are : " + managers.length);
	System.out.println("The Managers are : ");
	for(String manager:managers){
	System.out.println(manager);
	}
	
	}
}


