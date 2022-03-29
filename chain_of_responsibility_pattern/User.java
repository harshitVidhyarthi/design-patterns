package chain_of_responsibility_pattern;

public class User {
	private String username;
	private String password;
	private String role;
	private int experience;
	
	
	public User(String username, String password, String role, int experience) {
		this.username = username;
		this.password = password;
		this.role = role;
		this.experience = experience;
	}
	
	public User() {}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", role=" + role + ", experience=" + experience
				+ "]";
	}
	
}
