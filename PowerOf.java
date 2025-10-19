// class PowerOf {
   
//     public double myPow(double x, int n) {
//         if(n==0) return 1;
//         if(n==1) return x;
//         double answer=1;
//         int sign = 1;
//         long exp = Math.abs(n);
//         for(int i=1;i<=exp;i++)
//         {
//             answer*=x;
//         }
//         if(n<0)
//         {
//             answer=1/answer;
//         }

        
//         // if(x<0)
//         // {
//         //     if(n%2!=0)
//         //     {
//         //         sign=-1;
//         //     }
//         // }
//         return answer;



        
//     }
// }

// opitimize approce
class PowerOf {
    public double myPow(double x, int n)
    {
        long exp =n;
        if(exp<0)
        {
            x=1/x;
            exp=-exp;
        }
        double result=1;
        while(exp>0)
        {
            if(exp%2==1) // if power odd then multiply result wih x once
            {
                result*=x;
            }
            x*=x;
            exp/=2;
        }
        return result;
    }
    public static void main(String[] args) {
        PowerOf  a = new PowerOf();
        System.out.println(a.myPow(2, 20));
    }
}
