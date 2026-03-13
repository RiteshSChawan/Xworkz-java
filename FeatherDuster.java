class FeatherDuster{

int id;
String brand;
double price;
String color;
boolean soft;
double length;
String material;
int weight;
String type;
boolean washable;
String size;
String country;

FeatherDuster(int id){
this.id=id;
System.out.println("Id : "+id);
}

FeatherDuster(String brand){
this.brand=brand;
System.out.println("Brand : "+brand);
}

FeatherDuster(double price){
this.price=price;
System.out.println("Price : "+price);
}

FeatherDuster(boolean soft){
this.soft=soft;
System.out.println("Soft : "+soft);
}

FeatherDuster(double length,boolean x){
this.length=length;
System.out.println("Length : "+length);
}

FeatherDuster(String material,int x){
this.material=material;
System.out.println("Material : "+material);
}

FeatherDuster(int weight,double x){
this.weight=weight;
System.out.println("Weight : "+weight);
}

FeatherDuster(String type,double x){
this.type=type;
System.out.println("Type : "+type);
}

FeatherDuster(boolean washable,int x){
this.washable=washable;
System.out.println("Washable : "+washable);
}

FeatherDuster(String size,boolean x){
this.size=size;
System.out.println("Size : "+size);
}

FeatherDuster(String country,int x,int y){
this.country=country;
System.out.println("Country : "+country);
}

FeatherDuster(String color,double x,int y){
this.color=color;
System.out.println("Color : "+color);
}

}