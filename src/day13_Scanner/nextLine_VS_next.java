package day13_Scanner;

import java.util.Scanner;

public class nextLine_VS_next {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter your salary: ");
        double salary = scan.nextDouble();
        scan.nextLine();

        System.out.println(" Enter your full name: ");
        String fullName = scan.nextLine();


        System.out.println(" salary: " + salary);
        System.out.println(" full name: " + fullName);
    }
}
