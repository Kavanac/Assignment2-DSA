public class Question8 {
    public static int smallestRangeI(int[] nums, int k) {
        int min = 10001, max = -1;
        
        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int ans = (max - k) - (min + k);
        return Math.max(0, ans);
    }
    public static void main(String[] args)
   	{
   		int[] nums = {1};
   		int k=0;
   		
   		System.out.println(smallestRangeI(nums, k));
   	}
}
