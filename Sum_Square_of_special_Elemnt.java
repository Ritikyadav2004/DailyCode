//2778. Sum of Squares of Special Element
public class Sum_Square_of_special_Elemnt {
   
    public static int sumOfSquares(int[] nums) {
        int n=nums.length;
        long sum=0;
        for(int i=1;i<=nums.length;i++)
        {
            if(n%i==0)
            {
               long sq = (long)(nums[i-1]*nums[i-1]);
               sum+=sq;
            }
        }
        return (int) sum;
    }
    public static void main(String[] args) {
        int nums[] ={2, 7, 1, 19, 18, 3};
        System.out.println(sumOfSquares(nums));
    }
}