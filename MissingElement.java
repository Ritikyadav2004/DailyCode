import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
public class MissingElement {
       
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> mylist = new ArrayList<>();
        Arrays.sort(nums);
        int len=nums.length;
        int start=nums[0];
        int end=nums[len-1];
        //end denotes maximum value 
        int count= end-start+1;// itne number hone chiye list me actual me 
        if(len<count)
        {
            for(int i=start+1;i<end;i++)
            {
               boolean found=false;
               for(int j: nums)
               {
                if(j==i)
                {
                    found=true;
                    break;
                }
                
               }
               if(!found)
                {
                     mylist.add(i);
                }
            }
        }

        return mylist;
    }


    public List<Integer> findMissElement(int[]nums)
    {
    Arrays.sort(nums);
      List<Integer> mylist = new ArrayList<>();
      Set<Integer> myset  = new HashSet<>();
      for(int i:nums) myset.add(i);
      int len=nums.length;
      int start=nums[0];
      int end=nums[len-1];
      for(int i=start+1;i<end;i++)
      {
          if(!myset.contains(i))
          {
            mylist.add(i);
          }
      }

      return mylist;



    }
    public static void main(String[] args) {
        MissingElement obj = new MissingElement();
        
        int nums[]= {3,4,7};
        System.out.println("With Reguler process "+obj.findMissingElements(nums));

       System.out.println( "With More Optimize Process "+obj.findMissElement(nums));

    }
}

// BUT COMPLEXITY IS O(N^2) IN WORST CASE 
