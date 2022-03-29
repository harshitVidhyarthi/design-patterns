package chain_of_responsibility_pattern;

public abstract class AdminLoginValidator {

	public AdminLoginValidator validator;

	public AdminLoginValidator(AdminLoginValidator validator){
        this.validator = validator;
    };

	public abstract void process(User user);
}
