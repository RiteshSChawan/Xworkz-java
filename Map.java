class Map {

    int mapId;
    String title;
    String region;
    String type;
    double price;
    double scale;
    int publishYear;
    String publisher;
    boolean isDigital;
    String language;
    double width;
    double height;
    String material;
    boolean isLaminated;
    String projection;
    String origin;
    boolean isAvailable;
    String supplier;
    int edition;
    String[] featuredCities;

    public Map(int mapId, String title, String region, String type, double price, double scale, int publishYear, String publisher, boolean isDigital, String language, double width, double height, String material, boolean isLaminated, String projection, String origin, boolean isAvailable, String supplier, int edition, String[] featuredCities) {
        this.mapId = mapId;
        this.title = title;
        this.region = region;
        this.type = type;
        this.price = price;
        this.scale = scale;
        this.publishYear = publishYear;
        this.publisher = publisher;
        this.isDigital = isDigital;
        this.language = language;
        this.width = width;
        this.height = height;
        this.material = material;
        this.isLaminated = isLaminated;
        this.projection = projection;
        this.origin = origin;
        this.isAvailable = isAvailable;
        this.supplier = supplier;
        this.edition = edition;
        this.featuredCities = featuredCities;
    }

    public void getDetails() {
        System.out.println("MapId : " + this.mapId);
        System.out.println("Title : " + this.title);
        System.out.println("Region : " + this.region);
        System.out.println("Type : " + this.type);
        System.out.println("Price : " + this.price);
        System.out.println("Scale : " + this.scale);
        System.out.println("PublishYear : " + this.publishYear);
        System.out.println("Publisher : " + this.publisher);
        System.out.println("IsDigital : " + this.isDigital);
        System.out.println("Language : " + this.language);
        System.out.println("Width : " + this.width);
        System.out.println("Height : " + this.height);
        System.out.println("Material : " + this.material);
        System.out.println("IsLaminated : " + this.isLaminated);
        System.out.println("Projection : " + this.projection);
        System.out.println("Origin : " + this.origin);
        System.out.println("IsAvailable : " + this.isAvailable);
        System.out.println("Supplier : " + this.supplier);
        System.out.println("Edition : " + this.edition);
        System.out.println("FeaturedCities :");
        for (String item : this.featuredCities)
            System.out.println("  " + item);
        System.out.println("----------------");
    }
}