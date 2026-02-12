class FanExecutor {

    public static void main(String[] args) {

        boolean ref = Fan.onOrOff();
        System.out.println("Fan status: " + ref);

        Fan.increaseSpeed();
        Fan.increaseSpeed();
        Fan.increaseSpeed();
        Fan.decreaseSpeed();
        Fan.increaseSpeed();
        Fan.decreaseSpeed();

        ref = Fan.onOrOff();
        System.out.println("Fan status: " + ref);
    }
}
