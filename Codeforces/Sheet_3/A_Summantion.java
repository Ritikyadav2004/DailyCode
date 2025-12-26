package Codeforces.Sheet_3;
import java.util.Scanner;


public class A_Summantion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
    long sum = 0;   // 

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();  
              sum += x;
        }

        System.out.println(Math.abs(sum));
        sc.close();
    }
}
