import java.util.HashMap;
import java.util.Map;
public class N_Repeated_NumberIn_Array {
    public static  int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> dict= new HashMap<>();
        for(int i:nums)
        {
            dict.put(i, dict.getOrDefault(i, 0) + 1);;
        }
        for (Map.Entry<Integer, Integer> entry : dict.entrySet()) {
            
            if(entry.getValue()>1)
            {
                return entry.getKey();
                
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        int[]arr={11,2,3,4,11,11,23,32,31};

        System.out.println(repeatedNTimes(arr));
    }
}