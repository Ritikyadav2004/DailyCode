import java.util.*;

public class kthLargestNumber {
    public static void main(String[] args) {
        
        int k=6;//we have to find 4th largest number
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int arr[] = {12,33,344,54,455,554,44,45,55,0};
        for(int i:arr)
        {
            maxHeap.add(i);
        }
        System.out.println(maxHeap);
        
        // removing k-1 elemnt 
        for(int i=0;i<k-1;i++)
        {
           maxHeap.poll();
        } 
        System.out.println(maxHeap.peek());
        
    }
}
