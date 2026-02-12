class PhoneExecutor {

    public static void main(String[] args){

        int price = Phone.getPrice();
        String model = Phone.getModelNumber();
        String os = Phone.getOperatingSystem();
        String ram = Phone.getRAM();
        String resolution = Phone.getResolution();
        String form = Phone.getFormFactor();
        String colour = Phone.getColour();
        int battery = Phone.getBatteryCapacity();
        String connectivity = Phone.getConnectivity();
        boolean gps = Phone.hasGPS();
        String features = Phone.getSpecialFeatures();
        String dimensions = Phone.getDimensions();
        double weight = Phone.getItemWeight();
        String manufacturer = Phone.getManufacturer();
        String country = Phone.getCountryOfOrigin();

        System.out.println("The price of this smartphone is Rs. " + price + ".");
        System.out.println("The model number of this smartphone is " + model + ".");
        System.out.println("The operating system of this smartphone is " + os + ".");
        System.out.println("The RAM of this smartphone is " + ram + ".");
        System.out.println("The screen resolution of this smartphone is " + resolution + ".");
        System.out.println("The form factor of this device is " + form + ".");
        System.out.println("The colour of this smartphone is " + colour + ".");
        System.out.println("The battery capacity of this smartphone is " + battery + " mAh.");
        System.out.println("The connectivity technologies supported by this smartphone are " + connectivity + ".");
        System.out.println("Does this smartphone support GPS? " + gps + ".");
        System.out.println("The special features of this smartphone include " + features + ".");
        System.out.println("The dimensions of this smartphone are " + dimensions + ".");
        System.out.println("The weight of this smartphone is " + weight + " grams.");
        System.out.println("The manufacturer of this smartphone is " + manufacturer + ".");
        System.out.println("The country of origin of this smartphone is " + country + ".");
    }
}
