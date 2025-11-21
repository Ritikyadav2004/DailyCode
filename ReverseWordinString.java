public class ReverseWordinString {
    public static void main(String[] args) {
        String s = "Let's Learn How To Become Leetcoder";
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(ch!=' ')
            {
               word.append(ch);
            }
            else{
                // add that word in reverse manner in result
                result.append((word.reverse()));
                // after it add one space 
                result.append(' ');
                // now make empty word stringbuilder
                word.setLength(0);
            }
        }

        // after all when loops terminate becose as no space left in the end and else part onky work if there is space 
        result.append(word.reverse());
        System.out.println(result.toString());
    }
}
