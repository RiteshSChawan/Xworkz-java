class PrinterExecutor {

    public static void main(String[] args){

        int price = Printer.getPrice();
        String model = Printer.getModelNumber();
        String form = Printer.getFormFactor();
        String technology = Printer.getPrintTechnology();
        String interfaceType = Printer.getHardwareInterface();
        String colourRes = Printer.getMaxColourResolution();
        String blackRes = Printer.getMaxBlackResolution();
        String scanner = Printer.getScannerType();
        int inputCap = Printer.getInputSheetCapacity();
        int outputCap = Printer.getOutputSheetCapacity();
        String os = Printer.getOperatingSystem();
        String ink = Printer.getInkColours();
        boolean duplex = Printer.isDuplexSupported();
        double weight = Printer.getItemWeight();
        String country = Printer.getCountryOfOrigin();

        System.out.println("The price of this printer is Rs. " + price + ".");
        System.out.println("The model number of this printer is " + model + ".");
        System.out.println("The form factor of this printer is " + form + ".");
        System.out.println("The print technology used in this printer is " + technology + ".");
        System.out.println("The hardware interface of this printer is " + interfaceType + ".");
        System.out.println("The maximum colour print resolution of this printer is " + colourRes + ".");
        System.out.println("The maximum black and white print resolution of this printer is " + blackRes + ".");
        System.out.println("The scanner type of this printer is " + scanner + ".");
        System.out.println("The maximum input sheet capacity of this printer is " + inputCap + " sheets.");
        System.out.println("The output sheet capacity of this printer is " + outputCap + " sheets.");
        System.out.println("The operating systems supported by this printer are " + os + ".");
        System.out.println("The ink colours supported by this printer are " + ink + ".");
        System.out.println("Does this printer support duplex printing? " + duplex + ".");
        System.out.println("The weight of this printer is " + weight + " kg.");
        System.out.println("The country of origin of this printer is " + country + ".");
    }
}
