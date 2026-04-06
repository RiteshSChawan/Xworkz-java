import java.util.Scanner;
class NetflixExecutor {
    public static void main(String[] args) {
        Netflix netflix = new Netflix();
        /* netflix.addWebSeries("Family Man");
        netflix.addWebSeries("Sacred Games");
        netflix.addWebSeries("Mirzapur");
        netflix.addWebSeries("Panchayat");
        netflix.addWebSeries("Scam 1992");
        netflix.addWebSeries("Aspirants");
        netflix.addWebSeries("Delhi Crime");
        netflix.addWebSeries("Breathe");
        netflix.addWebSeries("Aarya");
        netflix.addWebSeries("Paatal Lok");
        netflix.addWebSeries("Kota Factory");
        netflix.addWebSeries("TVF Pitchers");
        netflix.addWebSeries("Jamtara");
        netflix.addWebSeries("Rocket Boys");
        netflix.addWebSeries("Taj Mahal 1989");
        netflix.addWebSeries("Four More Shots");
        netflix.addWebSeries("Hostages");
        netflix.addWebSeries("Typewriter");
        netflix.getWebSeriesDetails(); */
		
		Scanner sc = new Scanner(System.in);
        for (int index = 0; index < netflix.webSeries.length; index++) {
            System.out.println("Enter web series name : ");
            netflix.addWebSeries(sc.nextLine());
        }
        netflix.getWebSeriesDetails();
		sc.close();
		
        int index = 2;
        System.out.println("Web series at index " + index + " is: " + netflix.getWebSeriesByIndex(index));
        System.out.println("Index of Stranger Things: " + netflix.getIndexByWebSeries("Hostages"));
        System.out.println("Is updated: " + netflix.updateWebSeries("Mirzapur", "Mirzapur2"));
        netflix.getWebSeriesDetails();
        System.out.println("Is deleted: " + netflix.deleteWebSeries("Panchayat"));
        netflix.getWebSeriesDetails();
 
    }
}
