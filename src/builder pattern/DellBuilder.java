package builder_pattern;

public class DellBuilder extends ComputerBuilder{
	
	private Computer dell;
	
	DellBuilder(){
		dell = new Computer("6 GB","Intel i7","2 TB");
	}

	@Override
	public Computer getResult() {
		return dell;
	}
	
	public ComputerBuilder setRam(String ram) {
		dell.setRam(ram);
		return this;
	}


	public ComputerBuilder setCpu(String cpu) {
		dell.setCpu(cpu);
		return this;
	}


	public ComputerBuilder setHdd(String hdd) {
		dell.setHdd(hdd);
		return this;
	}


	public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		dell.setGraphicsCardEnabled(isGraphicsCardEnabled);
		return this;
	}


	public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
		dell.setBluetoothEnabled(isBluetoothEnabled);
		return this;
	}

}
