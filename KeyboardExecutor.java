class KeyboardExecutor {

    public static void main(String[] args){

        String brand = Keyboard.getBrand();
        int price = Keyboard.getPrice();
        String series = Keyboard.getSeries();
        String colour = Keyboard.getColour();
        String formFactor = Keyboard.getFormFactor();
        double height = Keyboard.getItemHeight();
        int width = Keyboard.getItemWidth();
        String dimensions = Keyboard.getDimensions();
        double weight = Keyboard.getItemWeight();
        String model = Keyboard.getModelNumber();
        String power = Keyboard.getPowerSource();
        String components = Keyboard.getIncludedComponents();
        String manufacturer = Keyboard.getManufacturer();
        String country = Keyboard.getCountryOfOrigin();

        System.out.println("The brand of this keyboard is " + brand + ".");
        System.out.println("The price of this keyboard is Rs. " + price + ".");
        System.out.println("The series name of this keyboard is " + series + ".");
        System.out.println("The colour of this keyboard is " + colour + ".");
        System.out.println("The form factor of this keyboard is " + formFactor + ".");
        System.out.println("The height of this keyboard is " + height + " cm.");
        System.out.println("The width of this keyboard is " + width + " cm.");
        System.out.println("The dimensions of this keyboard are " + dimensions + ".");
        System.out.println("The weight of this keyboard is " + weight + " grams.");
        System.out.println("The model number of this keyboard is " + model + ".");
        System.out.println("The power source of this keyboard is " + power + ".");
        System.out.println("The included component with this keyboard is " + components + ".");
        System.out.println("The manufacturer of this keyboard is " + manufacturer + ".");
        System.out.println("The country of origin of this keyboard is " + country + ".");
    }
}
