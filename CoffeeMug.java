class CoffeeMug{

int id;
String brand;
double price;
String color;
boolean ceramic;
double capacity;
String material;
int weight;
String type;
boolean microwaveSafe;
String size;
String country;

CoffeeMug(int id){
this.id=id;
System.out.println("Id : "+id);
}

CoffeeMug(String brand){
this.brand=brand;
System.out.println("Brand : "+brand);
}

CoffeeMug(double price){
this.price=price;
System.out.println("Price : "+price);
}

CoffeeMug(boolean ceramic){
this.ceramic=ceramic;
System.out.println("Ceramic : "+ceramic);
}

CoffeeMug(double capacity,boolean x){
this.capacity=capacity;
System.out.println("Capacity : "+capacity);
}

CoffeeMug(String material,int x){
this.material=material;
System.out.println("Material : "+material);
}

CoffeeMug(int weight,double x){
this.weight=weight;
System.out.println("Weight : "+weight);
}

CoffeeMug(String type,double x){
this.type=type;
System.out.println("Type : "+type);
}

CoffeeMug(boolean microwaveSafe,int x){
this.microwaveSafe=microwaveSafe;
System.out.println("MicrowaveSafe : "+microwaveSafe);
}

CoffeeMug(String size,boolean x){
this.size=size;
System.out.println("Size : "+size);
}

CoffeeMug(String country,int x,int y){
this.country=country;
System.out.println("Country : "+country);
}

CoffeeMug(String color,double x,int y){
this.color=color;
System.out.println("Color : "+color);
}

}