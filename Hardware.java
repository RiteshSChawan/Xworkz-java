class Hardware{

	int hardwareId;
	String hardwareName;
	String brand;
	double price;
	boolean isInternal;
	
	public Hardware(int hardwareId, String hardwareName, String brand, double price, boolean isInternal) {
		this.hardwareId = hardwareId;
		this.hardwareName = hardwareName;
		this.brand = brand;
		this.price = price;
		this.isInternal = isInternal;
	}

	public void getHardwareDetails(){
		System.out.println("Hardware Id: "+hardwareId);
		System.out.println("Hardware Name: "+hardwareName);
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Internal: "+isInternal);
	}
}