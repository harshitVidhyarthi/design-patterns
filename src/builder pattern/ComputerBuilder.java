package builder_pattern;

public abstract class ComputerBuilder {
	
	protected String ram;
	protected String cpu;
	protected String hdd;
	
	//Optional parameters
	protected boolean isGraphicsCardEnabled;
	protected boolean isBluetoothEnabled;
	
	
	// abstract method to be implemented using a Concrete class
	public abstract Computer getResult();
	
	public abstract ComputerBuilder setRam(String ram);
	public abstract ComputerBuilder setCpu(String cpu);
	public abstract ComputerBuilder setHdd(String hdd);

	public abstract ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled);
	public abstract ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled);
	
}