class HeadphonesExecutor {

    public static void main(String[] args){

        int price = Headphones.getPrice();
        String model = Headphones.getModel();
        String name = Headphones.getModelName();
        String connectivity = Headphones.getConnectivity();
        String version = Headphones.getBluetoothVersion();
        String battery = Headphones.getBatteryLife();
        String charging = Headphones.getChargingTime();
        String driver = Headphones.getDriverSize();
        String frequency = Headphones.getFrequencyResponse();
        String sensitivity = Headphones.getSensitivity();
        String noise = Headphones.getNoiseControl();
        String water = Headphones.getWaterResistance();
        String control = Headphones.getControlType();
        double weight = Headphones.getItemWeight();
        String country = Headphones.getCountryOfOrigin();

        System.out.println("The price of these headphones is Rs. " + price + ".");
        System.out.println("The model number of these headphones is " + model + ".");
        System.out.println("The model name of these headphones is " + name + ".");
        System.out.println("The connectivity technology supported by these headphones is " + connectivity + ".");
        System.out.println("The Bluetooth version supported by these headphones is " + version + ".");
        System.out.println("The battery life of these headphones is " + battery + ".");
        System.out.println("The charging time of these headphones is " + charging + ".");
        System.out.println("The audio driver size of these headphones is " + driver + ".");
        System.out.println("The frequency response of these headphones is " + frequency + ".");
        System.out.println("The sensitivity of these headphones is " + sensitivity + ".");
        System.out.println("The noise control feature of these headphones is " + noise + ".");
        System.out.println("The water resistance level of these headphones is " + water + ".");
        System.out.println("The control type of these headphones is " + control + ".");
        System.out.println("The weight of these headphones is " + weight + " grams.");
        System.out.println("The country of origin of these headphones is " + country + ".");
    }
}
