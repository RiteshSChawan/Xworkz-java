class BulbExecutor {

    public static void main(String[] args){

        String brand = Bulb.getBrand();
        int price = Bulb.getPrice();
        String model = Bulb.getModelName();
        String type = Bulb.getLightType();
        int wattage = Bulb.getWattage();
        String base = Bulb.getBulbBase();
        String colour = Bulb.getLightColour();
        int brightness = Bulb.getBrightness();
        String voltage = Bulb.getVoltage();
        String material = Bulb.getMaterial();
        String control = Bulb.getControlMethod();
        int life = Bulb.getAverageLife();
        String power = Bulb.getPowerSource();
        String style = Bulb.getStyle();
        String country = Bulb.getCountryOfOrigin();

        System.out.println("The brand of this smart bulb is " + brand + ".");
        System.out.println("The price of this smart bulb is Rs. " + price + ".");
        System.out.println("The model number of this smart bulb is " + model + ".");
        System.out.println("The light type of this bulb is " + type + ".");
        System.out.println("The wattage of this bulb is " + wattage + " watts.");
        System.out.println("The bulb base type is " + base + ".");
        System.out.println("The light colour of this bulb is " + colour + ".");
        System.out.println("The maximum brightness of this bulb is " + brightness + " lumens.");
        System.out.println("The operating voltage of this bulb is " + voltage + ".");
        System.out.println("The material used in this bulb is " + material + ".");
        System.out.println("The control method supported by this bulb is " + control + ".");
        System.out.println("The average life of this bulb is " + life + " hours.");
        System.out.println("The power source of this bulb is " + power + ".");
        System.out.println("The style of this bulb is " + style + ".");
        System.out.println("The country of origin of this bulb is " + country + ".");
    }
}
