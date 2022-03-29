package command_pattern;

public class AirConditionerOnCommand implements Command{
	
	private AirConditioner airConditioner;

	public AirConditionerOnCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}

	@Override
	public void execute() {
		airConditioner.switchOn();
		airConditioner.setTemperature(21);
	}
}
