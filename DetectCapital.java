// We define the usage of capitals in a word to be right when one of the following cases holds:

// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.

public class DetectCapital {
    public static void main(String[] args) {
        String s = "USA";
        // All capital
        boolean allCapital = true;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=Character.toUpperCase(s.charAt(i)))
            {
            allCapital=false;
            break;
            }
        }

        boolean allsmall=true;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=Character.toLowerCase(s.charAt(i)))
            {
            allsmall=false;
            break;
            }
        }

        boolean firstCapital=true;
        if(s.charAt(0)!=Character.toUpperCase((s.charAt(0))))
        {
            firstCapital=false;
        }
        
        boolean restSmall=true;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=Character.toLowerCase(s.charAt(i)))
            {
             restSmall=false;
             break;
            }
        }


        System.out.println(allCapital || allsmall || (firstCapital && restSmall));
    }
}
