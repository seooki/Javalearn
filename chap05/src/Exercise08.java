
public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		
		int sum = 0;
		int average = 0;
		int count = 0;
		
//		for(int i=0; i<array.length; i++) {
//			for(int j=0; j<array[i].length; j++) {
//				sum = sum + array[i][j];
//				count ++;
//			}
//		}
//		
		
		for (int[] arr : array) {
			for (int n : arr) {
				sum = sum + n;
				count++;
			}
		}
		
		average = sum / count;
		
		System.out.println(sum);
		System.out.println(average);
	}

}
