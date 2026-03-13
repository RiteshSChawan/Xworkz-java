class Organ {

    int organId;
    String name;
    String system;
    String location;
    double weight;
    double size;
    boolean isVital;
    String function;
    String species;
    boolean isTransplantable;
    String bloodSupply;
    int cellCount;
    double oxygenDemand;
    boolean isPaired;
    String associatedDisease;
    String researchInstitute;
    String country;
    boolean isRegenerative;
    String tissue;
    String[] relatedOrgans;

    public Organ(int organId, String name, String system, String location, double weight, double size, boolean isVital, String function, String species, boolean isTransplantable, String bloodSupply, int cellCount, double oxygenDemand, boolean isPaired, String associatedDisease, String researchInstitute, String country, boolean isRegenerative, String tissue, String[] relatedOrgans) {
        this.organId = organId;
        this.name = name;
        this.system = system;
        this.location = location;
        this.weight = weight;
        this.size = size;
        this.isVital = isVital;
        this.function = function;
        this.species = species;
        this.isTransplantable = isTransplantable;
        this.bloodSupply = bloodSupply;
        this.cellCount = cellCount;
        this.oxygenDemand = oxygenDemand;
        this.isPaired = isPaired;
        this.associatedDisease = associatedDisease;
        this.researchInstitute = researchInstitute;
        this.country = country;
        this.isRegenerative = isRegenerative;
        this.tissue = tissue;
        this.relatedOrgans = relatedOrgans;
    }

    public void getDetails() {
        System.out.println("OrganId : " + this.organId);
        System.out.println("Name : " + this.name);
        System.out.println("System : " + this.system);
        System.out.println("Location : " + this.location);
        System.out.println("Weight : " + this.weight);
        System.out.println("Size : " + this.size);
        System.out.println("IsVital : " + this.isVital);
        System.out.println("Function : " + this.function);
        System.out.println("Species : " + this.species);
        System.out.println("IsTransplantable : " + this.isTransplantable);
        System.out.println("BloodSupply : " + this.bloodSupply);
        System.out.println("CellCount : " + this.cellCount);
        System.out.println("OxygenDemand : " + this.oxygenDemand);
        System.out.println("IsPaired : " + this.isPaired);
        System.out.println("AssociatedDisease : " + this.associatedDisease);
        System.out.println("ResearchInstitute : " + this.researchInstitute);
        System.out.println("Country : " + this.country);
        System.out.println("IsRegenerative : " + this.isRegenerative);
        System.out.println("Tissue : " + this.tissue);
        System.out.println("RelatedOrgans :");
        for (String item : this.relatedOrgans)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}