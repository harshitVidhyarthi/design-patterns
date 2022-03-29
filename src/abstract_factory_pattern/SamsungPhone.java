package abstract_factory_pattern;

public class SamsungPhone implements Phone{
	
	private String ram;
	private String memory;
	private String color;
	private String model;
	
	public SamsungPhone(String model) {
		System.out.println("Samsung phone " + model);
		this.model = model;
	}
	
	
	@Override
	public String getRam() {
		return ram;
	}

	@Override
	public String getMemory() {
		return memory;
	}

	@Override
	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return "Samsung Phone " + model;
	}

}
