package prototype_pattern;

public abstract class User implements Cloneable {

	protected String name;
	protected String role;
	protected String permissions;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPermissions() {
		return permissions;
	}
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
	
	//Abstract methods to be implemented
	
	abstract void viewDirectory(String dname);
	abstract void viewFile(String fname);


	public Object clone() {
		Object clone = null;

		try {
			clone = super.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}

}
