class PlayStoreExecutor {
	public static void main(String[] args) {
/*
		Application app1 = new Application();
		app1.appId = 1;
		app1.appName = "WhatsApp";
		app1.category = "Communication";
		app1.rating = 4.2;
		app1.isFree = true;
		PlayStore playStore1 = new PlayStore();
		playStore1.playStoreId = 1;
		playStore1.storeName = "Google Play India";
		playStore1.region = "India";
		playStore1.totalApps = 3500000;
		playStore1.revenue = 5000.0;
		playStore1.application = app1;
		playStore1.getPlayStoreDetails();

		Application app2 = new Application();
		app2.appId = 2;
		app2.appName = "Instagram";
		app2.category = "Social Media";
		app2.rating = 4.5;
		app2.isFree = true;
		PlayStore playStore2 = new PlayStore();
		playStore2.playStoreId = 2;
		playStore2.storeName = "Google Play USA";
		playStore2.region = "USA";
		playStore2.totalApps = 3800000;
		playStore2.revenue = 15000.0;
		playStore2.application = app2;
		playStore2.getPlayStoreDetails();

		Application app3 = new Application();
		app3.appId = 3;
		app3.appName = "BGMI";
		app3.category = "Gaming";
		app3.rating = 4.3;
		app3.isFree = true;
		PlayStore playStore3 = new PlayStore();
		playStore3.playStoreId = 3;
		playStore3.storeName = "Google Play India";
		playStore3.region = "India";
		playStore3.totalApps = 3500000;
		playStore3.revenue = 5000.0;
		playStore3.application = app3;
		playStore3.getPlayStoreDetails();

		Application app4 = new Application();
		app4.appId = 4;
		app4.appName = "Spotify";
		app4.category = "Music";
		app4.rating = 4.4;
		app4.isFree = false;
		PlayStore playStore4 = new PlayStore();
		playStore4.playStoreId = 4;
		playStore4.storeName = "Google Play Europe";
		playStore4.region = "Europe";
		playStore4.totalApps = 3200000;
		playStore4.revenue = 12000.0;
		playStore4.application = app4;
		playStore4.getPlayStoreDetails();

		Application app5 = new Application();
		app5.appId = 5;
		app5.appName = "Swiggy";
		app5.category = "Food Delivery";
		app5.rating = 4.1;
		app5.isFree = true;
		PlayStore playStore5 = new PlayStore();
		playStore5.playStoreId = 5;
		playStore5.storeName = "Google Play India";
		playStore5.region = "India";
		playStore5.totalApps = 3500000;
		playStore5.revenue = 5000.0;
		playStore5.application = app5;
		playStore5.getPlayStoreDetails();

		Application app6 = new Application();
		app6.appId = 6;
		app6.appName = "Netflix";
		app6.category = "Entertainment";
		app6.rating = 4.5;
		app6.isFree = false;
		PlayStore playStore6 = new PlayStore();
		playStore6.playStoreId = 6;
		playStore6.storeName = "Google Play Australia";
		playStore6.region = "Australia";
		playStore6.totalApps = 2800000;
		playStore6.revenue = 8000.0;
		playStore6.application = app6;
		playStore6.getPlayStoreDetails();

		Application app7 = new Application();
		app7.appId = 7;
		app7.appName = "Google Pay";
		app7.category = "Finance";
		app7.rating = 4.3;
		app7.isFree = true;
		PlayStore playStore7 = new PlayStore();
		playStore7.playStoreId = 7;
		playStore7.storeName = "Google Play India";
		playStore7.region = "India";
		playStore7.totalApps = 3500000;
		playStore7.revenue = 5000.0;
		playStore7.application = app7;
		playStore7.getPlayStoreDetails();

		Application app8 = new Application();
		app8.appId = 8;
		app8.appName = "Zoom";
		app8.category = "Productivity";
		app8.rating = 4.0;
		app8.isFree = false;
		PlayStore playStore8 = new PlayStore();
		playStore8.playStoreId = 8;
		playStore8.storeName = "Google Play USA";
		playStore8.region = "USA";
		playStore8.totalApps = 3800000;
		playStore8.revenue = 15000.0;
		playStore8.application = app8;
		playStore8.getPlayStoreDetails();

		Application app9 = new Application();
		app9.appId = 9;
		app9.appName = "Duolingo";
		app9.category = "Education";
		app9.rating = 4.7;
		app9.isFree = true;
		PlayStore playStore9 = new PlayStore();
		playStore9.playStoreId = 9;
		playStore9.storeName = "Google Play Brazil";
		playStore9.region = "Brazil";
		playStore9.totalApps = 2500000;
		playStore9.revenue = 3000.0;
		playStore9.application = app9;
		playStore9.getPlayStoreDetails();

		Application app10 = new Application();
		app10.appId = 10;
		app10.appName = "Ola";
		app10.category = "Transport";
		app10.rating = 3.9;
		app10.isFree = true;
		PlayStore playStore10 = new PlayStore();
		playStore10.playStoreId = 10;
		playStore10.storeName = "Google Play India";
		playStore10.region = "India";
		playStore10.totalApps = 3500000;
		playStore10.revenue = 5000.0;
		playStore10.application = app10;
		playStore10.getPlayStoreDetails();

		Application app11 = new Application();
		app11.appId = 11;
		app11.appName = "Candy Crush";
		app11.category = "Gaming";
		app11.rating = 4.5;
		app11.isFree = true;
		PlayStore playStore11 = new PlayStore();
		playStore11.playStoreId = 11;
		playStore11.storeName = "Google Play UK";
		playStore11.region = "UK";
		playStore11.totalApps = 3100000;
		playStore11.revenue = 9000.0;
		playStore11.application = app11;
		playStore11.getPlayStoreDetails();

		Application app12 = new Application();
		app12.appId = 12;
		app12.appName = "MX Player";
		app12.category = "Media Player";
		app12.rating = 4.3;
		app12.isFree = true;
		PlayStore playStore12 = new PlayStore();
		playStore12.playStoreId = 12;
		playStore12.storeName = "Google Play Southeast Asia";
		playStore12.region = "Southeast Asia";
		playStore12.totalApps = 2900000;
		playStore12.revenue = 4000.0;
		playStore12.application = app12;
		playStore12.getPlayStoreDetails();

		Application app13 = new Application();
		app13.appId = 13;
		app13.appName = "PhonePe";
		app13.category = "Finance";
		app13.rating = 4.4;
		app13.isFree = true;
		PlayStore playStore13 = new PlayStore();
		playStore13.playStoreId = 13;
		playStore13.storeName = "Google Play India";
		playStore13.region = "India";
		playStore13.totalApps = 3500000;
		playStore13.revenue = 5000.0;
		playStore13.application = app13;
		playStore13.getPlayStoreDetails();

		Application app14 = new Application();
		app14.appId = 14;
		app14.appName = "Headspace";
		app14.category = "Health and Wellness";
		app14.rating = 4.6;
		app14.isFree = false;
		PlayStore playStore14 = new PlayStore();
		playStore14.playStoreId = 14;
		playStore14.storeName = "Google Play Canada";
		playStore14.region = "Canada";
		playStore14.totalApps = 2700000;
		playStore14.revenue = 6000.0;
		playStore14.application = app14;
		playStore14.getPlayStoreDetails();

		Application app15 = new Application();
		app15.appId = 15;
		app15.appName = "Hotstar";
		app15.category = "Entertainment";
		app15.rating = 4.2;
		app15.isFree = false;
		PlayStore playStore15 = new PlayStore();
		playStore15.playStoreId = 15;
		playStore15.storeName = "Google Play India";
		playStore15.region = "India";
		playStore15.totalApps = 3500000;
		playStore15.revenue = 5000.0;
		playStore15.application = app15;
		playStore15.getPlayStoreDetails();

		Application app16 = new Application();
		app16.appId = 16;
		app16.appName = "Snapchat";
		app16.category = "Social Media";
		app16.rating = 4.1;
		app16.isFree = true;
		PlayStore playStore16 = new PlayStore();
		playStore16.playStoreId = 16;
		playStore16.storeName = "Google Play USA";
		playStore16.region = "USA";
		playStore16.totalApps = 3800000;
		playStore16.revenue = 15000.0;
		playStore16.application = app16;
		playStore16.getPlayStoreDetails();

		Application app17 = new Application();
		app17.appId = 17;
		app17.appName = "Naukri";
		app17.category = "Jobs";
		app17.rating = 4.0;
		app17.isFree = true;
		PlayStore playStore17 = new PlayStore();
		playStore17.playStoreId = 17;
		playStore17.storeName = "Google Play India";
		playStore17.region = "India";
		playStore17.totalApps = 3500000;
		playStore17.revenue = 5000.0;
		playStore17.application = app17;
		playStore17.getPlayStoreDetails();

		Application app18 = new Application();
		app18.appId = 18;
		app18.appName = "Adobe Lightroom";
		app18.category = "Photography";
		app18.rating = 4.5;
		app18.isFree = false;
		PlayStore playStore18 = new PlayStore();
		playStore18.playStoreId = 18;
		playStore18.storeName = "Google Play Japan";
		playStore18.region = "Japan";
		playStore18.totalApps = 2600000;
		playStore18.revenue = 7000.0;
		playStore18.application = app18;
		playStore18.getPlayStoreDetails();

		Application app19 = new Application();
		app19.appId = 19;
		app19.appName = "Byju's";
		app19.category = "Education";
		app19.rating = 3.8;
		app19.isFree = false;
		PlayStore playStore19 = new PlayStore();
		playStore19.playStoreId = 19;
		playStore19.storeName = "Google Play India";
		playStore19.region = "India";
		playStore19.totalApps = 3500000;
		playStore19.revenue = 5000.0;
		playStore19.application = app19;
		playStore19.getPlayStoreDetails();

		Application app20 = new Application();
		app20.appId = 20;
		app20.appName = "1mg";
		app20.category = "Healthcare";
		app20.rating = 4.4;
		app20.isFree = true;
		PlayStore playStore20 = new PlayStore();
		playStore20.playStoreId = 20;
		playStore20.storeName = "Google Play India";
		playStore20.region = "India";
		playStore20.totalApps = 3500000;
		playStore20.revenue = 5000.0;
		playStore20.application = app20;
		playStore20.getPlayStoreDetails(); */

		Application application1 = new Application(1, "WhatsApp", "Communication", 4.2, true);
		PlayStore playStore1 = new PlayStore(1, "Google Play India", "India", 3500000, 5000.0, application1);
		playStore1.getPlayStoreDetails();

		Application application2 = new Application(2, "Instagram", "Social Media", 4.5, true);
		PlayStore playStore2 = new PlayStore(2, "Google Play USA", "USA", 3800000, 15000.0, application2);
		playStore2.getPlayStoreDetails();

		Application application3 = new Application(3, "BGMI", "Gaming", 4.3, true);
		PlayStore playStore3 = new PlayStore(3, "Google Play India", "India", 3500000, 5000.0, application3);
		playStore3.getPlayStoreDetails();

		Application application4 = new Application(4, "Spotify", "Music", 4.4, false);
		PlayStore playStore4 = new PlayStore(4, "Google Play Europe", "Europe", 3200000, 12000.0, application4);
		playStore4.getPlayStoreDetails();

		Application application5 = new Application(5, "Swiggy", "Food Delivery", 4.1, true);
		PlayStore playStore5 = new PlayStore(5, "Google Play India", "India", 3500000, 5000.0, application5);
		playStore5.getPlayStoreDetails();

		Application application6 = new Application(6, "Netflix", "Entertainment", 4.5, false);
		PlayStore playStore6 = new PlayStore(6, "Google Play Australia", "Australia", 2800000, 8000.0, application6);
		playStore6.getPlayStoreDetails();

		Application application7 = new Application(7, "Google Pay", "Finance", 4.3, true);
		PlayStore playStore7 = new PlayStore(7, "Google Play India", "India", 3500000, 5000.0, application7);
		playStore7.getPlayStoreDetails();

		Application application8 = new Application(8, "Zoom", "Productivity", 4.0, false);
		PlayStore playStore8 = new PlayStore(8, "Google Play USA", "USA", 3800000, 15000.0, application8);
		playStore8.getPlayStoreDetails();

		Application application9 = new Application(9, "Duolingo", "Education", 4.7, true);
		PlayStore playStore9 = new PlayStore(9, "Google Play Brazil", "Brazil", 2500000, 3000.0, application9);
		playStore9.getPlayStoreDetails();

		Application application10 = new Application(10, "Ola", "Transport", 3.9, true);
		PlayStore playStore10 = new PlayStore(10, "Google Play India", "India", 3500000, 5000.0, application10);
		playStore10.getPlayStoreDetails();

		Application application11 = new Application(11, "Candy Crush", "Gaming", 4.5, true);
		PlayStore playStore11 = new PlayStore(11, "Google Play UK", "UK", 3100000, 9000.0, application11);
		playStore11.getPlayStoreDetails();

		Application application12 = new Application(12, "MX Player", "Media Player", 4.3, true);
		PlayStore playStore12 = new PlayStore(12, "Google Play Southeast Asia", "Southeast Asia", 2900000, 4000.0, application12);
		playStore12.getPlayStoreDetails();

		Application application13 = new Application(13, "PhonePe", "Finance", 4.4, true);
		PlayStore playStore13 = new PlayStore(13, "Google Play India", "India", 3500000, 5000.0, application13);
		playStore13.getPlayStoreDetails();

		Application application14 = new Application(14, "Headspace", "Health and Wellness", 4.6, false);
		PlayStore playStore14 = new PlayStore(14, "Google Play Canada", "Canada", 2700000, 6000.0, application14);
		playStore14.getPlayStoreDetails();

		Application application15 = new Application(15, "Hotstar", "Entertainment", 4.2, false);
		PlayStore playStore15 = new PlayStore(15, "Google Play India", "India", 3500000, 5000.0, application15);
		playStore15.getPlayStoreDetails();

		Application application16 = new Application(16, "Snapchat", "Social Media", 4.1, true);
		PlayStore playStore16 = new PlayStore(16, "Google Play USA", "USA", 3800000, 15000.0, application16);
		playStore16.getPlayStoreDetails();

		Application application17 = new Application(17, "Naukri", "Jobs", 4.0, true);
		PlayStore playStore17 = new PlayStore(17, "Google Play India", "India", 3500000, 5000.0, application17);
		playStore17.getPlayStoreDetails();

		Application application18 = new Application(18, "Adobe Lightroom", "Photography", 4.5, false);
		PlayStore playStore18 = new PlayStore(18, "Google Play Japan", "Japan", 2600000, 7000.0, application18);
		playStore18.getPlayStoreDetails();

		Application application19 = new Application(19, "Byjus", "Education", 3.8, false);
		PlayStore playStore19 = new PlayStore(19, "Google Play India", "India", 3500000, 5000.0, application19);
		playStore19.getPlayStoreDetails();

		Application application20 = new Application(20, "1mg", "Healthcare", 4.4, true);
		PlayStore playStore20 = new PlayStore(20, "Google Play India", "India", 3500000, 5000.0, application20);
		playStore20.getPlayStoreDetails();


	}
}