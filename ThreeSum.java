import java.util.*;
class threeSum {
    public static void main(String[] args) {
        //mean ek ko fix krke hume baki to me 2 pointer lagane ha
        int nums[]={-2,0,1,1,2};
        Arrays.sort(nums);// used while updating leftv and right
        
        List<List<Integer>> myList= new ArrayList<>();
        int left=0;
        int right=nums.length-1;
        for(int i=0;i<nums.length-2;i++)
        {   
            if(i>0 && nums[i]==nums[i-1]) continue;
            int fixed=nums[i];
             left=i+1;
             right=nums.length-1;
            while(left<right)
            {
                if(fixed+nums[left]+nums[right]==0 && i!=left && i!=right)
                {   

                    
                  myList.add(Arrays.asList(fixed,nums[left],nums[right]));
                  left++;
                  right--;
                    
                 while(left<right && nums[left]==nums[left-1])left++;  

                 while(left<right && nums[right]==nums[right+1])right--;             

                }
                else if(fixed+nums[left]+nums[right]>0)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }
        System.out.println(myList);
    }
}