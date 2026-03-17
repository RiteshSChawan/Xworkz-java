class Dance{

	int danceId;
	String danceName;
	String event;
	String country;
	int duration;
	Form form;
	
	public Dance(int danceId, String danceName, String event, String country, int duration, Form form) {
		this.danceId = danceId;
		this.danceName = danceName;
		this.event = event;
		this.country = country;
		this.duration = duration;
		this.form = form;
	}

	public void getDanceDetails(){
		System.out.println("Dance Details:");
		System.out.println("Dance Id: "+danceId);
		System.out.println("Dance Name: "+danceName);
		System.out.println("Event: "+event);
		System.out.println("Country: "+country);
		System.out.println("Duration: "+duration);
		this.form.getFormDetails();
		System.out.println("----------------");
	}
}