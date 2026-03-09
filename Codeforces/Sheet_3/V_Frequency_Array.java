package Codeforces.Sheet_3; 
import java.util.*;
public class V_Frequency_Array
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        int count[]=new int[256];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            count[arr[i]]++;
        }

        for(int j=1;j<=m;j++)
        {
            System.out.println(count[arr[j]]);
        }
        sc.close();

	}
}