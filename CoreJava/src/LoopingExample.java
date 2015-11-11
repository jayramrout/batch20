
public class LoopingExample {

	public static void main(String[] args) {
		LoopingExample le = new LoopingExample();
		le.arraysToLoop();
	}
	
	public void arraysToLoop() {
		int heights[] = {  };
		
/*		for(int i = 0 ; i < heights.length ; i++){
			System.out.println(heights[i]);
		}
		
		for (int height : heights) {
			System.out.println(height);
		}
*/		
		int i = 0;
		/*while(i< heights.length){
			System.out.println(heights[i++]);
		}
		
		
		do {
			System.out.println(heights[i++]);
		} while (i< heights.length);*/
		
		/*while(true){
			System.out.println(i++);
		}*/
		for(;;) {
			System.out.println(i++);
		}
			
	}

}
