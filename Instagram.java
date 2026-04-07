class Instagram {

    InstagramAccount instagramAccount;

    public boolean createInstagramAccount(InstagramAccount instagramAccount) {
        boolean isAccountCreated = false;
        boolean isUserIdValid = false;
        boolean isUserNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isBioValid = false;
        boolean isAccountActiveValid = false;

        int userId = instagramAccount.getUserId();
        if (userId > 0) {
            isUserIdValid = true;
        }

        String userName = instagramAccount.getUserName();
        if (userName != null && !userName.isEmpty()) {
            isUserNameValid = true;
        }

        String email = instagramAccount.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = instagramAccount.getPassword();
        if (password != null && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String gender = instagramAccount.getGender();
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        }

        String dateOfBirth = instagramAccount.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) {
            isDateOfBirthValid = true;
        }

        String bio = instagramAccount.getBio();
        if (bio != null && !bio.isEmpty()) {
            isBioValid = true;
        }

        boolean isAccountActive = instagramAccount.getIsAccountActive();
        if (isAccountActive) {
            isAccountActiveValid = true;
        }

        if (isUserIdValid && isUserNameValid && isEmailValid && isPasswordValid &&
                isGenderValid && isDateOfBirthValid && isBioValid && isAccountActiveValid) {
            this.instagramAccount = instagramAccount;
            isAccountCreated = true;
        }

        return isAccountCreated;
    }

    public void getAccountDetails() {
        System.out.println("User ID : " + instagramAccount.getUserId());
        System.out.println("Username : " + instagramAccount.getUserName());
        System.out.println("Email : " + instagramAccount.getEmail());
        System.out.println("Password : " + instagramAccount.getPassword());
        System.out.println("Gender : " + instagramAccount.getGender());
        System.out.println("Date of Birth  : " + instagramAccount.getDateOfBirth());
        System.out.println("Bio  : " + instagramAccount.getBio());
        System.out.println("Account Active  : " + instagramAccount.getIsAccountActive());
        System.out.println();
    }
}