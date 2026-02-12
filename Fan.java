class Fan {

    static boolean isConnected;

    static int currentSpeed;
    static int maxSpeed = 5;
    static int minSpeed = 0;

    // ON / OFF
    static boolean onOrOff() {

        if(isConnected == false){
            isConnected = true;
            System.out.println("Fan is turned ON..");
        } else {
            isConnected = false;
            System.out.println("Fan is turned OFF..");
        }

        return isConnected;
    }

    // Increase Speed
    static void increaseSpeed(){

        System.out.println("Increase Speed is invoked..");

        if(isConnected == true){

            if(currentSpeed < maxSpeed){
                currentSpeed = currentSpeed + 1;
                System.out.println("Current Fan Speed: " + currentSpeed);
            } else {
                System.out.println("Maximum Speed reached");
            }

        } else {
            System.out.println("Fan is OFF. Turn it ON first.");
        }
    }

    // Decrease Speed
    static void decreaseSpeed(){

        System.out.println("Decrease Speed is invoked..");

        if(isConnected == true){

            if(currentSpeed > minSpeed){
                currentSpeed = currentSpeed - 1;
                System.out.println("Current Fan Speed: " + currentSpeed);
            } else {
                System.out.println("Minimum Speed reached");
            }

        } else {
            System.out.println("Fan is OFF. Turn it ON first.");
        }
    }
}
