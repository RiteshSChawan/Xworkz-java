class AirConditioner {

    static boolean isConnected;

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
}
