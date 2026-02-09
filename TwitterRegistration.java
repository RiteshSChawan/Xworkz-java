class TwitterRegistration {

    public static void main(String[] args) {
        createAccount("riteshTweets", "ritesh@gmail.com", "Twitter@123","English", false, "India", 0);
    }

    static void createAccount(String userName, String email, String password,String language, boolean verified, String country, int followers) {

        System.out.println("The Twitter username is : " + userName);
        System.out.println("The registered email is : " + email);
        System.out.println("The password is : " + password);
        System.out.println("The selected language is : " + language);
        System.out.println("Is the account verified? " + verified);
        System.out.println("The country is : " + country);
        System.out.println("The number of followers is : " + followers);
    }
}

