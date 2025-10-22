import java.util.*;
public class minHeap {
    public static void main(String[] args) {

    PriorityQueue<Integer> min = new PriorityQueue<>();
   
    // min.add(10);
    // min.add(30);
    // min.add(20);
    // min.add(1);
    // min.add(31);
    // min.add(89);
    
    // System.err.println(min);
    // System.err.println(min.peek());
    // //System.err.println(min.poll());
    // System.err.println(min.size());
    // System.err.println(min);
    // Scanner sc  = new Scanner(System.in);
    // System.out.println(min);
     int[] nums = {12,23,34,45,43,56,65,64,3,33};
   // kth largest elemnt 
   int k=2;// 2md largest number
   for(int n: nums)
   {
    min.add(n);
    if(min.size()>k) min.poll();// remobe the to elemnt whoes value is minimum

   }
     System.out.println("2nd Largest elemnt is :"+min.peek());


    }
}
