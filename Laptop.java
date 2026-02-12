class Laptop {

    static boolean isConnected;

    static boolean onOrOff() {

        if(isConnected==false){
            isConnected = true;
            System.out.println("Laptop is turned ON..");
        } else if(isConnected==true) {
            isConnected = false;
            System.out.println("Laptop is turned OFF..");
        }

        return isConnected;
    }
}
