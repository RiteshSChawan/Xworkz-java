class Fan {

    static boolean isConnected;

    static boolean onOrOff() {

        if(isConnected==false){
            isConnected = true;
            System.out.println("Fan is turned ON..");
        } else if(isConnected==true) {
            isConnected = false;
            System.out.println("Fan is turned OFF..");
        }

        return isConnected;
    }
}
