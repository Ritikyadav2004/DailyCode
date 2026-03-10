package Codeforces.Sheet_3;
import java.util.*;
public class Z_Binary_Search {

    public static boolean search(int a,int[] arr)
    {

        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid]==a) return true;

            else if(arr[mid]<a)
            {
                start=mid+1;
            }
            else
            {

                end=mid-1;
            }


        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int arr[]=new int[n];
        int x[]=new int[q];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<q;i++)
        {
           x[i]=sc.nextInt();
        }

        for(int i=0;i<q;i++)
        {
           if(search(x[i], arr))
           {
            System.out.println("found");
           }
           else{
            System.out.println("not found");
           }
        }
          sc.close();
    }
}
