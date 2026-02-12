class AirConditioner {

    static boolean isConnected;
	static int currentTemperature;
	static int maxTemperature = 25;
	static int minTemperature;

    static boolean onOrOff() {

        if(isConnected==false){
            isConnected = true;
            System.out.println("Air Conditioner is turned ON..");
        } else if(isConnected==true) {
            isConnected = false;
            System.out.println("Air Conditioner is turned OFF..");
        }

        return isConnected;
    }
	
	
	//increase temp
	static void increaseTemperature(){
		System.out.println("Increase Temperature is invoked..");
		System.out.println("No. of args : "+0);
		if(isConnected == true){
			System.out.println("Proceed for increase temperature");
			if(currentTemperature<maxTemperature){
				currentTemperature = currentTemperature+1;
				System.out.println("The current temperature is : "+ currentTemperature);

			}else{
				System.out.println("Max temperature reached");
			}
			
			
		}else{
			System.out.println("AC is off turn it on");
			
		}
		
	}
	
	//decr volume
	static void decreaseTemperature(){
		System.out.println("Decrease temperature is invoked");
		System.out.println("No. of args : "+0);
		if(isConnected == true){
			System.out.println("Proceed for decrease temperature");
			if(currentTemperature>minTemperature){
				currentTemperature = currentTemperature-1;	
				System.out.println("The current temperature is : "+ currentTemperature);

			}else{
				System.out.println("Minimum temperature reached");
			}
		}else{
			System.out.println("AC is off turn it on");
		}
	}
}

