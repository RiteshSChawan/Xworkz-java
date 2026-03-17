class RythmsExecutor {
	public static void main(String[] args) {
/*
		MusicInstrument instrument1 = new MusicInstrument();
		instrument1.instrumentId = 1;
		instrument1.instrumentName = "Acoustic Guitar";
		instrument1.type = "String";
		instrument1.material = "Spruce Wood";
		instrument1.price = 8500.0;
		Rythms rythms1 = new Rythms();
		rythms1.rythmsId = 1;
		rythms1.storeName = "Rythms Bangalore";
		rythms1.location = "Bangalore";
		rythms1.totalInstruments = 300;
		rythms1.hasRepairService = true;
		rythms1.musicInstrument = instrument1;
		rythms1.getRythmsDetails();

		MusicInstrument instrument2 = new MusicInstrument();
		instrument2.instrumentId = 2;
		instrument2.instrumentName = "Tabla";
		instrument2.type = "Percussion";
		instrument2.material = "Wood and Leather";
		instrument2.price = 4500.0;
		Rythms rythms2 = new Rythms();
		rythms2.rythmsId = 2;
		rythms2.storeName = "Rythms Mumbai";
		rythms2.location = "Mumbai";
		rythms2.totalInstruments = 250;
		rythms2.hasRepairService = true;
		rythms2.musicInstrument = instrument2;
		rythms2.getRythmsDetails();

		MusicInstrument instrument3 = new MusicInstrument();
		instrument3.instrumentId = 3;
		instrument3.instrumentName = "Violin";
		instrument3.type = "String";
		instrument3.material = "Maple Wood";
		instrument3.price = 12000.0;
		Rythms rythms3 = new Rythms();
		rythms3.rythmsId = 3;
		rythms3.storeName = "Rythms Delhi";
		rythms3.location = "Delhi";
		rythms3.totalInstruments = 280;
		rythms3.hasRepairService = true;
		rythms3.musicInstrument = instrument3;
		rythms3.getRythmsDetails();

		MusicInstrument instrument4 = new MusicInstrument();
		instrument4.instrumentId = 4;
		instrument4.instrumentName = "Flute";
		instrument4.type = "Wind";
		instrument4.material = "Bamboo";
		instrument4.price = 2500.0;
		Rythms rythms4 = new Rythms();
		rythms4.rythmsId = 4;
		rythms4.storeName = "Rythms Chennai";
		rythms4.location = "Chennai";
		rythms4.totalInstruments = 200;
		rythms4.hasRepairService = false;
		rythms4.musicInstrument = instrument4;
		rythms4.getRythmsDetails();

		MusicInstrument instrument5 = new MusicInstrument();
		instrument5.instrumentId = 5;
		instrument5.instrumentName = "Electric Guitar";
		instrument5.type = "String";
		instrument5.material = "Mahogany";
		instrument5.price = 25000.0;
		Rythms rythms5 = new Rythms();
		rythms5.rythmsId = 5;
		rythms5.storeName = "Rythms Hyderabad";
		rythms5.location = "Hyderabad";
		rythms5.totalInstruments = 320;
		rythms5.hasRepairService = true;
		rythms5.musicInstrument = instrument5;
		rythms5.getRythmsDetails();

		MusicInstrument instrument6 = new MusicInstrument();
		instrument6.instrumentId = 6;
		instrument6.instrumentName = "Mridangam";
		instrument6.type = "Percussion";
		instrument6.material = "Jackwood and Leather";
		instrument6.price = 6000.0;
		Rythms rythms6 = new Rythms();
		rythms6.rythmsId = 6;
		rythms6.storeName = "Rythms Coimbatore";
		rythms6.location = "Coimbatore";
		rythms6.totalInstruments = 180;
		rythms6.hasRepairService = true;
		rythms6.musicInstrument = instrument6;
		rythms6.getRythmsDetails();

		MusicInstrument instrument7 = new MusicInstrument();
		instrument7.instrumentId = 7;
		instrument7.instrumentName = "Piano";
		instrument7.type = "Keyboard";
		instrument7.material = "Ebony and Ivory Keys";
		instrument7.price = 80000.0;
		Rythms rythms7 = new Rythms();
		rythms7.rythmsId = 7;
		rythms7.storeName = "Rythms Pune";
		rythms7.location = "Pune";
		rythms7.totalInstruments = 150;
		rythms7.hasRepairService = true;
		rythms7.musicInstrument = instrument7;
		rythms7.getRythmsDetails();

		MusicInstrument instrument8 = new MusicInstrument();
		instrument8.instrumentId = 8;
		instrument8.instrumentName = "Saxophone";
		instrument8.type = "Wind";
		instrument8.material = "Brass";
		instrument8.price = 35000.0;
		Rythms rythms8 = new Rythms();
		rythms8.rythmsId = 8;
		rythms8.storeName = "Rythms Kolkata";
		rythms8.location = "Kolkata";
		rythms8.totalInstruments = 160;
		rythms8.hasRepairService = false;
		rythms8.musicInstrument = instrument8;
		rythms8.getRythmsDetails();

		MusicInstrument instrument9 = new MusicInstrument();
		instrument9.instrumentId = 9;
		instrument9.instrumentName = "Drum Kit";
		instrument9.type = "Percussion";
		instrument9.material = "Birch Wood";
		instrument9.price = 45000.0;
		Rythms rythms9 = new Rythms();
		rythms9.rythmsId = 9;
		rythms9.storeName = "Rythms Ahmedabad";
		rythms9.location = "Ahmedabad";
		rythms9.totalInstruments = 220;
		rythms9.hasRepairService = true;
		rythms9.musicInstrument = instrument9;
		rythms9.getRythmsDetails();

		MusicInstrument instrument10 = new MusicInstrument();
		instrument10.instrumentId = 10;
		instrument10.instrumentName = "Sitar";
		instrument10.type = "String";
		instrument10.material = "Teak Wood";
		instrument10.price = 15000.0;
		Rythms rythms10 = new Rythms();
		rythms10.rythmsId = 10;
		rythms10.storeName = "Rythms Lucknow";
		rythms10.location = "Lucknow";
		rythms10.totalInstruments = 190;
		rythms10.hasRepairService = true;
		rythms10.musicInstrument = instrument10;
		rythms10.getRythmsDetails();

		MusicInstrument instrument11 = new MusicInstrument();
		instrument11.instrumentId = 11;
		instrument11.instrumentName = "Harmonium";
		instrument11.type = "Keyboard";
		instrument11.material = "Teak Wood";
		instrument11.price = 9000.0;
		Rythms rythms11 = new Rythms();
		rythms11.rythmsId = 11;
		rythms11.storeName = "Rythms Jaipur";
		rythms11.location = "Jaipur";
		rythms11.totalInstruments = 170;
		rythms11.hasRepairService = true;
		rythms11.musicInstrument = instrument11;
		rythms11.getRythmsDetails();

		MusicInstrument instrument12 = new MusicInstrument();
		instrument12.instrumentId = 12;
		instrument12.instrumentName = "Trumpet";
		instrument12.type = "Brass";
		instrument12.material = "Brass Metal";
		instrument12.price = 18000.0;
		Rythms rythms12 = new Rythms();
		rythms12.rythmsId = 12;
		rythms12.storeName = "Rythms Chandigarh";
		rythms12.location = "Chandigarh";
		rythms12.totalInstruments = 140;
		rythms12.hasRepairService = false;
		rythms12.musicInstrument = instrument12;
		rythms12.getRythmsDetails();

		MusicInstrument instrument13 = new MusicInstrument();
		instrument13.instrumentId = 13;
		instrument13.instrumentName = "Veena";
		instrument13.type = "String";
		instrument13.material = "Jackwood";
		instrument13.price = 20000.0;
		Rythms rythms13 = new Rythms();
		rythms13.rythmsId = 13;
		rythms13.storeName = "Rythms Mysore";
		rythms13.location = "Mysore";
		rythms13.totalInstruments = 130;
		rythms13.hasRepairService = true;
		rythms13.musicInstrument = instrument13;
		rythms13.getRythmsDetails();

		MusicInstrument instrument14 = new MusicInstrument();
		instrument14.instrumentId = 14;
		instrument14.instrumentName = "Bass Guitar";
		instrument14.type = "String";
		instrument14.material = "Alder Wood";
		instrument14.price = 22000.0;
		Rythms rythms14 = new Rythms();
		rythms14.rythmsId = 14;
		rythms14.storeName = "Rythms Kochi";
		rythms14.location = "Kochi";
		rythms14.totalInstruments = 210;
		rythms14.hasRepairService = true;
		rythms14.musicInstrument = instrument14;
		rythms14.getRythmsDetails();

		MusicInstrument instrument15 = new MusicInstrument();
		instrument15.instrumentId = 15;
		instrument15.instrumentName = "Dholak";
		instrument15.type = "Percussion";
		instrument15.material = "Sheesham Wood";
		instrument15.price = 3500.0;
		Rythms rythms15 = new Rythms();
		rythms15.rythmsId = 15;
		rythms15.storeName = "Rythms Indore";
		rythms15.location = "Indore";
		rythms15.totalInstruments = 160;
		rythms15.hasRepairService = false;
		rythms15.musicInstrument = instrument15;
		rythms15.getRythmsDetails();

		MusicInstrument instrument16 = new MusicInstrument();
		instrument16.instrumentId = 16;
		instrument16.instrumentName = "Ukulele";
		instrument16.type = "String";
		instrument16.material = "Koa Wood";
		instrument16.price = 5500.0;
		Rythms rythms16 = new Rythms();
		rythms16.rythmsId = 16;
		rythms16.storeName = "Rythms Surat";
		rythms16.location = "Surat";
		rythms16.totalInstruments = 145;
		rythms16.hasRepairService = true;
		rythms16.musicInstrument = instrument16;
		rythms16.getRythmsDetails();

		MusicInstrument instrument17 = new MusicInstrument();
		instrument17.instrumentId = 17;
		instrument17.instrumentName = "Cello";
		instrument17.type = "String";
		instrument17.material = "Spruce and Maple";
		instrument17.price = 60000.0;
		Rythms rythms17 = new Rythms();
		rythms17.rythmsId = 17;
		rythms17.storeName = "Rythms Nagpur";
		rythms17.location = "Nagpur";
		rythms17.totalInstruments = 120;
		rythms17.hasRepairService = true;
		rythms17.musicInstrument = instrument17;
		rythms17.getRythmsDetails();

		MusicInstrument instrument18 = new MusicInstrument();
		instrument18.instrumentId = 18;
		instrument18.instrumentName = "Shehnai";
		instrument18.type = "Wind";
		instrument18.material = "Rosewood";
		instrument18.price = 7000.0;
		Rythms rythms18 = new Rythms();
		rythms18.rythmsId = 18;
		rythms18.storeName = "Rythms Varanasi";
		rythms18.location = "Varanasi";
		rythms18.totalInstruments = 110;
		rythms18.hasRepairService = true;
		rythms18.musicInstrument = instrument18;
		rythms18.getRythmsDetails();

		MusicInstrument instrument19 = new MusicInstrument();
		instrument19.instrumentId = 19;
		instrument19.instrumentName = "Mandolin";
		instrument19.type = "String";
		instrument19.material = "Spruce Wood";
		instrument19.price = 11000.0;
		Rythms rythms19 = new Rythms();
		rythms19.rythmsId = 19;
		rythms19.storeName = "Rythms Bhopal";
		rythms19.location = "Bhopal";
		rythms19.totalInstruments = 130;
		rythms19.hasRepairService = false;
		rythms19.musicInstrument = instrument19;
		rythms19.getRythmsDetails();

		MusicInstrument instrument20 = new MusicInstrument();
		instrument20.instrumentId = 20;
		instrument20.instrumentName = "Synthesizer";
		instrument20.type = "Electronic";
		instrument20.material = "Plastic and Metal";
		instrument20.price = 55000.0;
		Rythms rythms20 = new Rythms();
		rythms20.rythmsId = 20;
		rythms20.storeName = "Rythms Vizag";
		rythms20.location = "Visakhapatnam";
		rythms20.totalInstruments = 200;
		rythms20.hasRepairService = true;
		rythms20.musicInstrument = instrument20;
		rythms20.getRythmsDetails(); */

		MusicInstrument musicInstrument1 = new MusicInstrument(1, "Acoustic Guitar", "String", "Spruce Wood", 8500.0);
		Rythms rythms1 = new Rythms(1, "Rythms Bangalore", "Bangalore", 300, true, musicInstrument1);
		rythms1.getRythmsDetails();

		MusicInstrument musicInstrument2 = new MusicInstrument(2, "Tabla", "Percussion", "Wood and Leather", 4500.0);
		Rythms rythms2 = new Rythms(2, "Rythms Mumbai", "Mumbai", 250, true, musicInstrument2);
		rythms2.getRythmsDetails();

		MusicInstrument musicInstrument3 = new MusicInstrument(3, "Violin", "String", "Maple Wood", 12000.0);
		Rythms rythms3 = new Rythms(3, "Rythms Delhi", "Delhi", 280, true, musicInstrument3);
		rythms3.getRythmsDetails();

		MusicInstrument musicInstrument4 = new MusicInstrument(4, "Flute", "Wind", "Bamboo", 2500.0);
		Rythms rythms4 = new Rythms(4, "Rythms Chennai", "Chennai", 200, false, musicInstrument4);
		rythms4.getRythmsDetails();

		MusicInstrument musicInstrument5 = new MusicInstrument(5, "Electric Guitar", "String", "Mahogany", 25000.0);
		Rythms rythms5 = new Rythms(5, "Rythms Hyderabad", "Hyderabad", 320, true, musicInstrument5);
		rythms5.getRythmsDetails();

		MusicInstrument musicInstrument6 = new MusicInstrument(6, "Mridangam", "Percussion", "Jackwood and Leather", 6000.0);
		Rythms rythms6 = new Rythms(6, "Rythms Coimbatore", "Coimbatore", 180, true, musicInstrument6);
		rythms6.getRythmsDetails();

		MusicInstrument musicInstrument7 = new MusicInstrument(7, "Piano", "Keyboard", "Ebony and Ivory", 80000.0);
		Rythms rythms7 = new Rythms(7, "Rythms Pune", "Pune", 150, true, musicInstrument7);
		rythms7.getRythmsDetails();

		MusicInstrument musicInstrument8 = new MusicInstrument(8, "Saxophone", "Wind", "Brass", 35000.0);
		Rythms rythms8 = new Rythms(8, "Rythms Kolkata", "Kolkata", 160, false, musicInstrument8);
		rythms8.getRythmsDetails();

		MusicInstrument musicInstrument9 = new MusicInstrument(9, "Drum Kit", "Percussion", "Birch Wood", 45000.0);
		Rythms rythms9 = new Rythms(9, "Rythms Ahmedabad", "Ahmedabad", 220, true, musicInstrument9);
		rythms9.getRythmsDetails();

		MusicInstrument musicInstrument10 = new MusicInstrument(10, "Sitar", "String", "Teak Wood", 15000.0);
		Rythms rythms10 = new Rythms(10, "Rythms Lucknow", "Lucknow", 190, true, musicInstrument10);
		rythms10.getRythmsDetails();

		MusicInstrument musicInstrument11 = new MusicInstrument(11, "Harmonium", "Keyboard", "Teak Wood", 9000.0);
		Rythms rythms11 = new Rythms(11, "Rythms Jaipur", "Jaipur", 170, true, musicInstrument11);
		rythms11.getRythmsDetails();

		MusicInstrument musicInstrument12 = new MusicInstrument(12, "Trumpet", "Brass", "Brass Metal", 18000.0);
		Rythms rythms12 = new Rythms(12, "Rythms Chandigarh", "Chandigarh", 140, false, musicInstrument12);
		rythms12.getRythmsDetails();

		MusicInstrument musicInstrument13 = new MusicInstrument(13, "Veena", "String", "Jackwood", 20000.0);
		Rythms rythms13 = new Rythms(13, "Rythms Mysore", "Mysore", 130, true, musicInstrument13);
		rythms13.getRythmsDetails();

		MusicInstrument musicInstrument14 = new MusicInstrument(14, "Bass Guitar", "String", "Alder Wood", 22000.0);
		Rythms rythms14 = new Rythms(14, "Rythms Kochi", "Kochi", 210, true, musicInstrument14);
		rythms14.getRythmsDetails();

		MusicInstrument musicInstrument15 = new MusicInstrument(15, "Dholak", "Percussion", "Sheesham Wood", 3500.0);
		Rythms rythms15 = new Rythms(15, "Rythms Indore", "Indore", 160, false, musicInstrument15);
		rythms15.getRythmsDetails();

		MusicInstrument musicInstrument16 = new MusicInstrument(16, "Ukulele", "String", "Koa Wood", 5500.0);
		Rythms rythms16 = new Rythms(16, "Rythms Surat", "Surat", 145, true, musicInstrument16);
		rythms16.getRythmsDetails();

		MusicInstrument musicInstrument17 = new MusicInstrument(17, "Cello", "String", "Spruce and Maple", 60000.0);
		Rythms rythms17 = new Rythms(17, "Rythms Nagpur", "Nagpur", 120, true, musicInstrument17);
		rythms17.getRythmsDetails();

		MusicInstrument musicInstrument18 = new MusicInstrument(18, "Shehnai", "Wind", "Rosewood", 7000.0);
		Rythms rythms18 = new Rythms(18, "Rythms Varanasi", "Varanasi", 110, true, musicInstrument18);
		rythms18.getRythmsDetails();

		MusicInstrument musicInstrument19 = new MusicInstrument(19, "Mandolin", "String", "Spruce Wood", 11000.0);
		Rythms rythms19 = new Rythms(19, "Rythms Bhopal", "Bhopal", 130, false, musicInstrument19);
		rythms19.getRythmsDetails();

		MusicInstrument musicInstrument20 = new MusicInstrument(20, "Synthesizer", "Electronic", "Plastic and Metal", 55000.0);
		Rythms rythms20 = new Rythms(20, "Rythms Vizag", "Visakhapatnam", 200, true, musicInstrument20);
		rythms20.getRythmsDetails();


	}
}