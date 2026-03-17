class GrowwExecutor {
	public static void main(String[] args) {
/*
		Stock stock1 = new Stock();
		stock1.stockId = 1;
		stock1.companyName = "TCS";
		stock1.sector = "IT";
		stock1.currentPrice = 3850.0;
		stock1.percentChange = 1.25;
		Groww groww1 = new Groww();
		groww1.growwId = 1;
		groww1.portfolioName = "Tech Portfolio";
		groww1.investorType = "Retail";
		groww1.totalInvestment = 50000.0;
		groww1.isProfitable = true;
		groww1.stock = stock1;
		groww1.getGrowwDetails();

		Stock stock2 = new Stock();
		stock2.stockId = 2;
		stock2.companyName = "HUL";
		stock2.sector = "FMCG";
		stock2.currentPrice = 2650.0;
		stock2.percentChange = 0.85;
		Groww groww2 = new Groww();
		groww2.growwId = 2;
		groww2.portfolioName = "FMCG Portfolio";
		groww2.investorType = "Retail";
		groww2.totalInvestment = 30000.0;
		groww2.isProfitable = true;
		groww2.stock = stock2;
		groww2.getGrowwDetails();

		Stock stock3 = new Stock();
		stock3.stockId = 3;
		stock3.companyName = "HDFC Bank";
		stock3.sector = "Banking";
		stock3.currentPrice = 1680.0;
		stock3.percentChange = 1.1;
		Groww groww3 = new Groww();
		groww3.growwId = 3;
		groww3.portfolioName = "Banking Portfolio";
		groww3.investorType = "Institutional";
		groww3.totalInvestment = 500000.0;
		groww3.isProfitable = true;
		groww3.stock = stock3;
		groww3.getGrowwDetails();

		Stock stock4 = new Stock();
		stock4.stockId = 4;
		stock4.companyName = "Reliance";
		stock4.sector = "Energy";
		stock4.currentPrice = 2950.0;
		stock4.percentChange = -0.45;
		Groww groww4 = new Groww();
		groww4.growwId = 4;
		groww4.portfolioName = "Energy Portfolio";
		groww4.investorType = "HNI";
		groww4.totalInvestment = 200000.0;
		groww4.isProfitable = false;
		groww4.stock = stock4;
		groww4.getGrowwDetails();

		Stock stock5 = new Stock();
		stock5.stockId = 5;
		stock5.companyName = "Sun Pharma";
		stock5.sector = "Pharma";
		stock5.currentPrice = 1540.0;
		stock5.percentChange = 2.3;
		Groww groww5 = new Groww();
		groww5.growwId = 5;
		groww5.portfolioName = "Pharma Portfolio";
		groww5.investorType = "Retail";
		groww5.totalInvestment = 75000.0;
		groww5.isProfitable = true;
		groww5.stock = stock5;
		groww5.getGrowwDetails();

		Stock stock6 = new Stock();
		stock6.stockId = 6;
		stock6.companyName = "Tata Motors";
		stock6.sector = "Auto";
		stock6.currentPrice = 980.0;
		stock6.percentChange = -1.2;
		Groww groww6 = new Groww();
		groww6.growwId = 6;
		groww6.portfolioName = "Auto Portfolio";
		groww6.investorType = "Retail";
		groww6.totalInvestment = 40000.0;
		groww6.isProfitable = false;
		groww6.stock = stock6;
		groww6.getGrowwDetails();

		Stock stock7 = new Stock();
		stock7.stockId = 7;
		stock7.companyName = "L&T";
		stock7.sector = "Infrastructure";
		stock7.currentPrice = 3420.0;
		stock7.percentChange = 0.65;
		Groww groww7 = new Groww();
		groww7.growwId = 7;
		groww7.portfolioName = "Infra Portfolio";
		groww7.investorType = "HNI";
		groww7.totalInvestment = 150000.0;
		groww7.isProfitable = true;
		groww7.stock = stock7;
		groww7.getGrowwDetails();

		Stock stock8 = new Stock();
		stock8.stockId = 8;
		stock8.companyName = "Wipro";
		stock8.sector = "IT";
		stock8.currentPrice = 520.0;
		stock8.percentChange = 1.8;
		Groww groww8 = new Groww();
		groww8.growwId = 8;
		groww8.portfolioName = "Diversified Portfolio";
		groww8.investorType = "Retail";
		groww8.totalInvestment = 25000.0;
		groww8.isProfitable = true;
		groww8.stock = stock8;
		groww8.getGrowwDetails();

		Stock stock9 = new Stock();
		stock9.stockId = 9;
		stock9.companyName = "Asian Paints";
		stock9.sector = "Consumer";
		stock9.currentPrice = 3200.0;
		stock9.percentChange = 0.95;
		Groww groww9 = new Groww();
		groww9.growwId = 9;
		groww9.portfolioName = "Consumer Portfolio";
		groww9.investorType = "Institutional";
		groww9.totalInvestment = 800000.0;
		groww9.isProfitable = true;
		groww9.stock = stock9;
		groww9.getGrowwDetails();

		Stock stock10 = new Stock();
		stock10.stockId = 10;
		stock10.companyName = "Tata Steel";
		stock10.sector = "Metal";
		stock10.currentPrice = 165.0;
		stock10.percentChange = -2.1;
		Groww groww10 = new Groww();
		groww10.growwId = 10;
		groww10.portfolioName = "Metal Portfolio";
		groww10.investorType = "HNI";
		groww10.totalInvestment = 100000.0;
		groww10.isProfitable = false;
		groww10.stock = stock10;
		groww10.getGrowwDetails();

		Stock stock11 = new Stock();
		stock11.stockId = 11;
		stock11.companyName = "Infosys";
		stock11.sector = "IT";
		stock11.currentPrice = 1820.0;
		stock11.percentChange = 1.4;
		Groww groww11 = new Groww();
		groww11.growwId = 11;
		groww11.portfolioName = "Digital Portfolio";
		groww11.investorType = "Retail";
		groww11.totalInvestment = 60000.0;
		groww11.isProfitable = true;
		groww11.stock = stock11;
		groww11.getGrowwDetails();

		Stock stock12 = new Stock();
		stock12.stockId = 12;
		stock12.companyName = "ICICI Bank";
		stock12.sector = "Banking";
		stock12.currentPrice = 1220.0;
		stock12.percentChange = 0.75;
		Groww groww12 = new Groww();
		groww12.growwId = 12;
		groww12.portfolioName = "Blue Chip Portfolio";
		groww12.investorType = "Institutional";
		groww12.totalInvestment = 1000000.0;
		groww12.isProfitable = true;
		groww12.stock = stock12;
		groww12.getGrowwDetails();

		Stock stock13 = new Stock();
		stock13.stockId = 13;
		stock13.companyName = "Bajaj Finance";
		stock13.sector = "Finance";
		stock13.currentPrice = 7800.0;
		stock13.percentChange = 1.65;
		Groww groww13 = new Groww();
		groww13.growwId = 13;
		groww13.portfolioName = "Mid Cap Portfolio";
		groww13.investorType = "Retail";
		groww13.totalInvestment = 45000.0;
		groww13.isProfitable = true;
		groww13.stock = stock13;
		groww13.getGrowwDetails();

		Stock stock14 = new Stock();
		stock14.stockId = 14;
		stock14.companyName = "Zomato";
		stock14.sector = "Food Tech";
		stock14.currentPrice = 240.0;
		stock14.percentChange = -0.9;
		Groww groww14 = new Groww();
		groww14.growwId = 14;
		groww14.portfolioName = "Small Cap Portfolio";
		groww14.investorType = "Retail";
		groww14.totalInvestment = 20000.0;
		groww14.isProfitable = false;
		groww14.stock = stock14;
		groww14.getGrowwDetails();

		Stock stock15 = new Stock();
		stock15.stockId = 15;
		stock15.companyName = "Adani Green";
		stock15.sector = "Renewable";
		stock15.currentPrice = 1850.0;
		stock15.percentChange = 3.2;
		Groww groww15 = new Groww();
		groww15.growwId = 15;
		groww15.portfolioName = "ESG Portfolio";
		groww15.investorType = "Institutional";
		groww15.totalInvestment = 300000.0;
		groww15.isProfitable = true;
		groww15.stock = stock15;
		groww15.getGrowwDetails();

		Stock stock16 = new Stock();
		stock16.stockId = 16;
		stock16.companyName = "Bharti Airtel";
		stock16.sector = "Telecom";
		stock16.currentPrice = 1680.0;
		stock16.percentChange = 1.15;
		Groww groww16 = new Groww();
		groww16.growwId = 16;
		groww16.portfolioName = "Telecom Portfolio";
		groww16.investorType = "HNI";
		groww16.totalInvestment = 120000.0;
		groww16.isProfitable = true;
		groww16.stock = stock16;
		groww16.getGrowwDetails();

		Stock stock17 = new Stock();
		stock17.stockId = 17;
		stock17.companyName = "UltraTech Cement";
		stock17.sector = "Cement";
		stock17.currentPrice = 10500.0;
		stock17.percentChange = 0.55;
		Groww groww17 = new Groww();
		groww17.growwId = 17;
		groww17.portfolioName = "Cement Portfolio";
		groww17.investorType = "Retail";
		groww17.totalInvestment = 35000.0;
		groww17.isProfitable = true;
		groww17.stock = stock17;
		groww17.getGrowwDetails();

		Stock stock18 = new Stock();
		stock18.stockId = 18;
		stock18.companyName = "Apollo Hospitals";
		stock18.sector = "Healthcare";
		stock18.currentPrice = 6400.0;
		stock18.percentChange = 2.1;
		Groww groww18 = new Groww();
		groww18.growwId = 18;
		groww18.portfolioName = "Healthcare Portfolio";
		groww18.investorType = "Retail";
		groww18.totalInvestment = 55000.0;
		groww18.isProfitable = true;
		groww18.stock = stock18;
		groww18.getGrowwDetails();

		Stock stock19 = new Stock();
		stock19.stockId = 19;
		stock19.companyName = "DMart";
		stock19.sector = "Retail";
		stock19.currentPrice = 4600.0;
		stock19.percentChange = 0.8;
		Groww groww19 = new Groww();
		groww19.growwId = 19;
		groww19.portfolioName = "Retail Portfolio";
		groww19.investorType = "HNI";
		groww19.totalInvestment = 180000.0;
		groww19.isProfitable = true;
		groww19.stock = stock19;
		groww19.getGrowwDetails();

		Stock stock20 = new Stock();
		stock20.stockId = 20;
		stock20.companyName = "Hindalco";
		stock20.sector = "Commodity";
		stock20.currentPrice = 580.0;
		stock20.percentChange = -1.5;
		Groww groww20 = new Groww();
		groww20.growwId = 20;
		groww20.portfolioName = "Commodity Portfolio";
		groww20.investorType = "Institutional";
		groww20.totalInvestment = 400000.0;
		groww20.isProfitable = false;
		groww20.stock = stock20;
		groww20.getGrowwDetails(); */
		

		Stock stock1 = new Stock(1, "TCS", "IT", 3850.0, 1.25);
		Groww groww1 = new Groww(1, "Tech Portfolio", "Retail", 50000.0, true, stock1);
		groww1.getGrowwDetails();

		Stock stock2 = new Stock(2, "HUL", "FMCG", 2650.0, 0.85);
		Groww groww2 = new Groww(2, "FMCG Portfolio", "Retail", 30000.0, true, stock2);
		groww2.getGrowwDetails();

		Stock stock3 = new Stock(3, "HDFC Bank", "Banking", 1680.0, 1.1);
		Groww groww3 = new Groww(3, "Banking Portfolio", "Institutional", 500000.0, true, stock3);
		groww3.getGrowwDetails();

		Stock stock4 = new Stock(4, "Reliance", "Energy", 2950.0, -0.45);
		Groww groww4 = new Groww(4, "Energy Portfolio", "HNI", 200000.0, false, stock4);
		groww4.getGrowwDetails();

		Stock stock5 = new Stock(5, "Sun Pharma", "Pharma", 1540.0, 2.3);
		Groww groww5 = new Groww(5, "Pharma Portfolio", "Retail", 75000.0, true, stock5);
		groww5.getGrowwDetails();

		Stock stock6 = new Stock(6, "Tata Motors", "Auto", 980.0, -1.2);
		Groww groww6 = new Groww(6, "Auto Portfolio", "Retail", 40000.0, false, stock6);
		groww6.getGrowwDetails();

		Stock stock7 = new Stock(7, "L and T", "Infrastructure", 3420.0, 0.65);
		Groww groww7 = new Groww(7, "Infra Portfolio", "HNI", 150000.0, true, stock7);
		groww7.getGrowwDetails();

		Stock stock8 = new Stock(8, "Wipro", "IT", 520.0, 1.8);
		Groww groww8 = new Groww(8, "Diversified Portfolio", "Retail", 25000.0, true, stock8);
		groww8.getGrowwDetails();

		Stock stock9 = new Stock(9, "Asian Paints", "Consumer", 3200.0, 0.95);
		Groww groww9 = new Groww(9, "Consumer Portfolio", "Institutional", 800000.0, true, stock9);
		groww9.getGrowwDetails();

		Stock stock10 = new Stock(10, "Tata Steel", "Metal", 165.0, -2.1);
		Groww groww10 = new Groww(10, "Metal Portfolio", "HNI", 100000.0, false, stock10);
		groww10.getGrowwDetails();

		Stock stock11 = new Stock(11, "Infosys", "IT", 1820.0, 1.4);
		Groww groww11 = new Groww(11, "Digital Portfolio", "Retail", 60000.0, true, stock11);
		groww11.getGrowwDetails();

		Stock stock12 = new Stock(12, "ICICI Bank", "Banking", 1220.0, 0.75);
		Groww groww12 = new Groww(12, "Blue Chip Portfolio", "Institutional", 1000000.0, true, stock12);
		groww12.getGrowwDetails();

		Stock stock13 = new Stock(13, "Bajaj Finance", "Finance", 7800.0, 1.65);
		Groww groww13 = new Groww(13, "Mid Cap Portfolio", "Retail", 45000.0, true, stock13);
		groww13.getGrowwDetails();

		Stock stock14 = new Stock(14, "Zomato", "Food Tech", 240.0, -0.9);
		Groww groww14 = new Groww(14, "Small Cap Portfolio", "Retail", 20000.0, false, stock14);
		groww14.getGrowwDetails();

		Stock stock15 = new Stock(15, "Adani Green", "Renewable", 1850.0, 3.2);
		Groww groww15 = new Groww(15, "ESG Portfolio", "Institutional", 300000.0, true, stock15);
		groww15.getGrowwDetails();

		Stock stock16 = new Stock(16, "Bharti Airtel", "Telecom", 1680.0, 1.15);
		Groww groww16 = new Groww(16, "Telecom Portfolio", "HNI", 120000.0, true, stock16);
		groww16.getGrowwDetails();

		Stock stock17 = new Stock(17, "UltraTech Cement", "Cement", 10500.0, 0.55);
		Groww groww17 = new Groww(17, "Cement Portfolio", "Retail", 35000.0, true, stock17);
		groww17.getGrowwDetails();

		Stock stock18 = new Stock(18, "Apollo Hospitals", "Healthcare", 6400.0, 2.1);
		Groww groww18 = new Groww(18, "Healthcare Portfolio", "Retail", 55000.0, true, stock18);
		groww18.getGrowwDetails();

		Stock stock19 = new Stock(19, "DMart", "Retail", 4600.0, 0.8);
		Groww groww19 = new Groww(19, "Retail Portfolio", "HNI", 180000.0, true, stock19);
		groww19.getGrowwDetails();

		Stock stock20 = new Stock(20, "Hindalco", "Commodity", 580.0, -1.5);
		Groww groww20 = new Groww(20, "Commodity Portfolio", "Institutional", 400000.0, false, stock20);
		groww20.getGrowwDetails();


	}
}