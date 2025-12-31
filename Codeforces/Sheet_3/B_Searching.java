package Codeforces.Sheet_3;
// import java.util.Arrays;
import java.util.Scanner;
public class B_Searching {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        boolean flag=true;

       for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();
       }

       int target=sc.nextInt();


    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==target)
        {
            System.out.println(i);
             flag=false;
            break;
           
        }
    }
    if(flag)
    {
        System.out.println(-1);
    }
       sc.close();
    }
}
