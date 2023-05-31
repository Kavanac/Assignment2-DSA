public class Question6 {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0, h = n-1;
        int p = 0;
        while(l<=h){
            p = l+(h-l)/2;
            if(nums[p]==target)
                return p;
            if(target<nums[p])
                h = p-1;
            else
                l = p+1;
        }
        return -1;
    }
    public static void main(String[] args)
   	{
   		int[] nums = {-1,0,3,5,9,12 };
   		int target=9;
   		
   		System.out.println(search(nums,target));
   	}
}