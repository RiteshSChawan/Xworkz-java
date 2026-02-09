class SwiggyRegistration {

    public static void main(String[] args) {
		
		createAccount("Ritesh",8877665544L, "ritesh@gmail.com","Bengaluru", false, "Home",   "UPI" );
    }
	
	static void createAccount(String userName,long mobileNumber, String email , String city,boolean premiumUser, String deliveryPreference, String paymentMethod  ){
		System.out.println("The Swiggy user name is : " + userName);
        System.out.println("The registered mobile number is : " + mobileNumber);
        System.out.println("The email ID is : " + email);
        System.out.println("The city selected is : " + city);
        System.out.println("Is the user a premium member? " + premiumUser);
        System.out.println("The delivery preference is : " + deliveryPreference);
        System.out.println("The payment method is : " + paymentMethod);
	}
}
