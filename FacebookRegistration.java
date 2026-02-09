class FacebookRegistration {

    public static void main(String[] args) {
        createAccount("Ritesh", "ritesh@gmail.com", "Fb@12345","Male", "11-11-2004","Bengaluru", true);
    }

    static void createAccount(String name, String email, String password,String gender, String dateOfBirth, String location, boolean accountActive) {

        System.out.println("The Facebook user name is : " + name);
        System.out.println("The email used is : " + email);
        System.out.println("The password is : " + password);
        System.out.println("The gender selected is : " + gender);
        System.out.println("The date of birth is : " + dateOfBirth);
        System.out.println("The location is : " + location);
        System.out.println("Is the account active? " + accountActive);
    }
}
