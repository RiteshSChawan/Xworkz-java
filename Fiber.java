class Fiber {

    String name;
    double length;
    String[] vendors;


    public void display() {
        System.out.println("Fiber Name: " + name);
        System.out.println("Length: " + length);
        System.out.println("Vendors: ");
        for(String vendor : vendors) {
            System.out.println(vendor);
        }
        System.out.println();
    }
}