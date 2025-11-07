import java.util.*;
public class MissingElemntInRange  {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],1);
        }

        for(int i=1;i<=nums.length;i++)
        {
            if(!map.containsKey(i))
            {
                lst.add(i);
            }
        }


        return lst;
    }
    public static void main(String[] args) {
        MissingElemntInRange obj =  new MissingElemntInRange();
        int arr[]={4,3,2,7,8,2,3,1};
        System.out.println(obj.findDisappearedNumbers(arr));
    }
}