class PenDriveExecutor {

    public static void main(String[] args) {

        PenDrive penDrive1 = new PenDrive();
			    penDrive1.brand = "SanDisk";
				penDrive1.price = 64;
				penDrive1.capacity = 700;
				penDrive1.type = "USB3.0";
				penDrive1.encrypted = true;
				String[] colors1= {"Black","Red"}  ;
				penDrive1.colors = colors1;
				String[] compatibleDevices1 = {"Laptop","Desktop"};
				penDrive1.compatibleDevices = compatibleDevices1;
				String[] vendors1 = {"Amazon","Flipkart"};
				penDrive1.vendors = vendors1;
				penDrive1.display();

        PenDrive penDrive2 = new PenDrive();
				penDrive2.brand = "HP";
				penDrive2.price = 32;
				penDrive2.capacity = 500;
				penDrive2.type = "USB2.0";
				penDrive2.encrypted = false;
				String[] colors2= {"Silver"};
				penDrive2.colors = colors2;
				String[] compatibleDevices2 = {"Laptop","TV"};
				penDrive2.compatibleDevices = compatibleDevices2;
				String[] vendors2 = {"Reliance","Croma"};
				penDrive2.vendors = vendors2;
				penDrive2.display();

        PenDrive penDrive3 = new PenDrive();
				penDrive3.brand = "Kingston";
				penDrive3.price = 128;
				penDrive3.capacity = 1200;
				penDrive3.type = "USB3.1";
				penDrive3.encrypted = true;
				String[] colors3= {"Black","Blue"};
				penDrive3.colors = colors3;
				String[] compatibleDevices3 = {"Laptop","Tablet"};
				penDrive3.compatibleDevices = compatibleDevices3;
				String[] vendors3 = {"Amazon","Flipkart"};
				penDrive3.vendors = vendors3;
				penDrive3.display();

        PenDrive penDrive4 = new PenDrive();
				penDrive4.brand = "Sony";
				penDrive4.price = 64;
				penDrive4.capacity = 900;
				penDrive4.type = "USB3.0";
				penDrive4.encrypted = true;
				String[] colors4= {"Grey"};
				penDrive4.colors = colors4;
				String[] compatibleDevices4 = {"Laptop","Desktop"};
				penDrive4.compatibleDevices = compatibleDevices4;
				String[] vendors4 = {"Croma","Amazon"};
				penDrive4.vendors = vendors4;
				penDrive4.display();

        
    }
}