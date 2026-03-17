class LensKartExecutor {
	public static void main(String[] args) {
/*
		Frame frame1 = new Frame();
		frame1.frameId = 1;
		frame1.frameName = "AirFlex Round";
		frame1.material = "TR90";
		frame1.shape = "Round";
		frame1.price = 1499.0;
		LensKart lensKart1 = new LensKart();
		lensKart1.lensKartId = 1;
		lensKart1.branchName = "LensKart Bangalore MG Road";
		lensKart1.location = "Bangalore";
		lensKart1.totalFrames = 500;
		lensKart1.isOnlineAvailable = true;
		lensKart1.frame = frame1;
		lensKart1.getLensKartDetails();

		Frame frame2 = new Frame();
		frame2.frameId = 2;
		frame2.frameName = "John Jacobs Classic";
		frame2.material = "Acetate";
		frame2.shape = "Rectangle";
		frame2.price = 2999.0;
		LensKart lensKart2 = new LensKart();
		lensKart2.lensKartId = 2;
		lensKart2.branchName = "LensKart Mumbai Andheri";
		lensKart2.location = "Mumbai";
		lensKart2.totalFrames = 620;
		lensKart2.isOnlineAvailable = true;
		lensKart2.frame = frame2;
		lensKart2.getLensKartDetails();

		Frame frame3 = new Frame();
		frame3.frameId = 3;
		frame3.frameName = "Vincent Chase Wayfarer";
		frame3.material = "Metal";
		frame3.shape = "Wayfarer";
		frame3.price = 1799.0;
		LensKart lensKart3 = new LensKart();
		lensKart3.lensKartId = 3;
		lensKart3.branchName = "LensKart Delhi Connaught Place";
		lensKart3.location = "Delhi";
		lensKart3.totalFrames = 480;
		lensKart3.isOnlineAvailable = true;
		lensKart3.frame = frame3;
		lensKart3.getLensKartDetails();

		Frame frame4 = new Frame();
		frame4.frameId = 4;
		frame4.frameName = "AirFlex Cat Eye";
		frame4.material = "TR90";
		frame4.shape = "Cat Eye";
		frame4.price = 1599.0;
		LensKart lensKart4 = new LensKart();
		lensKart4.lensKartId = 4;
		lensKart4.branchName = "LensKart Hyderabad Banjara Hills";
		lensKart4.location = "Hyderabad";
		lensKart4.totalFrames = 550;
		lensKart4.isOnlineAvailable = true;
		lensKart4.frame = frame4;
		lensKart4.getLensKartDetails();

		Frame frame5 = new Frame();
		frame5.frameId = 5;
		frame5.frameName = "John Jacobs Aviator";
		frame5.material = "Stainless Steel";
		frame5.shape = "Aviator";
		frame5.price = 3499.0;
		LensKart lensKart5 = new LensKart();
		lensKart5.lensKartId = 5;
		lensKart5.branchName = "LensKart Chennai Anna Nagar";
		lensKart5.location = "Chennai";
		lensKart5.totalFrames = 430;
		lensKart5.isOnlineAvailable = true;
		lensKart5.frame = frame5;
		lensKart5.getLensKartDetails();

		Frame frame6 = new Frame();
		frame6.frameId = 6;
		frame6.frameName = "Vincent Chase Oval";
		frame6.material = "Acetate";
		frame6.shape = "Oval";
		frame6.price = 1999.0;
		LensKart lensKart6 = new LensKart();
		lensKart6.lensKartId = 6;
		lensKart6.branchName = "LensKart Pune FC Road";
		lensKart6.location = "Pune";
		lensKart6.totalFrames = 390;
		lensKart6.isOnlineAvailable = true;
		lensKart6.frame = frame6;
		lensKart6.getLensKartDetails();

		Frame frame7 = new Frame();
		frame7.frameId = 7;
		frame7.frameName = "AirFlex Hexagonal";
		frame7.material = "TR90";
		frame7.shape = "Hexagonal";
		frame7.price = 1699.0;
		LensKart lensKart7 = new LensKart();
		lensKart7.lensKartId = 7;
		lensKart7.branchName = "LensKart Kolkata Park Street";
		lensKart7.location = "Kolkata";
		lensKart7.totalFrames = 410;
		lensKart7.isOnlineAvailable = false;
		lensKart7.frame = frame7;
		lensKart7.getLensKartDetails();

		Frame frame8 = new Frame();
		frame8.frameId = 8;
		frame8.frameName = "John Jacobs Rimless";
		frame8.material = "Titanium";
		frame8.shape = "Rimless";
		frame8.price = 4999.0;
		LensKart lensKart8 = new LensKart();
		lensKart8.lensKartId = 8;
		lensKart8.branchName = "LensKart Ahmedabad CG Road";
		lensKart8.location = "Ahmedabad";
		lensKart8.totalFrames = 360;
		lensKart8.isOnlineAvailable = true;
		lensKart8.frame = frame8;
		lensKart8.getLensKartDetails();

		Frame frame9 = new Frame();
		frame9.frameId = 9;
		frame9.frameName = "Vincent Chase Square";
		frame9.material = "Acetate";
		frame9.shape = "Square";
		frame9.price = 2199.0;
		LensKart lensKart9 = new LensKart();
		lensKart9.lensKartId = 9;
		lensKart9.branchName = "LensKart Jaipur MI Road";
		lensKart9.location = "Jaipur";
		lensKart9.totalFrames = 340;
		lensKart9.isOnlineAvailable = true;
		lensKart9.frame = frame9;
		lensKart9.getLensKartDetails();

		Frame frame10 = new Frame();
		frame10.frameId = 10;
		frame10.frameName = "AirFlex Sporty";
		frame10.material = "Nylon";
		frame10.shape = "Sport Wrap";
		frame10.price = 1899.0;
		LensKart lensKart10 = new LensKart();
		lensKart10.lensKartId = 10;
		lensKart10.branchName = "LensKart Surat Vesu";
		lensKart10.location = "Surat";
		lensKart10.totalFrames = 300;
		lensKart10.isOnlineAvailable = true;
		lensKart10.frame = frame10;
		lensKart10.getLensKartDetails();

		Frame frame11 = new Frame();
		frame11.frameId = 11;
		frame11.frameName = "John Jacobs Pentagon";
		frame11.material = "Metal";
		frame11.shape = "Pentagon";
		frame11.price = 3199.0;
		LensKart lensKart11 = new LensKart();
		lensKart11.lensKartId = 11;
		lensKart11.branchName = "LensKart Lucknow Hazratganj";
		lensKart11.location = "Lucknow";
		lensKart11.totalFrames = 280;
		lensKart11.isOnlineAvailable = true;
		lensKart11.frame = frame11;
		lensKart11.getLensKartDetails();

		Frame frame12 = new Frame();
		frame12.frameId = 12;
		frame12.frameName = "Vincent Chase Butterfly";
		frame12.material = "Acetate";
		frame12.shape = "Butterfly";
		frame12.price = 2499.0;
		LensKart lensKart12 = new LensKart();
		lensKart12.lensKartId = 12;
		lensKart12.branchName = "LensKart Kochi MG Road";
		lensKart12.location = "Kochi";
		lensKart12.totalFrames = 320;
		lensKart12.isOnlineAvailable = false;
		lensKart12.frame = frame12;
		lensKart12.getLensKartDetails();

		Frame frame13 = new Frame();
		frame13.frameId = 13;
		frame13.frameName = "AirFlex Half Rim";
		frame13.material = "TR90";
		frame13.shape = "Half Rim";
		frame13.price = 1399.0;
		LensKart lensKart13 = new LensKart();
		lensKart13.lensKartId = 13;
		lensKart13.branchName = "LensKart Chandigarh Sector 17";
		lensKart13.location = "Chandigarh";
		lensKart13.totalFrames = 260;
		lensKart13.isOnlineAvailable = true;
		lensKart13.frame = frame13;
		lensKart13.getLensKartDetails();

		Frame frame14 = new Frame();
		frame14.frameId = 14;
		frame14.frameName = "John Jacobs Clubmaster";
		frame14.material = "Stainless Steel";
		frame14.shape = "Clubmaster";
		frame14.price = 3799.0;
		LensKart lensKart14 = new LensKart();
		lensKart14.lensKartId = 14;
		lensKart14.branchName = "LensKart Indore Vijay Nagar";
		lensKart14.location = "Indore";
		lensKart14.totalFrames = 290;
		lensKart14.isOnlineAvailable = true;
		lensKart14.frame = frame14;
		lensKart14.getLensKartDetails();

		Frame frame15 = new Frame();
		frame15.frameId = 15;
		frame15.frameName = "Vincent Chase Pilot";
		frame15.material = "Acetate";
		frame15.shape = "Pilot";
		frame15.price = 2299.0;
		LensKart lensKart15 = new LensKart();
		lensKart15.lensKartId = 15;
		lensKart15.branchName = "LensKart Nagpur Sitabuldi";
		lensKart15.location = "Nagpur";
		lensKart15.totalFrames = 240;
		lensKart15.isOnlineAvailable = true;
		lensKart15.frame = frame15;
		lensKart15.getLensKartDetails();

		Frame frame16 = new Frame();
		frame16.frameId = 16;
		frame16.frameName = "AirFlex D-Frame";
		frame16.material = "TR90";
		frame16.shape = "D-Frame";
		frame16.price = 1599.0;
		LensKart lensKart16 = new LensKart();
		lensKart16.lensKartId = 16;
		lensKart16.branchName = "LensKart Vizag MVP Colony";
		lensKart16.location = "Visakhapatnam";
		lensKart16.totalFrames = 270;
		lensKart16.isOnlineAvailable = true;
		lensKart16.frame = frame16;
		lensKart16.getLensKartDetails();

		Frame frame17 = new Frame();
		frame17.frameId = 17;
		frame17.frameName = "John Jacobs Shield";
		frame17.material = "Polycarbonate";
		frame17.shape = "Shield";
		frame17.price = 4499.0;
		LensKart lensKart17 = new LensKart();
		lensKart17.lensKartId = 17;
		lensKart17.branchName = "LensKart Coimbatore RS Puram";
		lensKart17.location = "Coimbatore";
		lensKart17.totalFrames = 220;
		lensKart17.isOnlineAvailable = false;
		lensKart17.frame = frame17;
		lensKart17.getLensKartDetails();

		Frame frame18 = new Frame();
		frame18.frameId = 18;
		frame18.frameName = "Vincent Chase Geometric";
		frame18.material = "Metal";
		frame18.shape = "Geometric";
		frame18.price = 2799.0;
		LensKart lensKart18 = new LensKart();
		lensKart18.lensKartId = 18;
		lensKart18.branchName = "LensKart Bhopal MP Nagar";
		lensKart18.location = "Bhopal";
		lensKart18.totalFrames = 250;
		lensKart18.isOnlineAvailable = true;
		lensKart18.frame = frame18;
		lensKart18.getLensKartDetails();

		Frame frame19 = new Frame();
		frame19.frameId = 19;
		frame19.frameName = "AirFlex Oversized";
		frame19.material = "TR90";
		frame19.shape = "Oversized";
		frame19.price = 1999.0;
		LensKart lensKart19 = new LensKart();
		lensKart19.lensKartId = 19;
		lensKart19.branchName = "LensKart Mysore Sayyaji Rao Road";
		lensKart19.location = "Mysore";
		lensKart19.totalFrames = 230;
		lensKart19.isOnlineAvailable = true;
		lensKart19.frame = frame19;
		lensKart19.getLensKartDetails();

		Frame frame20 = new Frame();
		frame20.frameId = 20;
		frame20.frameName = "John Jacobs Browline";
		frame20.material = "Titanium";
		frame20.shape = "Browline";
		frame20.price = 5499.0;
		LensKart lensKart20 = new LensKart();
		lensKart20.lensKartId = 20;
		lensKart20.branchName = "LensKart Goa Panaji";
		lensKart20.location = "Goa";
		lensKart20.totalFrames = 200;
		lensKart20.isOnlineAvailable = true;
		lensKart20.frame = frame20;
		lensKart20.getLensKartDetails(); */

		Frame frame1 = new Frame(1, "AirFlex Round", "TR90", "Round", 1499.0);
		LensKart lensKart1 = new LensKart(1, "LensKart Bangalore MG Road", "Bangalore", 500, true, frame1);
		lensKart1.getLensKartDetails();

		Frame frame2 = new Frame(2, "John Jacobs Classic", "Acetate", "Rectangle", 2999.0);
		LensKart lensKart2 = new LensKart(2, "LensKart Mumbai Andheri", "Mumbai", 620, true, frame2);
		lensKart2.getLensKartDetails();

		Frame frame3 = new Frame(3, "Vincent Chase Wayfarer", "Metal", "Wayfarer", 1799.0);
		LensKart lensKart3 = new LensKart(3, "LensKart Delhi Connaught Place", "Delhi", 480, true, frame3);
		lensKart3.getLensKartDetails();

		Frame frame4 = new Frame(4, "AirFlex Cat Eye", "TR90", "Cat Eye", 1599.0);
		LensKart lensKart4 = new LensKart(4, "LensKart Hyderabad Banjara Hills", "Hyderabad", 550, true, frame4);
		lensKart4.getLensKartDetails();

		Frame frame5 = new Frame(5, "John Jacobs Aviator", "Stainless Steel", "Aviator", 3499.0);
		LensKart lensKart5 = new LensKart(5, "LensKart Chennai Anna Nagar", "Chennai", 430, true, frame5);
		lensKart5.getLensKartDetails();

		Frame frame6 = new Frame(6, "Vincent Chase Oval", "Acetate", "Oval", 1999.0);
		LensKart lensKart6 = new LensKart(6, "LensKart Pune FC Road", "Pune", 390, true, frame6);
		lensKart6.getLensKartDetails();

		Frame frame7 = new Frame(7, "AirFlex Hexagonal", "TR90", "Hexagonal", 1699.0);
		LensKart lensKart7 = new LensKart(7, "LensKart Kolkata Park Street", "Kolkata", 410, false, frame7);
		lensKart7.getLensKartDetails();

		Frame frame8 = new Frame(8, "John Jacobs Rimless", "Titanium", "Rimless", 4999.0);
		LensKart lensKart8 = new LensKart(8, "LensKart Ahmedabad CG Road", "Ahmedabad", 360, true, frame8);
		lensKart8.getLensKartDetails();

		Frame frame9 = new Frame(9, "Vincent Chase Square", "Acetate", "Square", 2199.0);
		LensKart lensKart9 = new LensKart(9, "LensKart Jaipur MI Road", "Jaipur", 340, true, frame9);
		lensKart9.getLensKartDetails();

		Frame frame10 = new Frame(10, "AirFlex Sporty", "Nylon", "Sport Wrap", 1899.0);
		LensKart lensKart10 = new LensKart(10, "LensKart Surat Vesu", "Surat", 300, true, frame10);
		lensKart10.getLensKartDetails();

		Frame frame11 = new Frame(11, "John Jacobs Pentagon", "Metal", "Pentagon", 3199.0);
		LensKart lensKart11 = new LensKart(11, "LensKart Lucknow Hazratganj", "Lucknow", 280, true, frame11);
		lensKart11.getLensKartDetails();

		Frame frame12 = new Frame(12, "Vincent Chase Butterfly", "Acetate", "Butterfly", 2499.0);
		LensKart lensKart12 = new LensKart(12, "LensKart Kochi MG Road", "Kochi", 320, false, frame12);
		lensKart12.getLensKartDetails();

		Frame frame13 = new Frame(13, "AirFlex Half Rim", "TR90", "Half Rim", 1399.0);
		LensKart lensKart13 = new LensKart(13, "LensKart Chandigarh Sector 17", "Chandigarh", 260, true, frame13);
		lensKart13.getLensKartDetails();

		Frame frame14 = new Frame(14, "John Jacobs Clubmaster", "Stainless Steel", "Clubmaster", 3799.0);
		LensKart lensKart14 = new LensKart(14, "LensKart Indore Vijay Nagar", "Indore", 290, true, frame14);
		lensKart14.getLensKartDetails();

		Frame frame15 = new Frame(15, "Vincent Chase Pilot", "Acetate", "Pilot", 2299.0);
		LensKart lensKart15 = new LensKart(15, "LensKart Nagpur Sitabuldi", "Nagpur", 240, true, frame15);
		lensKart15.getLensKartDetails();

		Frame frame16 = new Frame(16, "AirFlex D-Frame", "TR90", "D-Frame", 1599.0);
		LensKart lensKart16 = new LensKart(16, "LensKart Vizag MVP Colony", "Visakhapatnam", 270, true, frame16);
		lensKart16.getLensKartDetails();

		Frame frame17 = new Frame(17, "John Jacobs Shield", "Polycarbonate", "Shield", 4499.0);
		LensKart lensKart17 = new LensKart(17, "LensKart Coimbatore RS Puram", "Coimbatore", 220, false, frame17);
		lensKart17.getLensKartDetails();

		Frame frame18 = new Frame(18, "Vincent Chase Geometric", "Metal", "Geometric", 2799.0);
		LensKart lensKart18 = new LensKart(18, "LensKart Bhopal MP Nagar", "Bhopal", 250, true, frame18);
		lensKart18.getLensKartDetails();

		Frame frame19 = new Frame(19, "AirFlex Oversized", "TR90", "Oversized", 1999.0);
		LensKart lensKart19 = new LensKart(19, "LensKart Mysore Sayyaji Rao Road", "Mysore", 230, true, frame19);
		lensKart19.getLensKartDetails();

		Frame frame20 = new Frame(20, "John Jacobs Browline", "Titanium", "Browline", 5499.0);
		LensKart lensKart20 = new LensKart(20, "LensKart Goa Panaji", "Goa", 200, true, frame20);
		lensKart20.getLensKartDetails();


	}
}