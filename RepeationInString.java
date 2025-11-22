public class RepeationInString {

    public static boolean repeatedSubstringPattern(String s) {
        // if(s.length()==1) return false;
        // StringBuilder sb = new StringBuilder();
        
        // for(int i=0;i<s.length();i++)
        // {
        //     if (sb.indexOf(String.valueOf(s.charAt(i))) == -1) {
        //         sb.append(s.charAt(i));
        //     }
        // }

        //  int j=0;
        // for(int i=0;i<s.length();i++)
        // {
        //     if(j>=sb.length())
        //     {
        //         j=0;
        //     }

        //     if(s.charAt(i)!=sb.charAt(j))
        //     {   
        //         return false;
                
        //     }
            
        
        //     j++;
        // }
        //  if(j<sb.length()) return false;
        // return true;
             

        String db = s + s;
        return db.indexOf(s,1)!= s.length();
    }
    public static void main(String[] args) {
        System.err.println(repeatedSubstringPattern("abcabc"));
    }
}