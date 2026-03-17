class Groww {
	int growwId;
	String portfolioName;
	String investorType;
	double totalInvestment;
	boolean isProfitable;
	Stock stock;
	
	public Groww(int growwId, String portfolioName, String investorType, double totalInvestment, boolean isProfitable, Stock stock) {
		this.growwId = growwId;
		this.portfolioName = portfolioName;
		this.investorType = investorType;
		this.totalInvestment = totalInvestment;
		this.isProfitable = isProfitable;
		this.stock = stock;
	}
	
	public void getGrowwDetails() {
		System.out.println("Groww Details:");
		System.out.println("GrowwId: " + growwId);
		System.out.println("PortfolioName: " + portfolioName);
		System.out.println("InvestorType: " + investorType);
		System.out.println("TotalInvestment: " + totalInvestment);
		System.out.println("IsProfitable: " + isProfitable);
		this.stock.getStockDetails();
		System.out.println("----------------");
	}
}