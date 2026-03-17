class Form{

	int formId;
	String formName;
	String origin;
	int performers;
	String costume;
	
	public Form(int formId, String formName, String origin, int performers, String costume) {
		this.formId = formId;
		this.formName = formName;
		this.origin = origin;
		this.performers = performers;
		this.costume = costume;
	}

	public void getFormDetails(){
		System.out.println("Form Id: "+formId);
		System.out.println("Form Name: "+formName);
		System.out.println("Origin: "+origin);
		System.out.println("Performers: "+performers);
		System.out.println("Costume: "+costume);
	}
}