package chain_of_responsibility_pattern;

public class Chain {
	AdminLoginValidator validatorChain;

	public Chain() {
		buildChain();
	}

	private void buildChain() {
		validatorChain = new AuthenticationValidator(new AuthorizationValidator(null));
	}

	public void process(User user) {
		validatorChain.process(user);
	}

}