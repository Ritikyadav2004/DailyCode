//3432. Count Partitions with Even Sum Difference
public class CountPartions {
    
    public static int countPartitions1(int[] nums) {
        int countP=0;
        int sub1=0;
        int sub2=0;
        for(int i=0;i<nums.length-1;i++)
        {   
             sub1+=nums[i];
             sub2=0;
            for(int j=i+1;j<nums.length;j++)
            {
              sub2+=nums[j];
            }
            if(Math.abs(sub1-sub2)%2==0)
            {
                countP++;
            }
        }
        return countP;
    }

    //OPTIMIZED APPROACH
    
    public static int countPartitions2(int[] nums) {
        int totalSum = 0;
        for (int i=0;i<nums.length;i++) {
            totalSum += nums[i]; 
        }

        int leftSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) { 
            leftSum += nums[i]; 
            int rightSum = totalSum - leftSum; 
  
            if ((leftSum % 2) == (rightSum % 2)) {
                count++; 
            }
        }
        return count; 
    }
    
    public static void main(String[] args) {
        int  arr[]={10,10,3,7,6};
        System.out.println(countPartitions1(arr));  //BRUTE FORCE 
        System.out.println(countPartitions2(arr));  //OPTIMIZED
    } 
}