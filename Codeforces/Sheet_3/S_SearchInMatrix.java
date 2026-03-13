package Codeforces.Sheet_3;

// import java.lang.reflect.Array;
import java.util.*;

public class S_SearchInMatrix {

    public static boolean Search(int arr[][], int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int targetElemnt = sc.nextInt();

        if (Search(arr, targetElemnt)) {
            System.out.println("will not take number");
        } else {
            System.out.println("will take number");
        }
        sc.close();
    }
        

    }

