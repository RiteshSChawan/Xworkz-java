class Speaker{
	//ref
	//declaration
	static boolean isConnected; 
	static int currentVolume;
	static int maxVolume = 8 ;
	static int minVolume;
	
	//onOrOff is a functionality of speaker product
	static boolean onOrOff(){
	
	if(isConnected == false){
		isConnected=true;
		System.out.println("The speaker is turned on..");
	}else if(isConnected == true){
		isConnected = false;
		System.out.println("The speaker is turned off..");
	}
	
	return isConnected;
	}
	
	//incrVolume
	static void increaseVolume(){
		System.out.println("Increase volume is invoked..");
		System.out.println("No. of args : "+0);
		if(isConnected == true){
			System.out.println("Proceed for increase volume");
			if(currentVolume<maxVolume){
				currentVolume = currentVolume+1;
				System.out.println("The current volume is : "+ currentVolume);

			}else{
				System.out.println("Max volume reached");
			}
			
			
		}else{
			System.out.println("Speaker is off turn it on");
			
		}
		
	}
	
	//decr volume
	static void decreaseVolume(){
		System.out.println("Decrease volume is invoked");
		System.out.println("No. of args : "+0);
		if(isConnected == true){
			System.out.println("Proceed for decrease volume");
			if(currentVolume>minVolume){
				currentVolume = currentVolume-1;	
				System.out.println("The current volume is : "+ currentVolume);

			}else{
				System.out.println("Minimum voulme reached");
			}
		}else{
			System.out.println("Speaker is off turn it on");
		}
	}
}