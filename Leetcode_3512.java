public class Leetcode_3512 {
    
    public  static int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int count=0;
        while(sum%k!=0)
        {
            sum--;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={3,9,7};
        System.out.println(minOperations(arr, 5));
    }
 
}