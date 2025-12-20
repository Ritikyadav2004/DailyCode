package Codeforces.Contest_2;
import java.util.Scanner;
public class E_Ride_Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextLong()) {
            long id = sc.nextLong();
            
            long row = id / 4;
            long col;
            
            if (row % 2 == 0) {
                // Even row: Left to Right (0, 1, 2, 3)
                col = id % 4;
            } else {
                // Odd row: Right to Left (3, 2, 1, 0)
                col = 3 - (id % 4);
            }
            
            System.out.println(row + " " + col);
        }
        
        sc.close();
    }
}
