class Company {
	int companyId;
	String companyName;
	String location;
	int employees;
	double revenue;
	Project project;
	
	public Company(int companyId, String companyName, String location, int employees, double revenue, Project project) {
		this.companyId = companyId;
		this.companyName = companyName;
		this.location = location;
		this.employees = employees;
		this.revenue = revenue;
		this.project = project;
	}
	
	public void getCompanyDetails() {
		System.out.println("Company Details:");
		System.out.println("Company Id: " + companyId);
		System.out.println("Company Name: " + companyName);
		System.out.println("Location: " + location);
		System.out.println("Employees: " + employees);
		System.out.println("Revenue (Cr): " + revenue);
		this.project.getProjectDetails();
		System.out.println("----------------");
	}
}