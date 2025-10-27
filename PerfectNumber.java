class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        // complexity o(n/2)
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        return sum==num;
    }

   // conmnplexity o(sqrt(n))
    public static boolean checkPerfectNumber2(int num) {
        if(num<=1) return false;
        int sum=1;// 1 always a divisor
        for(int i=2;i*i<=num;i++)
        {
                 if(num%i==0)
                 {
                    sum+=i;
                    if(i!=num/i)
                    {
                        sum+=num/i;
                    }
                 }
        }
    
        
        return sum==num;
    }

    public static void main(String[] args) {
        PerfectNumber n = new PerfectNumber();
        System.out.println(n.checkPerfectNumber(21));
        System.err.println(checkPerfectNumber2(21));
    }
   
   
}