class FlipkartRunner {

    public static void main(String args[]) {
        Flipkart flipkart = new Flipkart();

        FlipkartProfile profileOne = new FlipkartProfile();
        profileOne.setCustomerId(1);
        profileOne.setCustomerName("Balaji Kumar");
        profileOne.setEmail("balaji.kumar@gmail.com");
        profileOne.setPassword("balaji@2002");
        profileOne.setGender("Male");
        profileOne.setDateOfBirth("08-02-2002");
        profileOne.setCity("Bengaluru");
        profileOne.setIsProfileActive(true);
        profileOne.setPincode("560001");
        boolean ref1 = flipkart.createFlipkartProfile(profileOne);
        System.out.println("Flipkart Profile Created : " + ref1);
		
        FlipkartProfile profileTwo = new FlipkartProfile();
        profileTwo.setCustomerId(2);
        profileTwo.setCustomerName("Rani Sharma");
        profileTwo.setEmail("rani.sharma@gmail.com");
        profileTwo.setPassword("rani#2003");
        profileTwo.setGender("Female");
        profileTwo.setDateOfBirth("19-04-2003");
        profileTwo.setCity("Delhi");
        profileTwo.setIsProfileActive(true);
        profileTwo.setPincode("110001");
        boolean ref2 = flipkart.createFlipkartProfile(profileTwo);
        System.out.println("Flipkart Profile Created : " + ref2);
		
        FlipkartProfile profileThree = new FlipkartProfile();
        profileThree.setCustomerId(3);
        profileThree.setCustomerName("Ganpat Nair");
        profileThree.setEmail("ganpat.nair@gmail.com");
        profileThree.setPassword("ganpat@2001");
        profileThree.setGender("Male");
        profileThree.setDateOfBirth("30-06-2001");
        profileThree.setCity("Kochi");
        profileThree.setIsProfileActive(true);
        profileThree.setPincode("682001");
        boolean ref3 = flipkart.createFlipkartProfile(profileThree);
        System.out.println("Flipkart Profile Created : " + ref3);
		
        FlipkartProfile profileFour = new FlipkartProfile();
        profileFour.setCustomerId(4);
        profileFour.setCustomerName("Shobha Menon");
        profileFour.setEmail("shobha.menon@gmail.com");
        profileFour.setPassword("shobha#2004");
        profileFour.setGender("Female");
        profileFour.setDateOfBirth("11-08-2004");
        profileFour.setCity("Thrissur");
        profileFour.setIsProfileActive(true);
        profileFour.setPincode("680001");
        boolean ref4 = flipkart.createFlipkartProfile(profileFour);
        System.out.println("Flipkart Profile Created : " + ref4);
		
        FlipkartProfile profileFive = new FlipkartProfile();
        profileFive.setCustomerId(5);
        profileFive.setCustomerName("Ajay Patil");
        profileFive.setEmail("ajay.patil@gmail.com");
        profileFive.setPassword("ajay@1999");
        profileFive.setGender("Male");
        profileFive.setDateOfBirth("22-10-1999");
        profileFive.setCity("Pune");
        profileFive.setIsProfileActive(true);
        profileFive.setPincode("411001");
        boolean ref5 = flipkart.createFlipkartProfile(profileFive);
        System.out.println("Flipkart Profile Created : " + ref5);
		
        FlipkartProfile profileSix = new FlipkartProfile();
        profileSix.setCustomerId(6);
        profileSix.setCustomerName("Sridevi Iyer");
        profileSix.setEmail("sridevi.iyer@gmail.com");
        profileSix.setPassword("sridevi#2000");
        profileSix.setGender("Female");
        profileSix.setDateOfBirth("04-12-2000");
        profileSix.setCity("Chennai");
        profileSix.setIsProfileActive(true);
        profileSix.setPincode("600001");
        boolean ref6 = flipkart.createFlipkartProfile(profileSix);
        System.out.println("Flipkart Profile Created : " + ref6);
		
        FlipkartProfile profileSeven = new FlipkartProfile();
        profileSeven.setCustomerId(7);
        profileSeven.setCustomerName("Prabhu Reddy");
        profileSeven.setEmail("prabhu.reddy@gmail.com");
        profileSeven.setPassword("prabhu@2003");
        profileSeven.setGender("Male");
        profileSeven.setDateOfBirth("15-02-2003");
        profileSeven.setCity("Hyderabad");
        profileSeven.setIsProfileActive(true);
        profileSeven.setPincode("500001");
        boolean ref7 = flipkart.createFlipkartProfile(profileSeven);
        System.out.println("Flipkart Profile Created : " + ref7);
		
        FlipkartProfile profileEight = new FlipkartProfile();
        profileEight.setCustomerId(8);
        profileEight.setCustomerName("Ambika Pillai");
        profileEight.setEmail("ambika.pillai@gmail.com");
        profileEight.setPassword("ambika#2005");
        profileEight.setGender("Female");
        profileEight.setDateOfBirth("26-04-2005");
        profileEight.setCity("Thiruvananthapuram");
        profileEight.setIsProfileActive(true);
        profileEight.setPincode("695001");
        boolean ref8 = flipkart.createFlipkartProfile(profileEight);
        System.out.println("Flipkart Profile Created : " + ref8);
		
        FlipkartProfile profileNine = new FlipkartProfile();
        profileNine.setCustomerId(9);
        profileNine.setCustomerName("Ranga Hegde");
        profileNine.setEmail("ranga.hegde@gmail.com");
        profileNine.setPassword("ranga@1998");
        profileNine.setGender("Male");
        profileNine.setDateOfBirth("07-06-1998");
        profileNine.setCity("Mangaluru");
        profileNine.setIsProfileActive(true);
        profileNine.setPincode("575001");
        boolean ref9 = flipkart.createFlipkartProfile(profileNine);
        System.out.println("Flipkart Profile Created : " + ref9);
		
        FlipkartProfile profileTen = new FlipkartProfile();
        profileTen.setCustomerId(10);
        profileTen.setCustomerName("Sumana Gowda");
        profileTen.setEmail("sumana.gowda@gmail.com");
        profileTen.setPassword("sumana#2002");
        profileTen.setGender("Female");
        profileTen.setDateOfBirth("18-08-2002");
        profileTen.setCity("Mysuru");
        profileTen.setIsProfileActive(true);
        profileTen.setPincode("570001");
        boolean ref10 = flipkart.createFlipkartProfile(profileTen);
        System.out.println("Flipkart Profile Created : " + ref10);
		
        FlipkartProfile profileEleven = new FlipkartProfile();
        profileEleven.setCustomerId(11);
        profileEleven.setCustomerName("Madhu Rao");
        profileEleven.setEmail("madhu.rao@gmail.com");
        profileEleven.setPassword("madhu@2001");
        profileEleven.setGender("Male");
        profileEleven.setDateOfBirth("29-10-2001");
        profileEleven.setCity("Vijayawada");
        profileEleven.setIsProfileActive(true);
        profileEleven.setPincode("520001");
        boolean ref11 = flipkart.createFlipkartProfile(profileEleven);
        System.out.println("Flipkart Profile Created : " + ref11);
		
        FlipkartProfile profileTwelve = new FlipkartProfile();
        profileTwelve.setCustomerId(12);
        profileTwelve.setCustomerName("Jyothi Verma");
        profileTwelve.setEmail("jyothi.verma@gmail.com");
        profileTwelve.setPassword("jyothi#1997");
        profileTwelve.setGender("Female");
        profileTwelve.setDateOfBirth("10-12-1997");
        profileTwelve.setCity("Jaipur");
        profileTwelve.setIsProfileActive(true);
        profileTwelve.setPincode("302001");
        boolean ref12 = flipkart.createFlipkartProfile(profileTwelve);
        System.out.println("Flipkart Profile Created : " + ref12);
		
        FlipkartProfile profileThirteen = new FlipkartProfile();
        profileThirteen.setCustomerId(13);
        profileThirteen.setCustomerName("Shankar Tiwari");
        profileThirteen.setEmail("shankar.tiwari@gmail.com");
        profileThirteen.setPassword("shankar@1996");
        profileThirteen.setGender("Male");
        profileThirteen.setDateOfBirth("21-02-1996");
        profileThirteen.setCity("Varanasi");
        profileThirteen.setIsProfileActive(true);
        profileThirteen.setPincode("221001");
        boolean ref13 = flipkart.createFlipkartProfile(profileThirteen);
        System.out.println("Flipkart Profile Created : " + ref13);
		
        FlipkartProfile profileFourteen = new FlipkartProfile();
        profileFourteen.setCustomerId(14);
        profileFourteen.setCustomerName("Parvathi Desai");
        profileFourteen.setEmail("parvathi.desai@gmail.com");
        profileFourteen.setPassword("parvathi#2004");
        profileFourteen.setGender("Female");
        profileFourteen.setDateOfBirth("04-04-2004");
        profileFourteen.setCity("Ahmedabad");
        profileFourteen.setIsProfileActive(true);
        profileFourteen.setPincode("380001");
        boolean ref14 = flipkart.createFlipkartProfile(profileFourteen);
        System.out.println("Flipkart Profile Created : " + ref14);
		
        FlipkartProfile profileFifteen = new FlipkartProfile();
        profileFifteen.setCustomerId(15);
        profileFifteen.setCustomerName("Venkat Shetty");
        profileFifteen.setEmail("venkat.shetty@gmail.com");
        profileFifteen.setPassword("venkat@2000");
        profileFifteen.setGender("Male");
        profileFifteen.setDateOfBirth("15-06-2000");
        profileFifteen.setCity("Udupi");
        profileFifteen.setIsProfileActive(true);
        profileFifteen.setPincode("576101");
        boolean ref15 = flipkart.createFlipkartProfile(profileFifteen);
        System.out.println("Flipkart Profile Created : " + ref15);
		
        FlipkartProfile profileSixteen = new FlipkartProfile();
        profileSixteen.setCustomerId(16);
        profileSixteen.setCustomerName("Kamala Gupta");
        profileSixteen.setEmail("kamala.gupta@gmail.com");
        profileSixteen.setPassword("kamala#1999");
        profileSixteen.setGender("Female");
        profileSixteen.setDateOfBirth("26-08-1999");
        profileSixteen.setCity("Lucknow");
        profileSixteen.setIsProfileActive(true);
        profileSixteen.setPincode("226001");
        boolean ref16 = flipkart.createFlipkartProfile(profileSixteen);
        System.out.println("Flipkart Profile Created : " + ref16);
		
        FlipkartProfile profileSeventeen = new FlipkartProfile();
        profileSeventeen.setCustomerId(17);
        profileSeventeen.setCustomerName("Ramesh Bhat");
        profileSeventeen.setEmail("ramesh.bhat@gmail.com");
        profileSeventeen.setPassword("ramesh@2003");
        profileSeventeen.setGender("Male");
        profileSeventeen.setDateOfBirth("07-10-2003");
        profileSeventeen.setCity("Hubli");
        profileSeventeen.setIsProfileActive(true);
        profileSeventeen.setPincode("580001");
        boolean ref17 = flipkart.createFlipkartProfile(profileSeventeen);
        System.out.println("Flipkart Profile Created : " + ref17);
		
        FlipkartProfile profileEighteen = new FlipkartProfile();
        profileEighteen.setCustomerId(18);
        profileEighteen.setCustomerName("Savitha Krishnan");
        profileEighteen.setEmail("savitha.krishnan@gmail.com");
        profileEighteen.setPassword("savitha#2001");
        profileEighteen.setGender("Female");
        profileEighteen.setDateOfBirth("18-12-2001");
        profileEighteen.setCity("Coimbatore");
        profileEighteen.setIsProfileActive(true);
        profileEighteen.setPincode("641001");
        boolean ref18 = flipkart.createFlipkartProfile(profileEighteen);
        System.out.println("Flipkart Profile Created : " + ref18);
		
        FlipkartProfile profileNineteen = new FlipkartProfile();
        profileNineteen.setCustomerId(19);
        profileNineteen.setCustomerName("Harsha Sharma");
        profileNineteen.setEmail("harsha.sharma@gmail.com");
        profileNineteen.setPassword("harsha@1994");
        profileNineteen.setGender("Male");
        profileNineteen.setDateOfBirth("01-02-1994");
        profileNineteen.setCity("Mumbai");
        profileNineteen.setIsProfileActive(true);
        profileNineteen.setPincode("400001");
        boolean ref19 = flipkart.createFlipkartProfile(profileNineteen);
        System.out.println("Flipkart Profile Created : " + ref19);

        flipkart.getFlipkartProfileDetails();
    }
}
