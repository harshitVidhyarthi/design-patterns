package builder_pattern;

public class LenovoBuilder extends ComputerBuilder{
	
	private Computer lenovo;
	
	LenovoBuilder(){
		lenovo = new Computer("4 GB","Intel i7","1 TB");
	}

	@Override
	public Computer getResult() {
		return lenovo;
	}
	
	public ComputerBuilder setRam(String ram) {
		lenovo.setRam(ram);
		return this;
	}


	public ComputerBuilder setCpu(String cpu) {
		lenovo.setCpu(cpu);
		return this;
	}


	public ComputerBuilder setHdd(String hdd) {
		lenovo.setHdd(hdd);
		return this;
	}


	public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		lenovo.setGraphicsCardEnabled(isGraphicsCardEnabled);
		return this;
	}


	public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
		lenovo.setBluetoothEnabled(isBluetoothEnabled);
		return this;
	}

}
