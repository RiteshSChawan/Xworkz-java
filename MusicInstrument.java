class MusicInstrument {
	int instrumentId;
	String instrumentName;
	String type;
	String material;
	double price;
	
	public MusicInstrument(int instrumentId, String instrumentName, String type, String material, double price) {
		this.instrumentId = instrumentId;
		this.instrumentName = instrumentName;
		this.type = type;
		this.material = material;
		this.price = price;
	}
	
	public void getInstrumentDetails() {
		System.out.println("Instrument Id: " + instrumentId);
		System.out.println("Instrument Name: " + instrumentName);
		System.out.println("Type: " + type);
		System.out.println("Material: " + material);
		System.out.println("Price: " + price);
	}
}