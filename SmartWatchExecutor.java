class SmartWatchExecutor {

    public static void main(String[] args) {

        boolean ref = SmartWatch.onOrOff();
        System.out.println("Smart Watch status: " + ref);

        boolean ref1 = SmartWatch.onOrOff();
        System.out.println("Smart Watch status: " + ref1);
    }
}
