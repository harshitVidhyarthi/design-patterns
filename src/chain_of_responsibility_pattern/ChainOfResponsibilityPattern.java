package chain_of_responsibility_pattern;

public class ChainOfResponsibilityPattern {
	public static void main(String[] args) {
		User user1 = new User("Raghav","test1","admin",6); // params -> (username,password,role,experience)
		User user2 = new User("Ashish","test2","admin",4);
		User user3 = new User("Sumit","test3","employee",4);
		User user4 = new User("Ashray","helloworld","employee",1);
		
		Chain chain = new Chain();
		
		chain.process(user1);
		chain.process(user2);
		chain.process(user3);
		chain.process(user4);
	}
}
