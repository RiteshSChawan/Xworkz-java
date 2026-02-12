class SpeakerExecutor{
	public static void main(String[] args){
	boolean ref = Speaker.onOrOff();
	System.out.println("The speaker is connected " + ref);
	
	 Speaker.increaseVolume();
	 Speaker.increaseVolume();
	 Speaker.increaseVolume();
	 Speaker.decreaseVolume();
	 Speaker.decreaseVolume();
	
	ref  = Speaker.onOrOff();
	System.out.println("The speaker is connected "+ ref);
	}
}