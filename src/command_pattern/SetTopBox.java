package command_pattern;

public class SetTopBox {
	
	public void switchOn() {
		System.out.println("Set Top Box is switched on");
	}
	
	public void switchOff() {
		System.out.println("Set Top Box is switched off");
	}
	
	public void setChannel(int defaultChannel) {
		System.out.println("Set Top Box switched to channel " + defaultChannel);
	}
	
	public void setVolume(int volume) {
		System.out.println("Set Top Box volume set to " + volume);
	}
}
