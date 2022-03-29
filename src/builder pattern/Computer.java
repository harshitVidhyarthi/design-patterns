package builder_pattern;

public class Computer {
	
	//Mandatory parameters
	private String ram;
	private String cpu;
	private String hdd;
	
	
	//Optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	
	// Constructor with mandatory parameters
	public Computer(String ram, String cpu, String hdd) {
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}
	
	public String getRam() {
		return ram;
	}
	public String getCpu() {
		return cpu;
	}
	public String getHdd() {
		return hdd;
	}
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public void setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
	}

	public void setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + ", isGraphicsCardEnabled="
				+ isGraphicsCardEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
	
}