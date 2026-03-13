class Brain {

    int brainId;
    String species;
    String region;
    double weight;
    double volume;
    int neuronCount;
    String dominantHemisphere;
    boolean isHealthy;
    double iQ;
    String bloodType;
    int age;
    double oxygenConsumption;
    boolean isActiveNow;
    String researchInstitute;
    String country;
    double glucoseConsumption;
    String memoryType;
    int synapseCount;
    boolean isImaged;
    String[] functions;

    public Brain(int brainId, String species, String region, double weight, double volume, int neuronCount, String dominantHemisphere, boolean isHealthy, double iQ, String bloodType, int age, double oxygenConsumption, boolean isActiveNow, String researchInstitute, String country, double glucoseConsumption, String memoryType, int synapseCount, boolean isImaged, String[] functions) {
        this.brainId = brainId;
        this.species = species;
        this.region = region;
        this.weight = weight;
        this.volume = volume;
        this.neuronCount = neuronCount;
        this.dominantHemisphere = dominantHemisphere;
        this.isHealthy = isHealthy;
        this.iQ = iQ;
        this.bloodType = bloodType;
        this.age = age;
        this.oxygenConsumption = oxygenConsumption;
        this.isActiveNow = isActiveNow;
        this.researchInstitute = researchInstitute;
        this.country = country;
        this.glucoseConsumption = glucoseConsumption;
        this.memoryType = memoryType;
        this.synapseCount = synapseCount;
        this.isImaged = isImaged;
        this.functions = functions;
    }

    public void getDetails() {
        System.out.println("BrainId : " + this.brainId);
        System.out.println("Species : " + this.species);
        System.out.println("Region : " + this.region);
        System.out.println("Weight : " + this.weight);
        System.out.println("Volume : " + this.volume);
        System.out.println("NeuronCount : " + this.neuronCount);
        System.out.println("DominantHemisphere : " + this.dominantHemisphere);
        System.out.println("IsHealthy : " + this.isHealthy);
        System.out.println("IQ : " + this.iQ);
        System.out.println("BloodType : " + this.bloodType);
        System.out.println("Age : " + this.age);
        System.out.println("OxygenConsumption : " + this.oxygenConsumption);
        System.out.println("IsActiveNow : " + this.isActiveNow);
        System.out.println("ResearchInstitute : " + this.researchInstitute);
        System.out.println("Country : " + this.country);
        System.out.println("GlucoseConsumption : " + this.glucoseConsumption);
        System.out.println("MemoryType : " + this.memoryType);
        System.out.println("SynapseCount : " + this.synapseCount);
        System.out.println("IsImaged : " + this.isImaged);
        System.out.println("Functions :");
        for (String item : this.functions)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}