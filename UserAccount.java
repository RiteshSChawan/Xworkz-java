public class UserAccount {  // Encapsulation

    private int userId;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private String createdOn;
    private String accountType;

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getUserId() {
        return this.userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return this.username;
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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }
    public String getCreatedOn() {
        return this.createdOn;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getAccountType() {
        return this.accountType;
    }

}
