class GoogleMapsRegistration {

    public static void main(String[] args) {
        createAccount("ritesh@gmail.com", true, "English",true, "Standard", "India", true);
    }

    static void createAccount(String email, boolean locationEnabled, String language, boolean trafficUpdates, String mapType, String region, boolean voiceNavigation) {

        System.out.println("The Google Maps email is : " + email);
        System.out.println("Is location enabled? " + locationEnabled);
        System.out.println("The selected language is : " + language);
        System.out.println("Are traffic updates enabled? " + trafficUpdates);
        System.out.println("The map type selected is : " + mapType);
        System.out.println("The region is : " + region);
        System.out.println("Is voice navigation enabled? " + voiceNavigation);
    }
}
