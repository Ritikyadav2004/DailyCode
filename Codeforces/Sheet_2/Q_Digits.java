package Codeforces.Sheet_2;

import java.util.Scanner;

public class Q_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n-- >0)
    {
        int num = sc.nextInt();
        if (num == 0) {
    System.out.println(0);
    continue;
}
        while(num>0)
        {
            int temp = num%10;
            System.out.print(temp+" ");
            num/=10;
        }
        System.out.println();
    }
    sc.close();
    }
}
