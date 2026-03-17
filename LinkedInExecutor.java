class LinkedInExecutor {
	public static void main(String[] args) {
/*
		Profile profile1 = new Profile();
		profile1.profileId = 1;
		profile1.fullName = "Narayana Murthy";
		profile1.jobTitle = "Founder";
		profile1.skills = "Java Python Leadership";
		profile1.connectionCount = 30000.0;
		LinkedIn linkedIn1 = new LinkedIn();
		linkedIn1.linkedInId = 1;
		linkedIn1.companyPage = "Infosys";
		linkedIn1.industry = "IT Services";
		linkedIn1.followers = 5000000;
		linkedIn1.isVerified = true;
		linkedIn1.profile = profile1;
		linkedIn1.getLinkedInDetails();

		Profile profile2 = new Profile();
		profile2.profileId = 2;
		profile2.fullName = "Rajesh Gopinathan";
		profile2.jobTitle = "CEO";
		profile2.skills = "Strategy Management Consulting";
		profile2.connectionCount = 25000.0;
		LinkedIn linkedIn2 = new LinkedIn();
		linkedIn2.linkedInId = 2;
		linkedIn2.companyPage = "TCS";
		linkedIn2.industry = "IT Services";
		linkedIn2.followers = 4500000;
		linkedIn2.isVerified = true;
		linkedIn2.profile = profile2;
		linkedIn2.getLinkedInDetails();

		Profile profile3 = new Profile();
		profile3.profileId = 3;
		profile3.fullName = "Sundar Pichai";
		profile3.jobTitle = "CEO Google";
		profile3.skills = "AI Cloud Leadership";
		profile3.connectionCount = 15000000.0;
		LinkedIn linkedIn3 = new LinkedIn();
		linkedIn3.linkedInId = 3;
		linkedIn3.companyPage = "Google";
		linkedIn3.industry = "Technology";
		linkedIn3.followers = 28000000;
		linkedIn3.isVerified = true;
		linkedIn3.profile = profile3;
		linkedIn3.getLinkedInDetails();

		Profile profile4 = new Profile();
		profile4.profileId = 4;
		profile4.fullName = "Satya Nadella";
		profile4.jobTitle = "CEO Microsoft";
		profile4.skills = "Cloud Azure Leadership";
		profile4.connectionCount = 12000000.0;
		LinkedIn linkedIn4 = new LinkedIn();
		linkedIn4.linkedInId = 4;
		linkedIn4.companyPage = "Microsoft";
		linkedIn4.industry = "Technology";
		linkedIn4.followers = 25000000;
		linkedIn4.isVerified = true;
		linkedIn4.profile = profile4;
		linkedIn4.getLinkedInDetails();

		Profile profile5 = new Profile();
		profile5.profileId = 5;
		profile5.fullName = "Andy Jassy";
		profile5.jobTitle = "CEO Amazon";
		profile5.skills = "Cloud AWS Leadership";
		profile5.connectionCount = 8000000.0;
		LinkedIn linkedIn5 = new LinkedIn();
		linkedIn5.linkedInId = 5;
		linkedIn5.companyPage = "Amazon";
		linkedIn5.industry = "E-Commerce";
		linkedIn5.followers = 22000000;
		linkedIn5.isVerified = true;
		linkedIn5.profile = profile5;
		linkedIn5.getLinkedInDetails();

		Profile profile6 = new Profile();
		profile6.profileId = 6;
		profile6.fullName = "Rishad Premji";
		profile6.jobTitle = "Chairman";
		profile6.skills = "Strategy Business Tech";
		profile6.connectionCount = 500000.0;
		LinkedIn linkedIn6 = new LinkedIn();
		linkedIn6.linkedInId = 6;
		linkedIn6.companyPage = "Wipro";
		linkedIn6.industry = "IT Services";
		linkedIn6.followers = 3000000;
		linkedIn6.isVerified = true;
		linkedIn6.profile = profile6;
		linkedIn6.getLinkedInDetails();

		Profile profile7 = new Profile();
		profile7.profileId = 7;
		profile7.fullName = "Kalyan Krishnamurthy";
		profile7.jobTitle = "CEO Flipkart";
		profile7.skills = "E-Commerce Strategy";
		profile7.connectionCount = 300000.0;
		LinkedIn linkedIn7 = new LinkedIn();
		linkedIn7.linkedInId = 7;
		linkedIn7.companyPage = "Flipkart";
		linkedIn7.industry = "E-Commerce";
		linkedIn7.followers = 2000000;
		linkedIn7.isVerified = true;
		linkedIn7.profile = profile7;
		linkedIn7.getLinkedInDetails();

		Profile profile8 = new Profile();
		profile8.profileId = 8;
		profile8.fullName = "Deepinder Goyal";
		profile8.jobTitle = "Founder Zomato";
		profile8.skills = "Product Strategy Startup";
		profile8.connectionCount = 2000000.0;
		LinkedIn linkedIn8 = new LinkedIn();
		linkedIn8.linkedInId = 8;
		linkedIn8.companyPage = "Zomato";
		linkedIn8.industry = "Food Tech";
		linkedIn8.followers = 1500000;
		linkedIn8.isVerified = true;
		linkedIn8.profile = profile8;
		linkedIn8.getLinkedInDetails();

		Profile profile9 = new Profile();
		profile9.profileId = 9;
		profile9.fullName = "Sashidhar Jagdishan";
		profile9.jobTitle = "CEO HDFC Bank";
		profile9.skills = "Banking Finance Leadership";
		profile9.connectionCount = 400000.0;
		LinkedIn linkedIn9 = new LinkedIn();
		linkedIn9.linkedInId = 9;
		linkedIn9.companyPage = "HDFC Bank";
		linkedIn9.industry = "Banking";
		linkedIn9.followers = 2500000;
		linkedIn9.isVerified = true;
		linkedIn9.profile = profile9;
		linkedIn9.getLinkedInDetails();

		Profile profile10 = new Profile();
		profile10.profileId = 10;
		profile10.fullName = "Harshil Mathur";
		profile10.jobTitle = "CEO Razorpay";
		profile10.skills = "Fintech Payments Startup";
		profile10.connectionCount = 500000.0;
		LinkedIn linkedIn10 = new LinkedIn();
		linkedIn10.linkedInId = 10;
		linkedIn10.companyPage = "Razorpay";
		linkedIn10.industry = "Fintech";
		linkedIn10.followers = 800000;
		linkedIn10.isVerified = true;
		linkedIn10.profile = profile10;
		linkedIn10.getLinkedInDetails();

		Profile profile11 = new Profile();
		profile11.profileId = 11;
		profile11.fullName = "Girish Mathrubootham";
		profile11.jobTitle = "Founder CEO";
		profile11.skills = "SaaS Product Sales";
		profile11.connectionCount = 600000.0;
		LinkedIn linkedIn11 = new LinkedIn();
		linkedIn11.linkedInId = 11;
		linkedIn11.companyPage = "Freshworks";
		linkedIn11.industry = "SaaS";
		linkedIn11.followers = 900000;
		linkedIn11.isVerified = true;
		linkedIn11.profile = profile11;
		linkedIn11.getLinkedInDetails();

		Profile profile12 = new Profile();
		profile12.profileId = 12;
		profile12.fullName = "Byju Raveendran";
		profile12.jobTitle = "Founder CEO";
		profile12.skills = "Education Product Leadership";
		profile12.connectionCount = 800000.0;
		LinkedIn linkedIn12 = new LinkedIn();
		linkedIn12.linkedInId = 12;
		linkedIn12.companyPage = "Byju's";
		linkedIn12.industry = "EdTech";
		linkedIn12.followers = 1200000;
		linkedIn12.isVerified = true;
		linkedIn12.profile = profile12;
		linkedIn12.getLinkedInDetails();

		Profile profile13 = new Profile();
		profile13.profileId = 13;
		profile13.fullName = "Bhavish Aggarwal";
		profile13.jobTitle = "CEO Ola";
		profile13.skills = "Mobility EV Startup";
		profile13.connectionCount = 700000.0;
		LinkedIn linkedIn13 = new LinkedIn();
		linkedIn13.linkedInId = 13;
		linkedIn13.companyPage = "Ola";
		linkedIn13.industry = "Transport";
		linkedIn13.followers = 1100000;
		linkedIn13.isVerified = true;
		linkedIn13.profile = profile13;
		linkedIn13.getLinkedInDetails();

		Profile profile14 = new Profile();
		profile14.profileId = 14;
		profile14.fullName = "Vijay Shekhar Sharma";
		profile14.jobTitle = "CEO Paytm";
		profile14.skills = "Finance Tech Payment";
		profile14.connectionCount = 1200000.0;
		LinkedIn linkedIn14 = new LinkedIn();
		linkedIn14.linkedInId = 14;
		linkedIn14.companyPage = "Paytm";
		linkedIn14.industry = "Fintech";
		linkedIn14.followers = 1800000;
		linkedIn14.isVerified = true;
		linkedIn14.profile = profile14;
		linkedIn14.getLinkedInDetails();

		Profile profile15 = new Profile();
		profile15.profileId = 15;
		profile15.fullName = "S Somanath";
		profile15.jobTitle = "Chairman ISRO";
		profile15.skills = "Aerospace Engineering Space";
		profile15.connectionCount = 2500000.0;
		LinkedIn linkedIn15 = new LinkedIn();
		linkedIn15.linkedInId = 15;
		linkedIn15.companyPage = "ISRO";
		linkedIn15.industry = "Space Research";
		linkedIn15.followers = 3500000;
		linkedIn15.isVerified = true;
		linkedIn15.profile = profile15;
		linkedIn15.getLinkedInDetails();

		Profile profile16 = new Profile();
		profile16.profileId = 16;
		profile16.fullName = "N Chandrasekaran";
		profile16.jobTitle = "Chairman Tata";
		profile16.skills = "Business Strategy Leadership";
		profile16.connectionCount = 3000000.0;
		LinkedIn linkedIn16 = new LinkedIn();
		linkedIn16.linkedInId = 16;
		linkedIn16.companyPage = "Tata Group";
		linkedIn16.industry = "Conglomerate";
		linkedIn16.followers = 6000000;
		linkedIn16.isVerified = true;
		linkedIn16.profile = profile16;
		linkedIn16.getLinkedInDetails();

		Profile profile17 = new Profile();
		profile17.profileId = 17;
		profile17.fullName = "Mark Zuckerberg";
		profile17.jobTitle = "CEO Meta";
		profile17.skills = "Social Media AI Product";
		profile17.connectionCount = 9000000.0;
		LinkedIn linkedIn17 = new LinkedIn();
		linkedIn17.linkedInId = 17;
		linkedIn17.companyPage = "Meta";
		linkedIn17.industry = "Social Media";
		linkedIn17.followers = 20000000;
		linkedIn17.isVerified = true;
		linkedIn17.profile = profile17;
		linkedIn17.getLinkedInDetails();

		Profile profile18 = new Profile();
		profile18.profileId = 18;
		profile18.fullName = "Elon Musk";
		profile18.jobTitle = "CEO Tesla";
		profile18.skills = "EV AI Space Innovation";
		profile18.connectionCount = 20000000.0;
		LinkedIn linkedIn18 = new LinkedIn();
		linkedIn18.linkedInId = 18;
		linkedIn18.companyPage = "Tesla";
		linkedIn18.industry = "Electric Vehicles";
		linkedIn18.followers = 18000000;
		linkedIn18.isVerified = true;
		linkedIn18.profile = profile18;
		linkedIn18.getLinkedInDetails();

		Profile profile19 = new Profile();
		profile19.profileId = 19;
		profile19.fullName = "Tim Cook";
		profile19.jobTitle = "CEO Apple";
		profile19.skills = "Product Design Supply Chain";
		profile19.connectionCount = 10000000.0;
		LinkedIn linkedIn19 = new LinkedIn();
		linkedIn19.linkedInId = 19;
		linkedIn19.companyPage = "Apple";
		linkedIn19.industry = "Consumer Electronics";
		linkedIn19.followers = 24000000;
		linkedIn19.isVerified = true;
		linkedIn19.profile = profile19;
		linkedIn19.getLinkedInDetails();

		Profile profile20 = new Profile();
		profile20.profileId = 20;
		profile20.fullName = "Anand Mahindra";
		profile20.jobTitle = "Chairman Mahindra";
		profile20.skills = "Business EV Auto";
		profile20.connectionCount = 4000000.0;
		LinkedIn linkedIn20 = new LinkedIn();
		linkedIn20.linkedInId = 20;
		linkedIn20.companyPage = "Mahindra Group";
		linkedIn20.industry = "Conglomerate";
		linkedIn20.followers = 2800000;
		linkedIn20.isVerified = true;
		linkedIn20.profile = profile20;
		linkedIn20.getLinkedInDetails(); */

		Profile profile1 = new Profile(1, "Narayana Murthy", "Founder", "Java Python Leadership", 30000.0);
		LinkedIn linkedIn1 = new LinkedIn(1, "Infosys", "IT Services", 5000000, true, profile1);
		linkedIn1.getLinkedInDetails();

		Profile profile2 = new Profile(2, "Rajesh Gopinathan", "CEO", "Strategy Management", 25000.0);
		LinkedIn linkedIn2 = new LinkedIn(2, "TCS", "IT Services", 4500000, true, profile2);
		linkedIn2.getLinkedInDetails();

		Profile profile3 = new Profile(3, "Sundar Pichai", "CEO Google", "AI Cloud Leadership", 15000000.0);
		LinkedIn linkedIn3 = new LinkedIn(3, "Google", "Technology", 28000000, true, profile3);
		linkedIn3.getLinkedInDetails();

		Profile profile4 = new Profile(4, "Satya Nadella", "CEO Microsoft", "Cloud Azure Leadership", 12000000.0);
		LinkedIn linkedIn4 = new LinkedIn(4, "Microsoft", "Technology", 25000000, true, profile4);
		linkedIn4.getLinkedInDetails();

		Profile profile5 = new Profile(5, "Andy Jassy", "CEO Amazon", "Cloud AWS Leadership", 8000000.0);
		LinkedIn linkedIn5 = new LinkedIn(5, "Amazon", "E-Commerce", 22000000, true, profile5);
		linkedIn5.getLinkedInDetails();

		Profile profile6 = new Profile(6, "Rishad Premji", "Chairman", "Strategy Business Tech", 500000.0);
		LinkedIn linkedIn6 = new LinkedIn(6, "Wipro", "IT Services", 3000000, true, profile6);
		linkedIn6.getLinkedInDetails();

		Profile profile7 = new Profile(7, "Kalyan Krishnamurthy", "CEO Flipkart", "E-Commerce Strategy", 300000.0);
		LinkedIn linkedIn7 = new LinkedIn(7, "Flipkart", "E-Commerce", 2000000, true, profile7);
		linkedIn7.getLinkedInDetails();

		Profile profile8 = new Profile(8, "Deepinder Goyal", "Founder Zomato", "Product Strategy Startup", 2000000.0);
		LinkedIn linkedIn8 = new LinkedIn(8, "Zomato", "Food Tech", 1500000, true, profile8);
		linkedIn8.getLinkedInDetails();

		Profile profile9 = new Profile(9, "Sashidhar Jagdishan", "CEO HDFC Bank", "Banking Finance", 400000.0);
		LinkedIn linkedIn9 = new LinkedIn(9, "HDFC Bank", "Banking", 2500000, true, profile9);
		linkedIn9.getLinkedInDetails();

		Profile profile10 = new Profile(10, "Harshil Mathur", "CEO Razorpay", "Fintech Payments Startup", 500000.0);
		LinkedIn linkedIn10 = new LinkedIn(10, "Razorpay", "Fintech", 800000, true, profile10);
		linkedIn10.getLinkedInDetails();

		Profile profile11 = new Profile(11, "Girish Mathrubootham", "Founder CEO", "SaaS Product Sales", 600000.0);
		LinkedIn linkedIn11 = new LinkedIn(11, "Freshworks", "SaaS", 900000, true, profile11);
		linkedIn11.getLinkedInDetails();

		Profile profile12 = new Profile(12, "Byju Raveendran", "Founder CEO", "Education Product", 800000.0);
		LinkedIn linkedIn12 = new LinkedIn(12, "Byjus", "EdTech", 1200000, true, profile12);
		linkedIn12.getLinkedInDetails();

		Profile profile13 = new Profile(13, "Bhavish Aggarwal", "CEO Ola", "Mobility EV Startup", 700000.0);
		LinkedIn linkedIn13 = new LinkedIn(13, "Ola", "Transport", 1100000, true, profile13);
		linkedIn13.getLinkedInDetails();

		Profile profile14 = new Profile(14, "Vijay Shekhar Sharma", "CEO Paytm", "Finance Tech Payment", 1200000.0);
		LinkedIn linkedIn14 = new LinkedIn(14, "Paytm", "Fintech", 1800000, true, profile14);
		linkedIn14.getLinkedInDetails();

		Profile profile15 = new Profile(15, "S Somanath", "Chairman ISRO", "Aerospace Engineering", 2500000.0);
		LinkedIn linkedIn15 = new LinkedIn(15, "ISRO", "Space Research", 3500000, true, profile15);
		linkedIn15.getLinkedInDetails();

		Profile profile16 = new Profile(16, "N Chandrasekaran", "Chairman Tata", "Business Strategy", 3000000.0);
		LinkedIn linkedIn16 = new LinkedIn(16, "Tata Group", "Conglomerate", 6000000, true, profile16);
		linkedIn16.getLinkedInDetails();

		Profile profile17 = new Profile(17, "Mark Zuckerberg", "CEO Meta", "Social Media AI", 9000000.0);
		LinkedIn linkedIn17 = new LinkedIn(17, "Meta", "Social Media", 20000000, true, profile17);
		linkedIn17.getLinkedInDetails();

		Profile profile18 = new Profile(18, "Elon Musk", "CEO Tesla", "EV AI Space", 20000000.0);
		LinkedIn linkedIn18 = new LinkedIn(18, "Tesla", "Electric Vehicles", 18000000, true, profile18);
		linkedIn18.getLinkedInDetails();

		Profile profile19 = new Profile(19, "Tim Cook", "CEO Apple", "Product Design Supply", 10000000.0);
		LinkedIn linkedIn19 = new LinkedIn(19, "Apple", "Consumer Electronics", 24000000, true, profile19);
		linkedIn19.getLinkedInDetails();

		Profile profile20 = new Profile(20, "Anand Mahindra", "Chairman Mahindra", "Business EV Auto", 4000000.0);
		LinkedIn linkedIn20 = new LinkedIn(20, "Mahindra Group", "Conglomerate", 2800000, true, profile20);
		linkedIn20.getLinkedInDetails();


	}
}