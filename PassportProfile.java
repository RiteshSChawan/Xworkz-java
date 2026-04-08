class PassportProfile {

    private int passportId;
    private String fullName;
    private String email;
    private String password;
    private String gender;
    private String dateOfBirth;
    private String address;
    private boolean isProfileActive;

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }
    public int getPassportId() {
        return this.passportId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return this.fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return this.gender;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }

    public void setIsProfileActive(boolean isProfileActive) {
        this.isProfileActive = isProfileActive;
    }
    public boolean getIsProfileActive() {
        return this.isProfileActive;
    }
}
