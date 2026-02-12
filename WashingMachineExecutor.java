class WashingMachineExecutor {

    public static void main(String[] args) {

        boolean ref = WashingMachine.onOrOff();
        System.out.println("Washing Machine status: " + ref);

        WashingMachine.increaseWashLevel();
        WashingMachine.increaseWashLevel();
        WashingMachine.decreaseWashLevel();

        ref = WashingMachine.onOrOff();
        System.out.println("Washing Machine status: " + ref);
    }
}
