class PaytmRunner {

    public static void main(String args[]) {
        Paytm paytm = new Paytm();

        PaytmProfile profileOne = new PaytmProfile();
        profileOne.setWalletId(1);
        profileOne.setAccountHolderName("Gopal Sharma");
        profileOne.setEmail("gopal.sharma@gmail.com");
        profileOne.setPassword("gopal@2002");
        profileOne.setGender("Male");
        profileOne.setDateOfBirth("26-02-2002");
        profileOne.setCity("Delhi");
        profileOne.setIsProfileActive(true);
        profileOne.setMobileNumber("9711234567");
        boolean ref1 = paytm.createPaytmProfile(profileOne);
        System.out.println("Paytm Profile Created : " + ref1);
		
        PaytmProfile profileTwo = new PaytmProfile();
        profileTwo.setWalletId(2);
        profileTwo.setAccountHolderName("Hemalatha Nair");
        profileTwo.setEmail("hemalatha.nair@gmail.com");
        profileTwo.setPassword("hema#2003");
        profileTwo.setGender("Female");
        profileTwo.setDateOfBirth("09-04-2003");
        profileTwo.setCity("Kochi");
        profileTwo.setIsProfileActive(true);
        profileTwo.setMobileNumber("9612345678");
        boolean ref2 = paytm.createPaytmProfile(profileTwo);
        System.out.println("Paytm Profile Created : " + ref2);
		
        PaytmProfile profileThree = new PaytmProfile();
        profileThree.setWalletId(3);
        profileThree.setAccountHolderName("Irfan Patil");
        profileThree.setEmail("irfan.patil@gmail.com");
        profileThree.setPassword("irfan@2001");
        profileThree.setGender("Male");
        profileThree.setDateOfBirth("20-06-2001");
        profileThree.setCity("Pune");
        profileThree.setIsProfileActive(true);
        profileThree.setMobileNumber("9513456789");
        boolean ref3 = paytm.createPaytmProfile(profileThree);
        System.out.println("Paytm Profile Created : " + ref3);
		
        PaytmProfile profileFour = new PaytmProfile();
        profileFour.setWalletId(4);
        profileFour.setAccountHolderName("Jayashree Menon");
        profileFour.setEmail("jayashree.menon@gmail.com");
        profileFour.setPassword("jaya#2004");
        profileFour.setGender("Female");
        profileFour.setDateOfBirth("01-08-2004");
        profileFour.setCity("Thrissur");
        profileFour.setIsProfileActive(true);
        profileFour.setMobileNumber("9414567890");
        boolean ref4 = paytm.createPaytmProfile(profileFour);
        System.out.println("Paytm Profile Created : " + ref4);
		
        PaytmProfile profileFive = new PaytmProfile();
        profileFive.setWalletId(5);
        profileFive.setAccountHolderName("Kiran Reddy");
        profileFive.setEmail("kiran.reddy2@gmail.com");
        profileFive.setPassword("kiran@1999");
        profileFive.setGender("Male");
        profileFive.setDateOfBirth("12-10-1999");
        profileFive.setCity("Hyderabad");
        profileFive.setIsProfileActive(true);
        profileFive.setMobileNumber("9315678901");
        boolean ref5 = paytm.createPaytmProfile(profileFive);
        System.out.println("Paytm Profile Created : " + ref5);
		
        PaytmProfile profileSix = new PaytmProfile();
        profileSix.setWalletId(6);
        profileSix.setAccountHolderName("Leela Iyer");
        profileSix.setEmail("leela.iyer@gmail.com");
        profileSix.setPassword("leela#2000");
        profileSix.setGender("Female");
        profileSix.setDateOfBirth("23-12-2000");
        profileSix.setCity("Chennai");
        profileSix.setIsProfileActive(true);
        profileSix.setMobileNumber("9216789012");
        boolean ref6 = paytm.createPaytmProfile(profileSix);
        System.out.println("Paytm Profile Created : " + ref6);
		
        PaytmProfile profileSeven = new PaytmProfile();
        profileSeven.setWalletId(7);
        profileSeven.setAccountHolderName("Madhukar Hegde");
        profileSeven.setEmail("madhukar.hegde@gmail.com");
        profileSeven.setPassword("madhu@2003");
        profileSeven.setGender("Male");
        profileSeven.setDateOfBirth("05-02-2003");
        profileSeven.setCity("Mangaluru");
        profileSeven.setIsProfileActive(true);
        profileSeven.setMobileNumber("9117890123");
        boolean ref7 = paytm.createPaytmProfile(profileSeven);
        System.out.println("Paytm Profile Created : " + ref7);
		
        PaytmProfile profileEight = new PaytmProfile();
        profileEight.setWalletId(8);
        profileEight.setAccountHolderName("Nagalakshmi Pillai");
        profileEight.setEmail("nagalakshmi.pillai@gmail.com");
        profileEight.setPassword("naga#2005");
        profileEight.setGender("Female");
        profileEight.setDateOfBirth("16-04-2005");
        profileEight.setCity("Thiruvananthapuram");
        profileEight.setIsProfileActive(true);
        profileEight.setMobileNumber("9018901234");
        boolean ref8 = paytm.createPaytmProfile(profileEight);
        System.out.println("Paytm Profile Created : " + ref8);
		
        PaytmProfile profileNine = new PaytmProfile();
        profileNine.setWalletId(9);
        profileNine.setAccountHolderName("Omkar Rao");
        profileNine.setEmail("omkar.rao@gmail.com");
        profileNine.setPassword("omkar@1998");
        profileNine.setGender("Male");
        profileNine.setDateOfBirth("27-06-1998");
        profileNine.setCity("Vijayawada");
        profileNine.setIsProfileActive(true);
        profileNine.setMobileNumber("8919012345");
        boolean ref9 = paytm.createPaytmProfile(profileNine);
        System.out.println("Paytm Profile Created : " + ref9);
		
        PaytmProfile profileTen = new PaytmProfile();
        profileTen.setWalletId(10);
        profileTen.setAccountHolderName("Padmavathi Gowda");
        profileTen.setEmail("padmavathi.gowda@gmail.com");
        profileTen.setPassword("padma#2002");
        profileTen.setGender("Female");
        profileTen.setDateOfBirth("08-08-2002");
        profileTen.setCity("Mysuru");
        profileTen.setIsProfileActive(true);
        profileTen.setMobileNumber("8820123456");
        boolean ref10 = paytm.createPaytmProfile(profileTen);
        System.out.println("Paytm Profile Created : " + ref10);
		
        PaytmProfile profileEleven = new PaytmProfile();
        profileEleven.setWalletId(11);
        profileEleven.setAccountHolderName("Rajiv Shetty");
        profileEleven.setEmail("rajiv.shetty@gmail.com");
        profileEleven.setPassword("rajiv@2001");
        profileEleven.setGender("Male");
        profileEleven.setDateOfBirth("19-10-2001");
        profileEleven.setCity("Udupi");
        profileEleven.setIsProfileActive(true);
        profileEleven.setMobileNumber("8721234567");
        boolean ref11 = paytm.createPaytmProfile(profileEleven);
        System.out.println("Paytm Profile Created : " + ref11);
		
        PaytmProfile profileTwelve = new PaytmProfile();
        profileTwelve.setWalletId(12);
        profileTwelve.setAccountHolderName("Savithri Verma");
        profileTwelve.setEmail("savithri.verma@gmail.com");
        profileTwelve.setPassword("savithri#1997");
        profileTwelve.setGender("Female");
        profileTwelve.setDateOfBirth("30-12-1997");
        profileTwelve.setCity("Jaipur");
        profileTwelve.setIsProfileActive(true);
        profileTwelve.setMobileNumber("8622345678");
        boolean ref12 = paytm.createPaytmProfile(profileTwelve);
        System.out.println("Paytm Profile Created : " + ref12);
		
        PaytmProfile profileThirteen = new PaytmProfile();
        profileThirteen.setWalletId(13);
        profileThirteen.setAccountHolderName("Trilok Tiwari");
        profileThirteen.setEmail("trilok.tiwari@gmail.com");
        profileThirteen.setPassword("trilok@1996");
        profileThirteen.setGender("Male");
        profileThirteen.setDateOfBirth("11-02-1996");
        profileThirteen.setCity("Varanasi");
        profileThirteen.setIsProfileActive(true);
        profileThirteen.setMobileNumber("8523456789");
        boolean ref13 = paytm.createPaytmProfile(profileThirteen);
        System.out.println("Paytm Profile Created : " + ref13);
		
        PaytmProfile profileFourteen = new PaytmProfile();
        profileFourteen.setWalletId(14);
        profileFourteen.setAccountHolderName("Uma Desai");
        profileFourteen.setEmail("uma.desai@gmail.com");
        profileFourteen.setPassword("uma#2004");
        profileFourteen.setGender("Female");
        profileFourteen.setDateOfBirth("22-04-2004");
        profileFourteen.setCity("Ahmedabad");
        profileFourteen.setIsProfileActive(true);
        profileFourteen.setMobileNumber("8424567890");
        boolean ref14 = paytm.createPaytmProfile(profileFourteen);
        System.out.println("Paytm Profile Created : " + ref14);
		
        PaytmProfile profileFifteen = new PaytmProfile();
        profileFifteen.setWalletId(15);
        profileFifteen.setAccountHolderName("Vasanth Bhat");
        profileFifteen.setEmail("vasanth.bhat@gmail.com");
        profileFifteen.setPassword("vasanth@2000");
        profileFifteen.setGender("Male");
        profileFifteen.setDateOfBirth("03-06-2000");
        profileFifteen.setCity("Hubli");
        profileFifteen.setIsProfileActive(true);
        profileFifteen.setMobileNumber("8325678901");
        boolean ref15 = paytm.createPaytmProfile(profileFifteen);
        System.out.println("Paytm Profile Created : " + ref15);
		
        PaytmProfile profileSixteen = new PaytmProfile();
        profileSixteen.setWalletId(16);
        profileSixteen.setAccountHolderName("Wahida Gupta");
        profileSixteen.setEmail("wahida.gupta@gmail.com");
        profileSixteen.setPassword("wahida#1999");
        profileSixteen.setGender("Female");
        profileSixteen.setDateOfBirth("14-08-1999");
        profileSixteen.setCity("Lucknow");
        profileSixteen.setIsProfileActive(true);
        profileSixteen.setMobileNumber("8226789012");
        boolean ref16 = paytm.createPaytmProfile(profileSixteen);
        System.out.println("Paytm Profile Created : " + ref16);
		
        PaytmProfile profileSeventeen = new PaytmProfile();
        profileSeventeen.setWalletId(17);
        profileSeventeen.setAccountHolderName("Xavier Krishnan");
        profileSeventeen.setEmail("xavier.krishnan@gmail.com");
        profileSeventeen.setPassword("xavier@2003");
        profileSeventeen.setGender("Male");
        profileSeventeen.setDateOfBirth("25-10-2003");
        profileSeventeen.setCity("Coimbatore");
        profileSeventeen.setIsProfileActive(true);
        profileSeventeen.setMobileNumber("8127890123");
        boolean ref17 = paytm.createPaytmProfile(profileSeventeen);
        System.out.println("Paytm Profile Created : " + ref17);
		
        PaytmProfile profileEighteen = new PaytmProfile();
        profileEighteen.setWalletId(18);
        profileEighteen.setAccountHolderName("Yashoda Sharma");
        profileEighteen.setEmail("yashoda.sharma@gmail.com");
        profileEighteen.setPassword("yashoda#2001");
        profileEighteen.setGender("Female");
        profileEighteen.setDateOfBirth("06-12-2001");
        profileEighteen.setCity("Bengaluru");
        profileEighteen.setIsProfileActive(true);
        profileEighteen.setMobileNumber("8028901234");
        boolean ref18 = paytm.createPaytmProfile(profileEighteen);
        System.out.println("Paytm Profile Created : " + ref18);
		
        PaytmProfile profileNineteen = new PaytmProfile();
        profileNineteen.setWalletId(19);
        profileNineteen.setAccountHolderName("Zafaruddin Rao");
        profileNineteen.setEmail("zafaruddin.rao@gmail.com");
        profileNineteen.setPassword("zafar@1991");
        profileNineteen.setGender("Male");
        profileNineteen.setDateOfBirth("17-02-1991");
        profileNineteen.setCity("Hubli");
        profileNineteen.setIsProfileActive(true);
        profileNineteen.setMobileNumber("7929012345");
        boolean ref19 = paytm.createPaytmProfile(profileNineteen);
        System.out.println("Paytm Profile Created : " + ref19);

        paytm.getPaytmProfileDetails();
    }
}
