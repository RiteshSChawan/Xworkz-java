class LaptopExecutor {

    public static void main(String[] args) {

        boolean ref = Laptop.onOrOff();
        System.out.println("Laptop status: " + ref);

        boolean ref1 = Laptop.onOrOff();
        System.out.println("Laptop status: " + ref1);
    }
}
