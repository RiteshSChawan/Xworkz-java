class PowerBankExecutor {

    public static void main(String[] args){

        int price = PowerBank.getPrice();
        String dimensions = PowerBank.getDimensions();
        double weight = PowerBank.getItemWeight();
        String battery = PowerBank.getBatteryType();
        String features = PowerBank.getSpecialFeatures();
        String display = PowerBank.getDisplayFeatures();
        String colour = PowerBank.getColour();
        int batteryPower = PowerBank.getBatteryPowerRating();
        String manufacturer = PowerBank.getManufacturer();
        String country = PowerBank.getCountryOfOrigin();

        System.out.println("The price of this device is Rs. " + price + ".");
        System.out.println("The package dimensions of this device are " + dimensions + ".");
        System.out.println("The weight of this device is " + weight + " grams.");
        System.out.println("This device requires " + battery + ".");
        System.out.println("The special features of this device include " + features + ".");
        System.out.println("The display feature of this device is " + display + ".");
        System.out.println("The colour of this device is " + colour + ".");
        System.out.println("The battery power rating of this device is " + batteryPower + " mAh.");
        System.out.println("The manufacturer of this device is " + manufacturer + ".");
        System.out.println("The country of origin of this device is " + country + ".");
    }
}
