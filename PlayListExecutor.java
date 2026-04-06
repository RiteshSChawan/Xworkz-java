import java.util.Scanner;
class PlayListExecutor {
    public static void main(String[] args) {
        PlayList playList = new PlayList();
        /* playList.addSong("Kesariya");
        playList.addSong("Tum Hi Ho");
        playList.addSong("Raataan Lambiyan");
        playList.addSong("Tera Ban Jaunga");
        playList.addSong("Channa Mereya");
        playList.addSong("Ae Dil Hai Mushkil");
        playList.addSong("Kalank");
        playList.addSong("Hawayein");
        playList.addSong("Ik Vaari Aa");
        playList.addSong("Shayad");
        playList.addSong("Bekhayali");
        playList.addSong("Tera Fitoor");
        playList.addSong("Meri Aashiqui");
        playList.addSong("Dilbaro");
        playList.addSong("Judaai");
        playList.getSongDetails(); */
		
		
		Scanner sc = new Scanner(System.in);
        for (int index = 0; index < playList.songNames.length; index++) {
            System.out.println("Enter song name : ");
            playList.addSongName(sc.nextLine());
        }
        playList.getSongDetails();
		sc.close();
		
        int index = 0;
        System.out.println("Song at index " + index + " is: " + playList.getSongByIndex(index));
        System.out.println("Index of Blinding Lights: " + playList.getIndexBySong("Blinding Lights"));
        System.out.println("Is updated: " + playList.updateSong("Blinding Lights", "Blinding Lights - Remix"));
        playList.getSongDetails();
        System.out.println("Is deleted: " + playList.deleteSong("Shape of You"));
        playList.getSongDetails();
 

    }
}
