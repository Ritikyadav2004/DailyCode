public class ValidPallindrome {
    public static void main(String[] args) {
        String str ="A man, a plan, a canal:    Panama";
    StringBuilder str1 = new StringBuilder();
    for(int i=0;i<str.length();i++)
    {
        char ch = str.charAt(i);
        if(Character.isLetterOrDigit(ch))
        {
            str1.append(Character.toLowerCase(ch));
        }
    }
    Boolean isTrue=true;
     int n=str1.length();
     for(int i=0;i<n/2;i++)
     {
            if(str1.charAt(i)!=str1.charAt(n-i-1))
            {
                // System.out.println(false);
                isTrue=false;
                break;
            }
     }

     if(isTrue)
     System.out.println("Pallindrom");

     else
     System.err.println("Not pallindrome");


    
    }
   

    
}
