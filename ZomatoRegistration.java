class ZomatoRegistration {

    public static void main(String[] args) {
        createAccount("Ritesh", "ritesh@gmail.com", 7766554433L,"Bengaluru", false, "Indian", "Card");
    }

    static void createAccount(String userName, String email, long mobileNumber, String city, boolean goldMember, String cuisinePreference, String paymentMethod) {

        System.out.println("The Zomato user name is : " + userName);
        System.out.println("The registered email ID is : " + email);
        System.out.println("The mobile number is : " + mobileNumber);
        System.out.println("The city selected is : " + city);
        System.out.println("Is the user a gold member? " + goldMember);
        System.out.println("The preferred cuisine is : " + cuisinePreference);
        System.out.println("The payment method selected is : " + paymentMethod);
    }
}
