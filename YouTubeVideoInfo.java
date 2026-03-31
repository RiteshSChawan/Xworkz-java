public class YouTubeVideoInfo {  // Encapsulation

    private int videoId;
    private String videoTitle;
    private String channelName;
    private String views;
    private String likes;
    private String uploadedOn;
    private String duration;

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }
    public int getVideoId() {
        return this.videoId;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }
    public String getVideoTitle() {
        return this.videoTitle;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public void setViews(String views) {
        this.views = views;
    }
    public String getViews() {
        return this.views;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
    public String getLikes() {
        return this.likes;
    }

    public void setUploadedOn(String uploadedOn) {
        this.uploadedOn = uploadedOn;
    }
    public String getUploadedOn() {
        return this.uploadedOn;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getDuration() {
        return this.duration;
    }

}
