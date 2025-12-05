// package Codeforces;
// import java.util.*;

// public class Contest {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int t=sc.nextInt();// number of test cases
//     int n=sc.nextInt();// size of string
//     int k=sc.nextInt();// inte der tak so nhi sakta 
//     // String str=sc.nextLine();// binery String input laga jiski size n hogi
//     int arrN[]=new int[n];// array hogi size n ki
//     int arrk[]=new int[k];
//     String arrStr[]=new String[n];// string array size n ki

//     // taking multiple inputs 
//     for(int i=0;i<t;i++)
//     {
//         arrN[i]=sc.nextInt();
//         arrk[i]=sc.nextInt();
//         arrStr[i]=sc.nextLine();
        
//     }
    
 
//     for(int i=0;i<n;i++)  // iteraotr theough each string 
//     {  
//         int count=0;
//         boolean flag=false;
//         for(int j=0;j<arrStr[i].length();j++)
//         {
//              if(arrStr[i].charAt(j) == '1')
//              {
//                  flag=true;
//                  continue;
//              }
//            else if(flag==true && j+1<=k)
//            {
//             continue;
//            }
//              else{
//                 count++;
//              }
//         }
//         System.out.println(count);
//     }
// sc.close();

//     }

// }
package Codeforces;
import java.util.*;

public class Contest {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            
            boolean[] jago = new boolean[n];
            
            for (int i = 0; i < n; i++) 
                {
                if (s.charAt(i) == '1') 
                    {
                    for (int j = i; j <= i + k && j < n; j++) {
                        jago[j] = true;
                    }
                }
            }
            
            int sleep = 0;
            for (int i = 0; i < n; i++)
                 {
                if (!jago[i]) {
                    sleep++;
               
                }
            }
            
            System.out.println(sleep);
        }
        
        sc.close();
    }
}
