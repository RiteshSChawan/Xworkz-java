public class LoanApplication {  // Encapsulation

    private int loanId;
    private String applicantName;
    private String loanType;
    private String loanAmount;
    private String interestRate;
    private String appliedOn;
    private String status;

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }
    public int getLoanId() {
        return this.loanId;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }
    public String getApplicantName() {
        return this.applicantName;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }
    public String getLoanType() {
        return this.loanType;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }
    public String getLoanAmount() {
        return this.loanAmount;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }
    public String getInterestRate() {
        return this.interestRate;
    }

    public void setAppliedOn(String appliedOn) {
        this.appliedOn = appliedOn;
    }
    public String getAppliedOn() {
        return this.appliedOn;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }

}
