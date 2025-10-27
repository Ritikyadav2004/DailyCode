public class CalculateAngle {
    

    public double getAngle(String s) {
        // code here
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int i = 0;

        
        while (s.charAt(i) != ':') {
            str1.append(s.charAt(i));
            i++;
        }

        i++; // skip 

        // xxtract minute part
        for (int j = i; j < s.length(); j++) {
            str2.append(s.charAt(j));
        }

        // Convert to integers
        int h = Integer.parseInt(str1.toString()) % 12; // convert to 12-hour format
        int m = Integer.parseInt(str2.toString());

        // Calculate angle
        double angle = Math.abs(30 * h - 5.5 * m); // standard fourmula

        if (angle > 180)
            angle = 360 - angle;

        return angle;
    }
    public static void main(String[] args) {
        CalculateAngle obj = new CalculateAngle();
        System.out.println(obj.getAngle("19:00"));
    }
}
