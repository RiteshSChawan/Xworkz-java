class FlyingMachine {

    FlyingMachineAccount flyingMachineAccount;

    public boolean createFlyingMachineAccount(FlyingMachineAccount flyingMachineAccount) {
        boolean isAccountCreated = false;
        boolean isCustomerIdValid = false;
        boolean isFullNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isCityValid = false;
        boolean isAccountActiveValid = false;

        int customerId = flyingMachineAccount.getCustomerId();
        if (customerId > 0) {
            isCustomerIdValid = true;
        }

        String fullName = flyingMachineAccount.getFullName();
        if (fullName != null && !fullName.isEmpty()) {
            isFullNameValid = true;
        }

        String email = flyingMachineAccount.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }

        String password = flyingMachineAccount.getPassword();
        if (password != null && !password.isEmpty()) {
            isPasswordValid = true;
        }

        String gender = flyingMachineAccount.getGender();
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        }

        String dateOfBirth = flyingMachineAccount.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) {
            isDateOfBirthValid = true;
        }

        String city = flyingMachineAccount.getCity();
        if (city != null && !city.isEmpty()) {
            isCityValid = true;
        }

        boolean isAccountActive = flyingMachineAccount.getIsAccountActive();
        if (isAccountActive) {
            isAccountActiveValid = true;
        }

        if (isCustomerIdValid && isFullNameValid && isEmailValid && isPasswordValid &&
                isGenderValid && isDateOfBirthValid && isCityValid && isAccountActiveValid) {
            this.flyingMachineAccount = flyingMachineAccount;
            isAccountCreated = true;
        }

        return isAccountCreated;
    }

    public void getAccountDetails() {
        System.out.println("Customer ID     : " + flyingMachineAccount.getCustomerId());
        System.out.println("Full Name       : " + flyingMachineAccount.getFullName());
        System.out.println("Email           : " + flyingMachineAccount.getEmail());
        System.out.println("Password        : " + flyingMachineAccount.getPassword());
        System.out.println("Gender          : " + flyingMachineAccount.getGender());
        System.out.println("Date of Birth   : " + flyingMachineAccount.getDateOfBirth());
        System.out.println("City            : " + flyingMachineAccount.getCity());
        System.out.println("Account Active  : " + flyingMachineAccount.getIsAccountActive());
        System.out.println();
    }
}