class SmartWatchExecutor {

    public static void main(String[] args) {

        boolean ref = SmartWatch.onOrOff();
        System.out.println("Smart Watch status: " + ref);

        SmartWatch.increaseVolume();
        SmartWatch.increaseVolume();
        SmartWatch.decreaseVolume();

        ref = SmartWatch.onOrOff();
        System.out.println("Smart Watch status: " + ref);
    }
}
