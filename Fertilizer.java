public class Fertilizer {  // Encapsulation

    private int fertilizerId;
    private String fertilizerName;
    private String type;
    private String composition;
    private String manufacturer;
    private String suitableFor;
    private String price;

    public void setFertilizerId(int fertilizerId) {
        this.fertilizerId = fertilizerId;
    }
    public int getFertilizerId() {
        return this.fertilizerId;
    }

    public void setFertilizerName(String fertilizerName) {
        this.fertilizerName = fertilizerName;
    }
    public String getFertilizerName() {
        return this.fertilizerName;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return this.type;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }
    public String getComposition() {
        return this.composition;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setSuitableFor(String suitableFor) {
        this.suitableFor = suitableFor;
    }
    public String getSuitableFor() {
        return this.suitableFor;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public String getPrice() {
        return this.price;
    }

}
