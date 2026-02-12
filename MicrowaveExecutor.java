class MicrowaveExecutor {

    public static void main(String[] args) {

        boolean ref = Microwave.onOrOff();
        System.out.println("Microwave status: " + ref);

        Microwave.increaseTime();
        Microwave.increaseTime();
        Microwave.decreaseTime();

        ref = Microwave.onOrOff();
        System.out.println("Microwave status: " + ref);
    }
}
