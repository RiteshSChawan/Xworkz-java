class UserRegistration{
	
	// datatypes -  1. primitive (8) : byte, short, int , iong, float, double , boolean, char
	//2. non-primitive / object refernces - strings, array, class names , interface names, enum ==> declared in uppercase
	//variable types - local,static,instances,parameter
	
	// static variables are declared outside method and use ''static" 
	 static int dcdrLocation = 5;  
	static String email = "riteshs11@gmail.com";
	static boolean emailLoginSame = true;
	static String givenName = "Ritesh";
	static String password = "Ritesh@200411";
	static String registrationAuthMethod = "password";
	static String userId = "riteshs11@gmail"; 
	
	static int gender = 'M'; // char as ASCII value, if char letter is given


	public static void main(String[] passportSeva){
	// local variable are declared inside method  and initialized before using 
	// System is a class,  out is a variable of system class defined using print stream,  println is a method and executed in stack 
	//local and parameter variable are stored in stack , static and instance in metaspace
	
	
	 /*String givenName = "Ritesh";
	 String password = "Ritesh@200411";
	 String registrationAuthMethod = "password";
	 String userId = "riteshs11@gmail";*/
	 
	 // Sop statements are written only inside methods,blocks ,constructors but not inside class and outside methods.
	
	 System.out.println("The Post office Location value is : " + dcdrLocation);
	System.out.println("The user email is : " + email);
	System.out.println("Is user emailId same? " + emailLoginSame);
	System.out.println("The user name is : "  + givenName);
	System.out.println("The password is : " + password);
	System.out.println("The authorization method is : " + registrationAuthMethod);
	System.out.println(" The user id is : " + userId);  
	
	System.out.println(gender);

	
	
	}
}