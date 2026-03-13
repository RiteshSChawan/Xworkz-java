class MagnifyingGlass{

int id;
String brand;
double price;
String color;
boolean handheld;
double diameter;
String material;
int weight;
String type;
boolean antiGlare;
String size;
String country;

MagnifyingGlass(int id){this.id=id;System.out.println("Id : "+id);}
MagnifyingGlass(String brand){this.brand=brand;System.out.println("Brand : "+brand);}
MagnifyingGlass(double price){this.price=price;System.out.println("Price : "+price);}
MagnifyingGlass(boolean handheld){this.handheld=handheld;System.out.println("Handheld : "+handheld);}
MagnifyingGlass(double diameter,boolean x){this.diameter=diameter;System.out.println("Diameter : "+diameter);}
MagnifyingGlass(String material,int x){this.material=material;System.out.println("Material : "+material);}
MagnifyingGlass(int weight,double x){this.weight=weight;System.out.println("Weight : "+weight);}
MagnifyingGlass(String type,double x){this.type=type;System.out.println("Type : "+type);}
MagnifyingGlass(boolean antiGlare,int x){this.antiGlare=antiGlare;System.out.println("AntiGlare : "+antiGlare);}
MagnifyingGlass(String size,boolean x){this.size=size;System.out.println("Size : "+size);}
MagnifyingGlass(String country,int x,int y){this.country=country;System.out.println("Country : "+country);}
MagnifyingGlass(String color,double x,int y){this.color=color;System.out.println("Color : "+color);}

}