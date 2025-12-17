
package Codeforces.Contest_2;
import java.util.*;

public class C_Finding_Minimums {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i += k) {   //
            int min = Integer.MAX_VALUE;

            for (int j = i; j < i + k && j < n; j++) {
                min = Math.min(min, arr[j]);
            }

            System.out.print(min + " ");
        }
        sc.close();
    }
}
