class Laptop {

    static boolean isConnected;

    static int brightness;
    static int maxBrightness = 5;
    static int minBrightness = 0;

    static boolean onOrOff() {

        if(isConnected == false){
            isConnected = true;
            System.out.println("Laptop is turned ON..");
        } else {
            isConnected = false;
            System.out.println("Laptop is turned OFF..");
        }

        return isConnected;
    }

    // Increase Brightness
    static void increaseBrightness(){

        System.out.println("Increase Brightness invoked..");

        if(isConnected == true){

            if(brightness < maxBrightness){
                brightness++;
                System.out.println("Current Brightness: " + brightness);
            } else {
                System.out.println("Maximum Brightness reached");
            }

        } else {
            System.out.println("Laptop is OFF. Turn it ON first.");
        }
    }

    // Decrease Brightness
    static void decreaseBrightness(){

        System.out.println("Decrease Brightness invoked..");

        if(isConnected == true){

            if(brightness > minBrightness){
                brightness--;
                System.out.println("Current Brightness: " + brightness);
            } else {
                System.out.println("Minimum Brightness reached");
            }

        } else {
            System.out.println("Laptop is OFF. Turn it ON first.");
        }
    }
}
