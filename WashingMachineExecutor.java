class WashingMachineExecutor {

    public static void main(String[] args){

        int price = WashingMachine.getPrice();
        String model = WashingMachine.getModel();
        String energy = WashingMachine.getEnergyEfficiency();
        String mode = WashingMachine.getOperationMode();
        String installation = WashingMachine.getInstallationType();
        String wattage = WashingMachine.getWattage();
        int wash = WashingMachine.getNumberOfWashCycles();
        int dry = WashingMachine.getNumberOfDryCycles();
        String noise = WashingMachine.getNoiseLevel();
        String drum = WashingMachine.getDrumMaterial();
        String features = WashingMachine.getSpecialFeatures();
        String form = WashingMachine.getFormFactor();
        String connector = WashingMachine.getConnectorType();
        double weight = WashingMachine.getItemWeight();
        String country = WashingMachine.getCountryOfOrigin();

        System.out.println("The price of this washing machine is Rs. " + price + ".");
        System.out.println("The model number of this washing machine is " + model + ".");
        System.out.println("The energy efficiency rating of this washing machine is " + energy + ".");
        System.out.println("The operation mode of this washing machine is " + mode + ".");
        System.out.println("The installation type of this washing machine is " + installation + ".");
        System.out.println("The power consumption of this washing machine is " + wattage + ".");
        System.out.println("The number of washing cycles available in this washing machine is " + wash + ".");
        System.out.println("The number of drying cycles available in this washing machine is " + dry + ".");
        System.out.println("The noise level of this washing machine is " + noise + ".");
        System.out.println("The drum material of this washing machine is " + drum + ".");
        System.out.println("The special features of this washing machine include " + features + ".");
        System.out.println("The form factor of this washing machine is " + form + ".");
        System.out.println("The connector type of this washing machine is " + connector + ".");
        System.out.println("The weight of this washing machine is " + weight + " kg.");
        System.out.println("The country of origin of this washing machine is " + country + ".");
    }
}
