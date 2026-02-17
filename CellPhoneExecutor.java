class CellPhoneExecutor{

public static void main(String[] args){ // main -> caller method
	String contactName = "Baba";
	long phoneNo = CellPhone.getContactNumber(contactName);
	System.out.println("The contact number of "+ contactName+ " is : "+phoneNo);
  }
}