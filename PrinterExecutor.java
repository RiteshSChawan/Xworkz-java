class PrinterExecutor {

    public static void main(String[] args) {

        boolean ref = Printer.onOrOff();
        System.out.println("Printer status: " + ref);

        Printer.printDocument();
        Printer.printDocument();
        Printer.printDocument();

        ref = Printer.onOrOff();
        System.out.println("Printer status: " + ref);
    }
}
