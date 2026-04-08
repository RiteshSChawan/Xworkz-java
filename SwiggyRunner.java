class SwiggyRunner {

    public static void main(String args[]) {
        Swiggy swiggy = new Swiggy();

        SwiggyProfile profileOne = new SwiggyProfile();
        profileOne.setUserId(1);
        profileOne.setUserName("Ujjwal Mehta");
        profileOne.setEmail("ujjwal.mehta@gmail.com");
        profileOne.setPassword("ujjwal@2002");
        profileOne.setGender("Male");
        profileOne.setDateOfBirth("18-04-2002");
        profileOne.setCity("Mumbai");
        profileOne.setIsProfileActive(true);
        profileOne.setFavoriteCuisine("North Indian");
        boolean ref1 = swiggy.createSwiggyProfile(profileOne);
        System.out.println("Swiggy Profile Created : " + ref1);
		
        SwiggyProfile profileTwo = new SwiggyProfile();
        profileTwo.setUserId(2);
        profileTwo.setUserName("Vasantha Sharma");
        profileTwo.setEmail("vasantha.sharma@gmail.com");
        profileTwo.setPassword("vasantha#2003");
        profileTwo.setGender("Female");
        profileTwo.setDateOfBirth("29-06-2003");
        profileTwo.setCity("Delhi");
        profileTwo.setIsProfileActive(true);
        profileTwo.setFavoriteCuisine("South Indian");
        boolean ref2 = swiggy.createSwiggyProfile(profileTwo);
        System.out.println("Swiggy Profile Created : " + ref2);
		
        SwiggyProfile profileThree = new SwiggyProfile();
        profileThree.setUserId(3);
        profileThree.setUserName("Wajid Nair");
        profileThree.setEmail("wajid.nair@gmail.com");
        profileThree.setPassword("wajid@2001");
        profileThree.setGender("Male");
        profileThree.setDateOfBirth("10-08-2001");
        profileThree.setCity("Kochi");
        profileThree.setIsProfileActive(true);
        profileThree.setFavoriteCuisine("Kerala");
        boolean ref3 = swiggy.createSwiggyProfile(profileThree);
        System.out.println("Swiggy Profile Created : " + ref3);
		
        SwiggyProfile profileFour = new SwiggyProfile();
        profileFour.setUserId(4);
        profileFour.setUserName("Xena Pillai");
        profileFour.setEmail("xena.pillai@gmail.com");
        profileFour.setPassword("xena#2004");
        profileFour.setGender("Female");
        profileFour.setDateOfBirth("21-10-2004");
        profileFour.setCity("Thiruvananthapuram");
        profileFour.setIsProfileActive(true);
        profileFour.setFavoriteCuisine("Chinese");
        boolean ref4 = swiggy.createSwiggyProfile(profileFour);
        System.out.println("Swiggy Profile Created : " + ref4);
		
        SwiggyProfile profileFive = new SwiggyProfile();
        profileFive.setUserId(5);
        profileFive.setUserName("Yashwant Patil");
        profileFive.setEmail("yashwant.patil@gmail.com");
        profileFive.setPassword("yash@1999");
        profileFive.setGender("Male");
        profileFive.setDateOfBirth("02-12-1999");
        profileFive.setCity("Kolhapur");
        profileFive.setIsProfileActive(true);
        profileFive.setFavoriteCuisine("Maharashtrian");
        boolean ref5 = swiggy.createSwiggyProfile(profileFive);
        System.out.println("Swiggy Profile Created : " + ref5);
		
        SwiggyProfile profileSix = new SwiggyProfile();
        profileSix.setUserId(6);
        profileSix.setUserName("Zara Iyer");
        profileSix.setEmail("zara.iyer@gmail.com");
        profileSix.setPassword("zara#2000");
        profileSix.setGender("Female");
        profileSix.setDateOfBirth("13-02-2000");
        profileSix.setCity("Chennai");
        profileSix.setIsProfileActive(true);
        profileSix.setFavoriteCuisine("Tamil");
        boolean ref6 = swiggy.createSwiggyProfile(profileSix);
        System.out.println("Swiggy Profile Created : " + ref6);
		
        SwiggyProfile profileSeven = new SwiggyProfile();
        profileSeven.setUserId(7);
        profileSeven.setUserName("Abhiram Reddy");
        profileSeven.setEmail("abhiram.reddy@gmail.com");
        profileSeven.setPassword("abhiram@2003");
        profileSeven.setGender("Male");
        profileSeven.setDateOfBirth("24-04-2003");
        profileSeven.setCity("Hyderabad");
        profileSeven.setIsProfileActive(true);
        profileSeven.setFavoriteCuisine("Hyderabadi");
        boolean ref7 = swiggy.createSwiggyProfile(profileSeven);
        System.out.println("Swiggy Profile Created : " + ref7);
		
        SwiggyProfile profileEight = new SwiggyProfile();
        profileEight.setUserId(8);
        profileEight.setUserName("Bhagya Menon");
        profileEight.setEmail("bhagya.menon@gmail.com");
        profileEight.setPassword("bhagya#2005");
        profileEight.setGender("Female");
        profileEight.setDateOfBirth("05-06-2005");
        profileEight.setCity("Thrissur");
        profileEight.setIsProfileActive(true);
        profileEight.setFavoriteCuisine("Italian");
        boolean ref8 = swiggy.createSwiggyProfile(profileEight);
        System.out.println("Swiggy Profile Created : " + ref8);
		
        SwiggyProfile profileNine = new SwiggyProfile();
        profileNine.setUserId(9);
        profileNine.setUserName("Chandan Hegde");
        profileNine.setEmail("chandan.hegde@gmail.com");
        profileNine.setPassword("chandan@1998");
        profileNine.setGender("Male");
        profileNine.setDateOfBirth("16-08-1998");
        profileNine.setCity("Mangaluru");
        profileNine.setIsProfileActive(true);
        profileNine.setFavoriteCuisine("Continental");
        boolean ref9 = swiggy.createSwiggyProfile(profileNine);
        System.out.println("Swiggy Profile Created : " + ref9);
		
        SwiggyProfile profileTen = new SwiggyProfile();
        profileTen.setUserId(10);
        profileTen.setUserName("Devi Gowda");
        profileTen.setEmail("devi.gowda@gmail.com");
        profileTen.setPassword("devi#2002");
        profileTen.setGender("Female");
        profileTen.setDateOfBirth("27-10-2002");
        profileTen.setCity("Mysuru");
        profileTen.setIsProfileActive(true);
        profileTen.setFavoriteCuisine("North Indian");
        boolean ref10 = swiggy.createSwiggyProfile(profileTen);
        System.out.println("Swiggy Profile Created : " + ref10);
		
        SwiggyProfile profileEleven = new SwiggyProfile();
        profileEleven.setUserId(11);
        profileEleven.setUserName("Eknath Rao");
        profileEleven.setEmail("eknath.rao@gmail.com");
        profileEleven.setPassword("eknath@2001");
        profileEleven.setGender("Male");
        profileEleven.setDateOfBirth("08-12-2001");
        profileEleven.setCity("Vijayawada");
        profileEleven.setIsProfileActive(true);
        profileEleven.setFavoriteCuisine("Andhra");
        boolean ref11 = swiggy.createSwiggyProfile(profileEleven);
        System.out.println("Swiggy Profile Created : " + ref11);
		
        SwiggyProfile profileTwelve = new SwiggyProfile();
        profileTwelve.setUserId(12);
        profileTwelve.setUserName("Falguni Verma");
        profileTwelve.setEmail("falguni.verma@gmail.com");
        profileTwelve.setPassword("falguni#1997");
        profileTwelve.setGender("Female");
        profileTwelve.setDateOfBirth("19-02-1997");
        profileTwelve.setCity("Jaipur");
        profileTwelve.setIsProfileActive(true);
        profileTwelve.setFavoriteCuisine("Rajasthani");
        boolean ref12 = swiggy.createSwiggyProfile(profileTwelve);
        System.out.println("Swiggy Profile Created : " + ref12);
		
        SwiggyProfile profileThirteen = new SwiggyProfile();
        profileThirteen.setUserId(13);
        profileThirteen.setUserName("Govind Tiwari");
        profileThirteen.setEmail("govind.tiwari@gmail.com");
        profileThirteen.setPassword("govind@1996");
        profileThirteen.setGender("Male");
        profileThirteen.setDateOfBirth("02-04-1996");
        profileThirteen.setCity("Varanasi");
        profileThirteen.setIsProfileActive(true);
        profileThirteen.setFavoriteCuisine("Street Food");
        boolean ref13 = swiggy.createSwiggyProfile(profileThirteen);
        System.out.println("Swiggy Profile Created : " + ref13);
		
        SwiggyProfile profileFourteen = new SwiggyProfile();
        profileFourteen.setUserId(14);
        profileFourteen.setUserName("Hamsa Desai");
        profileFourteen.setEmail("hamsa.desai@gmail.com");
        profileFourteen.setPassword("hamsa#2004");
        profileFourteen.setGender("Female");
        profileFourteen.setDateOfBirth("13-06-2004");
        profileFourteen.setCity("Ahmedabad");
        profileFourteen.setIsProfileActive(true);
        profileFourteen.setFavoriteCuisine("Gujarati");
        boolean ref14 = swiggy.createSwiggyProfile(profileFourteen);
        System.out.println("Swiggy Profile Created : " + ref14);
		
        SwiggyProfile profileFifteen = new SwiggyProfile();
        profileFifteen.setUserId(15);
        profileFifteen.setUserName("Indrajit Shetty");
        profileFifteen.setEmail("indrajit.shetty@gmail.com");
        profileFifteen.setPassword("indrajit@2000");
        profileFifteen.setGender("Male");
        profileFifteen.setDateOfBirth("24-08-2000");
        profileFifteen.setCity("Udupi");
        profileFifteen.setIsProfileActive(true);
        profileFifteen.setFavoriteCuisine("Udupi Cuisine");
        boolean ref15 = swiggy.createSwiggyProfile(profileFifteen);
        System.out.println("Swiggy Profile Created : " + ref15);
		
        SwiggyProfile profileSixteen = new SwiggyProfile();
        profileSixteen.setUserId(16);
        profileSixteen.setUserName("Jayanti Gupta");
        profileSixteen.setEmail("jayanti.gupta@gmail.com");
        profileSixteen.setPassword("jayanti#1999");
        profileSixteen.setGender("Female");
        profileSixteen.setDateOfBirth("05-10-1999");
        profileSixteen.setCity("Lucknow");
        profileSixteen.setIsProfileActive(true);
        profileSixteen.setFavoriteCuisine("Awadhi");
        boolean ref16 = swiggy.createSwiggyProfile(profileSixteen);
        System.out.println("Swiggy Profile Created : " + ref16);
		
        SwiggyProfile profileSeventeen = new SwiggyProfile();
        profileSeventeen.setUserId(17);
        profileSeventeen.setUserName("Kartik Bhat");
        profileSeventeen.setEmail("kartik.bhat@gmail.com");
        profileSeventeen.setPassword("kartik@2003");
        profileSeventeen.setGender("Male");
        profileSeventeen.setDateOfBirth("16-12-2003");
        profileSeventeen.setCity("Hubli");
        profileSeventeen.setIsProfileActive(true);
        profileSeventeen.setFavoriteCuisine("North Indian");
        boolean ref17 = swiggy.createSwiggyProfile(profileSeventeen);
        System.out.println("Swiggy Profile Created : " + ref17);
		
        SwiggyProfile profileEighteen = new SwiggyProfile();
        profileEighteen.setUserId(18);
        profileEighteen.setUserName("Leelavathi Krishnan");
        profileEighteen.setEmail("leelavathi.krishnan@gmail.com");
        profileEighteen.setPassword("leela#2001");
        profileEighteen.setGender("Female");
        profileEighteen.setDateOfBirth("27-02-2001");
        profileEighteen.setCity("Coimbatore");
        profileEighteen.setIsProfileActive(true);
        profileEighteen.setFavoriteCuisine("South Indian");
        boolean ref18 = swiggy.createSwiggyProfile(profileEighteen);
        System.out.println("Swiggy Profile Created : " + ref18);
		
        SwiggyProfile profileNineteen = new SwiggyProfile();
        profileNineteen.setUserId(19);
        profileNineteen.setUserName("Mithun Sharma");
        profileNineteen.setEmail("mithun.sharma@gmail.com");
        profileNineteen.setPassword("mithun@1993");
        profileNineteen.setGender("Male");
        profileNineteen.setDateOfBirth("10-04-1993");
        profileNineteen.setCity("Bengaluru");
        profileNineteen.setIsProfileActive(true);
        profileNineteen.setFavoriteCuisine("Chinese");
        boolean ref19 = swiggy.createSwiggyProfile(profileNineteen);
        System.out.println("Swiggy Profile Created : " + ref19);

        swiggy.getSwiggyProfileDetails();
    }
}
