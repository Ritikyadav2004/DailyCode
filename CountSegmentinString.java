public class CountSegmentinString {
    public static void main(String[] args) {
        String s = "Hello World This is Java";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
            {
                count++;
            }
        }
        System.err.println(count);
    }
}
