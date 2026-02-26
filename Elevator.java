
class Elevator {
    static String brand;
    static int capacity;
    static String liftType;
    static int maxFloors;
    static double maxWeight;
    static boolean isAutomaticDoor;
    static boolean hasCctv;

    public static boolean createElevator(String brandName, int personCapacity, String type, int floors, double weightLimit, boolean doorStatus, boolean cameraStatus) {
        boolean isElevatorCreated = false;
        
        boolean isBrandValid = false;
        boolean isCapacityValid = false;
        boolean isTypeValid = false;
        boolean isMaxFloorsValid = false;
        boolean isMaxWeightValid = false;
        boolean isDoorStatusValid = true;
        boolean isCameraStatusValid = true;

        if (brandName != null && !brandName.isEmpty()) {
            System.out.println("Brand name is Valid");
            brand = brandName;
            isBrandValid = true;
        } else {
            System.out.println("Brand name is invalid");
        }

        if (personCapacity > 0) {
            System.out.println("Capacity is Valid");
            capacity = personCapacity;
            isCapacityValid = true;
        } else {
            System.out.println("Capacity is invalid");
        }

        if (type != null && !type.isEmpty()) {
            System.out.println("Lift type is Valid");
            liftType = type;
            isTypeValid = true;
        } else {
            System.out.println("Lift type is invalid");
        }

        if (floors > 0) {
            System.out.println("Max floors is Valid");
            maxFloors = floors;
            isMaxFloorsValid = true;
        } else {
            System.out.println("Max floors is invalid");
        }

        if (weightLimit > 0) {
            System.out.println("Max weight is Valid");
            maxWeight = weightLimit;
            isMaxWeightValid = true;
        } else {
            System.out.println("Max weight is invalid");
        }

        isAutomaticDoor = doorStatus;
        hasCctv = cameraStatus;

        if (isBrandValid && isCapacityValid && isTypeValid && isMaxFloorsValid && isMaxWeightValid) {
            isElevatorCreated = true;
        } else {
            System.out.println("The elevator is not valid");
        }

        return isElevatorCreated;
    }

    public static void getElevatorDetails() {
        System.out.println("Elevator details are:");
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + " persons");
        System.out.println("Lift Type: " + liftType);
        System.out.println("Max Floors: " + maxFloors);
        System.out.println("Max Weight: " + maxWeight + " kg");
        System.out.println("Automatic Door: " + isAutomaticDoor);
        System.out.println("Has CCTV: " + hasCctv);
    }
}
