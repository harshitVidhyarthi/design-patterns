package command_pattern;

public class SetTopBoxOnCommand implements Command {

	private SetTopBox setTopBox;
	
	public SetTopBoxOnCommand(SetTopBox setTopBox) {
		this.setTopBox = setTopBox;
	}
	
	@Override
	public void execute() {
		setTopBox.switchOn();
		setTopBox.setChannel(113);
		setTopBox.setVolume(20);
	}
	
}
