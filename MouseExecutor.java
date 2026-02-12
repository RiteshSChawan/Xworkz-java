class MouseExecutor {

    public static void main(String[] args){

        String brand = Mouse.getBrand();
        int price = Mouse.getPrice();
        String series = Mouse.getSeries();
        String colour = Mouse.getColour();
        String formFactor = Mouse.getFormFactor();
        double height = Mouse.getItemHeight();
        int width = Mouse.getItemWidth();
        String dimensions = Mouse.getDimensions();
        double weight = Mouse.getItemWeight();
        String model = Mouse.getModelNumber();
        String power = Mouse.getPowerSource();
        String platform = Mouse.getHardwarePlatform();
        String os = Mouse.getOperatingSystem();
        String components = Mouse.getIncludedComponents();
        String country = Mouse.getCountryOfOrigin();

        System.out.println("The brand of this Mouse is " + brand + ".");
        System.out.println("The price of this Mouse is Rs. " + price + ".");
        System.out.println("The series of this Mouse is " + series + ".");
        System.out.println("The colour of this Mouse is " + colour + ".");
        System.out.println("The form factor of this Mouse is " + formFactor + ".");
        System.out.println("The height of this Mouse is " + height + " cm.");
        System.out.println("The width of this Mouse is " + width + " cm.");
        System.out.println("The dimensions of this Mouse are " + dimensions + ".");
        System.out.println("The weight of this Mouse is " + weight + " grams.");
        System.out.println("The model number of this Mouse is " + model + ".");
        System.out.println("The power source of this Mouse is " + power + ".");
        System.out.println("The hardware platform supported by this Mouse is " + platform + ".");
        System.out.println("The operating systems supported by this Mouse are " + os + ".");
        System.out.println("The included component with this Mouse is " + components + ".");
        System.out.println("The country of origin of this Mouse is " + country + ".");
    }
}
