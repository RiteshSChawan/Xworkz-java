class PaperExecutor {

    public static void main(String[] args) {

        Paper paper1 = new Paper(1,"PaperMax","Bond Paper","White",299.99,80,500,21.0,29.7,false,"Smooth","A4","OfficeSupply Ltd");
        paper1.getDetails();

        Paper paper2 = new Paper(2,"PaperPlus","Printing Paper","White",320.00,75,500,21.0,29.7,false,"Matte","A4","PrintTech");
        paper2.getDetails();

        Paper paper3 = new Paper(3,"EcoPaper","Recycled Paper","Off White",280.50,70,400,21.0,29.7,true,"Rough","A4","EcoWorks");
        paper3.getDetails();

        Paper paper4 = new Paper(4,"PremiumPaper","Gloss Paper","White",450.00,90,250,21.0,29.7,false,"Glossy","A4","PhotoPrint Inc");
        paper4.getDetails();

        Paper paper5 = new Paper(5,"NotePaper","Notebook Paper","White",200.00,60,300,21.0,29.7,false,"Smooth","A4","StudySupplies");
        paper5.getDetails();

        Paper paper6 = new Paper(6,"ArtPaper","Drawing Paper","Cream",350.00,120,200,29.7,42.0,false,"Texture","A3","ArtWorld");
        paper6.getDetails();

        Paper paper7 = new Paper(7,"CardStock","Card Paper","White",380.00,150,150,21.0,29.7,false,"Hard","A4","CardPro");
        paper7.getDetails();

        Paper paper8 = new Paper(8,"LegalPaper","Legal Sheet","White",330.00,80,500,21.6,35.6,false,"Smooth","Legal","OfficeSupply Ltd");
        paper8.getDetails();

        Paper paper9 = new Paper(9,"ColorPaper","Colored Paper","Blue",310.00,80,500,21.0,29.7,false,"Matte","A4","ColorWorks");
        paper9.getDetails();

        Paper paper10 = new Paper(10,"CopyPaper","Copy Paper","White",295.00,75,500,21.0,29.7,false,"Smooth","A4","CopyCenter");
        paper10.getDetails();
    }
}