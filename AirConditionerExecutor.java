class AirConditionerExecutor {

    public static void main(String[] args) {

        boolean ref = AirConditioner.onOrOff();
        System.out.println("AC status: " + ref);

        boolean ref1 = AirConditioner.onOrOff();
        System.out.println("AC status: " + ref1);
    }
}
