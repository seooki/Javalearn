
public class Exercise05_05 {

	public static void main(String[] args) {
		int[] ball3 = new int[3];
		int tmp;
		
		for(int i=0; i<ball3.length; i++) {	
			tmp = (int)(Math.random()*9 + 1);
			for(int j=0; j<ball3.length; j++) {
				if(ball3[j] != tmp) {
					ball3[i] = tmp;
				} else {
					tmp = (int)(Math.random()*9 + 1);
				}
			}
		}
		
		for(int i=0; i<ball3.length; i++) { 
			System.out.print(ball3[i]);
		}   
	}

}
