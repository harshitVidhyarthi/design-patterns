package builder_pattern;

public class ModifiedComputerBuilderDirector {
	
	public Computer getBasicLenovoComputer() {
		return new ComputerBuildDirector(new LenovoBuilder()).construct();
	}
	
	public Computer getBasicDellComputer() {
		return new ComputerBuildDirector(new DellBuilder()).construct();
	}
	
	public Computer getBluetoothEnabledLenovoComputer() {
		
		LenovoBuilder lenovoBuilder = new LenovoBuilder();
		lenovoBuilder.setBluetoothEnabled(true);
		
		return new ComputerBuildDirector(lenovoBuilder).construct();
	}
	
	public Computer getGraphicCardEnabledDellComputer() {
		
		DellBuilder dellBuilder = new DellBuilder();
		dellBuilder.setGraphicsCardEnabled(true);
		return new ComputerBuildDirector(dellBuilder).construct();
	}
}
