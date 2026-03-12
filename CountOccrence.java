import java.util.*;
public class CountOccrence {
    

    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       int count[]=new int[256];
       for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
        count[arr[i]]++;
       }
       Set<Integer> data=new HashSet<>();
       for(int i=0;i<n;i++)
       {
        // System.out.println(arr[i]+"Count--> "+count[arr[i]])
        data.add(arr[i]);
       }
       

       for(Integer i:data)
       {
         System.out.println("Count of "+i+" -->  "+count[i]);
       }
       sc.close();

    }
}
