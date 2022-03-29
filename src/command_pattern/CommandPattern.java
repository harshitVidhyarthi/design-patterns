package command_pattern;

public class CommandPattern {

	public static void main(String[] args) {
		// Client side
		
		RemoteControl remoteControl = new RemoteControl();
		
		AirConditioner airConditioner = new AirConditioner();
		SetTopBox setTopBox = new SetTopBox();
		
		remoteControl.setCommand(new SetTopBoxOnCommand(setTopBox));
		remoteControl.pressButton();
		
		System.out.println("------------------------------------------------------------");
		
		remoteControl.setCommand(new SetTopBoxOffCommand(setTopBox));
		remoteControl.pressButton();
		
		System.out.println("------------------------------------------------------------");
		
		remoteControl.setCommand(new AirConditionerOnCommand(airConditioner));
		remoteControl.pressButton();
		
		System.out.println("------------------------------------------------------------");
		
		remoteControl.setCommand(new AirConditionerOffCommand(airConditioner));
		remoteControl.pressButton();
		
		System.out.println("------------------------------------------------------------");
		
		remoteControl.setCommand(new AirConditionerAutoAdjustPurifyCommand(airConditioner));
		remoteControl.pressButton();
	}

}
