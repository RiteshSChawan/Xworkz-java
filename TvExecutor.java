class TvExecutor {
	public static void main(String[] args) {
/*
		Channel channel1 = new Channel();
		channel1.channelId = 1;
		channel1.channelName = "Star Sports";
		channel1.genre = "Sports";
		channel1.language = "Hindi";
		channel1.isHD = true;
		Tv tv1 = new Tv();
		tv1.tvId = 1;
		tv1.tvBrand = "Samsung";
		tv1.screenSize = "55 inch";
		tv1.channels = 500;
		tv1.price = 75000.0;
		tv1.channel = channel1;
		tv1.getTvDetails();

		Channel channel2 = new Channel();
		channel2.channelId = 2;
		channel2.channelName = "Sony LIV";
		channel2.genre = "Entertainment";
		channel2.language = "English";
		channel2.isHD = true;
		Tv tv2 = new Tv();
		tv2.tvId = 2;
		tv2.tvBrand = "LG";
		tv2.screenSize = "43 inch";
		tv2.channels = 300;
		tv2.price = 55000.0;
		tv2.channel = channel2;
		tv2.getTvDetails();

		Channel channel3 = new Channel();
		channel3.channelId = 3;
		channel3.channelName = "Zee TV";
		channel3.genre = "Drama";
		channel3.language = "Hindi";
		channel3.isHD = true;
		Tv tv3 = new Tv();
		tv3.tvId = 3;
		tv3.tvBrand = "Sony";
		tv3.screenSize = "65 inch";
		tv3.channels = 600;
		tv3.price = 110000.0;
		tv3.channel = channel3;
		tv3.getTvDetails();

		Channel channel4 = new Channel();
		channel4.channelId = 4;
		channel4.channelName = "Sun TV";
		channel4.genre = "Regional";
		channel4.language = "Tamil";
		channel4.isHD = true;
		Tv tv4 = new Tv();
		tv4.tvId = 4;
		tv4.tvBrand = "OnePlus";
		tv4.screenSize = "50 inch";
		tv4.channels = 400;
		tv4.price = 65000.0;
		tv4.channel = channel4;
		tv4.getTvDetails();

		Channel channel5 = new Channel();
		channel5.channelId = 5;
		channel5.channelName = "Discovery";
		channel5.genre = "Documentary";
		channel5.language = "English";
		channel5.isHD = true;
		Tv tv5 = new Tv();
		tv5.tvId = 5;
		tv5.tvBrand = "MI";
		tv5.screenSize = "32 inch";
		tv5.channels = 200;
		tv5.price = 22000.0;
		tv5.channel = channel5;
		tv5.getTvDetails();

		Channel channel6 = new Channel();
		channel6.channelId = 6;
		channel6.channelName = "Colors";
		channel6.genre = "Reality";
		channel6.language = "Hindi";
		channel6.isHD = false;
		Tv tv6 = new Tv();
		tv6.tvId = 6;
		tv6.tvBrand = "TCL";
		tv6.screenSize = "40 inch";
		tv6.channels = 350;
		tv6.price = 35000.0;
		tv6.channel = channel6;
		tv6.getTvDetails();

		Channel channel7 = new Channel();
		channel7.channelId = 7;
		channel7.channelName = "CNN";
		channel7.genre = "News";
		channel7.language = "English";
		channel7.isHD = true;
		Tv tv7 = new Tv();
		tv7.tvId = 7;
		tv7.tvBrand = "Panasonic";
		tv7.screenSize = "49 inch";
		tv7.channels = 450;
		tv7.price = 52000.0;
		tv7.channel = channel7;
		tv7.getTvDetails();

		Channel channel8 = new Channel();
		channel8.channelId = 8;
		channel8.channelName = "Aaj Tak";
		channel8.genre = "News";
		channel8.language = "Hindi";
		channel8.isHD = false;
		Tv tv8 = new Tv();
		tv8.tvId = 8;
		tv8.tvBrand = "Vu";
		tv8.screenSize = "58 inch";
		tv8.channels = 700;
		tv8.price = 80000.0;
		tv8.channel = channel8;
		tv8.getTvDetails();

		Channel channel9 = new Channel();
		channel9.channelId = 9;
		channel9.channelName = "National Geographic";
		channel9.genre = "Science";
		channel9.language = "English";
		channel9.isHD = true;
		Tv tv9 = new Tv();
		tv9.tvId = 9;
		tv9.tvBrand = "Hisense";
		tv9.screenSize = "75 inch";
		tv9.channels = 800;
		tv9.price = 145000.0;
		tv9.channel = channel9;
		tv9.getTvDetails();

		Channel channel10 = new Channel();
		channel10.channelId = 10;
		channel10.channelName = "MTV";
		channel10.genre = "Music";
		channel10.language = "English";
		channel10.isHD = false;
		Tv tv10 = new Tv();
		tv10.tvId = 10;
		tv10.tvBrand = "Toshiba";
		tv10.screenSize = "32 inch";
		tv10.channels = 180;
		tv10.price = 18000.0;
		tv10.channel = channel10;
		tv10.getTvDetails();

		Channel channel11 = new Channel();
		channel11.channelId = 11;
		channel11.channelName = "ESPN";
		channel11.genre = "Sports";
		channel11.language = "English";
		channel11.isHD = true;
		Tv tv11 = new Tv();
		tv11.tvId = 11;
		tv11.tvBrand = "Samsung";
		tv11.screenSize = "43 inch";
		tv11.channels = 400;
		tv11.price = 48000.0;
		tv11.channel = channel11;
		tv11.getTvDetails();

		Channel channel12 = new Channel();
		channel12.channelId = 12;
		channel12.channelName = "HBO";
		channel12.genre = "Movies";
		channel12.language = "English";
		channel12.isHD = true;
		Tv tv12 = new Tv();
		tv12.tvId = 12;
		tv12.tvBrand = "LG";
		tv12.screenSize = "55 inch";
		tv12.channels = 550;
		tv12.price = 85000.0;
		tv12.channel = channel12;
		tv12.getTvDetails();

		Channel channel13 = new Channel();
		channel13.channelId = 13;
		channel13.channelName = "Nick";
		channel13.genre = "Kids";
		channel13.language = "Hindi";
		channel13.isHD = false;
		Tv tv13 = new Tv();
		tv13.tvId = 13;
		tv13.tvBrand = "Sony";
		tv13.screenSize = "43 inch";
		tv13.channels = 380;
		tv13.price = 60000.0;
		tv13.channel = channel13;
		tv13.getTvDetails();

		Channel channel14 = new Channel();
		channel14.channelId = 14;
		channel14.channelName = "History TV18";
		channel14.genre = "History";
		channel14.language = "English";
		channel14.isHD = true;
		Tv tv14 = new Tv();
		tv14.tvId = 14;
		tv14.tvBrand = "OnePlus";
		tv14.screenSize = "65 inch";
		tv14.channels = 700;
		tv14.price = 120000.0;
		tv14.channel = channel14;
		tv14.getTvDetails();

		Channel channel15 = new Channel();
		channel15.channelId = 15;
		channel15.channelName = "Star Plus";
		channel15.genre = "Drama";
		channel15.language = "Hindi";
		channel15.isHD = true;
		Tv tv15 = new Tv();
		tv15.tvId = 15;
		tv15.tvBrand = "MI";
		tv15.screenSize = "43 inch";
		tv15.channels = 300;
		tv15.price = 32000.0;
		tv15.channel = channel15;
		tv15.getTvDetails();

		Channel channel16 = new Channel();
		channel16.channelId = 16;
		channel16.channelName = "Animal Planet";
		channel16.genre = "Nature";
		channel16.language = "English";
		channel16.isHD = true;
		Tv tv16 = new Tv();
		tv16.tvId = 16;
		tv16.tvBrand = "TCL";
		tv16.screenSize = "55 inch";
		tv16.channels = 500;
		tv16.price = 72000.0;
		tv16.channel = channel16;
		tv16.getTvDetails();

		Channel channel17 = new Channel();
		channel17.channelId = 17;
		channel17.channelName = "Pogo";
		channel17.genre = "Kids";
		channel17.language = "Hindi";
		channel17.isHD = false;
		Tv tv17 = new Tv();
		tv17.tvId = 17;
		tv17.tvBrand = "Panasonic";
		tv17.screenSize = "32 inch";
		tv17.channels = 250;
		tv17.price = 25000.0;
		tv17.channel = channel17;
		tv17.getTvDetails();

		Channel channel18 = new Channel();
		channel18.channelId = 18;
		channel18.channelName = "NDTV";
		channel18.genre = "News";
		channel18.language = "English";
		channel18.isHD = true;
		Tv tv18 = new Tv();
		tv18.tvId = 18;
		tv18.tvBrand = "Vu";
		tv18.screenSize = "43 inch";
		tv18.channels = 420;
		tv18.price = 45000.0;
		tv18.channel = channel18;
		tv18.getTvDetails();

		Channel channel19 = new Channel();
		channel19.channelId = 19;
		channel19.channelName = "ETV Kannada";
		channel19.genre = "Regional";
		channel19.language = "Kannada";
		channel19.isHD = false;
		Tv tv19 = new Tv();
		tv19.tvId = 19;
		tv19.tvBrand = "Hisense";
		tv19.screenSize = "50 inch";
		tv19.channels = 460;
		tv19.price = 58000.0;
		tv19.channel = channel19;
		tv19.getTvDetails();

		Channel channel20 = new Channel();
		channel20.channelId = 20;
		channel20.channelName = "Vijay TV";
		channel20.genre = "Entertainment";
		channel20.language = "Tamil";
		channel20.isHD = true;
		Tv tv20 = new Tv();
		tv20.tvId = 20;
		tv20.tvBrand = "Toshiba";
		tv20.screenSize = "55 inch";
		tv20.channels = 520;
		tv20.price = 68000.0;
		tv20.channel = channel20;
		tv20.getTvDetails(); */
		

		Channel channel1 = new Channel(1, "Star Sports", "Sports", "Hindi", true);
		Tv tv1 = new Tv(1, "Samsung", "55 inch", 500, 75000.0, channel1);
		tv1.getTvDetails();

		Channel channel2 = new Channel(2, "Sony LIV", "Entertainment", "English", true);
		Tv tv2 = new Tv(2, "LG", "43 inch", 300, 55000.0, channel2);
		tv2.getTvDetails();

		Channel channel3 = new Channel(3, "Zee TV", "Drama", "Hindi", true);
		Tv tv3 = new Tv(3, "Sony", "65 inch", 600, 110000.0, channel3);
		tv3.getTvDetails();

		Channel channel4 = new Channel(4, "Sun TV", "Regional", "Tamil", true);
		Tv tv4 = new Tv(4, "OnePlus", "50 inch", 400, 65000.0, channel4);
		tv4.getTvDetails();

		Channel channel5 = new Channel(5, "Discovery", "Documentary", "English", true);
		Tv tv5 = new Tv(5, "MI", "32 inch", 200, 22000.0, channel5);
		tv5.getTvDetails();

		Channel channel6 = new Channel(6, "Colors", "Reality", "Hindi", false);
		Tv tv6 = new Tv(6, "TCL", "40 inch", 350, 35000.0, channel6);
		tv6.getTvDetails();

		Channel channel7 = new Channel(7, "CNN", "News", "English", true);
		Tv tv7 = new Tv(7, "Panasonic", "49 inch", 450, 52000.0, channel7);
		tv7.getTvDetails();

		Channel channel8 = new Channel(8, "Aaj Tak", "News", "Hindi", false);
		Tv tv8 = new Tv(8, "Vu", "58 inch", 700, 80000.0, channel8);
		tv8.getTvDetails();

		Channel channel9 = new Channel(9, "National Geographic", "Science", "English", true);
		Tv tv9 = new Tv(9, "Hisense", "75 inch", 800, 145000.0, channel9);
		tv9.getTvDetails();

		Channel channel10 = new Channel(10, "MTV", "Music", "English", false);
		Tv tv10 = new Tv(10, "Toshiba", "32 inch", 180, 18000.0, channel10);
		tv10.getTvDetails();

		Channel channel11 = new Channel(11, "ESPN", "Sports", "English", true);
		Tv tv11 = new Tv(11, "Samsung", "43 inch", 400, 48000.0, channel11);
		tv11.getTvDetails();

		Channel channel12 = new Channel(12, "HBO", "Movies", "English", true);
		Tv tv12 = new Tv(12, "LG", "55 inch", 550, 85000.0, channel12);
		tv12.getTvDetails();

		Channel channel13 = new Channel(13, "Nick", "Kids", "Hindi", false);
		Tv tv13 = new Tv(13, "Sony", "43 inch", 380, 60000.0, channel13);
		tv13.getTvDetails();

		Channel channel14 = new Channel(14, "History TV18", "History", "English", true);
		Tv tv14 = new Tv(14, "OnePlus", "65 inch", 700, 120000.0, channel14);
		tv14.getTvDetails();

		Channel channel15 = new Channel(15, "Star Plus", "Drama", "Hindi", true);
		Tv tv15 = new Tv(15, "MI", "43 inch", 300, 32000.0, channel15);
		tv15.getTvDetails();

		Channel channel16 = new Channel(16, "Animal Planet", "Nature", "English", true);
		Tv tv16 = new Tv(16, "TCL", "55 inch", 500, 72000.0, channel16);
		tv16.getTvDetails();

		Channel channel17 = new Channel(17, "Pogo", "Kids", "Hindi", false);
		Tv tv17 = new Tv(17, "Panasonic", "32 inch", 250, 25000.0, channel17);
		tv17.getTvDetails();

		Channel channel18 = new Channel(18, "NDTV", "News", "English", true);
		Tv tv18 = new Tv(18, "Vu", "43 inch", 420, 45000.0, channel18);
		tv18.getTvDetails();

		Channel channel19 = new Channel(19, "ETV Kannada", "Regional", "Kannada", false);
		Tv tv19 = new Tv(19, "Hisense", "50 inch", 460, 58000.0, channel19);
		tv19.getTvDetails();

		Channel channel20 = new Channel(20, "Vijay TV", "Entertainment", "Tamil", true);
		Tv tv20 = new Tv(20, "Toshiba", "55 inch", 520, 68000.0, channel20);
		tv20.getTvDetails();



	}
}