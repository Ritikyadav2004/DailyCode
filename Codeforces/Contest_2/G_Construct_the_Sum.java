package Codeforces.Contest_2;
import java.util.*;

public class G_Construct_the_Sum {
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

            // Greedy: pick from largest to smallest
            for (long i = n; i >= 1; i--) {
                if (s >= i) {
                    ans.add(i);
                    s -= i;
                }
            }

            if (s != 0) {
                System.out.println(-1);
            } else {
                for (long x : ans) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

