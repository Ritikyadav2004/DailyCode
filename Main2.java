import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num >= 10) {
            num /= 10;
        }

        if (num % 2 == 0)

        {
            System.out.println("EVEN");
        }

        else {
            System.out.println("ODD");
        }
        sc.close();
    }
}