class Cell {

    int cellId;
    String type;
    String organism;
    String shape;
    double size;
    boolean hasnucleus;
    String function;
    int chromosomeCount;
    double lifespan;
    boolean isDividing;
    String membrane;
    String organelles;
    double pH;
    String location;
    boolean isHealthy;
    String researchLab;
    String country;
    double oxygenLevel;
    boolean isCancerous;
    String[] components;

    public Cell(int cellId, String type, String organism, String shape, double size, boolean hasnucleus, String function, int chromosomeCount, double lifespan, boolean isDividing, String membrane, String organelles, double pH, String location, boolean isHealthy, String researchLab, String country, double oxygenLevel, boolean isCancerous, String[] components) {
        this.cellId = cellId;
        this.type = type;
        this.organism = organism;
        this.shape = shape;
        this.size = size;
        this.hasnucleus = hasnucleus;
        this.function = function;
        this.chromosomeCount = chromosomeCount;
        this.lifespan = lifespan;
        this.isDividing = isDividing;
        this.membrane = membrane;
        this.organelles = organelles;
        this.pH = pH;
        this.location = location;
        this.isHealthy = isHealthy;
        this.researchLab = researchLab;
        this.country = country;
        this.oxygenLevel = oxygenLevel;
        this.isCancerous = isCancerous;
        this.components = components;
    }

    public void getDetails() {
        System.out.println("CellId : " + this.cellId);
        System.out.println("Type : " + this.type);
        System.out.println("Organism : " + this.organism);
        System.out.println("Shape : " + this.shape);
        System.out.println("Size : " + this.size);
        System.out.println("Hasnucleus : " + this.hasnucleus);
        System.out.println("Function : " + this.function);
        System.out.println("ChromosomeCount : " + this.chromosomeCount);
        System.out.println("Lifespan : " + this.lifespan);
        System.out.println("IsDividing : " + this.isDividing);
        System.out.println("Membrane : " + this.membrane);
        System.out.println("Organelles : " + this.organelles);
        System.out.println("PH : " + this.pH);
        System.out.println("Location : " + this.location);
        System.out.println("IsHealthy : " + this.isHealthy);
        System.out.println("ResearchLab : " + this.researchLab);
        System.out.println("Country : " + this.country);
        System.out.println("OxygenLevel : " + this.oxygenLevel);
        System.out.println("IsCancerous : " + this.isCancerous);
        System.out.println("Components :");
        for (String item : this.components)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}