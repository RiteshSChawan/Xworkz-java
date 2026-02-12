class InductionCooktopExecutor {

    public static void main(String[] args){

        int price = InductionCooktop.getPrice();
        String manufacturer = InductionCooktop.getManufacturer();
        String model = InductionCooktop.getModelNumber();
        String asin = InductionCooktop.getASIN();
        String country = InductionCooktop.getCountryOfOrigin();

        System.out.println("The price of this appliance is Rs. " + price + ".");
        System.out.println("The manufacturer of this appliance is " + manufacturer + ".");
        System.out.println("The model number of this appliance is " + model + ".");
        System.out.println("The ASIN number of this appliance is " + asin + ".");
        System.out.println("The country of origin of this appliance is " + country + ".");
    }
}
