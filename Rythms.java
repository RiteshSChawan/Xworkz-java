class Rythms {
	int rythmsId;
	String storeName;
	String location;
	int totalInstruments;
	boolean hasRepairService;
	MusicInstrument musicInstrument;
	
	public Rythms(int rythmsId, String storeName, String location, int totalInstruments, boolean hasRepairService, MusicInstrument musicInstrument) {
		this.rythmsId = rythmsId;
		this.storeName = storeName;
		this.location = location;
		this.totalInstruments = totalInstruments;
		this.hasRepairService = hasRepairService;
		this.musicInstrument = musicInstrument;
	}
	
	public void getRythmsDetails() {
		System.out.println("Rythms Details:");
		System.out.println("Rythms Id: " + rythmsId);
		System.out.println("Store Name: " + storeName);
		System.out.println("Location: " + location);
		System.out.println("Total Instruments: " + totalInstruments);
		System.out.println("Repair Service: " + hasRepairService);
		this.musicInstrument.getInstrumentDetails();
		System.out.println("----------------");
	}
}