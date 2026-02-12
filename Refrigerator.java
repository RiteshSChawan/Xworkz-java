class Refrigerator {

    static boolean isConnected;

    static boolean onOrOff() {

        if(isConnected==false){
            isConnected = true;
            System.out.println("Refrigerator is turned ON..");
        } else if(isConnected==true) {
            isConnected = false;
            System.out.println("Refrigerator is turned OFF..");
        }

        return isConnected;
    }
}
