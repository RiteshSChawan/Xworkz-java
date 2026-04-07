class MeeshoRunner {

    public static void main(String args[]) {
        Meesho meesho = new Meesho();

        MeeshoAccount seller1 = new MeeshoAccount();
        seller1.setSellerId(1);
        seller1.setFullName("Ritesh");
        seller1.setEmail("ritesh@gmail.com");
        seller1.setPassword("ritu@11");
        seller1.setMobileNumber("9876543210");
        seller1.setGender("Male");
        seller1.setState("Karnataka");
        seller1.setIsAccountActive(true);
        boolean ref1 = meesho.createMeeshoAccount(seller1);
        System.out.println("Account Created : " + ref1);

        MeeshoAccount seller2 = new MeeshoAccount();
        seller2.setSellerId(2);
        seller2.setFullName("Anjali");
        seller2.setEmail("anjali@gmail.com");
        seller2.setPassword("anjali@29");
        seller2.setMobileNumber("9452012345");
        seller2.setGender("Female");
        seller2.setState("Uttar Pradesh");
        seller2.setIsAccountActive(true);
        boolean ref2 = meesho.createMeeshoAccount(seller2);
        System.out.println("Account Created : " + ref2);

        MeeshoAccount seller3 = new MeeshoAccount();
        seller3.setSellerId(3);
        seller3.setFullName("Gopal");
        seller3.setEmail("gopi@gmail.com");
        seller3.setPassword("gopi@13");
        seller3.setMobileNumber("9415078901");
        seller3.setGender("Male");
        seller3.setState("Bihar");
        seller3.setIsAccountActive(true);
        boolean ref3 = meesho.createMeeshoAccount(seller3);
        System.out.println("Account Created : " + ref3);

        MeeshoAccount seller4 = new MeeshoAccount();
        seller4.setSellerId(4);
        seller4.setFullName("Sunita");
        seller4.setEmail("sunita@gmail.com");
        seller4.setPassword("sunita@14");
        seller4.setMobileNumber("9336045678");
        seller4.setGender("Female");
        seller4.setState("Madhya Pradesh");
        seller4.setIsAccountActive(true);
        boolean ref4 = meesho.createMeeshoAccount(seller4);
        System.out.println("Account Created : " + ref4);

        MeeshoAccount seller5 = new MeeshoAccount();
        seller5.setSellerId(5);
        seller5.setFullName("Dinesh");
        seller5.setEmail("dinesh@gmail.com");
        seller5.setPassword("dinesh@15");
        seller5.setMobileNumber("9828034567");
        seller5.setGender("Male");
        seller5.setState("Rajasthan");
        seller5.setIsAccountActive(true);
        boolean ref5 = meesho.createMeeshoAccount(seller5);
        System.out.println("Account Created : " + ref5);

        meesho.getAccountDetails();
    }
}