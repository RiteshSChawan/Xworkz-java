class Waiter {

    public static void takeOrder(String customerName, String orderItem) {
        System.out.println("Waiter is taking the order...");
        System.out.println("Order Item : " + orderItem);

        OrderSystem.sendToKitchen(customerName, orderItem);
        System.out.println("Order taken by waiter.");
    }
}