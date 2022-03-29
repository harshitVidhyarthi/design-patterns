package prototype_pattern;

public class OtherUser extends User {
	
	OtherUser(){
		role = "others";
	}

	@Override
	void viewDirectory(String dname) {
		System.out.println("Other users accessing directory "+ dname);
	}

	@Override
	void viewFile(String fname) {
		System.out.println("Other users accessing file "+ fname);
	}

}
