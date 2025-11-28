//OUR TASK IS CHECK WHETHER THE STRING IS PALLINDROME AFTER REMOVING ATMOST ONE ELEMNT 
public class ValidPallindrome2 {

    public  static boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {  
            if((s.charAt(left)==s.charAt(right)))
            {
                 left++;
                 right--;
            }
            else 
            {    
                // skippinf the elemnt by just passing the next value index
                return( isPallindrome(s,left+1,right) || isPallindrome(s,left,right-1));
            }
        }
        return true;
    }
    public static boolean isPallindrome(String s,int  left,  int right)
    {
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="deeee";
        System.out.println(validPalindrome(s));
    }

}