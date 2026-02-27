class Kitchen {

    public static void receiveOrder(String customerName, String orderItem) {
        System.out.println("Kitchen received the order...");
        System.out.println("Preparing : " + orderItem);

        HeadChef.cook(orderItem);
        System.out.println("Kitchen processing completed.");
    }
}