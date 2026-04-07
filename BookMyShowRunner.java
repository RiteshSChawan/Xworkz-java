class BookMyShowRunner {

    public static void main(String args[]) {
        BookMyShow bookMyShow = new BookMyShow();

        BookMyShowAccount user1 = new BookMyShowAccount();
        user1.setUserId(1);
        user1.setFullName("Arun Kumar ");
        user1.setEmail("arun@gmail.com");
        user1.setPassword("arun@11");
        user1.setMobileNumber("9876543210");
        user1.setGender("Male");
        user1.setCity("Bengaluru");
        user1.setIsAccountActive(true);
        boolean ref1 = bookMyShow.createBookMyShowAccount(user1);
        System.out.println("Account Created : " + ref1);

        BookMyShowAccount user2 = new BookMyShowAccount();
        user2.setUserId(2);
        user2.setFullName("Nandini Bhat");
        user2.setEmail("nandini@gmail.com");
        user2.setPassword("nandini@12");
        user2.setMobileNumber("9741023456");
        user2.setGender("Female");
        user2.setCity("Mangaluru");
        user2.setIsAccountActive(true);
        boolean ref2 = bookMyShow.createBookMyShowAccount(user2);
        System.out.println("Account Created : " + ref2);

        BookMyShowAccount user3 = new BookMyShowAccount();
        user3.setUserId(3);
        user3.setFullName("Siddharth Rao");
        user3.setEmail("siddharth.rao@gmail.com");
        user3.setPassword("siddharth@22");
        user3.setMobileNumber("9500187654");
        user3.setGender("Male");
        user3.setCity("Visakhapatnam");
        user3.setIsAccountActive(true);
        boolean ref3 = bookMyShow.createBookMyShowAccount(user3);
        System.out.println("Account Created : " + ref3);

        BookMyShowAccount user4 = new BookMyShowAccount();
        user4.setUserId(4);
        user4.setFullName("Kavitha");
        user4.setEmail("kavitha@gmail.com");
        user4.setPassword("kavitha@65");
        user4.setMobileNumber("9380056789");
        user4.setGender("Female");
        user4.setCity("Coimbatore");
        user4.setIsAccountActive(true);
        boolean ref4 = bookMyShow.createBookMyShowAccount(user4);
        System.out.println("Account Created : " + ref4);

        BookMyShowAccount user5 = new BookMyShowAccount();
        user5.setUserId(5);
        user5.setFullName("Manish");
        user5.setEmail("manish@gmail.com");
        user5.setPassword("manish@55");
        user5.setMobileNumber("9820034567");
        user5.setGender("Male");
        user5.setCity("Kolkata");
        user5.setIsAccountActive(true);
        boolean ref5 = bookMyShow.createBookMyShowAccount(user5);
        System.out.println("Account Created : " + ref5);

        bookMyShow.getAccountDetails();
    }
}