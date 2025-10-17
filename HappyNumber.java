class HappyNumber {
     public int ishappy(int n)
    {   
        int sum=0;
      
            //condition 
            while(n!=0)
            {
                int temp=n%10;
                // sum+=Math.pow(temp,2)
                sum+=temp*temp;
                n/=10;
            }
            
            
        
        
         if(sum==1)
        {
            //conditon
            return 1;
        }
        if (sum == 4) {
            return 0;   // not a happy number ❌ (loop detected)
        }

        
        
        
           return ishappy(sum);
        
    }
    public boolean isHappy(int n) {
        if(ishappy(n)==1) 
        return true;
        return false;
    }
    public static void main(String[] args) {
        HappyNumber n = new HappyNumber();
        System.out.println(n.isHappy(19));
    }
}