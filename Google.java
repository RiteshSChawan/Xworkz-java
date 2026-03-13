class Google {

    int companyId;
    String companyName;
    String ceo;
    String headquarters;
    int foundedYear;
    double revenue;
    int employeeCount;
    String industry;
    String stockSymbol;
    double marketCap;
    String parentCompany;
    boolean isPublic;
    String vision;
    String mission;
    int productCount;
    String mainProduct;
    boolean isGlobal;
    String country;
    String continent;
    String[] services;

    public Google(int companyId, String companyName, String ceo, String headquarters, int foundedYear, double revenue, int employeeCount, String industry, String stockSymbol, double marketCap, String parentCompany, boolean isPublic, String vision, String mission, int productCount, String mainProduct, boolean isGlobal, String country, String continent, String[] services) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.ceo = ceo;
        this.headquarters = headquarters;
        this.foundedYear = foundedYear;
        this.revenue = revenue;
        this.employeeCount = employeeCount;
        this.industry = industry;
        this.stockSymbol = stockSymbol;
        this.marketCap = marketCap;
        this.parentCompany = parentCompany;
        this.isPublic = isPublic;
        this.vision = vision;
        this.mission = mission;
        this.productCount = productCount;
        this.mainProduct = mainProduct;
        this.isGlobal = isGlobal;
        this.country = country;
        this.continent = continent;
        this.services = services;
    }

    public void getDetails() {
        System.out.println("CompanyId : " + this.companyId);
        System.out.println("CompanyName : " + this.companyName);
        System.out.println("Ceo : " + this.ceo);
        System.out.println("Headquarters : " + this.headquarters);
        System.out.println("FoundedYear : " + this.foundedYear);
        System.out.println("Revenue : " + this.revenue);
        System.out.println("EmployeeCount : " + this.employeeCount);
        System.out.println("Industry : " + this.industry);
        System.out.println("StockSymbol : " + this.stockSymbol);
        System.out.println("MarketCap : " + this.marketCap);
        System.out.println("ParentCompany : " + this.parentCompany);
        System.out.println("IsPublic : " + this.isPublic);
        System.out.println("Vision : " + this.vision);
        System.out.println("Mission : " + this.mission);
        System.out.println("ProductCount : " + this.productCount);
        System.out.println("MainProduct : " + this.mainProduct);
        System.out.println("IsGlobal : " + this.isGlobal);
        System.out.println("Country : " + this.country);
        System.out.println("Continent : " + this.continent);
        System.out.println("Services :");
        for (String item : this.services)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}