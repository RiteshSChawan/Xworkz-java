class TelevisionExecutor {

    public static void main(String[] args) {

        boolean ref = Television.onOrOff();
        System.out.println("Television status: " + ref);

        Television.increaseVolume();
        Television.increaseVolume();
        Television.decreaseVolume();

        ref = Television.onOrOff();
        System.out.println("Television status: " + ref);
    }
}
