class LaptopExecutor {

    public static void main(String[] args){

        String brand = Laptop.getBrand();
        int price = Laptop.getPrice();
        String series = Laptop.getSeries();
        String colour = Laptop.getColour();
        double screen = Laptop.getScreenSize();
        String resolution = Laptop.getResolution();
        String processor = Laptop.getProcessor();
        String speed = Laptop.getProcessorSpeed();
        String memory = Laptop.getMemory();
        String storage = Laptop.getStorage();
        String graphics = Laptop.getGraphics();
        String os = Laptop.getOperatingSystem();
        String connectivity = Laptop.getConnectivity();
        String country = Laptop.getCountryOfOrigin();
        double weight = Laptop.getItemWeight();

        System.out.println("The brand of this laptop is " + brand + ".");
        System.out.println("The price of this laptop is Rs. " + price + ".");
        System.out.println("The series of this laptop is " + series + ".");
        System.out.println("The colour of this laptop is " + colour + ".");
        System.out.println("The screen size of this laptop is " + screen + " inches.");
        System.out.println("The screen resolution of this laptop is " + resolution + ".");
        System.out.println("The processor used in this laptop is " + processor + ".");
        System.out.println("The processor speed of this laptop is " + speed + ".");
        System.out.println("The memory specification of this laptop is " + memory + ".");
        System.out.println("The storage capacity of this laptop is " + storage + ".");
        System.out.println("The graphics processor used in this laptop is " + graphics + ".");
        System.out.println("The operating system of this laptop is " + os + ".");
        System.out.println("The connectivity type supported by this laptop is " + connectivity + ".");
        System.out.println("The country of origin of this laptop is " + country + ".");
        System.out.println("The weight of this laptop is " + weight + " kg.");
    }
}
