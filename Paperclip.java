class Paperclip{

int id;
String brand;
double price;
String color;
boolean metal;
double length;
String material;
int quantity;
String shape;
boolean reusable;
String size;
String country;

Paperclip(int id){
this.id=id;
System.out.println("Id : "+id);
}

Paperclip(String brand){
this.brand=brand;
System.out.println("Brand : "+brand);
}

Paperclip(double price){
this.price=price;
System.out.println("Price : "+price);
}

Paperclip(boolean metal){
this.metal=metal;
System.out.println("Metal : "+metal);
}

Paperclip(double length,boolean x){
this.length=length;
System.out.println("Length : "+length);
}

Paperclip(String material,int x){
this.material=material;
System.out.println("Material : "+material);
}

Paperclip(int quantity,double x){
this.quantity=quantity;
System.out.println("Quantity : "+quantity);
}

Paperclip(String shape,double x){
this.shape=shape;
System.out.println("Shape : "+shape);
}

Paperclip(boolean reusable,int x){
this.reusable=reusable;
System.out.println("Reusable : "+reusable);
}

Paperclip(String size,boolean x){
this.size=size;
System.out.println("Size : "+size);
}

Paperclip(String country,int x,int y){
this.country=country;
System.out.println("Country : "+country);
}

Paperclip(String color,double x,int y){
this.color=color;
System.out.println("Color : "+color);
}

}