class TourismAngadiExecutor {
	public static void main(String[] args) {
/*
		Package package1 = new Package();
		package1.packageId = 1;
		package1.packageName = "Coorg Weekend";
		package1.destination = "Coorg";
		package1.price = 8500.0;
		package1.durationDays = 3;
		TourismAngadi tourismAngadi1 = new TourismAngadi();
		tourismAngadi1.angadiId = 1;
		tourismAngadi1.agencyName = "Karnataka Tourism";
		tourismAngadi1.location = "Bangalore";
		tourismAngadi1.toursOffered = 50;
		tourismAngadi1.isGovtApproved = true;
		tourismAngadi1.package = package1;
		tourismAngadi1.getTourismAngadiDetails();

		Package package2 = new Package();
		package2.packageId = 2;
		package2.packageName = "Alleppey Backwaters";
		package2.destination = "Alleppey";
		package2.price = 12000.0;
		package2.durationDays = 4;
		TourismAngadi tourismAngadi2 = new TourismAngadi();
		tourismAngadi2.angadiId = 2;
		tourismAngadi2.agencyName = "Kerala Tourism";
		tourismAngadi2.location = "Kochi";
		tourismAngadi2.toursOffered = 60;
		tourismAngadi2.isGovtApproved = true;
		tourismAngadi2.package = package2;
		tourismAngadi2.getTourismAngadiDetails();

		Package package3 = new Package();
		package3.packageId = 3;
		package3.packageName = "Royal Rajasthan Tour";
		package3.destination = "Jaipur Udaipur Jodhpur";
		package3.price = 22000.0;
		package3.durationDays = 7;
		TourismAngadi tourismAngadi3 = new TourismAngadi();
		tourismAngadi3.angadiId = 3;
		tourismAngadi3.agencyName = "Rajasthan Tourism";
		tourismAngadi3.location = "Jaipur";
		tourismAngadi3.toursOffered = 45;
		tourismAngadi3.isGovtApproved = true;
		tourismAngadi3.package = package3;
		tourismAngadi3.getTourismAngadiDetails();

		Package package4 = new Package();
		package4.packageId = 4;
		package4.packageName = "Goa Beach Holiday";
		package4.destination = "Goa";
		package4.price = 9000.0;
		package4.durationDays = 3;
		TourismAngadi tourismAngadi4 = new TourismAngadi();
		tourismAngadi4.angadiId = 4;
		tourismAngadi4.agencyName = "Goa Tourism";
		tourismAngadi4.location = "Panaji";
		tourismAngadi4.toursOffered = 40;
		tourismAngadi4.isGovtApproved = true;
		tourismAngadi4.package = package4;
		tourismAngadi4.getTourismAngadiDetails();

		Package package5 = new Package();
		package5.packageId = 5;
		package5.packageName = "Manali Snow Trip";
		package5.destination = "Manali";
		package5.price = 15000.0;
		package5.durationDays = 5;
		TourismAngadi tourismAngadi5 = new TourismAngadi();
		tourismAngadi5.angadiId = 5;
		tourismAngadi5.agencyName = "Himachal Tourism";
		tourismAngadi5.location = "Shimla";
		tourismAngadi5.toursOffered = 55;
		tourismAngadi5.isGovtApproved = true;
		tourismAngadi5.package = package5;
		tourismAngadi5.getTourismAngadiDetails();

		Package package6 = new Package();
		package6.packageId = 6;
		package6.packageName = "Char Dham Yatra";
		package6.destination = "Badrinath Kedarnath";
		package6.price = 25000.0;
		package6.durationDays = 10;
		TourismAngadi tourismAngadi6 = new TourismAngadi();
		tourismAngadi6.angadiId = 6;
		tourismAngadi6.agencyName = "Uttarakhand Tourism";
		tourismAngadi6.location = "Dehradun";
		tourismAngadi6.toursOffered = 48;
		tourismAngadi6.isGovtApproved = true;
		tourismAngadi6.package = package6;
		tourismAngadi6.getTourismAngadiDetails();

		Package package7 = new Package();
		package7.packageId = 7;
		package7.packageName = "Temple Tour";
		package7.destination = "Madurai Rameswaram";
		package7.price = 11000.0;
		package7.durationDays = 4;
		TourismAngadi tourismAngadi7 = new TourismAngadi();
		tourismAngadi7.angadiId = 7;
		tourismAngadi7.agencyName = "Tamil Nadu Tourism";
		tourismAngadi7.location = "Chennai";
		tourismAngadi7.toursOffered = 42;
		tourismAngadi7.isGovtApproved = true;
		tourismAngadi7.package = package7;
		tourismAngadi7.getTourismAngadiDetails();

		Package package8 = new Package();
		package8.packageId = 8;
		package8.packageName = "Andaman Island Package";
		package8.destination = "Andaman";
		package8.price = 30000.0;
		package8.durationDays = 6;
		TourismAngadi tourismAngadi8 = new TourismAngadi();
		tourismAngadi8.angadiId = 8;
		tourismAngadi8.agencyName = "Andaman Tourism";
		tourismAngadi8.location = "Port Blair";
		tourismAngadi8.toursOffered = 35;
		tourismAngadi8.isGovtApproved = true;
		tourismAngadi8.package = package8;
		tourismAngadi8.getTourismAngadiDetails();

		Package package9 = new Package();
		package9.packageId = 9;
		package9.packageName = "Gangtok Darjeeling Tour";
		package9.destination = "Gangtok";
		package9.price = 18000.0;
		package9.durationDays = 5;
		TourismAngadi tourismAngadi9 = new TourismAngadi();
		tourismAngadi9.angadiId = 9;
		tourismAngadi9.agencyName = "Sikkim Tourism";
		tourismAngadi9.location = "Gangtok";
		tourismAngadi9.toursOffered = 30;
		tourismAngadi9.isGovtApproved = true;
		tourismAngadi9.package = package9;
		tourismAngadi9.getTourismAngadiDetails();

		Package package10 = new Package();
		package10.packageId = 10;
		package10.packageName = "Ajanta Ellora Trip";
		package10.destination = "Aurangabad";
		package10.price = 10000.0;
		package10.durationDays = 3;
		TourismAngadi tourismAngadi10 = new TourismAngadi();
		tourismAngadi10.angadiId = 10;
		tourismAngadi10.agencyName = "Maharashtra Tourism";
		tourismAngadi10.location = "Mumbai";
		tourismAngadi10.toursOffered = 38;
		tourismAngadi10.isGovtApproved = true;
		tourismAngadi10.package = package10;
		tourismAngadi10.getTourismAngadiDetails();

		Package package11 = new Package();
		package11.packageId = 11;
		package11.packageName = "Europe Grand Tour";
		package11.destination = "Paris London Rome";
		package11.price = 150000.0;
		package11.durationDays = 14;
		TourismAngadi tourismAngadi11 = new TourismAngadi();
		tourismAngadi11.angadiId = 11;
		tourismAngadi11.agencyName = "Cox and Kings";
		tourismAngadi11.location = "Mumbai";
		tourismAngadi11.toursOffered = 200;
		tourismAngadi11.isGovtApproved = true;
		tourismAngadi11.package = package11;
		tourismAngadi11.getTourismAngadiDetails();

		Package package12 = new Package();
		package12.packageId = 12;
		package12.packageName = "Singapore Bali Package";
		package12.destination = "Singapore Bali";
		package12.price = 80000.0;
		package12.durationDays = 7;
		TourismAngadi tourismAngadi12 = new TourismAngadi();
		tourismAngadi12.angadiId = 12;
		tourismAngadi12.agencyName = "Thomas Cook India";
		tourismAngadi12.location = "Delhi";
		tourismAngadi12.toursOffered = 180;
		tourismAngadi12.isGovtApproved = true;
		tourismAngadi12.package = package12;
		tourismAngadi12.getTourismAngadiDetails();

		Package package13 = new Package();
		package13.packageId = 13;
		package13.packageName = "Maldives Luxury";
		package13.destination = "Maldives";
		package13.price = 120000.0;
		package13.durationDays = 5;
		TourismAngadi tourismAngadi13 = new TourismAngadi();
		tourismAngadi13.angadiId = 13;
		tourismAngadi13.agencyName = "MakeMyTrip Holidays";
		tourismAngadi13.location = "Gurgaon";
		tourismAngadi13.toursOffered = 500;
		tourismAngadi13.isGovtApproved = true;
		tourismAngadi13.package = package13;
		tourismAngadi13.getTourismAngadiDetails();

		Package package14 = new Package();
		package14.packageId = 14;
		package14.packageName = "Dubai Shopping Tour";
		package14.destination = "Dubai";
		package14.price = 70000.0;
		package14.durationDays = 6;
		TourismAngadi tourismAngadi14 = new TourismAngadi();
		tourismAngadi14.angadiId = 14;
		tourismAngadi14.agencyName = "Yatra Holidays";
		tourismAngadi14.location = "Gurgaon";
		tourismAngadi14.toursOffered = 400;
		tourismAngadi14.isGovtApproved = true;
		tourismAngadi14.package = package14;
		tourismAngadi14.getTourismAngadiDetails();

		Package package15 = new Package();
		package15.packageId = 15;
		package15.packageName = "Thailand Bangkok Tour";
		package15.destination = "Bangkok Phuket";
		package15.price = 65000.0;
		package15.durationDays = 7;
		TourismAngadi tourismAngadi15 = new TourismAngadi();
		tourismAngadi15.angadiId = 15;
		tourismAngadi15.agencyName = "EaseMyTrip";
		tourismAngadi15.location = "Delhi";
		tourismAngadi15.toursOffered = 350;
		tourismAngadi15.isGovtApproved = true;
		tourismAngadi15.package = package15;
		tourismAngadi15.getTourismAngadiDetails();

		Package package16 = new Package();
		package16.packageId = 16;
		package16.packageName = "Switzerland Alps";
		package16.destination = "Zurich Interlaken";
		package16.price = 200000.0;
		package16.durationDays = 10;
		TourismAngadi tourismAngadi16 = new TourismAngadi();
		tourismAngadi16.angadiId = 16;
		tourismAngadi16.agencyName = "Kesari Tours";
		tourismAngadi16.location = "Pune";
		tourismAngadi16.toursOffered = 120;
		tourismAngadi16.isGovtApproved = true;
		tourismAngadi16.package = package16;
		tourismAngadi16.getTourismAngadiDetails();

		Package package17 = new Package();
		package17.packageId = 17;
		package17.packageName = "Japan Cherry Blossom";
		package17.destination = "Tokyo Kyoto";
		package17.price = 175000.0;
		package17.durationDays = 9;
		TourismAngadi tourismAngadi17 = new TourismAngadi();
		tourismAngadi17.angadiId = 17;
		tourismAngadi17.agencyName = "SOTC Travel";
		tourismAngadi17.location = "Mumbai";
		tourismAngadi17.toursOffered = 160;
		tourismAngadi17.isGovtApproved = true;
		tourismAngadi17.package = package17;
		tourismAngadi17.getTourismAngadiDetails();

		Package package18 = new Package();
		package18.packageId = 18;
		package18.packageName = "Kashmir Paradise";
		package18.destination = "Srinagar Gulmarg";
		package18.price = 35000.0;
		package18.durationDays = 5;
		TourismAngadi tourismAngadi18 = new TourismAngadi();
		tourismAngadi18.angadiId = 18;
		tourismAngadi18.agencyName = "Club Mahindra";
		tourismAngadi18.location = "Mumbai";
		tourismAngadi18.toursOffered = 90;
		tourismAngadi18.isGovtApproved = true;
		tourismAngadi18.package = package18;
		tourismAngadi18.getTourismAngadiDetails();

		Package package19 = new Package();
		package19.packageId = 19;
		package19.packageName = "Australia New Zealand";
		package19.destination = "Sydney Auckland";
		package19.price = 220000.0;
		package19.durationDays = 12;
		TourismAngadi tourismAngadi19 = new TourismAngadi();
		tourismAngadi19.angadiId = 19;
		tourismAngadi19.agencyName = "Veena World";
		tourismAngadi19.location = "Pune";
		tourismAngadi19.toursOffered = 140;
		tourismAngadi19.isGovtApproved = true;
		tourismAngadi19.package = package19;
		tourismAngadi19.getTourismAngadiDetails();

		Package package20 = new Package();
		package20.packageId = 20;
		package20.packageName = "Sri Lanka Tour";
		package20.destination = "Colombo Kandy";
		package20.price = 45000.0;
		package20.durationDays = 5;
		TourismAngadi tourismAngadi20 = new TourismAngadi();
		tourismAngadi20.angadiId = 20;
		tourismAngadi20.agencyName = "IndiGo Holidays";
		tourismAngadi20.location = "Gurgaon";
		tourismAngadi20.toursOffered = 300;
		tourismAngadi20.isGovtApproved = true;
		tourismAngadi20.package = package20;
		tourismAngadi20.getTourismAngadiDetails(); */

		Package package1 = new Package(1, "Coorg Weekend", "Coorg", 8500.0, 3);
		TourismAngadi tourismAngadi1 = new TourismAngadi(1, "Karnataka Tourism", "Bangalore", 50, true, package1);
		tourismAngadi1.getTourismAngadiDetails();

		Package package2 = new Package(2, "Alleppey Backwaters", "Alleppey", 12000.0, 4);
		TourismAngadi tourismAngadi2 = new TourismAngadi(2, "Kerala Tourism", "Kochi", 60, true, package2);
		tourismAngadi2.getTourismAngadiDetails();

		Package package3 = new Package(3, "Royal Rajasthan Tour", "Jaipur Udaipur", 22000.0, 7);
		TourismAngadi tourismAngadi3 = new TourismAngadi(3, "Rajasthan Tourism", "Jaipur", 45, true, package3);
		tourismAngadi3.getTourismAngadiDetails();

		Package package4 = new Package(4, "Goa Beach Holiday", "Goa", 9000.0, 3);
		TourismAngadi tourismAngadi4 = new TourismAngadi(4, "Goa Tourism", "Panaji", 40, true, package4);
		tourismAngadi4.getTourismAngadiDetails();

		Package package5 = new Package(5, "Manali Snow Trip", "Manali", 15000.0, 5);
		TourismAngadi tourismAngadi5 = new TourismAngadi(5, "Himachal Tourism", "Shimla", 55, true, package5);
		tourismAngadi5.getTourismAngadiDetails();

		Package package6 = new Package(6, "Char Dham Yatra", "Badrinath Kedarnath", 25000.0, 10);
		TourismAngadi tourismAngadi6 = new TourismAngadi(6, "Uttarakhand Tourism", "Dehradun", 48, true, package6);
		tourismAngadi6.getTourismAngadiDetails();

		Package package7 = new Package(7, "Temple Tour", "Madurai Rameswaram", 11000.0, 4);
		TourismAngadi tourismAngadi7 = new TourismAngadi(7, "Tamil Nadu Tourism", "Chennai", 42, true, package7);
		tourismAngadi7.getTourismAngadiDetails();

		Package package8 = new Package(8, "Andaman Island Package", "Andaman", 30000.0, 6);
		TourismAngadi tourismAngadi8 = new TourismAngadi(8, "Andaman Tourism", "Port Blair", 35, true, package8);
		tourismAngadi8.getTourismAngadiDetails();

		Package package9 = new Package(9, "Gangtok Darjeeling Tour", "Gangtok", 18000.0, 5);
		TourismAngadi tourismAngadi9 = new TourismAngadi(9, "Sikkim Tourism", "Gangtok", 30, true, package9);
		tourismAngadi9.getTourismAngadiDetails();

		Package package10 = new Package(10, "Ajanta Ellora Trip", "Aurangabad", 10000.0, 3);
		TourismAngadi tourismAngadi10 = new TourismAngadi(10, "Maharashtra Tourism", "Mumbai", 38, true, package10);
		tourismAngadi10.getTourismAngadiDetails();

		Package package11 = new Package(11, "Europe Grand Tour", "Paris London Rome", 150000.0, 14);
		TourismAngadi tourismAngadi11 = new TourismAngadi(11, "Cox and Kings", "Mumbai", 200, true, package11);
		tourismAngadi11.getTourismAngadiDetails();

		Package package12 = new Package(12, "Singapore Bali Package", "Singapore Bali", 80000.0, 7);
		TourismAngadi tourismAngadi12 = new TourismAngadi(12, "Thomas Cook India", "Delhi", 180, true, package12);
		tourismAngadi12.getTourismAngadiDetails();

		Package package13 = new Package(13, "Maldives Luxury", "Maldives", 120000.0, 5);
		TourismAngadi tourismAngadi13 = new TourismAngadi(13, "MakeMyTrip Holidays", "Gurgaon", 500, true, package13);
		tourismAngadi13.getTourismAngadiDetails();

		Package package14 = new Package(14, "Dubai Shopping Tour", "Dubai", 70000.0, 6);
		TourismAngadi tourismAngadi14 = new TourismAngadi(14, "Yatra Holidays", "Gurgaon", 400, true, package14);
		tourismAngadi14.getTourismAngadiDetails();

		Package package15 = new Package(15, "Thailand Bangkok Tour", "Bangkok Phuket", 65000.0, 7);
		TourismAngadi tourismAngadi15 = new TourismAngadi(15, "EaseMyTrip", "Delhi", 350, true, package15);
		tourismAngadi15.getTourismAngadiDetails();

		Package package16 = new Package(16, "Switzerland Alps", "Zurich Interlaken", 200000.0, 10);
		TourismAngadi tourismAngadi16 = new TourismAngadi(16, "Kesari Tours", "Pune", 120, true, package16);
		tourismAngadi16.getTourismAngadiDetails();

		Package package17 = new Package(17, "Japan Cherry Blossom", "Tokyo Kyoto", 175000.0, 9);
		TourismAngadi tourismAngadi17 = new TourismAngadi(17, "SOTC Travel", "Mumbai", 160, true, package17);
		tourismAngadi17.getTourismAngadiDetails();

		Package package18 = new Package(18, "Kashmir Paradise", "Srinagar Gulmarg", 35000.0, 5);
		TourismAngadi tourismAngadi18 = new TourismAngadi(18, "Club Mahindra", "Mumbai", 90, true, package18);
		tourismAngadi18.getTourismAngadiDetails();

		Package package19 = new Package(19, "Australia New Zealand", "Sydney Auckland", 220000.0, 12);
		TourismAngadi tourismAngadi19 = new TourismAngadi(19, "Veena World", "Pune", 140, true, package19);
		tourismAngadi19.getTourismAngadiDetails();

		Package package20 = new Package(20, "Sri Lanka Tour", "Colombo Kandy", 45000.0, 5);
		TourismAngadi tourismAngadi20 = new TourismAngadi(20, "IndiGo Holidays", "Gurgaon", 300, true, package20);
		tourismAngadi20.getTourismAngadiDetails();


	}
}