class SoundBarExecutor {

    public static void main(String[] args){

        int price = SoundBar.getPrice();
        String model = SoundBar.getModelName();
        String type = SoundBar.getSpeakerType();
        String colour = SoundBar.getColour();
        String wattage = SoundBar.getAudioWattage();
        String connectivity = SoundBar.getConnectivity();
        String mount = SoundBar.getMountingType();
        String power = SoundBar.getPowerSource();
        String battery = SoundBar.getBatteryType();
        String charging = SoundBar.getChargingTime();
        String range = SoundBar.getMaximumRange();
        String dimensions = SoundBar.getDimensions();
        double weight = SoundBar.getItemWeight();
        String features = SoundBar.getSpecialFeatures();
        String country = SoundBar.getCountryOfOrigin();

        System.out.println("The price of this soundbar is Rs. " + price + ".");
        System.out.println("The model name of this soundbar is " + model + ".");
        System.out.println("The speaker type of this device is " + type + ".");
        System.out.println("The colour variant of this soundbar is " + colour + ".");
        System.out.println("The total audio output power of this soundbar is " + wattage + ".");
        System.out.println("The connectivity technology supported by this soundbar is " + connectivity + ".");
        System.out.println("The mounting type supported by this soundbar is " + mount + ".");
        System.out.println("The power source of this soundbar is " + power + ".");
        System.out.println("The battery type used in this soundbar is " + battery + ".");
        System.out.println("The charging time of this soundbar is " + charging + ".");
        System.out.println("The maximum wireless range of this soundbar is " + range + ".");
        System.out.println("The dimensions of this soundbar are " + dimensions + ".");
        System.out.println("The weight of this soundbar is " + weight + " grams.");
        System.out.println("The special features of this soundbar include " + features + ".");
        System.out.println("The country of origin of this soundbar is " + country + ".");
    }
}
