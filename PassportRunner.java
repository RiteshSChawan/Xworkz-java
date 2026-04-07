class PassportRunner {

    public static void main(String args[]) {
        Passport passport = new Passport();

        PassportAccount applicant1 = new PassportAccount();
        applicant1.setApplicantId(1);
        applicant1.setFullName("Aarav Sharma");
        applicant1.setEmail("aaravsharma@gmail.com");
        applicant1.setMobileNumber("9876543210");
        applicant1.setGender("Male");
        applicant1.setDateOfBirth("15-08-1995");
        applicant1.setAddress("12, MG Road, Bengaluru, Karnataka");
        applicant1.setIsApplicationActive(true);
        boolean ref1 = passport.createPassportApplication(applicant1);
        System.out.println("Application Created : " + ref1);

        PassportAccount applicant2 = new PassportAccount();
        applicant2.setApplicantId(2);
        applicant2.setFullName("Priya Nair");
        applicant2.setEmail("priyanair@gmail.com");
        applicant2.setMobileNumber("9845012345");
        applicant2.setGender("Female");
        applicant2.setDateOfBirth("22-03-1998");
        applicant2.setAddress("45, Pattom, Thiruvananthapuram, Kerala");
        applicant2.setIsApplicationActive(true);
        boolean ref2 = passport.createPassportApplication(applicant2);
        System.out.println("Application Created : " + ref2);

        PassportAccount applicant3 = new PassportAccount();
        applicant3.setApplicantId(3);
        applicant3.setFullName("Rohit Verma");
        applicant3.setEmail("rohitverma@gmail.com");
        applicant3.setMobileNumber("9712345678");
        applicant3.setGender("Male");
        applicant3.setDateOfBirth("05-07-1992");
        applicant3.setAddress("78, Shivaji Nagar, Pune, Maharashtra");
        applicant3.setIsApplicationActive(true);
        boolean ref3 = passport.createPassportApplication(applicant3);
        System.out.println("Application Created : " + ref3);

        PassportAccount applicant4 = new PassportAccount();
        applicant4.setApplicantId(4);
        applicant4.setFullName("Sneha Iyer");
        applicant4.setEmail("snehaiyer@gmail.com");
        applicant4.setMobileNumber("9600123456");
        applicant4.setGender("Female");
        applicant4.setDateOfBirth("18-12-1996");
        applicant4.setAddress("33, Anna Nagar, Chennai, Tamil Nadu");
        applicant4.setIsApplicationActive(true);
        boolean ref4 = passport.createPassportApplication(applicant4);
        System.out.println("Application Created : " + ref4);

        PassportAccount applicant5 = new PassportAccount();
        applicant5.setApplicantId(5);
        applicant5.setFullName("Karan Mehta");
        applicant5.setEmail("karanmehta@gmail.com");
        applicant5.setMobileNumber("9820056789");
        applicant5.setGender("Male");
        applicant5.setDateOfBirth("30-09-1990");
        applicant5.setAddress("101, Andheri West, Mumbai, Maharashtra");
        applicant5.setIsApplicationActive(true);
        boolean ref5 = passport.createPassportApplication(applicant5);
        System.out.println("Application Created : " + ref5);

        passport.getApplicationDetails();
    }
}