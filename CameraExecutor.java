class CameraExecutor {

    public static void main(String[] args) {

        boolean ref = Camera.onOrOff();
        System.out.println("Camera status: " + ref);

        Camera.zoomIn();
        Camera.zoomIn();
        Camera.zoomIn();
        Camera.zoomOut();
        Camera.zoomOut();
        Camera.zoomIn();

        ref = Camera.onOrOff();
        System.out.println("Camera status: " + ref);
    }
}
