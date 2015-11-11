
public class ControlStatement {

	public static void main(String[] args) {
		/*int a = 7;
		int b = 5;
		
		if(a > b) {
			System.out.println("a > b");
			
			if(a == 99) {
				System.out.println("a == 99");
			}else {
				
			}
		}else if(a == b){
			System.out.println("a = b");
		}else {
			System.out.println("a < b");
		}*/
		switchStatement();
	}
	
	public static void switchStatement() {
		int a = 2;
		
		/*if(a==1) {
			System.out.println("a is 1");
		}else if(a==2) {
			System.out.println("a is 2");
		}else if(a==3) {
			System.out.println("a is 3");
		}else if(a==4) {
			System.out.println("a is 4");
		} else {
			System.out.println("Not a good Number");
		}*/
		
		
		switch (a) {
		case 1:
			System.out.println("a is 1");
			break;
		case 2:
			System.out.println("a is 2");
			break;
		case 3:
			System.out.println("a is 3");
			break;
		case 4:
			System.out.println("a is 4");
			break;
		default:
			System.out.println("Not a good Number");
			break;
		}
		
	}

}
