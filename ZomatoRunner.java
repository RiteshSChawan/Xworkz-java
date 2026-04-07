class ZomatoRunner {

    public static void main(String args[]) {
        Zomato zomato = new Zomato();

        ZomatoAccount customer1 = new ZomatoAccount();
        customer1.setCustomerId(1);
        customer1.setFullName("Anup Sharma");
        customer1.setEmail("anupsharma@gmail.com");
        customer1.setPassword("anup@11");
        customer1.setMobileNumber("9876543210");
        customer1.setGender("Male");
        customer1.setCity("Bengaluru");
        customer1.setIsAccountActive(true);
        boolean ref1 = zomato.createZomatoAccount(customer1);
        System.out.println("Account Created : " + ref1);

        ZomatoAccount customer2 = new ZomatoAccount();
        customer2.setCustomerId(2);
        customer2.setFullName("Deepa");
        customer2.setEmail("deepa@gmail.com");
        customer2.setPassword("deepa@12");
        customer2.setMobileNumber("9847056123");
        customer2.setGender("Female");
        customer2.setCity("Kochi");
        customer2.setIsAccountActive(true);
        boolean ref2 = zomato.createZomatoAccount(customer2);
        System.out.println("Account Created : " + ref2);

        ZomatoAccount customer3 = new ZomatoAccount();
        customer3.setCustomerId(3);
        customer3.setFullName("Ganesh ");
        customer3.setEmail("ganesh@gmail.com");
        customer3.setPassword("ganesh@13");
        customer3.setMobileNumber("9741098765");
        customer3.setGender("Male");
        customer3.setCity("Mangaluru");
        customer3.setIsAccountActive(true);
        boolean ref3 = zomato.createZomatoAccount(customer3);
        System.out.println("Account Created : " + ref3);

        ZomatoAccount customer4 = new ZomatoAccount();
        customer4.setCustomerId(4);
        customer4.setFullName("Rekha");
        customer4.setEmail("rekha@gmail.com");
        customer4.setPassword("rekha@Zomato94");
        customer4.setMobileNumber("9623045678");
        customer4.setGender("Female");
        customer4.setCity("Nashik");
        customer4.setIsAccountActive(true);
        boolean ref4 = zomato.createZomatoAccount(customer4);
        System.out.println("Account Created : " + ref4);

        ZomatoAccount customer5 = new ZomatoAccount();
        customer5.setCustomerId(5);
        customer5.setFullName("Harish");
        customer5.setEmail("harish@gmail.com");
        customer5.setPassword("harish@Zomato89");
        customer5.setMobileNumber("9500312456");
        customer5.setGender("Male");
        customer5.setCity("Chennai");
        customer5.setIsAccountActive(true);
        boolean ref5 = zomato.createZomatoAccount(customer5);
        System.out.println("Account Created : " + ref5);

        zomato.getAccountDetails();
    }
}