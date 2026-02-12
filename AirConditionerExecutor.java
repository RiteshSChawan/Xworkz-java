class AirConditionerExecutor {

    public static void main(String[] args) {

        boolean ref = AirConditioner.onOrOff();
        System.out.println("AC status: " + ref);

        AirConditioner.increaseTemperature();
		AirConditioner.increaseTemperature();
		AirConditioner.increaseTemperature();
		AirConditioner.decreaseTemperature();
		AirConditioner.increaseTemperature();
		AirConditioner.decreaseTemperature();
			
		ref = AirConditioner.onOrOff();
        System.out.println("AC status: " + ref);
    }
}
