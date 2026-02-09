class IRCTCRegistration {

    public static void main(String[] args) {
        createAccount("ritesh11", "IRCTC@123","ritesh@gmail.com", 9988776655L, "Pet Name", "Indian", true);
    }

    static void createAccount(String userName, String password, String email, long mobileNumber, String securityQuestion, String nationality, boolean smsAlert) {

        System.out.println("The IRCTC user name is : " + userName);
        System.out.println("The account password is : " + password);
        System.out.println("The registered email is : " + email);
        System.out.println("The mobile number is : " + mobileNumber);
        System.out.println("The selected security question is : " + securityQuestion);
        System.out.println("The nationality is : " + nationality);
        System.out.println("Is SMS alert enabled? " + smsAlert);
    }
}
