import java.util.*;public class Intersaction2 {
    

    public static void intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count frequency of nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check nums2 and reduce count
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert List to int[]
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

       for(int i:ans)
       {
        System.out.print(i+" ");
       }
    }
 public static void main(String[] args) {
    int[] st2 ={22,22,33,3,32,3,3,2};
    int []st1 = {22,22,32,2,23,5,33,2,2,333,3,3,333,3};
   intersect(st2, st1);

 }
    
}
