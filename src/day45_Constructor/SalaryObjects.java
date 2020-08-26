package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class SalaryObjects {
    public static void main(String[] args) {


        SalaryCalculator salary1 = new SalaryCalculator(65,45,3.5,2.5);
        SalaryCalculator salary2 = new SalaryCalculator(80,50,4.5,2.7);
        SalaryCalculator salary3 = new SalaryCalculator(55,35,1.7,2.2);

        ArrayList<SalaryCalculator> salaryList = new ArrayList<>();
        salaryList.addAll(Arrays.asList(salary1,salary2,salary3));

        for(SalaryCalculator each : salaryList){
            System.out.println("==============================================================");
            System.out.println(each);
        }
    }
}
