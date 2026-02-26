
class PharmaceuticalCompany {
    static String companyName;
    static String licenseNumber;
    static String headquarters;
    static int yearEstablished;
    static int totalProducts;
    static double annualRevenue;
    static boolean isFDAApproved;
    static boolean hasResearchLab;

    public static boolean createCompany(String name, String license, String location, int year, int products, double revenue, boolean fdaStatus, boolean labStatus) {
        boolean isCompanyCreated = false;

        boolean isNameValid = false;
        boolean isLicenseValid = false;
        boolean isLocationValid = false;
        boolean isYearValid = false;
        boolean isProductsValid = false;
        boolean isRevenueValid = false;
        boolean isFdaValid = true;
        boolean isLabValid = true;

        if (name != null && !name.isEmpty()) {
            System.out.println("Company name is Valid");
            companyName = name;
            isNameValid = true;
        } else {
            System.out.println("Company name is invalid");
        }

        if (license != null && !license.isEmpty()) {
            System.out.println("License number is Valid");
            licenseNumber = license;
            isLicenseValid = true;
        } else {
            System.out.println("License number is invalid");
        }

        if (location != null && !location.isEmpty()) {
            System.out.println("Headquarters location is Valid");
            headquarters = location;
            isLocationValid = true;
        } else {
            System.out.println("Headquarters location is invalid");
        }

        if (year > 1700) {
            System.out.println("Year established is Valid");
            yearEstablished = year;
            isYearValid = true;
        } else {
            System.out.println("Year established is invalid");
        }

        if (products >= 0) {
            System.out.println("Total products count is Valid");
            totalProducts = products;
            isProductsValid = true;
        } else {
            System.out.println("Total products count is invalid");
        }

        if (revenue > 0) {
            System.out.println("Annual revenue is Valid");
            annualRevenue = revenue;
            isRevenueValid = true;
        } else {
            System.out.println("Annual revenue is invalid");
        }

        isFDAApproved = fdaStatus;
        hasResearchLab = labStatus;

        if (isNameValid && isLicenseValid && isLocationValid && isYearValid && isProductsValid && isRevenueValid) {
            isCompanyCreated = true;
        } else {
            System.out.println("The pharmaceutical company data is not valid");
        }

        return isCompanyCreated;
    }

    public static void getCompanyDetails() {
        System.out.println("Pharmaceutical Company Details:");
        System.out.println("Company Name: " + companyName);
        System.out.println("License No: " + licenseNumber);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Year Established: " + yearEstablished);
        System.out.println("Total Products: " + totalProducts);
        System.out.println("Annual Revenue: $" + annualRevenue + " Billion");
        System.out.println("FDA Approved: " + isFDAApproved);
        System.out.println("Research Lab Available: " + hasResearchLab);
    }
}
