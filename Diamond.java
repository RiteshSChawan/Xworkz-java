class Diamond {
	int diamondId;
	String diamondName;
	String color;
	double carats;
	boolean isCertified;
	
	public Diamond(int diamondId, String diamondName, String color, double carats, boolean isCertified) {
		this.diamondId = diamondId;
		this.diamondName = diamondName;
		this.color = color;
		this.carats = carats;
		this.isCertified = isCertified;
	}
	
	public void getDiamondDetails() {
		System.out.println("Diamond Id: " + diamondId);
		System.out.println("Diamond Name: " + diamondName);
		System.out.println("Color: " + color);
		System.out.println("Carats: " + carats);
		System.out.println("Certified: " + isCertified);
	}
}