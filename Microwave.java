class Microwave {

    static boolean isConnected;

    static int currentTime;
    static int maxTime = 10;
    static int minTime = 0;

    static boolean onOrOff() {

        if(isConnected == false){
            isConnected = true;
            System.out.println("Microwave is turned ON..");
        } else {
            isConnected = false;
            System.out.println("Microwave is turned OFF..");
        }

        return isConnected;
    }

    // Increase Time
    static void increaseTime(){

        System.out.println("Increase Time invoked..");

        if(isConnected == true){

            if(currentTime < maxTime){
                currentTime++;
                System.out.println("Current Time: " + currentTime + " minutes");
            } else {
                System.out.println("Maximum Time reached");
            }

        } else {
            System.out.println("Microwave is OFF. Turn it ON first.");
        }
    }

    // Decrease Time
    static void decreaseTime(){

        System.out.println("Decrease Time invoked..");

        if(isConnected == true){

            if(currentTime > minTime){
                currentTime--;
                System.out.println("Current Time: " + currentTime + " minutes");
            } else {
                System.out.println("Minimum Time reached");
            }

        } else {
            System.out.println("Microwave is OFF. Turn it ON first.");
        }
    }
}
