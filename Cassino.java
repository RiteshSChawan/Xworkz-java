class Cassino {
	int cassinoId;
	String cassinoName;
	String gameType;
	int tables;
	boolean isVIP;
	
	public Cassino(int cassinoId, String cassinoName, String gameType, int tables, boolean isVIP) {
		this.cassinoId = cassinoId;
		this.cassinoName = cassinoName;
		this.gameType = gameType;
		this.tables = tables;
		this.isVIP = isVIP;
	}
	
	public void getCassinoDetails() {
		System.out.println("Cassino Id: " + cassinoId);
		System.out.println("Cassino Name: " + cassinoName);
		System.out.println("Game Type: " + gameType);
		System.out.println("Tables: " + tables);
		System.out.println("VIP: " + isVIP);
	}
}