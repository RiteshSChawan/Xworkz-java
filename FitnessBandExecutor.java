class FitnessBandExecutor {

    public static void main(String[] args){

        String brand = FitnessBand.getBrand();
        int price = FitnessBand.getPrice();
        String model = FitnessBand.getModel();
        String name = FitnessBand.getModelName();
        String os = FitnessBand.getOperatingSystem();
        String display = FitnessBand.getDisplayType();
        double screen = FitnessBand.getScreenSize();
        String batteryLife = FitnessBand.getBatteryLife();
        String charging = FitnessBand.getChargingTime();
        int capacity = FitnessBand.getBatteryCapacity();
        String wireless = FitnessBand.getWirelessType();
        String features = FitnessBand.getSpecialFeatures();
        String dimensions = FitnessBand.getDimensions();
        double weight = FitnessBand.getItemWeight();
        String country = FitnessBand.getCountryOfOrigin();

        System.out.println("The brand of this smartwatch is " + brand + ".");
        System.out.println("The price of this smartwatch is Rs. " + price + ".");
        System.out.println("The model number of this smartwatch is " + model + ".");
        System.out.println("The model name of this smartwatch is " + name + ".");
        System.out.println("The operating system of this smartwatch is " + os + ".");
        System.out.println("The display type of this smartwatch is " + display + ".");
        System.out.println("The screen size of this smartwatch is " + screen + " inches.");
        System.out.println("The battery life of this smartwatch is " + batteryLife + ".");
        System.out.println("The charging time of this smartwatch is " + charging + ".");
        System.out.println("The battery capacity of this smartwatch is " + capacity + " mAh.");
        System.out.println("The wireless connectivity type of this smartwatch is " + wireless + ".");
        System.out.println("The special features of this smartwatch include " + features + ".");
        System.out.println("The dimensions of this smartwatch are " + dimensions + ".");
        System.out.println("The weight of this smartwatch is " + weight + " grams.");
        System.out.println("The country of origin of this smartwatch is " + country + ".");
    }
}
