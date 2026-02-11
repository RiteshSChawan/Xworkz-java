class Television {

    static boolean isConnected;

    static boolean onOrOff() {

        if(isConnected==false){
            isConnected = true;
            System.out.println("Television is turned ON..");
        } else if(isConnected==true) {
            isConnected = false;
            System.out.println("Television is turned OFF..");
        }

        return isConnected;
    }
}
