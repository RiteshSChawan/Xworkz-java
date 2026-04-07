class FacebookRunner{
	
	public static void main(String args[]){
		Facebook facebook = new Facebook();
		
		UserAccount user1 = new UserAccount();
		user1.setUserId(1);
		user1.setUserName("Ritesh");
		user1.setEmail("ritesh11@gmail.com");
		user1.setPassword("ritu123");
		user1.setGender("Male");
		user1.setDateOfBirth("11-11-2004");
		user1.setLocation("Davanagere");
		user1.setIsAccountActive(true);	
		boolean ref1 = facebook.createUserAccount(user1);
		System.out.println("Account Created : "+ref1);
		
		UserAccount user2 = new UserAccount();
		user2.setUserId(2);
		user2.setUserName("Akash");
		user2.setEmail("akash02@gmail.com");
		user2.setPassword("akku02");
		user2.setGender("Male");
		user2.setDateOfBirth("01-01-2004");
		user2.setLocation("Bengaluru");
		user2.setIsAccountActive(true);
		boolean ref2 = facebook.createUserAccount(user1);
		System.out.println("Account Created : "+ref2);
	
        UserAccount user3 = new UserAccount();
        user3.setUserId(3);
        user3.setUserName("Rohit Verma");
        user3.setEmail("rohitverma@gmail.com");
        user3.setPassword("rohit456");
        user3.setGender("Male");
        user3.setDateOfBirth("05-07-2001");
        user3.setLocation("Mysore");
        user3.setIsAccountActive(true);
        boolean ref3 = facebook.createUserAccount(user3);
        System.out.println("Account Created : " + ref3);
 
        UserAccount user4 = new UserAccount();
        user4.setUserId(4);
        user4.setUserName("Sneha Iyer");
        user4.setEmail("snehaiyer@gmail.com");
        user4.setPassword("sneha@789");
        user4.setGender("Female");
        user4.setDateOfBirth("18-12-2002");
        user4.setLocation("Udupi");
        user4.setIsAccountActive(true);
        boolean ref4 = facebook.createUserAccount(user4);
        System.out.println("Account Created : " + ref4);
 
        UserAccount user5 = new UserAccount();
        user5.setUserId(5);
        user5.setUserName("Pratheek");
        user5.setEmail("pratheek@gmail.com");
        user5.setPassword("pratheek2000");
        user5.setGender("Male");
        user5.setDateOfBirth("30-09-2000");
        user5.setLocation("Sirsi");
        user5.setIsAccountActive(true);
        boolean ref5 = facebook.createUserAccount(user5);
        System.out.println("Account Created : " + ref5);
	
		facebook.getUserDetails();
	
	}
}