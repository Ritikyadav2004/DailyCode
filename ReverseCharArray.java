public class ReverseCharArray {
    public static void main(String[] args) {
        char ch[] = {'h','e','l','l','o'};
        int n=ch.length-1;
        for(char c:ch)
        {
            System.out.print(c+" ");
        }
        System.err.println("\nReveresed array");
        for(int i=0;i<ch.length/2;i++)
        {
            char temp =ch[i];
            ch[i] = ch[n-i];
            ch[n-i]=temp;

        }

        for(char c:ch)
        {
            System.out.print(c+" ");      
        }
    }
}
