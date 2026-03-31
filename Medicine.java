public class Medicine {  // Encapsulation

    private int medicineId;
    private String medicineName;
    private String dosage;
    private String manufacturer;
    private String expiresOn;
    private String sideEffects;
    private String price;

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }
    public int getMedicineId() {
        return this.medicineId;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    public String getMedicineName() {
        return this.medicineName;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    public String getDosage() {
        return this.dosage;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setExpiresOn(String expiresOn) {
        this.expiresOn = expiresOn;
    }
    public String getExpiresOn() {
        return this.expiresOn;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }
    public String getSideEffects() {
        return this.sideEffects;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public String getPrice() {
        return this.price;
    }

}
