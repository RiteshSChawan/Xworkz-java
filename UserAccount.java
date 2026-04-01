class UserAccount {
    private int userId;
    private String userName;
    private String email;
    private String mobileNumber;
    private String state;
    private String accountStatus;
    private String lastLogin;

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getUserId() {
        return this.userId;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return this.userName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return this.state;
    }
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
    public String getAccountStatus() {
        return this.accountStatus;
    }
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }
    public String getLastLogin() {
        return this.lastLogin;
    }
}