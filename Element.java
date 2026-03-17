class Element {
	int atomicNumber;
	String elementName;
	String symbol;
	double atomicMass;
	boolean isMetal;
	
	public Element(int atomicNumber, String elementName, String symbol, double atomicMass, boolean isMetal) {
		this.atomicNumber = atomicNumber;
		this.elementName = elementName;
		this.symbol = symbol;
		this.atomicMass = atomicMass;
		this.isMetal = isMetal;
	}
	
	public void getElementDetails() {
		System.out.println("Atomic Number: " + atomicNumber);
		System.out.println("Element Name: " + elementName);
		System.out.println("Symbol: " + symbol);
		System.out.println("Atomic Mass: " + atomicMass);
		System.out.println("Metal: " + isMetal);
	}
}