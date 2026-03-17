class LazyPool {
	int poolId;
	String poolName;
	String type;
	double length;
	boolean isHeated;
	
	public LazyPool(int poolId, String poolName, String type, double length, boolean isHeated) {
		this.poolId = poolId;
		this.poolName = poolName;
		this.type = type;
		this.length = length;
		this.isHeated = isHeated;
	}
	
	public void getPoolDetails() {
		System.out.println("Pool Id: " + poolId);
		System.out.println("Pool Name: " + poolName);
		System.out.println("Type: " + type);
		System.out.println("Length (m): " + length);
		System.out.println("Heated: " + isHeated);
	}
}