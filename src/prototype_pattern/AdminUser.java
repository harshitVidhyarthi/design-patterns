package prototype_pattern;

public class AdminUser extends User {
	
	AdminUser(){
		role = "admin";
	}

	@Override
	void viewDirectory(String dname) {
		System.out.println("Admin accessing directory "+ dname);
	}

	@Override
	void viewFile(String fname) {
		System.out.println("Admin accessing file "+ fname);
	}

}
