class GovernmentExecutor {
	public static void main(String[] args) {
/*
		Policy policy1 = new Policy();
		policy1.policyId = 1;
		policy1.policyName = "Digital India";
		policy1.sector = "Technology";
		policy1.budget = 148000.0;
		policy1.isActive = true;
		Government government1 = new Government();
		government1.govtId = 1;
		government1.govtName = "Government of India";
		government1.country = "India";
		government1.ministries = 30;
		government1.isDemocratic = true;
		government1.policy = policy1;
		government1.getGovernmentDetails();

		Policy policy2 = new Policy();
		policy2.policyId = 2;
		policy2.policyName = "Swachh Bharat";
		policy2.sector = "Sanitation";
		policy2.budget = 62000.0;
		policy2.isActive = true;
		Government government2 = new Government();
		government2.govtId = 2;
		government2.govtName = "Government of India";
		government2.country = "India";
		government2.ministries = 30;
		government2.isDemocratic = true;
		government2.policy = policy2;
		government2.getGovernmentDetails();

		Policy policy3 = new Policy();
		policy3.policyId = 3;
		policy3.policyName = "PM Awas Yojana";
		policy3.sector = "Housing";
		policy3.budget = 180000.0;
		policy3.isActive = true;
		Government government3 = new Government();
		government3.govtId = 3;
		government3.govtName = "Government of India";
		government3.country = "India";
		government3.ministries = 30;
		government3.isDemocratic = true;
		government3.policy = policy3;
		government3.getGovernmentDetails();

		Policy policy4 = new Policy();
		policy4.policyId = 4;
		policy4.policyName = "Krishi Bhagya";
		policy4.sector = "Agriculture";
		policy4.budget = 5000.0;
		policy4.isActive = true;
		Government government4 = new Government();
		government4.govtId = 4;
		government4.govtName = "Government of Karnataka";
		government4.country = "India";
		government4.ministries = 25;
		government4.isDemocratic = true;
		government4.policy = policy4;
		government4.getGovernmentDetails();

		Policy policy5 = new Policy();
		policy5.policyId = 5;
		policy5.policyName = "Ayushman Bharat";
		policy5.sector = "Health";
		policy5.budget = 64000.0;
		policy5.isActive = true;
		Government government5 = new Government();
		government5.govtId = 5;
		government5.govtName = "Government of India";
		government5.country = "India";
		government5.ministries = 30;
		government5.isDemocratic = true;
		government5.policy = policy5;
		government5.getGovernmentDetails();

		Policy policy6 = new Policy();
		policy6.policyId = 6;
		policy6.policyName = "Make in India";
		policy6.sector = "Manufacturing";
		policy6.budget = 95000.0;
		policy6.isActive = true;
		Government government6 = new Government();
		government6.govtId = 6;
		government6.govtName = "Government of India";
		government6.country = "India";
		government6.ministries = 30;
		government6.isDemocratic = true;
		government6.policy = policy6;
		government6.getGovernmentDetails();

		Policy policy7 = new Policy();
		policy7.policyId = 7;
		policy7.policyName = "Startup India";
		policy7.sector = "Entrepreneurship";
		policy7.budget = 10000.0;
		policy7.isActive = true;
		Government government7 = new Government();
		government7.govtId = 7;
		government7.govtName = "Government of India";
		government7.country = "India";
		government7.ministries = 30;
		government7.isDemocratic = true;
		government7.policy = policy7;
		government7.getGovernmentDetails();

		Policy policy8 = new Policy();
		policy8.policyId = 8;
		policy8.policyName = "Smart Cities Mission";
		policy8.sector = "Urban Dev";
		policy8.budget = 480000.0;
		policy8.isActive = true;
		Government government8 = new Government();
		government8.govtId = 8;
		government8.govtName = "Government of India";
		government8.country = "India";
		government8.ministries = 30;
		government8.isDemocratic = true;
		government8.policy = policy8;
		government8.getGovernmentDetails();

		Policy policy9 = new Policy();
		policy9.policyId = 9;
		policy9.policyName = "KIIFB";
		policy9.sector = "Infrastructure";
		policy9.budget = 50000.0;
		policy9.isActive = true;
		Government government9 = new Government();
		government9.govtId = 9;
		government9.govtName = "Government of Kerala";
		government9.country = "India";
		government9.ministries = 20;
		government9.isDemocratic = true;
		government9.policy = policy9;
		government9.getGovernmentDetails();

		Policy policy10 = new Policy();
		policy10.policyId = 10;
		policy10.policyName = "PM Jan Dhan Yojana";
		policy10.sector = "Finance";
		policy10.budget = 12000.0;
		policy10.isActive = true;
		Government government10 = new Government();
		government10.govtId = 10;
		government10.govtName = "Government of India";
		government10.country = "India";
		government10.ministries = 30;
		government10.isDemocratic = true;
		government10.policy = policy10;
		government10.getGovernmentDetails();

		Policy policy11 = new Policy();
		policy11.policyId = 11;
		policy11.policyName = "National Education Policy";
		policy11.sector = "Education";
		policy11.budget = 93000.0;
		policy11.isActive = true;
		Government government11 = new Government();
		government11.govtId = 11;
		government11.govtName = "Government of India";
		government11.country = "India";
		government11.ministries = 30;
		government11.isDemocratic = true;
		government11.policy = policy11;
		government11.getGovernmentDetails();

		Policy policy12 = new Policy();
		policy12.policyId = 12;
		policy12.policyName = "PLI Scheme";
		policy12.sector = "Industry";
		policy12.budget = 197000.0;
		policy12.isActive = true;
		Government government12 = new Government();
		government12.govtId = 12;
		government12.govtName = "Government of India";
		government12.country = "India";
		government12.ministries = 30;
		government12.isDemocratic = true;
		government12.policy = policy12;
		government12.getGovernmentDetails();

		Policy policy13 = new Policy();
		policy13.policyId = 13;
		policy13.policyName = "Rythu Bandhu";
		policy13.sector = "Agriculture";
		policy13.budget = 12000.0;
		policy13.isActive = true;
		Government government13 = new Government();
		government13.govtId = 13;
		government13.govtName = "Government of Telangana";
		government13.country = "India";
		government13.ministries = 22;
		government13.isDemocratic = true;
		government13.policy = policy13;
		government13.getGovernmentDetails();

		Policy policy14 = new Policy();
		policy14.policyId = 14;
		policy14.policyName = "Jal Jeevan Mission";
		policy14.sector = "Water";
		policy14.budget = 360000.0;
		policy14.isActive = true;
		Government government14 = new Government();
		government14.govtId = 14;
		government14.govtName = "Government of India";
		government14.country = "India";
		government14.ministries = 30;
		government14.isDemocratic = true;
		government14.policy = policy14;
		government14.getGovernmentDetails();

		Policy policy15 = new Policy();
		policy15.policyId = 15;
		policy15.policyName = "PM Kisan";
		policy15.sector = "Agriculture";
		policy15.budget = 75000.0;
		policy15.isActive = true;
		Government government15 = new Government();
		government15.govtId = 15;
		government15.govtName = "Government of India";
		government15.country = "India";
		government15.ministries = 30;
		government15.isDemocratic = true;
		government15.policy = policy15;
		government15.getGovernmentDetails();

		Policy policy16 = new Policy();
		policy16.policyId = 16;
		policy16.policyName = "MNREGA";
		policy16.sector = "Employment";
		policy16.budget = 730000.0;
		policy16.isActive = true;
		Government government16 = new Government();
		government16.govtId = 16;
		government16.govtName = "Government of India";
		government16.country = "India";
		government16.ministries = 30;
		government16.isDemocratic = true;
		government16.policy = policy16;
		government16.getGovernmentDetails();

		Policy policy17 = new Policy();
		policy17.policyId = 17;
		policy17.policyName = "Mumbai Metro Project";
		policy17.sector = "Transport";
		policy17.budget = 250000.0;
		policy17.isActive = true;
		Government government17 = new Government();
		government17.govtId = 17;
		government17.govtName = "Government of Maharashtra";
		government17.country = "India";
		government17.ministries = 28;
		government17.isDemocratic = true;
		government17.policy = policy17;
		government17.getGovernmentDetails();

		Policy policy18 = new Policy();
		policy18.policyId = 18;
		policy18.policyName = "National Pension System";
		policy18.sector = "Finance";
		policy18.budget = 8000.0;
		policy18.isActive = true;
		Government government18 = new Government();
		government18.govtId = 18;
		government18.govtName = "Government of India";
		government18.country = "India";
		government18.ministries = 30;
		government18.isDemocratic = true;
		government18.policy = policy18;
		government18.getGovernmentDetails();

		Policy policy19 = new Policy();
		policy19.policyId = 19;
		policy19.policyName = "Atmanirbhar Bharat";
		policy19.sector = "Economy";
		policy19.budget = 200000.0;
		policy19.isActive = true;
		Government government19 = new Government();
		government19.govtId = 19;
		government19.govtName = "Government of India";
		government19.country = "India";
		government19.ministries = 30;
		government19.isDemocratic = true;
		government19.policy = policy19;
		government19.getGovernmentDetails();

		Policy policy20 = new Policy();
		policy20.policyId = 20;
		policy20.policyName = "Green Energy Policy";
		policy20.sector = "Environment";
		policy20.budget = 44000.0;
		policy20.isActive = true;
		Government government20 = new Government();
		government20.govtId = 20;
		government20.govtName = "Government of India";
		government20.country = "India";
		government20.ministries = 30;
		government20.isDemocratic = true;
		government20.policy = policy20;
		government20.getGovernmentDetails(); */

		Policy policy1 = new Policy(1, "Digital India", "Technology", 148000.0, true);
		Government government1 = new Government(1, "Government of India", "India", 30, true, policy1);
		government1.getGovernmentDetails();

		Policy policy2 = new Policy(2, "Swachh Bharat", "Sanitation", 62000.0, true);
		Government government2 = new Government(2, "Government of India", "India", 30, true, policy2);
		government2.getGovernmentDetails();

		Policy policy3 = new Policy(3, "PM Awas Yojana", "Housing", 180000.0, true);
		Government government3 = new Government(3, "Government of India", "India", 30, true, policy3);
		government3.getGovernmentDetails();

		Policy policy4 = new Policy(4, "Krishi Bhagya", "Agriculture", 5000.0, true);
		Government government4 = new Government(4, "Government of Karnataka", "India", 25, true, policy4);
		government4.getGovernmentDetails();

		Policy policy5 = new Policy(5, "Ayushman Bharat", "Health", 64000.0, true);
		Government government5 = new Government(5, "Government of India", "India", 30, true, policy5);
		government5.getGovernmentDetails();

		Policy policy6 = new Policy(6, "Make in India", "Manufacturing", 95000.0, true);
		Government government6 = new Government(6, "Government of India", "India", 30, true, policy6);
		government6.getGovernmentDetails();

		Policy policy7 = new Policy(7, "Startup India", "Entrepreneurship", 10000.0, true);
		Government government7 = new Government(7, "Government of India", "India", 30, true, policy7);
		government7.getGovernmentDetails();

		Policy policy8 = new Policy(8, "Smart Cities Mission", "Urban Dev", 480000.0, true);
		Government government8 = new Government(8, "Government of India", "India", 30, true, policy8);
		government8.getGovernmentDetails();

		Policy policy9 = new Policy(9, "KIIFB", "Infrastructure", 50000.0, true);
		Government government9 = new Government(9, "Government of Kerala", "India", 20, true, policy9);
		government9.getGovernmentDetails();

		Policy policy10 = new Policy(10, "PM Jan Dhan Yojana", "Finance", 12000.0, true);
		Government government10 = new Government(10, "Government of India", "India", 30, true, policy10);
		government10.getGovernmentDetails();

		Policy policy11 = new Policy(11, "National Education Policy", "Education", 93000.0, true);
		Government government11 = new Government(11, "Government of India", "India", 30, true, policy11);
		government11.getGovernmentDetails();

		Policy policy12 = new Policy(12, "PLI Scheme", "Industry", 197000.0, true);
		Government government12 = new Government(12, "Government of India", "India", 30, true, policy12);
		government12.getGovernmentDetails();

		Policy policy13 = new Policy(13, "Rythu Bandhu", "Agriculture", 12000.0, true);
		Government government13 = new Government(13, "Government of Telangana", "India", 22, true, policy13);
		government13.getGovernmentDetails();

		Policy policy14 = new Policy(14, "Jal Jeevan Mission", "Water", 360000.0, true);
		Government government14 = new Government(14, "Government of India", "India", 30, true, policy14);
		government14.getGovernmentDetails();

		Policy policy15 = new Policy(15, "PM Kisan", "Agriculture", 75000.0, true);
		Government government15 = new Government(15, "Government of India", "India", 30, true, policy15);
		government15.getGovernmentDetails();

		Policy policy16 = new Policy(16, "MNREGA", "Employment", 730000.0, true);
		Government government16 = new Government(16, "Government of India", "India", 30, true, policy16);
		government16.getGovernmentDetails();

		Policy policy17 = new Policy(17, "Mumbai Metro Project", "Transport", 250000.0, true);
		Government government17 = new Government(17, "Government of Maharashtra", "India", 28, true, policy17);
		government17.getGovernmentDetails();

		Policy policy18 = new Policy(18, "National Pension System", "Finance", 8000.0, true);
		Government government18 = new Government(18, "Government of India", "India", 30, true, policy18);
		government18.getGovernmentDetails();

		Policy policy19 = new Policy(19, "Atmanirbhar Bharat", "Economy", 200000.0, true);
		Government government19 = new Government(19, "Government of India", "India", 30, true, policy19);
		government19.getGovernmentDetails();

		Policy policy20 = new Policy(20, "Green Energy Policy", "Environment", 44000.0, true);
		Government government20 = new Government(20, "Government of India", "India", 30, true, policy20);
		government20.getGovernmentDetails();


	}
}