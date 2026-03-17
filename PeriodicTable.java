class PeriodicTable {
	int tableId;
	String tableName;
	String category;
	int totalElements;
	int period;
	Element element;
	
	public PeriodicTable(int tableId, String tableName, String category, int totalElements, int period, Element element) {
		this.tableId = tableId;
		this.tableName = tableName;
		this.category = category;
		this.totalElements = totalElements;
		this.period = period;
		this.element = element;
	}
	
	public void getPeriodicTableDetails() {
		System.out.println("PeriodicTable Details:");
		System.out.println("Table Id: " + tableId);
		System.out.println("Table Name: " + tableName);
		System.out.println("Category: " + category);
		System.out.println("Total Elements: " + totalElements);
		System.out.println("Period: " + period);
		this.element.getElementDetails();
		System.out.println("----------------");
	}
}