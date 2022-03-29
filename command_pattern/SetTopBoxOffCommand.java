package command_pattern;

public class SetTopBoxOffCommand implements Command {

	private SetTopBox setTopBox;
	
	public SetTopBoxOffCommand(SetTopBox setTopBox) {
		this.setTopBox = setTopBox;
	}
	
	@Override
	public void execute() {
		setTopBox.switchOff();
	}
	
}
