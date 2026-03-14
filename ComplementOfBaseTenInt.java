import java.util.*;
public class ComplementOfBaseTenInt {
    

    public static int bitwiseComplement(int n) {
        if(n==0)return 1;
        List<Integer> arr= new ArrayList<>();

        while(n!=0)
        {
            arr.add(n%2);
            n/=2;
        }
        Collections.reverse(arr);
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)==0)
            {
                arr.set(i,1);
            }
            else
            {
                arr.set(i,0);
            }
        }
        int j=0;
        int num=0;
        for(int i=arr.size()-1;i>=0;i--)
        {
           num+=Math.pow(2,j)*arr.get(i);
           j++;
        }
        return num;


    }
    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
        System.out.println(bitwiseComplement(0));

    }
}