class Government {
	int govtId;
	String govtName;
	String country;
	int ministries;
	boolean isDemocratic;
	Policy policy;
	
	public Government(int govtId, String govtName, String country, int ministries, boolean isDemocratic, Policy policy) {
		this.govtId = govtId;
		this.govtName = govtName;
		this.country = country;
		this.ministries = ministries;
		this.isDemocratic = isDemocratic;
		this.policy = policy;
	}
	
	public void getGovernmentDetails() {
		System.out.println("Government Details:");
		System.out.println("GovtId: " + govtId);
		System.out.println("GovtName: " + govtName);
		System.out.println("Country: " + country);
		System.out.println("Ministries: " + ministries);
		System.out.println("IsDemocratic: " + isDemocratic);
		this.policy.getPolicyDetails();
		System.out.println("----------------");
	}
}