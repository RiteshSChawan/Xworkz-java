class Television {

    static boolean isConnected;

    static int currentVolume;
    static int maxVolume = 10;
    static int minVolume = 0;

    static boolean onOrOff() {

        if(isConnected == false){
            isConnected = true;
            System.out.println("Television is turned ON..");
        } else {
            isConnected = false;
            System.out.println("Television is turned OFF..");
        }

        return isConnected;
    }

    // Increase Volume
    static void increaseVolume(){

        System.out.println("Increase Volume invoked..");

        if(isConnected == true){

            if(currentVolume < maxVolume){
                currentVolume++;
                System.out.println("Current Volume: " + currentVolume);
            } else {
                System.out.println("Maximum Volume reached");
            }

        } else {
            System.out.println("Television is OFF. Turn it ON first.");
        }
    }

    // Decrease Volume
    static void decreaseVolume(){

        System.out.println("Decrease Volume invoked..");

        if(isConnected == true){

            if(currentVolume > minVolume){
                currentVolume--;
                System.out.println("Current Volume: " + currentVolume);
            } else {
                System.out.println("Minimum Volume reached");
            }

        } else {
            System.out.println("Television is OFF. Turn it ON first.");
        }
    }
}
