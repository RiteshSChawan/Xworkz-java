class Machine {
	int machineId;
	String machineName;
	String type;
	double powerConsumption;
	boolean isAutomated;
	
	public Machine(int machineId, String machineName, String type, double powerConsumption, boolean isAutomated) {
		this.machineId = machineId;
		this.machineName = machineName;
		this.type = type;
		this.powerConsumption = powerConsumption;
		this.isAutomated = isAutomated;
	}
	public void getMachineDetails() {
		System.out.println("Machine Id: " + machineId);
		System.out.println("Machine Name: " + machineName);
		System.out.println("Type: " + type);
		System.out.println("Power Consumption: " + powerConsumption);
		System.out.println("Automated: " + isAutomated);
	}
}
 