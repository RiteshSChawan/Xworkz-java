class FlyingMachineRunner {

    public static void main(String args[]) {
        FlyingMachine flyingMachine = new FlyingMachine();

        FlyingMachineProfile profileOne = new FlyingMachineProfile();
        profileOne.setCustomerId(1);
        profileOne.setCustomerName("Aman Gupta");
        profileOne.setEmail("aman.gupta@gmail.com");
        profileOne.setPassword("aman@2003");
        profileOne.setGender("Male");
        profileOne.setDateOfBirth("06-06-2003");
        profileOne.setCity("Delhi");
        profileOne.setIsProfileActive(true);
        boolean ref1 = flyingMachine.createFlyingMachineProfile(profileOne);
        System.out.println("FlyingMachine Profile Created : " + ref1);

        FlyingMachineProfile profileTwo = new FlyingMachineProfile();
        profileTwo.setCustomerId(2);
        profileTwo.setCustomerName("Snehal Kulkarni");
        profileTwo.setEmail("snehal.kulkarni@gmail.com");
        profileTwo.setPassword("snehal#2002");
        profileTwo.setGender("Female");
        profileTwo.setDateOfBirth("21-04-2002");
        profileTwo.setCity("Pune");
        profileTwo.setIsProfileActive(true);
        boolean ref2 = flyingMachine.createFlyingMachineProfile(profileTwo);
        System.out.println("FlyingMachine Profile Created : " + ref2);

        FlyingMachineProfile profileThree = new FlyingMachineProfile();
        profileThree.setCustomerId(3);
        profileThree.setCustomerName("Vishal Nair");
        profileThree.setEmail("vishal.nair@gmail.com");
        profileThree.setPassword("vishal@2001");
        profileThree.setGender("Male");
        profileThree.setDateOfBirth("13-11-2001");
        profileThree.setCity("Kochi");
        profileThree.setIsProfileActive(true);
        boolean ref3 = flyingMachine.createFlyingMachineProfile(profileThree);
        System.out.println("FlyingMachine Profile Created : " + ref3);

        FlyingMachineProfile profileFour = new FlyingMachineProfile();
        profileFour.setCustomerId(4);
        profileFour.setCustomerName("Pallavi Reddy");
        profileFour.setEmail("pallavi.reddy@gmail.com");
        profileFour.setPassword("pallavi#2004");
        profileFour.setGender("Female");
        profileFour.setDateOfBirth("09-08-2004");
        profileFour.setCity("Hyderabad");
        profileFour.setIsProfileActive(true);
        boolean ref4 = flyingMachine.createFlyingMachineProfile(profileFour);
        System.out.println("FlyingMachine Profile Created : " + ref4);

        FlyingMachineProfile profileFive = new FlyingMachineProfile();
        profileFive.setCustomerId(5);
        profileFive.setCustomerName("Rohit Sharma");
        profileFive.setEmail("rohit.sharma@gmail.com");
        profileFive.setPassword("rohit@1998");
        profileFive.setGender("Male");
        profileFive.setDateOfBirth("14-02-1998");
        profileFive.setCity("Mumbai");
        profileFive.setIsProfileActive(true);
        boolean ref5 = flyingMachine.createFlyingMachineProfile(profileFive);
        System.out.println("FlyingMachine Profile Created : " + ref5);

        FlyingMachineProfile profileSix = new FlyingMachineProfile();
        profileSix.setCustomerId(6);
        profileSix.setCustomerName("Bhavana Menon");
        profileSix.setEmail("bhavana.menon@gmail.com");
        profileSix.setPassword("bhavana@2000");
        profileSix.setGender("Female");
        profileSix.setDateOfBirth("27-03-2000");
        profileSix.setCity("Thrissur");
        profileSix.setIsProfileActive(true);
        boolean ref6 = flyingMachine.createFlyingMachineProfile(profileSix);
        System.out.println("FlyingMachine Profile Created : " + ref6);

        FlyingMachineProfile profileSeven = new FlyingMachineProfile();
        profileSeven.setCustomerId(7);
        profileSeven.setCustomerName("Tejas Patil");
        profileSeven.setEmail("tejas.patil@gmail.com");
        profileSeven.setPassword("tejas#2003");
        profileSeven.setGender("Male");
        profileSeven.setDateOfBirth("18-07-2003");
        profileSeven.setCity("Kolhapur");
        profileSeven.setIsProfileActive(true);
        boolean ref7 = flyingMachine.createFlyingMachineProfile(profileSeven);
        System.out.println("FlyingMachine Profile Created : " + ref7);

        FlyingMachineProfile profileEight = new FlyingMachineProfile();
        profileEight.setCustomerId(8);
        profileEight.setCustomerName("Gayatri Iyer");
        profileEight.setEmail("gayatri.iyer@gmail.com");
        profileEight.setPassword("gayatri@2005");
        profileEight.setGender("Female");
        profileEight.setDateOfBirth("01-01-2005");
        profileEight.setCity("Chennai");
        profileEight.setIsProfileActive(true);
        boolean ref8 = flyingMachine.createFlyingMachineProfile(profileEight);
        System.out.println("FlyingMachine Profile Created : " + ref8);

        FlyingMachineProfile profileNine = new FlyingMachineProfile();
        profileNine.setCustomerId(9);
        profileNine.setCustomerName("Santosh Rao");
        profileNine.setEmail("santosh.rao@gmail.com");
        profileNine.setPassword("santosh#1997");
        profileNine.setGender("Male");
        profileNine.setDateOfBirth("03-05-1997");
        profileNine.setCity("Bengaluru");
        profileNine.setIsProfileActive(true);
        boolean ref9 = flyingMachine.createFlyingMachineProfile(profileNine);
        System.out.println("FlyingMachine Profile Created : " + ref9);

        FlyingMachineProfile profileTen = new FlyingMachineProfile();
        profileTen.setCustomerId(10);
        profileTen.setCustomerName("Ishita Joshi");
        profileTen.setEmail("ishita.joshi@gmail.com");
        profileTen.setPassword("ishita@2002");
        profileTen.setGender("Female");
        profileTen.setDateOfBirth("16-09-2002");
        profileTen.setCity("Indore");
        profileTen.setIsProfileActive(true);
        boolean ref10 = flyingMachine.createFlyingMachineProfile(profileTen);
        System.out.println("FlyingMachine Profile Created : " + ref10);

        FlyingMachineProfile profileEleven = new FlyingMachineProfile();
        profileEleven.setCustomerId(11);
        profileEleven.setCustomerName("Harish Shetty");
        profileEleven.setEmail("harish.shetty@gmail.com");
        profileEleven.setPassword("harish#2001");
        profileEleven.setGender("Male");
        profileEleven.setDateOfBirth("08-12-2001");
        profileEleven.setCity("Mangaluru");
        profileEleven.setIsProfileActive(true);
        boolean ref11 = flyingMachine.createFlyingMachineProfile(profileEleven);
        System.out.println("FlyingMachine Profile Created : " + ref11);

        FlyingMachineProfile profileTwelve = new FlyingMachineProfile();
        profileTwelve.setCustomerId(12);
        profileTwelve.setCustomerName("Rekha Pillai");
        profileTwelve.setEmail("rekha.pillai@gmail.com");
        profileTwelve.setPassword("rekha@1999");
        profileTwelve.setGender("Female");
        profileTwelve.setDateOfBirth("25-06-1999");
        profileTwelve.setCity("Thiruvananthapuram");
        profileTwelve.setIsProfileActive(true);
        boolean ref12 = flyingMachine.createFlyingMachineProfile(profileTwelve);
        System.out.println("FlyingMachine Profile Created : " + ref12);

        FlyingMachineProfile profileThirteen = new FlyingMachineProfile();
        profileThirteen.setCustomerId(13);
        profileThirteen.setCustomerName("Prasad Hegde");
        profileThirteen.setEmail("prasad.hegde@gmail.com");
        profileThirteen.setPassword("prasad#2000");
        profileThirteen.setGender("Male");
        profileThirteen.setDateOfBirth("11-10-2000");
        profileThirteen.setCity("Hubli");
        profileThirteen.setIsProfileActive(true);
        boolean ref13 = flyingMachine.createFlyingMachineProfile(profileThirteen);
        System.out.println("FlyingMachine Profile Created : " + ref13);

        FlyingMachineProfile profileFourteen = new FlyingMachineProfile();
        profileFourteen.setCustomerId(14);
        profileFourteen.setCustomerName("Nandini Verma");
        profileFourteen.setEmail("nandini.verma@gmail.com");
        profileFourteen.setPassword("nandini@2003");
        profileFourteen.setGender("Female");
        profileFourteen.setDateOfBirth("30-11-2003");
        profileFourteen.setCity("Jaipur");
        profileFourteen.setIsProfileActive(true);
        boolean ref14 = flyingMachine.createFlyingMachineProfile(profileFourteen);
        System.out.println("FlyingMachine Profile Created : " + ref14);

        FlyingMachineProfile profileFifteen = new FlyingMachineProfile();
        profileFifteen.setCustomerId(15);
        profileFifteen.setCustomerName("Aditya Tiwari");
        profileFifteen.setEmail("aditya.tiwari@gmail.com");
        profileFifteen.setPassword("aditya#1996");
        profileFifteen.setGender("Male");
        profileFifteen.setDateOfBirth("20-02-1996");
        profileFifteen.setCity("Lucknow");
        profileFifteen.setIsProfileActive(true);
        boolean ref15 = flyingMachine.createFlyingMachineProfile(profileFifteen);
        System.out.println("FlyingMachine Profile Created : " + ref15);

        FlyingMachineProfile profileSixteen = new FlyingMachineProfile();
        profileSixteen.setCustomerId(16);
        profileSixteen.setCustomerName("Shruthi Krishnan");
        profileSixteen.setEmail("shruthi.krishnan@gmail.com");
        profileSixteen.setPassword("shruthi@2004");
        profileSixteen.setGender("Female");
        profileSixteen.setDateOfBirth("07-07-2004");
        profileSixteen.setCity("Coimbatore");
        profileSixteen.setIsProfileActive(true);
        boolean ref16 = flyingMachine.createFlyingMachineProfile(profileSixteen);
        System.out.println("FlyingMachine Profile Created : " + ref16);

        FlyingMachineProfile profileSeventeen = new FlyingMachineProfile();
        profileSeventeen.setCustomerId(17);
        profileSeventeen.setCustomerName("Rajan Bhat");
        profileSeventeen.setEmail("rajan.bhat@gmail.com");
        profileSeventeen.setPassword("rajan#1995");
        profileSeventeen.setGender("Male");
        profileSeventeen.setDateOfBirth("14-08-1995");
        profileSeventeen.setCity("Udupi");
        profileSeventeen.setIsProfileActive(true);
        boolean ref17 = flyingMachine.createFlyingMachineProfile(profileSeventeen);
        System.out.println("FlyingMachine Profile Created : " + ref17);

        FlyingMachineProfile profileEighteen = new FlyingMachineProfile();
        profileEighteen.setCustomerId(18);
        profileEighteen.setCustomerName("Keerthi Gowda");
        profileEighteen.setEmail("keerthi.gowda@gmail.com");
        profileEighteen.setPassword("keerthi@2001");
        profileEighteen.setGender("Female");
        profileEighteen.setDateOfBirth("22-03-2001");
        profileEighteen.setCity("Mysuru");
        profileEighteen.setIsProfileActive(true);
        boolean ref18 = flyingMachine.createFlyingMachineProfile(profileEighteen);
        System.out.println("FlyingMachine Profile Created : " + ref18);

        FlyingMachineProfile profileNineteen = new FlyingMachineProfile();
        profileNineteen.setCustomerId(19);
        profileNineteen.setCustomerName("Sunil Desai");
        profileNineteen.setEmail("sunil.desai@gmail.com");
        profileNineteen.setPassword("sunil#1994");
        profileNineteen.setGender("Male");
        profileNineteen.setDateOfBirth("05-09-1994");
        profileNineteen.setCity("Ahmedabad");
        profileNineteen.setIsProfileActive(true);
        boolean ref19 = flyingMachine.createFlyingMachineProfile(profileNineteen);
        System.out.println("FlyingMachine Profile Created : " + ref19);

        flyingMachine.getFlyingMachineProfileDetails();
    }
}
