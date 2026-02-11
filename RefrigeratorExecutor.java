class RefrigeratorExecutor {

    public static void main(String[] args) {

        boolean ref = Refrigerator.onOrOff();
        System.out.println("Refrigerator status: " + ref);

        boolean ref1 = Refrigerator.onOrOff();
        System.out.println("Refrigerator status: " + ref1);
    }
}
