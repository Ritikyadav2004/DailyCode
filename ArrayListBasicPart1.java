import java.util.ArrayList;
public class ArrayListBasicPart1 {
    

    public static ArrayList<Integer> fillArrayList(int arr[]) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:arr)
        {
            list.add(i);
        }
        return list;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(fillArrayList(arr));
    }
}