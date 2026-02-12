class DishwasherExecutor {

    public static void main(String[] args){

        int price = Dishwasher.getPrice();
        String model = Dishwasher.getModelName();
        String colour = Dishwasher.getColour();
        String control = Dishwasher.getControlType();
        String material = Dishwasher.getMaterial();
        String noise = Dishwasher.getNoiseLevel();
        String form = Dishwasher.getFormFactor();
        double weight = Dishwasher.getItemWeight();
        String voltage = Dishwasher.getVoltage();
        String energy = Dishwasher.getEnergyConsumption();
        int settings = Dishwasher.getNumberOfSettings();
        String water = Dishwasher.getWaterConsumption();
        String annual = Dishwasher.getAnnualEnergyConsumption();
        String display = Dishwasher.getDisplayType();
        String country = Dishwasher.getCountryOfOrigin();

        System.out.println("The price of this dishwasher is Rs. " + price + ".");
        System.out.println("The model name of this dishwasher is " + model + ".");
        System.out.println("The colour of this dishwasher is " + colour + ".");
        System.out.println("The control type of this dishwasher is " + control + ".");
        System.out.println("The materials used in this dishwasher are " + material + ".");
        System.out.println("The noise level of this dishwasher is " + noise + ".");
        System.out.println("The form factor of this dishwasher is " + form + ".");
        System.out.println("The weight of this dishwasher is " + weight + " grams.");
        System.out.println("The operating voltage of this dishwasher is " + voltage + ".");
        System.out.println("The energy consumption of this dishwasher is " + energy + ".");
        System.out.println("The number of wash settings available in this dishwasher is " + settings + ".");
        System.out.println("The water consumption of this dishwasher is " + water + ".");
        System.out.println("The annual energy consumption of this dishwasher is " + annual + ".");
        System.out.println("The display type of this dishwasher is " + display + ".");
        System.out.println("The country of origin of this dishwasher is " + country + ".");
    }
}
