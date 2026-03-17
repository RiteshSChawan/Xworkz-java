class Tv {
	int tvId;
	String tvBrand;
	String screenSize;
	int channels;
	double price;
	Channel channel;
	
	public Tv(int tvId, String tvBrand, String screenSize, int channels, double price, Channel channel) {
		this.tvId = tvId;
		this.tvBrand = tvBrand;
		this.screenSize = screenSize;
		this.channels = channels;
		this.price = price;
		this.channel = channel;
	}
	
	public void getTvDetails() {
		System.out.println("Tv Details:");
		System.out.println("TvId: " + tvId);
		System.out.println("TvBrand: " + tvBrand);
		System.out.println("ScreenSize: " + screenSize);
		System.out.println("Channels: " + channels);
		System.out.println("Price: " + price);
		this.channel.getChannelDetails();
		System.out.println("----------------");
	}
}