class PetroleumExecutor {

    public static void main(String[] h) {

        Petroleum petroleum = new Petroleum();

        boolean isAdded = petroleum.addName("Petrol");
        System.out.println("Name is added " + isAdded);

        petroleum.addName("Diesel");
        petroleum.addName("Kerosene");
        petroleum.addName("LPG");
        petroleum.addName("CNG");
        petroleum.addName("AviationFuel");
        petroleum.addName("Bitumen");
        petroleum.addName("Paraffin");
        petroleum.addName("Naphtha");
        petroleum.addName("Lubricant");

        petroleum.fetchNames();

        boolean isFound = petroleum.search("Diesel");
        System.out.println("is found " + isFound);

        boolean isUpdate = petroleum.update("CNG", "BioGas");
        System.out.println("is update " + isUpdate);

        petroleum.fetchNames();

        boolean isDelete = petroleum.delete("Bitumen");
        System.out.println("is delete " + isDelete);

        petroleum.fetchNames();
    }
}