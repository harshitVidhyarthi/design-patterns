package command_pattern;

public class AirConditionerAutoAdjustPurifyCommand implements Command{
	private AirConditioner airConditioner;

	public AirConditionerAutoAdjustPurifyCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}

	@Override
	public void execute() {
		airConditioner.purifyAir();
		airConditioner.autoAdjustTemperature();
	}
}
