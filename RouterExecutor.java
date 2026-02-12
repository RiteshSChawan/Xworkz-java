class RouterExecutor {

    public static void main(String[] args){

        String brand = Router.getBrand();
        double price = Router.getPrice();
        String series = Router.getSeries();
        String manufacturer = Router.getManufacturer();
        String colour = Router.getColour();
        int height = Router.getItemHeight();
        int width = Router.getItemWidth();
        String dimensions = Router.getDimensions();
        double weight = Router.getItemWeight();
        String connectivity = Router.getConnectivityType();
        String wireless = Router.getWirelessType();
        int ports = Router.getEthernetPorts();
        String voltage = Router.getVoltage();
        String os = Router.getOperatingSystem();
        String country = Router.getCountryOfOrigin();
        String components = Router.getIncludedComponents();

        System.out.println("The details of the router are as follows.");
        System.out.println("The brand of the router is " + brand + ".");
        System.out.println("The price of the router is Rs. " + price + ".");
        System.out.println("The series of the router is " + series + ".");
        System.out.println("The manufacturer of the router is " + manufacturer + ".");
        System.out.println("The colour of the router is " + colour + ".");
        System.out.println("The height of the router is " + height + " mm.");
        System.out.println("The width of the router is " + width + " cm.");
        System.out.println("The dimensions of the router are " + dimensions + ".");
        System.out.println("The weight of the router is " + weight + " grams.");
        System.out.println("The connectivity type supported by the router is " + connectivity + ".");
        System.out.println("The wireless type supported by the router is " + wireless + ".");
        System.out.println("The number of Ethernet ports available in the router is " + ports + ".");
        System.out.println("The operating voltage of the router is " + voltage + ".");
        System.out.println("The operating system supported by the router is " + os + ".");
        System.out.println("The country of origin of the router is " + country + ".");
        System.out.println("The included components with the router are " + components + ".");
    }
}
