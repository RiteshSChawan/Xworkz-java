class Camera {

    static boolean isConnected;

    static int currentZoom;
    static int maxZoom = 5;
    static int minZoom = 0;

    // ON / OFF
    static boolean onOrOff() {

        if(isConnected == false){
            isConnected = true;
            System.out.println("Camera is turned ON..");
        } else {
            isConnected = false;
            System.out.println("Camera is turned OFF..");
        }

        return isConnected;
    }

    // Zoom In
    static void zoomIn(){

        System.out.println("Zoom In is invoked..");

        if(isConnected == true){

            if(currentZoom < maxZoom){
                currentZoom = currentZoom + 1;
                System.out.println("Current Zoom Level: " + currentZoom);
            } else {
                System.out.println("Maximum Zoom level reached");
            }

        } else {
            System.out.println("Camera is OFF. Turn it ON first.");
        }
    }

    // Zoom Out
    static void zoomOut(){

        System.out.println("Zoom Out is invoked..");

        if(isConnected == true){

            if(currentZoom > minZoom){
                currentZoom = currentZoom - 1;
                System.out.println("Current Zoom Level: " + currentZoom);
            } else {
                System.out.println("Minimum Zoom level reached");
            }

        } else {
            System.out.println("Camera is OFF. Turn it ON first.");
        }
    }
}
