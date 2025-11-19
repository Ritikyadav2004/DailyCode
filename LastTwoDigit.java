//

// Given 4 numbers A
// , B
// , C
//  and D
// . Print the last 2 digits from their Multiplication.

// Input
// Only one line containing four numbers A
// , B
// , C
//  and D
//  (2≤A,B,C,D≤109)
// .

// Output
// Print the last 2 digits from their Multiplication.

//
import java.util.Scanner;

public class LastTwoDigit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        long result1 = ((long)(a)*b)%100;
        long result2 = ((long)(c)*d)%100;

        long finalResult = (result1*result2)%100;

        System.out.println(String.format("%02d",finalResult));
        sc.close();
    }
}
