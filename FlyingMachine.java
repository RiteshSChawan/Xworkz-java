class FlyingMachine {

    FlyingMachineProfile flyingMachineProfiles[] = new FlyingMachineProfile[19];
    int index;

    public boolean createFlyingMachineProfile(FlyingMachineProfile flyingMachineProfile) {
        boolean isFlyingMachineProfileCreated = false;
        boolean isCustomerIdValid = false;
        boolean isCustomerNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isCityValid = false;
        boolean isProfileActiveValid = false;

        int customerId = flyingMachineProfile.getCustomerId();
        if (customerId > 0) {
            isCustomerIdValid = true;
        }
        String customerName = flyingMachineProfile.getCustomerName();
        if (customerName != null && !customerName.isEmpty()) {
            isCustomerNameValid = true;
        }
        String email = flyingMachineProfile.getEmail();
        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        }
        String password = flyingMachineProfile.getPassword();
        if (password != null && !password.isEmpty()) {
            isPasswordValid = true;
        }
        String gender = flyingMachineProfile.getGender();
        if (gender != null && !gender.isEmpty()) {
            isGenderValid = true;
        }
        String dateOfBirth = flyingMachineProfile.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) {
            isDateOfBirthValid = true;
        }
        String city = flyingMachineProfile.getCity();
        if (city != null && !city.isEmpty()) {
            isCityValid = true;
        }
        boolean isProfileActive = flyingMachineProfile.getIsProfileActive();
        if (isProfileActive) {
            isProfileActiveValid = true;
        }

        if (isCustomerIdValid && isCustomerNameValid && isEmailValid && isPasswordValid && isGenderValid &&
                isDateOfBirthValid && isCityValid && isProfileActiveValid) {
            this.flyingMachineProfiles[index++] = flyingMachineProfile;
            isFlyingMachineProfileCreated = true;
        }

        return isFlyingMachineProfileCreated;
    }

    public void getFlyingMachineProfileDetails() {
        System.out.println("The FlyingMachine profiles are : ");
        for (FlyingMachineProfile flyingMachineProfile : flyingMachineProfiles) {
            if (flyingMachineProfile != null) {
                System.out.println("-------------");
                System.out.println("Customer id : " + flyingMachineProfile.getCustomerId());
                System.out.println("Customer name : " + flyingMachineProfile.getCustomerName());
                System.out.println("Email : " + flyingMachineProfile.getEmail());
                System.out.println("Password : " + flyingMachineProfile.getPassword());
                System.out.println("Gender : " + flyingMachineProfile.getGender());
                System.out.println("Date of birth : " + flyingMachineProfile.getDateOfBirth());
                System.out.println("City : " + flyingMachineProfile.getCity());
                System.out.println("Profile active : " + flyingMachineProfile.getIsProfileActive());
                System.out.println("---------------");
            }
        }
    }
}
