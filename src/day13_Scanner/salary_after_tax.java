package day13_Scanner;

import java.util.Scanner;

public class salary_after_tax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your annual salary");
        int salary = scan.nextInt();
        System.out.println(" Enter your state tax rate");
        double stateTaxRate = scan.nextDouble();
        double stateTax = salary * stateTaxRate;
        System.out.println(" Enter yor federal tax rate");
        double federalTaxRate = scan.nextDouble();
        double federalTax = salary * federalTaxRate;

        double salaryAfterTax = salary - stateTax -federalTax;
        System.out.println("your salary: $ " + salary);
        System.out.println("your state tax: $" + stateTax);
        System.out.println("federal tax: $ " + federalTax);
        System.out.println("you salary after tax: $ " + salaryAfterTax);
    }
}
