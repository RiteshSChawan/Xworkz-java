class WashingMachineExecutor {

    public static void main(String[] args) {

        boolean ref = WashingMachine.onOrOff();
        System.out.println("Washing Machine status: " + ref);

        boolean ref1 = WashingMachine.onOrOff();
        System.out.println("Washing Machine status: " + ref1);
    }
}
