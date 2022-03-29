package abstract_factory_pattern;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		
		//Client abstraction
		PhoneFactory samsungFactory = FactoryProducer.getFactory("samsung");
		PhoneFactory appleFactory = FactoryProducer.getFactory("apple");
		PhoneFactory vivoFactory = FactoryProducer.getFactory("vivo");

		
		Phone samsung = samsungFactory.getPhone("model-1");
		Phone apple = appleFactory.getPhone("model-2");
		Phone vivo = vivoFactory.getPhone("model-3");
		
		System.out.println(samsung);
		System.out.println(apple);
		System.out.println(vivo);

	}

}
