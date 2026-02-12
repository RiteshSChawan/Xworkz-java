class TVExecutor {

    public static void main(String[] args){

        String brand = TV.getBrand();
        int price = TV.getPrice();
        String model = TV.getModel();
        String series = TV.getSeries();
        String year = TV.getModelYear();
        String display = TV.getDisplayTechnology();
        int screen = TV.getScreenSize();
        String resolution = TV.getResolution();
        String os = TV.getOperatingSystem();
        String ram = TV.getRAM();
        String storage = TV.getStorage();
        String refresh = TV.getRefreshRate();
        String audio = TV.getAudioWattage();
        String power = TV.getPowerSource();
        double weight = TV.getItemWeight();
        String country = TV.getCountryOfOrigin();

        System.out.println("The brand of this television is " + brand + ".");
        System.out.println("The price of this television is Rs. " + price + ".");
        System.out.println("The model number of this television is " + model + ".");
        System.out.println("The series of this television is " + series + ".");
        System.out.println("The model year of this television is " + year + ".");
        System.out.println("The display technology used in this television is " + display + ".");
        System.out.println("The screen size of this television is " + screen + " inches.");
        System.out.println("The resolution of this television is " + resolution + ".");
        System.out.println("The operating system of this television is " + os + ".");
        System.out.println("The RAM of this television is " + ram + ".");
        System.out.println("The internal storage of this television is " + storage + ".");
        System.out.println("The refresh rate of this television is " + refresh + ".");
        System.out.println("The audio output power of this television is " + audio + ".");
        System.out.println("The power source of this television is " + power + ".");
        System.out.println("The weight of this television is " + weight + " kg.");
        System.out.println("The country of origin of this television is " + country + ".");
    }
}
