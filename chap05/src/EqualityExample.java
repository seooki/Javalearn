
public class EqualityExample {

	public static void main(String[] args) {
		
		int[] nums = {3, 4, 5, 6};
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		nums[3] = 400;
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}
	
	

}
