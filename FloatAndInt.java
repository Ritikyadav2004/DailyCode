
public class FloatAndInt {
    public static void main(String[] args) {
        System.out.println(23.1 % 1);

        double d = 534.958;
        if (d % 1 == 0) {
            System.out.println("int " + (int) d);
        } else {
            int integerPart = (int) d;
            float decimalPart = (float) d - integerPart;

            System.out.println("float " + integerPart + " " + String.format("%.3f", decimalPart));
        }
    }
}
