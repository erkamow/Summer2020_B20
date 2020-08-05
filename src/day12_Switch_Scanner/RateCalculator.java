package day12_Switch_Scanner;

import java.util.Scanner;

public class RateCalculator {

    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println(" Enter your salary: ");
        double salary = input1.nextDouble();
        System.out.println(" How many hours do you work in a week: ");
        int hours = input1.nextInt();

        int totalHours = hours * 52;
        double hourlyRate = salary / totalHours;

        System.out.println(" your hourly rate is: $ " + hourlyRate);

    }
}
