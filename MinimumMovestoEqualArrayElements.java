public class MinimumMovestoEqualArrayElements {

    public  static int minMoves(int[] nums) {
        int max=-1;
        for(int i:nums)
            {
                if(max<i)
                {
                    max=i;
                }
            }
        int moves=0;

        for(int i=0;i<nums.length;i++)
            {  
                moves+=(max-nums[i]);
            }

        return moves;
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        System.out.println(minMoves(a));
    }
}