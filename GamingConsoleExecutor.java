class GamingConsoleExecutor {

    public static void main(String[] args){

        String brand = GamingConsole.getBrand();
        double price = GamingConsole.getPrice();
        String manufacturer = GamingConsole.getManufacturer();
        String colour = GamingConsole.getColour();
        int height = GamingConsole.getItemHeight();
        double width = GamingConsole.getItemWidth();
        String dimensions = GamingConsole.getDimensions();
        double weight = GamingConsole.getItemWeight();
        String model = GamingConsole.getModelNumber();
        String power = GamingConsole.getPowerSource();
        String platform = GamingConsole.getHardwarePlatform();
        String components = GamingConsole.getIncludedComponents();

        System.out.println("The details of the gaming console are as follows.");
        System.out.println("The brand of the gaming console is " + brand + ".");
        System.out.println("The price of the gaming console is Rs. " + price + ".");
        System.out.println("The manufacturer of the gaming console is " + manufacturer + ".");
        System.out.println("The colour of the gaming console is " + colour + ".");
        System.out.println("The height of the gaming console is " + height + " mm.");
        System.out.println("The width of the gaming console is " + width + " cm.");
        System.out.println("The dimensions of the gaming console are " + dimensions + ".");
        System.out.println("The weight of the gaming console is " + weight + " grams.");
        System.out.println("The model number of the gaming console is " + model + ".");
        System.out.println("The power source of the gaming console is " + power + ".");
        System.out.println("The hardware platform of the gaming console is " + platform + ".");
        System.out.println("The included components with the gaming console are " + components + ".");
    }
}
