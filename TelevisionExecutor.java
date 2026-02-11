class TelevisionExecutor {

    public static void main(String[] args) {

        boolean ref = Television.onOrOff();
        System.out.println("Television status: " + ref);

        boolean ref1 = Television.onOrOff();
        System.out.println("Television status: " + ref1);
    }
}
