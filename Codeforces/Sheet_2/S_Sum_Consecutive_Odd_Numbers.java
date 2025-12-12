package Codeforces.Sheet_2;

import java.util.Scanner;

public class S_Sum_Consecutive_Odd_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase-- > 0) {
            int sum = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b) {
                for (int i = a + 1; i < b; i++) {
                    if (i % 2 != 0) {
                        sum += i;
                    }
                }
            } else {
                for (int i = b+1; i < a; i++) {
                    if (i % 2 != 0) {
                        sum += i;
                    }
                }
            }

            System.out.println(sum);

        }

        sc.close();
    }
}
