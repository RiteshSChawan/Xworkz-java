import java.util.Scanner;
class TelevisionExecutor {
    public static void main(String[] args) {
        Television television = new Television();
        /* television.addChannel("Star Plus");
        television.addChannel("Sony TV");
        television.addChannel("Zee TV");
        television.addChannel("Colors TV");
        television.addChannel("Sun TV");
        television.addChannel("Vijay TV");
        television.addChannel("DD National");
        television.addChannel("News18");
        television.addChannel("NDTV");
        television.addChannel("Aaj Tak");
        television.addChannel("Republic TV");
        television.addChannel("ESPN");
        television.addChannel("Star Sports");
        television.addChannel("Discovery");
        television.addChannel("National Geographic");
        television.addChannel("Cartoon Network");
        television.addChannel("Pogo");
        television.getChannelDetails(); */
		
		Scanner sc = new Scanner(System.in);
         for (int index = 0; index < television.channelNames.length; index++) {
            System.out.println("Enter channel name : ");
            television.addChannelName(sc.nextLine());
        }
        television.getChannelDetails();
		sc.close();
		
        int index = 5;
        System.out.println("Channel at index " + index + " is: " + television.getChannelByIndex(index));
        System.out.println("Index of Star Sports: " + television.getIndexByChannel("Star Sports"));
        System.out.println("Is updated: " + television.updateChannel("Star Sports", "Star Sports HD"));
        television.getChannelDetails();
        System.out.println("Is deleted: " + television.deleteChannel("Zee TV"));
        television.getChannelDetails();
    }
}
