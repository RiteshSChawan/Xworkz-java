class Profile {
	int profileId;
	String fullName;
	String jobTitle;
	String skills;
	double connectionCount;
	
	public Profile(int profileId, String fullName, String jobTitle, String skills, double connectionCount) {
		this.profileId = profileId;
		this.fullName = fullName;
		this.jobTitle = jobTitle;
		this.skills = skills;
		this.connectionCount = connectionCount;
	}
	
	public void getProfileDetails() {
		System.out.println("ProfileId: " + profileId);
		System.out.println("FullName: " + fullName);
		System.out.println("JobTitle: " + jobTitle);
		System.out.println("Skills: " + skills);
		System.out.println("ConnectionCount: " + connectionCount);
	}
}