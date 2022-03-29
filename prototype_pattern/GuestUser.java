package prototype_pattern;

public class GuestUser extends User {
	
	GuestUser(){
		role = "guest";
	}

	@Override
	void viewDirectory(String dname) {
		System.out.println("Guest accessing directory "+ dname);
	}

	@Override
	void viewFile(String fname) {
		System.out.println("Guest accessing file "+ fname);
	}

}
