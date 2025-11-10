import java.util.*;

public class LongestPrefix {
    public static void main(String[] args) {
       String strs[] = {"flower","flow","flight"};   
       String first=strs[0];
       String last = strs[strs.length-1];
       StringBuilder str = new StringBuilder();
       Arrays.sort(strs);
       for(int i=0;i<Math.min(first.length(),last.length());i++)
       {
          if(first.charAt(i)!=last.charAt(i))
          {
            
            break;
          }
          str.append(first.charAt(i));
       }

//          for(int i=0;i<str.length();i++)

// {
//   System.out.println(str.charAt(i));
// }      


System.out.println(str.toString());
  }
}
