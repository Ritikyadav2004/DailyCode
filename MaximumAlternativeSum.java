import java.util.*;
class MaximumAlternativeSum {
    // public long maxAlternatingSum(int[] nums) {
    //     long sum=0;
    //     Arrays.sort(nums);
    //     int arr[] = new int[nums.length];
    //     int left=0;
    //     int right=nums.length-1;
    //     int i=0;// cheeck even odd
    //     // increse value in nums 
    //     while(left<=right)
    //         {   
    //             if(nums[i]<=0)nums[i]=-nums[i];
    //             if(i%2==0)
    //             {   
    //                 arr[i]=nums[right];
    //                 right--;
                    
    //             }// index is at odd place
    //             else
    //             {
    //                 arr[i]=nums[left];//smallest value in odd indeces
    //                left++;
    //             }
                
    //             i++;
    //         }

    //     for(int k=0;k<nums.length;k++)
    //         {
    //             if(k%2==0)
    //             {
    //                 sum+=(arr[k]*arr[k]);
    //             }
    //             else
    //             {
    //                 sum-=(arr[k]*arr[k]);
    //             }
    //         }
    //     return sum;
            
        
    // }

    
    public long maxAlternatingSum(int[] nums) {
        long sum=0;
        
        long arr[] = new long[nums.length];
        int left=0;
        int right=nums.length-1;


        for(int i=0;i<nums.length;i++)
            {
                arr[i] = (long)nums[i]*nums[i];
            }

        Arrays.sort(arr); // now we have to take the sum of 0,2,4,6 and subtraction of index 1,3 ,5
        int i=0;// cheeck even odd
        
        while(left<=right)
            {
                if(i%2==0)
                {
                    sum+=arr[right]; //adding maximum
                    right--;
                    
                }// index is at odd place
                else
                {
                    sum-=arr[left];
                   left++;
                }
                
                i++;
            }

        
        return sum;
            
        
    
}
    public static void main(String[] args) {
        MaximumAlternativeSum obj = new MaximumAlternativeSum();
        int nums[] ={12,-4};
        System.out.println(obj.maxAlternatingSum(nums));
    }
}
//-3,-1,-2,1,3,2