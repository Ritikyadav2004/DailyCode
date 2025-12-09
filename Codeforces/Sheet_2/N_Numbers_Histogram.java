package Codeforces.Sheet_2;

import java.util.Scanner;

public class N_Numbers_Histogram {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    int n=sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<arr[i];j++)
        {
            System.out.print(ch);
        }
        System.out.println();
    }
    sc.close();
}
}
