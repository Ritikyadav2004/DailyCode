package Codeforces;

// import java.util.Scanner;

// public class GuessingTheDataType {
//     public static void main(String[] args) {
//         Scanner  sc = new Scanner(System.in);
    
//         long n=sc.nextLong();
//         long k =sc.nextLong();
//         long a = sc.nextLong();
//         double result = (double) n * k /a;

//         // System.out.println(result);
//         // String datatype = result.getClass().getSimpleName();
        
//         if(result%1!=0)
//         {
//             System.out.println("double");
//         }
//         // else if (-2147483648L <= (long)result && (long)result <= 2147483647L) {
//         else if (result>=Integer.MIN_VALUE && result<=Integer.MAX_VALUE){
//             System.out.println("int");
//         }
//         else{
//             System.out.println("long long");
//         }

//         sc.close();

//     }
// }
import java.util.Scanner;

public class GuessingTheDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();
        long a = sc.nextLong();

        // Step 1: check double (fractional result)
        if ((n * k) % a != 0) {
            System.out.println("double");
        } 
        else {
            long result = (n * k) / a;

            // Step 2: check int range
            if (result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE) {
                System.out.println("int");
            } else {
                System.out.println("long long");
            }
        }
        sc.close();
    }
}
