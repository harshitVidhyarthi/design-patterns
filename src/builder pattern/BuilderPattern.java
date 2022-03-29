package builder_pattern;

public class BuilderPattern {

	public static void main(String[] args) {
		
		ComputerBuilder lenovoBuilder = new LenovoBuilder();
		lenovoBuilder.setBluetoothEnabled(true);
		
		ComputerBuilder dellBuilder = new DellBuilder();
		dellBuilder.setGraphicsCardEnabled(true);
		
		ComputerBuildDirector director1 = new ComputerBuildDirector(lenovoBuilder);
		ComputerBuildDirector director2 = new ComputerBuildDirector(dellBuilder);
		
		Computer lenovoComputer = director1.construct();
		Computer dellComputer = director2.construct();
		
		System.out.println(lenovoComputer);
		System.out.println(dellComputer);

	}

}
