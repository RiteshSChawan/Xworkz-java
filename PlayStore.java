
class PlayStore {
    static String appName;
    static String developer;
    static double size;
    static double rating;
    static int downloads;
    static String category;
    static double price;
    static boolean isAdsSupported;
    static String version;
    static String contentRating;

    public static boolean createApp(String name, String dev, double appSize, double appRating, int downloadCount, String appCategory, double appPrice, boolean ads, String ver, String content) {
        boolean isAppCreated = false;
        
        boolean isNameValid = false;
        boolean isDevValid = false;
        boolean isSizeValid = false;
        boolean isRatingValid = false;
        boolean isDownloadsValid = false;
        boolean isCategoryValid = false;
        boolean isPriceValid = false;
        boolean isAdsValid = true; 
        boolean isVersionValid = false;
        boolean isContentValid = false;

        if (name != null && !name.isEmpty()) {
            System.out.println("App name is Valid");
            appName = name;
            isNameValid = true;
        } else {
            System.out.println("App name is invalid");
        }

        if (dev != null && !dev.isEmpty()) {
            System.out.println("Developer name is Valid");
            developer = dev;
            isDevValid = true;
        } else {
            System.out.println("Developer name is invalid");
        }

        if (appSize > 0) {
            System.out.println("App size is Valid");
            size = appSize;
            isSizeValid = true;
        } else {
            System.out.println("App size is invalid");
        }

        if (appRating >= 0 && appRating <= 5) {
            System.out.println("Rating is Valid");
            rating = appRating;
            isRatingValid = true;
        } else {
            System.out.println("Rating is invalid");
        }

        if (downloadCount >= 0) {
            System.out.println("Download count is Valid");
            downloads = downloadCount;
            isDownloadsValid = true;
        } else {
            System.out.println("Download count is invalid");
        }

        if (appCategory != null && !appCategory.isEmpty()) {
            System.out.println("Category is Valid");
            category = appCategory;
            isCategoryValid = true;
        } else {
            System.out.println("Category is invalid");
        }

        if (appPrice >= 0) {
            System.out.println("Price is Valid");
            price = appPrice;
            isPriceValid = true;
        } else {
            System.out.println("Price is invalid");
        }

        isAdsSupported = ads;

        if (ver != null && !ver.isEmpty()) {
            System.out.println("Version is Valid");
            version = ver;
            isVersionValid = true;
        } else {
            System.out.println("Version is invalid");
        }

        if (content != null && !content.isEmpty()) {
            System.out.println("Content rating is Valid");
            contentRating = content;
            isContentValid = true;
        } else {
            System.out.println("Content rating is invalid");
        }

        if (isNameValid && isDevValid && isSizeValid && isRatingValid && isDownloadsValid && isCategoryValid && isPriceValid && isVersionValid && isContentValid) {
            isAppCreated = true;
        } else {
            System.out.println("The App is not valid and could not be created");
        }

        return isAppCreated;
    }

    public static void getAppDetails() {
        System.out.println("Play Store App Details:");
        System.out.println("App Name: " + appName);
        System.out.println("Developer: " + developer);
        System.out.println("Size: " + size + " MB");
        System.out.println("Rating: " + rating + " Stars");
        System.out.println("Downloads: " + downloads);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Ads Supported: " + isAdsSupported);
        System.out.println("Version: " + version);
        System.out.println("Content Rating: " + contentRating);
    }
}
