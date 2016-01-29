package jrout.tutorial.springcore;

public class HelloClient2 {

	public static void main(String[] args) {
		HelloWorld hello1 = new JavaWorldImpl();
		System.out.println(hello1.sayHello("Sad"));
	}
}