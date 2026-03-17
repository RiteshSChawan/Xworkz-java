class Service {
	int serviceId;
	String serviceName;
	String category;
	double price;
	int durationMinutes;
	
	public Service(int serviceId, String serviceName, String category, double price, int durationMinutes) {
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.category = category;
		this.price = price;
		this.durationMinutes = durationMinutes;
	}
	
	public void getServiceDetails() {
		System.out.println("ServiceId: " + serviceId);
		System.out.println("ServiceName: " + serviceName);
		System.out.println("Category: " + category);
		System.out.println("Price: " + price);
		System.out.println("DurationMinutes: " + durationMinutes);
	}
}