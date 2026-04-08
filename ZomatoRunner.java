class ZomatoRunner {

    public static void main(String args[]) {
        Zomato zomato = new Zomato();

        ZomatoProfile profileOne = new ZomatoProfile();
        profileOne.setUserId(1);
        profileOne.setUserName("Abhishek Mishra");
        profileOne.setEmail("abhishek.mishra@gmail.com");
        profileOne.setPassword("abhi@2002");
        profileOne.setGender("Male");
        profileOne.setDateOfBirth("09-04-2002");
        profileOne.setCity("Bhopal");
        profileOne.setIsProfileActive(true);
        profileOne.setDeliveryAddress("45 MP Nagar, Bhopal");
        boolean ref1 = zomato.createZomatoProfile(profileOne);
        System.out.println("Zomato Profile Created : " + ref1);
		
        ZomatoProfile profileTwo = new ZomatoProfile();
        profileTwo.setUserId(2);
        profileTwo.setUserName("Sonia Patel");
        profileTwo.setEmail("sonia.patel@gmail.com");
        profileTwo.setPassword("sonia#2003");
        profileTwo.setGender("Female");
        profileTwo.setDateOfBirth("20-06-2003");
        profileTwo.setCity("Surat");
        profileTwo.setIsProfileActive(true);
        profileTwo.setDeliveryAddress("12 Adajan, Surat");
        boolean ref2 = zomato.createZomatoProfile(profileTwo);
        System.out.println("Zomato Profile Created : " + ref2);
		
        ZomatoProfile profileThree = new ZomatoProfile();
        profileThree.setUserId(3);
        profileThree.setUserName("Kiran Reddy");
        profileThree.setEmail("kiran.reddy@gmail.com");
        profileThree.setPassword("kiran@2001");
        profileThree.setGender("Male");
        profileThree.setDateOfBirth("01-08-2001");
        profileThree.setCity("Hyderabad");
        profileThree.setIsProfileActive(true);
        profileThree.setDeliveryAddress("67 Jubilee Hills, Hyderabad");
        boolean ref3 = zomato.createZomatoProfile(profileThree);
        System.out.println("Zomato Profile Created : " + ref3);
		
        ZomatoProfile profileFour = new ZomatoProfile();
        profileFour.setUserId(4);
        profileFour.setUserName("Lalitha Iyer");
        profileFour.setEmail("lalitha.iyer@gmail.com");
        profileFour.setPassword("lalitha#2004");
        profileFour.setGender("Female");
        profileFour.setDateOfBirth("12-10-2004");
        profileFour.setCity("Chennai");
        profileFour.setIsProfileActive(true);
        profileFour.setDeliveryAddress("34 T Nagar, Chennai");
        boolean ref4 = zomato.createZomatoProfile(profileFour);
        System.out.println("Zomato Profile Created : " + ref4);
		
        ZomatoProfile profileFive = new ZomatoProfile();
        profileFive.setUserId(5);
        profileFive.setUserName("Shyam Kulkarni");
        profileFive.setEmail("shyam.kulkarni@gmail.com");
        profileFive.setPassword("shyam@1999");
        profileFive.setGender("Male");
        profileFive.setDateOfBirth("23-12-1999");
        profileFive.setCity("Pune");
        profileFive.setIsProfileActive(true);
        profileFive.setDeliveryAddress("89 Deccan, Pune");
        boolean ref5 = zomato.createZomatoProfile(profileFive);
        System.out.println("Zomato Profile Created : " + ref5);
		
        ZomatoProfile profileSix = new ZomatoProfile();
        profileSix.setUserId(6);
        profileSix.setUserName("Usha Krishnan");
        profileSix.setEmail("usha.krishnan@gmail.com");
        profileSix.setPassword("usha#2000");
        profileSix.setGender("Female");
        profileSix.setDateOfBirth("05-02-2000");
        profileSix.setCity("Bengaluru");
        profileSix.setIsProfileActive(true);
        profileSix.setDeliveryAddress("56 Indiranagar, Bengaluru");
        boolean ref6 = zomato.createZomatoProfile(profileSix);
        System.out.println("Zomato Profile Created : " + ref6);
		
        ZomatoProfile profileSeven = new ZomatoProfile();
        profileSeven.setUserId(7);
        profileSeven.setUserName("Tarun Bhat");
        profileSeven.setEmail("tarun.bhat@gmail.com");
        profileSeven.setPassword("tarun@2003");
        profileSeven.setGender("Male");
        profileSeven.setDateOfBirth("16-04-2003");
        profileSeven.setCity("Mangaluru");
        profileSeven.setIsProfileActive(true);
        profileSeven.setDeliveryAddress("23 Kadri, Mangaluru");
        boolean ref7 = zomato.createZomatoProfile(profileSeven);
        System.out.println("Zomato Profile Created : " + ref7);
		
        ZomatoProfile profileEight = new ZomatoProfile();
        profileEight.setUserId(8);
        profileEight.setUserName("Sindhu Nair");
        profileEight.setEmail("sindhu.nair@gmail.com");
        profileEight.setPassword("sindhu#2005");
        profileEight.setGender("Female");
        profileEight.setDateOfBirth("27-06-2005");
        profileEight.setCity("Kochi");
        profileEight.setIsProfileActive(true);
        profileEight.setDeliveryAddress("10 Kaloor, Kochi");
        boolean ref8 = zomato.createZomatoProfile(profileEight);
        System.out.println("Zomato Profile Created : " + ref8);
		
        ZomatoProfile profileNine = new ZomatoProfile();
        profileNine.setUserId(9);
        profileNine.setUserName("Pavan Sharma");
        profileNine.setEmail("pavan.sharma@gmail.com");
        profileNine.setPassword("pavan@1998");
        profileNine.setGender("Male");
        profileNine.setDateOfBirth("08-08-1998");
        profileNine.setCity("Jaipur");
        profileNine.setIsProfileActive(true);
        profileNine.setDeliveryAddress("78 Pink City, Jaipur");
        boolean ref9 = zomato.createZomatoProfile(profileNine);
        System.out.println("Zomato Profile Created : " + ref9);
		
        ZomatoProfile profileTen = new ZomatoProfile();
        profileTen.setUserId(10);
        profileTen.setUserName("Chitra Menon");
        profileTen.setEmail("chitra.menon@gmail.com");
        profileTen.setPassword("chitra#2002");
        profileTen.setGender("Female");
        profileTen.setDateOfBirth("19-10-2002");
        profileTen.setCity("Thrissur");
        profileTen.setIsProfileActive(true);
        profileTen.setDeliveryAddress("45 Round South, Thrissur");
        boolean ref10 = zomato.createZomatoProfile(profileTen);
        System.out.println("Zomato Profile Created : " + ref10);
		
        ZomatoProfile profileEleven = new ZomatoProfile();
        profileEleven.setUserId(11);
        profileEleven.setUserName("Deepak Gupta");
        profileEleven.setEmail("deepak.gupta@gmail.com");
        profileEleven.setPassword("deepak@2001");
        profileEleven.setGender("Male");
        profileEleven.setDateOfBirth("30-12-2001");
        profileEleven.setCity("Delhi");
        profileEleven.setIsProfileActive(true);
        profileEleven.setDeliveryAddress("90 Karol Bagh, Delhi");
        boolean ref11 = zomato.createZomatoProfile(profileEleven);
        System.out.println("Zomato Profile Created : " + ref11);
		
        ZomatoProfile profileTwelve = new ZomatoProfile();
        profileTwelve.setUserId(12);
        profileTwelve.setUserName("Mamatha Rao");
        profileTwelve.setEmail("mamatha.rao@gmail.com");
        profileTwelve.setPassword("mamatha#1997");
        profileTwelve.setGender("Female");
        profileTwelve.setDateOfBirth("11-02-1997");
        profileTwelve.setCity("Bengaluru");
        profileTwelve.setIsProfileActive(true);
        profileTwelve.setDeliveryAddress("33 Koramangala, Bengaluru");
        boolean ref12 = zomato.createZomatoProfile(profileTwelve);
        System.out.println("Zomato Profile Created : " + ref12);
		
        ZomatoProfile profileThirteen = new ZomatoProfile();
        profileThirteen.setUserId(13);
        profileThirteen.setUserName("Vinod Pillai");
        profileThirteen.setEmail("vinod.pillai@gmail.com");
        profileThirteen.setPassword("vinod@1996");
        profileThirteen.setGender("Male");
        profileThirteen.setDateOfBirth("22-04-1996");
        profileThirteen.setCity("Thiruvananthapuram");
        profileThirteen.setIsProfileActive(true);
        profileThirteen.setDeliveryAddress("67 Pattom, Thiruvananthapuram");
        boolean ref13 = zomato.createZomatoProfile(profileThirteen);
        System.out.println("Zomato Profile Created : " + ref13);
		
        ZomatoProfile profileFourteen = new ZomatoProfile();
        profileFourteen.setUserId(14);
        profileFourteen.setUserName("Asha Desai");
        profileFourteen.setEmail("asha.desai@gmail.com");
        profileFourteen.setPassword("asha#2004");
        profileFourteen.setGender("Female");
        profileFourteen.setDateOfBirth("03-06-2004");
        profileFourteen.setCity("Ahmedabad");
        profileFourteen.setIsProfileActive(true);
        profileFourteen.setDeliveryAddress("12 Satellite, Ahmedabad");
        boolean ref14 = zomato.createZomatoProfile(profileFourteen);
        System.out.println("Zomato Profile Created : " + ref14);
		
        ZomatoProfile profileFifteen = new ZomatoProfile();
        profileFifteen.setUserId(15);
        profileFifteen.setUserName("Ramesh Tiwari");
        profileFifteen.setEmail("ramesh.tiwari@gmail.com");
        profileFifteen.setPassword("ramesh@2000");
        profileFifteen.setGender("Male");
        profileFifteen.setDateOfBirth("14-08-2000");
        profileFifteen.setCity("Varanasi");
        profileFifteen.setIsProfileActive(true);
        profileFifteen.setDeliveryAddress("56 Lanka, Varanasi");
        boolean ref15 = zomato.createZomatoProfile(profileFifteen);
        System.out.println("Zomato Profile Created : " + ref15);
		
        ZomatoProfile profileSixteen = new ZomatoProfile();
        profileSixteen.setUserId(16);
        profileSixteen.setUserName("Neethu Gowda");
        profileSixteen.setEmail("neethu.gowda@gmail.com");
        profileSixteen.setPassword("neethu#1999");
        profileSixteen.setGender("Female");
        profileSixteen.setDateOfBirth("25-10-1999");
        profileSixteen.setCity("Mysuru");
        profileSixteen.setIsProfileActive(true);
        profileSixteen.setDeliveryAddress("89 Saraswathipuram, Mysuru");
        boolean ref16 = zomato.createZomatoProfile(profileSixteen);
        System.out.println("Zomato Profile Created : " + ref16);
		
        ZomatoProfile profileSeventeen = new ZomatoProfile();
        profileSeventeen.setUserId(17);
        profileSeventeen.setUserName("Ganesh Verma");
        profileSeventeen.setEmail("ganesh.verma@gmail.com");
        profileSeventeen.setPassword("ganesh@2003");
        profileSeventeen.setGender("Male");
        profileSeventeen.setDateOfBirth("06-12-2003");
        profileSeventeen.setCity("Lucknow");
        profileSeventeen.setIsProfileActive(true);
        profileSeventeen.setDeliveryAddress("23 Hazratganj, Lucknow");
        boolean ref17 = zomato.createZomatoProfile(profileSeventeen);
        System.out.println("Zomato Profile Created : " + ref17);
		
        ZomatoProfile profileEighteen = new ZomatoProfile();
        profileEighteen.setUserId(18);
        profileEighteen.setUserName("Padma Hegde");
        profileEighteen.setEmail("padma.hegde@gmail.com");
        profileEighteen.setPassword("padma#2001");
        profileEighteen.setGender("Female");
        profileEighteen.setDateOfBirth("17-02-2001");
        profileEighteen.setCity("Hubli");
        profileEighteen.setIsProfileActive(true);
        profileEighteen.setDeliveryAddress("45 Vidyanagar, Hubli");
        boolean ref18 = zomato.createZomatoProfile(profileEighteen);
        System.out.println("Zomato Profile Created : " + ref18);
		
        ZomatoProfile profileNineteen = new ZomatoProfile();
        profileNineteen.setUserId(19);
        profileNineteen.setUserName("Suresh Shetty");
        profileNineteen.setEmail("suresh.shetty@gmail.com");
        profileNineteen.setPassword("suresh@1995");
        profileNineteen.setGender("Male");
        profileNineteen.setDateOfBirth("28-04-1995");
        profileNineteen.setCity("Udupi");
        profileNineteen.setIsProfileActive(true);
        profileNineteen.setDeliveryAddress("78 Manipal Road, Udupi");
        boolean ref19 = zomato.createZomatoProfile(profileNineteen);
        System.out.println("Zomato Profile Created : " + ref19);

        zomato.getZomatoProfileDetails();
    }
}
