class RubberDuck{

int id;
String brand;
double price;
String color;
boolean squeaky;
double size;
String material;
int weight;
String shape;
boolean floating;
String type;
String country;

RubberDuck(int id){
this.id=id;
System.out.println("Id : "+id);
}

RubberDuck(String brand){
this.brand=brand;
System.out.println("Brand : "+brand);
}

RubberDuck(double price){
this.price=price;
System.out.println("Price : "+price);
}

RubberDuck(boolean squeaky){
this.squeaky=squeaky;
System.out.println("Squeaky : "+squeaky);
}

RubberDuck(double size,boolean x){
this.size=size;
System.out.println("Size : "+size);
}

RubberDuck(String material,int x){
this.material=material;
System.out.println("Material : "+material);
}

RubberDuck(int weight,double x){
this.weight=weight;
System.out.println("Weight : "+weight);
}

RubberDuck(String shape,double x){
this.shape=shape;
System.out.println("Shape : "+shape);
}

RubberDuck(boolean floating,int x){
this.floating=floating;
System.out.println("Floating : "+floating);
}

RubberDuck(String type,boolean x){
this.type=type;
System.out.println("Type : "+type);
}

RubberDuck(String country,int x,int y){
this.country=country;
System.out.println("Country : "+country);
}

RubberDuck(String color,double x,int y){
this.color=color;
System.out.println("Color : "+color);
}

}