
import java.util.Arrays;


public class MaximumAfterReplacement {
    public long maxProduct(int[] nums) {
        Arrays.sort(nums);
        //possible maximum value shoudle be at 
        // 0 1 and len-1 and len-2;
        int len=nums.length;
        
        long pdt1 = 1L*nums[0]*nums[1]*100000;
        long pdt2 = 1L*nums[0]*nums[nums.length-1]*100000*(-1);
        long pdt3 = 1L*nums[len-1]*nums[len-2]*100000;
        long max1=Math.max(pdt1,pdt2);
        long max2 =Math.max(max1,pdt3);
        
        return max2;
    }
    public static void main(String[] args) {
        MaximumAfterReplacement obj= new MaximumAfterReplacement();
        // int nums [] = {-4,-2,-1,-3};
        // int nums[] ={-5,7,0};
        int nums[]={0,10,0};
        System.out.println(obj.maxProduct(nums));
    }
}
