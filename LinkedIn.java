class LinkedIn {
	int linkedInId;
	String companyPage;
	String industry;
	int followers;
	boolean isVerified;
	Profile profile;
	
	public LinkedIn(int linkedInId, String companyPage, String industry, int followers, boolean isVerified, Profile profile) {
		this.linkedInId = linkedInId;
		this.companyPage = companyPage;
		this.industry = industry;
		this.followers = followers;
		this.isVerified = isVerified;
		this.profile = profile;
	}
	
	public void getLinkedInDetails() {
		System.out.println("LinkedIn Details:");
		System.out.println("LinkedInId: " + linkedInId);
		System.out.println("CompanyPage: " + companyPage);
		System.out.println("Industry: " + industry);
		System.out.println("Followers: " + followers);
		System.out.println("IsVerified: " + isVerified);
		this.profile.getProfileDetails();
		System.out.println("----------------");
	}
}