class Factory {
	int factoryId;
	String factoryName;
	String location;
	int workers;
	double productionCapacity;
	Machine machine;
	
	public Factory(int factoryId, String factoryName, String location, int workers, double productionCapacity, Machine machine) {
		this.factoryId = factoryId;
		this.factoryName = factoryName;
		this.location = location;
		this.workers = workers;
		this.productionCapacity = productionCapacity;
		this.machine = machine;
	}
	
	public void getFactoryDetails() {
		System.out.println("Factory Details:");
		System.out.println("Factory Id: " + factoryId);
		System.out.println("Factory Name: " + factoryName);
		System.out.println("Location: " + location);
		System.out.println("Workers: " + workers);
		System.out.println("Production Capacity: " + productionCapacity);
		this.machine.getMachineDetails();
		System.out.println("----------------");
	}
}