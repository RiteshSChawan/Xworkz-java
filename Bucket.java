class Bucket {
    String color;
    double capacity;
    String material;
    double height;
    double weight;
    Bucket(){
        System.out.println("Bucket object created using default constructor");
    }
    Bucket(String color, double capacity, String material, double height, double weight) {
        this.color = color;
        this.capacity = capacity;
        this.material = material;
        this.height = height;
        this.weight = weight;
    }
}