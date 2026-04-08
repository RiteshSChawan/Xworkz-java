class BookMyShow {

    BookMyShowProfile bookMyShowProfiles[] = new BookMyShowProfile[19];
    int index;

    public boolean createBookMyShowProfile(BookMyShowProfile bookMyShowProfile) {
        boolean isBookMyShowProfileCreated = false;
        boolean isUserIdValid = false;
        boolean isUserNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isCityValid = false;
        boolean isProfileActiveValid = false;
        boolean isPreferredGenreValid = false;

        int userId = bookMyShowProfile.getUserId();
        if (userId > 0) { 
			isUserIdValid = true; 
		}
        String userName = bookMyShowProfile.getUserName();
        if (userName != null && !userName.isEmpty()) { 
			isUserNameValid = true; 
		}
        String email = bookMyShowProfile.getEmail();
        if (email != null && !email.isEmpty()) { 
			isEmailValid = true; 
		}
        String password = bookMyShowProfile.getPassword();
        if (password != null && !password.isEmpty()) { 
			isPasswordValid = true; 
		}
        String gender = bookMyShowProfile.getGender();
        if (gender != null && !gender.isEmpty()) { 
			isGenderValid = true; 
		}
        String dateOfBirth = bookMyShowProfile.getDateOfBirth();
        if (dateOfBirth != null && !dateOfBirth.isEmpty()) { 
			isDateOfBirthValid = true; 
		}
        String city = bookMyShowProfile.getCity();
        if (city != null && !city.isEmpty()) { 
			isCityValid = true; 
		}
        boolean isProfileActive = bookMyShowProfile.getIsProfileActive();
        if (isProfileActive) { 
			isProfileActiveValid = true; 
		}
        String preferredGenre = bookMyShowProfile.getPreferredGenre();
        if (preferredGenre != null && !preferredGenre.isEmpty()) { 
			isPreferredGenreValid = true; 
		}

        if (isUserIdValid && isUserNameValid && isEmailValid && isPasswordValid && isGenderValid &&
                isDateOfBirthValid && isCityValid && isProfileActiveValid && isPreferredGenreValid) {
            this.bookMyShowProfiles[index++] = bookMyShowProfile;
            isBookMyShowProfileCreated = true;
        }

        return isBookMyShowProfileCreated;
    }

    public void getBookMyShowProfileDetails() {
        System.out.println("The BookMyShow profiles are : ");
        for (BookMyShowProfile bookMyShowProfile : bookMyShowProfiles) {
            if (bookMyShowProfile != null) {
                System.out.println("-------------");
                System.out.println("User id : " + bookMyShowProfile.getUserId());
                System.out.println("User name : " + bookMyShowProfile.getUserName());
                System.out.println("Email : " + bookMyShowProfile.getEmail());
                System.out.println("Password : " + bookMyShowProfile.getPassword());
                System.out.println("Gender : " + bookMyShowProfile.getGender());
                System.out.println("Date of birth : " + bookMyShowProfile.getDateOfBirth());
                System.out.println("City : " + bookMyShowProfile.getCity());
                System.out.println("Profile active : " + bookMyShowProfile.getIsProfileActive());
                System.out.println("Preferred genre : " + bookMyShowProfile.getPreferredGenre());
                System.out.println("---------------");
            }
        }
    }
}
