import java.util.*;
public class returnIndex_firstUnique {
    public static void main(String[] args) {
        String s = "Leetcode";
        int count[] = new int[256];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }

         for(int i=0;i<s.length();i++)
        {
            if(count[s.charAt(i)]==1)
            {
                System.out.println(i);
                break;
            }
        }

        // other method
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0 )+1);
        }

        for(int i=0;i<s.length();i++)
        {
            if(map.get(s.charAt(i))==1)
            {
            System.out.println(i);
            break;
            }
        }


        
    }
}
