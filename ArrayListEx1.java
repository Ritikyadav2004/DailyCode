import java.util.ArrayList;
import java.util.List;

class ArrayListEx1 {

    public List<String> StudentGrade(int Marks) {   // ✅ correct generic syntax
        List<String> list = new ArrayList<>();       // ✅ variable name should start lowercase

        if (Marks >= 90) {
            list.add("Congratulations!");
            list.add("Score: " + Marks);
        } else if (Marks >= 75) {
            list.add("Bravo!");
            list.add("Score: " + Marks);
        } else if (Marks > 60) {
            list.add("Excellent!");
            list.add("Score: " + Marks);
        } else {
            list.add("Hard Luck! Keep Trying!");
            list.add("Score: " + Marks);
        }

        return list;
    }

    public static void main(String[] args) {
        
        int marks[] = {45,67,67,87,98,88,33};
        ArrayListEx1 obj[] = new ArrayListEx1[marks.length];
        List<List<String>> Final = new ArrayList<>();
        for(int i=0;i<marks.length;i++)
        { 
            obj[i]=new ArrayListEx1();
          Final.add(obj[i].StudentGrade(marks[i]));
        }
        System.out.println(Final);
    }
}
