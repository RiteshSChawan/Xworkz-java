class InstagramRunner {

    public static void main(String args[]) {
        Instagram instagram = new Instagram();

        InstagramAccount user1 = new InstagramAccount();
        user1.setUserId(1);
        user1.setUserName("ritesh_11");
        user1.setEmail("ritesh11@gmail.com");
        user1.setPassword("ritesh@Insta95");
        user1.setGender("Male");
        user1.setDateOfBirth("11-11-2004");
        user1.setBio("Rcbian | Davanagere");
        user1.setIsAccountActive(true);
        boolean ref1 = instagram.createInstagramAccount(user1);
        System.out.println("Account Created : " + ref1);

        InstagramAccount user2 = new InstagramAccount();
        user2.setUserId(2);
        user2.setUserName("prateek_10");
        user2.setEmail("prateek@gmail.com");
        user2.setPassword("prateek@Insta98");
        user2.setGender("Male");
        user2.setDateOfBirth("22-03-2004");
        user2.setBio("Traveller | Sirsi");
        user2.setIsAccountActive(true);
        boolean ref2 = instagram.createInstagramAccount(user2);
        System.out.println("Account Created : " + ref2);

        InstagramAccount user3 = new InstagramAccount();
        user3.setUserId(3);
        user3.setUserName("kalmesh_04");
        user3.setEmail("kalmesh@gmail.com");
        user3.setPassword("kalmesh@04");
        user3.setGender("Male");
        user3.setDateOfBirth("05-03-2004");
        user3.setBio("Cricket fan | Bagalkote");
        user3.setIsAccountActive(true);
        boolean ref3 = instagram.createInstagramAccount(user3);
        System.out.println("Account Created : " + ref3);

        InstagramAccount user4 = new InstagramAccount();
        user4.setUserId(4);
        user4.setUserName("kallesh_05");
        user4.setEmail("kallesh@gmail.com");
        user4.setPassword("kallesh@05");
        user4.setGender("Male");
        user4.setDateOfBirth("18-07-2004");
        user4.setBio("Solo Traveller | Davanagere");
        user4.setIsAccountActive(true);
        boolean ref4 = instagram.createInstagramAccount(user4);
        System.out.println("Account Created : " + ref4);

        InstagramAccount user5 = new InstagramAccount();
        user5.setUserId(5);
        user5.setUserName("Tejas_13");
        user5.setEmail("Tejas@gmail.com");
        user5.setPassword("tejas@13");
        user5.setGender("Male");
        user5.setDateOfBirth("30-09-2004");
        user5.setBio("Foodie | Bengaluru");
        user5.setIsAccountActive(true);
        boolean ref5 = instagram.createInstagramAccount(user5);
        System.out.println("Account Created : " + ref5);

        instagram.getAccountDetails();
    }
}