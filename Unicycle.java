class Unicycle{

int id;
String brand;
double price;
String color;
boolean electric;
double wheelSize;
String material;
int weight;
String type;
boolean foldable;
String model;
String country;

Unicycle(int id){
this.id=id;
System.out.println("Id : "+id);
}

Unicycle(String brand){
this.brand=brand;
System.out.println("Brand : "+brand);
}

Unicycle(double price){
this.price=price;
System.out.println("Price : "+price);
}

Unicycle(boolean electric){
this.electric=electric;
System.out.println("Electric : "+electric);
}

Unicycle(double wheelSize,boolean x){
this.wheelSize=wheelSize;
System.out.println("WheelSize : "+wheelSize);
}

Unicycle(String material,int x){
this.material=material;
System.out.println("Material : "+material);
}

Unicycle(int weight,double x){
this.weight=weight;
System.out.println("Weight : "+weight);
}

Unicycle(String type,double x){
this.type=type;
System.out.println("Type : "+type);
}

Unicycle(boolean foldable,int x){
this.foldable=foldable;
System.out.println("Foldable : "+foldable);
}

Unicycle(String model,boolean x){
this.model=model;
System.out.println("Model : "+model);
}

Unicycle(String country,int x,int y){
this.country=country;
System.out.println("Country : "+country);
}

Unicycle(String color,double x,int y){
this.color=color;
System.out.println("Color : "+color);
}

}