class EarbudsExecutor {

    public static void main(String[] args){

        int price = Earbuds.getPrice();
        String model = Earbuds.getModelName();
        String connectivity = Earbuds.getConnectivity();
        String jack = Earbuds.getHeadphoneJack();
        String control = Earbuds.getControlType();
        String battery = Earbuds.getBatteryLife();
        String version = Earbuds.getBluetoothVersion();
        String range = Earbuds.getBluetoothRange();
        String driver = Earbuds.getDriverType();
        String water = Earbuds.getWaterResistance();
        String charging = Earbuds.getChargingTime();
        String material = Earbuds.getMaterial();
        double weight = Earbuds.getItemWeight();
        String features = Earbuds.getSpecialFeatures();
        String country = Earbuds.getCountryOfOrigin();

        System.out.println("The price of these earbuds is Rs. " + price + ".");
        System.out.println("The model name of these earbuds is " + model + ".");
        System.out.println("The connectivity technology used in these earbuds is " + connectivity + ".");
        System.out.println("These earbuds support a headphone jack of type " + jack + ".");
        System.out.println("The control type of these earbuds includes " + control + ".");
        System.out.println("The total battery life of these earbuds is " + battery + ".");
        System.out.println("The Bluetooth version supported by these earbuds is " + version + ".");
        System.out.println("The Bluetooth range of these earbuds is " + range + ".");
        System.out.println("The audio driver type used in these earbuds is " + driver + ".");
        System.out.println("The water resistance level of these earbuds is " + water + ".");
        System.out.println("The charging time of these earbuds is " + charging + ".");
        System.out.println("The material used in these earbuds is " + material + ".");
        System.out.println("The weight of these earbuds is " + weight + " grams.");
        System.out.println("The special features of these earbuds include " + features + ".");
        System.out.println("The country of origin of these earbuds is " + country + ".");
    }
}
