import java.util.HashSet;
import java.util.Set;
public class longestLentghOfSubstring {
    public static void main(String[] args) {
        String str = "pwwkewp";
        int n=str.length();
        int left=0;
        Set<Character> set = new HashSet<>();
        int maxLength=0;
        for(int right=0;right<n;right++)
        {
            if(!set.contains(str.charAt(right)))
            {
                set.add(str.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);

            }
            else{
                while(set.contains(str.charAt(right)))
                {
                    set.remove(str.charAt(left));
                    left++;
                }
            }
            set.add(str.charAt(right));
        }

        System.out.println(maxLength);
    }
}
