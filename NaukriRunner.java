class NaukriRunner {

    public static void main(String args[]) {
        Naukri naukri = new Naukri();

        NaukriProfile profileOne = new NaukriProfile();
        profileOne.setCandidateId(1);
        profileOne.setCandidateName("Nirupam Das");
        profileOne.setEmail("nirupam.das@gmail.com");
        profileOne.setPassword("nirupam@2001");
        profileOne.setGender("Male");
        profileOne.setDateOfBirth("22-01-2001");
        profileOne.setCity("Kolkata");
        profileOne.setIsProfileActive(true);
        profileOne.setQualification("B.Tech CSE");
        boolean ref1 = naukri.createNaukriProfile(profileOne);
        System.out.println("Naukri Profile Created : " + ref1);
		
        NaukriProfile profileTwo = new NaukriProfile();
        profileTwo.setCandidateId(2);
        profileTwo.setCandidateName("Ojaswini Sharma");
        profileTwo.setEmail("ojaswini.sharma@gmail.com");
        profileTwo.setPassword("ojasw#2002");
        profileTwo.setGender("Female");
        profileTwo.setDateOfBirth("04-03-2002");
        profileTwo.setCity("Delhi");
        profileTwo.setIsProfileActive(true);
        profileTwo.setQualification("MBA");
        boolean ref2 = naukri.createNaukriProfile(profileTwo);
        System.out.println("Naukri Profile Created : " + ref2);
		
        NaukriProfile profileThree = new NaukriProfile();
        profileThree.setCandidateId(3);
        profileThree.setCandidateName("Partha Nair");
        profileThree.setEmail("partha.nair@gmail.com");
        profileThree.setPassword("partha@2000");
        profileThree.setGender("Male");
        profileThree.setDateOfBirth("15-05-2000");
        profileThree.setCity("Kochi");
        profileThree.setIsProfileActive(true);
        profileThree.setQualification("B.Sc IT");
        boolean ref3 = naukri.createNaukriProfile(profileThree);
        System.out.println("Naukri Profile Created : " + ref3);
		
        NaukriProfile profileFour = new NaukriProfile();
        profileFour.setCandidateId(4);
        profileFour.setCandidateName("Pramila Menon");
        profileFour.setEmail("pramila.menon@gmail.com");
        profileFour.setPassword("pramila#2003");
        profileFour.setGender("Female");
        profileFour.setDateOfBirth("26-07-2003");
        profileFour.setCity("Thrissur");
        profileFour.setIsProfileActive(true);
        profileFour.setQualification("BCA");
        boolean ref4 = naukri.createNaukriProfile(profileFour);
        System.out.println("Naukri Profile Created : " + ref4);
		
        NaukriProfile profileFive = new NaukriProfile();
        profileFive.setCandidateId(5);
        profileFive.setCandidateName("Qadir Patil");
        profileFive.setEmail("qadir.patil@gmail.com");
        profileFive.setPassword("qadir@1999");
        profileFive.setGender("Male");
        profileFive.setDateOfBirth("07-09-1999");
        profileFive.setCity("Pune");
        profileFive.setIsProfileActive(true);
        profileFive.setQualification("B.E Mechanical");
        boolean ref5 = naukri.createNaukriProfile(profileFive);
        System.out.println("Naukri Profile Created : " + ref5);
		
        NaukriProfile profileSix = new NaukriProfile();
        profileSix.setCandidateId(6);
        profileSix.setCandidateName("Rajalakshmi Iyer");
        profileSix.setEmail("rajalakshmi.iyer@gmail.com");
        profileSix.setPassword("rajal#2000");
        profileSix.setGender("Female");
        profileSix.setDateOfBirth("18-11-2000");
        profileSix.setCity("Chennai");
        profileSix.setIsProfileActive(true);
        profileSix.setQualification("M.Tech");
        boolean ref6 = naukri.createNaukriProfile(profileSix);
        System.out.println("Naukri Profile Created : " + ref6);
		
        NaukriProfile profileSeven = new NaukriProfile();
        profileSeven.setCandidateId(7);
        profileSeven.setCandidateName("Sathya Reddy");
        profileSeven.setEmail("sathya.reddy@gmail.com");
        profileSeven.setPassword("sathya@2003");
        profileSeven.setGender("Male");
        profileSeven.setDateOfBirth("29-01-2003");
        profileSeven.setCity("Hyderabad");
        profileSeven.setIsProfileActive(true);
        profileSeven.setQualification("B.Tech ECE");
        boolean ref7 = naukri.createNaukriProfile(profileSeven);
        System.out.println("Naukri Profile Created : " + ref7);
		
        NaukriProfile profileEight = new NaukriProfile();
        profileEight.setCandidateId(8);
        profileEight.setCandidateName("Tanuja Pillai");
        profileEight.setEmail("tanuja.pillai@gmail.com");
        profileEight.setPassword("tanuja#2005");
        profileEight.setGender("Female");
        profileEight.setDateOfBirth("10-03-2005");
        profileEight.setCity("Thiruvananthapuram");
        profileEight.setIsProfileActive(true);
        profileEight.setQualification("B.Sc Computer");
        boolean ref8 = naukri.createNaukriProfile(profileEight);
        System.out.println("Naukri Profile Created : " + ref8);
		
        NaukriProfile profileNine = new NaukriProfile();
        profileNine.setCandidateId(9);
        profileNine.setCandidateName("Upendra Hegde");
        profileNine.setEmail("upendra.hegde@gmail.com");
        profileNine.setPassword("upendra@1998");
        profileNine.setGender("Male");
        profileNine.setDateOfBirth("21-05-1998");
        profileNine.setCity("Mangaluru");
        profileNine.setIsProfileActive(true);
        profileNine.setQualification("B.E Civil");
        boolean ref9 = naukri.createNaukriProfile(profileNine);
        System.out.println("Naukri Profile Created : " + ref9);
		
        NaukriProfile profileTen = new NaukriProfile();
        profileTen.setCandidateId(10);
        profileTen.setCandidateName("Vasudha Gowda");
        profileTen.setEmail("vasudha.gowda@gmail.com");
        profileTen.setPassword("vasudha#2002");
        profileTen.setGender("Female");
        profileTen.setDateOfBirth("02-07-2002");
        profileTen.setCity("Mysuru");
        profileTen.setIsProfileActive(true);
        profileTen.setQualification("M.Com");
        boolean ref10 = naukri.createNaukriProfile(profileTen);
        System.out.println("Naukri Profile Created : " + ref10);
		
        NaukriProfile profileEleven = new NaukriProfile();
        profileEleven.setCandidateId(11);
        profileEleven.setCandidateName("Waman Rao");
        profileEleven.setEmail("waman.rao@gmail.com");
        profileEleven.setPassword("waman@2001");
        profileEleven.setGender("Male");
        profileEleven.setDateOfBirth("13-09-2001");
        profileEleven.setCity("Vijayawada");
        profileEleven.setIsProfileActive(true);
        profileEleven.setQualification("B.Tech EEE");
        boolean ref11 = naukri.createNaukriProfile(profileEleven);
        System.out.println("Naukri Profile Created : " + ref11);
		
        NaukriProfile profileTwelve = new NaukriProfile();
        profileTwelve.setCandidateId(12);
        profileTwelve.setCandidateName("Yamini Verma");
        profileTwelve.setEmail("yamini.verma@gmail.com");
        profileTwelve.setPassword("yamini#1997");
        profileTwelve.setGender("Female");
        profileTwelve.setDateOfBirth("24-11-1997");
        profileTwelve.setCity("Jaipur");
        profileTwelve.setIsProfileActive(true);
        profileTwelve.setQualification("BBA");
        boolean ref12 = naukri.createNaukriProfile(profileTwelve);
        System.out.println("Naukri Profile Created : " + ref12);
		
        NaukriProfile profileThirteen = new NaukriProfile();
        profileThirteen.setCandidateId(13);
        profileThirteen.setCandidateName("Zubair Tiwari");
        profileThirteen.setEmail("zubair.tiwari@gmail.com");
        profileThirteen.setPassword("zubair@1996");
        profileThirteen.setGender("Male");
        profileThirteen.setDateOfBirth("07-01-1996");
        profileThirteen.setCity("Varanasi");
        profileThirteen.setIsProfileActive(true);
        profileThirteen.setQualification("B.Tech IT");
        boolean ref13 = naukri.createNaukriProfile(profileThirteen);
        System.out.println("Naukri Profile Created : " + ref13);
		
        NaukriProfile profileFourteen = new NaukriProfile();
        profileFourteen.setCandidateId(14);
        profileFourteen.setCandidateName("Archana Desai");
        profileFourteen.setEmail("archana.desai@gmail.com");
        profileFourteen.setPassword("archana#2004");
        profileFourteen.setGender("Female");
        profileFourteen.setDateOfBirth("18-03-2004");
        profileFourteen.setCity("Ahmedabad");
        profileFourteen.setIsProfileActive(true);
        profileFourteen.setQualification("MCA");
        boolean ref14 = naukri.createNaukriProfile(profileFourteen);
        System.out.println("Naukri Profile Created : " + ref14);
		
        NaukriProfile profileFifteen = new NaukriProfile();
        profileFifteen.setCandidateId(15);
        profileFifteen.setCandidateName("Bhuvan Shetty");
        profileFifteen.setEmail("bhuvan.shetty@gmail.com");
        profileFifteen.setPassword("bhuvan@2000");
        profileFifteen.setGender("Male");
        profileFifteen.setDateOfBirth("29-05-2000");
        profileFifteen.setCity("Udupi");
        profileFifteen.setIsProfileActive(true);
        profileFifteen.setQualification("B.E Electronics");
        boolean ref15 = naukri.createNaukriProfile(profileFifteen);
        System.out.println("Naukri Profile Created : " + ref15);
		
        NaukriProfile profileSixteen = new NaukriProfile();
        profileSixteen.setCandidateId(16);
        profileSixteen.setCandidateName("Chaithra Gupta");
        profileSixteen.setEmail("chaithra.gupta@gmail.com");
        profileSixteen.setPassword("chaithra#1999");
        profileSixteen.setGender("Female");
        profileSixteen.setDateOfBirth("10-07-1999");
        profileSixteen.setCity("Lucknow");
        profileSixteen.setIsProfileActive(true);
        profileSixteen.setQualification("B.Tech CSE");
        boolean ref16 = naukri.createNaukriProfile(profileSixteen);
        System.out.println("Naukri Profile Created : " + ref16);
		
        NaukriProfile profileSeventeen = new NaukriProfile();
        profileSeventeen.setCandidateId(17);
        profileSeventeen.setCandidateName("Dhanush Bhat");
        profileSeventeen.setEmail("dhanush.bhat@gmail.com");
        profileSeventeen.setPassword("dhanush@2003");
        profileSeventeen.setGender("Male");
        profileSeventeen.setDateOfBirth("21-09-2003");
        profileSeventeen.setCity("Hubli");
        profileSeventeen.setIsProfileActive(true);
        profileSeventeen.setQualification("M.Tech");
        boolean ref17 = naukri.createNaukriProfile(profileSeventeen);
        System.out.println("Naukri Profile Created : " + ref17);
		
        NaukriProfile profileEighteen = new NaukriProfile();
        profileEighteen.setCandidateId(18);
        profileEighteen.setCandidateName("Esha Krishnan");
        profileEighteen.setEmail("esha.krishnan@gmail.com");
        profileEighteen.setPassword("esha#2001");
        profileEighteen.setGender("Female");
        profileEighteen.setDateOfBirth("02-11-2001");
        profileEighteen.setCity("Coimbatore");
        profileEighteen.setIsProfileActive(true);
        profileEighteen.setQualification("B.Sc Math");
        boolean ref18 = naukri.createNaukriProfile(profileEighteen);
        System.out.println("Naukri Profile Created : " + ref18);
		
        NaukriProfile profileNineteen = new NaukriProfile();
        profileNineteen.setCandidateId(19);
        profileNineteen.setCandidateName("Farhan Sharma");
        profileNineteen.setEmail("farhan.sharma@gmail.com");
        profileNineteen.setPassword("farhan@1992");
        profileNineteen.setGender("Male");
        profileNineteen.setDateOfBirth("15-01-1992");
        profileNineteen.setCity("Bengaluru");
        profileNineteen.setIsProfileActive(true);
        profileNineteen.setQualification("PhD Computer Science");
        boolean ref19 = naukri.createNaukriProfile(profileNineteen);
        System.out.println("Naukri Profile Created : " + ref19);

        naukri.getNaukriProfileDetails();
    }
}
