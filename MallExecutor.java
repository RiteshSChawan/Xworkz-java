class MallExecutor {
	public static void main(String[] args) {
/*
		Shop shop1 = new Shop();
		shop1.shopId = 1;
		shop1.shopName = "Nike Store";
		shop1.shopType = "Sports";
		shop1.employees = 10;
		shop1.isOpen = true;
		Mall mall1 = new Mall();
		mall1.mallId = 1;
		mall1.mallName = "Orion Mall";
		mall1.location = "Bangalore";
		mall1.floors = 6;
		mall1.parkingAvailable = true;
		mall1.shop = shop1;
		mall1.getMallDetails();

		Shop shop2 = new Shop();
		shop2.shopId = 2;
		shop2.shopName = "Zara";
		shop2.shopType = "Fashion";
		shop2.employees = 15;
		shop2.isOpen = true;
		Mall mall2 = new Mall();
		mall2.mallId = 2;
		mall2.mallName = "Phoenix Marketcity";
		mall2.location = "Mumbai";
		mall2.floors = 5;
		mall2.parkingAvailable = true;
		mall2.shop = shop2;
		mall2.getMallDetails();

		Shop shop3 = new Shop();
		shop3.shopId = 3;
		shop3.shopName = "Apple Store";
		shop3.shopType = "Electronics";
		shop3.employees = 20;
		shop3.isOpen = true;
		Mall mall3 = new Mall();
		mall3.mallId = 3;
		mall3.mallName = "DLF Mall of India";
		mall3.location = "Noida";
		mall3.floors = 7;
		mall3.parkingAvailable = true;
		mall3.shop = shop3;
		mall3.getMallDetails();

		Shop shop4 = new Shop();
		shop4.shopId = 4;
		shop4.shopName = "McDonald's";
		shop4.shopType = "Food Court";
		shop4.employees = 25;
		shop4.isOpen = true;
		Mall mall4 = new Mall();
		mall4.mallId = 4;
		mall4.mallName = "Ambience Mall";
		mall4.location = "Gurgaon";
		mall4.floors = 4;
		mall4.parkingAvailable = true;
		mall4.shop = shop4;
		mall4.getMallDetails();

		Shop shop5 = new Shop();
		shop5.shopId = 5;
		shop5.shopName = "H&M";
		shop5.shopType = "Clothing";
		shop5.employees = 18;
		shop5.isOpen = true;
		Mall mall5 = new Mall();
		mall5.mallId = 5;
		mall5.mallName = "Select Citywalk";
		mall5.location = "Delhi";
		mall5.floors = 4;
		mall5.parkingAvailable = true;
		mall5.shop = shop5;
		mall5.getMallDetails();

		Shop shop6 = new Shop();
		shop6.shopId = 6;
		shop6.shopName = "Croma";
		shop6.shopType = "Electronics";
		shop6.employees = 22;
		shop6.isOpen = true;
		Mall mall6 = new Mall();
		mall6.mallId = 6;
		mall6.mallName = "Nexus Mall";
		mall6.location = "Hyderabad";
		mall6.floors = 5;
		mall6.parkingAvailable = true;
		mall6.shop = shop6;
		mall6.getMallDetails();

		Shop shop7 = new Shop();
		shop7.shopId = 7;
		shop7.shopName = "KFC";
		shop7.shopType = "Food Court";
		shop7.employees = 30;
		shop7.isOpen = true;
		Mall mall7 = new Mall();
		mall7.mallId = 7;
		mall7.mallName = "Express Avenue";
		mall7.location = "Chennai";
		mall7.floors = 4;
		mall7.parkingAvailable = true;
		mall7.shop = shop7;
		mall7.getMallDetails();

		Shop shop8 = new Shop();
		shop8.shopId = 8;
		shop8.shopName = "Adidas";
		shop8.shopType = "Sports";
		shop8.employees = 12;
		shop8.isOpen = true;
		Mall mall8 = new Mall();
		mall8.mallId = 8;
		mall8.mallName = "Quest Mall";
		mall8.location = "Kolkata";
		mall8.floors = 6;
		mall8.parkingAvailable = true;
		mall8.shop = shop8;
		mall8.getMallDetails();

		Shop shop9 = new Shop();
		shop9.shopId = 9;
		shop9.shopName = "Starbucks";
		shop9.shopType = "Cafe";
		shop9.employees = 8;
		shop9.isOpen = true;
		Mall mall9 = new Mall();
		mall9.mallId = 9;
		mall9.mallName = "Lulu Mall";
		mall9.location = "Kochi";
		mall9.floors = 6;
		mall9.parkingAvailable = true;
		mall9.shop = shop9;
		mall9.getMallDetails();

		Shop shop10 = new Shop();
		shop10.shopId = 10;
		shop10.shopName = "Pantaloons";
		shop10.shopType = "Clothing";
		shop10.employees = 35;
		shop10.isOpen = true;
		Mall mall10 = new Mall();
		mall10.mallId = 10;
		mall10.mallName = "Mantri Square";
		mall10.location = "Bangalore";
		mall10.floors = 6;
		mall10.parkingAvailable = true;
		mall10.shop = shop10;
		mall10.getMallDetails();

		Shop shop11 = new Shop();
		shop11.shopId = 11;
		shop11.shopName = "Swarovski";
		shop11.shopType = "Jewellery";
		shop11.employees = 7;
		shop11.isOpen = true;
		Mall mall11 = new Mall();
		mall11.mallId = 11;
		mall11.mallName = "Inorbit Mall";
		mall11.location = "Pune";
		mall11.floors = 3;
		mall11.parkingAvailable = true;
		mall11.shop = shop11;
		mall11.getMallDetails();

		Shop shop12 = new Shop();
		shop12.shopId = 12;
		shop12.shopName = "BookMark";
		shop12.shopType = "Books";
		shop12.employees = 6;
		shop12.isOpen = false;
		Mall mall12 = new Mall();
		mall12.mallId = 12;
		mall12.mallName = "VR Chennai";
		mall12.location = "Chennai";
		mall12.floors = 5;
		mall12.parkingAvailable = true;
		mall12.shop = shop12;
		mall12.getMallDetails();

		Shop shop13 = new Shop();
		shop13.shopId = 13;
		shop13.shopName = "PVR Cinemas";
		shop13.shopType = "Entertainment";
		shop13.employees = 50;
		shop13.isOpen = true;
		Mall mall13 = new Mall();
		mall13.mallId = 13;
		mall13.mallName = "Pacific Mall";
		mall13.location = "Delhi";
		mall13.floors = 5;
		mall13.parkingAvailable = true;
		mall13.shop = shop13;
		mall13.getMallDetails();

		Shop shop14 = new Shop();
		shop14.shopId = 14;
		shop14.shopName = "Samsung SmartCafe";
		shop14.shopType = "Electronics";
		shop14.employees = 14;
		shop14.isOpen = true;
		Mall mall14 = new Mall();
		mall14.mallId = 14;
		mall14.mallName = "Brookefields Mall";
		mall14.location = "Bangalore";
		mall14.floors = 4;
		mall14.parkingAvailable = true;
		mall14.shop = shop14;
		mall14.getMallDetails();

		Shop shop15 = new Shop();
		shop15.shopId = 15;
		shop15.shopName = "The Body Shop";
		shop15.shopType = "Beauty";
		shop15.employees = 9;
		shop15.isOpen = true;
		Mall mall15 = new Mall();
		mall15.mallId = 15;
		mall15.mallName = "Seawoods Grand Central";
		mall15.location = "Navi Mumbai";
		mall15.floors = 5;
		mall15.parkingAvailable = true;
		mall15.shop = shop15;
		mall15.getMallDetails();

		Shop shop16 = new Shop();
		shop16.shopId = 16;
		shop16.shopName = "Hamleys";
		shop16.shopType = "Toys";
		shop16.employees = 16;
		shop16.isOpen = true;
		Mall mall16 = new Mall();
		mall16.mallId = 16;
		mall16.mallName = "R City Mall";
		mall16.location = "Mumbai";
		mall16.floors = 4;
		mall16.parkingAvailable = true;
		mall16.shop = shop16;
		mall16.getMallDetails();

		Shop shop17 = new Shop();
		shop17.shopId = 17;
		shop17.shopName = "Subway";
		shop17.shopType = "Food Court";
		shop17.employees = 11;
		shop17.isOpen = true;
		Mall mall17 = new Mall();
		mall17.mallId = 17;
		mall17.mallName = "Prestige Forum";
		mall17.location = "Mysore";
		mall17.floors = 3;
		mall17.parkingAvailable = false;
		mall17.shop = shop17;
		mall17.getMallDetails();

		Shop shop18 = new Shop();
		shop18.shopId = 18;
		shop18.shopName = "Marks and Spencer";
		shop18.shopType = "Clothing";
		shop18.employees = 28;
		shop18.isOpen = true;
		Mall mall18 = new Mall();
		mall18.mallId = 18;
		mall18.mallName = "Sigma Mall";
		mall18.location = "Bangalore";
		mall18.floors = 4;
		mall18.parkingAvailable = true;
		mall18.shop = shop18;
		mall18.getMallDetails();

		Shop shop19 = new Shop();
		shop19.shopId = 19;
		shop19.shopName = "Gym Nation";
		shop19.shopType = "Fitness";
		shop19.employees = 20;
		shop19.isOpen = true;
		Mall mall19 = new Mall();
		mall19.mallId = 19;
		mall19.mallName = "Grand Venice Mall";
		mall19.location = "Greater Noida";
		mall19.floors = 3;
		mall19.parkingAvailable = true;
		mall19.shop = shop19;
		mall19.getMallDetails();

		Shop shop20 = new Shop();
		shop20.shopId = 20;
		shop20.shopName = "Crossword";
		shop20.shopType = "Books";
		shop20.employees = 8;
		shop20.isOpen = true;
		Mall mall20 = new Mall();
		mall20.mallId = 20;
		mall20.mallName = "Elante Mall";
		mall20.location = "Chandigarh";
		mall20.floors = 5;
		mall20.parkingAvailable = true;
		mall20.shop = shop20;
		mall20.getMallDetails();
 */
 

		Shop shop1 = new Shop(1, "Nike Store", "Sports", 10, true);
		Mall mall1 = new Mall(1, "Orion Mall", "Bangalore", 6, true, shop1);
		mall1.getMallDetails();

		Shop shop2 = new Shop(2, "Zara", "Fashion", 15, true);
		Mall mall2 = new Mall(2, "Phoenix Marketcity", "Mumbai", 5, true, shop2);
		mall2.getMallDetails();

		Shop shop3 = new Shop(3, "Apple Store", "Electronics", 20, true);
		Mall mall3 = new Mall(3, "DLF Mall of India", "Noida", 7, true, shop3);
		mall3.getMallDetails();

		Shop shop4 = new Shop(4, "McDonald's", "Food Court", 25, true);
		Mall mall4 = new Mall(4, "Ambience Mall", "Gurgaon", 4, true, shop4);
		mall4.getMallDetails();

		Shop shop5 = new Shop(5, "H&M", "Clothing", 18, true);
		Mall mall5 = new Mall(5, "Select Citywalk", "Delhi", 4, true, shop5);
		mall5.getMallDetails();

		Shop shop6 = new Shop(6, "Croma", "Electronics", 22, true);
		Mall mall6 = new Mall(6, "Nexus Mall", "Hyderabad", 5, true, shop6);
		mall6.getMallDetails();

		Shop shop7 = new Shop(7, "KFC", "Food Court", 30, true);
		Mall mall7 = new Mall(7, "Express Avenue", "Chennai", 4, true, shop7);
		mall7.getMallDetails();

		Shop shop8 = new Shop(8, "Adidas", "Sports", 12, true);
		Mall mall8 = new Mall(8, "Quest Mall", "Kolkata", 6, true, shop8);
		mall8.getMallDetails();

		Shop shop9 = new Shop(9, "Starbucks", "Cafe", 8, true);
		Mall mall9 = new Mall(9, "Lulu Mall", "Kochi", 6, true, shop9);
		mall9.getMallDetails();

		Shop shop10 = new Shop(10, "Pantaloons", "Clothing", 35, true);
		Mall mall10 = new Mall(10, "Mantri Square", "Bangalore", 6, true, shop10);
		mall10.getMallDetails();

		Shop shop11 = new Shop(11, "Swarovski", "Jewellery", 7, true);
		Mall mall11 = new Mall(11, "Inorbit Mall", "Pune", 3, true, shop11);
		mall11.getMallDetails();

		Shop shop12 = new Shop(12, "BookMark", "Books", 6, false);
		Mall mall12 = new Mall(12, "VR Chennai", "Chennai", 5, true, shop12);
		mall12.getMallDetails();

		Shop shop13 = new Shop(13, "PVR Cinemas", "Entertainment", 50, true);
		Mall mall13 = new Mall(13, "Pacific Mall", "Delhi", 5, true, shop13);
		mall13.getMallDetails();

		Shop shop14 = new Shop(14, "Samsung SmartCafe", "Electronics", 14, true);
		Mall mall14 = new Mall(14, "Brookefields Mall", "Bangalore", 4, true, shop14);
		mall14.getMallDetails();

		Shop shop15 = new Shop(15, "The Body Shop", "Beauty", 9, true);
		Mall mall15 = new Mall(15, "Seawoods Grand Central", "Navi Mumbai", 5, true, shop15);
		mall15.getMallDetails();

		Shop shop16 = new Shop(16, "Hamleys", "Toys", 16, true);
		Mall mall16 = new Mall(16, "R City Mall", "Mumbai", 4, true, shop16);
		mall16.getMallDetails();

		Shop shop17 = new Shop(17, "Subway", "Food Court", 11, true);
		Mall mall17 = new Mall(17, "Prestige Forum", "Mysore", 3, false, shop17);
		mall17.getMallDetails();

		Shop shop18 = new Shop(18, "Marks and Spencer", "Clothing", 28, true);
		Mall mall18 = new Mall(18, "Sigma Mall", "Bangalore", 4, true, shop18);
		mall18.getMallDetails();

		Shop shop19 = new Shop(19, "Gym Nation", "Fitness", 20, true);
		Mall mall19 = new Mall(19, "Grand Venice Mall", "Greater Noida", 3, true, shop19);
		mall19.getMallDetails();

		Shop shop20 = new Shop(20, "Crossword", "Books", 8, true);
		Mall mall20 = new Mall(20, "Elante Mall", "Chandigarh", 5, true, shop20);
		mall20.getMallDetails();
	}
}