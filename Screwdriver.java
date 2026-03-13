class Screwdriver{

int id;
String brand;
double price;
String color;
boolean magnetic;
double length;
String material;
int weight;
String type;
boolean insulated;
String size;
String country;

Screwdriver(int id){
this.id=id;
System.out.println("Id : "+id);
}

Screwdriver(String brand){
this.brand=brand;
System.out.println("Brand : "+brand);
}

Screwdriver(double price){
this.price=price;
System.out.println("Price : "+price);
}

Screwdriver(boolean magnetic){
this.magnetic=magnetic;
System.out.println("Magnetic : "+magnetic);
}

Screwdriver(double length,boolean x){
this.length=length;
System.out.println("Length : "+length);
}

Screwdriver(String material,int x){
this.material=material;
System.out.println("Material : "+material);
}

Screwdriver(int weight,double x){
this.weight=weight;
System.out.println("Weight : "+weight);
}

Screwdriver(String type,double x){
this.type=type;
System.out.println("Type : "+type);
}

Screwdriver(boolean insulated,int x){
this.insulated=insulated;
System.out.println("Insulated : "+insulated);
}

Screwdriver(String size,boolean x){
this.size=size;
System.out.println("Size : "+size);
}

Screwdriver(String country,int x,int y){
this.country=country;
System.out.println("Country : "+country);
}

Screwdriver(String color,double x,int y){
this.color=color;
System.out.println("Color : "+color);
}

}