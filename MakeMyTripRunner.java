class MakeMyTripRunner {

    public static void main(String args[]) {
        MakeMyTrip makeMyTrip = new MakeMyTrip();

        MakeMyTripAccount traveler1 = new MakeMyTripAccount();
        traveler1.setTravelerId(1);
        traveler1.setFullName("Sagar");
        traveler1.setEmail("sagar@gmail.com");
        traveler1.setPassword("sagaar@01");
        traveler1.setMobileNumber("9876543210");
        traveler1.setGender("Male");
        traveler1.setHomeCity("Bengaluru");
        traveler1.setIsAccountActive(true);
        boolean ref1 = makeMyTrip.createMakeMyTripAccount(traveler1);
        System.out.println("Account Created : " + ref1);

        MakeMyTripAccount traveler2 = new MakeMyTripAccount();
        traveler2.setTravelerId(2);
        traveler2.setFullName("Pooja");
        traveler2.setEmail("pooja@gmail.com");
        traveler2.setPassword("pooja@11");
        traveler2.setMobileNumber("9901234567");
        traveler2.setGender("Female");
        traveler2.setHomeCity("Nagpur");
        traveler2.setIsAccountActive(true);
        boolean ref2 = makeMyTrip.createMakeMyTripAccount(traveler2);
        System.out.println("Account Created : " + ref2);

        MakeMyTripAccount traveler3 = new MakeMyTripAccount();
        traveler3.setTravelerId(3);
        traveler3.setFullName("Aditya");
        traveler3.setEmail("aditya@gmail.com");
        traveler3.setPassword("aditya@22");
        traveler3.setMobileNumber("9415098765");
        traveler3.setGender("Male");
        traveler3.setHomeCity("Varanasi");
        traveler3.setIsAccountActive(true);
        boolean ref3 = makeMyTrip.createMakeMyTripAccount(traveler3);
        System.out.println("Account Created : " + ref3);

        MakeMyTripAccount traveler4 = new MakeMyTripAccount();
        traveler4.setTravelerId(4);
        traveler4.setFullName("Sunita");
        traveler4.setEmail("sunita@gmail.com");
        traveler4.setPassword("sunita@21");
        traveler4.setMobileNumber("9414012345");
        traveler4.setGender("Female");
        traveler4.setHomeCity("Jaipur");
        traveler4.setIsAccountActive(true);
        boolean ref4 = makeMyTrip.createMakeMyTripAccount(traveler4);
        System.out.println("Account Created : " + ref4);

        MakeMyTripAccount traveler5 = new MakeMyTripAccount();
        traveler5.setTravelerId(5);
        traveler5.setFullName("Nikhil");
        traveler5.setEmail("nikhil@gmail.com");
        traveler5.setPassword("nikhil@16");
        traveler5.setMobileNumber("9823456789");
        traveler5.setGender("Male");
        traveler5.setHomeCity("Bhopal");
        traveler5.setIsAccountActive(true);
        boolean ref5 = makeMyTrip.createMakeMyTripAccount(traveler5);
        System.out.println("Account Created : " + ref5);

        makeMyTrip.getAccountDetails();
    }
}