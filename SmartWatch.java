class SmartWatch {

    static boolean isConnected;

    static boolean onOrOff() {

        if(isConnected==false){
            isConnected = true;
            System.out.println("Smart Watch is turned ON..");
        } else if(isConnected==true) {
            isConnected = false;
            System.out.println("Smart Watch is turned OFF..");
        }

        return isConnected;
    }
}
