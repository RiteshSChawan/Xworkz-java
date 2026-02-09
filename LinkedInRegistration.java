class LinkedInRegistration {

    public static void main(String[] args) {
        createAccount("Ritesh S", "ritesh@gmail.com", "LinkedIn@123", "Student", "Bengaluru", true, "IT");
    }

    static void createAccount(String fullName, String email, String password, String jobTitle, String location, boolean openToWork, String industry) {

        System.out.println("The LinkedIn user name is : " + fullName);
        System.out.println("The email ID is : " + email);
        System.out.println("The password is : " + password);
        System.out.println("The job title is : " + jobTitle);
        System.out.println("The location is : " + location);
        System.out.println("Is the user open to work? " + openToWork);
        System.out.println("The industry selected is : " + industry);
    }
}
