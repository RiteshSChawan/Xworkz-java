public class Bank {  // Encapsulation

    private int bankId;
    private String bankName;
    private String branch;
    private String ifscCode;
    private String accountType;
    private String interestRate;
    private String establishedOn;

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }
    public int getBankId() {
        return this.bankId;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getBankName() {
        return this.bankName;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getBranch() {
        return this.branch;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
    public String getIfscCode() {
        return this.ifscCode;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }
    public String getInterestRate() {
        return this.interestRate;
    }

    public void setEstablishedOn(String establishedOn) {
        this.establishedOn = establishedOn;
    }
    public String getEstablishedOn() {
        return this.establishedOn;
    }

}
