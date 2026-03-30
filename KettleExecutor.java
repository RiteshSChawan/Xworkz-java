class KettleExecutor {

    public static void main(String[] h) {

        Kettle kettle = new Kettle();

        boolean isAdded = kettle.addName("ElectricKettle");
        System.out.println("Name is added " + isAdded);

        kettle.addName("SteelKettle");
        kettle.addName("GlassKettle");
        kettle.addName("TravelKettle");
        kettle.addName("WhistleKettle");
        kettle.addName("CopperKettle");
        kettle.addName("CeramicKettle");
        kettle.addName("MiniKettle");
        kettle.addName("SmartKettle");
        kettle.addName("PortableKettle");

        kettle.fetchNames();

        boolean isFound = kettle.search("GlassKettle");
        System.out.println("is found " + isFound);

        boolean isUpdate = kettle.update("MiniKettle", "UltraMiniKettle");
        System.out.println("is update " + isUpdate);

        kettle.fetchNames();

        boolean isDelete = kettle.delete("CopperKettle");
        System.out.println("is delete " + isDelete);

        kettle.fetchNames();
    }
}