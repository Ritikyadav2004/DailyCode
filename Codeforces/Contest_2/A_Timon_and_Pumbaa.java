package Codeforces.Contest_2;

import java.util.Scanner;

public class A_Timon_and_Pumbaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        if(a-b>=0)
        {
            System.out.println(a-b);
        }
        else{
            System.out.println(0);
        }
sc.close();
    }
}
