class AmazonRunner {

    public static void main(String args[]) {
        Amazon amazon = new Amazon();

        AmazonProfile profileOne = new AmazonProfile();
        profileOne.setCustomerId(1);
        profileOne.setCustomerName("Aman Kapoor");
        profileOne.setEmail("aman.kapoor@gmail.com");
        profileOne.setPassword("aman@2002");
        profileOne.setGender("Male");
        profileOne.setDateOfBirth("12-01-2002");
        profileOne.setCity("Delhi");
        profileOne.setIsProfileActive(true);
        profileOne.setMobileNumber("9876543210");
        boolean ref1 = amazon.createAmazonProfile(profileOne);
        System.out.println("Amazon Profile Created : " + ref1);
		
        AmazonProfile profileTwo = new AmazonProfile();
        profileTwo.setCustomerId(2);
        profileTwo.setCustomerName("Ritu Singh");
        profileTwo.setEmail("ritu.singh@gmail.com");
        profileTwo.setPassword("ritu#2003");
        profileTwo.setGender("Female");
        profileTwo.setDateOfBirth("07-03-2003");
        profileTwo.setCity("Noida");
        profileTwo.setIsProfileActive(true);
        profileTwo.setMobileNumber("9865432109");
        boolean ref2 = amazon.createAmazonProfile(profileTwo);
        System.out.println("Amazon Profile Created : " + ref2);
		
        AmazonProfile profileThree = new AmazonProfile();
        profileThree.setCustomerId(3);
        profileThree.setCustomerName("Arjun Das");
        profileThree.setEmail("arjun.das@gmail.com");
        profileThree.setPassword("arjun@2001");
        profileThree.setGender("Male");
        profileThree.setDateOfBirth("19-05-2001");
        profileThree.setCity("Kolkata");
        profileThree.setIsProfileActive(true);
        profileThree.setMobileNumber("9754321098");
        boolean ref3 = amazon.createAmazonProfile(profileThree);
        System.out.println("Amazon Profile Created : " + ref3);
		
        AmazonProfile profileFour = new AmazonProfile();
        profileFour.setCustomerId(4);
        profileFour.setCustomerName("Pooja Krishnan");
        profileFour.setEmail("pooja.krishnan@gmail.com");
        profileFour.setPassword("pooja#2004");
        profileFour.setGender("Female");
        profileFour.setDateOfBirth("24-08-2004");
        profileFour.setCity("Chennai");
        profileFour.setIsProfileActive(true);
        profileFour.setMobileNumber("9643210987");
        boolean ref4 = amazon.createAmazonProfile(profileFour);
        System.out.println("Amazon Profile Created : " + ref4);
		
        AmazonProfile profileFive = new AmazonProfile();
        profileFive.setCustomerId(5);
        profileFive.setCustomerName("Siddharth Jain");
        profileFive.setEmail("siddharth.jain@gmail.com");
        profileFive.setPassword("sidd@1999");
        profileFive.setGender("Male");
        profileFive.setDateOfBirth("30-11-1999");
        profileFive.setCity("Jaipur");
        profileFive.setIsProfileActive(true);
        profileFive.setMobileNumber("9532109876");
        boolean ref5 = amazon.createAmazonProfile(profileFive);
        System.out.println("Amazon Profile Created : " + ref5);
		
        AmazonProfile profileSix = new AmazonProfile();
        profileSix.setCustomerId(6);
        profileSix.setCustomerName("Deepika Nair");
        profileSix.setEmail("deepika.nair@gmail.com");
        profileSix.setPassword("deepika#2000");
        profileSix.setGender("Female");
        profileSix.setDateOfBirth("15-02-2000");
        profileSix.setCity("Kochi");
        profileSix.setIsProfileActive(true);
        profileSix.setMobileNumber("9421098765");
        boolean ref6 = amazon.createAmazonProfile(profileSix);
        System.out.println("Amazon Profile Created : " + ref6);
		
        AmazonProfile profileSeven = new AmazonProfile();
        profileSeven.setCustomerId(7);
        profileSeven.setCustomerName("Rahul Bose");
        profileSeven.setEmail("rahul.bose@gmail.com");
        profileSeven.setPassword("rahul@1998");
        profileSeven.setGender("Male");
        profileSeven.setDateOfBirth("28-06-1998");
        profileSeven.setCity("Bengaluru");
        profileSeven.setIsProfileActive(true);
        profileSeven.setMobileNumber("9310987654");
        boolean ref7 = amazon.createAmazonProfile(profileSeven);
        System.out.println("Amazon Profile Created : " + ref7);
		
        AmazonProfile profileEight = new AmazonProfile();
        profileEight.setCustomerId(8);
        profileEight.setCustomerName("Kavita Rao");
        profileEight.setEmail("kavita.rao@gmail.com");
        profileEight.setPassword("kavita#2005");
        profileEight.setGender("Female");
        profileEight.setDateOfBirth("04-10-2005");
        profileEight.setCity("Hyderabad");
        profileEight.setIsProfileActive(true);
        profileEight.setMobileNumber("9209876543");
        boolean ref8 = amazon.createAmazonProfile(profileEight);
        System.out.println("Amazon Profile Created : " + ref8);
		
        AmazonProfile profileNine = new AmazonProfile();
        profileNine.setCustomerId(9);
        profileNine.setCustomerName("Manoj Iyer");
        profileNine.setEmail("manoj.iyer@gmail.com");
        profileNine.setPassword("manoj@2003");
        profileNine.setGender("Male");
        profileNine.setDateOfBirth("11-12-2003");
        profileNine.setCity("Coimbatore");
        profileNine.setIsProfileActive(true);
        profileNine.setMobileNumber("9198765432");
        boolean ref9 = amazon.createAmazonProfile(profileNine);
        System.out.println("Amazon Profile Created : " + ref9);
		
        AmazonProfile profileTen = new AmazonProfile();
        profileTen.setCustomerId(10);
        profileTen.setCustomerName("Swara Patil");
        profileTen.setEmail("swara.patil@gmail.com");
        profileTen.setPassword("swara#2001");
        profileTen.setGender("Female");
        profileTen.setDateOfBirth("22-04-2001");
        profileTen.setCity("Pune");
        profileTen.setIsProfileActive(true);
        profileTen.setMobileNumber("9087654321");
        boolean ref10 = amazon.createAmazonProfile(profileTen);
        System.out.println("Amazon Profile Created : " + ref10);
		
        AmazonProfile profileEleven = new AmazonProfile();
        profileEleven.setCustomerId(11);
        profileEleven.setCustomerName("Vikrant Hegde");
        profileEleven.setEmail("vikrant.hegde@gmail.com");
        profileEleven.setPassword("vikrant@2002");
        profileEleven.setGender("Male");
        profileEleven.setDateOfBirth("03-07-2002");
        profileEleven.setCity("Hubli");
        profileEleven.setIsProfileActive(true);
        profileEleven.setMobileNumber("8976543210");
        boolean ref11 = amazon.createAmazonProfile(profileEleven);
        System.out.println("Amazon Profile Created : " + ref11);
		
        AmazonProfile profileTwelve = new AmazonProfile();
        profileTwelve.setCustomerId(12);
        profileTwelve.setCustomerName("Nithya Menon");
        profileTwelve.setEmail("nithya.menon@gmail.com");
        profileTwelve.setPassword("nithya#1997");
        profileTwelve.setGender("Female");
        profileTwelve.setDateOfBirth("16-09-1997");
        profileTwelve.setCity("Thrissur");
        profileTwelve.setIsProfileActive(true);
        profileTwelve.setMobileNumber("8865432109");
        boolean ref12 = amazon.createAmazonProfile(profileTwelve);
        System.out.println("Amazon Profile Created : " + ref12);
		
        AmazonProfile profileThirteen = new AmazonProfile();
        profileThirteen.setCustomerId(13);
        profileThirteen.setCustomerName("Girish Sharma");
        profileThirteen.setEmail("girish.sharma@gmail.com");
        profileThirteen.setPassword("girish@1996");
        profileThirteen.setGender("Male");
        profileThirteen.setDateOfBirth("27-03-1996");
        profileThirteen.setCity("Lucknow");
        profileThirteen.setIsProfileActive(true);
        profileThirteen.setMobileNumber("8754321098");
        boolean ref13 = amazon.createAmazonProfile(profileThirteen);
        System.out.println("Amazon Profile Created : " + ref13);
		
        AmazonProfile profileFourteen = new AmazonProfile();
        profileFourteen.setCustomerId(14);
        profileFourteen.setCustomerName("Preethi Reddy");
        profileFourteen.setEmail("preethi.reddy@gmail.com");
        profileFourteen.setPassword("preethi#2004");
        profileFourteen.setGender("Female");
        profileFourteen.setDateOfBirth("08-01-2004");
        profileFourteen.setCity("Vijayawada");
        profileFourteen.setIsProfileActive(true);
        profileFourteen.setMobileNumber("8643210987");
        boolean ref14 = amazon.createAmazonProfile(profileFourteen);
        System.out.println("Amazon Profile Created : " + ref14);
		
        AmazonProfile profileFifteen = new AmazonProfile();
        profileFifteen.setCustomerId(15);
        profileFifteen.setCustomerName("Suhas Bhat");
        profileFifteen.setEmail("suhas.bhat@gmail.com");
        profileFifteen.setPassword("suhas@2000");
        profileFifteen.setGender("Male");
        profileFifteen.setDateOfBirth("19-08-2000");
        profileFifteen.setCity("Mangaluru");
        profileFifteen.setIsProfileActive(true);
        profileFifteen.setMobileNumber("8532109876");
        boolean ref15 = amazon.createAmazonProfile(profileFifteen);
        System.out.println("Amazon Profile Created : " + ref15);
		
        AmazonProfile profileSixteen = new AmazonProfile();		
        profileSixteen.setCustomerId(16);
        profileSixteen.setCustomerName("Shilpa Verma");
        profileSixteen.setEmail("shilpa.verma@gmail.com");
        profileSixteen.setPassword("shilpa#1999");
        profileSixteen.setGender("Female");
        profileSixteen.setDateOfBirth("10-06-1999");
        profileSixteen.setCity("Agra");
        profileSixteen.setIsProfileActive(true);
        profileSixteen.setMobileNumber("8421098765");
        boolean ref16 = amazon.createAmazonProfile(profileSixteen);
        System.out.println("Amazon Profile Created : " + ref16);
		
        AmazonProfile profileSeventeen = new AmazonProfile();		
        profileSeventeen.setCustomerId(17);
        profileSeventeen.setCustomerName("Ravi Tiwari");
        profileSeventeen.setEmail("ravi.tiwari@gmail.com");
        profileSeventeen.setPassword("ravi@2003");
        profileSeventeen.setGender("Male");
        profileSeventeen.setDateOfBirth("21-02-2003");
        profileSeventeen.setCity("Varanasi");
        profileSeventeen.setIsProfileActive(true);
        profileSeventeen.setMobileNumber("8310987654");
        boolean ref17 = amazon.createAmazonProfile(profileSeventeen);
        System.out.println("Amazon Profile Created : " + ref17);
		
        AmazonProfile profileEighteen = new AmazonProfile();
        profileEighteen.setCustomerId(18);
        profileEighteen.setCustomerName("Hema Gowda");
        profileEighteen.setEmail("hema.gowda@gmail.com");
        profileEighteen.setPassword("hema#2001");
        profileEighteen.setGender("Female");
        profileEighteen.setDateOfBirth("02-11-2001");
        profileEighteen.setCity("Mysuru");
        profileEighteen.setIsProfileActive(true);
        profileEighteen.setMobileNumber("8209876543");
        boolean ref18 = amazon.createAmazonProfile(profileEighteen);
        System.out.println("Amazon Profile Created : " + ref18);
		
        AmazonProfile profileNineteen = new AmazonProfile();
        profileNineteen.setCustomerId(19);
        profileNineteen.setCustomerName("Navneet Pillai");
        profileNineteen.setEmail("navneet.pillai@gmail.com");
        profileNineteen.setPassword("navneet@1995");
        profileNineteen.setGender("Male");
        profileNineteen.setDateOfBirth("13-07-1995");
        profileNineteen.setCity("Thiruvananthapuram");
        profileNineteen.setIsProfileActive(true);
        profileNineteen.setMobileNumber("8109876543");
        boolean ref19 = amazon.createAmazonProfile(profileNineteen);
        System.out.println("Amazon Profile Created : " + ref19);

        amazon.getAmazonProfileDetails();
    }
}
