//1518. Water Bottles

public class numWaterBottle {
    
    public static int numWaterBottles(int numB, int numE) {
       int empty=numB;
       int count=numB;
       while(empty>=numE)
       {
        empty-=numE;
        count++;
        empty++;
       }
       return count;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(15,4));
    }
}