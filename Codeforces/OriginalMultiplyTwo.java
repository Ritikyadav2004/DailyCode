package Codeforces;
import java.util.HashSet;
public class OriginalMultiplyTwo {
    

    public static int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for(int m:nums)
        {
            set.add(m);
        }
        while(set.contains(original))
        {
            original*=2;
        }
        return original;
    }
    public static void main(String[] args) {
       int nums[]={5,3,6,1,12};
       int org=3;
       System.out.println(findFinalValue(nums, org));
    }
}