public class Increment_Decreament {
    
    public static  int finalValueAfterOperations(String[] opr) {
        String s1="++X";
        String s2="X++";
        String s3="--X";
        String s4="X--";
        int x=0;
        for(int i=0;i<opr.length;i++)
        {
            if(opr[i].equals(s1))
            {
                ++x; // pahale + the assign
                
            }
            else if(opr[i].equals(s2))
            {
                x++;
            }
            else if(opr[i].equals(s3))
            {
                --x;
            }
            else if(opr[i].equals(s4))
            {
                x--;
            }
        }
        return x;

    }
    public static void main(String[] args) {
          String str = "--X, X++, X++";
         System.out.println(str);
         String[] opr = str.split(", ");
         System.out.println(finalValueAfterOperations(opr));
    }
}