public class BroadCastDetails {  // Encapsulation

    private int broadcastId;
    private String channelName;
    private String showName;
    private String host;
    private String airDate;
    private String duration;
    private String genre;

    public void setBroadcastId(int broadcastId) {
        this.broadcastId = broadcastId;
    }
    public int getBroadcastId() {
        return this.broadcastId;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }
    public String getShowName() {
        return this.showName;
    }

    public void setHost(String host) {
        this.host = host;
    }
    public String getHost() {
        return this.host;
    }

    public void setAirDate(String airDate) {
        this.airDate = airDate;
    }
    public String getAirDate() {
        return this.airDate;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getDuration() {
        return this.duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return this.genre;
    }

}
