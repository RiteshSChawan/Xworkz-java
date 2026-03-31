public class OrderDetailsExecutor {
    public static void main(String[] args) {

        // Instance 1
        OrderDetails orderDetails1 = new OrderDetails();
        orderDetails1.setOrderId(1);
        orderDetails1.setProductName("Laptop");
        orderDetails1.setQuantity("1");
        orderDetails1.setTotalPrice("55000");
        orderDetails1.setOrderStatus("Delivered");
        orderDetails1.setOrderedOn("01 Jan 2024");
        orderDetails1.setDeliveredOn("05 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails1.getOrderId());
        System.out.println("The Product Name is : " + orderDetails1.getProductName());
        System.out.println("The Quantity is : " + orderDetails1.getQuantity());
        System.out.println("The Total Price is : " + orderDetails1.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails1.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails1.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails1.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 2
        OrderDetails orderDetails2 = new OrderDetails();
        orderDetails2.setOrderId(2);
        orderDetails2.setProductName("Phone");
        orderDetails2.setQuantity("2");
        orderDetails2.setTotalPrice("30000");
        orderDetails2.setOrderStatus("Shipped");
        orderDetails2.setOrderedOn("02 Jan 2024");
        orderDetails2.setDeliveredOn("07 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails2.getOrderId());
        System.out.println("The Product Name is : " + orderDetails2.getProductName());
        System.out.println("The Quantity is : " + orderDetails2.getQuantity());
        System.out.println("The Total Price is : " + orderDetails2.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails2.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails2.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails2.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 3
        OrderDetails orderDetails3 = new OrderDetails();
        orderDetails3.setOrderId(3);
        orderDetails3.setProductName("Tablet");
        orderDetails3.setQuantity("1");
        orderDetails3.setTotalPrice("20000");
        orderDetails3.setOrderStatus("Processing");
        orderDetails3.setOrderedOn("03 Jan 2024");
        orderDetails3.setDeliveredOn("08 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails3.getOrderId());
        System.out.println("The Product Name is : " + orderDetails3.getProductName());
        System.out.println("The Quantity is : " + orderDetails3.getQuantity());
        System.out.println("The Total Price is : " + orderDetails3.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails3.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails3.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails3.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 4
        OrderDetails orderDetails4 = new OrderDetails();
        orderDetails4.setOrderId(4);
        orderDetails4.setProductName("Headphones");
        orderDetails4.setQuantity("3");
        orderDetails4.setTotalPrice("4500");
        orderDetails4.setOrderStatus("Delivered");
        orderDetails4.setOrderedOn("04 Jan 2024");
        orderDetails4.setDeliveredOn("09 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails4.getOrderId());
        System.out.println("The Product Name is : " + orderDetails4.getProductName());
        System.out.println("The Quantity is : " + orderDetails4.getQuantity());
        System.out.println("The Total Price is : " + orderDetails4.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails4.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails4.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails4.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 5
        OrderDetails orderDetails5 = new OrderDetails();
        orderDetails5.setOrderId(5);
        orderDetails5.setProductName("Smartwatch");
        orderDetails5.setQuantity("1");
        orderDetails5.setTotalPrice("12000");
        orderDetails5.setOrderStatus("Cancelled");
        orderDetails5.setOrderedOn("05 Jan 2024");
        orderDetails5.setDeliveredOn("10 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails5.getOrderId());
        System.out.println("The Product Name is : " + orderDetails5.getProductName());
        System.out.println("The Quantity is : " + orderDetails5.getQuantity());
        System.out.println("The Total Price is : " + orderDetails5.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails5.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails5.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails5.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 6
        OrderDetails orderDetails6 = new OrderDetails();
        orderDetails6.setOrderId(6);
        orderDetails6.setProductName("Keyboard");
        orderDetails6.setQuantity("2");
        orderDetails6.setTotalPrice("3000");
        orderDetails6.setOrderStatus("Delivered");
        orderDetails6.setOrderedOn("06 Jan 2024");
        orderDetails6.setDeliveredOn("11 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails6.getOrderId());
        System.out.println("The Product Name is : " + orderDetails6.getProductName());
        System.out.println("The Quantity is : " + orderDetails6.getQuantity());
        System.out.println("The Total Price is : " + orderDetails6.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails6.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails6.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails6.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 7
        OrderDetails orderDetails7 = new OrderDetails();
        orderDetails7.setOrderId(7);
        orderDetails7.setProductName("Mouse");
        orderDetails7.setQuantity("1");
        orderDetails7.setTotalPrice("1500");
        orderDetails7.setOrderStatus("Shipped");
        orderDetails7.setOrderedOn("07 Jan 2024");
        orderDetails7.setDeliveredOn("12 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails7.getOrderId());
        System.out.println("The Product Name is : " + orderDetails7.getProductName());
        System.out.println("The Quantity is : " + orderDetails7.getQuantity());
        System.out.println("The Total Price is : " + orderDetails7.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails7.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails7.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails7.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 8
        OrderDetails orderDetails8 = new OrderDetails();
        orderDetails8.setOrderId(8);
        orderDetails8.setProductName("Monitor");
        orderDetails8.setQuantity("1");
        orderDetails8.setTotalPrice("18000");
        orderDetails8.setOrderStatus("Delivered");
        orderDetails8.setOrderedOn("08 Jan 2024");
        orderDetails8.setDeliveredOn("13 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails8.getOrderId());
        System.out.println("The Product Name is : " + orderDetails8.getProductName());
        System.out.println("The Quantity is : " + orderDetails8.getQuantity());
        System.out.println("The Total Price is : " + orderDetails8.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails8.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails8.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails8.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 9
        OrderDetails orderDetails9 = new OrderDetails();
        orderDetails9.setOrderId(9);
        orderDetails9.setProductName("Printer");
        orderDetails9.setQuantity("1");
        orderDetails9.setTotalPrice("9000");
        orderDetails9.setOrderStatus("Processing");
        orderDetails9.setOrderedOn("09 Jan 2024");
        orderDetails9.setDeliveredOn("14 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails9.getOrderId());
        System.out.println("The Product Name is : " + orderDetails9.getProductName());
        System.out.println("The Quantity is : " + orderDetails9.getQuantity());
        System.out.println("The Total Price is : " + orderDetails9.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails9.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails9.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails9.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 10
        OrderDetails orderDetails10 = new OrderDetails();
        orderDetails10.setOrderId(10);
        orderDetails10.setProductName("Camera");
        orderDetails10.setQuantity("1");
        orderDetails10.setTotalPrice("35000");
        orderDetails10.setOrderStatus("Delivered");
        orderDetails10.setOrderedOn("10 Jan 2024");
        orderDetails10.setDeliveredOn("15 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails10.getOrderId());
        System.out.println("The Product Name is : " + orderDetails10.getProductName());
        System.out.println("The Quantity is : " + orderDetails10.getQuantity());
        System.out.println("The Total Price is : " + orderDetails10.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails10.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails10.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails10.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 11
        OrderDetails orderDetails11 = new OrderDetails();
        orderDetails11.setOrderId(11);
        orderDetails11.setProductName("Speaker");
        orderDetails11.setQuantity("2");
        orderDetails11.setTotalPrice("6000");
        orderDetails11.setOrderStatus("Shipped");
        orderDetails11.setOrderedOn("11 Jan 2024");
        orderDetails11.setDeliveredOn("16 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails11.getOrderId());
        System.out.println("The Product Name is : " + orderDetails11.getProductName());
        System.out.println("The Quantity is : " + orderDetails11.getQuantity());
        System.out.println("The Total Price is : " + orderDetails11.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails11.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails11.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails11.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 12
        OrderDetails orderDetails12 = new OrderDetails();
        orderDetails12.setOrderId(12);
        orderDetails12.setProductName("TV");
        orderDetails12.setQuantity("1");
        orderDetails12.setTotalPrice("50000");
        orderDetails12.setOrderStatus("Delivered");
        orderDetails12.setOrderedOn("12 Jan 2024");
        orderDetails12.setDeliveredOn("17 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails12.getOrderId());
        System.out.println("The Product Name is : " + orderDetails12.getProductName());
        System.out.println("The Quantity is : " + orderDetails12.getQuantity());
        System.out.println("The Total Price is : " + orderDetails12.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails12.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails12.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails12.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 13
        OrderDetails orderDetails13 = new OrderDetails();
        orderDetails13.setOrderId(13);
        orderDetails13.setProductName("Refrigerator");
        orderDetails13.setQuantity("1");
        orderDetails13.setTotalPrice("42000");
        orderDetails13.setOrderStatus("Processing");
        orderDetails13.setOrderedOn("13 Jan 2024");
        orderDetails13.setDeliveredOn("18 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails13.getOrderId());
        System.out.println("The Product Name is : " + orderDetails13.getProductName());
        System.out.println("The Quantity is : " + orderDetails13.getQuantity());
        System.out.println("The Total Price is : " + orderDetails13.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails13.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails13.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails13.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 14
        OrderDetails orderDetails14 = new OrderDetails();
        orderDetails14.setOrderId(14);
        orderDetails14.setProductName("Washing Machine");
        orderDetails14.setQuantity("1");
        orderDetails14.setTotalPrice("38000");
        orderDetails14.setOrderStatus("Delivered");
        orderDetails14.setOrderedOn("14 Jan 2024");
        orderDetails14.setDeliveredOn("19 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails14.getOrderId());
        System.out.println("The Product Name is : " + orderDetails14.getProductName());
        System.out.println("The Quantity is : " + orderDetails14.getQuantity());
        System.out.println("The Total Price is : " + orderDetails14.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails14.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails14.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails14.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 15
        OrderDetails orderDetails15 = new OrderDetails();
        orderDetails15.setOrderId(15);
        orderDetails15.setProductName("Air Conditioner");
        orderDetails15.setQuantity("1");
        orderDetails15.setTotalPrice("45000");
        orderDetails15.setOrderStatus("Shipped");
        orderDetails15.setOrderedOn("15 Jan 2024");
        orderDetails15.setDeliveredOn("20 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails15.getOrderId());
        System.out.println("The Product Name is : " + orderDetails15.getProductName());
        System.out.println("The Quantity is : " + orderDetails15.getQuantity());
        System.out.println("The Total Price is : " + orderDetails15.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails15.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails15.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails15.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 16
        OrderDetails orderDetails16 = new OrderDetails();
        orderDetails16.setOrderId(16);
        orderDetails16.setProductName("Microwave");
        orderDetails16.setQuantity("1");
        orderDetails16.setTotalPrice("8000");
        orderDetails16.setOrderStatus("Delivered");
        orderDetails16.setOrderedOn("16 Jan 2024");
        orderDetails16.setDeliveredOn("21 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails16.getOrderId());
        System.out.println("The Product Name is : " + orderDetails16.getProductName());
        System.out.println("The Quantity is : " + orderDetails16.getQuantity());
        System.out.println("The Total Price is : " + orderDetails16.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails16.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails16.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails16.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 17
        OrderDetails orderDetails17 = new OrderDetails();
        orderDetails17.setOrderId(17);
        orderDetails17.setProductName("Trimmer");
        orderDetails17.setQuantity("1");
        orderDetails17.setTotalPrice("2500");
        orderDetails17.setOrderStatus("Processing");
        orderDetails17.setOrderedOn("17 Jan 2024");
        orderDetails17.setDeliveredOn("22 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails17.getOrderId());
        System.out.println("The Product Name is : " + orderDetails17.getProductName());
        System.out.println("The Quantity is : " + orderDetails17.getQuantity());
        System.out.println("The Total Price is : " + orderDetails17.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails17.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails17.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails17.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 18
        OrderDetails orderDetails18 = new OrderDetails();
        orderDetails18.setOrderId(18);
        orderDetails18.setProductName("Iron Box");
        orderDetails18.setQuantity("1");
        orderDetails18.setTotalPrice("1200");
        orderDetails18.setOrderStatus("Delivered");
        orderDetails18.setOrderedOn("18 Jan 2024");
        orderDetails18.setDeliveredOn("23 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails18.getOrderId());
        System.out.println("The Product Name is : " + orderDetails18.getProductName());
        System.out.println("The Quantity is : " + orderDetails18.getQuantity());
        System.out.println("The Total Price is : " + orderDetails18.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails18.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails18.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails18.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 19
        OrderDetails orderDetails19 = new OrderDetails();
        orderDetails19.setOrderId(19);
        orderDetails19.setProductName("Vacuum Cleaner");
        orderDetails19.setQuantity("1");
        orderDetails19.setTotalPrice("7000");
        orderDetails19.setOrderStatus("Shipped");
        orderDetails19.setOrderedOn("19 Jan 2024");
        orderDetails19.setDeliveredOn("24 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails19.getOrderId());
        System.out.println("The Product Name is : " + orderDetails19.getProductName());
        System.out.println("The Quantity is : " + orderDetails19.getQuantity());
        System.out.println("The Total Price is : " + orderDetails19.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails19.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails19.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails19.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 20
        OrderDetails orderDetails20 = new OrderDetails();
        orderDetails20.setOrderId(20);
        orderDetails20.setProductName("Water Purifier");
        orderDetails20.setQuantity("1");
        orderDetails20.setTotalPrice("15000");
        orderDetails20.setOrderStatus("Delivered");
        orderDetails20.setOrderedOn("20 Jan 2024");
        orderDetails20.setDeliveredOn("25 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails20.getOrderId());
        System.out.println("The Product Name is : " + orderDetails20.getProductName());
        System.out.println("The Quantity is : " + orderDetails20.getQuantity());
        System.out.println("The Total Price is : " + orderDetails20.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails20.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails20.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails20.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 21
        OrderDetails orderDetails21 = new OrderDetails();
        orderDetails21.setOrderId(21);
        orderDetails21.setProductName("Electric Kettle");
        orderDetails21.setQuantity("2");
        orderDetails21.setTotalPrice("2000");
        orderDetails21.setOrderStatus("Processing");
        orderDetails21.setOrderedOn("21 Jan 2024");
        orderDetails21.setDeliveredOn("26 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails21.getOrderId());
        System.out.println("The Product Name is : " + orderDetails21.getProductName());
        System.out.println("The Quantity is : " + orderDetails21.getQuantity());
        System.out.println("The Total Price is : " + orderDetails21.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails21.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails21.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails21.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 22
        OrderDetails orderDetails22 = new OrderDetails();
        orderDetails22.setOrderId(22);
        orderDetails22.setProductName("Mixer Grinder");
        orderDetails22.setQuantity("1");
        orderDetails22.setTotalPrice("3500");
        orderDetails22.setOrderStatus("Delivered");
        orderDetails22.setOrderedOn("22 Jan 2024");
        orderDetails22.setDeliveredOn("27 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails22.getOrderId());
        System.out.println("The Product Name is : " + orderDetails22.getProductName());
        System.out.println("The Quantity is : " + orderDetails22.getQuantity());
        System.out.println("The Total Price is : " + orderDetails22.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails22.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails22.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails22.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 23
        OrderDetails orderDetails23 = new OrderDetails();
        orderDetails23.setOrderId(23);
        orderDetails23.setProductName("Toaster");
        orderDetails23.setQuantity("1");
        orderDetails23.setTotalPrice("1800");
        orderDetails23.setOrderStatus("Shipped");
        orderDetails23.setOrderedOn("23 Jan 2024");
        orderDetails23.setDeliveredOn("28 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails23.getOrderId());
        System.out.println("The Product Name is : " + orderDetails23.getProductName());
        System.out.println("The Quantity is : " + orderDetails23.getQuantity());
        System.out.println("The Total Price is : " + orderDetails23.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails23.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails23.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails23.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 24
        OrderDetails orderDetails24 = new OrderDetails();
        orderDetails24.setOrderId(24);
        orderDetails24.setProductName("Fan");
        orderDetails24.setQuantity("2");
        orderDetails24.setTotalPrice("4000");
        orderDetails24.setOrderStatus("Delivered");
        orderDetails24.setOrderedOn("24 Jan 2024");
        orderDetails24.setDeliveredOn("29 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails24.getOrderId());
        System.out.println("The Product Name is : " + orderDetails24.getProductName());
        System.out.println("The Quantity is : " + orderDetails24.getQuantity());
        System.out.println("The Total Price is : " + orderDetails24.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails24.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails24.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails24.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 25
        OrderDetails orderDetails25 = new OrderDetails();
        orderDetails25.setOrderId(25);
        orderDetails25.setProductName("Air Purifier");
        orderDetails25.setQuantity("1");
        orderDetails25.setTotalPrice("11000");
        orderDetails25.setOrderStatus("Processing");
        orderDetails25.setOrderedOn("25 Jan 2024");
        orderDetails25.setDeliveredOn("30 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails25.getOrderId());
        System.out.println("The Product Name is : " + orderDetails25.getProductName());
        System.out.println("The Quantity is : " + orderDetails25.getQuantity());
        System.out.println("The Total Price is : " + orderDetails25.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails25.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails25.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails25.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 26
        OrderDetails orderDetails26 = new OrderDetails();
        orderDetails26.setOrderId(26);
        orderDetails26.setProductName("Juicer");
        orderDetails26.setQuantity("1");
        orderDetails26.setTotalPrice("2200");
        orderDetails26.setOrderStatus("Delivered");
        orderDetails26.setOrderedOn("26 Jan 2024");
        orderDetails26.setDeliveredOn("31 Jan 2024");

        System.out.println("The Order ID is : " + orderDetails26.getOrderId());
        System.out.println("The Product Name is : " + orderDetails26.getProductName());
        System.out.println("The Quantity is : " + orderDetails26.getQuantity());
        System.out.println("The Total Price is : " + orderDetails26.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails26.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails26.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails26.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 27
        OrderDetails orderDetails27 = new OrderDetails();
        orderDetails27.setOrderId(27);
        orderDetails27.setProductName("Blender");
        orderDetails27.setQuantity("1");
        orderDetails27.setTotalPrice("2800");
        orderDetails27.setOrderStatus("Shipped");
        orderDetails27.setOrderedOn("27 Jan 2024");
        orderDetails27.setDeliveredOn("01 Feb 2024");

        System.out.println("The Order ID is : " + orderDetails27.getOrderId());
        System.out.println("The Product Name is : " + orderDetails27.getProductName());
        System.out.println("The Quantity is : " + orderDetails27.getQuantity());
        System.out.println("The Total Price is : " + orderDetails27.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails27.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails27.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails27.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 28
        OrderDetails orderDetails28 = new OrderDetails();
        orderDetails28.setOrderId(28);
        orderDetails28.setProductName("Coffee Maker");
        orderDetails28.setQuantity("1");
        orderDetails28.setTotalPrice("5000");
        orderDetails28.setOrderStatus("Delivered");
        orderDetails28.setOrderedOn("28 Jan 2024");
        orderDetails28.setDeliveredOn("02 Feb 2024");

        System.out.println("The Order ID is : " + orderDetails28.getOrderId());
        System.out.println("The Product Name is : " + orderDetails28.getProductName());
        System.out.println("The Quantity is : " + orderDetails28.getQuantity());
        System.out.println("The Total Price is : " + orderDetails28.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails28.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails28.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails28.getDeliveredOn());
        System.out.println("----------------------------");

        // Instance 29
        OrderDetails orderDetails29 = new OrderDetails();
        orderDetails29.setOrderId(29);
        orderDetails29.setProductName("Hair Dryer");
        orderDetails29.setQuantity("1");
        orderDetails29.setTotalPrice("1600");
        orderDetails29.setOrderStatus("Processing");
        orderDetails29.setOrderedOn("29 Jan 2024");
        orderDetails29.setDeliveredOn("03 Feb 2024");

        System.out.println("The Order ID is : " + orderDetails29.getOrderId());
        System.out.println("The Product Name is : " + orderDetails29.getProductName());
        System.out.println("The Quantity is : " + orderDetails29.getQuantity());
        System.out.println("The Total Price is : " + orderDetails29.getTotalPrice());
        System.out.println("The Order Status is : " + orderDetails29.getOrderStatus());
        System.out.println("The Ordered On is : " + orderDetails29.getOrderedOn());
        System.out.println("The Delivered On is : " + orderDetails29.getDeliveredOn());
        System.out.println("----------------------------");

    }
}
