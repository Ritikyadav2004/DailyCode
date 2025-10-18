//231. Power of Two
/*
 * Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
 */
class PowerOfTwo {
    public  int  isDivisible(int n )
    {
           /// base case 
           if(n==1)return 1;
           if(n<=0) return 0;

           if(n%2==0) return isDivisible(n/2);

           else return 0;
    }
    public boolean isPowerOfTwo(int n) {
        
        if(isDivisible(n)==1)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static void main(String[] args) {
        
       PowerOfTwo a = new PowerOfTwo();
       System.out.println(a.isPowerOfTwo(1024));
    }

}
