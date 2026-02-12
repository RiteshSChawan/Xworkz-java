class MonitorExecutor {

    public static void main(String[] args){

        String brand = Monitor.getBrand();
        int price = Monitor.getPrice();
        String series = Monitor.getSeries();
        String colour = Monitor.getColour();
        double height = Monitor.getItemHeight();
        double width = Monitor.getItemWidth();
        double screenSize = Monitor.getScreenSize();
        String resolution = Monitor.getResolution();
        String dimensions = Monitor.getDimensions();
        double weight = Monitor.getItemWeight();
        String socket = Monitor.getProcessorSocket();
        String memory = Monitor.getMemoryTechnology();
        int hdmi = Monitor.getHDMIPorts();
        String components = Monitor.getIncludedComponents();
        String country = Monitor.getCountryOfOrigin();

        System.out.println("The brand of this Monitor is " + brand + ".");
        System.out.println("The price of this Monitor is Rs. " + price + ".");
        System.out.println("The series of this Monitor is " + series + ".");
        System.out.println("The colour of this Monitor is " + colour + ".");
        System.out.println("The height of this Monitor is " + height + " cm.");
        System.out.println("The width of this Monitor is " + width + " cm.");
        System.out.println("The screen size of this Monitor is " + screenSize + " cm.");
        System.out.println("The screen resolution of this Monitor is " + resolution + ".");
        System.out.println("The dimensions of this Monitor are " + dimensions + ".");
        System.out.println("The weight of this Monitor is " + weight + " kg.");
        System.out.println("The processor socket of this Monitor is " + socket + ".");
        System.out.println("The memory technology used in this Monitor is " + memory + ".");
        System.out.println("The number of HDMI ports in this Monitor is " + hdmi + ".");
        System.out.println("The included components with this Monitor are " + components + ".");
        System.out.println("The country of origin of this Monitor is " + country + ".");
    }
}
