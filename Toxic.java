class Toxic {

    int toxinId;
    String name;
    String chemicalFormula;
    String type;
    double lethalDose;
    String color;
    String state;
    double molecularWeight;
    boolean isFlammable;
    boolean isCorrosive;
    String hazardLevel;
    String antidote;
    String origin;
    double boilingPoint;
    double meltingPoint;
    boolean isRadioactive;
    String storageCondition;
    String supplier;
    String regulatoryClass;
    String[] symptoms;

    public Toxic(int toxinId, String name, String chemicalFormula, String type, double lethalDose, String color, String state, double molecularWeight, boolean isFlammable, boolean isCorrosive, String hazardLevel, String antidote, String origin, double boilingPoint, double meltingPoint, boolean isRadioactive, String storageCondition, String supplier, String regulatoryClass, String[] symptoms) {
        this.toxinId = toxinId;
        this.name = name;
        this.chemicalFormula = chemicalFormula;
        this.type = type;
        this.lethalDose = lethalDose;
        this.color = color;
        this.state = state;
        this.molecularWeight = molecularWeight;
        this.isFlammable = isFlammable;
        this.isCorrosive = isCorrosive;
        this.hazardLevel = hazardLevel;
        this.antidote = antidote;
        this.origin = origin;
        this.boilingPoint = boilingPoint;
        this.meltingPoint = meltingPoint;
        this.isRadioactive = isRadioactive;
        this.storageCondition = storageCondition;
        this.supplier = supplier;
        this.regulatoryClass = regulatoryClass;
        this.symptoms = symptoms;
    }

    public void getDetails() {
        System.out.println("ToxinId : " + this.toxinId);
        System.out.println("Name : " + this.name);
        System.out.println("ChemicalFormula : " + this.chemicalFormula);
        System.out.println("Type : " + this.type);
        System.out.println("LethalDose : " + this.lethalDose);
        System.out.println("Color : " + this.color);
        System.out.println("State : " + this.state);
        System.out.println("MolecularWeight : " + this.molecularWeight);
        System.out.println("IsFlammable : " + this.isFlammable);
        System.out.println("IsCorrosive : " + this.isCorrosive);
        System.out.println("HazardLevel : " + this.hazardLevel);
        System.out.println("Antidote : " + this.antidote);
        System.out.println("Origin : " + this.origin);
        System.out.println("BoilingPoint : " + this.boilingPoint);
        System.out.println("MeltingPoint : " + this.meltingPoint);
        System.out.println("IsRadioactive : " + this.isRadioactive);
        System.out.println("StorageCondition : " + this.storageCondition);
        System.out.println("Supplier : " + this.supplier);
        System.out.println("RegulatoryClass : " + this.regulatoryClass);
        System.out.println("Symptoms :");
        for (String item : this.symptoms)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}