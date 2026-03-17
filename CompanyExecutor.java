class CompanyExecutor {
	public static void main(String[] args) {
/*
		Project project1 = new Project();
		project1.projectId = 1;
		project1.projectName = "Banking Portal";
		project1.technology = "Java Spring Boot";
		project1.teamSize = 12;
		project1.isCompleted = true;
		Company company1 = new Company();
		company1.companyId = 1;
		company1.companyName = "Infosys";
		company1.location = "Bangalore";
		company1.employees = 340000;
		company1.revenue = 146000.0;
		company1.project = project1;
		company1.getCompanyDetails();

		Project project2 = new Project();
		project2.projectId = 2;
		project2.projectName = "E-Commerce Platform";
		project2.technology = "React and Node.js";
		project2.teamSize = 20;
		project2.isCompleted = false;
		Company company2 = new Company();
		company2.companyId = 2;
		company2.companyName = "TCS";
		company2.location = "Mumbai";
		company2.employees = 600000;
		company2.revenue = 225000.0;
		company2.project = project2;
		company2.getCompanyDetails();

		Project project3 = new Project();
		project3.projectId = 3;
		project3.projectName = "AI Chatbot";
		project3.technology = "Python Machine Learning";
		project3.teamSize = 8;
		project3.isCompleted = true;
		Company company3 = new Company();
		company3.companyId = 3;
		company3.companyName = "Wipro";
		company3.location = "Bangalore";
		company3.employees = 250000;
		company3.revenue = 90000.0;
		company3.project = project3;
		company3.getCompanyDetails();

		Project project4 = new Project();
		project4.projectId = 4;
		project4.projectName = "Cloud Migration";
		project4.technology = "AWS and Azure";
		project4.teamSize = 15;
		project4.isCompleted = false;
		Company company4 = new Company();
		company4.companyId = 4;
		company4.companyName = "HCL Technologies";
		company4.location = "Noida";
		company4.employees = 220000;
		company4.revenue = 87000.0;
		company4.project = project4;
		company4.getCompanyDetails();

		Project project5 = new Project();
		project5.projectId = 5;
		project5.projectName = "Mobile App Development";
		project5.technology = "Flutter and Dart";
		project5.teamSize = 6;
		project5.isCompleted = true;
		Company company5 = new Company();
		company5.companyId = 5;
		company5.companyName = "Tech Mahindra";
		company5.location = "Pune";
		company5.employees = 150000;
		company5.revenue = 53000.0;
		company5.project = project5;
		company5.getCompanyDetails();

		Project project6 = new Project();
		project6.projectId = 6;
		project6.projectName = "Data Analytics Dashboard";
		project6.technology = "Python and Tableau";
		project6.teamSize = 10;
		project6.isCompleted = true;
		Company company6 = new Company();
		company6.companyId = 6;
		company6.companyName = "Cognizant";
		company6.location = "Chennai";
		company6.employees = 340000;
		company6.revenue = 120000.0;
		company6.project = project6;
		company6.getCompanyDetails();

		Project project7 = new Project();
		project7.projectId = 7;
		project7.projectName = "ERP Implementation";
		project7.technology = "SAP";
		project7.teamSize = 25;
		project7.isCompleted = false;
		Company company7 = new Company();
		company7.companyId = 7;
		company7.companyName = "Accenture India";
		company7.location = "Hyderabad";
		company7.employees = 300000;
		company7.revenue = 180000.0;
		company7.project = project7;
		company7.getCompanyDetails();

		Project project8 = new Project();
		project8.projectId = 8;
		project8.projectName = "Cybersecurity System";
		project8.technology = "Ethical Hacking Tools";
		project8.teamSize = 9;
		project8.isCompleted = true;
		Company company8 = new Company();
		company8.companyId = 8;
		company8.companyName = "IBM India";
		company8.location = "Bangalore";
		company8.employees = 140000;
		company8.revenue = 75000.0;
		company8.project = project8;
		company8.getCompanyDetails();

		Project project9 = new Project();
		project9.projectId = 9;
		project9.projectName = "Blockchain Ledger";
		project9.technology = "Ethereum and Solidity";
		project9.teamSize = 7;
		project9.isCompleted = false;
		Company company9 = new Company();
		company9.companyId = 9;
		company9.companyName = "Oracle India";
		company9.location = "Bangalore";
		company9.employees = 45000;
		company9.revenue = 42000.0;
		company9.project = project9;
		company9.getCompanyDetails();

		Project project10 = new Project();
		project10.projectId = 10;
		project10.projectName = "Hospital Management System";
		project10.technology = "Java and MySQL";
		project10.teamSize = 14;
		project10.isCompleted = true;
		Company company10 = new Company();
		company10.companyId = 10;
		company10.companyName = "Mphasis";
		company10.location = "Bangalore";
		company10.employees = 35000;
		company10.revenue = 12000.0;
		company10.project = project10;
		company10.getCompanyDetails();

		Project project11 = new Project();
		project11.projectId = 11;
		project11.projectName = "IoT Smart Home System";
		project11.technology = "Raspberry Pi and Python";
		project11.teamSize = 5;
		project11.isCompleted = true;
		Company company11 = new Company();
		company11.companyId = 11;
		company11.companyName = "Persistent Systems";
		company11.location = "Pune";
		company11.employees = 23000;
		company11.revenue = 8000.0;
		company11.project = project11;
		company11.getCompanyDetails();

		Project project12 = new Project();
		project12.projectId = 12;
		project12.projectName = "Inventory Management Tool";
		project12.technology = "Angular and Spring";
		project12.teamSize = 11;
		project12.isCompleted = false;
		Company company12 = new Company();
		company12.companyId = 12;
		company12.companyName = "L&T Infotech";
		company12.location = "Mumbai";
		company12.employees = 30000;
		company12.revenue = 14000.0;
		company12.project = project12;
		company12.getCompanyDetails();

		Project project13 = new Project();
		project13.projectId = 13;
		project13.projectName = "Video Streaming Platform";
		project13.technology = "React and AWS";
		project13.teamSize = 18;
		project13.isCompleted = false;
		Company company13 = new Company();
		company13.companyId = 13;
		company13.companyName = "Freshworks";
		company13.location = "Chennai";
		company13.employees = 6000;
		company13.revenue = 5000.0;
		company13.project = project13;
		company13.getCompanyDetails();

		Project project14 = new Project();
		project14.projectId = 14;
		project14.projectName = "Smart Agriculture System";
		project14.technology = "IoT and Machine Learning";
		project14.teamSize = 8;
		project14.isCompleted = true;
		Company company14 = new Company();
		company14.companyId = 14;
		company14.companyName = "Zoho Corp";
		company14.location = "Chennai";
		company14.employees = 15000;
		company14.revenue = 7500.0;
		company14.project = project14;
		company14.getCompanyDetails();

		Project project15 = new Project();
		project15.projectId = 15;
		project15.projectName = "Payment Gateway";
		project15.technology = "Node.js and Stripe API";
		project15.teamSize = 9;
		project15.isCompleted = true;
		Company company15 = new Company();
		company15.companyId = 15;
		company15.companyName = "Razorpay";
		company15.location = "Bangalore";
		company15.employees = 3000;
		company15.revenue = 2000.0;
		company15.project = project15;
		company15.getCompanyDetails();

		Project project16 = new Project();
		project16.projectId = 16;
		project16.projectName = "Logistics Tracking System";
		project16.technology = "GPS and Java";
		project16.teamSize = 13;
		project16.isCompleted = false;
		Company company16 = new Company();
		company16.companyId = 16;
		company16.companyName = "Delhivery";
		company16.location = "Gurgaon";
		company16.employees = 12000;
		company16.revenue = 6000.0;
		company16.project = project16;
		company16.getCompanyDetails();

		Project project17 = new Project();
		project17.projectId = 17;
		project17.projectName = "CRM Software";
		project17.technology = "Salesforce";
		project17.teamSize = 16;
		project17.isCompleted = true;
		Company company17 = new Company();
		company17.companyId = 17;
		company17.companyName = "Mindtree";
		company17.location = "Bangalore";
		company17.employees = 38000;
		company17.revenue = 14000.0;
		company17.project = project17;
		company17.getCompanyDetails();

		Project project18 = new Project();
		project18.projectId = 18;
		project18.projectName = "HR Management System";
		project18.technology = "PHP and Laravel";
		project18.teamSize = 7;
		project18.isCompleted = true;
		Company company18 = new Company();
		company18.companyId = 18;
		company18.companyName = "Hexaware";
		company18.location = "Mumbai";
		company18.employees = 27000;
		company18.revenue = 9000.0;
		company18.project = project18;
		company18.getCompanyDetails();

		Project project19 = new Project();
		project19.projectId = 19;
		project19.projectName = "Social Media Analytics";
		project19.technology = "Python and NLP";
		project19.teamSize = 6;
		project19.isCompleted = false;
		Company company19 = new Company();
		company19.companyId = 19;
		company19.companyName = "Mu Sigma";
		company19.location = "Bangalore";
		company19.employees = 10000;
		company19.revenue = 4500.0;
		company19.project = project19;
		company19.getCompanyDetails();

		Project project20 = new Project();
		project20.projectId = 20;
		project20.projectName = "EdTech LMS Platform";
		project20.technology = "Vue.js and Django";
		project20.teamSize = 10;
		project20.isCompleted = false;
		Company company20 = new Company();
		company20.companyId = 20;
		company20.companyName = "Unacademy";
		company20.location = "Bangalore";
		company20.employees = 4000;
		company20.revenue = 3200.0;
		company20.project = project20;
		company20.getCompanyDetails(); */
		

		Project project1 = new Project(1, "Banking Portal", "Java Spring Boot", 12, true);
		Company company1 = new Company(1, "Infosys", "Bangalore", 340000, 146000.0, project1);
		company1.getCompanyDetails();

		Project project2 = new Project(2, "E-Commerce Platform", "React and Node.js", 20, false);
		Company company2 = new Company(2, "TCS", "Mumbai", 600000, 225000.0, project2);
		company2.getCompanyDetails();

		Project project3 = new Project(3, "AI Chatbot", "Python Machine Learning", 8, true);
		Company company3 = new Company(3, "Wipro", "Bangalore", 250000, 90000.0, project3);
		company3.getCompanyDetails();

		Project project4 = new Project(4, "Cloud Migration", "AWS and Azure", 15, false);
		Company company4 = new Company(4, "HCL Technologies", "Noida", 220000, 87000.0, project4);
		company4.getCompanyDetails();

		Project project5 = new Project(5, "Mobile App Development", "Flutter and Dart", 6, true);
		Company company5 = new Company(5, "Tech Mahindra", "Pune", 150000, 53000.0, project5);
		company5.getCompanyDetails();

		Project project6 = new Project(6, "Data Analytics Dashboard", "Python and Tableau", 10, true);
		Company company6 = new Company(6, "Cognizant", "Chennai", 340000, 120000.0, project6);
		company6.getCompanyDetails();

		Project project7 = new Project(7, "ERP Implementation", "SAP", 25, false);
		Company company7 = new Company(7, "Accenture India", "Hyderabad", 300000, 180000.0, project7);
		company7.getCompanyDetails();

		Project project8 = new Project(8, "Cybersecurity System", "Ethical Hacking Tools", 9, true);
		Company company8 = new Company(8, "IBM India", "Bangalore", 140000, 75000.0, project8);
		company8.getCompanyDetails();

		Project project9 = new Project(9, "Blockchain Ledger", "Ethereum and Solidity", 7, false);
		Company company9 = new Company(9, "Oracle India", "Bangalore", 45000, 42000.0, project9);
		company9.getCompanyDetails();

		Project project10 = new Project(10, "Hospital Management System", "Java and MySQL", 14, true);
		Company company10 = new Company(10, "Mphasis", "Bangalore", 35000, 12000.0, project10);
		company10.getCompanyDetails();

		Project project11 = new Project(11, "IoT Smart Home System", "Raspberry Pi and Python", 5, true);
		Company company11 = new Company(11, "Persistent Systems", "Pune", 23000, 8000.0, project11);
		company11.getCompanyDetails();

		Project project12 = new Project(12, "Inventory Management Tool", "Angular and Spring", 11, false);
		Company company12 = new Company(12, "L&T Infotech", "Mumbai", 30000, 14000.0, project12);
		company12.getCompanyDetails();

		Project project13 = new Project(13, "Video Streaming Platform", "React and AWS", 18, false);
		Company company13 = new Company(13, "Freshworks", "Chennai", 6000, 5000.0, project13);
		company13.getCompanyDetails();

		Project project14 = new Project(14, "Smart Agriculture System", "IoT and Machine Learning", 8, true);
		Company company14 = new Company(14, "Zoho Corp", "Chennai", 15000, 7500.0, project14);
		company14.getCompanyDetails();

		Project project15 = new Project(15, "Payment Gateway", "Node.js and Stripe API", 9, true);
		Company company15 = new Company(15, "Razorpay", "Bangalore", 3000, 2000.0, project15);
		company15.getCompanyDetails();

		Project project16 = new Project(16, "Logistics Tracking System", "GPS and Java", 13, false);
		Company company16 = new Company(16, "Delhivery", "Gurgaon", 12000, 6000.0, project16);
		company16.getCompanyDetails();

		Project project17 = new Project(17, "CRM Software", "Salesforce", 16, true);
		Company company17 = new Company(17, "Mindtree", "Bangalore", 38000, 14000.0, project17);
		company17.getCompanyDetails();

		Project project18 = new Project(18, "HR Management System", "PHP and Laravel", 7, true);
		Company company18 = new Company(18, "Hexaware", "Mumbai", 27000, 9000.0, project18);
		company18.getCompanyDetails();

		Project project19 = new Project(19, "Social Media Analytics", "Python and NLP", 6, false);
		Company company19 = new Company(19, "Mu Sigma", "Bangalore", 10000, 4500.0, project19);
		company19.getCompanyDetails();

		Project project20 = new Project(20, "EdTech LMS Platform", "Vue.js and Django", 10, false);
		Company company20 = new Company(20, "Unacademy", "Bangalore", 4000, 3200.0, project20);
		company20.getCompanyDetails();


	}
}