class Printer {

    static boolean isConnected;

    static boolean onOrOff() {

        if(isConnected==false){
            isConnected = true;
            System.out.println("Printer is turned ON..");
        } else if(isConnected==true){
            isConnected = false;
            System.out.println("Printer is turned OFF..");
        }

        return isConnected;
    }
}
