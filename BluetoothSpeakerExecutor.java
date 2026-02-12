class BluetoothSpeakerExecutor {

    public static void main(String[] args){

        String model = BluetoothSpeaker.getModelName();
        double price = BluetoothSpeaker.getPrice();
        String mounting = BluetoothSpeaker.getMountingType();
        String type = BluetoothSpeaker.getSpeakerType();
        String colour = BluetoothSpeaker.getColour();
        double weight = BluetoothSpeaker.getItemWeight();
        String dimension = BluetoothSpeaker.getDimensions();
        int wattage = BluetoothSpeaker.getWattage();
        String wireless = BluetoothSpeaker.getWirelessTechnology();
        String waterResistant = BluetoothSpeaker.getWaterResistance();
        String batteryLife = BluetoothSpeaker.getBatteryLife();
        String power = BluetoothSpeaker.getPowerSource();
        String control = BluetoothSpeaker.getControlMethod();
        String manufacturer = BluetoothSpeaker.getManufacturer();
        String country = BluetoothSpeaker.getCountryOfOrigin();
        int speakerSize = BluetoothSpeaker.getSpeakerSize();

        System.out.println("The details of the Bluetooth speaker are as follows.");
        System.out.println("The model name of the speaker is " + model + ".");
        System.out.println("The price of the speaker is Rs. " + price + ".");
        System.out.println("The mounting type of the speaker is " + mounting + ".");
        System.out.println("The speaker type is " + type + ".");
        System.out.println("The colour of the speaker is " + colour + ".");
        System.out.println("The weight of the speaker is " + weight + " grams.");
        System.out.println("The dimensions of the speaker are " + dimension + ".");
        System.out.println("The wattage of the speaker is " + wattage + " watts.");
        System.out.println("The wireless technology supported by the speaker is " + wireless + ".");
        System.out.println("The water resistance level of the speaker is " + waterResistant + ".");
        System.out.println("The battery life of the speaker is " + batteryLife + ".");
        System.out.println("The power source of the speaker is " + power + ".");
        System.out.println("The control method used in the speaker is " + control + ".");
        System.out.println("The manufacturer of the speaker is " + manufacturer + ".");
        System.out.println("The country of origin of the speaker is " + country + ".");
        System.out.println("The speaker size is " + speakerSize + " cm.");
    }
}
