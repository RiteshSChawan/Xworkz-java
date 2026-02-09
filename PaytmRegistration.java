class PaytmRegistration {

    public static void main(String[] args) {
		createAccount("Ritesh",9988776655L, "Completed", "Active",  "1234", "Yes","India"  );

    }
	
	static void createAccount( String userName, long mobileNumber , String kycStatus ,String walletStatus ,
     String paymentPin , String bankLinked , String country ){
        System.out.println("The Paytm user name is : " + userName);
        System.out.println("The registered mobile number is : " + mobileNumber);
        System.out.println("The KYC status is : " + kycStatus);
        System.out.println("The wallet status is : " + walletStatus);
        System.out.println("The payment pin is set.");
        System.out.println("Is bank account linked? " + bankLinked);
        System.out.println("The country selected is : " + country);
	}
}
