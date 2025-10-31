import java.util.Arrays;

public class MaxProductOfThree {
    

    public static int maximumProduct(int[] nums) {
        

        Arrays.sort(nums);
        int len=nums.length-1;
        int product1=nums[0]*nums[1]*nums[len];
        int product2= nums[len]*nums[len-1]*nums[len-2];
        
        return Math.max(product1,product2);
    }
     public static void main(String[] args) {
        int []nums={-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(nums));
     }
}