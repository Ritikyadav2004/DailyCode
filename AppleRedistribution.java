//LEETCODE 3074 Apple Redistribution into Boxes
import java.util.Arrays;
public class AppleRedistribution {
 
    public static int minimumBoxes(int[] apple, int[] capacity) {
        int count=0;
        int sum=0;
        for(int i:apple)
        {
            sum+=i;
        }
        int cap=0;
        int j=capacity.length-1;
        Arrays.sort(capacity);
        while(cap < sum && j>=0)
        {
            cap+=capacity[j];
            j--;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
         int []apple = {5,5,5};
         int[]  capacity = {2,4,2,7};
        System.out.println(minimumBoxes(apple, capacity));
    }
}