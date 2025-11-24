import java.util.*;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }

    }
}
