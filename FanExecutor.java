class FanExecutor {

    public static void main(String[] args) {

        boolean ref = Fan.onOrOff();
        System.out.println("Fan status: " + ref);

        boolean ref1 = Fan.onOrOff();
        System.out.println("Fan status: " + ref1);
    }
}
