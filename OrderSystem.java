class OrderSystem {

    public static void sendToKitchen(String customerName, String orderItem) {
        System.out.println("Order system sending order to kitchen...");
        System.out.println("Customer : " + customerName);
        System.out.println("Food Item : " + orderItem);

        Kitchen.receiveOrder(customerName, orderItem);
        System.out.println("Order sent to kitchen.");
    }
}