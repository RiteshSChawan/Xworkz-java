class Stock {
	int stockId;
	String companyName;
	String sector;
	double currentPrice;
	double percentChange;
	
	public Stock(int stockId, String companyName, String sector, double currentPrice, double percentChange) {
		this.stockId = stockId;
		this.companyName = companyName;
		this.sector = sector;
		this.currentPrice = currentPrice;
		this.percentChange = percentChange;
	}
	
	public void getStockDetails() {
		System.out.println("StockId: " + stockId);
		System.out.println("CompanyName: " + companyName);
		System.out.println("Sector: " + sector);
		System.out.println("CurrentPrice: " + currentPrice);
		System.out.println("PercentChange: " + percentChange);
	}
}