class CellExecutor {

    public static void main(String[] args) {

        Cell c1 = new Cell(1,"Red Blood Cell","Human","Biconcave",6.2,false,"Oxygen Transport",0,120.0,false,"Plasma");
        c1.getDetails();

        Cell c2 = new Cell(2,"White Blood Cell","Human","Round",7.0,true,"Immune Defense",1,110.0,true,"Plasma");
        c2.getDetails();

        Cell c3 = new Cell(3,"Platelet","Human","Irregular",2.0,false,"Blood Clotting",0,90.0,false,"Plasma");
        c3.getDetails();

        Cell c4 = new Cell(4,"Neuron","Human","Long",10.0,true,"Signal Transmission",1,130.0,true,"Cytoplasm");
        c4.getDetails();

        Cell c5 = new Cell(5,"Muscle Cell","Human","Fiber",50.0,true,"Contraction",1,140.0,true,"Cytoplasm");
        c5.getDetails();

        Cell c6 = new Cell(6,"Skin Cell","Human","Flat",20.0,true,"Protection",1,100.0,true,"Cytoplasm");
        c6.getDetails();

        Cell c7 = new Cell(7,"Stem Cell","Human","Round",8.0,true,"Regeneration",1,150.0,true,"Cytoplasm");
        c7.getDetails();

        Cell c8 = new Cell(8,"Fat Cell","Human","Round",30.0,true,"Energy Storage",1,110.0,true,"Cytoplasm");
        c8.getDetails();

        Cell c9 = new Cell(9,"Bone Cell","Human","Oval",15.0,true,"Bone Formation",1,120.0,true,"Cytoplasm");
        c9.getDetails();

        Cell c10 = new Cell(10,"Liver Cell","Human","Polygonal",25.0,true,"Metabolism",1,135.0,true,"Cytoplasm");
        c10.getDetails();
    }
}