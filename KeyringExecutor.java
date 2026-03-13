class KeyringExecutor {
    public static void main(String[] args) {

        Keyring p1 = new Keyring(1);
        Keyring p2 = new Keyring("KeyMaster");
        Keyring p3 = new Keyring(79.99);
        Keyring p4 = new Keyring("Silver", 4.5, 3);
        Keyring p5 = new Keyring(30, 2.5);
        Keyring p6 = new Keyring(50.0, true);
        Keyring p7 = new Keyring("Stainless Steel", 1);
        Keyring p8 = new Keyring(12, 1.5);
        Keyring p9 = new Keyring("Split Ring", 2.0);
        Keyring p10 = new Keyring(false, 9);
        Keyring p11 = new Keyring("Small", false);
        Keyring p12 = new Keyring("India", 1, 2);
    }
}