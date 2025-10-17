//258. Add Digits
/*
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 * Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
 */
class Digit_Sum {
    public  int addDigits(int num) {
    
        int count =0;
        while(num!=0)
        {   
            int temp=num%10;
            count+=temp;
            num/=10;
        }
        
        
        if(count>9)
        {
            return addDigits(count);
        }
        else return count;
       
        

    }
    public static void main(String[] args) {
        Digit_Sum a = new Digit_Sum();
        // one way make function static 
        //System.out.println(addDigits(38));

        // or using object 
        System.out.println(a.addDigits(38));
    }
}