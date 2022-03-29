package chain_of_responsibility_pattern;

public class AuthorizationValidator extends AdminLoginValidator{

	public AuthorizationValidator(AdminLoginValidator validator) {
		super(validator);
	}

	@Override
	public void process(User user) {
		if(!user.getRole().toLowerCase().equals("admin")) {
			System.out.println("Sorry " + user.getUsername() + ", only admins can access this page\n");
		}
		else if(user.getExperience() < 5) {
			System.out.println("Sorry " + user.getUsername() + ", your experience doesn't match the required criteria\n");
		}
		else if(validator != null){
			validator.process(user);
		}
		else {
			System.out.println("You have successfully logged in " + user.getUsername() + "\n");
		}
	}
}
