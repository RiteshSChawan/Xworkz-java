class MyntraRunner {

    public static void main(String args[]) {
        Myntra myntra = new Myntra();

        MyntraAccount customer1 = new MyntraAccount();
        customer1.setCustomerId(1);
        customer1.setFullName("Yash");
        customer1.setEmail("yash@gmail.com");
        customer1.setPassword("yash@01");
        customer1.setMobileNumber("9876543210");
        customer1.setGender("Male");
        customer1.setShippingAddress(" Bengaluru, Karnataka");
        customer1.setIsAccountActive(true);
        boolean ref1 = myntra.createMyntraAccount(customer1);
        System.out.println("Account Created : " + ref1);

        MyntraAccount customer2 = new MyntraAccount();
        customer2.setCustomerId(2);
        customer2.setFullName("Ishita");
        customer2.setEmail("ishita@gmail.com");
        customer2.setPassword("ishita@00");
        customer2.setMobileNumber("9810045678");
        customer2.setGender("Female");
        customer2.setShippingAddress(" Lajpat Nagar, New Delhi");
        customer2.setIsAccountActive(true);
        boolean ref2 = myntra.createMyntraAccount(customer2);
        System.out.println("Account Created : " + ref2);

        MyntraAccount customer3 = new MyntraAccount();
        customer3.setCustomerId(3);
        customer3.setFullName("Varun");
        customer3.setEmail("varun@gmail.com");
        customer3.setPassword("varun@12");
        customer3.setMobileNumber("9711023456");
        customer3.setGender("Male");
        customer3.setShippingAddress("Rajouri Garden, New Delhi");
        customer3.setIsAccountActive(true);
        boolean ref3 = myntra.createMyntraAccount(customer3);
        System.out.println("Account Created : " + ref3);

        MyntraAccount customer4 = new MyntraAccount();
        customer4.setCustomerId(4);
        customer4.setFullName("Simran");
        customer4.setEmail("simran@gmail.com");
        customer4.setPassword("simran@55");
        customer4.setMobileNumber("9855034567");
        customer4.setGender("Female");
        customer4.setShippingAddress("Amritsar, Punjab ");
        customer4.setIsAccountActive(true);
        boolean ref4 = myntra.createMyntraAccount(customer4);
        System.out.println("Account Created : " + ref4);

        MyntraAccount customer5 = new MyntraAccount();
        customer5.setCustomerId(5);
        customer5.setFullName("Dilip Joshi");
        customer5.setEmail("dilip.joshi@gmail.com");
        customer5.setPassword("dilip@33");
        customer5.setMobileNumber("9922156789");
        customer5.setGender("Male");
        customer5.setShippingAddress("Pune, Maharashtra");
        customer5.setIsAccountActive(true);
        boolean ref5 = myntra.createMyntraAccount(customer5);
        System.out.println("Account Created : " + ref5);

        myntra.getAccountDetails();
    }
}