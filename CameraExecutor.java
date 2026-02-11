class CameraExecutor {

    public static void main(String[] args) {

        boolean ref = Camera.onOrOff();
        System.out.println("Camera status: " + ref);

        boolean ref1 = Camera.onOrOff();
        System.out.println("Camera status: " + ref1);
    }
}
