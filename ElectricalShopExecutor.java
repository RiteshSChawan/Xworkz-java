import java.util.Scanner;
class ElectricalShopExecutor {
    public static void main(String[] args) {
        ElectricalShop electricalShop = new ElectricalShop();
        /* electricalShop.addAppliance("Ceiling Fan");
        electricalShop.addAppliance("Table Fan");
        electricalShop.addAppliance("LED Bulb");
        electricalShop.addAppliance("Tube Light");
        electricalShop.addAppliance("Switch Board");
        electricalShop.addAppliance("Extension Cord");
        electricalShop.addAppliance("Voltage Stabilizer");
        electricalShop.addAppliance("UPS");
        electricalShop.addAppliance("Inverter");
        electricalShop.addAppliance("Solar Panel");
        electricalShop.addAppliance("Electric Meter");
        electricalShop.addAppliance("Circuit Breaker");
        electricalShop.addAppliance("Transformer");
        electricalShop.addAppliance("Wire Cable");
        electricalShop.addAppliance("Power Strip");
        electricalShop.addAppliance("Exhaust Fan");
        electricalShop.addAppliance("Dimmer Switch");
        electricalShop.addAppliance("Smart Plug");
        electricalShop.addAppliance("Motion Sensor");
        electricalShop.addAppliance("Timer Switch");
        electricalShop.getApplianceDetails(); */
		
		Scanner sc = new Scanner(System.in);
         for (int index = 0; index < electricalShop.appliances.length; index++) {
            System.out.println("Enter appliance name : ");
            electricalShop.addAppliance(sc.nextLine());
        }
        electricalShop.getApplianceDetails();
		sc.close();
		
        int index = 3;
        System.out.println("Appliance at index " + index + " is: " + electricalShop.getApplianceByIndex(index));
        System.out.println("Index of LED Bulb: " + electricalShop.getIndexByAppliance("LED Bulb"));
        System.out.println("Is updated: " + electricalShop.updateAppliance("Refrigerator", "Double Door Refrigerator"));
        electricalShop.getApplianceDetails();
        System.out.println("Is deleted: " + electricalShop.deleteAppliance("Ceiling Fan"));
        electricalShop.getApplianceDetails();
    }
}
