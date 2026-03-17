class Pc{

	int pcId;
	String pcBrand;
	String processor;
	int ram;
	double price;
	Hardware hardware;
	
	public Pc(int pcId, String pcBrand, String processor, int ram, double price, Hardware hardware) {
		this.pcId = pcId;
		this.pcBrand = pcBrand;
		this.processor = processor;
		this.ram = ram;
		this.price = price;
		this.hardware = hardware;
	}

	public void getPcDetails(){
		System.out.println("PC Details:");
		System.out.println("PC Id: "+pcId);
		System.out.println("Brand: "+pcBrand);
		System.out.println("Processor: "+processor);
		System.out.println("RAM: "+ram);
		System.out.println("Price: "+price);
		this.hardware.getHardwareDetails();
		System.out.println("----------------");
	}
}