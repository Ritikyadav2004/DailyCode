class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        return sum==num;
    }
    public static void main(String[] args) {
        PerfectNumber n = new PerfectNumber();
        System.out.println(n.checkPerfectNumber(21));
    }
   
   
}