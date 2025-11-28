//
// Given the boundaries of 2 intervals. Print the boundaries of their intersection.

// Note: Boundaries mean the two ends of an interval which are the starting number and the ending number.

// Input
// Only one line contains two intervals [l1,r1]
// , [l2,r2]
//  where (1≤l1,l2,r1,r2≤109)
// , (l1≤r1,l2≤r2)
// .

// It's guaranteed that l1≤r1
//  and l2≤r2
// .

// Output
// If there is an intersection between these 2 intervals print its boundaries , otherwise print -1.

// Examples
// InputCopy
// 1 15 5 27
// OutputCopy
// 5 15
// //

package Codeforces;
import java.util.Scanner;

public class TwoIntervals {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l1=sc.nextInt();
        int r1=sc.nextInt();
         
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        
        int Start=Math.max(l1,l2);
        int end=Math.min(r1,r2);
        if(Start<=end)
        {
            System.out.println(Start+" "+end);
        }
        else
        {
            System.out.println(-1);
        }
        sc.close();
    }
}
