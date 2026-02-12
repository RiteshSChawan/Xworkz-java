class TabletExecutor {
    public static void main(String[] args){

        double price = Tablet.getPrice();
        String brand = Tablet.getBrand();
        String manufacturer = Tablet.getManufacturer();
        String series = Tablet.getSeries();
        String colour = Tablet.getColour();
        String resolution = Tablet.getResolution();
        String dimension = Tablet.getDimension();
        double screenSize = Tablet.getScreenSize();
        String modelNumber = Tablet.getItemModelNumber();
        String webcamResolution = Tablet.getWebcamResolution();
        String os = Tablet.getOS();
        String battery = Tablet.getAverageBatteryLife();
        int lithiumCells = Tablet.getNumberOfLithiumCells();
        String connectivity = Tablet.getConnectivity();
        String country = Tablet.getCountryOfOrigin();
        double weight = Tablet.getItemWeight();

        System.out.println("The details of the tablet are as follows.");
        System.out.println("The price of the tablet is Rs. " + price + ".");
        System.out.println("The brand of the tablet is " + brand + ".");
        System.out.println("The manufacturer of the tablet is " + manufacturer + ".");
        System.out.println("The series of the tablet is " + series + ".");
        System.out.println("The colour of the tablet is " + colour + ".");
        System.out.println("The screen resolution of the tablet is " + resolution + ".");
        System.out.println("The package dimensions of the tablet are " + dimension + ".");
        System.out.println("The screen size of the tablet is " + screenSize + " inches.");
        System.out.println("The model number of the tablet is " + modelNumber + ".");
        System.out.println("The front webcam resolution of the tablet is " + webcamResolution + ".");
        System.out.println("The operating system of the tablet is " + os + ".");
        System.out.println("The average battery life of the tablet is " + battery + " hours.");
        System.out.println("The number of lithium cells in the tablet is " + lithiumCells + ".");
        System.out.println("The connectivity options available in the tablet are " + connectivity + ".");
        System.out.println("The country of origin of the tablet is " + country + ".");
        System.out.println("The weight of the tablet is " + weight + " grams.");
    }
}
