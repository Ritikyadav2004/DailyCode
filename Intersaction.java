import java.util.*;
public class Intersaction {
    

    public static  int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 =  new HashMap<>();
        Map<Integer,Integer> map2 =  new HashMap<>();
        List<Integer>list = new ArrayList<>();

        for(int i=0;i<nums1.length;i++)
        {
            map1.put(nums1[i],1);
        }

        for(int i=0;i<nums2.length;i++)
        {
            map2.put(nums2[i],1);
        }
        
        if(nums1.length>nums2.length)
        {
           for(int i=0;i<nums1.length;i++)
           {
            if(map2.containsKey(nums1[i]))
            {
                list.add(nums1[i]);
                map2.remove(nums1[i]);
            }
              
             
           
            
           }
       }
       else
       {
        for(int i=0;i<nums2.length;i++)
           {
            if(map1.containsKey(nums2[i]))
            {list.add(nums2[i]);
            map1.remove(nums2[i]);
            }
           }
       }

       int arr[]= new int[list.size()];
       for(int i=0;i<list.size();i++)
       {
          arr[i]=list.get(i);
       }
     
       

       return arr;
}

public static void main(String[] args) {
    
    int arr1[]={1,2,2,1};
    int arr2[]={2,2,1};
    System.out.println(Arrays.toString(intersection(arr1, arr2)));
    
}

}