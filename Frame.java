class Frame {
	int frameId;
	String frameName;
	String material;
	String shape;
	double price;
	
	public Frame(int frameId, String frameName, String material, String shape, double price) {
		this.frameId = frameId;
		this.frameName = frameName;
		this.material = material;
		this.shape = shape;
		this.price = price;
	}
	
	public void getFrameDetails() {
		System.out.println("Frame Id: " + frameId);
		System.out.println("Frame Name: " + frameName);
		System.out.println("Material: " + material);
		System.out.println("Shape: " + shape);
		System.out.println("Price: " + price);
	}
}