class SmartWatchExecutor {

    public static void main(String[] args){

        double price = SmartWatch.getPrice();
        String brand = SmartWatch.getBrand();
        String manufacturer = SmartWatch.getManufacturer();
        String series = SmartWatch.getSeries();
        String colour = SmartWatch.getColour();
        double height = SmartWatch.getItemHeight();
        double width = SmartWatch.getItemWidth();
        double screenSize = SmartWatch.getScreenSize();
        String modelNumber = SmartWatch.getItemModelNumber();
        int watts = SmartWatch.getWattage();
        String os = SmartWatch.getOS();
        int chargeTime = SmartWatch.getBatteryChargeTime();
        String battery = SmartWatch.getAverageBatteryLife();
        int lithiumCells = SmartWatch.getNumberOfLithiumCells();
        String connectivity = SmartWatch.getConnectivity();
        String country = SmartWatch.getCountryOfOrigin();
        double weight = SmartWatch.getItemWeight();

        System.out.println("The details of the smartwatch are as follows.");
        System.out.println("The price of the smartwatch is Rs. " + price + ".");
        System.out.println("The brand of the smartwatch is " + brand + ".");
        System.out.println("The manufacturer of the smartwatch is " + manufacturer + ".");
        System.out.println("The series of the smartwatch is " + series + ".");
        System.out.println("The colour of the smartwatch is " + colour + ".");
        System.out.println("The height of the smartwatch is " + height + " cm.");
        System.out.println("The width of the smartwatch is " + width + " cm.");
        System.out.println("The screen size of the smartwatch is " + screenSize + " inches.");
        System.out.println("The model number of the smartwatch is " + modelNumber + ".");
        System.out.println("The power consumption of the smartwatch is " + watts + " watts.");
        System.out.println("The operating system of the smartwatch is " + os + ".");
        System.out.println("The charging time of the smartwatch is " + chargeTime + " hours.");
        System.out.println("The average battery life of the smartwatch is " + battery + " days.");
        System.out.println("The number of lithium cells in the smartwatch is " + lithiumCells + ".");
        System.out.println("The connectivity options available in the smartwatch are " + connectivity + ".");
        System.out.println("The country of origin of the smartwatch is " + country + ".");
        System.out.println("The weight of the smartwatch is " + weight + " grams.");
    }
}
