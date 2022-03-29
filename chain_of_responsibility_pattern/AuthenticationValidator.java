package chain_of_responsibility_pattern;

import java.util.HashMap;
import java.util.Map;

public class AuthenticationValidator extends AdminLoginValidator{

	public AuthenticationValidator(AdminLoginValidator validator) {
		super(validator);
	}
	
	Map<String,String> database = new HashMap<>();
	
	public void initializeDatabase() {
		database.put("Raghav","test1");
		database.put("Ashish","test2");
		database.put("Sumit","test3");
	}
	


	@Override
	public void process(User user) {
		
		initializeDatabase();
		
		if(database.containsKey(user.getUsername()) && database.get(user.getUsername()).equals(user.getPassword())) {
			if(validator != null) {
				validator.process(user);
			}
		}
		else {
			System.out.println("Invalid username/password combination\n");
		}
	}

}
