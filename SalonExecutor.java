class SalonExecutor {
	public static void main(String[] args) {
/*
		Service service1 = new Service();
		service1.serviceId = 1;
		service1.serviceName = "Haircut";
		service1.category = "Hair";
		service1.price = 400.0;
		service1.durationMinutes = 30;
		Salon salon1 = new Salon();
		salon1.salonId = 1;
		salon1.salonName = "Naturals Salon";
		salon1.location = "Bangalore";
		salon1.staffCount = 8;
		salon1.isUnisex = true;
		salon1.service = service1;
		salon1.getSalonDetails();

		Service service2 = new Service();
		service2.serviceId = 2;
		service2.serviceName = "Hair Color";
		service2.category = "Hair";
		service2.price = 1500.0;
		service2.durationMinutes = 90;
		Salon salon2 = new Salon();
		salon2.salonId = 2;
		salon2.salonName = "Lakme Salon";
		salon2.location = "Mumbai";
		salon2.staffCount = 10;
		salon2.isUnisex = true;
		salon2.service = service2;
		salon2.getSalonDetails();

		Service service3 = new Service();
		service3.serviceId = 3;
		service3.serviceName = "Beard Trim";
		service3.category = "Grooming";
		service3.price = 250.0;
		service3.durationMinutes = 20;
		Salon salon3 = new Salon();
		salon3.salonId = 3;
		salon3.salonName = "Jawed Habib";
		salon3.location = "Delhi";
		salon3.staffCount = 12;
		salon3.isUnisex = true;
		salon3.service = service3;
		salon3.getSalonDetails();

		Service service4 = new Service();
		service4.serviceId = 4;
		service4.serviceName = "Hair Spa";
		service4.category = "Hair";
		service4.price = 1200.0;
		service4.durationMinutes = 60;
		Salon salon4 = new Salon();
		salon4.salonId = 4;
		salon4.salonName = "Toni and Guy";
		salon4.location = "Bangalore";
		salon4.staffCount = 15;
		salon4.isUnisex = true;
		salon4.service = service4;
		salon4.getSalonDetails();

		Service service5 = new Service();
		service5.serviceId = 5;
		service5.serviceName = "Facial";
		service5.category = "Skin";
		service5.price = 800.0;
		service5.durationMinutes = 45;
		Salon salon5 = new Salon();
		salon5.salonId = 5;
		salon5.salonName = "YLG Salon";
		salon5.location = "Bangalore";
		salon5.staffCount = 9;
		salon5.isUnisex = true;
		salon5.service = service5;
		salon5.getSalonDetails();

		Service service6 = new Service();
		service6.serviceId = 6;
		service6.serviceName = "Manicure";
		service6.category = "Nails";
		service6.price = 500.0;
		service6.durationMinutes = 40;
		Salon salon6 = new Salon();
		salon6.salonId = 6;
		salon6.salonName = "Green Trends";
		salon6.location = "Chennai";
		salon6.staffCount = 11;
		salon6.isUnisex = true;
		salon6.service = service6;
		salon6.getSalonDetails();

		Service service7 = new Service();
		service7.serviceId = 7;
		service7.serviceName = "Pedicure";
		service7.category = "Nails";
		service7.price = 600.0;
		service7.durationMinutes = 45;
		Salon salon7 = new Salon();
		salon7.salonId = 7;
		salon7.salonName = "Enrich Salon";
		salon7.location = "Mumbai";
		salon7.staffCount = 14;
		salon7.isUnisex = true;
		salon7.service = service7;
		salon7.getSalonDetails();

		Service service8 = new Service();
		service8.serviceId = 8;
		service8.serviceName = "Keratin Treatment";
		service8.category = "Hair";
		service8.price = 4000.0;
		service8.durationMinutes = 180;
		Salon salon8 = new Salon();
		salon8.salonId = 8;
		salon8.salonName = "B Blunt";
		salon8.location = "Mumbai";
		salon8.staffCount = 13;
		salon8.isUnisex = true;
		salon8.service = service8;
		salon8.getSalonDetails();

		Service service9 = new Service();
		service9.serviceId = 9;
		service9.serviceName = "Body Massage";
		service9.category = "Body";
		service9.price = 1500.0;
		service9.durationMinutes = 60;
		Salon salon9 = new Salon();
		salon9.salonId = 9;
		salon9.salonName = "Looks Salon";
		salon9.location = "Delhi";
		salon9.staffCount = 10;
		salon9.isUnisex = true;
		salon9.service = service9;
		salon9.getSalonDetails();

		Service service10 = new Service();
		service10.serviceId = 10;
		service10.serviceName = "Eyebrow Threading";
		service10.category = "Beauty";
		service10.price = 100.0;
		service10.durationMinutes = 15;
		Salon salon10 = new Salon();
		salon10.salonId = 10;
		salon10.salonName = "Curl Up Salon";
		salon10.location = "Hyderabad";
		salon10.staffCount = 7;
		salon10.isUnisex = false;
		salon10.service = service10;
		salon10.getSalonDetails();

		Service service11 = new Service();
		service11.serviceId = 11;
		service11.serviceName = "Waxing";
		service11.category = "Body";
		service11.price = 600.0;
		service11.durationMinutes = 40;
		Salon salon11 = new Salon();
		salon11.salonId = 11;
		salon11.salonName = "Hairworks";
		salon11.location = "Pune";
		salon11.staffCount = 9;
		salon11.isUnisex = false;
		salon11.service = service11;
		salon11.getSalonDetails();

		Service service12 = new Service();
		service12.serviceId = 12;
		service12.serviceName = "Balayage";
		service12.category = "Hair";
		service12.price = 5000.0;
		service12.durationMinutes = 180;
		Salon salon12 = new Salon();
		salon12.salonId = 12;
		salon12.salonName = "Studio 11";
		salon12.location = "Bangalore";
		salon12.staffCount = 16;
		salon12.isUnisex = true;
		salon12.service = service12;
		salon12.getSalonDetails();

		Service service13 = new Service();
		service13.serviceId = 13;
		service13.serviceName = "Scalp Treatment";
		service13.category = "Hair";
		service13.price = 2000.0;
		service13.durationMinutes = 60;
		Salon salon13 = new Salon();
		salon13.salonId = 13;
		salon13.salonName = "Paul Mitchel";
		salon13.location = "Delhi";
		salon13.staffCount = 20;
		salon13.isUnisex = true;
		salon13.service = service13;
		salon13.getSalonDetails();

		Service service14 = new Service();
		service14.serviceId = 14;
		service14.serviceName = "Skin Whitening";
		service14.category = "Skin";
		service14.price = 2500.0;
		service14.durationMinutes = 90;
		Salon salon14 = new Salon();
		salon14.salonId = 14;
		salon14.salonName = "Affinity Salon";
		salon14.location = "Gurgaon";
		salon14.staffCount = 11;
		salon14.isUnisex = true;
		salon14.service = service14;
		salon14.getSalonDetails();

		Service service15 = new Service();
		service15.serviceId = 15;
		service15.serviceName = "Bridal Makeup";
		service15.category = "Makeup";
		service15.price = 10000.0;
		service15.durationMinutes = 240;
		Salon salon15 = new Salon();
		salon15.salonId = 15;
		salon15.salonName = "VS Salon";
		salon15.location = "Chennai";
		salon15.staffCount = 8;
		salon15.isUnisex = false;
		salon15.service = service15;
		salon15.getSalonDetails();

		Service service16 = new Service();
		service16.serviceId = 16;
		service16.serviceName = "Hot Oil Massage";
		service16.category = "Hair";
		service16.price = 700.0;
		service16.durationMinutes = 45;
		Salon salon16 = new Salon();
		salon16.salonId = 16;
		salon16.salonName = "Scissors";
		salon16.location = "Kochi";
		salon16.staffCount = 7;
		salon16.isUnisex = true;
		salon16.service = service16;
		salon16.getSalonDetails();

		Service service17 = new Service();
		service17.serviceId = 17;
		service17.serviceName = "Anti Dandruff Treatment";
		service17.category = "Hair";
		service17.price = 900.0;
		service17.durationMinutes = 50;
		Salon salon17 = new Salon();
		salon17.salonId = 17;
		salon17.salonName = "Bounce Salon";
		salon17.location = "Ahmedabad";
		salon17.staffCount = 9;
		salon17.isUnisex = true;
		salon17.service = service17;
		salon17.getSalonDetails();

		Service service18 = new Service();
		service18.serviceId = 18;
		service18.serviceName = "Nose Piercing";
		service18.category = "Piercing";
		service18.price = 300.0;
		service18.durationMinutes = 10;
		Salon salon18 = new Salon();
		salon18.salonId = 18;
		salon18.salonName = "Tress Lounge";
		salon18.location = "Kolkata";
		salon18.staffCount = 10;
		salon18.isUnisex = true;
		salon18.service = service18;
		salon18.getSalonDetails();

		Service service19 = new Service();
		service19.serviceId = 19;
		service19.serviceName = "D-Tan Cleanup";
		service19.category = "Skin";
		service19.price = 700.0;
		service19.durationMinutes = 40;
		Salon salon19 = new Salon();
		salon19.salonId = 19;
		salon19.salonName = "Pink Root Salon";
		salon19.location = "Jaipur";
		salon19.staffCount = 8;
		salon19.isUnisex = false;
		salon19.service = service19;
		salon19.getSalonDetails();

		Service service20 = new Service();
		service20.serviceId = 20;
		service20.serviceName = "Hair Rebonding";
		service20.category = "Hair";
		service20.price = 3500.0;
		service20.durationMinutes = 150;
		Salon salon20 = new Salon();
		salon20.salonId = 20;
		salon20.salonName = "Aayush Salon";
		salon20.location = "Chandigarh";
		salon20.staffCount = 12;
		salon20.isUnisex = true;
		salon20.service = service20;
		salon20.getSalonDetails(); */

		Service service1 = new Service(1, "Haircut", "Hair", 400.0, 30);
		Salon salon1 = new Salon(1, "Naturals Salon", "Bangalore", 8, true, service1);
		salon1.getSalonDetails();

		Service service2 = new Service(2, "Hair Color", "Hair", 1500.0, 90);
		Salon salon2 = new Salon(2, "Lakme Salon", "Mumbai", 10, true, service2);
		salon2.getSalonDetails();

		Service service3 = new Service(3, "Beard Trim", "Grooming", 250.0, 20);
		Salon salon3 = new Salon(3, "Jawed Habib", "Delhi", 12, true, service3);
		salon3.getSalonDetails();

		Service service4 = new Service(4, "Hair Spa", "Hair", 1200.0, 60);
		Salon salon4 = new Salon(4, "Toni and Guy", "Bangalore", 15, true, service4);
		salon4.getSalonDetails();

		Service service5 = new Service(5, "Facial", "Skin", 800.0, 45);
		Salon salon5 = new Salon(5, "YLG Salon", "Bangalore", 9, true, service5);
		salon5.getSalonDetails();

		Service service6 = new Service(6, "Manicure", "Nails", 500.0, 40);
		Salon salon6 = new Salon(6, "Green Trends", "Chennai", 11, true, service6);
		salon6.getSalonDetails();

		Service service7 = new Service(7, "Pedicure", "Nails", 600.0, 45);
		Salon salon7 = new Salon(7, "Enrich Salon", "Mumbai", 14, true, service7);
		salon7.getSalonDetails();

		Service service8 = new Service(8, "Keratin Treatment", "Hair", 4000.0, 180);
		Salon salon8 = new Salon(8, "B Blunt", "Mumbai", 13, true, service8);
		salon8.getSalonDetails();

		Service service9 = new Service(9, "Body Massage", "Body", 1500.0, 60);
		Salon salon9 = new Salon(9, "Looks Salon", "Delhi", 10, true, service9);
		salon9.getSalonDetails();

		Service service10 = new Service(10, "Eyebrow Threading", "Beauty", 100.0, 15);
		Salon salon10 = new Salon(10, "Curl Up Salon", "Hyderabad", 7, false, service10);
		salon10.getSalonDetails();

		Service service11 = new Service(11, "Waxing", "Body", 600.0, 40);
		Salon salon11 = new Salon(11, "Hairworks", "Pune", 9, false, service11);
		salon11.getSalonDetails();

		Service service12 = new Service(12, "Balayage", "Hair", 5000.0, 180);
		Salon salon12 = new Salon(12, "Studio 11", "Bangalore", 16, true, service12);
		salon12.getSalonDetails();

		Service service13 = new Service(13, "Scalp Treatment", "Hair", 2000.0, 60);
		Salon salon13 = new Salon(13, "Paul Mitchel", "Delhi", 20, true, service13);
		salon13.getSalonDetails();

		Service service14 = new Service(14, "Skin Whitening", "Skin", 2500.0, 90);
		Salon salon14 = new Salon(14, "Affinity Salon", "Gurgaon", 11, true, service14);
		salon14.getSalonDetails();

		Service service15 = new Service(15, "Bridal Makeup", "Makeup", 10000.0, 240);
		Salon salon15 = new Salon(15, "VS Salon", "Chennai", 8, false, service15);
		salon15.getSalonDetails();

		Service service16 = new Service(16, "Hot Oil Massage", "Hair", 700.0, 45);
		Salon salon16 = new Salon(16, "Scissors", "Kochi", 7, true, service16);
		salon16.getSalonDetails();

		Service service17 = new Service(17, "Anti Dandruff Treatment", "Hair", 900.0, 50);
		Salon salon17 = new Salon(17, "Bounce Salon", "Ahmedabad", 9, true, service17);
		salon17.getSalonDetails();

		Service service18 = new Service(18, "Nose Piercing", "Piercing", 300.0, 10);
		Salon salon18 = new Salon(18, "Tress Lounge", "Kolkata", 10, true, service18);
		salon18.getSalonDetails();

		Service service19 = new Service(19, "D-Tan Cleanup", "Skin", 700.0, 40);
		Salon salon19 = new Salon(19, "Pink Root Salon", "Jaipur", 8, false, service19);
		salon19.getSalonDetails();

		Service service20 = new Service(20, "Hair Rebonding", "Hair", 3500.0, 150);
		Salon salon20 = new Salon(20, "Aayush Salon", "Chandigarh", 12, true, service20);
		salon20.getSalonDetails();


	}
}