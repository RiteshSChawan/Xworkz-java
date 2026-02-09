class GmailRegistration {

    public static void main(String[] args) {
        createAccount("ritesh@gmail.com", "Ritesh@123","Ritesh", "S","ritesh@yahoo.com",9876543210L, "India");
    }

    static void createAccount(String emailId, String password, String firstName, String lastName, String recoveryEmail, long mobileNumber, String country) {

        System.out.println("The Gmail email ID is : " + emailId);
        System.out.println("The Gmail password is : " + password);
        System.out.println("The first name is : " + firstName);
        System.out.println("The last name is : " + lastName);
        System.out.println("The recovery email is : " + recoveryEmail);
        System.out.println("The registered mobile number is : " + mobileNumber);
        System.out.println("The country selected is : " + country);
    }
}
