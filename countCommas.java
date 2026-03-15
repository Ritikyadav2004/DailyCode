/*
Q1. Count Commas in Range
Solved
Easy
3 pt.
You are given an integer n.

Return the total number of commas used when writing all integers from [1, n] (inclusive) in standard number formatting.

In standard formatting:

A comma is inserted after every three digits from the right.
Numbers with fewer than 4 digits contain no commas.
 

Example 1:

Input: n = 1002

Output: 3

Explanation:

The numbers "1,000", "1,001", and "1,002" each contain one comma, giving a total of 3©leetcode */
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