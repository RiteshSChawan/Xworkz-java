class BookMyShowRunner {

    public static void main(String args[]) {
        BookMyShow bookMyShow = new BookMyShow();

        BookMyShowProfile profileOne = new BookMyShowProfile();
        profileOne.setUserId(1);
        profileOne.setUserName("Abishek Rao");
        profileOne.setEmail("abishek.rao@gmail.com");
        profileOne.setPassword("abishek@2002");
        profileOne.setGender("Male");
        profileOne.setDateOfBirth("14-03-2002");
        profileOne.setCity("Bengaluru");
        profileOne.setIsProfileActive(true);
        profileOne.setPreferredGenre("Action");
        boolean ref1 = bookMyShow.createBookMyShowProfile(profileOne);
        System.out.println("BookMyShow Profile Created : " + ref1);
		
        BookMyShowProfile profileTwo = new BookMyShowProfile();
        profileTwo.setUserId(2);
        profileTwo.setUserName("Chithra Iyer");
        profileTwo.setEmail("chithra.iyer@gmail.com");
        profileTwo.setPassword("chithra#2003");
        profileTwo.setGender("Female");
        profileTwo.setDateOfBirth("25-05-2003");
        profileTwo.setCity("Chennai");
        profileTwo.setIsProfileActive(true);
        profileTwo.setPreferredGenre("Romance");
        boolean ref2 = bookMyShow.createBookMyShowProfile(profileTwo);
        System.out.println("BookMyShow Profile Created : " + ref2);
		
        BookMyShowProfile profileThree = new BookMyShowProfile();
        profileThree.setUserId(3);
        profileThree.setUserName("Deepak Pillai");
        profileThree.setEmail("deepak.pillai@gmail.com");
        profileThree.setPassword("deepak@2001");
        profileThree.setGender("Male");
        profileThree.setDateOfBirth("06-07-2001");
        profileThree.setCity("Thiruvananthapuram");
        profileThree.setIsProfileActive(true);
        profileThree.setPreferredGenre("Thriller");
        boolean ref3 = bookMyShow.createBookMyShowProfile(profileThree);
        System.out.println("BookMyShow Profile Created : " + ref3);
		
        BookMyShowProfile profileFour = new BookMyShowProfile();
        profileFour.setUserId(4);
        profileFour.setUserName("Eshwari Menon");
        profileFour.setEmail("eshwari.menon@gmail.com");
        profileFour.setPassword("eshwari#2004");
        profileFour.setGender("Female");
        profileFour.setDateOfBirth("17-09-2004");
        profileFour.setCity("Kochi");
        profileFour.setIsProfileActive(true);
        profileFour.setPreferredGenre("Comedy");
        boolean ref4 = bookMyShow.createBookMyShowProfile(profileFour);
        System.out.println("BookMyShow Profile Created : " + ref4);
		
        BookMyShowProfile profileFive = new BookMyShowProfile();
        profileFive.setUserId(5);
        profileFive.setUserName("Faisal Patil");
        profileFive.setEmail("faisal.patil@gmail.com");
        profileFive.setPassword("faisal@1999");
        profileFive.setGender("Male");
        profileFive.setDateOfBirth("28-11-1999");
        profileFive.setCity("Pune");
        profileFive.setIsProfileActive(true);
        profileFive.setPreferredGenre("Drama");
        boolean ref5 = bookMyShow.createBookMyShowProfile(profileFive);
        System.out.println("BookMyShow Profile Created : " + ref5);
		
        BookMyShowProfile profileSix = new BookMyShowProfile();
        profileSix.setUserId(6);
        profileSix.setUserName("Girija Sharma");
        profileSix.setEmail("girija.sharma@gmail.com");
        profileSix.setPassword("girija#2000");
        profileSix.setGender("Female");
        profileSix.setDateOfBirth("10-01-2000");
        profileSix.setCity("Delhi");
        profileSix.setIsProfileActive(true);
        profileSix.setPreferredGenre("Horror");
        boolean ref6 = bookMyShow.createBookMyShowProfile(profileSix);
        System.out.println("BookMyShow Profile Created : " + ref6);
		
        BookMyShowProfile profileSeven = new BookMyShowProfile();
        profileSeven.setUserId(7);
        profileSeven.setUserName("Harish Reddy");
        profileSeven.setEmail("harish.reddy@gmail.com");
        profileSeven.setPassword("harish@2003");
        profileSeven.setGender("Male");
        profileSeven.setDateOfBirth("21-03-2003");
        profileSeven.setCity("Hyderabad");
        profileSeven.setIsProfileActive(true);
        profileSeven.setPreferredGenre("Sci-Fi");
        boolean ref7 = bookMyShow.createBookMyShowProfile(profileSeven);
        System.out.println("BookMyShow Profile Created : " + ref7);
		
        BookMyShowProfile profileEight = new BookMyShowProfile();
        profileEight.setUserId(8);
        profileEight.setUserName("Indira Nair");
        profileEight.setEmail("indira.nair@gmail.com");
        profileEight.setPassword("indira#2005");
        profileEight.setGender("Female");
        profileEight.setDateOfBirth("02-05-2005");
        profileEight.setCity("Kozhikode");
        profileEight.setIsProfileActive(true);
        profileEight.setPreferredGenre("Musical");
        boolean ref8 = bookMyShow.createBookMyShowProfile(profileEight);
        System.out.println("BookMyShow Profile Created : " + ref8);
		
        BookMyShowProfile profileNine = new BookMyShowProfile();
        profileNine.setUserId(9);
        profileNine.setUserName("Jayakar Hegde");
        profileNine.setEmail("jayakar.hegde@gmail.com");
        profileNine.setPassword("jayakar@1998");
        profileNine.setGender("Male");
        profileNine.setDateOfBirth("13-07-1998");
        profileNine.setCity("Mangaluru");
        profileNine.setIsProfileActive(true);
        profileNine.setPreferredGenre("Adventure");
        boolean ref9 = bookMyShow.createBookMyShowProfile(profileNine);
        System.out.println("BookMyShow Profile Created : " + ref9);
		
        BookMyShowProfile profileTen = new BookMyShowProfile();
        profileTen.setUserId(10);
        profileTen.setUserName("Kokila Gowda");
        profileTen.setEmail("kokila.gowda@gmail.com");
        profileTen.setPassword("kokila#2002");
        profileTen.setGender("Female");
        profileTen.setDateOfBirth("24-09-2002");
        profileTen.setCity("Mysuru");
        profileTen.setIsProfileActive(true);
        profileTen.setPreferredGenre("Fantasy");
        boolean ref10 = bookMyShow.createBookMyShowProfile(profileTen);
        System.out.println("BookMyShow Profile Created : " + ref10);
		
        BookMyShowProfile profileEleven = new BookMyShowProfile();
        profileEleven.setUserId(11);
        profileEleven.setUserName("Lokesh Shetty");
        profileEleven.setEmail("lokesh.shetty@gmail.com");
        profileEleven.setPassword("lokesh@2001");
        profileEleven.setGender("Male");
        profileEleven.setDateOfBirth("05-11-2001");
        profileEleven.setCity("Udupi");
        profileEleven.setIsProfileActive(true);
        profileEleven.setPreferredGenre("Action");
        boolean ref11 = bookMyShow.createBookMyShowProfile(profileEleven);
        System.out.println("BookMyShow Profile Created : " + ref11);
		
        BookMyShowProfile profileTwelve = new BookMyShowProfile();
        profileTwelve.setUserId(12);
        profileTwelve.setUserName("Mythri Desai");
        profileTwelve.setEmail("mythri.desai@gmail.com");
        profileTwelve.setPassword("mythri#1997");
        profileTwelve.setGender("Female");
        profileTwelve.setDateOfBirth("16-01-1997");
        profileTwelve.setCity("Ahmedabad");
        profileTwelve.setIsProfileActive(true);
        profileTwelve.setPreferredGenre("Romance");
        boolean ref12 = bookMyShow.createBookMyShowProfile(profileTwelve);
        System.out.println("BookMyShow Profile Created : " + ref12);
		
        BookMyShowProfile profileThirteen = new BookMyShowProfile();
        profileThirteen.setUserId(13);
        profileThirteen.setUserName("Narayan Tiwari");
        profileThirteen.setEmail("narayan.tiwari@gmail.com");
        profileThirteen.setPassword("narayan@1996");
        profileThirteen.setGender("Male");
        profileThirteen.setDateOfBirth("27-03-1996");
        profileThirteen.setCity("Lucknow");
        profileThirteen.setIsProfileActive(true);
        profileThirteen.setPreferredGenre("Thriller");
        boolean ref13 = bookMyShow.createBookMyShowProfile(profileThirteen);
        System.out.println("BookMyShow Profile Created : " + ref13);
		
        BookMyShowProfile profileFourteen = new BookMyShowProfile();
        profileFourteen.setUserId(14);
        profileFourteen.setUserName("Omana Verma");
        profileFourteen.setEmail("omana.verma@gmail.com");
        profileFourteen.setPassword("omana#2004");
        profileFourteen.setGender("Female");
        profileFourteen.setDateOfBirth("08-05-2004");
        profileFourteen.setCity("Jaipur");
        profileFourteen.setIsProfileActive(true);
        profileFourteen.setPreferredGenre("Comedy");
        boolean ref14 = bookMyShow.createBookMyShowProfile(profileFourteen);
        System.out.println("BookMyShow Profile Created : " + ref14);
		
        BookMyShowProfile profileFifteen = new BookMyShowProfile();
        profileFifteen.setUserId(15);
        profileFifteen.setUserName("Prashanth Rao");
        profileFifteen.setEmail("prashanth.rao@gmail.com");
        profileFifteen.setPassword("prashanth@2000");
        profileFifteen.setGender("Male");
        profileFifteen.setDateOfBirth("19-07-2000");
        profileFifteen.setCity("Vijayawada");
        profileFifteen.setIsProfileActive(true);
        profileFifteen.setPreferredGenre("Drama");
        boolean ref15 = bookMyShow.createBookMyShowProfile(profileFifteen);
        System.out.println("BookMyShow Profile Created : " + ref15);
		
        BookMyShowProfile profileSixteen = new BookMyShowProfile();
        profileSixteen.setUserId(16);
        profileSixteen.setUserName("Qudsiya Krishnan");
        profileSixteen.setEmail("qudsiya.krishnan@gmail.com");
        profileSixteen.setPassword("qudsiya#1999");
        profileSixteen.setGender("Female");
        profileSixteen.setDateOfBirth("30-09-1999");
        profileSixteen.setCity("Coimbatore");
        profileSixteen.setIsProfileActive(true);
        profileSixteen.setPreferredGenre("Horror");
        boolean ref16 = bookMyShow.createBookMyShowProfile(profileSixteen);
        System.out.println("BookMyShow Profile Created : " + ref16);
		
        BookMyShowProfile profileSeventeen = new BookMyShowProfile();
        profileSeventeen.setUserId(17);
        profileSeventeen.setUserName("Raja Sharma");
        profileSeventeen.setEmail("raja.sharma@gmail.com");
        profileSeventeen.setPassword("raja@2003");
        profileSeventeen.setGender("Male");
        profileSeventeen.setDateOfBirth("11-11-2003");
        profileSeventeen.setCity("Mumbai");
        profileSeventeen.setIsProfileActive(true);
        profileSeventeen.setPreferredGenre("Sci-Fi");
        boolean ref17 = bookMyShow.createBookMyShowProfile(profileSeventeen);
        System.out.println("BookMyShow Profile Created : " + ref17);
		
        BookMyShowProfile profileEighteen = new BookMyShowProfile();
        profileEighteen.setUserId(18);
        profileEighteen.setUserName("Savita Bhat");
        profileEighteen.setEmail("savita.bhat@gmail.com");
        profileEighteen.setPassword("savita#2001");
        profileEighteen.setGender("Female");
        profileEighteen.setDateOfBirth("22-12-2001");
        profileEighteen.setCity("Hubli");
        profileEighteen.setIsProfileActive(true);
        profileEighteen.setPreferredGenre("Musical");
        boolean ref18 = bookMyShow.createBookMyShowProfile(profileEighteen);
        System.out.println("BookMyShow Profile Created : " + ref18);
		
        BookMyShowProfile profileNineteen = new BookMyShowProfile();
        profileNineteen.setUserId(19);
        profileNineteen.setUserName("Thilak Kumar");
        profileNineteen.setEmail("thilak.kumar@gmail.com");
        profileNineteen.setPassword("thilak@1994");
        profileNineteen.setGender("Male");
        profileNineteen.setDateOfBirth("03-02-1994");
        profileNineteen.setCity("Kannur");
        profileNineteen.setIsProfileActive(true);
        profileNineteen.setPreferredGenre("Adventure");
        boolean ref19 = bookMyShow.createBookMyShowProfile(profileNineteen);
        System.out.println("BookMyShow Profile Created : " + ref19);

        bookMyShow.getBookMyShowProfileDetails();
    }
}
