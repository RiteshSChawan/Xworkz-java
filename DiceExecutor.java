class DiceExecutor {
    public static void main(String[] args) {

        Dice p1 = new Dice(1);
        Dice p2 = new Dice("GameMaster");
        Dice p3 = new Dice(99.99);
        Dice p4 = new Dice("Red", 4.5, 3);
        Dice p5 = new Dice(6, 2.5);
        Dice p6 = new Dice(16.0, true);
        Dice p7 = new Dice("Acrylic", 1);
        Dice p8 = new Dice(11, 1.5);
        Dice p9 = new Dice("Standard", 2.0);
        Dice p10 = new Dice(true, 9);
        Dice p11 = new Dice("Small", false);
        Dice p12 = new Dice("India", 1, 2);
    }
}