//leetcode 643
public class maxAvg {
    

    public  static double findMaxAverage(int[] nums, int k) {
        if(nums.length==1) return nums[0];
        int sum=0;
        //taking th sum of first k-1 elemnt 
        for(int i=0;i<k;i++)
        {
          sum+=nums[i];
        }
        int maxSum=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum+=nums[i]-nums[i-k];
            maxSum=Math.max(maxSum,sum);
        }

        return maxSum/(double)k;

    }
    public static void main(String[] args) {
        int nums[]={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums, k));
    }
}
