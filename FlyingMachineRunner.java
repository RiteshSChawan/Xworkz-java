class FlyingMachineRunner {

    public static void main(String args[]) {
        FlyingMachine flyingMachine = new FlyingMachine();

        FlyingMachineAccount customer1 = new FlyingMachineAccount();
        customer1.setCustomerId(1);
        customer1.setFullName("Kumar Sharma");
        customer1.setEmail("kumar.sharma@gmail.com");
        customer1.setPassword("aarav@FM95");
        customer1.setGender("Male");
        customer1.setDateOfBirth("15-08-1995");
        customer1.setCity("Bengaluru");
        customer1.setIsAccountActive(true);
        boolean ref1 = flyingMachine.createFlyingMachineAccount(customer1);
        System.out.println("Account Created : " + ref1);

        FlyingMachineAccount customer2 = new FlyingMachineAccount();
        customer2.setCustomerId(2);
        customer2.setFullName("Divya Pillai");
        customer2.setEmail("divya.pillai@gmail.com");
        customer2.setPassword("divya@FM98");
        customer2.setGender("Female");
        customer2.setDateOfBirth("11-05-1998");
        customer2.setCity("Thiruvananthapuram");
        customer2.setIsAccountActive(true);
        boolean ref2 = flyingMachine.createFlyingMachineAccount(customer2);
        System.out.println("Account Created : " + ref2);

        FlyingMachineAccount customer3 = new FlyingMachineAccount();
        customer3.setCustomerId(3);
        customer3.setFullName("Vikram Joshi");
        customer3.setEmail("vikram.joshi@gmail.com");
        customer3.setPassword("vikram@FM93");
        customer3.setGender("Male");
        customer3.setDateOfBirth("20-11-1993");
        customer3.setCity("Jaipur");
        customer3.setIsAccountActive(true);
        boolean ref3 = flyingMachine.createFlyingMachineAccount(customer3);
        System.out.println("Account Created : " + ref3);

        FlyingMachineAccount customer4 = new FlyingMachineAccount();
        customer4.setCustomerId(4);
        customer4.setFullName("Ananya Reddy");
        customer4.setEmail("ananya.reddy@gmail.com");
        customer4.setPassword("ananya@FM00");
        customer4.setGender("Female");
        customer4.setDateOfBirth("07-02-2000");
        customer4.setCity("Hyderabad");
        customer4.setIsAccountActive(true);
        boolean ref4 = flyingMachine.createFlyingMachineAccount(customer4);
        System.out.println("Account Created : " + ref4);

        FlyingMachineAccount customer5 = new FlyingMachineAccount();
        customer5.setCustomerId(5);
        customer5.setFullName("Rahul Tiwari");
        customer5.setEmail("rahul.tiwari@gmail.com");
        customer5.setPassword("rahul@FM91");
        customer5.setGender("Male");
        customer5.setDateOfBirth("25-06-1991");
        customer5.setCity("Lucknow");
        customer5.setIsAccountActive(true);
        boolean ref5 = flyingMachine.createFlyingMachineAccount(customer5);
        System.out.println("Account Created : " + ref5);

        flyingMachine.getAccountDetails();
    }
}