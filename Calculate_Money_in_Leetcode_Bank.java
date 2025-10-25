/*
 * Example 1:

Input: n = 4
Output: 10
Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.
Example 2:

Input: n = 10
Output: 37
Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.
Example 3:

Input: n = 20
Output: 96
Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.
 
*/
public class Calculate_Money_in_Leetcode_Bank {
    public int totalMoney(int n) {
        int sum = 0;
        int count = 0;
        int j = 1;
        int k = 1;
        // for(int i=1;i<=n;i++)
        // {

        // if(count<7)
        // {

        // sum = sum+j;
        // count++;
        // j++;
        // }
        // else
        // { k++;
        // j=k;
        // count=0;
        // sum+=j;
        // j++;

        // }

        // }

        for (int i = 1; i <= n; i++) {

            sum = sum + j;
            count++;
            j++;

            if (count == 7) {
                k++;
                j = k;
                count = 0;

            }

        }
        return sum;
    }
public static void main(String[] args) {
    Calculate_Money_in_Leetcode_Bank obj = new Calculate_Money_in_Leetcode_Bank();
    System.out.println(obj.totalMoney(10));
}
}
