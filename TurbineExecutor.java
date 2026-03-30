class TurbineExecutor {

    public static void main(String[] h) {

        Turbine turbine = new Turbine();

        boolean isAdded = turbine.addName("SteamTurbine");
        System.out.println("Name is added " + isAdded);

        turbine.addName("GasTurbine");
        turbine.addName("WindTurbine");
        turbine.addName("HydroTurbine");
        turbine.addName("ImpulseTurbine");
        turbine.addName("ReactionTurbine");
        turbine.addName("JetTurbine");
        turbine.addName("MicroTurbine");
        turbine.addName("PowerTurbine");
        turbine.addName("AxialTurbine");

        turbine.fetchNames();

        boolean isFound = turbine.search("WindTurbine");
        System.out.println("is found " + isFound);

        boolean isUpdate = turbine.update("JetTurbine", "TurboJet");
        System.out.println("is update " + isUpdate);

        turbine.fetchNames();

        boolean isDelete = turbine.delete("ImpulseTurbine");
        System.out.println("is delete " + isDelete);

        turbine.fetchNames();
    }
}