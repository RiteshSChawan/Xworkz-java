class PassportRunner {

    public static void main(String args[]) {
        Passport passport = new Passport();

        PassportProfile profileOne = new PassportProfile();
        profileOne.setPassportId(1);
        profileOne.setFullName("Aarav Sharma");
        profileOne.setEmail("aarav.sharma@gmail.com");
        profileOne.setPassword("aarav@2004");
        profileOne.setGender("Male");
        profileOne.setDateOfBirth("15-08-2004");
        profileOne.setAddress("12 MG Road, Bengaluru");
        profileOne.setIsProfileActive(true);
        boolean ref1 = passport.createPassportProfile(profileOne);
        System.out.println("Passport Profile Created : " + ref1);

        PassportProfile profileTwo = new PassportProfile();
        profileTwo.setPassportId(2);
        profileTwo.setFullName("Priya Nair");
        profileTwo.setEmail("priya.nair@gmail.com");
        profileTwo.setPassword("priya@2003");
        profileTwo.setGender("Female");
        profileTwo.setDateOfBirth("22-03-2003");
        profileTwo.setAddress("45 Palarivattom, Kochi");
        profileTwo.setIsProfileActive(true);
        boolean ref2 = passport.createPassportProfile(profileTwo);
        System.out.println("Passport Profile Created : " + ref2);

        PassportProfile profileThree = new PassportProfile();
        profileThree.setPassportId(3);
        profileThree.setFullName("Rahul Mehta");
        profileThree.setEmail("rahul.mehta@gmail.com");
        profileThree.setPassword("rahul#2001");
        profileThree.setGender("Male");
        profileThree.setDateOfBirth("10-06-2001");
        profileThree.setAddress("78 Linking Road, Mumbai");
        profileThree.setIsProfileActive(true);
        boolean ref3 = passport.createPassportProfile(profileThree);
        System.out.println("Passport Profile Created : " + ref3);

        PassportProfile profileFour = new PassportProfile();
        profileFour.setPassportId(4);
        profileFour.setFullName("Sneha Iyer");
        profileFour.setEmail("sneha.iyer@gmail.com");
        profileFour.setPassword("sneha@789");
        profileFour.setGender("Female");
        profileFour.setDateOfBirth("18-12-2002");
        profileFour.setAddress("23 Anna Nagar, Chennai");
        profileFour.setIsProfileActive(true);
        boolean ref4 = passport.createPassportProfile(profileFour);
        System.out.println("Passport Profile Created : " + ref4);

        PassportProfile profileFive = new PassportProfile();
        profileFive.setPassportId(5);
        profileFive.setFullName("Karan Verma");
        profileFive.setEmail("karan.verma@gmail.com");
        profileFive.setPassword("karan#2000");
        profileFive.setGender("Male");
        profileFive.setDateOfBirth("30-09-2000");
        profileFive.setAddress("56 Banjara Hills, Hyderabad");
        profileFive.setIsProfileActive(true);
        boolean ref5 = passport.createPassportProfile(profileFive);
        System.out.println("Passport Profile Created : " + ref5);

        PassportProfile profileSix = new PassportProfile();
        profileSix.setPassportId(6);
        profileSix.setFullName("Divya Pillai");
        profileSix.setEmail("divya.pillai@gmail.com");
        profileSix.setPassword("divya@1999");
        profileSix.setGender("Female");
        profileSix.setDateOfBirth("04-04-1999");
        profileSix.setAddress("89 Thrippunithura, Ernakulam");
        profileSix.setIsProfileActive(true);
        boolean ref6 = passport.createPassportProfile(profileSix);
        System.out.println("Passport Profile Created : " + ref6);

        PassportProfile profileSeven = new PassportProfile();
        profileSeven.setPassportId(7);
        profileSeven.setFullName("Suresh Patil");
        profileSeven.setEmail("suresh.patil@gmail.com");
        profileSeven.setPassword("suresh#1998");
        profileSeven.setGender("Male");
        profileSeven.setDateOfBirth("25-11-1998");
        profileSeven.setAddress("34 Shivaji Nagar, Pune");
        profileSeven.setIsProfileActive(true);
        boolean ref7 = passport.createPassportProfile(profileSeven);
        System.out.println("Passport Profile Created : " + ref7);

        PassportProfile profileEight = new PassportProfile();
        profileEight.setPassportId(8);
        profileEight.setFullName("Ananya Krishnan");
        profileEight.setEmail("ananya.krishnan@gmail.com");
        profileEight.setPassword("ananya@2005");
        profileEight.setGender("Female");
        profileEight.setDateOfBirth("07-07-2005");
        profileEight.setAddress("67 Kowdiar, Thiruvananthapuram");
        profileEight.setIsProfileActive(true);
        boolean ref8 = passport.createPassportProfile(profileEight);
        System.out.println("Passport Profile Created : " + ref8);

        PassportProfile profileNine = new PassportProfile();
        profileNine.setPassportId(9);
        profileNine.setFullName("Naveen Bhat");
        profileNine.setEmail("naveen.bhat@gmail.com");
        profileNine.setPassword("naveen#2002");
        profileNine.setGender("Male");
        profileNine.setDateOfBirth("13-02-2002");
        profileNine.setAddress("11 Kadri, Mangaluru");
        profileNine.setIsProfileActive(true);
        boolean ref9 = passport.createPassportProfile(profileNine);
        System.out.println("Passport Profile Created : " + ref9);

        PassportProfile profileTen = new PassportProfile();
        profileTen.setPassportId(10);
        profileTen.setFullName("Meena Sharma");
        profileTen.setEmail("meena.sharma@gmail.com");
        profileTen.setPassword("meena@456");
        profileTen.setGender("Female");
        profileTen.setDateOfBirth("03-09-2000");
        profileTen.setAddress("90 Vaishali Nagar, Jaipur");
        profileTen.setIsProfileActive(true);
        boolean ref10 = passport.createPassportProfile(profileTen);
        System.out.println("Passport Profile Created : " + ref10);

        PassportProfile profileEleven = new PassportProfile();
        profileEleven.setPassportId(11);
        profileEleven.setFullName("Vikram Nair");
        profileEleven.setEmail("vikram.nair@gmail.com");
        profileEleven.setPassword("vikram#007");
        profileEleven.setGender("Male");
        profileEleven.setDateOfBirth("22-06-1999");
        profileEleven.setAddress("21 Kozhikode Beach Road, Kozhikode");
        profileEleven.setIsProfileActive(true);
        boolean ref11 = passport.createPassportProfile(profileEleven);
        System.out.println("Passport Profile Created : " + ref11);

        PassportProfile profileTwelve = new PassportProfile();
        profileTwelve.setPassportId(12);
        profileTwelve.setFullName("Pooja Desai");
        profileTwelve.setEmail("pooja.desai@gmail.com");
        profileTwelve.setPassword("pooja@1998");
        profileTwelve.setGender("Female");
        profileTwelve.setDateOfBirth("08-08-1998");
        profileTwelve.setAddress("15 Navrangpura, Ahmedabad");
        profileTwelve.setIsProfileActive(true);
        boolean ref12 = passport.createPassportProfile(profileTwelve);
        System.out.println("Passport Profile Created : " + ref12);

        PassportProfile profileThirteen = new PassportProfile();
        profileThirteen.setPassportId(13);
        profileThirteen.setFullName("Arun Kumar");
        profileThirteen.setEmail("arun.kumar@gmail.com");
        profileThirteen.setPassword("arun#9999");
        profileThirteen.setGender("Male");
        profileThirteen.setDateOfBirth("19-07-1995");
        profileThirteen.setAddress("44 Gandhipuram, Coimbatore");
        profileThirteen.setIsProfileActive(true);
        boolean ref13 = passport.createPassportProfile(profileThirteen);
        System.out.println("Passport Profile Created : " + ref13);

        PassportProfile profileFourteen = new PassportProfile();
        profileFourteen.setPassportId(14);
        profileFourteen.setFullName("Swathi Gowda");
        profileFourteen.setEmail("swathi.gowda@gmail.com");
        profileFourteen.setPassword("swathi@1999");
        profileFourteen.setGender("Female");
        profileFourteen.setDateOfBirth("20-08-1999");
        profileFourteen.setAddress("33 Vinoba Nagar, Shivamogga");
        profileFourteen.setIsProfileActive(true);
        boolean ref14 = passport.createPassportProfile(profileFourteen);
        System.out.println("Passport Profile Created : " + ref14);

        PassportProfile profileFifteen = new PassportProfile();
        profileFifteen.setPassportId(15);
        profileFifteen.setFullName("Manoj Tiwari");
        profileFifteen.setEmail("manoj.tiwari@gmail.com");
        profileFifteen.setPassword("manoj#1996");
        profileFifteen.setGender("Male");
        profileFifteen.setDateOfBirth("07-01-1996");
        profileFifteen.setAddress("55 Sigra, Varanasi");
        profileFifteen.setIsProfileActive(true);
        boolean ref15 = passport.createPassportProfile(profileFifteen);
        System.out.println("Passport Profile Created : " + ref15);

        PassportProfile profileSixteen = new PassportProfile();
        profileSixteen.setPassportId(16);
        profileSixteen.setFullName("Lakshmi Rao");
        profileSixteen.setEmail("lakshmi.rao@gmail.com");
        profileSixteen.setPassword("lakshmi@2005");
        profileSixteen.setGender("Female");
        profileSixteen.setDateOfBirth("28-10-2005");
        profileSixteen.setAddress("77 Governorpet, Vijayawada");
        profileSixteen.setIsProfileActive(true);
        boolean ref16 = passport.createPassportProfile(profileSixteen);
        System.out.println("Passport Profile Created : " + ref16);

        PassportProfile profileSeventeen = new PassportProfile();
        profileSeventeen.setPassportId(17);
        profileSeventeen.setFullName("Deepa Menon");
        profileSeventeen.setEmail("deepa.menon@gmail.com");
        profileSeventeen.setPassword("deepa@2001");
        profileSeventeen.setGender("Female");
        profileSeventeen.setDateOfBirth("25-11-2001");
        profileSeventeen.setAddress("88 Swaraj Round, Thrissur");
        profileSeventeen.setIsProfileActive(true);
        boolean ref17 = passport.createPassportProfile(profileSeventeen);
        System.out.println("Passport Profile Created : " + ref17);

        PassportProfile profileEighteen = new PassportProfile();
        profileEighteen.setPassportId(18);
        profileEighteen.setFullName("Ganesh Hegde");
        profileEighteen.setEmail("ganesh.hegde@gmail.com");
        profileEighteen.setPassword("ganesh#2000");
        profileEighteen.setGender("Male");
        profileEighteen.setDateOfBirth("11-12-2000");
        profileEighteen.setAddress("19 Keshwapur, Hubli");
        profileEighteen.setIsProfileActive(true);
        boolean ref18 = passport.createPassportProfile(profileEighteen);
        System.out.println("Passport Profile Created : " + ref18);

        PassportProfile profileNineteen = new PassportProfile();
        profileNineteen.setPassportId(19);
        profileNineteen.setFullName("Kavitha Reddy");
        profileNineteen.setEmail("kavitha.reddy@gmail.com");
        profileNineteen.setPassword("kavitha@2003");
        profileNineteen.setGender("Female");
        profileNineteen.setDateOfBirth("16-05-2003");
        profileNineteen.setAddress("62 Jubilee Hills, Hyderabad");
        profileNineteen.setIsProfileActive(true);
        boolean ref19 = passport.createPassportProfile(profileNineteen);
        System.out.println("Passport Profile Created : " + ref19);

        passport.getPassportProfileDetails();
    }
}
