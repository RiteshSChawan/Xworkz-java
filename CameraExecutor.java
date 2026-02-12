class CameraExecutor {

    public static void main(String[] args){

        String brand = Camera.getBrand();
        int price = Camera.getPrice();
        String model = Camera.getModel();
        String modelName = Camera.getModelName();
        String resolution = Camera.getResolution();
        String video = Camera.getVideoResolution();
        String display = Camera.getDisplayType();
        double screen = Camera.getScreenSize();
        String stabilization = Camera.getImageStabilization();
        String zoom = Camera.getOpticalZoom();
        String battery = Camera.getBatteryType();
        String connectivity = Camera.getConnectivity();
        String form = Camera.getFormFactor();
        String shooting = Camera.getContinuousShooting();
        double weight = Camera.getItemWeight();
        String country = Camera.getCountryOfOrigin();

        System.out.println("The brand of this camera is " + brand + ".");
        System.out.println("The price of this camera is Rs. " + price + ".");
        System.out.println("The model number of this camera is " + model + ".");
        System.out.println("The model name of this camera is " + modelName + ".");
        System.out.println("The image resolution of this camera is " + resolution + ".");
        System.out.println("The video capture resolution of this camera is " + video + ".");
        System.out.println("The display type of this camera is " + display + ".");
        System.out.println("The screen size of this camera is " + screen + " inches.");
        System.out.println("The image stabilization technology used in this camera is " + stabilization + ".");
        System.out.println("The optical zoom of this camera is " + zoom + ".");
        System.out.println("The battery type used in this camera is " + battery + ".");
        System.out.println("The connectivity options available in this camera are " + connectivity + ".");
        System.out.println("The form factor of this camera is " + form + ".");
        System.out.println("The continuous shooting speed of this camera is " + shooting + ".");
        System.out.println("The weight of this camera is " + weight + " grams.");
        System.out.println("The country of origin of this camera is " + country + ".");
    }
}
