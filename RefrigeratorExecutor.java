class RefrigeratorExecutor {

    public static void main(String[] args) {

        boolean ref = Refrigerator.onOrOff();
        System.out.println("Refrigerator status: " + ref);

        Refrigerator.increaseTemperature();
        Refrigerator.increaseTemperature();
        Refrigerator.decreaseTemperature();

        ref = Refrigerator.onOrOff();
        System.out.println("Refrigerator status: " + ref);
    }
}
