class Camera {

    static boolean isConnected;

    static boolean onOrOff() {

        if(isConnected==false){
            isConnected = true;
            System.out.println("Camera is turned ON..");
        } else if(isConnected == true) {
            isConnected = false;
            System.out.println("Camera is turned OFF..");
        }

        return isConnected;
    }
}
