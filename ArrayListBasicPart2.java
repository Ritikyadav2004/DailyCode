import java.util.*;
public class ArrayListBasicPart2 {
    


    public static void add_to_ArrayList(ArrayList<Integer> A, int x) {
        // Your code here
        
A.add(x);
        // Just add, don't print anything
    }

    public static void sort_ArrayList_Asc(ArrayList<Integer> A) {

        
        // Your code here
        // Just sort, don't print anything
        Collections.sort(A);
    }
    

        
    public static void reverse_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Just reverse, don't print anything
        Collections.reverse(A);
    }
        

    public static int size_Of_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Return the size of ArrayList
        return A.size();
        
    }

    public static void sort_ArrayList_Desc(ArrayList<Integer> A) {
        // Your code here

        Collections.sort(A,Collections.reverseOrder());
        // Just sort in desc order, don't print anything
    }

    public static void print_ArrayList(ArrayList<Integer> A) {
        // Your code here
        // Print the elements of A, don't add new line
        for(int i:A)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        sort_ArrayList_Asc(list);
        print_ArrayList(list);
                                   System.out.println();
        System.out.println(size_Of_ArrayList(list));
                                   System.out.println();
        
        sort_ArrayList_Desc(list);
        print_ArrayList(list);
                                   System.out.println();
        reverse_ArrayList(list);
        print_ArrayList(list);
                                   System.out.println();
        add_to_ArrayList(list, 50);
        print_ArrayList(list);
    }
}

