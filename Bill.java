class Bill{

	private double bill;
	Bill(){
		System.out.println("Bill is started");
	}
	
	public double getBill(){
		System.out.println("getBill is started");
		return bill;
	}
}