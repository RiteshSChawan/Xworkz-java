class InstagramRegistration {

    public static void main(String[] args) {
        createAccount("ritesh_11", "ritesh@gmail.com", "Insta@123", 9988776655L, false, "Student", "Personal");
    }

    static void createAccount(String userName, String email, String password, long phoneNumber, boolean privateAccount, String bio, String profileType) {

        System.out.println("The Instagram username is : " + userName);
        System.out.println("The registered email is : " + email);
        System.out.println("The password is : " + password);
        System.out.println("The phone number is : " + phoneNumber);
        System.out.println("Is the account private? " + privateAccount);
        System.out.println("The bio given is : " + bio);
        System.out.println("The profile type is : " + profileType);
    }
}
