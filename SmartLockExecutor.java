class SmartLockExecutor {

    public static void main(String[] args){

        String brand = SmartLock.getBrand();
        int price = SmartLock.getPrice();
        String type = SmartLock.getLockType();
        String dimensions = SmartLock.getDimensions();
        String material = SmartLock.getMaterial();
        String use = SmartLock.getRecommendedUse();
        String colour = SmartLock.getColour();
        String finish = SmartLock.getFinishType();
        String control = SmartLock.getControlMethod();
        String controller = SmartLock.getControllerType();
        double weight = SmartLock.getItemWeight();
        String model = SmartLock.getModelNumber();
        String components = SmartLock.getIncludedComponents();
        String country = SmartLock.getCountryOfOrigin();

        System.out.println("The brand of this digital lock is " + brand + ".");
        System.out.println("The price of this digital lock is Rs. " + price + ".");
        System.out.println("The lock type of this product is " + type + ".");
        System.out.println("The dimensions of this lock are " + dimensions + ".");
        System.out.println("The material used in this lock is " + material + ".");
        System.out.println("This lock is recommended for " + use + ".");
        System.out.println("The colour of this lock is " + colour + ".");
        System.out.println("The finish type of this lock is " + finish + ".");
        System.out.println("The control method of this lock is " + control + ".");
        System.out.println("The controller type of this lock is " + controller + ".");
        System.out.println("The weight of this lock is " + weight + " kg.");
        System.out.println("The model number of this lock is " + model + ".");
        System.out.println("The included components with this lock are " + components + ".");
        System.out.println("The country of origin of this lock is " + country + ".");
    }
}
