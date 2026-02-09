class AmazonRegistration {

    public static void main(String[] args) {
        createAccount("Ritesh", "ritesh@gmail.com", "Amazon@123",8899776655L, "Rajajinagar Bengaluru", "India", false);
    }

    static void createAccount(String customerName, String email, String password, long mobileNumber, String address, String country, boolean primeMember) {

        System.out.println("The Amazon customer name is : " + customerName);
        System.out.println("The registered email is : " + email);
        System.out.println("The account password is : " + password);
        System.out.println("The mobile number is : " + mobileNumber);
        System.out.println("The address is : " + address);
        System.out.println("The country selected is : " + country);
        System.out.println("Is the user a prime member? " + primeMember);
    }
}
