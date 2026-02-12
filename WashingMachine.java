class WashingMachine {

    static boolean isConnected;

    static int washLevel;
    static int maxLevel = 5;
    static int minLevel = 0;

    static boolean onOrOff() {

        if(isConnected == false){
            isConnected = true;
            System.out.println("Washing Machine is turned ON..");
        } else {
            isConnected = false;
            System.out.println("Washing Machine is turned OFF..");
        }

        return isConnected;
    }

    // Increase Wash Level
    static void increaseWashLevel(){

        System.out.println("Increase Wash Level invoked..");

        if(isConnected == true){

            if(washLevel < maxLevel){
                washLevel++;
                System.out.println("Current Wash Level: " + washLevel);
            } else {
                System.out.println("Maximum Wash Level reached");
            }

        } else {
            System.out.println("Washing Machine is OFF. Turn it ON first.");
        }
    }

    // Decrease Wash Level
    static void decreaseWashLevel(){

        System.out.println("Decrease Wash Level invoked..");

        if(isConnected == true){

            if(washLevel > minLevel){
                washLevel--;
                System.out.println("Current Wash Level: " + washLevel);
            } else {
                System.out.println("Minimum Wash Level reached");
            }

        } else {
            System.out.println("Washing Machine is OFF. Turn it ON first.");
        }
    }
}
