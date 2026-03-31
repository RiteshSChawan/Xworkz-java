public class GameInfo {  // Encapsulation

    private int gameId;
    private String gameName;
    private String genre;
    private String developer;
    private String releasedOn;
    private String platform;
    private String rating;

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }
    public int getGameId() {
        return this.gameId;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
    public String getGameName() {
        return this.gameName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return this.genre;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
    public String getDeveloper() {
        return this.developer;
    }

    public void setReleasedOn(String releasedOn) {
        this.releasedOn = releasedOn;
    }
    public String getReleasedOn() {
        return this.releasedOn;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getPlatform() {
        return this.platform;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getRating() {
        return this.rating;
    }

}
