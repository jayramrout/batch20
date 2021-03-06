package arrays;

public class ArrayExample {
	public static void main(String[] args) {
		ArrayExample ae = new ArrayExample();
//		ae.arrayExampleWithoutInitialization();
//		ae.arrayWithInit();
		ae.arraysToLoop();
	}
	
	public void arrayExampleWithoutInitialization() {
		int myAge = 10;
		int youAge = 20;
		
		int ages[] = new int[2];
		ages[0] = myAge;
		ages[1] = youAge;
		System.out.println(ages.length);
		System.out.println(ages[0]);
		System.out.println(ages[1]);
	}
	
	
	public void arrayWithInit() {
		System.out.println("ArrayExample.arrayWithInit()");
		int height[] = {6,7,4,3};
		System.out.println(height.length);
		System.out.println(height[0]);
		System.out.println(height[1]);
		System.out.println(height[2]);
		System.out.println(height[3]);
	}
	
	public void arraysToLoop() {
		int heights[] = {6,7,4,3,23,9,8,67,5};
//		System.out.println(height[4]);
		int len = heights.length;
		
		/*for(int i = 0; i < len ; i++) {
			System.out.println("height["+i+"] = " + heights[i]);
		}*/
		
		for(int height : heights) {
			System.out.println(height);
		}	
	}
}
