public class UserManual {  // Encapsulation

    private int manualId;
    private String productName;
    private String version;
    private String language;
    private String publishedOn;
    private String author;
    private String category;

    public void setManualId(int manualId) {
        this.manualId = manualId;
    }
    public int getManualId() {
        return this.manualId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return this.productName;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    public String getVersion() {
        return this.version;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public String getLanguage() {
        return this.language;
    }

    public void setPublishedOn(String publishedOn) {
        this.publishedOn = publishedOn;
    }
    public String getPublishedOn() {
        return this.publishedOn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return this.author;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return this.category;
    }

}
