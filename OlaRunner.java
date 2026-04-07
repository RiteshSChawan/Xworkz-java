class OlaRunner {

    public static void main(String args[]) {
        Ola ola = new Ola();

        OlaAccount rider1 = new OlaAccount();
        rider1.setRiderId(1);
        rider1.setFullName("Darshan");
        rider1.setEmail("darshan@gmail.com");
        rider1.setPassword("darshu@14");
        rider1.setMobileNumber("9876543210");
        rider1.setGender("Male");
        rider1.setCity("Bengaluru");
        rider1.setIsAccountActive(true);
        boolean ref1 = ola.createOlaAccount(rider1);
        System.out.println("Account Created : " + ref1);

        OlaAccount rider2 = new OlaAccount();
        rider2.setRiderId(2);
        rider2.setFullName("Kavya");
        rider2.setEmail("kavya@gmail.com");
        rider2.setPassword("kavya@33");
        rider2.setMobileNumber("9963012345");
        rider2.setGender("Female");
        rider2.setCity("Hyderabad");
        rider2.setIsAccountActive(true);
        boolean ref2 = ola.createOlaAccount(rider2);
        System.out.println("Account Created : " + ref2);

        OlaAccount rider3 = new OlaAccount();
        rider3.setRiderId(3);
        rider3.setFullName("Manoj");
        rider3.setEmail("manoj@gmail.com");
        rider3.setPassword("manoj@44");
        rider3.setMobileNumber("9847034567");
        rider3.setGender("Male");
        rider3.setCity("Chennai");
        rider3.setIsAccountActive(true);
        boolean ref3 = ola.createOlaAccount(rider3);
        System.out.println("Account Created : " + ref3);

        OlaAccount rider4 = new OlaAccount();
        rider4.setRiderId(4);
        rider4.setFullName("Preethi");
        rider4.setEmail("preethi@gmail.com");
        rider4.setPassword("preethi@57");
        rider4.setMobileNumber("9444056789");
        rider4.setGender("Female");
        rider4.setCity("Coimbatore");
        rider4.setIsAccountActive(true);
        boolean ref4 = ola.createOlaAccount(rider4);
        System.out.println("Account Created : " + ref4);

        OlaAccount rider5 = new OlaAccount();
        rider5.setRiderId(5);
        rider5.setFullName("Sameer");
        rider5.setEmail("sameer@gmail.com");
        rider5.setPassword("sameer@68");
        rider5.setMobileNumber("9922078901");
        rider5.setGender("Male");
        rider5.setCity("Pune");
        rider5.setIsAccountActive(true);
        boolean ref5 = ola.createOlaAccount(rider5);
        System.out.println("Account Created : " + ref5);

        ola.getAccountDetails();
    }
}