class JobPortal{
	public static String[] searchJobsByCompany(String companyName) {
		
		if(companyName=="Tata Consultancy Services"){
			String[] jobRoleTitleTCS={"AR VR Developer","Machine Learning Engineer","Senior Software Engineer","Digital Marketing Specialist","UI Designer","Program Manager","Project Manager","DevOps Engineer", "Procurement Specialist","Data Scientist","ETL Developer","Training Manager","Hardware Engineer","Data Analyst","NLP Engineer","Solutions Architect","Frontend Developer","Customer Success Manager","Content Strategist","Product Manager" };
			return jobRoleTitleTCS;
			
		}else if(companyName=="Infosys"){
			String[] jobRoleTitleInfosys={"Project Manager","Game Developer","Computer Vision Engineer","Senior Software Engineer","Firmware Engineer","Automation Test Engineer","Power BIDeveloper", "Data Engineer","BI Developer","Hardware Engineer", "IT Support Specialist","Pre Sales Consultant","Enterprise Architect","UI Designer","Software Engineer","Site Reliability Engineer","Solutions Architect","Network Engineer","Tableau Developer","NLP Engineer"};
			return jobRoleTitleInfosys;
			
		}else if(companyName == "Wipro"){
			String[] jobRoleTitleWipro = {"Cloud Engineer", "Product Manager", "SEO Analyst", "Network Engineer","Data Scientist", "Data Analyst", "Penetration Tester", "Supply ChainAnalyst", "Cyber Security Analyst", "Training Manager", "Computer Vision Engineer", "Business Analyst", "Frontend Developer", "Tableau Developer", "Mobile App Developer", "Hardware Engineer", "Machine Learning Engineer", "Accountant", "Operations Manager", "Firmware Engineer" };
			return jobRoleTitleWipro;
			
		}else if (companyName == "HCL Technologies"){
			String[] jobRoleTitleHCLTechnologies = { "UX Researcher", "Finance Analyst", "ARVR Developer", "Blockchain Developer", "Supply Chain Analyst","Operations Manager", "Security Engineer", "AI Research Scientist","Automation Test Engineer", "Power BI Developer", "Full StackDeveloper", "Frontend Developer", "Big Data Engineer", "Project Manager", "Pre Sales Consultant", "Data Analyst", "Digital Marketing Specialist", "Data Scientist", "Penetration Tester", "UI Designer" };
			return jobRoleTitleHCLTechnologies;
			
		}else if (companyName == "Tech Mahindra"){
			String[] jobRoleTitleTechMahindra = { "Mobile App Developer", "AR VR Developer","Finance Analyst", "Security Engineer", "Site Reliability Engineer","Procurement Specialist", "Cyber Security Analyst", "Product Manager", "Big Data Engineer", "UI Designer", "BI Developer", "ETL Developer","Data Engineer", "Full Stack Developer", "Computer Vision Engineer","Sales Engineer", "Supply Chain Analyst", "Hardware Engineer", "ProgramManager", "HR Executive" };
			return jobRoleTitleTechMahindra;
			
		}else if (companyName == "Accenture"){
			String[] jobRoleTitleAccenture = { "Mobile App Developer", "Penetration Tester", "UI Designer", "AR VR Developer", "BI Developer", "Firmware Engineer", "Project Manager", "ETL Developer", "Database Administrator", "Content Strategist", "Talent Acquisition Specialist", "Backend Developer", "Accountant", "Frontend Developer", "Training Manager", "Technical Support Engineer", "Customer Success Manager", "Full Stack Developer", "Product Manager", "AI Research Scientist" };
			return jobRoleTitleAccenture;

		}else if (companyName == "Cognizant"){
			String[] jobRoleTitleCognizant= { "Supply Chain Analyst", "Power BI Developer", "Database Administrator", "Product Manager", "Data Engineer", "Android Developer","Technical Support Engineer", "Pre Sales Consultant", "Mobile App Developer", "Cloud Engineer", "Business Analyst", "DevOps Engineer", "Program Manager", "Digital Marketing Specialist", "Firmware Engineer","Hardware Engineer", "HR Executive", "NLP Engineer", "SolutionsArchitect", "ETL Developer" };
			return jobRoleTitleCognizant;

		}else if (companyName == "Capgemini"){
			String[] jobRoleTitleCapgemini= { "Technical Support Engineer", "Security Engineer", "Project Manager", "DevOps Engineer", "Game Developer", "Android Developer","Data Analyst", "SEO Analyst", "Backend Developer", "Machine Learning Engineer", "Cloud Engineer", "AR VR Developer", "Site Reliability Engineer", "ETL Developer", "Solutions Architect", "Computer VisionEngineer", "Full Stack Developer", "Penetration Tester", "Digital Marketing Specialist", "Power BI Developer" };
			return jobRoleTitleCapgemini;

		}else if (companyName == "IBM"){
			String[] jobRoleTitleIBM = { "Mobile App Developer", "Embedded Systems Engineer", "Business Analyst","Firmware Engineer", "Operations Manager", "Software Engineer", "ETL Developer", "Tableau Developer", "Machine Learning Engineer", "Accountant", "Hardware Engineer", "SEO Analyst", "UI Designer", "Data Engineer", "Network Engineer", "Training Manager", "UX Researcher", "Solutions Architect", "Site Reliability Engineer", "Pre Sales Consultant" };
			return jobRoleTitleIBM;

		}else if (companyName == "Microsoft"){
			String[] jobRoleTitleMicrosoft= { "Software Engineer", "Tableau Developer", "Supply Chain Analyst","Sales Engineer", "Business Analyst", "Game Developer", "SEO Analyst","QA Engineer", "Operations Manager", "Data Scientist", "AR VR Developer", "System Administrator", "HR Executive", "Training Manager","Computer Vision Engineer", "Automation Test Engineer", "Cloud Engineer", "Security Engineer", "Site Reliability Engineer", "Hardware Engineer" };
			return jobRoleTitleMicrosoft;

		}else if (companyName == "Google"){
			String[] jobRoleTitleGoogle = {"Content Strategist", "Sales Engineer", "Embedded Systems Engineer","Software Engineer", "Computer Vision Engineer", "Database Administrator", "Android Developer", "Senior Software Engineer", "Machine Learning Engineer", "Security Engineer", "System Administrator", "Program Manager", "Backend Developer", "Pre Sales Consultant", "AI Research Scientist", "Data Analyst", "Power BI Developer", "Accountant", "Full Stack Developer", "Hardware Engineer" };
			return jobRoleTitleGoogle;

		}else if (companyName == "Amazon"){
			String[] jobRoleTitleAmazon = {"Content Strategist", "DevOps Engineer", "Sales Engineer", "Big Data Engineer", "iOS Developer", "Firmware Engineer", "Site Reliability Engineer", "Business Analyst", "Embedded Systems Engineer", "Computer Vision Engineer", "Solutions Architect", "Product Manager", "Hardware Engineer", "Tableau Developer", "BI Developer", "Automation Test Engineer", "System Administrator", "Technical Support Engineer", "Procurement Specialist", "Data Engineer" };
			return jobRoleTitleAmazon;

		}else if (companyName == "Meta"){
			String[] jobRoleTitleMeta = {"Security Engineer", "Enterprise Architect", "Procurement Specialist","Embedded Systems Engineer", "Sales Engineer", "Machine Learning Engineer", "Program Manager", "Project Manager", "Full Stack Developer", "Network Engineer", "Senior Software Engineer", "NLP Engineer","Firmware Engineer", "Finance Analyst", "Content Strategist", "DigitalMarketing Specialist", "Software Engineer", "Training Manager", "AR VRDeveloper", "Backend Developer" };
			return jobRoleTitleMeta;

		}else if (companyName == "Apple"){
			String[] jobRoleTitleApple = {"Project Manager", "Full Stack Developer", "Procurement Specialist","Frontend Developer", "Operations Manager", "Network Engineer", "SalesEngineer", "Game Developer", "Program Manager", "UI Designer", "Big Data Engineer", "Android Developer", "Product Manager", "Hardware Engineer","DevOps Engineer", "AI Research Scientist", "Power BI Developer", "iOSDeveloper", "Training Manager", "ETL Developer" };
			return jobRoleTitleApple;

        }else if (companyName == "Oracle"){
			String[] jobRoleTitleOracle = {"Talent Acquisition Specialist", "IT Support Specialist", "Automation Test Engineer", "Data Scientist", "Procurement Specialist", "Big Data Engineer", "Solutions Architect", "Cyber Security Analyst", "Accountant", "Sales Engineer", "Mobile App Developer", "Tableau Developer", "Backend Developer", "ETL Developer", "Data Engineer", "Content Strategist", "Supply Chain Analyst", "SEO Analyst", "Technical Support Engineer", "Network Engineer" };
			return jobRoleTitleOracle;

		}else if (companyName == "SAP"){
			String[] jobRoleTitleSAP = { "Talent Acquisition Specialist", "Operations Manager", "Data Scientist","Program Manager", "Automation Test Engineer", "Supply Chain Analyst","Hardware Engineer", "Enterprise Architect", "DevOps Engineer", "Solutions Architect", "QA Engineer", "UI Designer", "Mobile App Developer", "Procurement Specialist", "Full Stack Developer", "Finance Analyst", "Firmware Engineer", "Customer Success Manager", "Backend Developer", "Data Engineer" };
			return jobRoleTitleSAP;

		}else if (companyName == "Adobe"){
			String[] jobRoleTitleAdobe = {"Hardware Engineer", "Finance Analyst", "Software Engineer", "DataAnalyst", "SEO Analyst", "Accountant", "Program Manager", "SiteReliability Engineer", "IT Support Specialist", "Android Developer", "iOS Developer", "Product Manager", "Technical Support Engineer","Backend Developer", "Sales Engineer", "Penetration Tester", "CustomerSuccess Manager", "Power BI Developer", "Business Analyst", "Mobile App Developer" };
			return jobRoleTitleAdobe;

		}else if (companyName == "Salesforce"){
			String[] jobRoleTitleSalesforce = { "UX Researcher", "Solutions Architect", "BI Developer", "Tableau Developer", "HR Executive", "Firmware Engineer","Big Data Engineer", "Power BI Developer", "Android Developer", "Cloud Engineer", "Automation Test Engineer", "Pre Sales Consultant", "Product Manager", "Backend Developer", "NLP Engineer", "Hardware Engineer","Digital Marketing Specialist", "Database Administrator", "CustomerSuccess Manager", "Accountant" };
			return jobRoleTitleSalesforce;

		}else if (companyName == "Intel"){
			String[] jobRoleTitleIntel = { "NLP Engineer", "iOS Developer", "Game Developer", "Accountant", "EmbeddedSystems Engineer", "Site Reliability Engineer", "Backend Developer", "Customer Success Manager", "Data Analyst", "QA Engineer", "Full Stack Developer", "Computer Vision Engineer", "HR Executive", "ETL Developer","Program Manager", "Technical Support Engineer", "Machine Learning Engineer", "AI Research Scientist", "Tableau Developer", "Pre Sales Consultant" };
			return jobRoleTitleIntel;

		}else if (companyName == "AMD"){
			String[] jobRoleTitleAMD = {"Computer Vision Engineer", "Frontend Developer", "Blockchain Developer", "Data Analyst", "IT Support Specialist", "Big Data Engineer", "NLP Engineer", "AI Research Scientist", "Embedded Systems Engineer", "Database Administrator", "Business Analyst", "Product Manager", "Operations Manager", "Power BI Developer", "Talent Acquisition Specialist", "Program Manager", "HR Executive", "Technical Support Engineer", "DevOps Engineer", "Data Engineer" };
			return jobRoleTitleAMD;

		}else if (companyName == "NVIDIA"){
			String[] jobRoleTitleNVIDIA = {"System Administrator", "Mobile App Developer", "DatabaseAdministrator", "SEO Analyst", "Full Stack Developer", "SoftwareEngineer", "Sales Engineer", "Blockchain Developer", "AI Research Scientist", "Data Scientist", "Supply Chain Analyst", "Hardware Engineer", "Product Manager", "Game Developer", "Business Analyst","DevOps Engineer", "Cyber Security Analyst", "HR Executive", "Program Manager", "Security Engineer" };
			return jobRoleTitleNVIDIA;

		} else if (companyName == "Qualcomm"){
			String[] jobRoleTitleQualcomm ={ "UX Researcher", "Site Reliability Engineer", "Enterprise Architect","Finance Analyst", "Hardware Engineer", "Power BI Developer", "SystemAdministrator", "Blockchain Developer", "Talent Acquisition Specialist","Data Engineer", "Embedded Systems Engineer", "Software Engineer", "Big Data Engineer", "Firmware Engineer", "Accountant", "SEO Analyst", "Data Scientist", "DevOps Engineer", "Business Analyst", "Machine LearningEngineer" };
			return jobRoleTitleQualcomm;

		}else if(companyName=="Broadcom"){
			String[] jobRoleTitleBroadcom={"Supply Chain Analyst","Data Scientist","Digital Marketing Specialist","Firmware Engineer","Cloud Engineer","UI Designer","UX Researcher","Computer Vision Engineer","Product Manager","Power BI Developer","Network Engineer","Training Manager","ETL Developer","AR VR Developer","Business Analyst","Game Developer","Android Developer","Tableau Developer","Backend Developer","Data Analyst"};
			return jobRoleTitleBroadcom;
			
		}else if(companyName=="Cisco"){
			String[] jobRoleTitleCisco={"AR VR Developer","Solutions Architect","Finance Analyst","UI Designer","Frontend Developer","Software Engineer","Network Engineer","Content Strategist","DevOps Engineer","Pre Sales Consultant","Business Analyst","Site Reliability Engineer","Digital Marketing Specialist","Enterprise Architect","Firmware Engineer","Power BI Developer","Sales Engineer","Tableau Developer","Operations Manager","Machine Learning Engineer"};
			return jobRoleTitleCisco;
			
		}else if(companyName=="Dell Technologies"){
			String[] jobRoleTitleDellTechnologies={"Full Stack Developer","Supply Chain Analyst","BI Developer","Procurement Specialist","Cloud Engineer","Hardware Engineer","Frontend Developer","Finance Analyst","Security Engineer","NLP Engineer","Firmware Engineer","Sales Engineer","Solutions Architect","DevOps Engineer","Accountant","System Administrator","Training Manager","Tableau Developer","Cyber Security Analyst","Product Manager"};
			return jobRoleTitleDellTechnologies;
			
		}else if(companyName=="HP Inc"){
			String[] jobRoleTitleHPInc={"ETL Developer","Program Manager","Big Data Engineer","Data Scientist","Cyber Security Analyst","Content Strategist","Firmware Engineer","IT Support Specialist","Blockchain Developer","Digital Marketing Specialist","Cloud Engineer","Sales Engineer","Site Reliability Engineer","QA Engineer","Finance Analyst","Senior Software Engineer","Talent Acquisition Specialist","Network Engineer","Tableau Developer","Operations Manager"};
			return jobRoleTitleHPInc;
			
		}else if(companyName=="Lenovo"){
			String[] jobRoleTitleLenovo={"UI Designer","Site Reliability Engineer","HR Executive","BI Developer","Data Scientist","Penetration Tester","Frontend Developer","iOS Developer","Project Manager","Automation Test Engineer","Mobile App Developer","Cyber Security Analyst","System Administrator","Training Manager","Digital Marketing Specialist","Senior Software Engineer","Big Data Engineer","Talent Acquisition Specialist","Technical Support Engineer","Network Engineer"};
			return jobRoleTitleLenovo;
			
		}else if(companyName=="Samsung"){
			String[] jobRoleTitleSamsung={"UI Designer","Operations Manager","Full Stack Developer","Content Strategist","Pre Sales Consultant","Cyber Security Analyst","Data Engineer","Game Developer","Technical Support Engineer","ETL Developer","Hardware Engineer","Network Engineer","Senior Software Engineer","Machine Learning Engineer","Business Analyst","QA Engineer","NLP Engineer","Tableau Developer","Frontend Developer","Data Scientist"};
			return jobRoleTitleSamsung;
			
		}else if(companyName=="LG Electronics"){
			String[] jobRoleTitleLGElectronics={"Computer Vision Engineer","Solutions Architect","Cyber Security Analyst","Tableau Developer","HR Executive","Database Administrator","Sales Engineer","Pre Sales Consultant","Game Developer","Machine Learning Engineer","Penetration Tester","AI Research Scientist","Automation Test Engineer","Business Analyst","Frontend Developer","Power BI Developer","Accountant","Software Engineer","Embedded Systems Engineer","Hardware Engineer"};
			return jobRoleTitleLGElectronics;
			
		}else if(companyName=="Sony"){
			String[] jobRoleTitleSony={"ETL Developer","Tableau Developer","Digital Marketing Specialist","Customer Success Manager","Big Data Engineer","Automation Test Engineer","Security Engineer","Solutions Architect","Full Stack Developer","Supply Chain Analyst","Network Engineer","Blockchain Developer","Database Administrator","Talent Acquisition Specialist","Machine Learning Engineer","System Administrator","Game Developer","Power BI Developer","Procurement Specialist","IT Support Specialist"};
			return jobRoleTitleSony;
			
		}else if(companyName=="Panasonic"){
			String[] jobRoleTitlePanasonic={"Database Administrator","Technical Support Engineer","BI Developer","UX Researcher","Firmware Engineer","DevOps Engineer","Automation Test Engineer","IT Support Specialist","Big Data Engineer","Penetration Tester","ETL Developer","Digital Marketing Specialist","QA Engineer","Blockchain Developer","AI Research Scientist","System Administrator","Sales Engineer","Supply Chain Analyst","Software Engineer","Power BI Developer"};
			return jobRoleTitlePanasonic;
			
		}else if(companyName=="Siemens"){
			String[] jobRoleTitleSiemens={"UX Researcher","Product Manager","Solutions Architect","HR Executive","NLP Engineer","Computer Vision Engineer","Data Engineer","Database Administrator","Mobile App Developer","Enterprise Architect","Talent Acquisition Specialist","ETL Developer","Sales Engineer","Game Developer","iOS Developer","Site Reliability Engineer","Big Data Engineer","Data Analyst","Pre Sales Consultant","Digital Marketing Specialist"};
			return jobRoleTitleSiemens;
			
		}else if(companyName=="Bosch"){
			String[] jobRoleTitleBosch={"Big Data Engineer","AR VR Developer","Blockchain Developer","Network Engineer","Data Analyst","Training Manager","SEO Analyst","Program Manager","ETL Developer","System Administrator","Project Manager","Automation Test Engineer","Cloud Engineer","Senior Software Engineer","Frontend Developer","Finance Analyst","iOS Developer","Customer Success Manager","Full Stack Developer","Mobile App Developer"};
			return jobRoleTitleBosch;
			
		}else if(companyName=="Honeywell"){
			String[] jobRoleTitleHoneywell={"IT Support Specialist","Supply Chain Analyst","AR VR Developer","AI Research Scientist","Automation Test Engineer","Power BI Developer","BI Developer","Penetration Tester","Android Developer","Technical Support Engineer","Program Manager","Cloud Engineer","Data Engineer","Accountant","Software Engineer","Data Scientist","Solutions Architect","Project Manager","QA Engineer","Embedded Systems Engineer"};
			return jobRoleTitleHoneywell;
			
		}else if(companyName=="General Electric"){
			String[] jobRoleTitleGeneralElectric={"Mobile App Developer","Backend Developer","Firmware Engineer","Program Manager","Accountant","Machine Learning Engineer","Pre Sales Consultant","DevOps Engineer","Talent Acquisition Specialist","Supply Chain Analyst","Big Data Engineer","Embedded Systems Engineer","Customer Success Manager","Computer Vision Engineer","Database Administrator","Enterprise Architect","Blockchain Developer","Game Developer","Solutions Architect","SEO Analyst"};
			return jobRoleTitleGeneralElectric;
			
		}else if(companyName=="Schneider Electric"){
			String[] jobRoleTitleSchneiderElectric={"Enterprise Architect","Procurement Specialist","Site Reliability Engineer","Digital Marketing Specialist","Operations Manager","iOS Developer","Pre Sales Consultant","Business Analyst","SEO Analyst","Program Manager","AR VR Developer","UI Designer","Embedded Systems Engineer","Android Developer","HR Executive","Talent Acquisition Specialist","Content Strategist","Accountant","Full Stack Developer","UX Researcher"};
			return jobRoleTitleSchneiderElectric;
			
		}else if(companyName=="Hitachi"){
			String[] jobRoleTitleHitachi={"Program Manager","UI Designer","Network Engineer","Database Administrator","Hardware Engineer","Data Analyst","DevOps Engineer","Cloud Engineer","Project Manager","Penetration Tester","BI Developer","Finance Analyst","Power BI Developer","Product Manager","Full Stack Developer","IT Support Specialist","SEO Analyst","Customer Success Manager","Supply Chain Analyst","Mobile App Developer"};
			return jobRoleTitleHitachi;
			
		}else if(companyName=="Mitsubishi Electric"){
			String[] jobRoleTitleMitsubishiElectric={"IT Support Specialist","Backend Developer","Product Manager","Finance Analyst","Pre Sales Consultant","Penetration Tester","Content Strategist","NLP Engineer","BI Developer","Senior Software Engineer","SEO Analyst","AI Research Scientist","Operations Manager","iOS Developer","Software Engineer","Cyber Security Analyst","System Administrator","HR Executive","Supply Chain Analyst","Hardware Engineer"};
			return jobRoleTitleMitsubishiElectric;
			
		}else if(companyName=="Fujitsu"){
			String[] jobRoleTitleFujitsu={"Digital Marketing Specialist","Pre Sales Consultant","Hardware Engineer","Talent Acquisition Specialist","Computer Vision Engineer","Project Manager","Android Developer","Operations Manager","UI Designer","Solutions Architect","Accountant","Senior Software Engineer","Penetration Tester","Network Engineer","Big Data Engineer","ETL Developer","Technical Support Engineer","Site Reliability Engineer","Mobile App Developer","DevOps Engineer"};
			return jobRoleTitleFujitsu;
			
		}else if(companyName=="NEC Corporation"){
			String[] jobRoleTitleNECCorporation={"Blockchain Developer","Hardware Engineer","Senior Software Engineer","Technical Support Engineer","NLP Engineer","AI Research Scientist","Big Data Engineer","Customer Success Manager","Data Analyst","Data Engineer","Solutions Architect","DevOps Engineer","Mobile App Developer","QA Engineer","Backend Developer","Business Analyst","Penetration Tester","Database Administrator","Product Manager","SEO Analyst"};
			return jobRoleTitleNECCorporation;
			
		}else if(companyName=="Atos"){
			String[] jobRoleTitleAtos={"Database Administrator","Network Engineer","SEO Analyst","Supply Chain Analyst","Penetration Tester","UI Designer","Customer Success Manager","Finance Analyst","IT Support Specialist","Business Analyst","Data Analyst","iOS Developer","Senior Software Engineer","Digital Marketing Specialist","Hardware Engineer","Backend Developer","Cyber Security Analyst","Project Manager","Data Engineer","Full Stack Developer"};
			return jobRoleTitleAtos;
			
		}else if(companyName=="DXC Technology"){
			String[] jobRoleTitleDXCTechnology={"Content Strategist","Data Engineer","Frontend Developer","SEO Analyst","Senior Software Engineer","Program Manager","Automation Test Engineer","Finance Analyst","Supply Chain Analyst","Blockchain Developer","Cloud Engineer","Operations Manager","DevOps Engineer","iOS Developer","Big Data Engineer","Machine Learning Engineer","AI Research Scientist","Product Manager","Mobile App Developer","Business Analyst"};
			return jobRoleTitleDXCTechnology;
			
		}else if(companyName=="EPAM Systems"){
			String[] jobRoleTitleEPAMSystems={"Content Strategist","Security Engineer","Site Reliability Engineer","Computer Vision Engineer","Procurement Specialist","Digital Marketing Specialist","Power BI Developer","Machine Learning Engineer","Pre Sales Consultant","Customer Success Manager","System Administrator","Data Scientist","NLP Engineer","Senior Software Engineer","HR Executive","AI Research Scientist","ETL Developer","Penetration Tester","Technical Support Engineer","Automation Test Engineer"};
			return jobRoleTitleEPAMSystems;
			
		}else if(companyName=="Globant"){
			String[] jobRoleTitleGlobant={"Full Stack Developer","NLP Engineer","BI Developer","Finance Analyst","AR VR Developer","Program Manager","Data Scientist","Customer Success Manager","Content Strategist","System Administrator","ETL Developer","Computer Vision Engineer","Machine Learning Engineer","AI Research Scientist","Frontend Developer","Cyber Security Analyst","Hardware Engineer","Solutions Architect","Big Data Engineer","Security Engineer"};
			return jobRoleTitleGlobant;
			
		}else if(companyName=="Thoughtworks"){
			String[] jobRoleTitleThoughtworks={"Full Stack Developer","Game Developer","Data Engineer","Network Engineer","Software Engineer","Accountant","IT Support Specialist","Training Manager","Android Developer","Data Scientist","Solutions Architect","Security Engineer","AR VR Developer","Mobile App Developer","Power BI Developer","Cloud Engineer","HR Executive","QA Engineer","Embedded Systems Engineer","Customer Success Manager"};
			return jobRoleTitleThoughtworks;
			
		}else if(companyName=="Mindtree"){
			String[] jobRoleTitleMindtree={"UI Designer","Blockchain Developer","Talent Acquisition Specialist","Hardware Engineer","Content Strategist","iOS Developer","Mobile App Developer","Solutions Architect","Training Manager","Tableau Developer","NLP Engineer","Pre Sales Consultant","Database Administrator","Program Manager","Data Analyst","Supply Chain Analyst","Enterprise Architect","Digital Marketing Specialist","Accountant","AI Research Scientist"};
			return jobRoleTitleMindtree;
			
		}else if(companyName=="L&T Technology Services"){
			String[] jobRoleTitleLTTechnologyServices={"Blockchain Developer","Big Data Engineer","Penetration Tester","Network Engineer","Senior Software Engineer","Android Developer","Accountant","Database Administrator","QA Engineer","Operations Manager","Product Manager","Cyber Security Analyst","Business Analyst","Procurement Specialist","UI Designer","Computer Vision Engineer","BI Developer","Tableau Developer","Firmware Engineer","Software Engineer"};
			return jobRoleTitleLTTechnologyServices;
			
		}else if(companyName=="Persistent Systems"){
			String[] jobRoleTitlePersistentSystems={"Embedded Systems Engineer","Automation Test Engineer","Data Analyst","Program Manager","Tableau Developer","IT Support Specialist","Android Developer","Firmware Engineer","SEO Analyst","Procurement Specialist","BI Developer","iOS Developer","Data Engineer","Power BI Developer","Accountant","Enterprise Architect","Senior Software Engineer","Customer Success Manager","UX Researcher","Project Manager"};
			return jobRoleTitlePersistentSystems;
			
		}else if(companyName=="Mphasis"){
			String[] jobRoleTitleMphasis={"Technical Support Engineer","BI Developer","Program Manager","System Administrator","Big Data Engineer","NLP Engineer","Security Engineer","iOS Developer","Firmware Engineer","Embedded Systems Engineer","Cyber Security Analyst","Solutions Architect","Digital Marketing Specialist","Training Manager","Network Engineer","HR Executive","Sales Engineer","Mobile App Developer","UI Designer","Procurement Specialist"};
			return jobRoleTitleMphasis;
			
		}else if(companyName=="Hexaware"){
			String[] jobRoleTitleHexaware={"Business Analyst","Project Manager","Machine Learning Engineer","Tableau Developer","Automation Test Engineer","Database Administrator","Customer Success Manager","Digital Marketing Specialist","Hardware Engineer","SEO Analyst","BI Developer","QA Engineer","Supply Chain Analyst","Product Manager","iOS Developer","UI Designer","NLP Engineer","Embedded Systems Engineer","Computer Vision Engineer","UX Researcher"};
			return jobRoleTitleHexaware;
			
		}else if(companyName=="Birlasoft"){
			String[] jobRoleTitleBirlasoft={"Data Scientist","Finance Analyst","Automation Test Engineer","UX Researcher","Project Manager","Security Engineer","QA Engineer","System Administrator","Software Engineer","Power BI Developer","Hardware Engineer","DevOps Engineer","UI Designer","Frontend Developer","Backend Developer","Firmware Engineer","Procurement Specialist","Content Strategist","AR VR Developer","Android Developer"};
			return jobRoleTitleBirlasoft;
			
		}else if(companyName=="Cyient"){
			String[] jobRoleTitleCyient={"Data Scientist","Operations Manager","Software Engineer","AI Research Scientist","UX Researcher","iOS Developer","Sales Engineer","Enterprise Architect","Network Engineer","QA Engineer","Backend Developer","Business Analyst","Accountant","Machine Learning Engineer","Full Stack Developer","Technical Support Engineer","Android Developer","Tableau Developer","Procurement Specialist","AR VR Developer"};
			return jobRoleTitleCyient;
			
		}else if(companyName=="KPIT Technologies"){
			String[] jobRoleTitleKPITTechnologies={"ETL Developer","Backend Developer","Cloud Engineer","Customer Success Manager","Talent Acquisition Specialist","AI Research Scientist","System Administrator","Data Analyst","Program Manager","Machine Learning Engineer","Firmware Engineer","SEO Analyst","IT Support Specialist","Computer Vision Engineer","Digital Marketing Specialist","Blockchain Developer","Project Manager","Embedded Systems Engineer","Penetration Tester","Enterprise Architect"};
			return jobRoleTitleKPITTechnologies;
			
		}else if(companyName=="Zensar Technologies"){
			String[] jobRoleTitleZensarTechnologies={"Customer Success Manager","Enterprise Architect","System Administrator","Operations Manager","NLP Engineer","Solutions Architect","Pre Sales Consultant","AI Research Scientist","Blockchain Developer","Backend Developer","Training Manager","Digital Marketing Specialist","Data Scientist","Product Manager","AR VR Developer","Content Strategist","Business Analyst","Big Data Engineer","Data Analyst","Site Reliability Engineer"};
			return jobRoleTitleZensarTechnologies;
			
		}else if(companyName=="Sonata Software"){
			String[] jobRoleTitleSonataSoftware={"Program Manager","QA Engineer","Firmware Engineer","Full Stack Developer","Site Reliability Engineer","Software Engineer","IT Support Specialist","Enterprise Architect","BI Developer","Computer Vision Engineer","iOS Developer","UX Researcher","Frontend Developer","Project Manager","Content Strategist","Power BI Developer","Tableau Developer","Mobile App Developer","Procurement Specialist","Digital Marketing Specialist"};
			return jobRoleTitleSonataSoftware;
			
		}else if(companyName=="Sasken Technologies"){
			String[] jobRoleTitleSaskenTechnologies={"Sales Engineer","Business Analyst","HR Executive","Customer Success Manager","AR VR Developer","NLP Engineer","Big Data Engineer","Talent Acquisition Specialist","Automation Test Engineer","Solutions Architect","Machine Learning Engineer","Hardware Engineer","Project Manager","Data Engineer","Cloud Engineer","UI Designer","Tableau Developer","Full Stack Developer","Backend Developer","Site Reliability Engineer"};
			return jobRoleTitleSaskenTechnologies;
			
		}else if(companyName=="Zoho"){
			String[] jobRoleTitleZoho={"HR Executive","System Administrator","Computer Vision Engineer","Digital Marketing Specialist","Training Manager","AI Research Scientist","UX Researcher","Enterprise Architect","Machine Learning Engineer","Mobile App Developer","BI Developer","Sales Engineer","Pre Sales Consultant","Technical Support Engineer","UI Designer","Game Developer","Hardware Engineer","Android Developer","Finance Analyst","Data Analyst"};
			return jobRoleTitleZoho;
			
		}else if(companyName=="Freshworks"){
			String[] jobRoleTitleFreshworks={"Computer Vision Engineer","Frontend Developer","Supply Chain Analyst","Solutions Architect","Digital Marketing Specialist","Database Administrator","Pre Sales Consultant","Business Analyst","Senior Software Engineer","Data Analyst","Project Manager","ETL Developer","AI Research Scientist","NLP Engineer","Training Manager","Content Strategist","UI Designer","SEO Analyst","Sales Engineer","QA Engineer"};
			return jobRoleTitleFreshworks;
			
		}else if(companyName=="Paytm"){
			String[] jobRoleTitlePaytm={"iOS Developer","Embedded Systems Engineer","Data Engineer","Enterprise Architect","UI Designer","QA Engineer","NLP Engineer","Solutions Architect","AR VR Developer","Android Developer","Data Analyst","Pre Sales Consultant","Cyber Security Analyst","IT Support Specialist","Network Engineer","Database Administrator","Big Data Engineer","Data Scientist","Site Reliability Engineer","Tableau Developer"};
			return jobRoleTitlePaytm;
			
		}else if(companyName=="PhonePe"){
			String[] jobRoleTitlePhonePe={"IT Support Specialist","BI Developer","Android Developer","UX Researcher","Big Data Engineer","Technical Support Engineer","Training Manager","SEO Analyst","Firmware Engineer","Frontend Developer","Mobile App Developer","Data Analyst","Database Administrator","Business Analyst","Finance Analyst","Machine Learning Engineer","Operations Manager","Game Developer","Software Engineer","Hardware Engineer"};
			return jobRoleTitlePhonePe;
			
		}else if(companyName=="Razorpay"){
			String[] jobRoleTitleRazorpay={"Mobile App Developer","IT Support Specialist","Backend Developer","Automation Test Engineer","Embedded Systems Engineer","Security Engineer","Blockchain Developer","SEO Analyst","Android Developer","AR VR Developer","Enterprise Architect","Finance Analyst","Customer Success Manager","Product Manager","UI Designer","Firmware Engineer","DevOps Engineer","UX Researcher","HR Executive","Training Manager"};
			return jobRoleTitleRazorpay;
			
		}else if(companyName=="Flipkart"){
			String[] jobRoleTitleFlipkart={"Machine Learning Engineer","Senior Software Engineer","AR VR Developer","Computer Vision Engineer","Talent Acquisition Specialist","Program Manager","Power BI Developer","Site Reliability Engineer","System Administrator","Firmware Engineer","Software Engineer","Supply Chain Analyst","IT Support Specialist","Data Analyst","Project Manager","Pre Sales Consultant","Mobile App Developer","Accountant","Data Engineer","Cloud Engineer"};
			return jobRoleTitleFlipkart;
			
		}else if(companyName=="Meesho"){
			String[] jobRoleTitleMeesho={"Android Developer","Sales Engineer","Power BI Developer","UX Researcher","Game Developer","Customer Success Manager","UI Designer","IT Support Specialist","iOS Developer","Training Manager","Program Manager","Mobile App Developer","Firmware Engineer","Cloud Engineer","Penetration Tester","Automation Test Engineer","Computer Vision Engineer","Supply Chain Analyst","DevOps Engineer","Full Stack Developer"};
			return jobRoleTitleMeesho;
			
		}else if(companyName=="Swiggy"){
			String[] jobRoleTitleSwiggy={"UI Designer","Content Strategist","HR Executive","Accountant","IT Support Specialist","Network Engineer","Customer Success Manager","Game Developer","Pre Sales Consultant","Software Engineer","UX Researcher","Tableau Developer","System Administrator","NLP Engineer","Digital Marketing Specialist","Big Data Engineer","Android Developer","Cloud Engineer","Enterprise Architect","Hardware Engineer"};
			return jobRoleTitleSwiggy;
			
		}else if(companyName=="Zomato"){
			String[] jobRoleTitleZomato={"iOS Developer","Cyber Security Analyst","Network Engineer","Firmware Engineer","SEO Analyst","Hardware Engineer","Penetration Tester","Mobile App Developer","Database Administrator","Automation Test Engineer","BI Developer","Program Manager","AI Research Scientist","Accountant","Project Manager","IT Support Specialist","Frontend Developer","Training Manager","Pre Sales Consultant","Digital Marketing Specialist"};
			return jobRoleTitleZomato;
			
		}else if(companyName=="Ola"){
			String[] jobRoleTitleOla={"Penetration Tester","Big Data Engineer","HR Executive","Training Manager","Data Engineer","Cloud Engineer","Android Developer","Frontend Developer","DevOps Engineer","Game Developer","NLP Engineer","Network Engineer","Data Scientist","Enterprise Architect","SEO Analyst","Embedded Systems Engineer","Mobile App Developer","Software Engineer","Operations Manager","IT Support Specialist"};
			return jobRoleTitleOla;
			
		}else if(companyName=="Uber"){
			String[] jobRoleTitleUber={"Operations Manager","Data Engineer","Cloud Engineer","Full Stack Developer","iOS Developer","HR Executive","Business Analyst","Network Engineer","Blockchain Developer","BI Developer","Technical Support Engineer","Sales Engineer","Data Analyst","Finance Analyst","ETL Developer","Hardware Engineer","Penetration Tester","Database Administrator","AR VR Developer","Android Developer"};
			return jobRoleTitleUber;
			
		}else if(companyName=="Airbnb"){
			String[] jobRoleTitleAirbnb={"Operations Manager","Hardware Engineer","Frontend Developer","Blockchain Developer","Full Stack Developer","Program Manager","AR VR Developer","ETL Developer","UX Researcher","Project Manager","Digital Marketing Specialist","Data Analyst","Solutions Architect","Data Scientist","Accountant","Power BI Developer","HR Executive","Enterprise Architect","Site Reliability Engineer","System Administrator"};
			return jobRoleTitleAirbnb;
			
		}else if(companyName=="Booking Holdings"){
			String[] jobRoleTitleBookingHoldings={"Procurement Specialist","Senior Software Engineer","Frontend Developer","Database Administrator","HR Executive","Backend Developer","UX Researcher","Cyber Security Analyst","Security Engineer","Solutions Architect","Cloud Engineer","Program Manager","Embedded Systems Engineer","IT Support Specialist","AI Research Scientist","ETL Developer","QA Engineer","Site Reliability Engineer","BI Developer","Data Analyst"};
			return jobRoleTitleBookingHoldings;
			
		}else if(companyName=="Expedia Group"){
			String[] jobRoleTitleExpediaGroup={"Blockchain Developer","Operations Manager","Penetration Tester","Pre Sales Consultant","ETL Developer","Program Manager","Android Developer","NLP Engineer","Cloud Engineer","Project Manager","Mobile App Developer","AR VR Developer","Business Analyst","HR Executive","SEO Analyst","Big Data Engineer","Software Engineer","Digital Marketing Specialist","UX Researcher","Hardware Engineer"};
			return jobRoleTitleExpediaGroup;
			
		}else if(companyName=="Netflix"){
			String[] jobRoleTitleNetflix={"Site Reliability Engineer","Full Stack Developer","Enterprise Architect","Cyber Security Analyst","NLP Engineer","System Administrator","AR VR Developer","Solutions Architect","BI Developer","Business Analyst","Mobile App Developer","Operations Manager","Automation Test Engineer","Penetration Tester","iOS Developer","Data Scientist","Program Manager","Digital Marketing Specialist","AI Research Scientist","Procurement Specialist"};
			return jobRoleTitleNetflix;
			
		}else if(companyName=="Disney"){
			String[] jobRoleTitleDisney={"AI Research Scientist","UX Researcher","BI Developer","Sales Engineer","Senior Software Engineer","Finance Analyst","Big Data Engineer","Technical Support Engineer","UI Designer","Software Engineer","Pre Sales Consultant","ETL Developer","Digital Marketing Specialist","Backend Developer","Computer Vision Engineer","Android Developer","Procurement Specialist","Project Manager","Tableau Developer","Cyber Security Analyst"};
			return jobRoleTitleDisney;
			
		}else if(companyName=="Warner Bros Discovery"){
			String[] jobRoleTitleWarnerBrosDiscovery={"Project Manager","AR VR Developer","Automation Test Engineer","Blockchain Developer","Business Analyst","ETL Developer","SEO Analyst","Tableau Developer","Content Strategist","Big Data Engineer","Operations Manager","DevOps Engineer","Sales Engineer","Data Scientist","Accountant","Data Engineer","Frontend Developer","System Administrator","Enterprise Architect","BI Developer"};
			return jobRoleTitleWarnerBrosDiscovery;
			
		}else if(companyName=="Spotify"){
			String[] jobRoleTitleSpotify={"NLP Engineer","Security Engineer","Tableau Developer","DevOps Engineer","Data Analyst","UX Researcher","Database Administrator","Digital Marketing Specialist","IT Support Specialist","QA Engineer","Automation Test Engineer","Procurement Specialist","Hardware Engineer","Sales Engineer","Embedded Systems Engineer","Game Developer","UI Designer","Site Reliability Engineer","Business Analyst","iOS Developer"};
			return jobRoleTitleSpotify;
			
		}else if(companyName=="Twitter (X)"){
			String[] jobRoleTitleTwitterX={"Talent Acquisition Specialist","UX Researcher","Digital Marketing Specialist","Operations Manager","Network Engineer","Pre Sales Consultant","Machine Learning Engineer","Mobile App Developer","Full Stack Developer","Cloud Engineer","SEO Analyst","Project Manager","ETL Developer","Tableau Developer","HR Executive","Technical Support Engineer","Firmware Engineer","Security Engineer","Data Analyst","Power BI Developer"};
			return jobRoleTitleTwitterX;
			
		}else if(companyName=="LinkedIn"){
			String[] jobRoleTitleLinkedIn={"Software Engineer","Business Analyst","Hardware Engineer","Machine Learning Engineer","Mobile App Developer","Security Engineer","ETL Developer","Digital Marketing Specialist","Accountant","Sales Engineer","NLP Engineer","Penetration Tester","AR VR Developer","Operations Manager","Data Scientist","Training Manager","Project Manager","iOS Developer","Senior Software Engineer","Blockchain Developer"};
			return jobRoleTitleLinkedIn;
			
		}else if(companyName=="Snap Inc"){
			String[] jobRoleTitleSnapInc={"Supply Chain Analyst","Firmware Engineer","Database Administrator","Blockchain Developer","Project Manager","Data Engineer","Full Stack Developer","AR VR Developer","Training Manager","Mobile App Developer","BI Developer","System Administrator","Operations Manager","IT Support Specialist","Machine Learning Engineer","DevOps Engineer","Frontend Developer","HR Executive","Content Strategist","Android Developer"};
			return jobRoleTitleSnapInc;
			
		}else if(companyName=="Pinterest"){
			String[] jobRoleTitlePinterest={"Machine Learning Engineer","Data Scientist","Program Manager","Supply Chain Analyst","Hardware Engineer","DevOps Engineer","Penetration Tester","Mobile App Developer","Security Engineer","Big Data Engineer","Digital Marketing Specialist","BI Developer","Procurement Specialist","IT Support Specialist","NLP Engineer","Cloud Engineer","HR Executive","Data Engineer","Sales Engineer","Android Developer"};
			return jobRoleTitlePinterest;
			
		}else if(companyName=="Reddit"){
			String[] jobRoleTitleReddit={"Blockchain Developer","IT Support Specialist","UI Designer","Frontend Developer","BI Developer","Security Engineer","Product Manager","Enterprise Architect","Finance Analyst","Program Manager","Operations Manager","Data Scientist","ETL Developer","HR Executive","Hardware Engineer","Data Engineer","Cyber Security Analyst","Backend Developer","Technical Support Engineer","Customer Success Manager"};
			return jobRoleTitleReddit;
			
		}else if(companyName=="Dropbox"){
			String[] jobRoleTitleDropbox={"Automation Test Engineer","Machine Learning Engineer","Accountant","Training Manager","Mobile App Developer","Data Analyst","Big Data Engineer","Product Manager","Data Engineer","AR VR Developer","Computer Vision Engineer","Senior Software Engineer","Backend Developer","Network Engineer","Program Manager","DevOps Engineer","AI Research Scientist","Finance Analyst","Full Stack Developer","Firmware Engineer"};
			return jobRoleTitleDropbox;
			
		}else if(companyName=="Pinterst"){
			String[] jobRoleTitlePinterst={"Frontend Developer","Backend Developer","Data Scientist","Product Manager","UI Designer","Software Engineer","Machine Learning Engineer","Data Analyst","Security Engineer","DevOps Engineer","QA Engineer","Systems Architect","UX Researcher","Project Manager","Technical Support Engineer","Content Strategist","HR Executive","Legal Assistant","Finance Analyst","Solutions Architect"};
			return jobRoleTitlePinterst;
			
		}else if(companyName=="Snap"){
			String[] jobRoleTitleSnap={"Computer Vision Engineer","AR VR Developer","Mobile App Developer","Software Engineer","Product Manager","Data Scientist","UI Designer","UX Researcher","Backend Developer","Frontend Developer","Security Engineer","DevOps Engineer","QA Engineer","Project Manager","Data Analyst","Hardware Engineer","Research Scientist","HR Executive","Finance Analyst","Systems Administrator"};
			return jobRoleTitleSnap;
			
		}else if(companyName=="Uber"){
			String[] jobRoleTitleUber={"Data Scientist","Machine Learning Engineer","Backend Developer","Mobile App Developer","Product Manager","Software Engineer","Frontend Developer","Operations Manager","Data Analyst","Security Engineer","DevOps Engineer","Systems Architect","UI Designer","UX Researcher","Project Manager","Business Analyst","HR Executive","Technical Support Engineer","Legal Counsel","Finance Analyst"};
			return jobRoleTitleUber;
			
		}else if(companyName=="Lyft"){
			String[] jobRoleTitleLyft={"Software Engineer","Data Scientist","Product Manager","Backend Developer","Frontend Developer","Full Stack Developer","Mobile App Developer","Data Analyst","Security Engineer","DevOps Engineer","UI Designer","UX Researcher","Project Manager","Operations Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant"};
			return jobRoleTitleLyft;
			
		}else if(companyName=="Airbxb"){
			String[] jobRoleTitleAirbxb={"Full Stack Developer","Data Scientist","Product Manager","UI Designer","UX Researcher","Software Engineer","Backend Developer","Frontend Developer","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","Operations Manager","Customer Success Manager","Content Strategist","HR Executive","Legal Assistant","Finance Analyst","Systems Architect","QA Engineer"};
			return jobRoleTitleAirbxb;
			
		}else if(companyName=="DoorDash"){
			String[] jobRoleTitleDoorDash={"Software Engineer","Data Scientist","Product Manager","Operations Manager","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Mobile App Developer","Security Engineer","DevOps Engineer","Project Manager","Business Analyst","UI Designer","UX Researcher","Customer Support Specialist","HR Executive","Finance Analyst","Systems Architect","QA Engineer"};
			return jobRoleTitleDoorDash;
			
		}else if(companyName=="Instacart"){
			String[] jobRoleTitleInstacart={"Software Engineer","Data Scientist","Product Manager","Backend Developer","Frontend Developer","Full Stack Developer","Mobile App Developer","Data Analyst","Operations Manager","Security Engineer","DevOps Engineer","Project Manager","UI Designer","UX Researcher","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Business Analyst"};
			return jobRoleTitleInstacart;
			
		}else if(companyName=="Slack"){
			String[] jobRoleTitleSlack={"Software Engineer","Product Manager","Backend Developer","Frontend Developer","Full Stack Developer","UI Designer","UX Researcher","Data Scientist","Security Engineer","DevOps Engineer","Customer Success Manager","Technical Support Engineer","Project Manager","Program Manager","Data Analyst","Systems Architect","HR Executive","Finance Analyst","QA Engineer","Content Strategist"};
			return jobRoleTitleSlack;
			
		}else if(companyName=="Discord"){
			String[] jobRoleTitleDiscord={"Backend Developer","Frontend Developer","Full Stack Developer","Software Engineer","Product Manager","UI Designer","UX Researcher","Security Engineer","DevOps Engineer","Data Scientist","Data Analyst","Project Manager","Customer Support Specialist","Community Manager","Trust and Safety Analyst","Systems Architect","QA Engineer","HR Executive","Finance Analyst","Technical Writer"};
			return jobRoleTitleDiscord;
			
		}else if(companyName=="Twitch"){
			String[] jobRoleTitleTwitch={"Software Engineer","Backend Developer","Frontend Developer","Product Manager","Data Scientist","UI Designer","UX Researcher","Security Engineer","DevOps Engineer","Video Engineer","Data Analyst","Project Manager","Community Manager","Content Strategist","Operations Manager","Systems Architect","QA Engineer","HR Executive","Finance Analyst","Technical Support Engineer"};
			return jobRoleTitleTwitch;
			
		}else if(companyName=="Box Inc"){
			String[] jobRoleTitleBoxInc={"Software Engineer","Program Manager","Data Scientist","Cloud Engineer","Security Engineer","Solutions Architect","Research Scientist","Backend Developer","Frontend Developer","Full Stack Developer","UX Designer","Product Manager","Hardware Engineer","System Administrator","DevOps Engineer","Data Analyst","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel"};
			return jobRoleTitleBoxInc;
			
		}else if(companyName=="ServiceNow"){
			String[] jobRoleTitleServiceNow={"Hardware Engineer","Software Engineer","Firmware Engineer","Product Designer","UI Designer","UX Researcher","Data Scientist","Machine Learning Engineer","Backend Developer","Frontend Developer","Operations Manager","Supply Chain Analyst","Security Engineer","Systems Architect","QA Engineer","Project Manager","Data Analyst","HR Executive","Finance Analyst","Technical Support Engineer"};
			return jobRoleTitleServiceNow;
			
		}else if(companyName=="Workday"){
			String[] jobRoleTitleWorkday={"Software Engineer","Site Reliability Engineer","Data Scientist","Product Manager","UX Designer","Research Scientist","Cloud Architect","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","Data Analyst","Machine Learning Engineer","Project Manager","Network Engineer","Hardware Engineer","Solutions Architect","HR Executive","Finance Analyst","Technical Writer"};
			return jobRoleTitleWorkday;
			
		}else if(companyName=="Okta"){
			String[] jobRoleTitleOkta={"Software Development Engineer","Solutions Architect","Operations Manager","Data Scientist","Business Analyst","Cloud Engineer","Systems Architect","Backend Developer","Frontend Developer","Full Stack Developer","Product Manager","Supply Chain Analyst","Security Engineer","DevOps Engineer","Data Analyst","QA Engineer","Hardware Engineer","HR Executive","Finance Analyst","Technical Support Engineer"};
			return jobRoleTitleOkta;
			
		}else if(companyName=="Twilio"){
			String[] jobRoleTitleTwilio={"Software Engineer","Data Scientist","Product Manager","Product Designer","UX Researcher","Machine Learning Engineer","Production Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","Data Analyst","Research Scientist","Project Manager","Hardware Engineer","AR VR Developer","Systems Architect","HR Executive","Finance Analyst","Legal Counsel"};
			return jobRoleTitleTwilio;
			
		}else if(companyName=="Stripe"){
			String[] jobRoleTitleStripe={"Software Engineer","Data Scientist","Content Strategist","Product Manager","UI Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","Cloud Engineer","Data Analyst","Machine Learning Engineer","Project Manager","Systems Architect","QA Engineer","Operations Manager","HR Executive","Finance Analyst","Legal Assistant"};
			return jobRoleTitleStripe;
			
		}else if(companyName=="Square (Block)"){
			String[] jobRoleTitleSquare={"Hardware Engineer","Software Engineer","Deep Learning Engineer","ASIC Design Engineer","Graphics Engineer","System Architect","Verification Engineer","Backend Developer","Firmware Engineer","Data Scientist","Product Manager","Research Scientist","QA Engineer","Project Manager","Data Analyst","Security Engineer","Supply Chain Analyst","HR Executive","Finance Analyst","Technical Writer"};
			return jobRoleTitleSquare;
			
		}else if(companyName=="PayPal"){
			String[] jobRoleTitlePayPal={"Silicon Design Engineer","Software Engineer","Hardware Engineer","Firmware Engineer","System Architect","Verification Engineer","Product Manager","Data Scientist","Backend Developer","Frontend Developer","QA Engineer","Project Manager","Data Analyst","Security Engineer","Supply Chain Analyst","Operations Manager","HR Executive","Finance Analyst","Technical Support Engineer","Legal Assistant"};
			return jobRoleTitlePayPal;
			
		}else if(companyName=="Visa"){
			String[] jobRoleTitleVisa={"Embedded Systems Engineer","Software Engineer","Hardware Engineer","Firmware Engineer","RF Engineer","System Architect","ASIC Design Engineer","Data Scientist","Product Manager","Research Scientist","QA Engineer","Project Manager","Data Analyst","Security Engineer","Supply Chain Analyst","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel","Operations Manager"};
			return jobRoleTitleVisa;
			
		}else if(companyName=="Mastercard"){
			String[] jobRoleTitleMastercard={"Hardware Engineer","Software Engineer","ASIC Design Engineer","Firmware Engineer","System Architect","Verification Engineer","Product Manager","Data Scientist","Backend Developer","Frontend Developer","QA Engineer","Project Manager","Data Analyst","Security Engineer","Supply Chain Analyst","Technical Support Engineer","HR Executive","Finance Analyst","Operations Manager","Systems Administrator"};
			return jobRoleTitleMastercard;
			
		}else if(companyName=="Marvell"){
			String[] jobRoleTitleMarvell={"Hardware Engineer","Software Engineer","ASIC Design Engineer","Firmware Engineer","System Architect","Verification Engineer","Product Manager","Data Scientist","Backend Developer","Frontend Developer","QA Engineer","Project Manager","Data Analyst","Security Engineer","Supply Chain Analyst","Technical Support Engineer","HR Executive","Finance Analyst","Operations Manager","Analog Design Engineer"};
			return jobRoleTitleMarvell;
			
		}else if(companyName=="Micron"){
			String[] jobRoleTitleMicron={"Process Engineer","Hardware Engineer","Software Engineer","Product Engineer","Test Engineer","Data Scientist","Data Analyst","System Architect","Firmware Engineer","Operations Manager","Supply Chain Analyst","QA Engineer","Project Manager","Security Engineer","HR Executive","Finance Analyst","Technical Support Engineer","Manufacturing Engineer","Legal Assistant","Facilities Engineer"};
			return jobRoleTitleMicron;
			
		}else if(companyName=="Western Digital"){
			String[] jobRoleTitleWesternDigital={"Firmware Engineer","Hardware Engineer","Software Engineer","Systems Engineer","Test Engineer","Data Scientist","Data Analyst","Product Manager","QA Engineer","Project Manager","Security Engineer","Supply Chain Analyst","Operations Manager","Manufacturing Engineer","HR Executive","Finance Analyst","Technical Support Engineer","Mechanical Engineer","Electrical Engineer","Legal Assistant"};
			return jobRoleTitleWesternDigital;
			
		}else if(companyName=="Seagate"){
			String[] jobRoleTitleSeagate={"Firmware Engineer","Hardware Engineer","Software Engineer","Systems Engineer","Data Scientist","Data Analyst","Product Manager","QA Engineer","Project Manager","Security Engineer","Supply Chain Analyst","Operations Manager","Manufacturing Engineer","Mechanical Engineer","Electrical Engineer","HR Executive","Finance Analyst","Technical Support Engineer","Legal Assistant","Facilities Engineer"};
			return jobRoleTitleSeagate;
			
		}else if(companyName=="HP"){
			String[] jobRoleTitleHP={"Software Engineer","Hardware Engineer","System Administrator","Data Scientist","Data Analyst","Product Manager","Project Manager","Operations Manager","Supply Chain Analyst","Quality Engineer","Technical Support Engineer","Security Engineer","Full Stack Developer","Backend Developer","Frontend Developer","HR Executive","Finance Analyst","Marketing Specialist","Legal Counsel","Customer Success Manager"};
			return jobRoleTitleHP;
			
		}else if(companyName=="Dell"){
			String[] jobRoleTitleDell={"System Engineer","Software Engineer","Hardware Engineer","Solutions Architect","Data Scientist","Data Analyst","Product Manager","Project Manager","Technical Support Engineer","Operations Manager","Supply Chain Analyst","Security Engineer","Network Engineer","Cloud Engineer","QA Engineer","HR Executive","Finance Analyst","Sales Executive","Legal Assistant","Marketing Manager"};
			return jobRoleTitleDell;
			
		}else if(companyName=="Lenovo"){
			String[] jobRoleTitleLenovo={"Hardware Engineer","Software Engineer","System Administrator","Data Scientist","Data Analyst","Product Manager","Project Manager","Operations Manager","Supply Chain Analyst","QA Engineer","Technical Support Engineer","Security Engineer","Frontend Developer","Backend Developer","Full Stack Developer","HR Executive","Finance Analyst","Marketing Specialist","Legal Assistant","Sales Representative"};
			return jobRoleTitleLenovo;
			
		}else if(companyName=="Morgan Stanley"){
			String[] jobRoleTitleMorgan={"Hardware Engineer","Software Engineer","Firmware Engineer","Process Engineer","Data Scientist","Data Analyst","Product Manager","Project Manager","Operations Manager","Supply Chain Analyst","QA Engineer","Technical Support Engineer","Security Engineer","Mobile App Developer","Research Scientist","HR Executive","Finance Analyst","Legal Counsel","Marketing Manager","UI Designer"};
			return jobRoleTitleMorgan;
			
		}else if(companyName=="Goldman Sachs"){
			String[] jobRoleTitleSachs={"Software Engineer","Game Developer","Hardware Engineer","Firmware Engineer","Embedded Systems Engineer","Product Manager","Data Scientist","Data Analyst","UI Designer","UX Researcher","Operations Manager","Project Manager","QA Engineer","Security Engineer","Research Scientist","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","Supply Chain Analyst"};
			return jobRoleTitleSachs;
			
		}else if(companyName=="Panasonic"){
			String[] jobRoleTitlePanasonic={"Electrical Engineer","Mechanical Engineer","Software Engineer","Hardware Engineer","System Architect","Data Scientist","Data Analyst","Product Manager","Project Manager","Operations Manager","Supply Chain Analyst","QA Engineer","Technical Support Engineer","Security Engineer","Manufacturing Engineer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","Facilities Engineer"};
			return jobRoleTitlePanasonic;
			
		}else if(companyName=="LG"){
			String[] jobRoleTitleLG={"Hardware Engineer","Software Engineer","Firmware Engineer","Electrical Engineer","Mechanical Engineer","Data Scientist","Data Analyst","Product Manager","Project Manager","Operations Manager","Supply Chain Analyst","QA Engineer","Technical Support Engineer","Security Engineer","Manufacturing Engineer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","UI Designer"};
			return jobRoleTitleLG;
			
		}else if(companyName=="Nintendo"){
			String[] jobRoleTitleNintendo={"Game Developer","Software Engineer","Hardware Engineer","Firmware Engineer","Embedded Systems Engineer","Product Manager","UI Designer","UX Researcher","QA Engineer","Project Manager","Data Analyst","Network Engineer","Security Engineer","Operations Manager","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","Localization Specialist","Game Designer"};
			return jobRoleTitleNintendo;
			
		}else if(companyName=="Sega"){
			String[] jobRoleTitleSega={"Game Developer","Software Engineer","Game Designer","UI Designer","UX Researcher","Product Manager","QA Engineer","Project Manager","Data Analyst","Security Engineer","Operations Manager","Network Engineer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","Localization Specialist","Backend Developer","Systems Administrator","Graphic Artist"};
			return jobRoleTitleSega;
			
		}else if(companyName=="Capcom"){
			String[] jobRoleTitleCapcom={"Game Developer","Software Engineer","Game Designer","UI Designer","UX Researcher","Product Manager","QA Engineer","Project Manager","Data Analyst","Security Engineer","Operations Manager","Network Engineer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","Localization Specialist","Character Artist","Backend Developer","Systems Architect"};
			return jobRoleTitleCapcom;
			
		}else if(companyName=="EA"){
			String[] jobRoleTitleEA={"Game Developer","Software Engineer","Game Designer","Data Scientist","Data Analyst","Product Manager","UI Designer","UX Researcher","QA Engineer","Project Manager","Security Engineer","Operations Manager","Backend Developer","Frontend Developer","Full Stack Developer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","Online Services Engineer"};
			return jobRoleTitleEA;
			
		}else if(companyName=="Ubisoft"){
			String[] jobRoleTitleUbisoft={"Game Developer","Software Engineer","Game Designer","Level Designer","UI Designer","UX Researcher","Product Manager","QA Engineer","Project Manager","Data Analyst","Security Engineer","Operations Manager","Network Engineer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","Localization Specialist","Character Artist","Backend Developer"};
			return jobRoleTitleUbisoft;
			
		}else if(companyName=="Activision"){
			String[] jobRoleTitleActivision={"Game Developer","Software Engineer","Game Designer","Data Scientist","Data Analyst","Product Manager","UI Designer","UX Researcher","QA Engineer","Project Manager","Security Engineer","Operations Manager","Backend Developer","Frontend Developer","Full Stack Developer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","DevOps Engineer"};
			return jobRoleTitleActivision;
			
		}else if(companyName=="TakeTwo"){
			String[] jobRoleTitleTakeTwo={"Game Developer","Software Engineer","Game Designer","UI Designer","UX Researcher","Product Manager","QA Engineer","Project Manager","Data Analyst","Security Engineer","Operations Manager","Network Engineer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","Backend Developer","Full Stack Developer","DevOps Engineer","Data Scientist"};
			return jobRoleTitleTakeTwo;
			
		}else if(companyName=="RiotGames"){
			String[] jobRoleTitleRiotGames={"Software Engineer","Game Developer","Data Scientist","Product Manager","UX Designer","Game Designer","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","Site Reliability Engineer","QA Engineer","Project Manager","Data Analyst","Operations Manager","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","Community Manager"};
			return jobRoleTitleRiotGames;
			
		}else if(companyName=="EpicGames"){
			String[] jobRoleTitleEpicGames={"Software Engineer","Game Developer","Graphics Engineer","Game Designer","UI Designer","UX Researcher","Product Manager","QA Engineer","Project Manager","Data Analyst","Security Engineer","Operations Manager","Backend Developer","Frontend Developer","Full Stack Developer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","Technical Support Engineer"};
			return jobRoleTitleEpicGames;
			
		}else if(companyName=="Valve"){
			String[] jobRoleTitleValve={"Software Engineer","Game Developer","Hardware Engineer","Game Designer","Data Scientist","Product Manager","UI Designer","UX Researcher","QA Engineer","Security Engineer","Operations Manager","Systems Administrator","Data Analyst","HR Executive","Finance Analyst","Legal Counsel","Marketing Specialist","Localization Specialist","Backend Developer","Frontend Developer"};
			return jobRoleTitleValve;
			
		}else if(companyName=="Spotify"){
			String[] jobRoleTitleSpotify={"Software Engineer","Data Scientist","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Product Manager","UX Designer","UX Researcher","Machine Learning Engineer","Security Engineer","DevOps Engineer","Site Reliability Engineer","Project Manager","Program Manager","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","Content Strategist"};
			return jobRoleTitleSpotify;
			
		}else if(companyName=="SoundCloud"){
			String[] jobRoleTitleSoundCloud={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Product Manager","Data Scientist","Data Analyst","UI Designer","UX Researcher","Security Engineer","DevOps Engineer","Project Manager","Community Manager","Content Strategist","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant"};
			return jobRoleTitleSoundCloud;
			
		}else if(companyName=="Pandora"){
			String[] jobRoleTitlePandora={"Software Engineer","Data Scientist","Product Manager","Backend Developer","Frontend Developer","Full Stack Developer","UI Designer","UX Researcher","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","Operations Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist"};
			return jobRoleTitlePandora;
			
		}else if(companyName=="Tidal"){
			String[] jobRoleTitleTidal={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Product Manager","Data Scientist","Data Analyst","UI Designer","UX Researcher","Security Engineer","DevOps Engineer","Project Manager","Content Strategist","Community Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant"};
			return jobRoleTitleTidal;
			
		}else if(companyName=="Deezer"){
			String[] jobRoleTitleDeezer={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Product Manager","Data Scientist","Data Analyst","UI Designer","UX Researcher","Security Engineer","DevOps Engineer","Project Manager","Content Strategist","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant","Operations Manager"};
			return jobRoleTitleDeezer;
			
		}else if(companyName=="Quora"){
			String[] jobRoleTitleQuora={"Software Engineer","Data Scientist","Machine Learning Engineer","Product Manager","Product Designer","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","Community Manager","Content Strategist","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel"};
			return jobRoleTitleQuora;
			
		}else if(companyName=="Medium"){
			String[] jobRoleTitleMedium={"Software Engineer","Product Manager","Product Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Data Scientist","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","Content Strategist","Community Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel"};
			return jobRoleTitleMedium;
			
		}else if(companyName=="StackOverflow"){
			String[] jobRoleTitleStackOverflow={"Full Stack Developer","Software Engineer","Backend Developer","Frontend Developer","Product Manager","UX Designer","Data Scientist","Data Analyst","Security Engineer","DevOps Engineer","Site Reliability Engineer","Project Manager","Community Manager","Technical Support Engineer","QA Engineer","Systems Architect","HR Executive","Finance Analyst","Legal Counsel","Content Strategist"};
			return jobRoleTitleStackOverflow;
			
		}else if(companyName=="Coursera"){
			String[] jobRoleTitleCoursera={"Software Engineer","Data Scientist","Product Manager","Product Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","Program Manager","Customer Success Manager","Content Strategist","QA Engineer","Systems Architect","HR Executive","Finance Analyst","Legal Counsel"};
			return jobRoleTitleCoursera;
			
		}else if(companyName=="Udemy"){
			String[] jobRoleTitleUdemy={"Software Engineer","Product Manager","Data Scientist","Product Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","Content Strategist","Community Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel"};
			return jobRoleTitleUdemy;
			
		}else if(companyName=="edX"){
			String[] jobRoleTitleEdx={"Software Engineer","Data Scientist","Product Manager","UX Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","Program Manager","Community Manager","Content Strategist","QA Engineer","Systems Architect","HR Executive","Finance Analyst","Legal Counsel"};
			return jobRoleTitleEdx;
			
		}else if(companyName=="KhanAcademy"){
			String[] jobRoleTitleKhanAcademy={"Software Engineer","Product Manager","Product Designer","Content Developer","Data Scientist","Data Analyst","Backend Developer","Frontend Developer","Full Stack Developer","UX Researcher","Security Engineer","DevOps Engineer","Project Manager","Community Manager","Technical Support Engineer","QA Engineer","Systems Architect","HR Executive","Finance Manager","Legal Assistant"};
			return jobRoleTitleKhanAcademy;
			
		}else if(companyName=="Duolingo"){
			String[] jobRoleTitleDuolingo={"Software Engineer","Software Engineer in Test","Product Manager","Product Designer","UX Researcher","Data Scientist","Data Analyst","Machine Learning Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Content Strategist","QA Engineer","Systems Architect","HR Executive","Finance Analyst","Legal Counsel"};
			return jobRoleTitleDuolingo;
			
		}else if(companyName=="Babbel"){
			String[] jobRoleTitleBabbel={"Software Engineer","Product Manager","Product Designer","UX Researcher","Data Scientist","Data Analyst","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Content Strategist","Community Manager","QA Engineer","Systems Architect","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist"};
			return jobRoleTitleBabbel;
			
		}else if(companyName=="RosettaStone"){
			String[] jobRoleTitleRosettaStone={"Software Engineer","Product Manager","Product Designer","UX Researcher","Data Scientist","Data Analyst","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Content Strategist","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant","Marketing Manager"};
			return jobRoleTitleRosettaStone;
			
		}else if(companyName=="Peloton"){
			String[] jobRoleTitlePeloton={"Software Engineer","Hardware Engineer","Product Manager","Data Scientist","Product Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Security Engineer","DevOps Engineer","Supply Chain Analyst","Operations Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant"};
			return jobRoleTitlePeloton;
			
		}else if(companyName=="Fitbit"){
			String[] jobRoleTitleFitbit={"Firmware Engineer","Hardware Engineer","Software Engineer","Mobile App Developer","Data Scientist","Data Analyst","Product Manager","UI Designer","UX Researcher","Backend Developer","Frontend Developer","Security Engineer","DevOps Engineer","QA Engineer","Project Manager","Supply Chain Analyst","HR Executive","Finance Analyst","Technical Support Engineer","Research Scientist"};
			return jobRoleTitleFitbit;
			
		}else if(companyName=="Garmin"){
			String[] jobRoleTitleGarmin={"Embedded Systems Engineer","Software Engineer","Hardware Engineer","Firmware Engineer","System Architect","Data Scientist","Data Analyst","Product Manager","Project Manager","QA Engineer","Operations Manager","Supply Chain Analyst","Security Engineer","Technical Support Engineer","Mobile App Developer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","Facilities Engineer"};
			return jobRoleTitleGarmin;
			
		}else if(companyName=="Strava"){
			String[] jobRoleTitleStrava={"Software Engineer","Mobile App Developer","Product Manager","Product Designer","UX Researcher","Data Scientist","Data Analyst","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Community Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant"};
			return jobRoleTitleStrava;
			
		}else if(companyName=="MyFitnessPal"){
			String[] jobRoleTitleMyFitnessPal={"Software Engineer","Mobile App Developer","Product Manager","Product Designer","UX Researcher","Data Scientist","Data Analyst","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Content Strategist","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant"};
			return jobRoleTitleMyFitnessPal;
			
		}else if(companyName=="Headspace"){
			String[] jobRoleTitleHeadspace={"Software Engineer","Product Manager","Product Designer","UX Researcher","Data Scientist","Data Analyst","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Content Strategist","Community Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant"};
			return jobRoleTitleHeadspace;
			
		}else if(companyName=="Calm"){
			String[] jobRoleTitleCalm={"Software Engineer","Product Manager","Product Designer","UX Researcher","Data Scientist","Data Analyst","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Content Strategist","Community Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant"};
			return jobRoleTitleCalm;
			
		}else if(companyName=="Lumosity"){
			String[] jobRoleTitleLumosity={"Software Engineer","Data Scientist","Product Manager","Product Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Research Scientist","Security Engineer","DevOps Engineer","Project Manager","Content Strategist","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel"};
			return jobRoleTitleLumosity;
			
		}else if(companyName=="TwentyTwoAndMe"){
			String[] jobRoleTitleTwentyTwoAndMe={"Software Engineer","Data Scientist","Bioinformatics Engineer","Product Manager","Product Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","Scientific Researcher","QA Engineer","Systems Architect","HR Executive","Finance Analyst","Legal Counsel","Genetic Counselor"};
			return jobRoleTitleTwentyTwoAndMe;
			
		}else if(companyName=="Ancestry"){
			String[] jobRoleTitleAncestry={"Software Engineer","Data Scientist","Bioinformatics Engineer","Product Manager","Product Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","Scientific Researcher","QA Engineer","Systems Architect","HR Executive","Finance Analyst","Legal Counsel","Content Strategist"};
			return jobRoleTitleAncestry;
			
		}else if(companyName=="Tinder"){
			String[] jobRoleTitleTinder={"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer","Mobile App Developer","Data Scientist","Data Analyst","Product Manager","Product Designer","UX Researcher","Security Engineer","DevOps Engineer","Project Manager","Trust and Safety Analyst","QA Engineer","Systems Architect","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist"};
			return jobRoleTitleTinder;
			
		}else if(companyName=="Bumble"){
			String[] jobRoleTitleBumble={"Software Engineer","Mobile App Developer","Product Manager","Product Designer","UX Researcher","Data Scientist","Data Analyst","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Community Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel"};
			return jobRoleTitleBumble;
			
		}else if(companyName=="Hinge"){
			String[] jobRoleTitleHinge={"Software Engineer","Mobile App Developer","Product Manager","Product Designer","UX Researcher","Data Scientist","Data Analyst","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Trust and Safety Analyst","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Marketing Specialist"};
			return jobRoleTitleHinge;
			
		}else if(companyName=="OkCupid"){
			String[] jobRoleTitleOkCupid={"Software Engineer","Data Scientist","Product Manager","Product Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","Community Manager","Content Strategist","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant"};
			return jobRoleTitleOkCupid;
			
		}else if(companyName=="Match"){
			String[] jobRoleTitleMatch={"Software Engineer","Data Scientist","Product Manager","Product Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","Marketing Specialist","Customer Support Specialist","QA Engineer","Systems Architect","HR Executive","Finance Analyst","Legal Counsel","Database Administrator"};
			return jobRoleTitleMatch;
			
		}else if(companyName=="Grindr"){
			String[] jobRoleTitleGrindr={"Software Engineer","Mobile App Developer","Product Manager","Product Designer","UX Researcher","Data Scientist","Data Analyst","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Community Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant"};
			return jobRoleTitleGrindr;
			
		}else if(companyName=="Zillow"){
			String[] jobRoleTitleZillow={"Software Engineer","Data Scientist","Data Analyst","Product Manager","UX Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Operations Manager","Business Analyst","QA Engineer","Systems Architect","HR Executive","Finance Analyst","Legal Counsel","Marketing Specialist"};
			return jobRoleTitleZillow;
			
		}else if(companyName=="Redfin"){
			String[] jobRoleTitleRedfin={"Software Engineer","Data Scientist","Data Analyst","Product Manager","UX Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Operations Manager","QA Engineer","Systems Architect","HR Executive","Finance Analyst","Legal Assistant","Technical Support Engineer","Business Analyst"};
			return jobRoleTitleRedfin;
			
		}else if(companyName=="Trulia"){
			String[] jobRoleTitleTrulia={"Software Engineer","Data Scientist","Product Manager","UX Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","Marketing Specialist","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel","Business Analyst"};
			return jobRoleTitleTrulia;
			
		}else if(companyName=="Realtor"){
			String[] jobRoleTitleRealtor={"Software Engineer","Data Scientist","Product Manager","UX Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","Business Analyst","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel","Operations Manager"};
			return jobRoleTitleRealtor;
			
		}else if(companyName=="Houzz"){
			String[] jobRoleTitleHouzz={"Software Engineer","Data Scientist","Product Manager","UX Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","Community Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel","Marketing Specialist"};
			return jobRoleTitleHouzz;
			
		}else if(companyName=="Wayfair"){
			String[] jobRoleTitleWayfair={"Software Engineer","Data Scientist","Data Analyst","Product Manager","UX Designer","Backend Developer","Frontend Developer","Full Stack Developer","Supply Chain Analyst","Operations Manager","Security Engineer","DevOps Engineer","Project Manager","Marketing Specialist","QA Engineer","Systems Architect","HR Executive","Finance Analyst","Legal Counsel","Technical Support Engineer"};
			return jobRoleTitleWayfair;
			
		}else if(companyName=="Overstock"){
			String[] jobRoleTitleOverstock={"Software Engineer","Data Scientist","Data Analyst","Product Manager","UX Designer","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Operations Manager","Supply Chain Analyst","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel","Marketing Manager"};
			return jobRoleTitleOverstock;
			
		}else if(companyName=="Etsy"){
			String[] jobRoleTitleEtsy={"Software Engineer","Data Scientist","Product Manager","UX Designer","UX Researcher","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","Community Manager","QA Engineer","Systems Architect","HR Executive","Finance Analyst","Legal Counsel","Marketing Manager"};
			return jobRoleTitleEtsy;
			
		}else if(companyName=="eBay"){
			String[] jobRoleTitleEbay={"Software Engineer","Data Scientist","Data Analyst","Product Manager","UX Designer","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Operations Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","Supply Chain Analyst"};
			return jobRoleTitleEbay;
			
		}else if(companyName=="Rakuten"){
			String[] jobRoleTitleRakuten={"Software Engineer","Data Scientist","Data Analyst","Product Manager","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Operations Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","Supply Chain Analyst","Cloud Engineer"};
			return jobRoleTitleRakuten;
			
		}else if(companyName=="Alibaba"){
			String[] jobRoleTitleAlibaba={"Software Engineer","Data Scientist","Data Analyst","Product Manager","Solutions Architect","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","Operations Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel","Supply Chain Analyst","Cloud Architect"};
			return jobRoleTitleAlibaba;
			
		}else if(companyName=="JD"){
			String[] jobRoleTitleJD={"Software Engineer","Data Scientist","Data Analyst","Product Manager","Supply Chain Analyst","Backend Developer","Frontend Developer","Full Stack Developer","Operations Manager","Security Engineer","DevOps Engineer","Project Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel","Logistics Manager","Marketing Manager"};
			return jobRoleTitleJD;
			
		}else if(companyName=="Pinduoduo"){
			String[] jobRoleTitlePinduoduo={"Software Engineer","Data Scientist","Data Analyst","Product Manager","Operations Manager","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel","Marketing Manager","Supply Chain Analyst","Business Analyst"};
			return jobRoleTitlePinduoduo;
			
		}else if(companyName=="Meituan"){
			String[] jobRoleTitleMeituan={"Software Engineer","Data Scientist","Data Analyst","Product Manager","Operations Manager","Backend Developer","Frontend Developer","Full Stack Developer","Security Engineer","DevOps Engineer","Project Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel","Logistics Analyst","Marketing Manager","Algorithm Engineer"};
			return jobRoleTitleMeituan;
			
		}else if(companyName=="ByteDance"){
			String[] jobRoleTitleByteDance={"Algorithm Engineer","Software Engineer","Data Scientist","Product Manager","Backend Developer","Frontend Developer","Full Stack Developer","Mobile App Developer","UI Designer","UX Researcher","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","QA Engineer","Systems Architect","HR Executive","Finance Analyst","Legal Counsel","Content Strategist"};
			return jobRoleTitleByteDance;
			
		}else if(companyName=="Tencent"){
			String[] jobRoleTitleTencent={"Game Developer","Software Engineer","Data Scientist","Product Manager","Backend Developer","Frontend Developer","Full Stack Developer","UI Designer","UX Researcher","Data Analyst","Security Engineer","DevOps Engineer","Project Manager","QA Engineer","Systems Architect","Technical Support Engineer","HR Executive","Finance Analyst","Legal Counsel","Marketing Manager"};
			return jobRoleTitleTencent;
			
		}else if(companyName=="Baidu"){
			String[] jobRoleTitleBaidu={"AI Research Scientist","Software Engineer","Data Scientist","Product Manager","Backend Developer","Frontend Developer","Full Stack Developer","Data Analyst","Search Quality Analyst","Security Engineer","DevOps Engineer","Project Manager","QA Engineer","Systems Architect","HR Executive","Finance Analyst","Legal Counsel","Marketing Manager","Technical Support Engineer","Algorithm Engineer"};
			return jobRoleTitleBaidu;
			
		}else if(companyName=="Xiaomi"){
			String[] jobRoleTitleXiaomi={"Hardware Engineer","Software Engineer","Firmware Engineer","Embedded Systems Engineer","Data Scientist","Data Analyst","Product Manager","UI Designer","UX Researcher","Operations Manager","Supply Chain Analyst","QA Engineer","Security Engineer","Project Manager","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","Backend Developer"};
			return jobRoleTitleXiaomi;
			
		}else if(companyName=="Oppo"){
			String[] jobRoleTitleOppo={"Hardware Engineer","Software Engineer","Firmware Engineer","Embedded Systems Engineer","Data Scientist","Data Analyst","Product Manager","Operations Manager","Supply Chain Analyst","QA Engineer","Security Engineer","Project Manager","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","UI Designer","UX Researcher","Frontend Developer"};
			return jobRoleTitleOppo;
			
		}else if(companyName=="Vivo"){
			String[] jobRoleTitleVivo={"Hardware Engineer","Software Engineer","Firmware Engineer","Embedded Systems Engineer","Data Scientist","Data Analyst","Product Manager","Operations Manager","Supply Chain Analyst","QA Engineer","Security Engineer","Project Manager","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","UI Designer","UX Researcher","Backend Developer"};
			return jobRoleTitleVivo;
			
		}else if(companyName=="OnePlus"){
			String[] jobRoleTitleOnePlus={"Hardware Engineer","Software Engineer","Firmware Engineer","Embedded Systems Engineer","Data Scientist","Data Analyst","Product Manager","UI Designer","UX Researcher","Operations Manager","Supply Chain Analyst","QA Engineer","Security Engineer","Project Manager","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant","Community Manager","Marketing Specialist"};
			return jobRoleTitleOnePlus;
			
		}else if(companyName=="Realme"){
			String[] jobRoleTitleRealme={"Hardware Engineer","Software Engineer","Firmware Engineer","Embedded Systems Engineer","Data Scientist","Data Analyst","Product Manager","Operations Manager","Supply Chain Analyst","QA Engineer","Security Engineer","Project Manager","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","UI Designer","UX Researcher","Frontend Developer"};
			return jobRoleTitleRealme;
			
		}else if(companyName=="Motorola"){
			String[] jobRoleTitleMotorola={"Hardware Engineer","Software Engineer","Firmware Engineer","Embedded Systems Engineer","RF Engineer","System Architect","Data Scientist","Data Analyst","Product Manager","QA Engineer","Project Manager","Operations Manager","Supply Chain Analyst","Security Engineer","Technical Support Engineer","HR Executive","Finance Analyst","Legal Assistant","Marketing Specialist","UI Designer"};
			return jobRoleTitleMotorola;
			
		} else if(companyName == "Netflix") {
			String[] jobRoleTitleNetflix = {"Senior Software Engineer", "Data Scientist", "Content Strategist","Cloud Engineer", "UI Designer", "Backend Developer", "Machine LearningEngineer", "Security Engineer", "Product Manager", "iOS Developer","Android Developer", "Data Engineer", "DevOps Engineer", "Site Reliability Engineer", "UX Researcher", "Automation Test Engineer","Network Engineer", "Finance Analyst", "Program Manager", "TalentAcquisition Specialist" };
			return jobRoleTitleNetflix;

		} else if(companyName == "Spotify") {
			String[] jobRoleTitleSpotify = {"Backend Developer", "Machine Learning Engineer", "iOS Developer","Android Developer", "Data Scientist", "Product Manager", "FrontendDeveloper", "Data Engineer", "UX Researcher", "Site ReliabilityEngineer", "QA Engineer", "Agile Coach", "Technical Product Manager","Security Engineer", "Data Analyst", "Cloud Architect", "Full StackDeveloper", "SEO Analyst", "Content Strategist", "Accountant" };
			return jobRoleTitleSpotify;

		} else if(companyName == "Tesla") {
			String[] jobRoleTitleTesla = { "Embedded Systems Engineer", "Firmware Engineer", "Hardware Engineer", "Machine Learning Engineer", "Computer Vision Engineer", "Software Engineer", "Manufacturing Engineer", "Supply Chain Analyst", "Data Scientist", "Network Engineer", "Security Engineer", "Project Manager", "Solutions Architect", "UI Designer", "Mechanical Engineer", "Quality Engineer", "Full Stack Developer", "Autopilot Engineer", "Power Electronics Engineer", "Systems Administrator" };
			return jobRoleTitleTesla;

		} else if(companyName == "SpaceX") {
			String[] jobRoleTitleSpaceX = {"Avionics Engineer", "Software Engineer", "Hardware Engineer", "EmbeddedSystems Engineer", "Network Engineer", "Security Engineer", "DataAnalyst", "Mission Operations Engineer", "Structural Engineer","Propulsion Engineer", "Supply Chain Analyst", "Procurement Specialist","Site Reliability Engineer", "DevOps Engineer", "Full Stack Developer","Python Developer", "Automation Engineer", "Project Manager", "LinuxAdministrator", "IT Support Specialist" };
			return jobRoleTitleSpaceX;

		} else if(companyName == "Zoom") {
			String[] jobRoleTitleZoom = { "Network Engineer", "Security Engineer", "Backend Developer", "iOS Developer", "Android Developer", "Full Stack Developer", "Customer Success Manager", "Technical Support Engineer", "Product Manager", "Solutions Architect", "Cloud Engineer", "Data Scientist", "QA Engineer", "Automation Test Engineer", "Frontend Developer", "UX Designer", "Sales Engineer", "Marketing Specialist", "Finance Analyst", "Program Manager" };
			return jobRoleTitleZoom;

		} else if(companyName == "PayPal") {
			String[] jobRoleTitlePayPal = { "Blockchain Developer", "Security Engineer", "Data Scientist", "Software Engineer", "Backend Developer", "Full Stack Developer", "Product Manager", "Data Engineer", "Cyber Security Analyst", "Risk Analyst", "Machine Learning Engineer", "DevOps Engineer", "Cloud Architect", "Solutions Architect", "UI Designer", "Technical Support Engineer", "Compliance Specialist", "Project Manager", "Database Administrator", "Finance Analyst" };
			return jobRoleTitlePayPal;

		} else if(companyName == "Twitter") {
			String[] jobRoleTitleTwitter = {"Backend Developer", "Machine Learning Engineer", "Data Scientist", "Site Reliability Engineer", "Software Engineer", "Data Engineer", "Product Manager", "iOS Developer", "Android Developer", "Security Engineer", "Frontend Developer", "UI Designer", "UX Researcher", "Content Strategist", "Network Engineer", "Distributed Systems Engineer", "Automation Test Engineer", "Technical Program Manager", "Data Analyst", "HR Executive" };
			return jobRoleTitleTwitter;

		} else if(companyName == "Slack") {
			String[] jobRoleTitleSlack = { "Frontend Developer", "Backend Developer", "Full Stack Developer", "Product Manager", "UX Designer", "Customer Success Manager", "Security Engineer", "Site Reliability Engineer", "Data Engineer", "Data Scientist", "iOS Developer", "Android Developer", "Technical Support Engineer", "QA Engineer", "Automation Test Engineer", "Solutions Architect", "Sales Engineer", "Program Manager", "Accountant", "Talent Acquisition Specialist" };
			return jobRoleTitleSlack;

		} else if(companyName == "Pinterest") {
			String[] jobRoleTitlePinterest = { "Machine Learning Engineer", "Data Scientist", "Backend Developer", "Frontend Developer", "iOS Developer", "Android Developer", "Product Designer", "Product Manager", "Data Engineer", "Site Reliability Engineer", "Security Engineer", "Search Engineer", "Infrastructure Engineer", "UX Researcher", "Data Analyst", "Content Strategist", "Technical Program Manager", "QA Engineer", "Finance Analyst", "HR Executive" };
			return jobRoleTitlePinterest;

		} else if(companyName == "Snap Inc") {
			String[] jobRoleTitleSnapInc = {"AR VR Developer", "Computer Vision Engineer", "Machine Learning Engineer", "iOS Developer", "Android Developer", "Backend Developer", "Frontend Developer", "Product Designer", "Product Manager", "Software Engineer", "Data Scientist", "Security Engineer", "Research Scientist", "Site Reliability Engineer", "Data Engineer", "Systems Engineer", "Network Engineer", "Technical Program Manager", "Finance Analyst", "Legal Counsel" };
			return jobRoleTitleSnapInc;

		} else if(companyName == "Stripe") {
			String[] jobRoleTitleStripe = { "Software Engineer", "Backend Developer", "Full Stack Developer", "Product Manager", "Solutions Architect", "Technical Support Engineer", "Data Scientist", "Data Engineer", "Security Engineer", "Infrastructure Engineer", "Product Designer", "Technical Writer", "Account Executive", "Risk Analyst", "Legal Counsel", "Finance Analyst", "Operations Manager", "Deployment Engineer", "Machine Learning Engineer", "Sales Engineer" };
			return jobRoleTitleStripe;

		} else if(companyName == "Square") {
			String[] jobRoleTitleSquare = { "Mobile App Developer", "Backend Developer", "Hardware Engineer", "Embedded Systems Engineer", "Security Engineer", "Product Manager", "Product Designer", "Data Scientist", "Data Engineer", "Software Engineer", "Machine Learning Engineer", "Android Developer", "iOS Developer", "Full Stack Developer", "QA Engineer", "Automation Test Engineer", "Technical Support Engineer", "Business Analyst", "Finance Analyst", "HR Executive" };
			return jobRoleTitleSquare;

		} else if(companyName == "Shopify") {
			String[] jobRoleTitleShopify = { "Frontend Developer", "Backend Developer", "Full Stack Developer", "Product Manager", "UX Designer", "Data Scientist", "Data Engineer", "Security Engineer", "Site Reliability Engineer", "Developer Evangelist", "Customer Success Manager", "Technical Support Engineer", "Product Researcher", "Mobile Developer", "Infrastructure Engineer", "Automation Test Engineer", "Project Manager", "Talent Acquisition Specialist", "Finance Analyst", "Content Strategist" };
			return jobRoleTitleShopify;

		} else if(companyName == "Dropbox") {
			String[] jobRoleTitleDropbox = { "Software Engineer", "Backend Developer", "Site Reliability Engineer", "Security Engineer", "Product Manager", "Product Designer", "Data Scientist", "Data Engineer", "Full Stack Developer", "Frontend Developer", "Machine Learning Engineer", "Infrastructure Engineer", "Technical Program Manager", "UX Researcher", "Customer Success Manager", "Technical Support Engineer", "QA Engineer", "Automation Test Engineer", "Finance Analyst", "Accountant" };
			return jobRoleTitleDropbox;	
			
		} else if(companyName == "Larsen & Toubro") {
			String[] jobRoleTitleLarsenToubro = { "Firmware Engineer", "Database Administrator", "Big Data Engineer", "iOS Developer", "Embedded Systems Engineer", "Penetration Tester", "Sales Engineer", "QA Engineer", "Mobile App Developer", "Hardware Engineer", "Network Engineer", "Talent Acquisition Specialist", "Cyber Security Analyst", "ETL Developer", "Tableau Developer", "Digital Marketing Specialist", "Data Engineer", "Business Analyst", "Blockchain Developer", "Procurement Specialist" };
			return jobRoleTitleLarsenToubro;

		} else if(companyName == "GMR Group") {
			String[] jobRoleTitleGMRGroup ={ "Automation Test Engineer", "Program Manager", "UI Designer", "Firmware Engineer", "System Administrator", "Project Manager", "Supply Chain Analyst", "Content Strategist", "UX Researcher", "Power BI Developer", "Product Manager", "BI Developer", "Talent Acquisition Specialist", "Android Developer", "Database Administrator", "iOS Developer", "Cyber Security Analyst", "Procurement Specialist", "Customer Success Manager", "Training Manager" };
			return jobRoleTitleGMRGroup;

		} else if(companyName == "Aditya Birla Group") {
			String[] jobRoleTitleAdityaBirlaGroup = { "Machine Learning Engineer", "AI Research Scientist", "ETL Developer", "Hardware Engineer", "Penetration Tester", "Technical Support Engineer", "Training Manager", "Cyber Security Analyst", "Content Strategist", "Talent Acquisition Specialist", "Cloud Engineer", "UX Researcher", "Frontend Developer", "Accountant", "Power BI Developer", "Data Analyst", "Finance Analyst", "Enterprise Architect", "Data Engineer", "Business Analyst" };
			return jobRoleTitleAdityaBirlaGroup;

		} else if(companyName == "ITC Limited") {
			String[] jobRoleTitleITCLimited = { "Digital Marketing Specialist", "iOS Developer", "Product Manager", "Automation Test Engineer", "Training Manager", "Hardware Engineer", "UI Designer", "Firmware Engineer", "BI Developer", "Accountant", "DevOps Engineer", "Data Scientist", "Blockchain Developer", "Pre Sales Consultant", "NLP Engineer", "Program Manager", "Power BI Developer", "Backend Developer", "Big Data Engineer", "Embedded Systems Engineer" };
			return jobRoleTitleITCLimited;

		} else if(companyName == "Hindustan Unilever") {
			String[] jobRoleTitleHindustanUnilever = { "Project Manager", "AR VR Developer", "Pre Sales Consultant", "Backend Developer", "Data Scientist", "IT Support Specialist", "Network Engineer", "Power BI Developer", "iOS Developer", "Supply Chain Analyst", "ETL Developer", "Content Strategist", "DevOps Engineer", "Software Engineer", "Firmware Engineer", "Site Reliability Engineer", "Operations Manager", "Data Engineer", "Training Manager", "Big Data Engineer" };
			return jobRoleTitleHindustanUnilever;
		}
		return null;
	}
	
	public static void getJobNames(String[] jobs){
		System.out.println("Fetching Job name!!!!");
		for(String job:jobs){
			System.out.println(job);
		}
	}
}