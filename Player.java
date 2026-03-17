class Player {
	int playerId;
	String playerName;
	String role;
	String nationality;
	double price;

	public Player(int playerId, String playerName, String role, String nationality, double price) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.role = role;
		this.nationality = nationality;
		this.price = price;
	}
	
	public void getPlayerDetails() {
		System.out.println("Player Id: " + playerId);
		System.out.println("Player Name: " + playerName);
		System.out.println("Role: " + role);
		System.out.println("Nationality: " + nationality);
		System.out.println("Price (Cr): " + price);
	}
}
