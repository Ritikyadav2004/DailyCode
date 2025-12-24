package Codeforces.Contest_2;
import java.util.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long n = sc.nextLong();
            long s = sc.nextLong(); 

            long maxSum = n * (n + 1) / 2;
            if (s > maxSum) {
                System.out.println(-1);
                continue;
            }

            List<Long> ans = new ArrayList<>();
            for (long i = n; i >= 1 && s > 0; i--) { // loop downwards
                if (i <= s) {
                    ans.add(i);
                    s -= i;
                }
            }

            if (s != 0) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < ans.size(); i++) {
                    if (i > 0) System.out.print(" ");
                    System.out.print(ans.get(i));
                }
                System.out.println();
            }
        }
        sc.close();
    }
}