class Channel {
	int channelId;
	String channelName;
	String genre;
	String language;
	boolean isHD;
	
	public Channel(int channelId, String channelName, String genre, String language, boolean isHD) {
		this.channelId = channelId;
		this.channelName = channelName;
		this.genre = genre;
		this.language = language;
		this.isHD = isHD;
	}
	
	public void getChannelDetails() {
		System.out.println("ChannelId: " + channelId);
		System.out.println("ChannelName: " + channelName);
		System.out.println("Genre: " + genre);
		System.out.println("Language: " + language);
		System.out.println("IsHD: " + isHD);
	}
}