class Spotify{ 

	public static void main(String[] args){
	
	String songs[] = {"Kannada songs", "Tamil songs", "Telugu Songs", "Hindi Songs", "English songs", "Classical songs", "Instrumental songs", "Bhojpuri songs"};
	
	//1. clasical approach i.e repetitive statements
	
	/* String kannadaSongs = songs[0];
	String tamilSongs = songs[1];
	String teluguSongs = songs[2];
	String hindiSongs = songs[3];
	String englishSongs = songs[4];
	String classicalSongs = songs[5];
	String instrumentalSongs = songs[6];
	String bhojpuriSongs = songs[7]; 
	
	System.out.println("The type of songs available are : " + songs.length);
	System.out.println("The type of Songs are : \n" );
	System.out.println(kannadaSongs + "\n "+ tamilSongs +"\n "+ teluguSongs +"\n "+ hindiSongs +"\n "+ englishSongs+"\n "+classicalSongs+"\n "+instrumentalSongs+"\n "+bhojpuriSongs); */
	
	//2. using for each 
	System.out.println("The type of songs available are : " + songs.length);
	System.out.println("The type of Songs are : \n" );
	for(String song : songs){  // for(datatype refName : arrayName)  --> prints using refName
		System.out.println(song);
	}
	
	}
}