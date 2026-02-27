class TableManager {

    public static void seatGuest(String customerName, String orderItem) {
        System.out.println("Table Manager is seating the guest...");
        System.out.println("Customer Name : " + customerName);

        Waiter.takeOrder(customerName, orderItem);
        System.out.println("Guest seated successfully.");
    }
}