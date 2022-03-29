package abstract_factory_pattern;

public abstract class PhoneFactory {
	public abstract Phone getPhone(String name);
}

class FactoryProducer {
	public static PhoneFactory getFactory(String name) {
		if (name.toLowerCase().equals("samsung")) {
			return new SamsungPhoneFactory();
		} 
		else if(name.toLowerCase().equals("apple")) {
			return new ApplePhoneFactory();
		}
		else if(name.toLowerCase().equals("vivo")){
			return new VivoPhoneFactory();
		}
		else {
			// Throw an exception , have a default type to return etc etc..
			return null;
		}
	}
}
