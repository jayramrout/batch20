package operator.relationaloperator;

public class RelationalOperator {

	public static void main(String[] args) {
		int atanuAge = 45;
		int prathima = 45;
		boolean isTrue = (atanuAge >= prathima);

		// System.out.println((age1 == age2));
		System.out.println(isTrue);

		if (atanuAge < prathima) {
			System.out.println("ATanu is less than prathima");
		} else if (atanuAge == prathima) {
			System.out.println("ATanu is same as prathima");
		} else {
			System.out.println("Something else");
		}

		System.out.println("=========================");
		String name2 = "Jayram";
		String name3 = "Jayram2";
		
		if (name2.equals(name3)){
			System.out.println("1");
			System.out.println("2");
		}
		
		boolean ageCheck = (atanuAge == prathima);
		boolean nameCheck = (name2.equals(name3));
		
		if(ageCheck & nameCheck) {
			System.out.println("Both should be true");
		}
		
		if(ageCheck | nameCheck) {
			System.out.println("If anyone is true");
		}
	}
}
