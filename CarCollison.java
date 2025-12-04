//2211. Count Collisions on a Road leetcode
public class CarCollison {
    
    //BRUTE FORCE APPROCAH
    public  static int countCollisions1(String dir) {
        StringBuilder str = new StringBuilder(dir);
        int collison=0;
        for(int i=0;i<str.length()-1;i++)
        {
            char ch=str.charAt(i);
            char nd=str.charAt(i+1);
            if(ch=='R' && nd=='L')
            {
                collison+=2;
                i++;
            }
            else if((ch=='R' && nd=='S') || (ch=='S' && nd=='R'))
            {
                if(ch=='S' && nd=='R')
                {
                   str.setCharAt(i+1, 'S');
                }
                collison++;
            }

             else if((ch=='L' && nd=='S') || (ch=='S' && nd=='L'))
            {
                if(ch=='S' && nd=='L')
                {
                    str.setCharAt(i+1, 'S');
                }
                collison++;
            }
        }
        return collison;
    
    }


   // OPTIMIZE APPROCAH
   public static int  countCollisions2(String dir) {
        int left=0;
        int right=dir.length()-1;
        int count=0;// collison
        while(left<dir.length() && dir.charAt(left)=='L')
        {left++;}

        while(right>=0 && dir.charAt(right)=='R')
        {right--;}

        // jp beech me jo stationery nhi hey he chl hee rhi he
        for(int i=left;i<=right;i++)
        {
            if(dir.charAt(i)!='S')
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCollisions1("LLSRSSRSSLLSLLLRSLSRL")); // wrong in this input 
        System.out.println(countCollisions2("LLSRSSRSSLLSLLLRSLSRL")); // corret answer
    }
}