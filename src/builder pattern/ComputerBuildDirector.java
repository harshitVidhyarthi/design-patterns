package builder_pattern;

public class ComputerBuildDirector {
	private ComputerBuilder computerBuilder;
	
	ComputerBuildDirector(ComputerBuilder computerBuilder){
		this.computerBuilder = computerBuilder;
	}
	
	public Computer construct() {
//		return computerBuilder.setCpu("Intel i5")
//							  .setBluetoothEnabled(true).getResult();
//		
		 return computerBuilder.getResult();
	}
	
}
