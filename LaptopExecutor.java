class LaptopExecutor {

    public static void main(String[] args) {

        boolean ref = Laptop.onOrOff();
        System.out.println("Laptop status: " + ref);

        Laptop.increaseBrightness();
        Laptop.increaseBrightness();
        Laptop.decreaseBrightness();

        ref = Laptop.onOrOff();
        System.out.println("Laptop status: " + ref);
    }
}
