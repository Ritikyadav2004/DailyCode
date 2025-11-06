public class base_7 {
    public static void main(String[] args) {
        int num=100;
        StringBuilder sb = new StringBuilder();
        while(num>0)
        {
            sb.append(num%7);
            System.out.println(sb.reverse().toString());
            num/=7;
        }

        sb.reverse();
        System.out.println(sb.toString());
    }
}
