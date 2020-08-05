package day38_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100,90,75,84,65,85,55,45,73,72,35,47));
        System.out.println(list);

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 - 100
        gradeOfA.addAll(list);
        gradeOfA.removeIf(each -> each < 90);
        System.out.println("Grade A: "+gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 - 89
        gradeOfB.addAll(list);
        gradeOfB.removeIf(each -> each < 80 || each > 89 );
        System.out.println("Grade B: "+gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 - 79
        gradeOfC.addAll(list);
        gradeOfC.removeIf(each -> each < 70 || each >79);
        System.out.println("Grade C: "+gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 - 69
        gradeOfD.addAll(list);
        gradeOfD.removeIf(each -> each <60 || each >69);
        System.out.println("Grade D: "+ gradeOfD);

        ArrayList<Integer> gradeOfF = new ArrayList<>(); // below 60
        gradeOfF.addAll(list);
        gradeOfF.removeIf(each -> each >60);
        System.out.println("Grade F: "+gradeOfF);
    }
}
