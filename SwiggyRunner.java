class SwiggyRunner {

    public static void main(String args[]) {
        Swiggy swiggy = new Swiggy();

        SwiggyAccount customer1 = new SwiggyAccount();
        customer1.setCustomerId(1);
        customer1.setFullName("Kumar");
        customer1.setEmail("kumar@gmail.com");
        customer1.setPassword("kumar@99");
        customer1.setMobileNumber("9876543210");
        customer1.setDateOfBirth("15-08-1995");
        customer1.setDeliveryAddress("12, MG Road, Bengaluru, Karnataka - 560001");
        customer1.setIsAccountActive(true);
        boolean ref1 = swiggy.createSwiggyAccount(customer1);
        System.out.println("Account Created : " + ref1);

        SwiggyAccount customer2 = new SwiggyAccount();
        customer2.setCustomerId(2);
        customer2.setFullName("Meena");
        customer2.setEmail("meena@gmail.com");
        customer2.setPassword("meena@55");
        customer2.setMobileNumber("9845067890");
        customer2.setDateOfBirth("03-09-1997");
        customer2.setDeliveryAddress("56, T Nagar, Chennai, Tamil Nadu - 600017");
        customer2.setIsAccountActive(true);
        boolean ref2 = swiggy.createSwiggyAccount(customer2);
        System.out.println("Account Created : " + ref2);

        SwiggyAccount customer3 = new SwiggyAccount();
        customer3.setCustomerId(3);
        customer3.setFullName("Prakash");
        customer3.setEmail("prakash@gmail.com");
        customer3.setPassword("prakash@12");
        customer3.setMobileNumber("9712398765");
        customer3.setDateOfBirth("19-04-1994");
        customer3.setDeliveryAddress("88, Koregaon Park, Pune, Maharashtra - 411001");
        customer3.setIsAccountActive(true);
        boolean ref3 = swiggy.createSwiggyAccount(customer3);
        System.out.println("Account Created : " + ref3);

        SwiggyAccount customer4 = new SwiggyAccount();
        customer4.setCustomerId(4);
        customer4.setFullName("Lakshmi");
        customer4.setEmail("lakshmi@gmail.com");
        customer4.setPassword("lakshmi@11");
        customer4.setMobileNumber("9600234567");
        customer4.setDateOfBirth("28-01-1999");
        customer4.setDeliveryAddress("14, Banjara Hills, Hyderabad, Telangana - 500034");
        customer4.setIsAccountActive(true);
        boolean ref4 = swiggy.createSwiggyAccount(customer4);
        System.out.println("Account Created : " + ref4);

        SwiggyAccount customer5 = new SwiggyAccount();
        customer5.setCustomerId(5);
        customer5.setFullName("Suresh Babu");
        customer5.setEmail("suresh@gmail.com");
        customer5.setPassword("suresh@13");
        customer5.setMobileNumber("9820145678");
        customer5.setDateOfBirth("10-12-1989");
        customer5.setDeliveryAddress("22, Navrangpura, Ahmedabad, Gujarat - 380009");
        customer5.setIsAccountActive(true);
        boolean ref5 = swiggy.createSwiggyAccount(customer5);
        System.out.println("Account Created : " + ref5);

        swiggy.getAccountDetails();
    }
}