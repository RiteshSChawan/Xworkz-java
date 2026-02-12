class BlackpoolVRExecutor {

    public static void main(String[] args){

        String brand = BlackpoolVR.getBrand();
        int price = BlackpoolVR.getPrice();
        String model = BlackpoolVR.getModel();
        String dimensions = BlackpoolVR.getDimensions();
        double weight = BlackpoolVR.getItemWeight();
        String os = BlackpoolVR.getOperatingSystem();
        String resolution = BlackpoolVR.getResolution();
        String display = BlackpoolVR.getDisplayType();
        String wireless = BlackpoolVR.getWirelessType();
        String connector = BlackpoolVR.getConnectorType();
        String devices = BlackpoolVR.getCompatibleDevices();
        String features = BlackpoolVR.getSpecialFeatures();
        String country = BlackpoolVR.getCountryOfOrigin();

        System.out.println("The brand of this VR headset is " + brand + ".");
        System.out.println("The price of this VR headset is Rs. " + price + ".");
        System.out.println("The model name of this VR headset is " + model + ".");
        System.out.println("The package dimensions of this VR headset are " + dimensions + ".");
        System.out.println("The weight of this VR headset is " + weight + " grams.");
        System.out.println("The operating system of this VR headset is " + os + ".");
        System.out.println("The screen resolution of this VR headset is " + resolution + ".");
        System.out.println("The display type used in this VR headset is " + display + ".");
        System.out.println("The wireless technology supported by this VR headset is " + wireless + ".");
        System.out.println("The connector type used in this VR headset is " + connector + ".");
        System.out.println("The compatible devices for this VR headset are " + devices + ".");
        System.out.println("The special features of this VR headset include " + features + ".");
        System.out.println("The country of origin of this VR headset is " + country + ".");
    }
}
