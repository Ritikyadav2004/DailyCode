package Codeforces.Sheet_3;
// import java.util.Arrays;
import java.util.Scanner;
public class B_Searching {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        boolean flag=true;

       for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
       }
    //    Arrays.sort(arr);
       int target=sc.nextInt();


        //  Binery  Search
    //    int l=0;
    //    int h=n-1;
    //    while(l<=h)
    //    {
    //     int mid = l + (h-l)/2;
    //     if(arr[mid]==target)
    //     {     
    //         flag=false;
    //           System.out.println(mid);
    //           break;
    //     }
    //     if(arr[mid]<target)
    //     {
    //         l=mid+1;
    //     }
    //     else{
    //         h=mid-1;
    //     }

    //    }
    //    if(flag) System.out.println(-1);
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
