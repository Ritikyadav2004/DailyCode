/*
633. Sum of Square Numbers
Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.Example 1:

Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
Example 2:

Input: c = 3
Output: false
  */ 
 public class SumOfSquareNumber {
    public static boolean judgeSquareSum(int c) {
        if(c==0|| c==1) return true;
        int a=0;
        long b = (long) Math.sqrt(c);;
        while(a<=b)
        {
            if((long)(a+b)*(a+b)==(long)(c+(2*a*b)))
            {
               return true;
            }
            else if((a+b)*(a+b)>c+(2*a*b))
            {
                b--;
            }
            else {
                a++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
    }
}