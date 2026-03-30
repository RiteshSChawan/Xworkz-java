class BedExecutor {

    public static void main(String[] h) {

        Bed bed = new Bed();

        boolean isAdded = bed.addName("KingSize");
        System.out.println("Name is added " + isAdded);

        bed.addName("QueenSize");
        bed.addName("SingleBed");
        bed.addName("DoubleBed");
        bed.addName("BunkBed");
        bed.addName("SofaBed");
        bed.addName("FoldingBed");
        bed.addName("HydraulicBed");
        bed.addName("CanopyBed");
        bed.addName("StorageBed");

        bed.fetchNames();

        boolean isFound = bed.search("SofaBed");
        System.out.println("is found " + isFound);

        boolean isUpdate = bed.update("BunkBed", "ModernBunkBed");
        System.out.println("is update " + isUpdate);

        bed.fetchNames();

        boolean isDelete = bed.delete("FoldingBed");
        System.out.println("is delete " + isDelete);

        bed.fetchNames();
    }
}