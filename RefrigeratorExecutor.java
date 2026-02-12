class RefrigeratorExecutor {

    public static void main(String[] args){

        String brand = Refrigerator.getBrand();
        int price = Refrigerator.getPrice();
        String model = Refrigerator.getModel();
        String capacity = Refrigerator.getCapacity();
        String fresh = Refrigerator.getFreshFoodCapacity();
        String freezer = Refrigerator.getFreezerCapacity();
        String install = Refrigerator.getInstallationType();
        String form = Refrigerator.getFormFactor();
        String features = Refrigerator.getSpecialFeatures();
        String colour = Refrigerator.getColour();
        String voltage = Refrigerator.getVoltage();
        String defrost = Refrigerator.getDefrostSystem();
        int shelves = Refrigerator.getNumberOfShelves();
        String shelfType = Refrigerator.getShelfType();
        String country = Refrigerator.getCountryOfOrigin();

        System.out.println("The brand of this refrigerator is " + brand + ".");
        System.out.println("The price of this refrigerator is Rs. " + price + ".");
        System.out.println("The model name of this refrigerator is " + model + ".");
        System.out.println("The total capacity of this refrigerator is " + capacity + ".");
        System.out.println("The fresh food capacity of this refrigerator is " + fresh + ".");
        System.out.println("The freezer capacity of this refrigerator is " + freezer + ".");
        System.out.println("The installation type of this refrigerator is " + install + ".");
        System.out.println("The form factor of this refrigerator is " + form + ".");
        System.out.println("The special feature of this refrigerator is " + features + ".");
        System.out.println("The colour of this refrigerator is " + colour + ".");
        System.out.println("The operating voltage of this refrigerator is " + voltage + ".");
        System.out.println("The defrost system used in this refrigerator is " + defrost + ".");
        System.out.println("The number of shelves available in this refrigerator is " + shelves + ".");
        System.out.println("The shelf type used in this refrigerator is " + shelfType + ".");
        System.out.println("The country of origin of this refrigerator is " + country + ".");
    }
}
