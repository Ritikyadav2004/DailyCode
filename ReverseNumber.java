public class ReverseNumber {
    public static void reverse(int []nums, int start, int end)
    {
while(start<end)
{
    int temp=nums[start];
  nums[start] = nums[end];
  nums[end]=temp;
  start++;
  end--;


}System.out.println();
 for(int i:nums)
          {
            System.out.print(i+" ");
          }
    }

    public static void  main(String[] args)
    {
          int nums[]={1,2,3,4,5,6,7,8,9};
          int k=2;
          int len=nums.length;
          k=k%len; 
          reverse(nums, 0 ,len-1);
          reverse(nums, 0, k-1);
          reverse(nums, k, len-1);
          

    }
}
