public class AddTwoString
{
    public static void main(String[] args) {
        String str1="12345678901234567890";
        String str2 = "98765432109876543210";
        int i=str1.length()-1;
        int j=str2.length()-1;
        StringBuilder s = new StringBuilder();
        int carry=0;
        while (i>=0||j>=0||carry>0) {
            int d1 = (i>=0)?str1.charAt(i)-48:0;
            int d2 =(j>=0)?str2.charAt(j)-48:0;
            int sum=d1+d2+carry;
            carry=sum/10;
            s.append(sum%10);
            i--;
            j--;

        }
        System.out.println(str1+" + "+str2+" = "+s.reverse().toString());
    }
}