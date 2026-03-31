public class PassportUser {  // Encapsulation

    private int passportId;
    private String holderName;
    private String nationality;
    private String dateOfBirth;
    private String issuedOn;
    private String expiresOn;
    private String visaType;

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }
    public int getPassportId() {
        return this.passportId;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public String getHolderName() {
        return this.holderName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getNationality() {
        return this.nationality;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setIssuedOn(String issuedOn) {
        this.issuedOn = issuedOn;
    }
    public String getIssuedOn() {
        return this.issuedOn;
    }

    public void setExpiresOn(String expiresOn) {
        this.expiresOn = expiresOn;
    }
    public String getExpiresOn() {
        return this.expiresOn;
    }

    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }
    public String getVisaType() {
        return this.visaType;
    }

}
