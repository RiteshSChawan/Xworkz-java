class Policy {
	int policyId;
	String policyName;
	String sector;
	double budget;
	boolean isActive;
	
	public Policy(int policyId, String policyName, String sector, double budget, boolean isActive) {
		this.policyId = policyId;
		this.policyName = policyName;
		this.sector = sector;
		this.budget = budget;
		this.isActive = isActive;
	}
	
	public void getPolicyDetails() {
		System.out.println("PolicyId: " + policyId);
		System.out.println("PolicyName: " + policyName);
		System.out.println("Sector: " + sector);
		System.out.println("Budget: " + budget);
		System.out.println("IsActive: " + isActive);
	}
}