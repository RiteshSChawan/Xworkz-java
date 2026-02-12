class SpeakerExecutor{
	public static void main(String[] args){
	boolean ref = Speaker.onOrOff();
	System.out.println("The speaker is connected " + ref);
	boolean ref1 = Speaker.onOrOff();
	System.out.println("The speaker is connected " + ref1);
	}
}