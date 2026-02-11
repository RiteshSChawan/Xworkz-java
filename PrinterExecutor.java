class PrinterExecutor {

    public static void main(String[] args) {

        boolean ref = Printer.onOrOff();
        System.out.println("Printer status: " + ref);

        boolean ref1 = Printer.onOrOff();
        System.out.println("Printer status: " + ref1);
    }
}
