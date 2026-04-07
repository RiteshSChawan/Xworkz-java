class Facebook{
	UserAccount userAccount;
	
	public boolean createUserAccount(UserAccount userAccount){
		boolean isUserAccountCreated = false;
		boolean isUserIdValid = false;
		boolean isUserNameValid=false;
		boolean isEmailValid = false;
		boolean isPasswordValid = false;
		boolean isGenderValid = false;
		boolean isDateOfBirthValid = false;
		boolean isLocationValid = false;
		boolean isAccountActiveValid = false;
		
		int userId = userAccount.getUserId();
		if(userId > 0){
			isUserIdValid = true;
		}
		String userName = userAccount.getUserName();
		if(userName != null && !userName.isEmpty()){
			isUserNameValid = true;
		}
		String email = userAccount.getEmail();
		if(email != null && !email.isEmpty()){
			isEmailValid = true;
		}
		String password = userAccount.getPassword();
		if(password != null && !password.isEmpty()){
			isPasswordValid = true;
		}
		String gender = userAccount.getGender();
		if(gender != null && !gender.isEmpty()){
			isGenderValid = true;
		}
		String dateOfBirth = userAccount.getDateOfBirth();
		if(dateOfBirth != null && !dateOfBirth.isEmpty()){
			isDateOfBirthValid = true;
		}
		String location = userAccount.getLocation();
		if(location != null && !location.isEmpty()){
			isLocationValid = true;
		}
		boolean isAccountActive = userAccount.getIsAccountActive();
		if(isAccountActive){
			isAccountActiveValid = true;
		}
			
		if(isUserIdValid && isUserNameValid && isEmailValid && isPasswordValid && isGenderValid &&
			isDateOfBirthValid && isLocationValid && isAccountActiveValid){
			this.userAccount = userAccount;
			isUserAccountCreated = true;
		}
		
	return isUserAccountCreated;
	}
	
	public void getUserDetails(){
		System.out.println("User id : "+userAccount.getUserId());
		System.out.println("User name : "+userAccount.getUserName());
		System.out.println("email : "+userAccount.getEmail());
		System.out.println("password : "+userAccount.getPassword());
		System.out.println("gender : "+userAccount.getGender());
		System.out.println("dateOfBirth : "+userAccount.getDateOfBirth());
		System.out.println("location : "+userAccount.getLocation());
		System.out.println("account active : "+userAccount.getIsAccountActive());
		System.out.println();
	}
	
}