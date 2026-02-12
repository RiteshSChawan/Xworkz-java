class ACExecutor {

    public static void main(String[] args){

        String brand = AC.getBrand();
        int price = AC.getPrice();
        String model = AC.getModel();
        String energy = AC.getEnergyEfficiency();
        String capacity = AC.getCapacity();
        String annual = AC.getAnnualEnergyConsumption();
        String noise = AC.getNoiseLevel();
        String installation = AC.getInstallationType();
        String features = AC.getSpecialFeatures();
        String colour = AC.getColour();
        String voltage = AC.getVoltage();
        String wattage = AC.getWattage();
        String components = AC.getIncludedComponents();
        String form = AC.getFormFactor();
        String country = AC.getCountryOfOrigin();

        System.out.println("The brand of this air conditioner is " + brand + ".");
        System.out.println("The price of this air conditioner is Rs. " + price + ".");
        System.out.println("The model number of this air conditioner is " + model + ".");
        System.out.println("The energy efficiency rating of this air conditioner is " + energy + ".");
        System.out.println("The cooling capacity of this air conditioner is " + capacity + ".");
        System.out.println("The annual energy consumption of this air conditioner is " + annual + ".");
        System.out.println("The noise level of this air conditioner is " + noise + ".");
        System.out.println("The installation type of this air conditioner is " + installation + ".");
        System.out.println("The special feature of this air conditioner is " + features + ".");
        System.out.println("The colour of this air conditioner is " + colour + ".");
        System.out.println("The operating voltage of this air conditioner is " + voltage + ".");
        System.out.println("The power consumption of this air conditioner is " + wattage + ".");
        System.out.println("The included components with this air conditioner are " + components + ".");
        System.out.println("The form factor of this air conditioner is " + form + ".");
        System.out.println("The country of origin of this air conditioner is " + country + ".");
    }
}
