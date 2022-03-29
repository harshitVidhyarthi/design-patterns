package singleton_pattern;

public class SingletonPattern {
	public static void main(String[] args) {
		Singleton singleObj = Singleton.getInstance();
		singleObj.connectToDB();
	}
}




final class Singleton{
	private static Singleton singleObj;
	private static int count = 0;
	
	private Singleton(){
		count++;
		System.out.println("Count :" + count);
	}
	
	public static Singleton getInstance() {
		
		if(singleObj == null) {
			synchronized(Singleton.class) {
				if(singleObj == null) {
					singleObj = new Singleton();
				}
			}
		}
		return singleObj;
	}
	
	public void connectToDB() {
		System.out.println("Connected to DB");
	}
	
//	class NestedClass extends Singleton{
//		
//	}
//	
}