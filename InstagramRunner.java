class InstagramRunner {

    public static void main(String args[]) {
        Instagram instagram = new Instagram();

        InstagramProfile profileOne = new InstagramProfile();
        profileOne.setProfileId(1);
        profileOne.setUserName("rohan_malhotra");
        profileOne.setEmail("rohan.malhotra@gmail.com");
        profileOne.setPassword("rohan@2002");
        profileOne.setGender("Male");
        profileOne.setDateOfBirth("05-03-2002");
        profileOne.setCity("Delhi");
        profileOne.setIsProfileActive(true);
        boolean ref1 = instagram.createInstagramProfile(profileOne);
        System.out.println("Instagram Profile Created : " + ref1);

        InstagramProfile profileTwo = new InstagramProfile();
        profileTwo.setProfileId(2);
        profileTwo.setUserName("nisha_sharma");
        profileTwo.setEmail("nisha.sharma@gmail.com");
        profileTwo.setPassword("nisha#456");
        profileTwo.setGender("Female");
        profileTwo.setDateOfBirth("14-07-2003");
        profileTwo.setCity("Lucknow");
        profileTwo.setIsProfileActive(true);
        boolean ref2 = instagram.createInstagramProfile(profileTwo);
        System.out.println("Instagram Profile Created : " + ref2);

        InstagramProfile profileThree = new InstagramProfile();
        profileThree.setProfileId(3);
        profileThree.setUserName("arjun_menon");
        profileThree.setEmail("arjun.menon@gmail.com");
        profileThree.setPassword("arjun@2001");
        profileThree.setGender("Male");
        profileThree.setDateOfBirth("22-09-2001");
        profileThree.setCity("Kochi");
        profileThree.setIsProfileActive(true);
        boolean ref3 = instagram.createInstagramProfile(profileThree);
        System.out.println("Instagram Profile Created : " + ref3);

        InstagramProfile profileFour = new InstagramProfile();
        profileFour.setProfileId(4);
        profileFour.setUserName("kavya_iyer");
        profileFour.setEmail("kavya.iyer@gmail.com");
        profileFour.setPassword("kavya@2004");
        profileFour.setGender("Female");
        profileFour.setDateOfBirth("30-01-2004");
        profileFour.setCity("Chennai");
        profileFour.setIsProfileActive(true);
        boolean ref4 = instagram.createInstagramProfile(profileFour);
        System.out.println("Instagram Profile Created : " + ref4);

        InstagramProfile profileFive = new InstagramProfile();
        profileFive.setProfileId(5);
        profileFive.setUserName("siddharth_rao");
        profileFive.setEmail("siddharth.rao@gmail.com");
        profileFive.setPassword("sidd#1999");
        profileFive.setGender("Male");
        profileFive.setDateOfBirth("17-11-1999");
        profileFive.setCity("Bengaluru");
        profileFive.setIsProfileActive(true);
        boolean ref5 = instagram.createInstagramProfile(profileFive);
        System.out.println("Instagram Profile Created : " + ref5);

        InstagramProfile profileSix = new InstagramProfile();
        profileSix.setProfileId(6);
        profileSix.setUserName("trisha_pillai");
        profileSix.setEmail("trisha.pillai@gmail.com");
        profileSix.setPassword("trisha@2000");
        profileSix.setGender("Female");
        profileSix.setDateOfBirth("08-05-2000");
        profileSix.setCity("Thiruvananthapuram");
        profileSix.setIsProfileActive(true);
        boolean ref6 = instagram.createInstagramProfile(profileSix);
        System.out.println("Instagram Profile Created : " + ref6);

        InstagramProfile profileSeven = new InstagramProfile();
        profileSeven.setProfileId(7);
        profileSeven.setUserName("vijay_patil");
        profileSeven.setEmail("vijay.patil@gmail.com");
        profileSeven.setPassword("vijay#2003");
        profileSeven.setGender("Male");
        profileSeven.setDateOfBirth("11-08-2003");
        profileSeven.setCity("Pune");
        profileSeven.setIsProfileActive(true);
        boolean ref7 = instagram.createInstagramProfile(profileSeven);
        System.out.println("Instagram Profile Created : " + ref7);

        InstagramProfile profileEight = new InstagramProfile();
        profileEight.setProfileId(8);
        profileEight.setUserName("riya_desai");
        profileEight.setEmail("riya.desai@gmail.com");
        profileEight.setPassword("riya@2005");
        profileEight.setGender("Female");
        profileEight.setDateOfBirth("26-12-2005");
        profileEight.setCity("Surat");
        profileEight.setIsProfileActive(true);
        boolean ref8 = instagram.createInstagramProfile(profileEight);
        System.out.println("Instagram Profile Created : " + ref8);

        InstagramProfile profileNine = new InstagramProfile();
        profileNine.setProfileId(9);
        profileNine.setUserName("harsh_tiwari");
        profileNine.setEmail("harsh.tiwari@gmail.com");
        profileNine.setPassword("harsh#1998");
        profileNine.setGender("Male");
        profileNine.setDateOfBirth("19-04-1998");
        profileNine.setCity("Bhopal");
        profileNine.setIsProfileActive(true);
        boolean ref9 = instagram.createInstagramProfile(profileNine);
        System.out.println("Instagram Profile Created : " + ref9);

        InstagramProfile profileTen = new InstagramProfile();
        profileTen.setProfileId(10);
        profileTen.setUserName("amritha_nair");
        profileTen.setEmail("amritha.nair@gmail.com");
        profileTen.setPassword("amritha@2002");
        profileTen.setGender("Female");
        profileTen.setDateOfBirth("02-02-2002");
        profileTen.setCity("Thrissur");
        profileTen.setIsProfileActive(true);
        boolean ref10 = instagram.createInstagramProfile(profileTen);
        System.out.println("Instagram Profile Created : " + ref10);

        InstagramProfile profileEleven = new InstagramProfile();
        profileEleven.setProfileId(11);
        profileEleven.setUserName("pranav_hegde");
        profileEleven.setEmail("pranav.hegde@gmail.com");
        profileEleven.setPassword("pranav#2001");
        profileEleven.setGender("Male");
        profileEleven.setDateOfBirth("23-10-2001");
        profileEleven.setCity("Mangaluru");
        profileEleven.setIsProfileActive(true);
        boolean ref11 = instagram.createInstagramProfile(profileEleven);
        System.out.println("Instagram Profile Created : " + ref11);

        InstagramProfile profileTwelve = new InstagramProfile();
        profileTwelve.setProfileId(12);
        profileTwelve.setUserName("shruti_verma");
        profileTwelve.setEmail("shruti.verma@gmail.com");
        profileTwelve.setPassword("shruti@1997");
        profileTwelve.setGender("Female");
        profileTwelve.setDateOfBirth("15-06-1997");
        profileTwelve.setCity("Agra");
        profileTwelve.setIsProfileActive(true);
        boolean ref12 = instagram.createInstagramProfile(profileTwelve);
        System.out.println("Instagram Profile Created : " + ref12);

        InstagramProfile profileThirteen = new InstagramProfile();
        profileThirteen.setProfileId(13);
        profileThirteen.setUserName("sanjay_kumar");
        profileThirteen.setEmail("sanjay.kumar@gmail.com");
        profileThirteen.setPassword("sanjay#2000");
        profileThirteen.setGender("Male");
        profileThirteen.setDateOfBirth("07-03-2000");
        profileThirteen.setCity("Patna");
        profileThirteen.setIsProfileActive(true);
        boolean ref13 = instagram.createInstagramProfile(profileThirteen);
        System.out.println("Instagram Profile Created : " + ref13);

        InstagramProfile profileFourteen = new InstagramProfile();
        profileFourteen.setProfileId(14);
        profileFourteen.setUserName("anjali_bhat");
        profileFourteen.setEmail("anjali.bhat@gmail.com");
        profileFourteen.setPassword("anjali@2004");
        profileFourteen.setGender("Female");
        profileFourteen.setDateOfBirth("18-09-2004");
        profileFourteen.setCity("Udupi");
        profileFourteen.setIsProfileActive(true);
        boolean ref14 = instagram.createInstagramProfile(profileFourteen);
        System.out.println("Instagram Profile Created : " + ref14);

        InstagramProfile profileFifteen = new InstagramProfile();
        profileFifteen.setProfileId(15);
        profileFifteen.setUserName("deepak_reddy");
        profileFifteen.setEmail("deepak.reddy@gmail.com");
        profileFifteen.setPassword("deepak#1996");
        profileFifteen.setGender("Male");
        profileFifteen.setDateOfBirth("29-07-1996");
        profileFifteen.setCity("Vijayawada");
        profileFifteen.setIsProfileActive(true);
        boolean ref15 = instagram.createInstagramProfile(profileFifteen);
        System.out.println("Instagram Profile Created : " + ref15);

        InstagramProfile profileSixteen = new InstagramProfile();
        profileSixteen.setProfileId(16);
        profileSixteen.setUserName("meghna_joshi");
        profileSixteen.setEmail("meghna.joshi@gmail.com");
        profileSixteen.setPassword("meghna@2003");
        profileSixteen.setGender("Female");
        profileSixteen.setDateOfBirth("12-01-2003");
        profileSixteen.setCity("Nashik");
        profileSixteen.setIsProfileActive(true);
        boolean ref16 = instagram.createInstagramProfile(profileSixteen);
        System.out.println("Instagram Profile Created : " + ref16);

        InstagramProfile profileSeventeen = new InstagramProfile();
        profileSeventeen.setProfileId(17);
        profileSeventeen.setUserName("nikhil_shetty");
        profileSeventeen.setEmail("nikhil.shetty@gmail.com");
        profileSeventeen.setPassword("nikhil#2005");
        profileSeventeen.setGender("Male");
        profileSeventeen.setDateOfBirth("04-11-2005");
        profileSeventeen.setCity("Hubli");
        profileSeventeen.setIsProfileActive(true);
        boolean ref17 = instagram.createInstagramProfile(profileSeventeen);
        System.out.println("Instagram Profile Created : " + ref17);

        InstagramProfile profileEighteen = new InstagramProfile();
        profileEighteen.setProfileId(18);
        profileEighteen.setUserName("preeti_singh");
        profileEighteen.setEmail("preeti.singh@gmail.com");
        profileEighteen.setPassword("preeti@2001");
        profileEighteen.setGender("Female");
        profileEighteen.setDateOfBirth("20-06-2001");
        profileEighteen.setCity("Chandigarh");
        profileEighteen.setIsProfileActive(true);
        boolean ref18 = instagram.createInstagramProfile(profileEighteen);
        System.out.println("Instagram Profile Created : " + ref18);

        InstagramProfile profileNineteen = new InstagramProfile();
        profileNineteen.setProfileId(19);
        profileNineteen.setUserName("tarun_mishra");
        profileNineteen.setEmail("tarun.mishra@gmail.com");
        profileNineteen.setPassword("tarun#1995");
        profileNineteen.setGender("Male");
        profileNineteen.setDateOfBirth("31-08-1995");
        profileNineteen.setCity("Kanpur");
        profileNineteen.setIsProfileActive(true);
        boolean ref19 = instagram.createInstagramProfile(profileNineteen);
        System.out.println("Instagram Profile Created : " + ref19);

        instagram.getInstagramProfileDetails();
    }
}
