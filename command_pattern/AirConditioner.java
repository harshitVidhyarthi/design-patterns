package command_pattern;

public class AirConditioner {
	
	public void switchOn() {
		System.out.println("Air Conditioner is switched on");
	}
	
	public void switchOff() {
		System.out.println("Air Conditioner is switched off");
	}
	
	public void setTemperature(int temperature) {
		System.out.println("Air Conditioner temperature set to " + temperature + " degrees celsius");
	}
	
	public void autoAdjustTemperature() {
		System.out.println("Air Conditioner temperature automatically determined");
	}
	
	public void purifyAir() {
		System.out.println("Air Conditioner air purification enabled");
	}
}
