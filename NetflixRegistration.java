class NetflixRegistration {

    public static void main(String[] args) {
        createAccount("ritesh@gmail.com", "Netflix@123","Basic", 1,  false, "UPI", "India");
    }

    static void createAccount(String email, String password, String plan, int screens, boolean hdAvailable, String paymentMode, String country) {

        System.out.println("The Netflix email ID is : " + email);
        System.out.println("The password is : " + password);
        System.out.println("The selected plan is : " + plan);
        System.out.println("The number of screens allowed is : " + screens);
        System.out.println("Is HD available? " + hdAvailable);
        System.out.println("The payment mode is : " + paymentMode);
        System.out.println("The country selected is : " + country);
    }
}
