class CylinderExecutor{
	public static void main(String[] h){
		Cylinder cyliner= new Cylinder();
		boolean isAdded = cyliner.addName("LPG");
		System.out.println("Name is added "+isAdded);
		cyliner.addName("Indian");
		cyliner.addName("Bharath");
		cyliner.addName("HP");
		cyliner.addName("Reliance");
		cyliner.addName("Go");
		cyliner.addName("Shivgas");
		cyliner.addName("Jyothi");
		cyliner.addName("Essar");
		cyliner.addName("Super");
		cyliner.addName("Super");
		cyliner.fetchNames();
		cyliner.update("Go","KD");
		boolean isUpdate = cyliner.update("LPG","gobar");
		System.out.println("is update "+isUpdate);
		
		cyliner.fetchNames();
		boolean isDelete = cyliner.delete("Jyothi");
		System.out.println("is delete "+isDelete);
		cyliner.fetchNames();
		
	}
}