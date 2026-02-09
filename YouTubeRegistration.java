class YouTubeRegistration {

    public static void main(String[] args) {
        createChannel("Ritesh Tech", "ritesh@gmail.com", false, 0, "Education", "India", true);
    }

    static void createChannel(String channelName, String email, boolean monetizationEnabled, int subscribers, String category, String country, boolean commentsEnabled) {

        System.out.println("The YouTube channel name is : " + channelName);
        System.out.println("The registered email is : " + email);
        System.out.println("Is monetization enabled? " + monetizationEnabled);
        System.out.println("The number of subscribers is : " + subscribers);
        System.out.println("The channel category is : " + category);
        System.out.println("The country is : " + country);
        System.out.println("Are comments enabled? " + commentsEnabled);
    }
}
