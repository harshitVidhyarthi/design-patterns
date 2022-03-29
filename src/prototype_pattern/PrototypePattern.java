package prototype_pattern;

public class PrototypePattern {
	public static void main(String[] args) {
		UserCache.loadCache();

		

		User clonedGuest = (User) UserCache.getUser("guest");
		System.out.println("User : " + clonedGuest.getRole());

		User clonedOthers = (User) UserCache.getUser("others");
		System.out.println("User : " + clonedOthers.getRole());
		
		System.out.println("-------------------------------------------------");
		// Demo
		
		User clonedAdmin = (User) UserCache.getUser("admin");
		//System.out.println("User : " + clonedAdmin.getRole());	
		clonedAdmin.setName("Harshit");
		System.out.println("User name: " + clonedAdmin.getName());

		System.out.println("-------------------------------------------------");
		
		User clonedAdmin2 = (User) UserCache.getUser("admin");
		//System.out.println("User : " + clonedAdmin2.getRole());
		
		System.out.println("User name: " + clonedAdmin2.getName());		
	}
}
