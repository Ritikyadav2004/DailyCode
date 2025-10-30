public class DivideWithoutOperator {
        
     
        public static int divide(int dividend, int divisor) {
            int sign1=1;
            long answer=0;
            int sign2=1;
            if(dividend==Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;

            long a =(long)dividend;
            long b= (long)divisor;
            if(a<0)
            {
                sign1=-1;
                a=-a;
            }

            if(b<0)
            {
                sign2=-1;
                b=-b;
            }
            if(a==b)
            {
                return sign1*sign2*1;
            }
            //logic
        

            while(a>=b)
            {
                a-=b;
                
                answer++;

            }

            return (int)(sign1*sign2*answer);
           
            
        

        }
    
        public static void main(String[] args) {
            System.out.println(divide(16, 5));
        }
}
