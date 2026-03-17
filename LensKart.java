class LensKart {
	int lensKartId;
	String branchName;
	String location;
	int totalFrames;
	boolean isOnlineAvailable;
	Frame frame;
	
	public LensKart(int lensKartId, String branchName, String location, int totalFrames, boolean isOnlineAvailable, Frame frame) {
		this.lensKartId = lensKartId;
		this.branchName = branchName;
		this.location = location;
		this.totalFrames = totalFrames;
		this.isOnlineAvailable = isOnlineAvailable;
		this.frame = frame;
	}
	
	public void getLensKartDetails() {
		System.out.println("LensKart Details:");
		System.out.println("LensKart Id: " + lensKartId);
		System.out.println("Branch Name: " + branchName);
		System.out.println("Location: " + location);
		System.out.println("Total Frames: " + totalFrames);
		System.out.println("Online Available: " + isOnlineAvailable);
		this.frame.getFrameDetails();
		System.out.println("----------------");
	}
}