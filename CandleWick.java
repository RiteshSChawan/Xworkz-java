class CandleWick{

int id;
String brand;
double price;
String color;
boolean cotton;
double length;
String material;
int weight;
String type;
boolean smokeless;
String size;
String country;

CandleWick(int id){
this.id=id;
System.out.println("Id : "+id);
}

CandleWick(String brand){
this.brand=brand;
System.out.println("Brand : "+brand);
}

CandleWick(double price){
this.price=price;
System.out.println("Price : "+price);
}

CandleWick(boolean cotton){
this.cotton=cotton;
System.out.println("Cotton : "+cotton);
}

CandleWick(double length,boolean x){
this.length=length;
System.out.println("Length : "+length);
}

CandleWick(String material,int x){
this.material=material;
System.out.println("Material : "+material);
}

CandleWick(int weight,double x){
this.weight=weight;
System.out.println("Weight : "+weight);
}

CandleWick(String type,double x){
this.type=type;
System.out.println("Type : "+type);
}

CandleWick(boolean smokeless,int x){
this.smokeless=smokeless;
System.out.println("Smokeless : "+smokeless);
}

CandleWick(String size,boolean x){
this.size=size;
System.out.println("Size : "+size);
}

CandleWick(String country,int x,int y){
this.country=country;
System.out.println("Country : "+country);
}

CandleWick(String color,double x,int y){
this.color=color;
System.out.println("Color : "+color);
}

}