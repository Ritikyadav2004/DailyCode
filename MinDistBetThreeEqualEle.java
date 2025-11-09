import java.util.*;
public class MinDistBetThreeEqualEle {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> map=  new HashMap<>();
        int nums[]={1,1,2,3,2,1,2};
        // fill the index of same elemnt in a list 

        for(int i=0;i<nums.length;i++)
        {
            map.computeIfAbsent(nums[i],k-> new ArrayList<>()).add(i);
        }
        // varible to store minimu value 
        int ans = Integer.MAX_VALUE;

        //comput in list and value of map
        for(List<Integer> list:map.values())
        {   

            // apn ko list ke consecutive 3 and unheeee se matlbe he jo  atleast 3 bar repeat ho 
            if(list.size()>=3)
            {   
                // i+2 kyu becouse ager last me 3 elemnt check krna he to mujhe prior check krna padeg ki i+2 tk list me elemnt he ya nhi 
                for(int i=0;i+2<list.size();i++)
                {
                      // |(i-j)|+|(j-k)|+|(k-i)| ko other way se calculate kr sakte he 
                      int dist= 2*(list.get(i+2)-list.get(i));  // yeh apn ko teen elemnt ki min vlue and max value ka diffrence dega  and *2 purana vala opr perform kerga 
                      ans=Math.min(ans,dist);
                }
            }
        }

        int finalAns=ans==Integer.MAX_VALUE?-1:ans; // agar apn ko koi value nhi mili to -1 return krdo
        System.out.println(finalAns);

    }
}
