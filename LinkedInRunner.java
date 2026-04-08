class LinkedInRunner {

    public static void main(String args[]) {
        LinkedIn linkedIn = new LinkedIn();

        LinkedInProfile profileOne = new LinkedInProfile();
        profileOne.setMemberId(1);
        profileOne.setMemberName("Ankit Mehta");
        profileOne.setEmail("ankit.mehta@gmail.com");
        profileOne.setPassword("ankit@2000");
        profileOne.setGender("Male");
        profileOne.setDateOfBirth("05-01-2000");
        profileOne.setCity("Mumbai");
        profileOne.setIsProfileActive(true);
        profileOne.setJobTitle("Software Engineer");
        boolean ref1 = linkedIn.createLinkedInProfile(profileOne);
        System.out.println("LinkedIn Profile Created : " + ref1);
		
        LinkedInProfile profileTwo = new LinkedInProfile();
        profileTwo.setMemberId(2);
        profileTwo.setMemberName("Roshni Sharma");
        profileTwo.setEmail("roshni.sharma@gmail.com");
        profileTwo.setPassword("roshni#2001");
        profileTwo.setGender("Female");
        profileTwo.setDateOfBirth("16-03-2001");
        profileTwo.setCity("Delhi");
        profileTwo.setIsProfileActive(true);
        profileTwo.setJobTitle("Data Analyst");
        boolean ref2 = linkedIn.createLinkedInProfile(profileTwo);
        System.out.println("LinkedIn Profile Created : " + ref2);
		
        LinkedInProfile profileThree = new LinkedInProfile();
        profileThree.setMemberId(3);
        profileThree.setMemberName("Gokul Nair");
        profileThree.setEmail("gokul.nair@gmail.com");
        profileThree.setPassword("gokul@1999");
        profileThree.setGender("Male");
        profileThree.setDateOfBirth("27-05-1999");
        profileThree.setCity("Kochi");
        profileThree.setIsProfileActive(true);
        profileThree.setJobTitle("Web Developer");
        boolean ref3 = linkedIn.createLinkedInProfile(profileThree);
        System.out.println("LinkedIn Profile Created : " + ref3);
		
        LinkedInProfile profileFour = new LinkedInProfile();
        profileFour.setMemberId(4);
        profileFour.setMemberName("Aparna Pillai");
        profileFour.setEmail("aparna.pillai@gmail.com");
        profileFour.setPassword("aparna#2002");
        profileFour.setGender("Female");
        profileFour.setDateOfBirth("08-07-2002");
        profileFour.setCity("Thiruvananthapuram");
        profileFour.setIsProfileActive(true);
        profileFour.setJobTitle("UI/UX Designer");
        boolean ref4 = linkedIn.createLinkedInProfile(profileFour);
        System.out.println("LinkedIn Profile Created : " + ref4);
		
        LinkedInProfile profileFive = new LinkedInProfile();
        profileFive.setMemberId(5);
        profileFive.setMemberName("Sameer Patil");
        profileFive.setEmail("sameer.patil@gmail.com");
        profileFive.setPassword("sameer@1998");
        profileFive.setGender("Male");
        profileFive.setDateOfBirth("19-09-1998");
        profileFive.setCity("Pune");
        profileFive.setIsProfileActive(true);
        profileFive.setJobTitle("DevOps Engineer");
        boolean ref5 = linkedIn.createLinkedInProfile(profileFive);
        System.out.println("LinkedIn Profile Created : " + ref5);
		
        LinkedInProfile profileSix = new LinkedInProfile();
        profileSix.setMemberId(6);
        profileSix.setMemberName("Veena Iyer");
        profileSix.setEmail("veena.iyer@gmail.com");
        profileSix.setPassword("veena#2003");
        profileSix.setGender("Female");
        profileSix.setDateOfBirth("30-11-2003");
        profileSix.setCity("Chennai");
        profileSix.setIsProfileActive(true);
        profileSix.setJobTitle("Business Analyst");
        boolean ref6 = linkedIn.createLinkedInProfile(profileSix);
        System.out.println("LinkedIn Profile Created : " + ref6);
		
        LinkedInProfile profileSeven = new LinkedInProfile();
        profileSeven.setMemberId(7);
        profileSeven.setMemberName("Naresh Reddy");
        profileSeven.setEmail("naresh.reddy@gmail.com");
        profileSeven.setPassword("naresh@2001");
        profileSeven.setGender("Male");
        profileSeven.setDateOfBirth("12-01-2001");
        profileSeven.setCity("Hyderabad");
        profileSeven.setIsProfileActive(true);
        profileSeven.setJobTitle("Cloud Architect");
        boolean ref7 = linkedIn.createLinkedInProfile(profileSeven);
        System.out.println("LinkedIn Profile Created : " + ref7);
		
        LinkedInProfile profileEight = new LinkedInProfile();
        profileEight.setMemberId(8);
        profileEight.setMemberName("Kavya Menon");
        profileEight.setEmail("kavya.menon@gmail.com");
        profileEight.setPassword("kavya#1997");
        profileEight.setGender("Female");
        profileEight.setDateOfBirth("23-03-1997");
        profileEight.setCity("Thrissur");
        profileEight.setIsProfileActive(true);
        profileEight.setJobTitle("HR Manager");
        boolean ref8 = linkedIn.createLinkedInProfile(profileEight);
        System.out.println("LinkedIn Profile Created : " + ref8);
		
        LinkedInProfile profileNine = new LinkedInProfile();
        profileNine.setMemberId(9);
        profileNine.setMemberName("Srikanth Hegde");
        profileNine.setEmail("srikanth.hegde@gmail.com");
        profileNine.setPassword("srikanth@1996");
        profileNine.setGender("Male");
        profileNine.setDateOfBirth("04-05-1996");
        profileNine.setCity("Mangaluru");
        profileNine.setIsProfileActive(true);
        profileNine.setJobTitle("Product Manager");
        boolean ref9 = linkedIn.createLinkedInProfile(profileNine);
        System.out.println("LinkedIn Profile Created : " + ref9);
		
        LinkedInProfile profileTen = new LinkedInProfile();
        profileTen.setMemberId(10);
        profileTen.setMemberName("Hema Reddy");
        profileTen.setEmail("hema.reddy@gmail.com");
        profileTen.setPassword("hema#2004");
        profileTen.setGender("Female");
        profileTen.setDateOfBirth("15-07-2004");
        profileTen.setCity("Vijayawada");
        profileTen.setIsProfileActive(true);
        profileTen.setJobTitle("QA Engineer");
        boolean ref10 = linkedIn.createLinkedInProfile(profileTen);
        System.out.println("LinkedIn Profile Created : " + ref10);
		
        LinkedInProfile profileEleven = new LinkedInProfile();
        profileEleven.setMemberId(11);
        profileEleven.setMemberName("Kishore Rao");
        profileEleven.setEmail("kishore.rao@gmail.com");
        profileEleven.setPassword("kishore@2003");
        profileEleven.setGender("Male");
        profileEleven.setDateOfBirth("26-09-2003");
        profileEleven.setCity("Bengaluru");
        profileEleven.setIsProfileActive(true);
        profileEleven.setJobTitle("Machine Learning Engineer");
        boolean ref11 = linkedIn.createLinkedInProfile(profileEleven);
        System.out.println("LinkedIn Profile Created : " + ref11);
		
        LinkedInProfile profileTwelve = new LinkedInProfile();
        profileTwelve.setMemberId(12);
        profileTwelve.setMemberName("Lalitha Gowda");
        profileTwelve.setEmail("lalitha.gowda@gmail.com");
        profileTwelve.setPassword("lalitha#2000");
        profileTwelve.setGender("Female");
        profileTwelve.setDateOfBirth("07-11-2000");
        profileTwelve.setCity("Mysuru");
        profileTwelve.setIsProfileActive(true);
        profileTwelve.setJobTitle("Content Writer");
        boolean ref12 = linkedIn.createLinkedInProfile(profileTwelve);
        System.out.println("LinkedIn Profile Created : " + ref12);
		
        LinkedInProfile profileThirteen = new LinkedInProfile();
        profileThirteen.setMemberId(13);
        profileThirteen.setMemberName("Ramu Tiwari");
        profileThirteen.setEmail("ramu.tiwari@gmail.com");
        profileThirteen.setPassword("ramu@1995");
        profileThirteen.setGender("Male");
        profileThirteen.setDateOfBirth("18-01-1995");
        profileThirteen.setCity("Varanasi");
        profileThirteen.setIsProfileActive(true);
        profileThirteen.setJobTitle("Java Developer");
        boolean ref13 = linkedIn.createLinkedInProfile(profileThirteen);
        System.out.println("LinkedIn Profile Created : " + ref13);
		
        LinkedInProfile profileFourteen = new LinkedInProfile();
        profileFourteen.setMemberId(14);
        profileFourteen.setMemberName("Sudha Verma");
        profileFourteen.setEmail("sudha.verma@gmail.com");
        profileFourteen.setPassword("sudha#1999");
        profileFourteen.setGender("Female");
        profileFourteen.setDateOfBirth("01-03-1999");
        profileFourteen.setCity("Jaipur");
        profileFourteen.setIsProfileActive(true);
        profileFourteen.setJobTitle("Marketing Manager");
        boolean ref14 = linkedIn.createLinkedInProfile(profileFourteen);
        System.out.println("LinkedIn Profile Created : " + ref14);
		
        LinkedInProfile profileFifteen = new LinkedInProfile();
        profileFifteen.setMemberId(15);
        profileFifteen.setMemberName("Sunil Bhat");
        profileFifteen.setEmail("sunil.bhat@gmail.com");
        profileFifteen.setPassword("sunil@2002");
        profileFifteen.setGender("Male");
        profileFifteen.setDateOfBirth("12-05-2002");
        profileFifteen.setCity("Udupi");
        profileFifteen.setIsProfileActive(true);
        profileFifteen.setJobTitle("Network Engineer");
        boolean ref15 = linkedIn.createLinkedInProfile(profileFifteen);
        System.out.println("LinkedIn Profile Created : " + ref15);
		
        LinkedInProfile profileSixteen = new LinkedInProfile();
        profileSixteen.setMemberId(16);
        profileSixteen.setMemberName("Bhavani Desai");
        profileSixteen.setEmail("bhavani.desai@gmail.com");
        profileSixteen.setPassword("bhavani#2001");
        profileSixteen.setGender("Female");
        profileSixteen.setDateOfBirth("23-07-2001");
        profileSixteen.setCity("Ahmedabad");
        profileSixteen.setIsProfileActive(true);
        profileSixteen.setJobTitle("Project Manager");
        boolean ref16 = linkedIn.createLinkedInProfile(profileSixteen);
        System.out.println("LinkedIn Profile Created : " + ref16);
		
        LinkedInProfile profileSeventeen = new LinkedInProfile();
        profileSeventeen.setMemberId(17);
        profileSeventeen.setMemberName("Manohar Sharma");
        profileSeventeen.setEmail("manohar.sharma@gmail.com");
        profileSeventeen.setPassword("manohar@2003");
        profileSeventeen.setGender("Male");
        profileSeventeen.setDateOfBirth("03-09-2003");
        profileSeventeen.setCity("Lucknow");
        profileSeventeen.setIsProfileActive(true);
        profileSeventeen.setJobTitle("Python Developer");
        boolean ref17 = linkedIn.createLinkedInProfile(profileSeventeen);
        System.out.println("LinkedIn Profile Created : " + ref17);
		
        LinkedInProfile profileEighteen = new LinkedInProfile();
        profileEighteen.setMemberId(18);
        profileEighteen.setMemberName("Radha Krishnan");
        profileEighteen.setEmail("radha.krishnan@gmail.com");
        profileEighteen.setPassword("radha#1998");
        profileEighteen.setGender("Female");
        profileEighteen.setDateOfBirth("14-11-1998");
        profileEighteen.setCity("Coimbatore");
        profileEighteen.setIsProfileActive(true);
        profileEighteen.setJobTitle("ERP Consultant");
        boolean ref18 = linkedIn.createLinkedInProfile(profileEighteen);
        System.out.println("LinkedIn Profile Created : " + ref18);
		
        LinkedInProfile profileNineteen = new LinkedInProfile();
        profileNineteen.setMemberId(19);
        profileNineteen.setMemberName("Dinesh Shetty");
        profileNineteen.setEmail("dinesh.shetty@gmail.com");
        profileNineteen.setPassword("dinesh@1994");
        profileNineteen.setGender("Male");
        profileNineteen.setDateOfBirth("25-12-1994");
        profileNineteen.setCity("Hubli");
        profileNineteen.setIsProfileActive(true);
        profileNineteen.setJobTitle("Full Stack Developer");
        boolean ref19 = linkedIn.createLinkedInProfile(profileNineteen);
        System.out.println("LinkedIn Profile Created : " + ref19);

        linkedIn.getLinkedInProfileDetails();
    }
}
