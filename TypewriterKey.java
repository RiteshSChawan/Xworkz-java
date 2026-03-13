class TypewriterKey{

int id;
String brand;
double price;
String color;
boolean plastic;
double size;
String material;
int weight;
String type;
boolean engraved;
String symbol;
String country;

TypewriterKey(int id){
this.id=id;
System.out.println("Id : "+id);
}

TypewriterKey(String brand){
this.brand=brand;
System.out.println("Brand : "+brand);
}

TypewriterKey(double price){
this.price=price;
System.out.println("Price : "+price);
}

TypewriterKey(boolean plastic){
this.plastic=plastic;
System.out.println("Plastic : "+plastic);
}

TypewriterKey(double size,boolean x){
this.size=size;
System.out.println("Size : "+size);
}

TypewriterKey(String material,int x){
this.material=material;
System.out.println("Material : "+material);
}

TypewriterKey(int weight,double x){
this.weight=weight;
System.out.println("Weight : "+weight);
}

TypewriterKey(String type,double x){
this.type=type;
System.out.println("Type : "+type);
}

TypewriterKey(boolean engraved,int x){
this.engraved=engraved;
System.out.println("Engraved : "+engraved);
}

TypewriterKey(String symbol,boolean x){
this.symbol=symbol;
System.out.println("Symbol : "+symbol);
}

TypewriterKey(String country,int x,int y){
this.country=country;
System.out.println("Country : "+country);
}

TypewriterKey(String color,double x,int y){
this.color=color;
System.out.println("Color : "+color);
}

}