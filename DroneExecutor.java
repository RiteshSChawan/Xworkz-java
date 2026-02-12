class DroneExecutor {

    public static void main(String[] args){

        String brand = Drone.getBrand();
        int price = Drone.getPrice();
        String model = Drone.getModelName();
        String colour = Drone.getColour();
        String resolution = Drone.getVideoResolution();
        String connectivity = Drone.getConnectivity();
        int battery = Drone.getBatteryCapacity();
        String format = Drone.getVideoFormat();
        String control = Drone.getControlType();
        String material = Drone.getMaterial();
        String sensor = Drone.getOpticalSensor();
        String features = Drone.getSpecialFeatures();
        String dimensions = Drone.getDimensions();
        double weight = Drone.getItemWeight();
        String country = Drone.getCountryOfOrigin();

        System.out.println("The brand of this drone is " + brand + ".");
        System.out.println("The price of this drone is Rs. " + price + ".");
        System.out.println("The model name of this drone is " + model + ".");
        System.out.println("The colour of this drone is " + colour + ".");
        System.out.println("The video capture resolution of this drone is " + resolution + ".");
        System.out.println("The connectivity technology used in this drone is " + connectivity + ".");
        System.out.println("The battery capacity of this drone is " + battery + " mAh.");
        System.out.println("The video capture format supported by this drone is " + format + ".");
        System.out.println("The control type of this drone is " + control + ".");
        System.out.println("The material used in this drone is " + material + ".");
        System.out.println("The optical sensor technology of this drone is " + sensor + ".");
        System.out.println("The special features of this drone include " + features + ".");
        System.out.println("The dimensions of this drone are " + dimensions + ".");
        System.out.println("The weight of this drone is " + weight + " grams.");
        System.out.println("The country of origin of this drone is " + country + ".");
    }
}
