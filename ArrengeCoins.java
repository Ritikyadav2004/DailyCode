// You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

// Given the integer n, return the number of complete rows of the staircase you will build.
class ArrengeCoins {
    
    public static int arrangeCoins(int n) {
        int k=n;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(k>=i)
            {
                k-=i;
                count++;
            }
            else break;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
}