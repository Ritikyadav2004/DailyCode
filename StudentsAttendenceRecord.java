// You are given a string s representing an attendance record for a student where each character signifies whether the student was absent, late, or present on that day. The record only contains the following three characters:

// 'A': Absent.
// 'L': Late.
// 'P': Present.
// The student is eligible for an attendance award if they meet both of the following criteria:

// The student was absent ('A') for strictly fewer than 2 days total.
// The student was never late ('L') for 3 or more consecutive days.
// Return true if the student is eligible for an attendance award, or false otherwise.
// 
public class StudentsAttendenceRecord {
    public static void main(String[] args) {
        // String  str ="APLLALAPALAA";
        String str = "PPALLP";
        int countA=0;
        boolean kisiNePrintKiya=false;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='A')countA++;
        }
        if(countA>=2) 
            {
                System.out.println(false);
                kisiNePrintKiya=true;
            }

        for(int i=0;i<str.length()-2;i++)
        {
            if(str.charAt(i)==str.charAt(i+1) && str.charAt(i+1)==str.charAt(i+2))
            {
                System.out.println(false);
                kisiNePrintKiya=true;
                break;
            }
        }
        if(!kisiNePrintKiya)
        {
            System.out.println(true);
        }
      
    }
}
