public class MinimumOprToDivideWithThree {
    

    public static int minimumOperations(int[] nums) {
        int opr=0;
        for(int i:nums)
        {
            if(i%3==0)continue;
            else if((i-1)%3==0)opr++;
            else opr++;
        }
        return opr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(minimumOperations(arr));
    }
}
