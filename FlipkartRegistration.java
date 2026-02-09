class FlipkartRegistration {

    public static void main(String[] args) {
        createAccount("Ritesh", "ritesh@gmail.com", 7766554433L, "Flipkart@123", "Bengaluru","Karnataka", true);
    }

    static void createAccount(String userName, String email, long mobileNumber, String password, String city, String state, boolean notificationsEnabled) {

        System.out.println("The Flipkart user name is : " + userName);
        System.out.println("The registered email is : " + email);
        System.out.println("The mobile number is : " + mobileNumber);
        System.out.println("The password is : " + password);
        System.out.println("The city is : " + city);
        System.out.println("The state is : " + state);
        System.out.println("Are notifications enabled? " + notificationsEnabled);
    }
}
