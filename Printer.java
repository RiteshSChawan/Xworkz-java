class Printer {

    static boolean isConnected;

    static int printCount;
    static int maxPrint = 5;

    static boolean onOrOff() {

        if(isConnected == false){
            isConnected = true;
            System.out.println("Printer is turned ON..");
        } else {
            isConnected = false;
            System.out.println("Printer is turned OFF..");
        }

        return isConnected;
    }

    // Print Document
    static void printDocument(){

        System.out.println("Print Document invoked..");

        if(isConnected == true){

            if(printCount < maxPrint){
                printCount++;
                System.out.println("Printing document... Total prints: " + printCount);
            } else {
                System.out.println("Print limit reached");
            }

        } else {
            System.out.println("Printer is OFF. Turn it ON first.");
        }
    }
}
