class MicrowaveExecutor {

    public static void main(String[] args) {

        boolean ref = Microwave.onOrOff();
        System.out.println("Microwave status: " + ref);

        boolean ref1 = Microwave.onOrOff();
        System.out.println("Microwave status: " + ref1);
    }
}
