class MakeMyTripRunner {

    public static void main(String args[]) {
        MakeMyTrip makeMyTrip = new MakeMyTrip();

        MakeMyTripProfile profileOne = new MakeMyTripProfile();
        profileOne.setTravelerId(1);
        profileOne.setTravelerName("Akshay Kumar");
        profileOne.setEmail("akshay.kumar@gmail.com");
        profileOne.setPassword("akshay@2002");
        profileOne.setGender("Male");
        profileOne.setDateOfBirth("10-02-2002");
        profileOne.setCity("Mumbai");
        profileOne.setIsProfileActive(true);
        profileOne.setPreferredDestination("Goa");
        boolean ref1 = makeMyTrip.createMakeMyTripProfile(profileOne);
        System.out.println("MakeMyTrip Profile Created : " + ref1);
		
        MakeMyTripProfile profileTwo = new MakeMyTripProfile();
        profileTwo.setTravelerId(2);
        profileTwo.setTravelerName("Priyanka Sharma");
        profileTwo.setEmail("priyanka.sharma@gmail.com");
        profileTwo.setPassword("priya#2003");
        profileTwo.setGender("Female");
        profileTwo.setDateOfBirth("21-04-2003");
        profileTwo.setCity("Delhi");
        profileTwo.setIsProfileActive(true);
        profileTwo.setPreferredDestination("Manali");
        boolean ref2 = makeMyTrip.createMakeMyTripProfile(profileTwo);
        System.out.println("MakeMyTrip Profile Created : " + ref2);
		
        MakeMyTripProfile profileThree = new MakeMyTripProfile();
        profileThree.setTravelerId(3);
        profileThree.setTravelerName("Suraj Nair");
        profileThree.setEmail("suraj.nair@gmail.com");
        profileThree.setPassword("suraj@2001");
        profileThree.setGender("Male");
        profileThree.setDateOfBirth("02-06-2001");
        profileThree.setCity("Kochi");
        profileThree.setIsProfileActive(true);
        profileThree.setPreferredDestination("Ooty");
        boolean ref3 = makeMyTrip.createMakeMyTripProfile(profileThree);
        System.out.println("MakeMyTrip Profile Created : " + ref3);
		
        MakeMyTripProfile profileFour = new MakeMyTripProfile();
        profileFour.setTravelerId(4);
        profileFour.setTravelerName("Anitha Menon");
        profileFour.setEmail("anitha.menon@gmail.com");
        profileFour.setPassword("anitha#2004");
        profileFour.setGender("Female");
        profileFour.setDateOfBirth("13-08-2004");
        profileFour.setCity("Thrissur");
        profileFour.setIsProfileActive(true);
        profileFour.setPreferredDestination("Munnar");
        boolean ref4 = makeMyTrip.createMakeMyTripProfile(profileFour);
        System.out.println("MakeMyTrip Profile Created : " + ref4);
		
        MakeMyTripProfile profileFive = new MakeMyTripProfile();
        profileFive.setTravelerId(5);
        profileFive.setTravelerName("Ranjit Patil");
        profileFive.setEmail("ranjit.patil@gmail.com");
        profileFive.setPassword("ranjit@1999");
        profileFive.setGender("Male");
        profileFive.setDateOfBirth("24-10-1999");
        profileFive.setCity("Kolhapur");
        profileFive.setIsProfileActive(true);
        profileFive.setPreferredDestination("Lonavala");
        boolean ref5 = makeMyTrip.createMakeMyTripProfile(profileFive);
        System.out.println("MakeMyTrip Profile Created : " + ref5);
		
        MakeMyTripProfile profileSix = new MakeMyTripProfile();
        profileSix.setTravelerId(6);
        profileSix.setTravelerName("Divyashree Iyer");
        profileSix.setEmail("divyashree.iyer@gmail.com");
        profileSix.setPassword("divya#2000");
        profileSix.setGender("Female");
        profileSix.setDateOfBirth("06-12-2000");
        profileSix.setCity("Chennai");
        profileSix.setIsProfileActive(true);
        profileSix.setPreferredDestination("Pondicherry");
        boolean ref6 = makeMyTrip.createMakeMyTripProfile(profileSix);
        System.out.println("MakeMyTrip Profile Created : " + ref6);
		
        MakeMyTripProfile profileSeven = new MakeMyTripProfile();
        profileSeven.setTravelerId(7);
        profileSeven.setTravelerName("Sriram Reddy");
        profileSeven.setEmail("sriram.reddy@gmail.com");
        profileSeven.setPassword("sriram@2003");
        profileSeven.setGender("Male");
        profileSeven.setDateOfBirth("17-02-2003");
        profileSeven.setCity("Hyderabad");
        profileSeven.setIsProfileActive(true);
        profileSeven.setPreferredDestination("Coorg");
        boolean ref7 = makeMyTrip.createMakeMyTripProfile(profileSeven);
        System.out.println("MakeMyTrip Profile Created : " + ref7);
		
        MakeMyTripProfile profileEight = new MakeMyTripProfile();
        profileEight.setTravelerId(8);
        profileEight.setTravelerName("Geetha Krishnan");
        profileEight.setEmail("geetha.krishnan@gmail.com");
        profileEight.setPassword("geetha#2005");
        profileEight.setGender("Female");
        profileEight.setDateOfBirth("28-04-2005");
        profileEight.setCity("Coimbatore");
        profileEight.setIsProfileActive(true);
        profileEight.setPreferredDestination("Kodaikanal");
        boolean ref8 = makeMyTrip.createMakeMyTripProfile(profileEight);
        System.out.println("MakeMyTrip Profile Created : " + ref8);
		
        MakeMyTripProfile profileNine = new MakeMyTripProfile();
        profileNine.setTravelerId(9);
        profileNine.setTravelerName("Naveen Sharma");
        profileNine.setEmail("naveen.sharma@gmail.com");
        profileNine.setPassword("naveen@1998");
        profileNine.setGender("Male");
        profileNine.setDateOfBirth("10-06-1998");
        profileNine.setCity("Jaipur");
        profileNine.setIsProfileActive(true);
        profileNine.setPreferredDestination("Udaipur");
        boolean ref9 = makeMyTrip.createMakeMyTripProfile(profileNine);
        System.out.println("MakeMyTrip Profile Created : " + ref9);
		
        MakeMyTripProfile profileTen = new MakeMyTripProfile();
        profileTen.setTravelerId(10);
        profileTen.setTravelerName("Sumitra Pillai");
        profileTen.setEmail("sumitra.pillai@gmail.com");
        profileTen.setPassword("sumitra#2002");
        profileTen.setGender("Female");
        profileTen.setDateOfBirth("21-08-2002");
        profileTen.setCity("Thiruvananthapuram");
        profileTen.setIsProfileActive(true);
        profileTen.setPreferredDestination("Alleppey");
        boolean ref10 = makeMyTrip.createMakeMyTripProfile(profileTen);
        System.out.println("MakeMyTrip Profile Created : " + ref10);
		
        MakeMyTripProfile profileEleven = new MakeMyTripProfile();
        profileEleven.setTravelerId(11);
        profileEleven.setTravelerName("Vijay Hegde");
        profileEleven.setEmail("vijay.hegde@gmail.com");
        profileEleven.setPassword("vijay@2001");
        profileEleven.setGender("Male");
        profileEleven.setDateOfBirth("02-10-2001");
        profileEleven.setCity("Mangaluru");
        profileEleven.setIsProfileActive(true);
        profileEleven.setPreferredDestination("Chikmagalur");
        boolean ref11 = makeMyTrip.createMakeMyTripProfile(profileEleven);
        System.out.println("MakeMyTrip Profile Created : " + ref11);
		
        MakeMyTripProfile profileTwelve = new MakeMyTripProfile();
        profileTwelve.setTravelerId(12);
        profileTwelve.setTravelerName("Kavitha Bhat");
        profileTwelve.setEmail("kavitha.bhat@gmail.com");
        profileTwelve.setPassword("kavitha#1997");
        profileTwelve.setGender("Female");
        profileTwelve.setDateOfBirth("13-12-1997");
        profileTwelve.setCity("Udupi");
        profileTwelve.setIsProfileActive(true);
        profileTwelve.setPreferredDestination("Hampi");
        boolean ref12 = makeMyTrip.createMakeMyTripProfile(profileTwelve);
        System.out.println("MakeMyTrip Profile Created : " + ref12);
		
        MakeMyTripProfile profileThirteen = new MakeMyTripProfile();
        profileThirteen.setTravelerId(13);
        profileThirteen.setTravelerName("Prakash Gowda");
        profileThirteen.setEmail("prakash.gowda@gmail.com");
        profileThirteen.setPassword("prakash@1996");
        profileThirteen.setGender("Male");
        profileThirteen.setDateOfBirth("24-02-1996");
        profileThirteen.setCity("Mysuru");
        profileThirteen.setIsProfileActive(true);
        profileThirteen.setPreferredDestination("Wayanad");
        boolean ref13 = makeMyTrip.createMakeMyTripProfile(profileThirteen);
        System.out.println("MakeMyTrip Profile Created : " + ref13);
		
        MakeMyTripProfile profileFourteen = new MakeMyTripProfile();
        profileFourteen.setTravelerId(14);
        profileFourteen.setTravelerName("Saritha Verma");
        profileFourteen.setEmail("saritha.verma@gmail.com");
        profileFourteen.setPassword("saritha#2004");
        profileFourteen.setGender("Female");
        profileFourteen.setDateOfBirth("06-04-2004");
        profileFourteen.setCity("Agra");
        profileFourteen.setIsProfileActive(true);
        profileFourteen.setPreferredDestination("Shimla");
        boolean ref14 = makeMyTrip.createMakeMyTripProfile(profileFourteen);
        System.out.println("MakeMyTrip Profile Created : " + ref14);
		
        MakeMyTripProfile profileFifteen = new MakeMyTripProfile();
        profileFifteen.setTravelerId(15);
        profileFifteen.setTravelerName("Ramakrishna Rao");
        profileFifteen.setEmail("ramakrishna.rao@gmail.com");
        profileFifteen.setPassword("rama@2000");
        profileFifteen.setGender("Male");
        profileFifteen.setDateOfBirth("17-06-2000");
        profileFifteen.setCity("Vijayawada");
        profileFifteen.setIsProfileActive(true);
        profileFifteen.setPreferredDestination("Vizag");
        boolean ref15 = makeMyTrip.createMakeMyTripProfile(profileFifteen);
        System.out.println("MakeMyTrip Profile Created : " + ref15);
		
        MakeMyTripProfile profileSixteen = new MakeMyTripProfile();
        profileSixteen.setTravelerId(16);
        profileSixteen.setTravelerName("Nirmala Desai");
        profileSixteen.setEmail("nirmala.desai@gmail.com");
        profileSixteen.setPassword("nirmala#1999");
        profileSixteen.setGender("Female");
        profileSixteen.setDateOfBirth("28-08-1999");
        profileSixteen.setCity("Ahmedabad");
        profileSixteen.setIsProfileActive(true);
        profileSixteen.setPreferredDestination("Dwarka");
        boolean ref16 = makeMyTrip.createMakeMyTripProfile(profileSixteen);
        System.out.println("MakeMyTrip Profile Created : " + ref16);
		
        MakeMyTripProfile profileSeventeen = new MakeMyTripProfile();
        profileSeventeen.setTravelerId(17);
        profileSeventeen.setTravelerName("Mohan Tiwari");
        profileSeventeen.setEmail("mohan.tiwari@gmail.com");
        profileSeventeen.setPassword("mohan@2003");
        profileSeventeen.setGender("Male");
        profileSeventeen.setDateOfBirth("10-10-2003");
        profileSeventeen.setCity("Varanasi");
        profileSeventeen.setIsProfileActive(true);
        profileSeventeen.setPreferredDestination("Rishikesh");
        boolean ref17 = makeMyTrip.createMakeMyTripProfile(profileSeventeen);
        System.out.println("MakeMyTrip Profile Created : " + ref17);
		
        MakeMyTripProfile profileEighteen = new MakeMyTripProfile();
        profileEighteen.setTravelerId(18);
        profileEighteen.setTravelerName("Sunanda Gupta");
        profileEighteen.setEmail("sunanda.gupta@gmail.com");
        profileEighteen.setPassword("sunanda#2001");
        profileEighteen.setGender("Female");
        profileEighteen.setDateOfBirth("21-12-2001");
        profileEighteen.setCity("Lucknow");
        profileEighteen.setIsProfileActive(true);
        profileEighteen.setPreferredDestination("Nainital");
        boolean ref18 = makeMyTrip.createMakeMyTripProfile(profileEighteen);
        System.out.println("MakeMyTrip Profile Created : " + ref18);
		
        MakeMyTripProfile profileNineteen = new MakeMyTripProfile();
        profileNineteen.setTravelerId(19);
        profileNineteen.setTravelerName("Basavaraj Shetty");
        profileNineteen.setEmail("basavaraj.shetty@gmail.com");
        profileNineteen.setPassword("basav@1995");
        profileNineteen.setGender("Male");
        profileNineteen.setDateOfBirth("02-02-1995");
        profileNineteen.setCity("Hubli");
        profileNineteen.setIsProfileActive(true);
        profileNineteen.setPreferredDestination("Gokarna");
        boolean ref19 = makeMyTrip.createMakeMyTripProfile(profileNineteen);
        System.out.println("MakeMyTrip Profile Created : " + ref19);

        makeMyTrip.getMakeMyTripProfileDetails();
    }
}
