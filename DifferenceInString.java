public class DifferenceInString {
    public static void main(String[] args) {
        String s = "abcd";
        String t ="abcde";
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            ans^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++)
        {
            ans^=t.charAt(i);
        }
        System.err.println((char)ans);
    }
}
