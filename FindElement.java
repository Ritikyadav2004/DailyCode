import java.util.PriorityQueue;
import java.util.Random;

public class FindElement {
    public static void main(String[] args) {
     PriorityQueue<Integer> pq = new PriorityQueue<>();
     Random rand = new Random();
     

     for(int i=0;i<50;i++)
     {
        pq.add(rand.nextInt(1000));
     }
     for(int i=0;i<50;i++)
     {
        if(pq.contains(i*100))
        {
            System.out.println(i*100+" true");
        }
       
       
     }
    }
}
