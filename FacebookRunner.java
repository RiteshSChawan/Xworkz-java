class FacebookRunner {

    public static void main(String args[]) {
        Facebook facebook = new Facebook();

        UserAccount userOne = new UserAccount();
        userOne.setUserId(1);
        userOne.setUserName("Ritesh");
        userOne.setEmail("ritesh11@gmail.com");
        userOne.setPassword("ritu123");
        userOne.setGender("Male");
        userOne.setDateOfBirth("11-11-2004");
        userOne.setLocation("Davanagere");
        userOne.setIsAccountActive(true);
        boolean ref1 = facebook.createUserAccount(userOne);
        System.out.println("Account Created : " + ref1);

        UserAccount userTwo = new UserAccount();
        userTwo.setUserId(2);
        userTwo.setUserName("Akash");
        userTwo.setEmail("akash02@gmail.com");
        userTwo.setPassword("akku02");
        userTwo.setGender("Male");
        userTwo.setDateOfBirth("01-01-2004");
        userTwo.setLocation("Bengaluru");
        userTwo.setIsAccountActive(true);
        boolean ref2 = facebook.createUserAccount(userTwo);
        System.out.println("Account Created : " + ref2);

        UserAccount userThree = new UserAccount();
        userThree.setUserId(3);
        userThree.setUserName("Rohit Verma");
        userThree.setEmail("rohitverma@gmail.com");
        userThree.setPassword("rohit456");
        userThree.setGender("Male");
        userThree.setDateOfBirth("05-07-2001");
        userThree.setLocation("Mysore");
        userThree.setIsAccountActive(true);
        boolean ref3 = facebook.createUserAccount(userThree);
        System.out.println("Account Created : " + ref3);

        UserAccount userFour = new UserAccount();
        userFour.setUserId(4);
        userFour.setUserName("Sneha Iyer");
        userFour.setEmail("snehaiyer@gmail.com");
        userFour.setPassword("sneha@789");
        userFour.setGender("Female");
        userFour.setDateOfBirth("18-12-2002");
        userFour.setLocation("Udupi");
        userFour.setIsAccountActive(true);
        boolean ref4 = facebook.createUserAccount(userFour);
        System.out.println("Account Created : " + ref4);

        UserAccount userFive = new UserAccount();
        userFive.setUserId(5);
        userFive.setUserName("Pratheek");
        userFive.setEmail("pratheek@gmail.com");
        userFive.setPassword("pratheek2000");
        userFive.setGender("Male");
        userFive.setDateOfBirth("30-09-2000");
        userFive.setLocation("Sirsi");
        userFive.setIsAccountActive(true);
        boolean ref5 = facebook.createUserAccount(userFive);
        System.out.println("Account Created : " + ref5);

        UserAccount userSix = new UserAccount();
        userSix.setUserId(6);
        userSix.setUserName("Ananya Krishnan");
        userSix.setEmail("ananya.krishnan@gmail.com");
        userSix.setPassword("ananya@2003");
        userSix.setGender("Female");
        userSix.setDateOfBirth("14-02-2003");
        userSix.setLocation("Thiruvananthapuram");
        userSix.setIsAccountActive(true);
        boolean ref6 = facebook.createUserAccount(userSix);
        System.out.println("Account Created : " + ref6);

        UserAccount userSeven = new UserAccount();
        userSeven.setUserId(7);
        userSeven.setUserName("Vikram Nair");
        userSeven.setEmail("vikram.nair@gmail.com");
        userSeven.setPassword("vikram#007");
        userSeven.setGender("Male");
        userSeven.setDateOfBirth("22-06-1999");
        userSeven.setLocation("Kozhikode");
        userSeven.setIsAccountActive(true);
        boolean ref7 = facebook.createUserAccount(userSeven);
        System.out.println("Account Created : " + ref7);

        UserAccount userEight = new UserAccount();
        userEight.setUserId(8);
        userEight.setUserName("Pooja Desai");
        userEight.setEmail("pooja.desai@gmail.com");
        userEight.setPassword("pooja@1998");
        userEight.setGender("Female");
        userEight.setDateOfBirth("08-08-1998");
        userEight.setLocation("Ahmedabad");
        userEight.setIsAccountActive(true);
        boolean ref8 = facebook.createUserAccount(userEight);
        System.out.println("Account Created : " + ref8);

        UserAccount userNine = new UserAccount();
        userNine.setUserId(9);
        userNine.setUserName("Suresh Patil");
        userNine.setEmail("suresh.patil@gmail.com");
        userNine.setPassword("suresh#123");
        userNine.setGender("Male");
        userNine.setDateOfBirth("17-03-1997");
        userNine.setLocation("Kolhapur");
        userNine.setIsAccountActive(true);
        boolean ref9 = facebook.createUserAccount(userNine);
        System.out.println("Account Created : " + ref9);

        UserAccount userTen = new UserAccount();
        userTen.setUserId(10);
        userTen.setUserName("Deepa Menon");
        userTen.setEmail("deepa.menon@gmail.com");
        userTen.setPassword("deepa@2001");
        userTen.setGender("Female");
        userTen.setDateOfBirth("25-11-2001");
        userTen.setLocation("Thrissur");
        userTen.setIsAccountActive(true);
        boolean ref10 = facebook.createUserAccount(userTen);
        System.out.println("Account Created : " + ref10);

        UserAccount userEleven = new UserAccount();
        userEleven.setUserId(11);
        userEleven.setUserName("Karthik Reddy");
        userEleven.setEmail("karthik.reddy@gmail.com");
        userEleven.setPassword("karthik#2002");
        userEleven.setGender("Male");
        userEleven.setDateOfBirth("10-05-2002");
        userEleven.setLocation("Hyderabad");
        userEleven.setIsAccountActive(true);
        boolean ref11 = facebook.createUserAccount(userEleven);
        System.out.println("Account Created : " + ref11);

        UserAccount userTwelve = new UserAccount();
        userTwelve.setUserId(12);
        userTwelve.setUserName("Meena Sharma");
        userTwelve.setEmail("meena.sharma@gmail.com");
        userTwelve.setPassword("meena@456");
        userTwelve.setGender("Female");
        userTwelve.setDateOfBirth("03-09-2000");
        userTwelve.setLocation("Jaipur");
        userTwelve.setIsAccountActive(true);
        boolean ref12 = facebook.createUserAccount(userTwelve);
        System.out.println("Account Created : " + ref12);

        UserAccount userThirteen = new UserAccount();
        userThirteen.setUserId(13);
        userThirteen.setUserName("Arun Kumar");
        userThirteen.setEmail("arun.kumar@gmail.com");
        userThirteen.setPassword("arun#9999");
        userThirteen.setGender("Male");
        userThirteen.setDateOfBirth("19-07-1995");
        userThirteen.setLocation("Coimbatore");
        userThirteen.setIsAccountActive(true);
        boolean ref13 = facebook.createUserAccount(userThirteen);
        System.out.println("Account Created : " + ref13);

        UserAccount userFourteen = new UserAccount();
        userFourteen.setUserId(14);
        userFourteen.setUserName("Divya Pillai");
        userFourteen.setEmail("divya.pillai@gmail.com");
        userFourteen.setPassword("divya@2004");
        userFourteen.setGender("Female");
        userFourteen.setDateOfBirth("12-04-2004");
        userFourteen.setLocation("Kannur");
        userFourteen.setIsAccountActive(true);
        boolean ref14 = facebook.createUserAccount(userFourteen);
        System.out.println("Account Created : " + ref14);

        UserAccount userFifteen = new UserAccount();
        userFifteen.setUserId(15);
        userFifteen.setUserName("Manoj Tiwari");
        userFifteen.setEmail("manoj.tiwari@gmail.com");
        userFifteen.setPassword("manoj#1996");
        userFifteen.setGender("Male");
        userFifteen.setDateOfBirth("07-01-1996");
        userFifteen.setLocation("Varanasi");
        userFifteen.setIsAccountActive(true);
        boolean ref15 = facebook.createUserAccount(userFifteen);
        System.out.println("Account Created : " + ref15);

        UserAccount userSixteen = new UserAccount();
        userSixteen.setUserId(16);
        userSixteen.setUserName("Lakshmi Rao");
        userSixteen.setEmail("lakshmi.rao@gmail.com");
        userSixteen.setPassword("lakshmi@2005");
        userSixteen.setGender("Female");
        userSixteen.setDateOfBirth("28-10-2005");
        userSixteen.setLocation("Vijayawada");
        userSixteen.setIsAccountActive(true);
        boolean ref16 = facebook.createUserAccount(userSixteen);
        System.out.println("Account Created : " + ref16);

        UserAccount userSeventeen = new UserAccount();
        userSeventeen.setUserId(17);
        userSeventeen.setUserName("Naveen Bhat");
        userSeventeen.setEmail("naveen.bhat@gmail.com");
        userSeventeen.setPassword("naveen#2003");
        userSeventeen.setGender("Male");
        userSeventeen.setDateOfBirth("15-06-2003");
        userSeventeen.setLocation("Mangaluru");
        userSeventeen.setIsAccountActive(true);
        boolean ref17 = facebook.createUserAccount(userSeventeen);
        System.out.println("Account Created : " + ref17);

        UserAccount userEighteen = new UserAccount();
        userEighteen.setUserId(18);
        userEighteen.setUserName("Swathi Gowda");
        userEighteen.setEmail("swathi.gowda@gmail.com");
        userEighteen.setPassword("swathi@1999");
        userEighteen.setGender("Female");
        userEighteen.setDateOfBirth("20-08-1999");
        userEighteen.setLocation("Shivamogga");
        userEighteen.setIsAccountActive(true);
        boolean ref18 = facebook.createUserAccount(userEighteen);
        System.out.println("Account Created : " + ref18);

        UserAccount userNineteen = new UserAccount();
        userNineteen.setUserId(19);
        userNineteen.setUserName("Ganesh Hegde");
        userNineteen.setEmail("ganesh.hegde@gmail.com");
        userNineteen.setPassword("ganesh#2000");
        userNineteen.setGender("Male");
        userNineteen.setDateOfBirth("11-12-2000");
        userNineteen.setLocation("Hubli");
        userNineteen.setIsAccountActive(true);
        boolean ref19 = facebook.createUserAccount(userNineteen);
        System.out.println("Account Created : " + ref19);

        facebook.getUserDetails();
    }
}
