class Speaker{
	//ref
	static boolean isConnected; //declaration
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
}