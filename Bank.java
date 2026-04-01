class Bank {

	private String bankName;
	private String branch;
	private String ifscCode;
	private String accountHolder;
	private String accountType;
	private double balance;
	private String contactNumber;

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

	public void setAccountHolder(String accountHolder) { 
		this.accountHolder = accountHolder; 
	}

	public String getAccountHolder() { 
		return this.accountHolder; 
	}

	public void setAccountType(String accountType) { 
		this.accountType = accountType; 
	}

	public String getAccountType() { 
		return this.accountType; 
	}

	public void setBalance(double balance) { 
		this.balance = balance; 
	}

	public double getBalance() { 
		return this.balance; 
	}

	public void setContactNumber(String contactNumber) { 
		this.contactNumber = contactNumber; 
	}

	public String getContactNumber() { 
		return this.contactNumber; 
	}

}