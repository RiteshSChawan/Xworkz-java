class Shop{

	int shopId;
	String shopName;
	String shopType;
	int employees;
	boolean isOpen;
	
	public Shop(int shopId, String shopName, String shopType, int employees, boolean isOpen) {
		this.shopId = shopId;
		this.shopName = shopName;
		this.shopType = shopType;
		this.employees = employees;
		this.isOpen = isOpen;
	}

	public void getShopDetails(){
		System.out.println("Shop Id: "+shopId);
		System.out.println("Shop Name: "+shopName);
		System.out.println("Shop Type: "+shopType);
		System.out.println("Employees: "+employees);
		System.out.println("Open: "+isOpen);
	}
}