package day06_comparisonOperators;

public class SalaryCalculator {
    public static void main(String[] args) {


        double rate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        int weeklyHours = 40;



        double salary = rate * weeklyHours * 48;
        double totalTax = salary * (stateTaxRate + federalTaxRate);

        System.out.println(salary + "$");
        System.out.println(totalTax + "$");

        double income = salary - totalTax;
        System.out.println(income + "$");


    }
}
