
public class BreakContinue {

	public static void main(String[] args) {
		String names[] = {"Satya","Daw","Prasanthi","Anand"};
		
		for(int i = 0 ; i < names.length; i++) {
			if(names[i].equals("Prasanthi")) {
//				System.out.println("My Name is "+ names[i]);
//				break;
				continue;
			}
			
			System.out.println("My Name is "+ names[i]);
			
		}
		System.out.println("=============");
	}
}
