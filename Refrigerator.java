class Refrigerator {

    static boolean isConnected;

    static int currentTemperature;
    static int maxTemperature = 10;
    static int minTemperature = 0;

    static boolean onOrOff() {

        if(isConnected == false){
            isConnected = true;
            System.out.println("Refrigerator is turned ON..");
        } else {
            isConnected = false;
            System.out.println("Refrigerator is turned OFF..");
        }

        return isConnected;
    }

    // Increase Temperature
    static void increaseTemperature(){

        System.out.println("Increase Temperature invoked..");

        if(isConnected == true){

            if(currentTemperature < maxTemperature){
                currentTemperature++;
                System.out.println("Current Temperature: " + currentTemperature);
            } else {
                System.out.println("Maximum Temperature reached");
            }

        } else {
            System.out.println("Refrigerator is OFF. Turn it ON first.");
        }
    }

    // Decrease Temperature
    static void decreaseTemperature(){

        System.out.println("Decrease Temperature invoked..");

        if(isConnected == true){

            if(currentTemperature > minTemperature){
                currentTemperature--;
                System.out.println("Current Temperature: " + currentTemperature);
            } else {
                System.out.println("Minimum Temperature reached");
            }

        } else {
            System.out.println("Refrigerator is OFF. Turn it ON first.");
        }
    }
}
