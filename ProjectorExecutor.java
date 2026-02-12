class ProjectorExecutor {

    public static void main(String[] args){

        String brand = Projector.getBrand();
        int price = Projector.getPrice();
        String model = Projector.getModel();
        String year = Projector.getModelYear();
        String dimensions = Projector.getDimensions();
        double weight = Projector.getItemWeight();
        String hardware = Projector.getHardwareInterface();
        String devices = Projector.getCompatibleDevices();
        String tech = Projector.getDisplayTechnology();
        String type = Projector.getDisplayType();
        String resolution = Projector.getResolution();
        int wattage = Projector.getWattage();
        String form = Projector.getFormFactor();
        String mount = Projector.getMountingType();
        String country = Projector.getCountryOfOrigin();

        System.out.println("The brand of this projector is " + brand + ".");
        System.out.println("The price of this projector is Rs. " + price + ".");
        System.out.println("The model number of this projector is " + model + ".");
        System.out.println("The model year of this projector is " + year + ".");
        System.out.println("The dimensions of this projector are " + dimensions + ".");
        System.out.println("The weight of this projector is " + weight + " grams.");
        System.out.println("The hardware interfaces available in this projector are " + hardware + ".");
        System.out.println("The compatible devices for this projector are " + devices + ".");
        System.out.println("The display technology used in this projector is " + tech + ".");
        System.out.println("The display type of this projector is " + type + ".");
        System.out.println("The screen resolution of this projector is " + resolution + ".");
        System.out.println("The power consumption of this projector is " + wattage + " watts.");
        System.out.println("The form factor of this projector is " + form + ".");
        System.out.println("The mounting type supported by this projector is " + mount + ".");
        System.out.println("The country of origin of this projector is " + country + ".");
    }
}
