class LabourExecutor {

    public static void main(String[] args) {

        Labour labour1 = new Labour();
		labour1.name = "Ravi";
		labour1.salary = 15000;
		String[] idProofs1 = {"Aadhar","PAN"};
		labour1.idProofs = idProofs1;
		labour1.display();
		
        Labour labour2 = new Labour();
		labour2.name = "Suresh";
		labour2.salary = 18000;
		String[] idProofs2 = {"Aadhar","DrivingLicense"};
		labour2.idProofs = idProofs2;
		labour2.display();
		
        Labour labour3 = new Labour();
		labour3.name = "Mahesh";
		labour3.salary = 20000;
		String[] idProofs3 = {"PAN","VoterID"};
		labour3.idProofs = idProofs3;
		labour3.display();
		
        Labour labour4 = new Labour();
		labour4.name = "Ramesh";
		labour4.salary = 17000;
		String[] idProofs4 = {"Aadhar","Passport"};
		labour4.idProofs = idProofs4;
		labour4.display();

        
    }
}