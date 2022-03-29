package abstract_factory_pattern;

public class SamsungPhoneFactory extends PhoneFactory{
	public Phone getPhone(String model) {
		if(model.toLowerCase().equals("model-1")) {
			return new SamsungPhone(model);
		}
		else if(model.toLowerCase().equals("model-2")) {
			return new SamsungPhone(model);
		}
		else if(model.toLowerCase().equals("model-3")) {
			return new SamsungPhone(model);
		}
		return null;
	}
}

class ApplePhoneFactory extends PhoneFactory{
	public Phone getPhone(String model) {
		if(model.toLowerCase().equals("model-1")) {
			return new ApplePhone(model);
		}
		else if(model.toLowerCase().equals("model-2")) {
			return new ApplePhone(model);
		}
		else if(model.toLowerCase().equals("model-3")) {
			return new ApplePhone(model);
		}
		return null;
	}
}

class VivoPhoneFactory extends PhoneFactory{
	public Phone getPhone(String model) {
		if(model.toLowerCase().equals("model-1")) {
			return new VivoPhone(model);
		}
		else if(model.toLowerCase().equals("model-2")) {
			return new VivoPhone(model);
		}
		else if(model.toLowerCase().equals("model-3")) {
			return new VivoPhone(model);
		}
		return null;
	}
}

