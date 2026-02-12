class MixerExecutor {

    public static void main(String[] args){

        String brand = Mixer.getBrand();
        int price = Mixer.getPrice();
        String model = Mixer.getModelName();
        String colour = Mixer.getColour();
        String dimensions = Mixer.getDimensions();
        String feature = Mixer.getSpecialFeature();
        String capacity = Mixer.getCapacity();
        String control = Mixer.getControlType();
        String safe = Mixer.getDishwasherSafe();
        String modelNumber = Mixer.getModelNumber();
        String country = Mixer.getCountryOfOrigin();

        System.out.println("The brand of this mixer grinder is " + brand + ".");
        System.out.println("The price of this mixer grinder is Rs. " + price + ".");
        System.out.println("The model name of this mixer grinder is " + model + ".");
        System.out.println("The colour of this mixer grinder is " + colour + ".");
        System.out.println("The dimensions of this mixer grinder are " + dimensions + ".");
        System.out.println("The special feature of this mixer grinder is " + feature + ".");
        System.out.println("The capacity of this mixer grinder is " + capacity + ".");
        System.out.println("The control type of this mixer grinder is " + control + ".");
        System.out.println("Is this mixer grinder dishwasher safe? " + safe + ".");
        System.out.println("The model number of this mixer grinder is " + modelNumber + ".");
        System.out.println("The country of origin of this mixer grinder is " + country + ".");
    }
}
