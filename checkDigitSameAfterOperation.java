// 3461. Check If Digits Are Equal in String After Operations I
public class checkDigitSameAfterOperation {
    
    public static boolean hasSameDigits(String s) {
        
       
        while(s.length()!=2)
        {

            StringBuilder str = new StringBuilder();
            for(int i=0;i<s.length()-1;i++)
            {
               int a = s.charAt(i)-'0';
               int b= s.charAt(i+1)-'0';
               int temp=(a+b)%10;
               str.append(temp);
            }
            s=str.toString();
        }
        if(s.charAt(0)==s.charAt(1))
        return true;
        else return false;

    }
    public static void main(String[] args) {
        System.out.println(hasSameDigits("3902"));
        System.out.println(hasSameDigits("34789"));
    }
}