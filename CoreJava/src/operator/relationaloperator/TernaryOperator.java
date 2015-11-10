package operator.relationaloperator;

public class TernaryOperator {

	public static void main(String[] args) {
		String name = args[0];
		String message = "";
		
	//  Ctrl + shift + / : This is to comment a block of code	
/*		if(name.contains("ayr")) {
			message = "Might be Jayram";
		}else {
			message = "Someone else";
		}
*/ 
		message = name.contains("ayr") ? "Might be Jayram" : "Someone Else";
		System.out.println(message);
	}

}
