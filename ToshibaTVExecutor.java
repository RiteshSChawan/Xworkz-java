class ToshibaTVExecutor {

    public static void main(String[] args){

        String brand = ToshibaTV.getBrand();
        double price = ToshibaTV.getPrice();
        String model = ToshibaTV.getModel();
        String series = ToshibaTV.getSeries();
        String year = ToshibaTV.getModelYear();
        String dimensions = ToshibaTV.getDimensions();
        double weight = ToshibaTV.getItemWeight();
        String os = ToshibaTV.getOperatingSystem();
        int storage = ToshibaTV.getStorageCapacity();
        int ram = ToshibaTV.getRAM();
        String resolution = ToshibaTV.getResolution();
        int screenSize = ToshibaTV.getScreenSize();
        String display = ToshibaTV.getDisplayTechnology();
        int refreshRate = ToshibaTV.getRefreshRate();
        int audio = ToshibaTV.getAudioWattage();
        String power = ToshibaTV.getPowerSource();
        String mount = ToshibaTV.getMountingType();
        String country = ToshibaTV.getCountryOfOrigin();

        System.out.println("The brand of this television is " + brand + ".");
        System.out.println("The price of this television is Rs. " + price + ".");
        System.out.println("The model number of this television is " + model + ".");
        System.out.println("The series name of this television is " + series + ".");
        System.out.println("The model year of this television is " + year + ".");
        System.out.println("The dimensions of this television are " + dimensions + ".");
        System.out.println("The weight of this television is " + weight + " kg.");
        System.out.println("The operating system used in this television is " + os + ".");
        System.out.println("The internal storage capacity of this television is " + storage + " GB.");
        System.out.println("The RAM installed in this television is " + ram + " GB.");
        System.out.println("The screen resolution of this television is " + resolution + ".");
        System.out.println("The screen size of this television is " + screenSize + " inches.");
        System.out.println("The display technology used in this television is " + display + ".");
        System.out.println("The refresh rate of this television is " + refreshRate + " Hz.");
        System.out.println("The total audio output power of this television is " + audio + " Watts.");
        System.out.println("The power source of this television is " + power + ".");
        System.out.println("The mounting type supported by this television is " + mount + ".");
        System.out.println("The country of origin of this television is " + country + ".");
    }
}
