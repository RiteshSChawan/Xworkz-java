class GoogleDriveRegistration {

    public static void main(String[] args) {
        createAccount("ritesh@gmail.com", 15, "GB",true, "Free","India", "2-Step Verification");
    }

    static void createAccount(String email, int storageAllocated, String storageUnit, boolean backupEnabled, String accountType, String region, String security) {

        System.out.println("The Google Drive email is : " + email);
        System.out.println("The allocated storage is : " + storageAllocated + " " + storageUnit);
        System.out.println("Is backup enabled? " + backupEnabled);
        System.out.println("The account type is : " + accountType);
        System.out.println("The region selected is : " + region);
        System.out.println("The security method used is : " + security);
    }
}
