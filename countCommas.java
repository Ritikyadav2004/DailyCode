
public class countCommas
{
    

    public int countKro(int n)
    {
        if(n<1000) return 0;

        int org=n;
        int count=0;
        while(org!=0)
            { 
                org/=10;
                count++;
                
            }
  
       if(count%3==0)
        {
            return (count/3)-1;
        }
        else
        {
            return (count/3);
        }
    }
    public static  void countComma(int n) {
        countCommas obj= new countCommas();
        int count=0;
        if(n>=1000)
        {
        for(int i=1000;i<=n;i++)
            {
                count+=obj.countKro(i);
            }
            System.out.println(count);
        }
        else
        {
            System.out.println(0);
        }
        
        
    }
    public static void main(String[] args) {
        countComma(1002);
    }
}