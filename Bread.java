class Bread {

    String type;
    String[] outletNames;
    String[] ingredients;
    String shape;


    void display(){

        System.out.println("Type: "+type);

        System.out.println("Outlets:");
        for(String outlet : outletNames){
            System.out.println(outlet);
        }

        System.out.println("Ingredients:");
        for(String ingredient : ingredients){
            System.out.println(ingredient);
        }

        System.out.println("Shape: "+shape);
        System.out.println();
    }
}