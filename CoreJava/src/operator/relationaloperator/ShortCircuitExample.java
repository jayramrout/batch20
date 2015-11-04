package operator.relationaloperator;

public class ShortCircuitExample {

	public static void main(String[] args) {
		int age = 3;
		int height = 8;
		
		if((age++ >= 4) && (height++ > 7)) {
			System.out.println("I am good...");
		}else {
			System.out.println("I am in else block");
		}
		
		if((age++ >= 4) || (height++ > 7)) {
			
		}
		System.out.println("age = "+age);
		
		System.out.println("height = "+height);
		
	}

}
