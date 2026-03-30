class SteelExecutor {

    public static void main(String[] h) {

        Steel steel = new Steel();

        boolean isAdded = steel.addName("AlloySteel");
        System.out.println("Name is added " + isAdded);

        steel.addName("CarbonSteel");
        steel.addName("StainlessSteel");
        steel.addName("ToolSteel");
        steel.addName("MildSteel");
        steel.addName("SpringSteel");
        steel.addName("HighSpeedSteel");
        steel.addName("DuplexSteel");
        steel.addName("CastSteel");
        steel.addName("ForgedSteel");

        steel.fetchNames();

        boolean isFound = steel.search("MildSteel");
        System.out.println("is found " + isFound);

        boolean isUpdate = steel.update("CastSteel", "UltraCastSteel");
        System.out.println("is update " + isUpdate);

        steel.fetchNames();

        boolean isDelete = steel.delete("SpringSteel");
        System.out.println("is delete " + isDelete);

        steel.fetchNames();
    }
}